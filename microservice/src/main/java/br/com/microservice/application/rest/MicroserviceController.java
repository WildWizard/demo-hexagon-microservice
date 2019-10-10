package br.com.microservice.application.rest;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.domain.core.SaveMessagePort;
import br.com.microservice.domain.dto.EchoDTO;
import br.com.microservice.domain.dto.MessageDTO;

@RestController
public class MicroserviceController {
	static Logger log = Logger.getLogger(MicroserviceController.class.getName());
	
	@Autowired
	private SaveMessagePort saveMessagePort;
	
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Echo => %s!";
    @RequestMapping("/echo")
    public EchoDTO echo(@RequestParam(value="echo", defaultValue="Echo") String name) {
        return new EchoDTO(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @HystrixCommand(fallbackMethod = "tratamentoErroMetodoSave")
    @RequestMapping("/save")
    public void save(@RequestParam(value="text") String text) {
        MessageDTO messageTO = saveMessagePort.save(text);
        log.info("restAdapter - " + messageTO.getTexto());
    }    
    
    public void tratamentoErroMetodoSave(String text) {
		log.warning("save - sErro tratado pelo Hystrix.");
    }
}
package br.com.microservice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.microservice.core.SaveMessagePort;
import br.com.microservice.output.database.io.MessageEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceApplicationTests {

	@Autowired
	SaveMessagePort port;

	@Test
	public void save() {
		String teste = "teste";
		MessageEntity entity = port.save(teste);
		assertEquals(entity.getTexto(), teste);
	}

}


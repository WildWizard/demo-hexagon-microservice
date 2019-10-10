package br.com.microservice.domain.core;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.domain.dto.MessageDTO;
import br.com.microservice.domain.output.RepositoryMessagePort;

@Service
public class SaveMessageImpl implements SaveMessagePort {
	static Logger log = Logger.getLogger(SaveMessageImpl.class.getName());
	
	@Autowired
	RepositoryMessagePort repo;

	public SaveMessageImpl() {
	}

	@Override
	public MessageDTO save(String texto) {
		MessageDTO tosave = new MessageDTO();
		tosave.setTexto(texto);
		log.info("core - tosave >> " + tosave.getId() + " - " + tosave.getTexto());
		MessageDTO saved = repo.save(tosave);
		log.info("core - saved >> " + saved.getId() + " - " + saved.getTexto());
		return saved;
	}

}

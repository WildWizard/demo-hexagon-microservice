package br.com.microservice.core;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.output.database.RepositoryMessagePort;
import br.com.microservice.output.database.io.MessageEntity;

@Service
public class SaveMessageImpl implements SaveMessagePort {
	static Logger log = Logger.getLogger(SaveMessageImpl.class.getName());
	
	@Autowired
	RepositoryMessagePort repo;

	public SaveMessageImpl() {
	}

	@Override
	public MessageEntity save(String texto) {
		MessageEntity tosave = new MessageEntity();
		tosave.setTexto(texto);
		log.info("core - tosave >> " + tosave.getId() + " - " + tosave.getTexto());
		MessageEntity saved = repo.save(tosave);
		log.info("core - saved >> " + saved.getId() + " - " + saved.getTexto());
		return saved;
	}

}

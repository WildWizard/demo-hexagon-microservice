package br.com.microservice.core;

import br.com.microservice.output.database.io.MessageEntity;

public interface SaveMessagePort {
	
	MessageEntity save(String texto);

}

package br.com.microservice.domain.core;

import br.com.microservice.domain.dto.MessageDTO;

public interface SaveMessagePort {
	
	MessageDTO save(String texto);

}

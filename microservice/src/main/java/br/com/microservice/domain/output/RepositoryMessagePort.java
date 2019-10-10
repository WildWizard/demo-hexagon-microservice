package br.com.microservice.domain.output;

import br.com.microservice.domain.dto.MessageDTO;

public interface RepositoryMessagePort{
    public MessageDTO save(MessageDTO messageDTO);
}

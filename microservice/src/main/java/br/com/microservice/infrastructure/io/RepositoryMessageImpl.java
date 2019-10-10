package br.com.microservice.infrastructure.io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.domain.dto.MessageDTO;
import br.com.microservice.domain.output.RepositoryMessagePort;
import br.com.microservice.infrastructure.database.IRepositoryMessageEntity;
import br.com.microservice.infrastructure.database.entities.MessageEntity;
import br.com.microservice.infrastructure.mapper.MessageMapper;

@Service
public class RepositoryMessageImpl implements RepositoryMessagePort {

    @Autowired
    IRepositoryMessageEntity repo;

    @Autowired
    MessageMapper messageMapper;

    @Override
    public MessageDTO save(MessageDTO messageDTO) {
        MessageEntity entity = messageMapper.toModel(messageDTO);
        entity = repo.save(entity);
        return messageMapper.toDto(entity);
    }
}
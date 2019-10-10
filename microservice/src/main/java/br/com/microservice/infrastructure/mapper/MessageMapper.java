package br.com.microservice.infrastructure.mapper;

import org.mapstruct.Mapper;

import br.com.microservice.domain.dto.MessageDTO;
import br.com.microservice.infrastructure.database.entities.MessageEntity;

@Mapper(componentModel="spring")
public interface MessageMapper {
    MessageEntity toModel(MessageDTO to);
    
    MessageDTO toDto(MessageEntity model);
}
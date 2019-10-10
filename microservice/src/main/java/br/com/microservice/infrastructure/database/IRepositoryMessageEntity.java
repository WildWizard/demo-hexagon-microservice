package br.com.microservice.infrastructure.database;

import org.springframework.data.repository.CrudRepository;

import br.com.microservice.infrastructure.database.entities.MessageEntity;

public interface IRepositoryMessageEntity extends CrudRepository<MessageEntity, Long>  {

}
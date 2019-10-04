package br.com.microservice.output.database;

import org.springframework.data.repository.CrudRepository;

import br.com.microservice.output.database.io.MessageEntity;

public interface RepositoryMessagePort extends CrudRepository<MessageEntity, Long> {
}

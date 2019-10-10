package br.com.microservice.infrastructure.mapper;

import br.com.microservice.domain.dto.MessageDTO;
import br.com.microservice.infrastructure.database.entities.MessageEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-10T03:06:53-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 12.0.2 (Oracle Corporation)"
)
@Component
public class MessageMapperImpl implements MessageMapper {

    @Override
    public MessageEntity toModel(MessageDTO to) {
        if ( to == null ) {
            return null;
        }

        MessageEntity messageEntity = new MessageEntity();

        messageEntity.setTexto( to.getTexto() );
        messageEntity.setId( to.getId() );

        return messageEntity;
    }

    @Override
    public MessageDTO toDto(MessageEntity model) {
        if ( model == null ) {
            return null;
        }

        MessageDTO messageDTO = new MessageDTO();

        messageDTO.setTexto( model.getTexto() );
        messageDTO.setId( model.getId() );

        return messageDTO;
    }
}

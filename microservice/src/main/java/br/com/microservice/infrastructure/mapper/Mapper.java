package br.com.microservice.infrastructure.mapper;

import org.mapstruct.factory.Mappers;

public class Mapper {

    private Mapper() {
    }

    public static <T> T factory(final Class<T> clazz) {
        return Mappers.getMapper(clazz);
    }
}
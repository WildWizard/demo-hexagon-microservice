package br.com.microservice.dto;

public class EchoDTO {
    private final long id;
    private final String content;

    public EchoDTO(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

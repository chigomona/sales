package com.eshop.sales.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("File")
public class FileEntity {
    private String id ;
    private String name ;
    private String ContentType ;
    private Long size ;
    private byte[] data ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentType() {
        return ContentType;
    }

    public void setContentType(String contentType) {
        ContentType = contentType;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}

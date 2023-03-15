package com.eshop.sales.serviceapi;

import com.eshop.sales.model.FileEntity;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Optional;

public interface RedisService {

    FileEntity save(MultipartFile file) throws IOException;

    Optional<FileEntity> getFile(String id) ;
}

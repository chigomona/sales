package com.eshop.sales.serviceapi;

import com.eshop.sales.model.RedisEntity;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Optional;

public interface RedisService {

    RedisEntity save(MultipartFile file) throws IOException;

    Optional<RedisEntity> getFile(String id) ;
}

package com.eshop.sales.serviceimpl;

import com.eshop.sales.model.RedisEntity;
import com.eshop.sales.serviceapi.RedisService;
import com.eshop.sales.repository.RedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

@Service
public class RedisServiceImpl implements RedisService {


    private final RedisRepository redisRepository;


    @Autowired
    public RedisServiceImpl(RedisRepository redisRepository) {
        this.redisRepository = redisRepository;
    }

    @Override
    public RedisEntity save(MultipartFile file) throws IOException {
        RedisEntity redisEntity = new RedisEntity();
        redisEntity.setId(UUID.randomUUID().toString());
        redisEntity.setName(StringUtils.cleanPath(file.getOriginalFilename()));
        redisEntity.setContentType(file.getContentType());
        redisEntity.setData(file.getBytes());
        redisEntity.setSize(file.getSize());

        return redisRepository.save(redisEntity);
    }

    @Override
    public Optional<RedisEntity> getFile(String id) {
        return redisRepository.findById(id);
    }
}

package com.eshop.sales.serviceimpl;

import com.eshop.sales.model.FileEntity;
import com.eshop.sales.serviceapi.RedisService;
import com.eshop.sales.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

@Service
public class RedisServiceImpl implements RedisService {


    private final FileRepository fileRepository;


    @Autowired
    public RedisServiceImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public FileEntity save(MultipartFile file) throws IOException {
        FileEntity fileEntity = new FileEntity();
        fileEntity.setId(UUID.randomUUID().toString());
        fileEntity.setName(StringUtils.cleanPath(file.getOriginalFilename()));
        fileEntity.setContentType(file.getContentType());
        fileEntity.setData(file.getBytes());
        fileEntity.setSize(file.getSize());

        return fileRepository.save(fileEntity);
    }

    @Override
    public Optional<FileEntity> getFile(String id) {
        return fileRepository.findById(id);
    }
}

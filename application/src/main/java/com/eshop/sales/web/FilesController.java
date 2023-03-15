package com.eshop.sales.web;

import com.eshop.sales.model.FileEntity;
import com.eshop.sales.serviceapi.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Controller
@RequestMapping("files")
public class FilesController {
    private final RedisService redisService;

    @Autowired
    public FilesController(RedisService redisService) {
        this.redisService = redisService;
    }

    @PostMapping
    public ResponseEntity<String> uploadRedis(@RequestParam("file") MultipartFile file) {
        try {
            FileEntity fileEntity = redisService.save(file);

            return ResponseEntity.status(HttpStatus.OK).body(String.format("File uploaded successfully: %s, uuid=%s",
                    file.getOriginalFilename(), fileEntity.getId()));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(String.format(
                    "Could not upload the file: %s!", file.getOriginalFilename()));
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<byte[]> getFileRedis(@PathVariable String id) {
        Optional<FileEntity> fileEntityOptional = redisService.getFile(id);

        if (!fileEntityOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        FileEntity fileEntity = fileEntityOptional.get();
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + fileEntity.getName() + "\"")
                .contentType(MediaType.valueOf(fileEntity.getContentType())).body(fileEntity.getData());
    }
}

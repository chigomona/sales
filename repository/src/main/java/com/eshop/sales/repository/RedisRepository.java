package com.eshop.sales.repository;

import com.eshop.sales.model.RedisEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisRepository extends CrudRepository<RedisEntity, String> {
}

package com.nttdata.bootcamp.bank.springboot.dao.impl;

import com.nttdata.bootcamp.bank.springboot.dao.inte.DocumentTypeDaoInte;
import com.nttdata.bootcamp.bank.springboot.document.DocumentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;
import java.util.UUID;

@Repository
public class DocumentTypeDaoImpl implements DocumentTypeDaoInte {

    private static final Logger log = LoggerFactory.getLogger(DocumentTypeDaoImpl.class);

    private final String hashReference= "documentType";

    @Resource(name="redisTemplate")
    private HashOperations<String, String, DocumentType> hashOperations;

    @Override
    public void create(DocumentType documentType) {

        hashOperations.put(hashReference, UUID.randomUUID().toString(), documentType);
    }

    @Override
    public Map<String, DocumentType> readAll() {

        return hashOperations.entries(hashReference);
    }

    @Override
    public DocumentType readById(String id) {

        return (DocumentType)hashOperations.get(hashReference, id);
    }

    @Override
    public void updateById(DocumentType documentType, String id) {

        hashOperations.put(hashReference, UUID.randomUUID().toString(), documentType);
    }

    @Override
    public void deleteById(DocumentType documentType, String id) {

        hashOperations.delete(hashReference, UUID.randomUUID().toString(), documentType);
    }
}

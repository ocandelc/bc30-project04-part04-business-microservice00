/**
 * Resumen.
 * Objeto                   : DocumentTypeServiceImpl.java
 * Descripción              : Clase de implementación de servicio para utilizar los métodos de CRUD.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 * Bootcamp-30              05/08/2022        Oscar Candela           Realizar la creación de un método nuevo.
 */

package com.nttdata.bootcamp.bank.springboot.service.impl;

import com.nttdata.bootcamp.bank.springboot.dao.inte.DocumentTypeDaoInte;
import com.nttdata.bootcamp.bank.springboot.document.DocumentType;
import com.nttdata.bootcamp.bank.springboot.service.inte.DocumentTypeServiceInte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Clase de implementación de servicio para utilizar los métodos de CRUD.
 */

@Service
public class DocumentTypeServiceImpl implements DocumentTypeServiceInte {

    private static final Logger log = LoggerFactory.getLogger(DocumentTypeServiceImpl.class);

    @Autowired
    private DocumentTypeDaoInte documentTypeDaoInte;

    @Override
    public void create(DocumentType documentType) {

        documentTypeDaoInte.create(documentType);
    }

    @Override
    public Map<String, DocumentType> readAll() {

        return documentTypeDaoInte.readAll();
    }

    @Override
    public DocumentType readById(String id) {
        return documentTypeDaoInte.readById(id);
    }

    @Override
    public void updateById(DocumentType documentType, String id) {

        documentTypeDaoInte.updateById(documentType, id);
    }

    @Override
    public void deleteById(DocumentType documentType, String id) {

        documentTypeDaoInte.deleteById(documentType, id);
    }
}
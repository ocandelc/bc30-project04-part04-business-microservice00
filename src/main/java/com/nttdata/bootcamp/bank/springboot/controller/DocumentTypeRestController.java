/**
 * Resumen.
 * Objeto                   : DocumentTypeRestController.java
 * Descripción              : Clase de controladora para invocar los métodos con rest api.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 * Bootcamp-30              05/08/2022        Mario Vásquez           Realizar la creación de un método nuevo.
 */

package com.nttdata.bootcamp.bank.springboot.controller;

import com.nttdata.bootcamp.bank.springboot.document.DocumentType;
import com.nttdata.bootcamp.bank.springboot.service.inte.DocumentTypeServiceInte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Clase de controladora para invocar los métodos con rest api.
 */
@RestController
@RequestMapping("/api/business-microservice00-master/documentType")
public class DocumentTypeRestController {

    private static final Logger log = LoggerFactory.getLogger(DocumentTypeRestController.class);

    @Autowired
    private DocumentTypeServiceInte documentTypeServiceInte;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void create(@RequestBody DocumentType documentType) {
        log.debug("Begin RestController create DocumentType");
        documentTypeServiceInte.create(documentType);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Map<String, DocumentType> readAll() {
        log.debug("Begin RestController readAll DocumentType");
        return documentTypeServiceInte.readAll();
    }

    @RequestMapping(value = "/readById/{id}", method = RequestMethod.GET)
    public DocumentType readById(@PathVariable String id) {
        log.debug("Begin RestController readById DocumentType");
        return documentTypeServiceInte.readById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateById(@RequestBody DocumentType documentType, @PathVariable String id) {
        log.debug("Begin RestController updateById DocumentType");
        documentTypeServiceInte.updateById(documentType, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@RequestBody DocumentType documentType, @PathVariable String id) {
        log.debug("Begin RestController deleteById DocumentType");
        documentTypeServiceInte.deleteById(documentType, id);
    }
}
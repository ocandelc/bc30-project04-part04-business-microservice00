package com.nttdata.bootcamp.bank.springboot.controller;

import com.nttdata.bootcamp.bank.springboot.document.DocumentType;
import com.nttdata.bootcamp.bank.springboot.service.inte.DocumentTypeServiceInte;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Map;

@SpringBootTest
public class DocumentTypeRestControllerTest {

    @MockBean
    private DocumentTypeServiceInte purseServiceInte;

    @Test
    void readAllTest() {

        Map<String, DocumentType> mapPurse = purseServiceInte.readAll();

        Mockito.verify(purseServiceInte).readAll();

     }

}

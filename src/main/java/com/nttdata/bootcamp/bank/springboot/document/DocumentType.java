/**
 * Resumen.
 * Objeto                   : DocumentType.java
 * Descripción              : Clase de tipo document para obtener o establecer los datos de cada atributo.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 * Bootcamp-30              17/08/2022        Mario Vásquez           Realizar la creación de un campo nuevo.
 */

package com.nttdata.bootcamp.bank.springboot.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Clase de tipo document para obtener o establecer los datos de cada atributo.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentType implements Serializable {

    private static final long serialVersionUID = -7817224776021728682L;

    @Id
    private String id;
    private String codeDocumentType;
    private String name;
    private String description;

}

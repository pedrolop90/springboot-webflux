package com.test.webflux.demo.converter;

import com.test.webflux.demo.document.MensajeDocument;
import com.test.webflux.demo.model.Mensaje;
import org.mapstruct.Mapper;

/**
 * @author pedro
 */
@Mapper(componentModel = "spring")
public interface MensajeConverter {
    Mensaje documentToDominio(MensajeDocument mensajeDocument);
    MensajeDocument dominioToDocument(Mensaje mensajeDocument);
}

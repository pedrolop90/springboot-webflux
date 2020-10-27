package com.test.webflux.demo.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author pedro
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "mensaje")
public class MensajeDocument {

    @Id
    private Long id;

    private String mensaje;

    private String origen;

    private LocalDateTime fecha;

}

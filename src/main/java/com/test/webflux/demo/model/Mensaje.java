package com.test.webflux.demo.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author pedro
 */
@Data
public class Mensaje {

    private Long id;
    private String mensaje;
    private String origen;
    private LocalDateTime fecha;

}

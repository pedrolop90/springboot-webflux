package com.test.webflux.demo.service;

import com.test.webflux.demo.model.Mensaje;
import reactor.core.publisher.Flux;

/**
 * @author pedro
 */
public interface MensajeService {

    Flux<Mensaje> findAll();

}

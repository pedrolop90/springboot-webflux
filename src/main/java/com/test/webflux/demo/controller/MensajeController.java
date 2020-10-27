package com.test.webflux.demo.controller;

import com.test.webflux.demo.model.Mensaje;
import com.test.webflux.demo.service.MensajeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author pedro
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("mensaje")
public class MensajeController {

    private final MensajeService mensajeService;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Mensaje> findAll() {
        return mensajeService.findAll();
    }

}

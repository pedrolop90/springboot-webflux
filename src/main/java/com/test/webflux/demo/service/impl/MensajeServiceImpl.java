package com.test.webflux.demo.service.impl;

import com.test.webflux.demo.converter.MensajeConverter;
import com.test.webflux.demo.dao.MensajeDao;
import com.test.webflux.demo.document.MensajeDocument;
import com.test.webflux.demo.model.Mensaje;
import com.test.webflux.demo.service.MensajeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.stream.Stream;

/**
 * @author pedro
 */
@Component
@RequiredArgsConstructor
public class MensajeServiceImpl implements MensajeService {

    private final MensajeDao mensajeDao;
    private final MensajeConverter mensajeConverter;

    @Override
    public Flux<Mensaje> findAll() {
        Flux<Long> internval = Flux.interval(Duration.ofMillis(500));
        Flux<MensajeDocument> documentFlux = Flux
                .fromStream(
                        Stream.generate(
                                () ->
                                        new MensajeDocument(
                                                1L,
                                                "hola",
                                                "pedro",
                                                LocalDateTime.now()
                                        )
                        )
                );

        return Flux
                .zip(internval, documentFlux)
                .map(Tuple2::getT2)
                .map(mensajeDocument -> mensajeConverter.documentToDominio(mensajeDocument));
    }
}

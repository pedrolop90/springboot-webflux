package com.test.webflux.demo.dao;

import com.test.webflux.demo.document.MensajeDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author pedro
 */
@Repository
public interface MensajeDao extends ReactiveMongoRepository<MensajeDocument, Long> {
}

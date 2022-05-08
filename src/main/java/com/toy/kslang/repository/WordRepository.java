package com.toy.kslang.repository;

import com.toy.kslang.domain.Word;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface WordRepository extends ReactiveMongoRepository<Word, String> {

    Mono<Word> findById(String id);
}

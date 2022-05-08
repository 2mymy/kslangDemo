package com.toy.kslang.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Interpret {

    @Id
    private String id;
    private String wordId;
    private String detail;

}



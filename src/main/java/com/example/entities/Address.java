package com.example.entities;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

@Introspected
@MappedEntity(value = "ADDRESS", alias = "A")
public class Address {
    @Id
    private Long id;
    private String VERY_LONG_COLUMN_NAME_30_CHARS;
    private String ANOTHER_VERY_LONG_COLUMN_NAME_;

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVERY_LONG_COLUMN_NAME_30_CHARS() {
        return VERY_LONG_COLUMN_NAME_30_CHARS;
    }

    public void setVERY_LONG_COLUMN_NAME_30_CHARS(String VERY_LONG_COLUMN_NAME_30_CHARS) {
        this.VERY_LONG_COLUMN_NAME_30_CHARS = VERY_LONG_COLUMN_NAME_30_CHARS;
    }

    public String getANOTHER_VERY_LONG_COLUMN_NAME_() {
        return ANOTHER_VERY_LONG_COLUMN_NAME_;
    }

    public void setANOTHER_VERY_LONG_COLUMN_NAME_(String ANOTHER_VERY_LONG_COLUMN_NAME_) {
        this.ANOTHER_VERY_LONG_COLUMN_NAME_ = ANOTHER_VERY_LONG_COLUMN_NAME_;
    }
}
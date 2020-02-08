package com.github.dcconsultoria.domain;

import java.util.Objects;

public class Input {
    private Long id;

    public Input() {
    }

    public Input(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Input input = (Input) o;
        return Objects.equals(id, input.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

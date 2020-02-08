package com.github.dcconsultoria.resources;

import com.github.dcconsultoria.domain.Input;

import javax.ws.rs.*;

import java.util.ArrayList;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/inputs")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class InputResource implements GenericResource<Input, Long> {

    @Override
    public List<Input> listAll() {
        return new ArrayList<>();
    }

    @Override
    public Input getByID(Long aLong) {
        return new Input(1L);
    }

    @Override
    public Input create(Input input) {
        return input;
    }

    @Override
    public Input update(Input input) {
        return input;
    }
}

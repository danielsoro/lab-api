package com.github.dcconsultoria.resources;

import javax.ws.rs.*;
import java.util.List;

public interface GenericResource<T, ID> {
    @GET
    List<T> listAll();

    @GET()
    @Path("{id}")
    T getByID(@PathParam("id") ID id);

    @POST
    T create(T t);

    @PUT
    T update(T t);
}

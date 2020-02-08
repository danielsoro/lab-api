/*
 * Copyright 2020 DC Consultoria
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.dcconsultoria.resources;

import com.github.dcconsultoria.domain.Input;

import javax.ws.rs.*;

import java.util.ArrayList;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * @author <a href="mailto:danielsoro@apache.org">Daniel "soro" Cunha</a>
 */
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

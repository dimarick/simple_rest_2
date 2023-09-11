package ru.students.simple_rest.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.simple_rest.model.Response;

@Service
@Qualifier("UidModifierService")
public class UidModifierService implements ResponseModifierServiceInterface {
    @Override
    public Response modify(Response response) {

        response.setUid("New Uid");

        return response;
    }
}

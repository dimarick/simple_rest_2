package ru.students.simple_rest.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.simple_rest.model.Response;

@Service
@Qualifier("SystemTimeModifierService")
public class SystemTimeModifierService implements ResponseModifierServiceInterface {
    @Override
    public Response modify(Response response) {

        response.setSystemTime("New sys time");

        return response;
    }
}

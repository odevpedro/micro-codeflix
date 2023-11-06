package com.odevpedro.admin.catalogo.domain.validation.handler;

import com.odevpedro.admin.catalogo.domain.exceptions.DomainException;
import com.odevpedro.admin.catalogo.domain.validation.Error;
import com.odevpedro.admin.catalogo.domain.validation.ValidationHandler;

import java.util.List;

public class ThrowsValidationHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(final Error anErrror) {
        throw DomainException.with(List.of(anErrror));
    }

    @Override
    public ValidationHandler append(final ValidationHandler anHandler) {
        throw DomainException.with(anHandler.getErrors());
    }

    @Override
    public ValidationHandler validate(Validation aValidation) {
        try{
            aValidation.validate();
        } catch (final Exception exception){
            throw DomainException.with(List.of(new Error(exception.getMessage())));
        }

        return this;
    }

    @Override
    public List<Error> getErrors() {
        return List.of();
    }
}

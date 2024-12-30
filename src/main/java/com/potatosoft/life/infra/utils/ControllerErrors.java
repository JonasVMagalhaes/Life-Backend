package com.potatosoft.life.infra.utils;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

import java.util.List;
import java.util.stream.Collectors;

public class ControllerErrors {
    public static List<String> getErrors(Errors objectError) {
        return objectError.getAllErrors().stream()
                .map(ObjectError::getDefaultMessage)
                .collect(Collectors.toList());
    }
}

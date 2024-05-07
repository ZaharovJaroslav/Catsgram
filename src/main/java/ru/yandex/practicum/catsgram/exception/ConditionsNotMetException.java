package ru.yandex.practicum.catsgram.exception;

import org.springframework.web.bind.annotation.GetMapping;

public class ConditionsNotMetException extends RuntimeException {


    public ConditionsNotMetException(String message) {
        super(message);
    }
}

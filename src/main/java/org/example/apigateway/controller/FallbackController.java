package org.example.apigateway.controller;

import org.example.apigateway.dto.FallbackResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @RequestMapping ("/fallback/notifications")
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public FallbackResponseDto notificationsFallback() {
        return new FallbackResponseDto( "Notification service is temporarily unavailable. Please try again later.");

    }
    @RequestMapping ("/fallback/users")
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public FallbackResponseDto usersFallback() {
        return new FallbackResponseDto( "User service is temporarily unavailable. Please try again later.");

    }
}
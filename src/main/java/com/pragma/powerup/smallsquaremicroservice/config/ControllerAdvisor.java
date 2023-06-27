package com.pragma.powerup.smallsquaremicroservice.config;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.exceptions.*;
import com.pragma.powerup.smallsquaremicroservice.domain.exceptions.*;
import feign.FeignException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Collections;
import java.util.Map;

import static com.pragma.powerup.smallsquaremicroservice.config.Constants.*;

@ControllerAdvice
public class ControllerAdvisor {
    @ExceptionHandler(InvalidNameException.class)
    public ResponseEntity<Map<String, String>> handlerInvalidNameException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, INVALID_NAME));
    }

    @ExceptionHandler(InvalidPhoneException.class)
    public ResponseEntity<Map<String, String>> handlerInvalidPhoneException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, INVALID_PHONE));
    }

    @ExceptionHandler(InvalidNitException.class)
    public ResponseEntity<Map<String, String>> handlerInvalidNitException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, INVALID_NIT));
    }

    @ExceptionHandler(InvalidUserException.class)
    public ResponseEntity<Map<String, String>> handlerInvalidUserException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, INVALID_USER));
    }

    @ExceptionHandler(PhoneAlreadyExistsException.class)
    public ResponseEntity<Map<String, String>> handlerPhoneAlreadyExistsException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, PHONE_ALREADY_EXISTS_MESSAGE));
    }

    @ExceptionHandler(NitAlreadyExistsException.class)
    public ResponseEntity<Map<String, String>> handlerNitAlreadyExistsException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, NIT_ALREADY_EXISTS_MESSAGE));
    }

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<Map<String, String>> handlerUnauthorizedException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, WRONG_CREDENTIALS_MESSAGE));
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Map<String, String>> handlerNullPointerException(NullPointerException nullPointerException) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, nullPointerException.getMessage()));
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<Map<String, String>> handlerIllegalStateException(IllegalStateException IllegalStateException) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, IllegalStateException.getMessage()));
    }

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<Map<String, String>> handlerCategoryNotFoundException() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, CATEGORY_NOT_FOUND));
    }

    @ExceptionHandler(UnauthorizedUserException.class)
    public ResponseEntity<Map<String, String>> handlerUnauthorizedUserException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, WRONG_CREDENTIALS_MESSAGE));
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<Map<String, String>> handlerSQLIntegrityConstraintViolationException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, DUPLICATE_VALUE));
    }

    @ExceptionHandler(InvalidRangeException.class)
    public ResponseEntity<Map<String, String>> handlerInvalidRangeException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, INVALID_RANGE));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handlerInvalidRangeException(IllegalArgumentException illegalArgumentException) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, illegalArgumentException.getMessage()));
    }

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<Map<String, String>> handlerAuthenticationException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, WRONG_CREDENTIALS_MESSAGE));
    }

    @ExceptionHandler(InvalidAssignEmployeeOrderException.class)
    public ResponseEntity<Map<String, String>> handlerInvalidAssignEmployeeOrderException(InvalidAssignEmployeeOrderException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, INVALID_ASSIGN_EMPLOYEE_ORDER + e.getIdOrder()));
    }

    @ExceptionHandler(OrderNotFoundException.class)
    public ResponseEntity<Map<String, String>> handlerOrderNotFoundException(OrderNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, e.getIdOrder() + ORDER_NOT_FOUND));
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Map<String, String>> handlerDataIntegrityViolationExceptionException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, RELATION_NOT_FOUND));
    }

    @ExceptionHandler(OrderAlreadyNotifiedException.class)
    public ResponseEntity<Map<String, String>> handlerOrderAlreadyNotifiedException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, ORDER_ALREADY_NOTIFIED));
    }

    @ExceptionHandler(NonCancellableOrderException.class)
    public ResponseEntity<Map<String, String>> handlerNonCancellableOrderException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, NON_CANCELLABLE_ORDER));
    }

    @ExceptionHandler(PinNotFoundException.class)
    public ResponseEntity<Map<String, String>> handlerOrderNotFoundException() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, ORDER_NOT_FOUND));
    }
}

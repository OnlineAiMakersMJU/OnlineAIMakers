package com.example.study.member.exception.exceptionhandler;


import com.example.study.member.exception.exceptionhandler.dto.MemberErrorResponse;
import com.example.study.member.exception.exceptions.MemberErrorCode;
import com.example.study.member.exception.exceptions.MemberException;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MemberExceptionHandler {

    @ExceptionHandler(MemberException.class)
    public ResponseEntity<MemberErrorResponse> handleException(MemberException e) {
        MemberErrorCode memberErrorCode = e.getErrorCode();
        MemberErrorResponse memberErrorResponse = new MemberErrorResponse(memberErrorCode.getCustomCode(), memberErrorCode.getMessage());
        return ResponseEntity.status(memberErrorCode.getHttpStatus()).body(memberErrorResponse);
    }
}

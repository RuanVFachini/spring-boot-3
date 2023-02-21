package br.com.ciagatos.api.application.handlers;

import br.com.ciagatos.api.application.annotations.RestControllerAdvice;
import br.com.ciagatos.api.application.shared.responses.BadRequestResponse;
import br.com.ciagatos.api.application.shared.responses.InputErrorResponse;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<BadRequestResponse<InputErrorResponse>> handleValidationErrors(
            MethodArgumentNotValidException ex) {
        List<InputErrorResponse> errors = ex.getBindingResult().getFieldErrors()
                .stream()
                    .collect(Collectors.groupingBy(FieldError::getField))
                    .entrySet()
                        .stream()
                            .map(GlobalExceptionHandler::getErrorsMap)
                .toList();

        BadRequestResponse<InputErrorResponse> response = new BadRequestResponse<>(errors);

        return new ResponseEntity<>(
                response,
                new HttpHeaders(),
                HttpStatus.BAD_REQUEST);
    }

    private static InputErrorResponse getErrorsMap(Map.Entry<String, List<FieldError>> errorList) {
        return new InputErrorResponse(
                errorList.getKey(),
                errorList
                    .getValue()
                    .stream()
                    .map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .toList());
    }

}

package br.com.ciagatos.api.application.shared.responses;

import java.util.List;

public record InputErrorResponse(String field, List<String> errors) {
}

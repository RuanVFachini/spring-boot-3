package br.com.ciagatos.api.application.shared.responses;

import java.util.List;

public record BadRequestResponse<T>(List<T> details) {

}

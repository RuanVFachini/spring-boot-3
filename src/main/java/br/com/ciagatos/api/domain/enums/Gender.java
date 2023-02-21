package br.com.ciagatos.api.domain.enums;

public enum Gender {
    MALE("M"),
    FEMALE("F");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

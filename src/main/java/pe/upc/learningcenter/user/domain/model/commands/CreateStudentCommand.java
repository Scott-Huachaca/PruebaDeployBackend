package pe.upc.backendtb3.user.domain.model.commands;

import jakarta.validation.constraints.NotBlank;

public record CreateStudentCommand(
        @NotBlank String firstName,
        @NotBlank String lastName,
        @NotBlank String email
) {
}
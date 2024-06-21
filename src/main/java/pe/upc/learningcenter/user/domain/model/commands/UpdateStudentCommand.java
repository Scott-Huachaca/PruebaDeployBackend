package pe.upc.backendtb3.user.domain.model.commands;

public record UpdateStudentCommand(Long id, String firstName, String lastName, String email) {
}

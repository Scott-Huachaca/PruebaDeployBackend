package pe.upc.backendtb3.user.interfaces.rest.resources;

public record CreateStudentResource(String firstName,
                                    String lastName,
                                    String email) {
}

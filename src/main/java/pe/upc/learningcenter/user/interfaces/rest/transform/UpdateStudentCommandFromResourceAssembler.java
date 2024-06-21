package pe.upc.backendtb3.user.interfaces.rest.transform;

import pe.upc.backendtb3.course.domain.model.commands.UpdateCourseCommand;
import pe.upc.backendtb3.user.domain.model.commands.UpdateStudentCommand;
import pe.upc.backendtb3.user.interfaces.rest.resources.StudentResource;

public class UpdateStudentCommandFromResourceAssembler {
    public static UpdateStudentCommand toCommandFromResource(Long studentId, UpdateStudentCommand resource) {
        return new UpdateStudentCommand(
                studentId,
                resource.firstName(),
                resource.lastName(),
                resource.email()
        );
    }
}

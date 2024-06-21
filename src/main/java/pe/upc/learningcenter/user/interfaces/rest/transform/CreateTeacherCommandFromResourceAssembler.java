package pe.upc.backendtb3.user.interfaces.rest.transform;

import pe.upc.backendtb3.user.domain.model.commands.CreateTeacherCommand;
import pe.upc.backendtb3.user.interfaces.rest.resources.CreateTeacherResource;

public class CreateTeacherCommandFromResourceAssembler {
    public static CreateTeacherCommand toCommandFromResource(CreateTeacherResource resource) {
        return new CreateTeacherCommand(
                resource.firstName(),
                resource.lastName(),
                resource.email()
        );
    }
}

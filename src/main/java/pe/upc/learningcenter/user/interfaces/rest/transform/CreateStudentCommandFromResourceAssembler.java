package pe.upc.backendtb3.user.interfaces.rest.transform;

import pe.upc.backendtb3.user.domain.model.commands.CreateStudentCommand;
import pe.upc.backendtb3.user.interfaces.rest.resources.CreateStudentResource;

public class CreateStudentCommandFromResourceAssembler {
    public static CreateStudentCommand toCommandFromResource(CreateStudentResource resource){
        return new CreateStudentCommand(
                resource.firstName(),
                resource.lastName(),
                resource.email()
        );
    }
}

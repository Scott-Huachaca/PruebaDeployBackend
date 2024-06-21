package pe.upc.backendtb3.user.interfaces.rest.transform;

import pe.upc.backendtb3.user.domain.model.aggregates.Teacher;
import pe.upc.backendtb3.user.interfaces.rest.resources.TeacherResource;

public class TeacherResourceFromEntityAssembler {
    public static TeacherResource toResourceFromEntity(Teacher entity) {
        return new TeacherResource(entity.getId(), entity.getFullName(), entity.getEmail());
    }
}

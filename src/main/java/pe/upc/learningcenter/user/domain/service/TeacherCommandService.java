package pe.upc.backendtb3.user.domain.service;

import org.springframework.stereotype.Service;
import pe.upc.backendtb3.user.domain.model.aggregates.Teacher;
import pe.upc.backendtb3.user.domain.model.commands.CreateTeacherCommand;

import java.util.Optional;
@Service
public interface TeacherCommandService {
    Optional<Teacher>handle(CreateTeacherCommand command);
}

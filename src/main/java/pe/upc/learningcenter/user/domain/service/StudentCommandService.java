package pe.upc.backendtb3.user.domain.service;

import org.springframework.stereotype.Service;
import pe.upc.backendtb3.user.domain.model.aggregates.Student;
import pe.upc.backendtb3.user.domain.model.commands.CreateStudentCommand;
import pe.upc.backendtb3.user.domain.model.commands.UpdateStudentCommand;

import java.util.Optional;
@Service
public interface StudentCommandService {
    Optional<Student> handle(CreateStudentCommand command);
    Optional<Student> handle(UpdateStudentCommand command);
}

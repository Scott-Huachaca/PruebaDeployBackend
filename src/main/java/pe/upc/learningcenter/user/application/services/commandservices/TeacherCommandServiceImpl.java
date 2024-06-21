package pe.upc.backendtb3.user.application.services.commandservices;

import org.springframework.stereotype.Service;
import pe.upc.backendtb3.user.domain.model.aggregates.Teacher;
import pe.upc.backendtb3.user.domain.model.commands.CreateStudentCommand;
import pe.upc.backendtb3.user.domain.model.commands.CreateTeacherCommand;
import pe.upc.backendtb3.user.domain.service.TeacherCommandService;
import pe.upc.backendtb3.user.infrastructure.persistence.jpa.StudentRepository;
import pe.upc.backendtb3.user.infrastructure.persistence.jpa.TeacherRepository;

import java.util.Optional;

@Service
public class TeacherCommandServiceImpl implements TeacherCommandService {
    private final TeacherRepository teacherRepository;

    public TeacherCommandServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Optional<Teacher> handle(CreateTeacherCommand command) {
        var teacher = new Teacher(command);
        teacherRepository.save(teacher);
        return Optional.of(teacher);
    }
}

package pe.upc.backendtb3.user.domain.service;

import org.springframework.stereotype.Service;
import pe.upc.backendtb3.user.domain.model.aggregates.Student;
import pe.upc.backendtb3.user.domain.model.commands.CreateStudentCommand;
import pe.upc.backendtb3.user.domain.model.querys.GetAllStudentsQuery;
import pe.upc.backendtb3.user.domain.model.querys.GetStudentByIdQuery;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentQueryService {
    List<Student> handle(GetAllStudentsQuery query);
    Optional<Student> handle(GetStudentByIdQuery query);
}

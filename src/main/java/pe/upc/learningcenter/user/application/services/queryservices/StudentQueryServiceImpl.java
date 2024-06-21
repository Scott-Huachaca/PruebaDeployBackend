package pe.upc.backendtb3.user.application.services.queryservices;

import org.springframework.stereotype.Service;
import pe.upc.backendtb3.user.domain.model.aggregates.Student;
import pe.upc.backendtb3.user.domain.model.querys.GetAllStudentsQuery;
import pe.upc.backendtb3.user.domain.model.querys.GetStudentByIdQuery;
import pe.upc.backendtb3.user.domain.service.StudentQueryService;
import pe.upc.backendtb3.user.infrastructure.persistence.jpa.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentQueryServiceImpl implements StudentQueryService {

    private final StudentRepository studentRepository;

    public StudentQueryServiceImpl(StudentRepository studentRepository) { this.studentRepository = studentRepository; }

    @Override
    public List<Student> handle(GetAllStudentsQuery query) { return studentRepository.findAll(); }

    @Override
    public Optional<Student> handle(GetStudentByIdQuery query) { return studentRepository.findById(query.id()); }
}

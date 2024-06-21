package pe.upc.backendtb3.user.domain.service;

import org.springframework.stereotype.Service;
import pe.upc.backendtb3.user.domain.model.aggregates.Teacher;
import pe.upc.backendtb3.user.domain.model.querys.GetAllTeachersQuery;

import java.util.List;

@Service
public interface TeacherQueryService {
    List<Teacher> handle(GetAllTeachersQuery query);
}

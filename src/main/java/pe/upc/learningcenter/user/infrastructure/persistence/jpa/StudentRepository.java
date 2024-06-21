package pe.upc.backendtb3.user.infrastructure.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.backendtb3.course.domain.model.aggregates.Course;
import pe.upc.backendtb3.user.domain.model.aggregates.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

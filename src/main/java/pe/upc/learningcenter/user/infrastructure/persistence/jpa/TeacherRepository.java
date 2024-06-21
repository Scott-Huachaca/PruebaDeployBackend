package pe.upc.backendtb3.user.infrastructure.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.backendtb3.user.domain.model.aggregates.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}

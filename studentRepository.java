package crud_repo.student_management.repository;

import crud_repo.student_management.model.studentModel;
import org.springframework.data.repository.CrudRepository;

public interface studentRepository extends CrudRepository<studentModel,Integer> {
}

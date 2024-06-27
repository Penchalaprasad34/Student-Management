package crud_repo.student_management.service;

import crud_repo.student_management.model.studentModel;
import crud_repo.student_management.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class studentService {
 @Autowired
 studentRepository repo;
 public List<studentModel> getAllNames(){
     List<studentModel>studentModels=new ArrayList<>();
     repo.findAll().forEach(studentModels::add);
     return studentModels;
 }
 public void save(studentModel model){
     repo.save(model);
 }

 public void update(studentModel model){
     repo.save(model);
 }
}

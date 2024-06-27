package crud_repo.student_management.controller;

import crud_repo.student_management.model.studentModel;
import crud_repo.student_management.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {
 @Autowired
 studentService service;

 @GetMapping("/getNames")
 private List<studentModel> getAllStudents() {
  return service.getAllNames();
 }

 @PostMapping("/saving")
 private String saveStudent(@RequestBody studentModel model) {
  service.save(model);
  return model.getName();
 }

 @PutMapping("/update/{id}")
 private String update(@RequestBody studentModel model){
  service.update(model);
  return model.getName();
 }
}

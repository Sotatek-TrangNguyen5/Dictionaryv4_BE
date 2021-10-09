package dictionaryv4.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import dictionaryv4.Entity.Department;
import dictionaryv4.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
// test
@RestController
@RequestMapping(value = "departments")
@CrossOrigin(origins = "*")
public class DepartmentCotroller {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping
	public List<Department> getAllDepartment() {
		return departmentService.getAllDepartment();
	}
	@GetMapping(value="/{id}")
	public Department getDepartmentById(@PathVariable (name="id") short id) {
		return departmentService.getDepartmentByID(id);
	}
	@PostMapping()
	public void createDepartment(@RequestBody Department department) {
		departmentService.createDepartment(department);;
	}
	@PutMapping
	public void updateDepartment(@RequestBody Department department) {
		 departmentService.updateDepartment(department);;
	}
	@DeleteMapping(value="/deleteDp/{id}")
	public void deleteDepartment(@PathVariable(name="id")short id,Department department) {
		departmentService.deleteDepartment(id);
	}
	@GetMapping("get")
	public Department getDepartmentName(@PathParam("name") String name) {
		return departmentService.getDepartmentByName(name);
	}
	@GetMapping("get/map")
	public Department getDepartmentByaaa(@PathParam("name") String name) {
		return departmentService.getDepartmentByName(name);
	}
	
}

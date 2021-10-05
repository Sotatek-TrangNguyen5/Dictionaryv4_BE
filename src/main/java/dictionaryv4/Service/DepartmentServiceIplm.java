package dictionaryv4.Service;

import java.util.List;

import dictionaryv4.Entity.Department;
import dictionaryv4.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceIplm implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartment() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentByID(short id) {
		return departmentRepository.getOne(id);
	}

	@Override
	public Department getDepartmentByName(String name) {
		return departmentRepository.findByName(name);
	}

	@Override
	public void createDepartment(Department department) {
			departmentRepository.save(department);
		
	}

	@Override
	public void updateDepartment(short id, String newName) {
			Department department = new Department();
			department.setId(id);
			department.setName(newName);
			departmentRepository.save(department);
	}

	@Override
	public void updateDepartment(Department department) {
		departmentRepository.save(department);
		
	}

	@Override
	public void deleteDepartment(short id) {
		departmentRepository.deleteById(id);
		
	}

	@Override
	public boolean isDepartmentExistsByID(short id) {
		return departmentRepository.existsById(id);
	}

	@Override
	public boolean isDepartmentExistsByName(String name) {
		return departmentRepository.existsByName(name);
	}

}

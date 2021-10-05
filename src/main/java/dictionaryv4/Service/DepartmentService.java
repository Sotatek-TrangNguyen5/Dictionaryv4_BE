package dictionaryv4.Service;

import dictionaryv4.Entity.Department;

import java.util.List;


public interface DepartmentService {

		public List<Department> getAllDepartment();
		public Department getDepartmentByID(short id);
		public Department getDepartmentByName(String name);
		public void createDepartment(Department department);
		public void updateDepartment(short id, String newName);
		public void updateDepartment(Department department);
		public void deleteDepartment(short id);
		public boolean isDepartmentExistsByID(short id);
		public boolean isDepartmentExistsByName(String name);

}

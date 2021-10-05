package dictionaryv4.Repository;

import dictionaryv4.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Short>{
	public Department findByName(String name);
	public boolean existsByName(String name);
}

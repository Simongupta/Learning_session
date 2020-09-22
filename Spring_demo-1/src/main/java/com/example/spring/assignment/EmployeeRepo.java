package com.example.spring.assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepo  extends JpaRespository<Employee,Integer>{

}

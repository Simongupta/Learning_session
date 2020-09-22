package com.example.spring;
import java.util.Arrays;
import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.spring.assignment.*;
@SpringBootTest
public class AssignmentTest {
@Autowired
EmployeeRepo emp;
@Test
public void shouldInsertEmployee()
{
	Employee first=Employee.builder()
			.id(1)
			.firstname("Simon")
			.lastname("Gupta")
			.build();
	emp.save(first);
	Optional<Employee>first1=emp.findById(1);
	Assertions.assertThat(first1.isPresent()).isTrue();
	Assertions.assertThat(first1.get()).isEqualTo(first);
	
}
}

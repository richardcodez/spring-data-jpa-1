package com.richardcodez.spring_data_jpa_1;

import com.richardcodez.spring_data_jpa_1.model.Student;
import com.richardcodez.spring_data_jpa_1.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
//
//		s1.setRollNo(101);
//		s1.setName("Navin");
//		s1.setMarks(75);
//
//		s2.setRollNo(102);
//		s2.setName("Kiran");
//		s2.setMarks(80);
//
//		s3.setRollNo(103);
//		s3.setName("Harsh");
//		s3.setMarks(70);
//
//		repo.save(s2);
//		repo.save(s3);

//		Optional<Student> s = repo.findById(103);
//		System.out.println(s.orElse(new Student()));


		System.out.println(repo.findByMarksGreaterThan(72));

	}

}

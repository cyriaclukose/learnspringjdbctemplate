package jdbctemplate.learn;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbctemplate.dao.StudentDaoImpl;
import jdbctemplate.domain.Student;

public class JdbcTemplateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize the application context
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-beans.xml");

		StudentDaoImpl studentDao=(StudentDaoImpl)applicationContext.getBean("studentDaoImpl");
		
		Student student=new Student();
	    student.setId(157);
	    student.setFirst_name("ray");
	    student.setSecond_name("allen");
	    student.setCourse("basketball");
        student.setAge(39);		
        studentDao.insertStudent(student);
	}

}

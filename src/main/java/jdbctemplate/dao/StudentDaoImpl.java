package jdbctemplate.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbctemplate.domain.Student;

public class StudentDaoImpl implements StudentDAO   {
	
	private DataSource dataSource;
	private JdbcTemplate jdbctemplate;
	
	public void setDataSource(DataSource dataSource)
	{
	
		this.dataSource=dataSource;
	}

	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		//first we need have the query
		String query="INSERT INTO  student(Id,first_name,second_name,course,age) VALUES(?,?,?,?,?)";
		//create the jdbc template 
		jdbctemplate =new JdbcTemplate(dataSource);
		//create the inputs
		 Object[] inputs = new Object[] {student.getId(), student.getFirst_name(), student.getSecond_name(),student.getCourse(),student.getAge()};
	//execute the query
		 jdbctemplate.update(query, inputs);
	}

}

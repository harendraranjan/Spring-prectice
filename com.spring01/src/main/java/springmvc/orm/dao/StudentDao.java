package springmvc.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import springmvc.orm.entity.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	public int inssert(Student student) {
		Integer i=(Integer) this.hibernateTemplate.save(student);
		return i;
	}

}

package dao;

import domain.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {

    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    @Autowired
    public StudentDaoImpl() {
        super(Student.class);
    }
}

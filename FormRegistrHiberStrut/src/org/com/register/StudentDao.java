package org.com.register;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

public class StudentDao 
{
	AnnotationConfiguration cfg=new AnnotationConfiguration();  
	Session s=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
	public void add(Student stu)
	{
		s.beginTransaction();
		System.out.println( stu.getName());
		s.save(stu);
		s.getTransaction().commit();  
		System.out.println("registered");
	}
	
	@SuppressWarnings("unchecked")
	public List<Student> getList()
	{
		
		List<Student> students = new ArrayList<Student>();
		try
	    {
			students = s.createQuery("from Student").list();
	    }
	    catch(Exception e)
	    {
	         e.printStackTrace();
	    }
		s.beginTransaction().commit();
		s.close();
		return students;
	}
}

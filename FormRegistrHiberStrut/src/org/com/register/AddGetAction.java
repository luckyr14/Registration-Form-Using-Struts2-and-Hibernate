package org.com.register;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings({ "rawtypes", "serial" })
public class AddGetAction extends ActionSupport implements ModelDriven
{
	Student students = new Student();
	StudentDao rdao = new StudentDao();
	List<Student> liststudent = new ArrayList<Student>();
	@Override
	public Object getModel() {
		return students;
	}
	public String execute()
	{
		System.out.println("inside student");
		rdao.add(students);
		return "success";
	}
	public String getStudent()
	{
		liststudent = rdao.getList();
		return "success";		
	}
	
	public List<Student> getListstudent() {
		return liststudent;
	}

	public void setListstudent(List<Student> liststudent) {
		this.liststudent = liststudent;
	}
}

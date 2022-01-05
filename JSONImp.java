package jsonserdes;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONImp {
	public static void main(String []args) throws JsonGenerationException, JsonMappingException,IOException{
		Student student =new Student();
		student.setsId("570");
		student.setsName("hobi");
		student.setDept("cse");
		student.setAgg(8.5);
		
		Student student1= new Student();
		student1.setsId("571");
		student1.setsName("jk");
		student1.setDept("cse");
		student1.setAgg(9.5);
		
		Student student2= new Student();
		student2.setsId("572");
		student2.setsName("bob");
		student2.setDept("cse");
		student2.setAgg(7.5);
		
		ArrayList<Student> list= new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		list.add(student2);
		
		StudentList sls =new StudentList();
		sls.setStudentlist(list);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("D:\\student.json"), sls);
		System.out.println("student is serialized...");
		
		mapper = new ObjectMapper();
		StudentList slist = mapper.readValue(new File("D:\\student.json"),StudentList.class);
		
		ArrayList<Student> lst= slist.getStudentlist();
		for(Student s:lst) {
			System.out.println(s.getsId()+" "+s.getAgg());
		}
		
		
		
		
	}

}

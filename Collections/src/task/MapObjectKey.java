package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import Collectiontask.Student;

public class MapObjectKey {

	public static void main(String[] args) {
		//Map<Student, String> one= new TreeMap<Student, String>();
		Map<Student, String> one= new HashMap<Student, String>();
		Student stud1=new Student(101, "lokesh", 90);
		Student stud2=new Student(102, "lochan", 80);
		Student stud3=new Student(102, "locha", 80);
		one.put(stud1, stud1.getStudentName());
		one.put(stud2, stud2.getStudentName());
		one.put(stud3, stud3.getStudentName());
		
		for (Entry<Student, String> string : one.entrySet()) {
			System.out.println(string);
		}

	}

}

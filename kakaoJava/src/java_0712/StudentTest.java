package java_0712;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String []args) {
		Student arrays [] = new Student[3];
		arrays[0]= new Student("kjh",26,111,222,"333","444");
		arrays[1]= new Student("kjh2",27,1111,2222,"3333","4444");
		arrays[2]= new Student("kjh3",25,11111,22222,"33333","44444");
		for(Student d : arrays ) {
			System.out.println(d.printInformation());
		}
		
		ArrayList<Student> arr = new ArrayList<>();
		arr.add(new Student("kjh",26,111,222,"333","444"));
		arr.add(new Student("kjh2",27,1111,2222,"3333","4444"));
		arr.add(new Student("kjh3",25,11111,22222,"33333","44444"));
		arr.stream().forEach(d-> d.printInformation());
	}
}

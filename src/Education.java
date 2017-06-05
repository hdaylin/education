import java.util.ArrayList;

public class Education {

	public static void main(String[] args) {

		
		ArrayList <String> college = new ArrayList<String>();  
		
		Student Harry = new Student(); 
		Harry.setStatus("part time"); 
		Harry.setName("Harry");
		
		Faculty Allison = new Faculty(); 
		Allison.setName("Allison"); 
		Allison.setid(02434);
		Allison.setjob("Proffessor"); 
		Allison.setsalary(150000); 
		college.add("Howard"); 
		college.add("UMBC"); 
		Allison.addArrayList(college);
		
		
		
		
		System.out.println(Allison.getName()); 
		System.out.println(Allison.getid());
		System.out.println(Allison.getjob()); 
		System.out.println(Allison.getsalary()); 
		System.out.println(Allison.toString());
		
	
	}

}

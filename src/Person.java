
public class Person {

	private String name = "Daylin"; 
	private int id = 02713477;  
	private int age = 22; 
	private String job = "student"; 
	private String education = "bachelors";  
	private String [] colleges = {"Calvary Christian, HCA, Heather Hill, Homewood Flossmoor, Howard University"};


	public String setname(String newname){
		newname ="Daylin";
		return newname;	
	}

	public String name(){
		setName("John");
		return this.getName();
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String job(){
		setJob("Professor");
		return job;
	}  
	
	public void setcollges(String colleges){
		this.colleges.toString();
	} 

	public String education(){
		setEducation("masters");
		return this.education(); 
	}

	public String getName() {
		return name; 
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob(){
		return job; 
	}

	public String getEducation(){
		return education;
	}

	public void setEducation(String education){
		this.education =education;
	} 
	
	public String getColleges(){
		return colleges.toString();
	}
}


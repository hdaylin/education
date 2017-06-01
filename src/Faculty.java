
public class Faculty extends Person { 

	public Faculty(){

	}

	@Override 
	public String name(){
		setName("Harry"); 
		return name();
	} 

	@Override 
	public String job(){
		setJob("custodian"); 
		return job();
	}

	@Override 
	public String education(){ 
		setEducation("highschool"); 
		return education();

	}

}

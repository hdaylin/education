
public class Faculty extends Person { 

	private String name;
	private String job = "Professor"; 
	private int salary = 1500;   
	private int id = 0215164;
	private String [] education; 

	
	public Faculty() {
		
	}
	@Override
	public void setName(String name){
		this.name = "Profesor " + name;
	}
	
	public void setjob(String job){
		this.job = job; 
	} 
	
	public String getjob(){
		return job;
	}
	
	
	public void setsalary(int salary){
		this.salary= salary; 
	} 
	
	public int getsalary(){
		return salary;
	}  
	
	public String[] geteducation(){
		return education;
	} 
	
	public void seteducation(){
		this.education = education;
	}
	
	@Override 
	public void setid(int id){
		this.id =id; 
		
	}

}

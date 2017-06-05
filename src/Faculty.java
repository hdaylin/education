import java.util.ArrayList;

public class Faculty extends Person { 

	private String name;
	private String job = "Professor"; 
	private int salary = 1500;   
	private int id = 0215164;
	private String [] education;  
	private ArrayList <String> college = new ArrayList<String>(); 

	
	public Faculty() {
		
	}
	@Override
	public void setName(String name){
		this.name = "Profesor " + name;
	}
	
	public void setjob(String job){
		this.job = job; 
	} 
	
	public String getName(){
		return name;
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
	
	public String getCollege(int c){
		return college.get(c); 
	} 
	
	public void setcollege(String c){
		college.add(c);
	}
	
	public String[] geteducation(){
		return education;
	} 
	
	public void seteducation(String[] education){
		this.education = education;
	}
	
	@Override 
	public void setid(int id){
		this.id =id; 
		
	}
	public void addArrayList(ArrayList <String> college) {
		// TODO Auto-generated method stub
		this.college = college;
		
	}
	public String toString(){
		String output = "";
		if(this.college.size()>1){
			for (int count = 0; count<this.college.size(); count++){
				if(count==this.college.size()-1){
					output+=college.get(count);
				}
				else{
					output+=college.get(count)+" ";
			
				}
			}
			return output;
		}
		else return this.college.get(0);
	}

}

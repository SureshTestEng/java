package POM;

public class StudentDetails {
	
	String Studentname;
	int StudentAge;
	int StudentFeez;
	String Studentclgname;
	
	StudentDetails(String Name,int Age,int Feez,String ClgName){
		Studentname=Name;
		StudentAge=Age;
		StudentFeez=Feez;
		Studentclgname=ClgName;
	}
	
	void display() {
		System.out.println(Studentname+"  "+StudentAge+"  "+StudentFeez+"  "+Studentclgname);
	}
	
	public static void main(String[] args) {

		StudentDetails s=new StudentDetails("Surya",21,7000,"bsr");
		s.display();
		StudentDetails s1=new StudentDetails("Suri",20,8000,"svbr");
		s1.display();
		StudentDetails s2=new StudentDetails("Raina",22,6000,"Rayalaseema");
		s2.display();
		
		
	}

}

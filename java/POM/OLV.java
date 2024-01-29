package POM;

public class OLV {
	
	
	String Studentname;
	int Studentage;
	int Studentfeez;
	String Studentcource;
	int Studentphonenum;
	
	OLV(String Name,int Age,int Feez,String Cource,int Number){
		
		Studentname=Name;
		Studentage=Age;
		Studentfeez=Feez;
		Studentcource=Cource;
		Studentphonenum=Number;
	}
	
	void display() {
		System.out.println(Studentname+"  "+Studentage+"  "+Studentfeez+"  "+Studentcource+"  "+Studentphonenum);
	}
	
	public static void main(String[] args) {        
        
		OLV s=new OLV("Mahesh",22,5000,"python",703215607);
		s.display();
		OLV s1=new OLV("dileep",25,8000,"testing",609756732);
		s1.display();
		OLV s2=new OLV("Naveen",30,9000,"Automation",905647329);
		s2.display();
		OLV s3=new OLV("Surya",21,6000,"Manual",767484490);
		s3.display();
		
		
	}

}

package t2;

public class Patient {

	 private String name  ; 

	 private String disease ; 
	 private int patientId; 
	 private int age ; 
	
	public Patient (String n , String d , int i , int a ){
		name = n ; 
		disease = d; 
		patientId =i ; 
		age = a ;
		
		
	}
	
	
	
	
	
	public String getName (){return name ; }
	public int getpatientId (){return patientId ; }
	
	public String getdisease (){ return disease ; }
	
	public int getage (){ return age ; }

	
	
	public void display (){
		
		System.out.println(name );
		System.out.println(patientId );
		System.out.println(age );

		System.out.println(disease);
		
		
		
	}
	
	
	
	
	
	
	
	
}

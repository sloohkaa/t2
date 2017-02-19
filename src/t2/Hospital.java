package t2;

public class Hospital {

	
	private Patient arrPatient [] ; 
	private int nbs ; 
	private String hospitalName ;
	
	public Hospital (int size , String  name ) {
		arrPatient = new Patient [size] ;
		hospitalName = name ; 
		nbs = 0 ;
		
	}
	
	

	
	
	
	
	
	
	public Patient[] getPatients (String d)
	{
		 Patient arr2 [] = new Patient [nbs] ; 
		for(int i =0 ; i<nbs ; i++){
           if(arrPatient[i].getdisease().equals(d)){
        	   arr2[i] = arrPatient[i] ; 
           }
           return arr2 ;
	}
		return null ; 
	}
	
	
		
		
		
		
	public  Patient[] getTyphoidPatients   (int age  ) { 
	
		
		 Patient arr2 [] = new Patient [nbs] ; 
		 for(int i =0 ; i<nbs ; i++){
	           if(arrPatient[i].getdisease().equals("Typhoid")){
	        	   if(arrPatient[i].getage() == age )
	        	   arr2[i] = arrPatient[i] ; 
	           }
		return arr2 ;
		 }
		 return null ; 
	}}
		 
		 
		 
		 
		 
		 

	
		 
		 
		 
		 

	
	
	
	
	
	
	
	
	
	

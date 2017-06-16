package ResumeBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class Resume {

	private int pID;
	private String first;
	private String last;
	private String email;
	private String degree;
	private String major;
	private String un_Grad;
	private String y_Grad;
	private String title;
	private String c_Name;
	private String s_Date;
	private String e_Date;
	private String duty1;
	private String duty2;
	private String sFieldsratings;
	ArrayList<String> array_skills;
	private RDatabase db;
	
	public Resume(String fName, String lName, String eAddress, String pDegree, String pMajor, String uGrad, String yGrad, String pTitle, String cName, 
			String sDate, String eDate,String pDuty1, String pDuty2,String pSFieldsRatings) {
		// TODO Auto-generated constructor stub
		this.db=new RDatabase();
		String choice_edu="yes", choice_exp="yes", choice_duty="yes",choice_skills="yes";
		first=fName;
		last=lName;
		email=eAddress;
		degree=pDegree;
		major=pMajor;
		un_Grad=uGrad;
		y_Grad=yGrad;
		title=pTitle;
		c_Name=cName;
		s_Date=sDate;
		e_Date=eDate;
		duty1=pDuty1;
		duty2=pDuty2;
		sFieldsratings=pSFieldsRatings;
		
		
		db.addPerson( first, last,email);
		//while(choice_edu.equalsIgnoreCase("Yes")){
			db.addEducation(degree,major,un_Grad,y_Grad); 
			//Scanner choiceIn = new Scanner(System.in);
			//choice_edu = choiceIn.next();
		
		//}
		//while(choice_exp.equalsIgnoreCase("Yes")){	
		
			db.addExperience(title,c_Name,s_Date,e_Date,duty1,duty2);
			/*Scanner choice_In = new Scanner(System.in);
			choice_duty = choice_In.next();*/
		//}
		//while(choice_skills.equalsIgnoreCase("Yes")){
			db.addSkills(sFieldsratings);	
			//Scanner choiceIn = new Scanner(System.in);
			/*choice_skills = choiceIn.next();	
			array_skills = new ArrayList<String>();
			array_skills.add(sFieldsratings);
		}*/
		}
		
	
		
	public String displayResume()
	
	{	
	
		print(first+ " "+last + "/n");
		print(email+ "/n");
		print("/n");
		print("/n");
		print("Education");
		print(degree+","+"/n");
		print(un_Grad+", "+y_Grad+"/n");
		print("/n");
		print("/n");
		print("Experience");
		print(title);
		print(c_Name+", "+s_Date+"-"+e_Date+"/n");
		print("-"+duty1+"/n");
		print("-"+duty2+"/n");
		print("/n");
		print("/n");
		print("Skills");
		print("sFieldsRatings");
		/*for(int j=0; j<array_skills.size(); j++){
		print("-"+sFieldsratings+"/n");
		}*/
		print("/n");
		print("/n");
		
return null;
}


private static void print(String s){
		
		
		System.out.println(s);
	}
private static void print(ArrayList<String> a){
	
	
	System.out.println(a);
}
}
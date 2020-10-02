

package Day4EmpWageProb;

public class Uc7EmpWage {

	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NO_OF_WORKING_DAYS=20;
	public static final int MAX_NO_OF_HOURS=100;
	
	
	public static int computeEmpWage(){
		//Variables
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		//Computation
		while(totalEmpHrs<= MAX_NO_OF_HOURS && totalWorkingDays<NO_OF_WORKING_DAYS) {
			totalWorkingDays++;
		     int empCheck =(int) Math.floor(Math.random()*10)%3;
				switch (empCheck) {
				  case IS_PART_TIME:
				     empHrs=4;
				     break; 
			      case IS_FULL_TIME:
					     empHrs=8;
					     break;
			      default:
			    	 empHrs=0;
			    	 break;
				}
		 totalEmpHrs+= empHrs;
		 System.out.println("Day:"+ totalWorkingDays+ ",Total employee hours worked:"+empHrs);
			  
	     }
		int totalEmpWage= totalEmpHrs * EMP_RATE_PER_HOUR;
		         System.out.println("Total Employee wage:"+ totalEmpWage);
		         return totalEmpWage;
		         
	}
	public static void main(String[] args) {
		computeEmpWage();
	}}


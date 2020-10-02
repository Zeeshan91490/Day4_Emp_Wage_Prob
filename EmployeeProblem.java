package Day4EmpWageProb;

public class uc9EmpWage {

	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	
	private final String company;
	private final  int numOfWorkingDays;
	private final  int empRatePerHour;
	private final int  maxHoursPerMonth;
	private int  totalEmpWage;
	

	public uc9EmpWage (String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
		this.company = company;
		this.empRatePerHour= empRatePerHour;
		this.numOfWorkingDays =numOfWorkingDays;
		this. maxHoursPerMonth= maxHoursPerMonth;
	}
	public void computeEmpWage() {
		//Variables
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		//Computation
		while(totalEmpHrs<= maxHoursPerMonth  && totalWorkingDays<numOfWorkingDays) {
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
		 System.out.println("Day:"+ totalWorkingDays+ ",EmpHrs::"+empHrs);
			  
	     }
		 totalEmpWage= totalEmpHrs * empRatePerHour;
	}
	@Override
	public String toString() {
		return "Total Emp Wage for Company:"+ company + "is:"+ totalEmpWage ;
	}
	public static void main(String[] args) {
		uc9EmpWage dmart=new uc9EmpWage("DMart",20,2,10);
		uc9EmpWage reliance=new uc9EmpWage("Reliance",10,4,20);
		dmart.computeEmpWage();
		System.out.println("DMart");
		reliance.computeEmpWage();
		System.out.println("Reliance");
		
	}
		
	}
	



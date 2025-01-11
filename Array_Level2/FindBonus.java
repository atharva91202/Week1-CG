import java.util.Scanner;
public class FindBonus{
	public static void main(String[]args){

		Scanner input=new Scanner(System.in);
		double salary[]=new double[10];
		double yearOfService[]=new double[10];
		double bonus[]=new double[10];
		double newSalary[]=new double[10];
		
		for(int i=0;i<10;i++){
			System.out.println("Input the salary of"+(i+1)+"th employee");
			salary[i]=input.nextDouble();
			System.out.println("Input the year of service of"+(i+1)+"th employee");
			yearOfService[i]=input.nextDouble();
		}
		double totalBonus=0;
		double totalOldSalary=0;
		double totalNewSalary=0;
		
		for(int i=0;i<10;i++){
			if(yearOfService[i]>5){
				bonus[i]=salary[i]*5/100;
			}
			else {
				bonus[i]=salary[i]*2/100;
			}
			totalBonus=totalBonus+bonus[i];
			totalOldSalary=totalOldSalary+salary[i];
			newSalary[i]=salary[i]+bonus[i];
			totalNewSalary=totalNewSalary+newSalary[i];
		}
		System.out.println("Total bonus "+ totalBonus+" Total old salary"+totalOldSalary+" Total new salary "+totalNewSalary);
	}
}



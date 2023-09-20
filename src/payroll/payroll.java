
package payroll;

import java.util.Scanner;

public class payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP: ");
		Scanner empNo = new Scanner(System.in);
		String employeeNumber = empNo.next();

		System.out.println("ENTER THE EMPLOYEE NAME");
		Scanner empName = new Scanner(System.in);
		String employeeName = empName.nextLine();
		System.out.println("ENTER THE EMPLOYEE DESIGNATION");
		Scanner des = new Scanner(System.in);
		String designation = des.nextLine();
		System.out.println("ENTER THE NUMBER OF DAYS WORKED");
		Scanner days = new Scanner(System.in);
		int daysWorked = days.nextInt();
		System.out.println("ENTER THE PAY RATE");
		Scanner pRate = new Scanner(System.in);
		double payRate = pRate.nextDouble();
		System.out.println("ENTER THE GENERATION DATE");
		Scanner date = new Scanner(System.in);
		String generationDate = date.nextLine();
		
		double basicPay = daysWorked * payRate;
		double pF = basicPay / 10;
		final double profTax = 0.2 * basicPay;
		double totalDeduct = profTax + pF;
		double netPay = basicPay - totalDeduct;
		System.out.println("");
		System.out.println("               SHREE KRISHNA CHEMIST AND DRUGGIST                  ");
		System.out.println("                        SALARY MONTH 9 2013");
		System.out.println("");
		System.out.println("EMP. NO.: " + employeeNumber        +"EMP. NAME: " +employeeName           +"DESIGNATION: " + designation);
		System.out.println("DAYS WORKED: " + daysWorked         +"PAY RATE: " + (int)payRate           +"GEN. DATE: " + generationDate);
		System.out.println("_________________________________________________________________________________________________");
		System.out.println("EARNINGS               AMOUNT(RS.)                       DEDUCTIONS               AMOUNT(RS.)  ");
		System.out.println("_________________________________________________________________________________________________");
		System.out.println("BASIC PAY               "+(int)basicPay                 + "\t\t\t\tP.F              \t "+ (int)pF);
		System.out.println("                                                        PROF TAX                 "+(int)profTax);
		System.out.println("_________________________________________________________________________________________________");
		System.out.println("GROSS EARN              "+ (int)basicPay               +"\t\t\t\tTOTAL DEDUCT.  \t       "+ (int)totalDeduct);
		System.out.println("                                                         NET PAY               "+ (int)netPay );
		System.out.println("________________________________________________________________________________________________");
	}

	}

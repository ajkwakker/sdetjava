package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		String career; 
		System.out.println("Program is starting");
		career = "Software tester";
		System.out.println("My career is a: " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary is " + career + " is " + salary);
	}
}

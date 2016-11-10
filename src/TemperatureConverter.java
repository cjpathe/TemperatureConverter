import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Temperature");
		int temp = keyboard.nextInt();
		
		System.out.println("Convert to Celcius (C) or Farenheight (F) ?");
		String ForC = keyboard.next();
		
		System.out.println("Temp = " +  temp + " ForC = " + ForC);
		
		switch (ForC) {
		
		case "F" : 
			double TempF = CtoF(temp);
			System.out.println("Temp = " +  temp + " Celcius is " + TempF + " in Farenheight");
			break;
			
		case "C" :
			double TempC = FtoC(temp);
			System.out.println("Temp = " +  temp + " Farenheight is " + TempC + " in Celcius");
			break;
			
		default:
			System.out.println("Invalid Choice");
			break;
		}
		}
		

	public static double CtoF(int TempC) {
		
		double F = (TempC*1.8) + 32;
		return  F;
	}
		
	public static double FtoC(int TempF) {
		
		double F = (TempF - 32)/1.8;
		return  F;
	}
	}

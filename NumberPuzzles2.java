/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpuzzles2;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class NumberPuzzles2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int selection = 0;
		
		do
		{
			System.out.println("1) Find two digit numbers <= 56 sums of digits > 10");
			System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
			System.out.print("3) Quit");
			System.out.println();
			
			selection = keyboard.nextInt();
			
			if (selection == 1)
				function1();
			else if (selection == 2)
				function2();
				
		if(!(selection == 1 || selection == 2 || selection == 3))  // Makes sure input is valid (selection = 1, 2, or 3)
			System.out.println("Invalid input, try again\n");
			
		}while (!(selection == 3));
	}
	
	//Functions
	public static void function1() {
	
		for(int i=1; i <= 5; i++){
                
                    //System.out.println();
                    for(int j=0; j <= 9; j++){
                    
                        int sum= i + j;
                        if(sum >= 10 && i <= 5){
                        
                            if(i <= 4){
                            
                                System.out.println(i + "" + j );
                            }else if(j < 7){
                            
                                System.out.println(i + "" + j);
                            }
                        }
                    }
                }
	}
	
	public static void function2(){
		for(int d = 10 ; d < 100 ; d++)
		{
			int d1 = d/10;
			int d2 = d%10;
			int sum = d1 + d2;
			int f = d - sum;
			int f1 = f / 10;
			int f2 = f % 10;
		
			if ((d - f == sum) && d1 == f2 && d2 == f1)
			{
				System.out.println(d+ " - " + f + " = " + sum);
				System.out.println();
			}
		}
	}
        
        
	
}
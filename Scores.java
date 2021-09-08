//Evan White
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Scores {

	public static void main(String[] args) throws IOException{
		int sum = 0;
		int total = 0;
		int count = 0;
		int min = 0;
		int max = 0;
		int range = 0;
		int number = 0; 
		int medNum1 = 0;
		int medNum2 = 0;
		double median = 0;
		double m1 = 0.0;
		double m2 = 0.0;
		
		
		Scanner input = new Scanner(new File("scores.txt"));
		
		ArrayList <Integer> list = new ArrayList <Integer>();
		
		while(input.hasNext())
		{
		 number = Integer.parseInt(input.nextLine());
		 sum += number;
		 list.add(number);
		 count ++;
		}
		
		Collections.sort(list);
		
		double average = sum / count;
		
		System.out.println("The Mean is: " + average);
		
		min = list.get(0);
		max = list.get(list.size() -1);
		range = max - min;
		System.out.println("The Range is: " + range);
		
       if(list.size() % 2 == 0)
       {
    	  medNum1 = list.size() / 2;
    	  medNum2 = list.size() / 2 -1;
    	  
    	  m1 = list.get(medNum1);
   	      m2 = list.get(medNum2);
   	      
   	      median = ( m1 + m2) / 2;
       }
       else
       {
    	   medNum1 = list.get(list.size() /2);
    	  // list.get(medNum1);
    	   median = medNum1;
       }
		System.out.println("The Median is: " + median );
		
		
		
		int counter = 0;
		int base = 0;
		int temp = 0;
		int baseCount = 0;
		
		for(int i = 1; i < list.size(); i++)
		{
			   temp = list.get(i);
			   counter = 0;
			   
			   for(int j = i + 1; j < list.size(); j++)
			   {
				   if(temp == list.get(j))
					   counter++;
			   }
			if(list.get(i) == list.get(i - 1))
			{
				counter++;
			}
			
			else
			{
				counter = 1;
			}
			
			if(counter > baseCount)
			{
				baseCount = counter;
				base = baseCount;
			}
				
			counter = i;
			baseCount = 0;
			
		}
		
		System.out.println("The Mode is: " + baseCount);
		
	}

}

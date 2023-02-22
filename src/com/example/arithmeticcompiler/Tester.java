package com.example.arithmeticcompiler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester 
{
	static int a=0,b=0,c=0,d=0,count=1;

	public static void main(String[] args) throws IOException 
	{
		
		File folder = new File("Project_One");
		folder.mkdir();
		
		File file = new File(folder,"abc.txt");
		file.createNewFile();

		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String data;
		System.out.println("Enter the input : ");
	
		do 
		{
            data = br.readLine();
            if (data != null) 
            {
                bw.write(data);
                bw.newLine();
                bw.flush();
            }
        } while (data != null && !data.isEmpty());
		
		
		System.out.println("Operations for Entered Data : \n");
		
		BufferedReader brfromfile = new BufferedReader(new FileReader(file));
		
		String line;
		
        while ((line = brfromfile.readLine()) != null) 
        {
            System.out.println(line);
            show(line);
            System.out.flush();
        }
		
		brfromfile.close();
		bw.close();
	}
	
	
	static void show(String line) 
	{
		String[] parts = line.split(" ");
        //System.out.println("line : " + count++ + " length : "+ parts.length);

        if (parts.length >= 3) 
        {
            if (parts[0].equals("31")) 
            {
                if (parts[1].equals("37")) 
                {
                    a = Integer.parseInt(parts[2]);
                    System.out.println("Variable a is set to: " + a);
                } 
                else if (parts[1].equals("38")) 
                {
                    b = Integer.parseInt(parts[2]);
                    System.out.println("Variable b is set to: " + b);
                } 
                else if (parts[1].equals("39")) 
                {
                    c = Integer.parseInt(parts[2]);
                    System.out.println("Variable c is set to: " + c);
                }
                else if (parts[1].equals("40")) 
                {
                    d = Integer.parseInt(parts[2]);
                    System.out.println("Variable d is set to: " + d);
                }
                else 
                {
                	System.out.println("There are no such commands...");
                }
            }
            else if (parts[0].equals("32")) 
            {
            	if (parts[1].equals("37") && parts[2].equals("37")) 
                {
                    a = a + a;
                    System.out.println(" a + a: " + a);
                } 
            	else if (parts[1].equals("37") && parts[2].equals("38")) 
                {
                    a = a + b;
                    System.out.println(" a + b: " + a);
                } 
                else if (parts[1].equals("37") && parts[2].equals("39")) 
                {
                    a = a + c;
                    System.out.println(" a + c: " + a);
                } 
                else if (parts[1].equals("37") && parts[2].equals("40")) 
                {
                    a = a + d;
                    System.out.println(" a + d: " + a);
                } 
                else if (parts[1].equals("38") && parts[2].equals("38")) 
                {
                    b = b + b;
                    System.out.println(" b + b: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("37")) 
                {
                    b = b + a;
                    System.out.println(" b + a: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("39")) 
                {
                    b = b + c;
                    System.out.println(" b + c: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("40")) 
                {
                    b = b + d;
                    System.out.println(" b + d: " + b);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c + c;
                    System.out.println(" c + c: " + c);
                }
                else if (parts[1].equals("39") && parts[2].equals("37")) 
                {
                    c = c + a;
                    System.out.println(" c + a: " + c);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c + b;
                    System.out.println(" c + b: " + c);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c + d;
                    System.out.println(" c + d: " + c);
                } 
                else if (parts[1].equals("40") && parts[2].equals("40")) 
                {
                    d = d + d;
                    System.out.println(" d + d: " + d);
                } 
                else if (parts[1].equals("40") && parts[2].equals("37")) 
                {
                    d = d + a;
                    System.out.println(" d + a: " + d);
                } else if (parts[1].equals("40") && parts[2].equals("38")) 
                {
                    d = d + d;
                    System.out.println(" d + a: " + d);
                } else if (parts[1].equals("40") && parts[2].equals("39")) 
                {
                    d = d + d;
                    System.out.println(" d + a: " + d);
                } else {
                	System.out.println("There are no such commands...");
                }
            }
            else if (parts[0].equals("33")) 
            {
            	if (parts[1].equals("37") && parts[2].equals("37")) 
                {
                    a = a - a;
                    System.out.println(" a - a: " + a);
                } 
            	else if (parts[1].equals("37") && parts[2].equals("38")) 
                {
                    a = a - b;
                    System.out.println(" a - b: " + a);
                } 
                else if (parts[1].equals("37") && parts[2].equals("39")) 
                {
                    a = a - c;
                    System.out.println(" a - c: " + a);
                } 
                else if (parts[1].equals("37") && parts[2].equals("40")) 
                {
                    a = a - d;
                    System.out.println(" a - d: " + a);
                } 
                else if (parts[1].equals("38") && parts[2].equals("38")) 
                {
                    b = b - b;
                    System.out.println(" b - b: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("37")) 
                {
                    b = b - a;
                    System.out.println(" b - a: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("39")) 
                {
                    b = b - c;
                    System.out.println(" b - c: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("40")) 
                {
                    b = b - d;
                    System.out.println(" b - a: " + b);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c - c;
                    System.out.println(" c - c: " + c);
                }
                else if (parts[1].equals("39") && parts[2].equals("37")) 
                {
                    c = c - a;
                    System.out.println(" c - a: " + c);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c - b;
                    System.out.println(" c - b: " + c);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c - d;
                    System.out.println(" c - d: " + c);
                } 
                else if (parts[1].equals("40") && parts[2].equals("40")) 
                {
                    d = d - d;
                    System.out.println(" d - d: " + d);
                } 
                else if (parts[1].equals("40") && parts[2].equals("37")) 
                {
                    d = d - a;
                    System.out.println(" d - a: " + d);
                } else if (parts[1].equals("40") && parts[2].equals("38")) 
                {
                    d = d - d;
                    System.out.println(" d - a: " + d);
                } else if (parts[1].equals("40") && parts[2].equals("39")) 
                {
                    d = d - d;
                    System.out.println(" d - a: " + d);
                } else {
                	System.out.println("There are no such commands...");
                }
            }
            else if (parts[0].equals("34")) 
            {
            	if (parts[1].equals("37") && parts[2].equals("37")) 
                {
                    a = a * a;
                    System.out.println(" a * a: " + a);
                } 
            	else if (parts[1].equals("37") && parts[2].equals("38")) 
                {
                    a = a * b;
                    System.out.println(" a * b: " + a);
                } 
                else if (parts[1].equals("37") && parts[2].equals("39")) 
                {
                    a = a * c;
                    System.out.println("a * c: " + a);
                } 
                else if (parts[1].equals("37") && parts[2].equals("40")) 
                {
                    a = a * d;
                    System.out.println(" a * d: " + a);
                } 
                else if (parts[1].equals("38") && parts[2].equals("38")) 
                {
                    b = b * b;
                    System.out.println(" b * b: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("37")) 
                {
                    b = b * a;
                    System.out.println(" b * a: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("39")) 
                {
                    b = b * c;
                    System.out.println(" b * c: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("40")) 
                {
                    b = b * d;
                    System.out.println(" b * a: " + b);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c * c;
                    System.out.println(" c * c: " + c);
                }
                else if (parts[1].equals("39") && parts[2].equals("37")) 
                {
                    c = c * a;
                    System.out.println(" c * a: " + c);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c * b;
                    System.out.println("c * b: " + c);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c * d;
                    System.out.println(" c * d: " + c);
                } 
                else if (parts[1].equals("40") && parts[2].equals("40")) 
                {
                    d = d * d;
                    System.out.println(" d * d: " + d);
                } 
                else if (parts[1].equals("40") && parts[2].equals("37")) 
                {
                    d = d * a;
                    System.out.println(" d * a: " + d);
                } else if (parts[1].equals("40") && parts[2].equals("38")) 
                {
                    d = d * d;
                    System.out.println(" d * a: " + d);
                } else if (parts[1].equals("40") && parts[2].equals("39")) 
                {
                    d = d * d;
                    System.out.println(" d * a: " + d);
                } else {
                	System.out.println("There are no such commands...");
                }
            }
            else if (parts[0].equals("35")) 
            {
            	if (parts[1].equals("37") && parts[2].equals("37")) 
                {
                    a = a / a;
                    System.out.println(" a / a: " + a);
                } 
            	else if (parts[1].equals("37") && parts[2].equals("38")) 
                {
                    a = a / b;
                    System.out.println(" a / b: " + a);
                } 
                else if (parts[1].equals("37") && parts[2].equals("39")) 
                {
                    a = a / c;
                    System.out.println("a / c: " + a);
                } 
                else if (parts[1].equals("37") && parts[2].equals("40")) 
                {
                    a = a / d;
                    System.out.println(" a / d: " + a);
                } 
                else if (parts[1].equals("38") && parts[2].equals("38")) 
                {
                    b = b / b;
                    System.out.println(" b / b: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("37")) 
                {
                    b = b / a;
                    System.out.println(" b / a: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("39")) 
                {
                    b = b / c;
                    System.out.println(" b / c: " + b);
                } 
                else if (parts[1].equals("38") && parts[2].equals("40")) 
                {
                    b = b / d;
                    System.out.println(" b / a: " + b);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c / c;
                    System.out.println(" c / c: " + c);
                }
                else if (parts[1].equals("39") && parts[2].equals("37")) 
                {
                    c = c / a;
                    System.out.println(" c / a: " + c);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c / b;
                    System.out.println("c / b: " + c);
                } 
                else if (parts[1].equals("39") && parts[2].equals("39")) 
                {
                    c = c / d;
                    System.out.println(" c / d: " + c);
                } 
                else if (parts[1].equals("40") && parts[2].equals("40")) 
                {
                    d = d / d;
                    System.out.println(" d / d: " + d);
                } 
                else if (parts[1].equals("40") && parts[2].equals("37")) 
                {
                    d = d / a;
                    System.out.println(" d / a: " + d);
                } else if (parts[1].equals("40") && parts[2].equals("38")) 
                {
                    d = d / d;
                    System.out.println(" d / a: " + d);
                } else if (parts[1].equals("40") && parts[2].equals("39")) 
                {
                    d = d / d;
                    System.out.println(" d / a: " + d);
                } else {
                	System.out.println("There are no such commands...");
                }
            }
            else 
            {
            	System.out.println("Please enter proper commands...");
            }
            
        }
        else if (parts.length < 3 && parts.length >= 2) 
        {
            if (parts[0].equals("36")) 
            {
                if (parts[1].equals("37")) 
                {
                    System.out.println("Variable a is : " + a);
                } 
                else if (parts[1].equals("38")) 
                {
                    System.out.println("Variable a is : " + b);
                }
                else if (parts[1].equals("39")) 
                {
                    System.out.println("Variable a is : " + c);
                }
                else if (parts[1].equals("40")) 
                {
                    System.out.println("Variable a is : " + d);
                }
                else 
                {
                	System.out.println("Something went wrong in print statement...");
                }
            }
            else {
            	System.out.println("Please enter proper print statement...");
            }
         }
         else if(parts.length <= 1)
         {
        	 System.out.println("END"); 
         } 
         else 
         {
         	System.out.println("There are no such commands...");
         }
	
	
	}
}
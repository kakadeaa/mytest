import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Maths Maths = new Maths();

    double answer = 0;
    double inputA, inputB,angle1,angle2;
    int opt;
    char operator;
    int done = 0;

     while (done == 2) {
     	System.out.println("Enter which operation you want to perform?\n1.Airthmetic\n2.Trignometric functions");
     	opt=input.nextInt();
    	if(opt==2)
    	{
    		System.out.println("Enter which trignometric operation you want?\n1.Sin\n2.Cos\n3.Tan");
    		int op=input.nextInt();
    		switch(op)
			{
				case 1:
						System.out.println("Enter Angle");
						angle1=input.nextDouble();
						System.out.println(Math.sin(Math.toRadians(angle1)));
						break;
				case 2:
						System.out.println("Enter Angle");
						angle1=input.nextDouble();
						System.out.println(Math.cos(Math.toRadians(angle1)));
						break;
				case 3:
						System.out.println("Enter Angle");
						angle1=input.nextDouble();
						System.out.println(Math.tan(Math.toRadians(angle1)));
						break;
			}
		}
		else
		{
    	    System.out.print("Please enter your sum: ");
			inputA = input.nextDouble();
    	    operator = input.next().charAt(0);
    	    inputB = input.nextDouble();        
			switch (operator)
			 {
            case '+': answer = Maths.add(inputA, inputB);
                      break;
            case '-': answer = Maths.subtract(inputA, inputB);
                      break;
            case '*': answer = Maths.multiply(inputA, inputB);
                      break;
            case '/': answer = Maths.divide(inputA, inputB);
                      break;
            case '^': answer = Maths.power(inputA, inputB);
                      break;
        	}

            System.out.println(answer);
        }
        System.out.println("Are you done?\n1.Yes\n2.No");
        done=input.nextInt();          
    }       

    input.close();

  }

}

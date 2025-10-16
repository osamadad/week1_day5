import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//--------------------------------------------------------------------------------------------------------------------
        //1) Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        //two numbers , takes two numbers as input

//        System.out.println("Please enter 2 numbers to sum, multiply, subtract, divide, and see the reminder of:");
//        int num1= input.nextInt();
//        int num2= input.nextInt();
//        System.out.println("the sum of "+num1+" and "+num2+" is "+ (num1+num2));
//        System.out.println("the multiplying of "+num1+" and "+num2+" is "+ (num1*num2));
//        System.out.println("the subtraction of "+num1+" and "+num2+" is "+ (num1-num2));
//        if (num2==0){
//            System.out.println("Can't divide on 0");
//        }
//        else {
//            System.out.println("the division of "+num1+" and "+num2+" is "+ (num1/num2)
//                    +" and the reminder of the division is "+ (num1%num2));
//        }

        //--------------------------------------------------------------------------------------------------------------------
        //2) Write a Java program that takes a number as input and prints its multiplication table up to 10.

//        System.out.println("Please enter a numbers to print the multiplication table of it:");
//        int num= input.nextInt();
//        for (int i=1;i<=10;i++){
//            System.out.println(num+"*"+i+"="+(num*i));
//        }

        //--------------------------------------------------------------------------------------------------------------------
        //3) Write a Java program to print the area and perimeter of a circle.

//        System.out.println("Please enter the radius of the circle to calculate the area and perimeter");
//        float r= input.nextFloat();
//        float pi= 3.141592F;
//        double area= pi*(Math.pow(r,2));
//        double perimeter= 2*pi*r;
//        System.out.println("the area of the circle is "+area);
//        System.out.println("the perimeter of the circle is "+perimeter);

        //--------------------------------------------------------------------------------------------------------------------
        //4) Java program to find out the average of a set of integers

//        System.out.println("Please enter the count of numbers");
//        int count= input.nextInt();
//        float sum=0;
//        for (int i=1;i<=count;i++){
//            System.out.println("Please enter a number");
//            int num= input.nextInt();
//            sum+=num;
//        }
//        System.out.println(sum/count);

        //--------------------------------------------------------------------------------------------------------------------
        //5) Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.

//        System.out.println("Please enter 3 number the first 2 will be summed together" +
//                " and compared if it's equal to the third number");
//        System.out.println("First number");
//        int num1 = input.nextInt();
//        System.out.println("Second number");
//        int num2 = input.nextInt();
//        System.out.println("Third number (the comparable number)");
//        int num3 = input.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("First number is " + num1);
//        System.out.println("Second number is " + num2);
//        System.out.println("Third number is " + num3);
//        System.out.println("The sum of the first 2 numbers is " + sum);
//        System.out.println(((num2 + num1) == num3) ? "the result is: true" : "the results is: false");

        //--------------------------------------------------------------------------------------------------------------------
        //6) Write a Java program to reverse a word.

//        System.out.println("Please enter a string to reverse it");
//        String sentence = input.next();
//        StringBuilder my_stringbuilder= new StringBuilder(sentence);
//        System.out.println("The entered sentence is "+ sentence);
//        System.out.println("The reverse of it is "+ my_stringbuilder.reverse());

        //--------------------------------------------------------------------------------------------------------------------
        //7) Java program to check whether the given number is even or odd

//        System.out.println("Please enter a number to check if odd or even:");
//        int num= input.nextInt();
//        if (num%2==0){
//            System.out.println("The number is even");
//        }
//        else {
//            System.out.println("The number is odd");
//        }

        //--------------------------------------------------------------------------------------------------------------------
        //8) Java program to convert the temperature in Centigrade to Fahrenheit

//        System.out.println("Please enter your temperature in centigrade");
//
//        float c_temperature= input.nextFloat();
//        float f_temperature= 0;
//        f_temperature= (float) ((c_temperature*1.8)+32);
//        System.out.println("Temperature in centigrade:" +c_temperature);
//        System.out.println("Temperature in fahrenheit:" +f_temperature);

        //--------------------------------------------------------------------------------------------------------------------
        //9) Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index

//        System.out.println("Please enter a sentence:");
//        String sentence= input.nextLine();
//        System.out.println("Please enter the number of the index you want:");
//        int index= input.nextInt();
//        if (index>sentence.length()-1){
//            System.out.println("sorry the index to enter is bigger than the sentence");
//        }
//        else {
//            System.out.println("the sentence is " + sentence);
//            System.out.println("the index numbers is: " + index + " and the char at that index is: " + sentence.charAt(index));
//        }

        //--------------------------------------------------------------------------------------------------------------------
        //10) Write a Java program to print the area and perimeter of a rectangle.

//        System.out.println("Please enter the height and width of the rectangle to calculate the area and perimeter");
//        System.out.println("enter the height:");
//        float height= input.nextFloat();
//        System.out.println("enter the width:");
//        float width = input.nextFloat();
//        double area= width*height;
//        double perimeter= 2*(width+height);
//        System.out.println("the area of the rectangle is "+ area);
//        System.out.println("the perimeter of the rectangle is "+ perimeter);

        //--------------------------------------------------------------------------------------------------------------------
        // 11) Write a Java program to compare two numbers.

//        System.out.println("Please enter 2 number to compare");
//        int num1= input.nextInt();
//        int num2= input.nextInt();
//
//        System.out.println((num1<num2)? num1+"<"+num2:"");
//        System.out.println((num1<=num2)? num1+"<="+num2:"");
//        System.out.println((num1>num2)? num1+">"+num2:"\r");
//        System.out.println((num1>=num2)? num1+">="+num2:"");
//        System.out.println((num1==num2)? num1+"=="+num2:"");
//        System.out.println((num1!=num2)? num1+"!="+num2:"");

        //--------------------------------------------------------------------------------------------------------------------
        //12) Write a Java program to convert seconds to hours, minutes and seconds.

//        System.out.println("Please enter your time in seconds");
//        int seconds= input.nextInt();
//        int minutes=0;
//        int hours=0;
//        minutes=seconds/60;
//        seconds=seconds%60;
//        hours=minutes/60;
//        minutes=minutes%60;
//        System.out.println("The new time is: "+hours+":"+minutes+":"+seconds);

        //--------------------------------------------------------------------------------------------------------------------
        //13) Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise.

//        System.out.println("Please enter 4 numbers to test if they are all equal");
//        System.out.println("First number");
//        int num1= input.nextInt();
//        System.out.println("Second number");
//        int num2 = input.nextInt();
//        System.out.println("Third number");
//        int num3 = input.nextInt();
//        System.out.println("Fourth number");
//        int num4 = input.nextInt();
//
//        if (num1==num2&&num2==num3&&num3==num4){
//            System.out.println("All numbers are equal");
//        }
//        else {
//            System.out.println("All numbers are not equal");
//        }

        //--------------------------------------------------------------------------------------------------------------------
        //14) Write a Java program that reads an integer and check whether it is negative, zero, or
        //positive.

//        System.out.println("Please enter a number to check if it's negative, zero, or positive");
//        int num= input.nextInt();
//
//        if(num>0){
//            System.out.println("Number is positive");
//        } else if (num<0) {
//            System.out.println("Number is negative");
//        }else {
//            System.out.println("Number is zero");
//        }

        //--------------------------------------------------------------------------------------------------------------------
        //15) Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered (End loop use -1 ,
        //Don’t count -1).

//        System.out.println("Please enter numbers and we will count how many positives, negatives, and zeros you entered:");
//        boolean isrun=true;
//        int pos_count=0;
//        int neg_count=0;
//        int zero_count=0;
//        while (isrun){
//            System.out.println("Enter a new number (-1 to exit)");
//            int num = input.nextInt();
//            if (num==-1){
//                isrun=false;
//            } else if (num>0) {
//                pos_count++;
//            } else if (num<-1) {
//                neg_count++;
//            }
//            else {
//                zero_count++;
//            }
//        }
//        System.out.println("The count for your positives numbers are: "+ pos_count);
//        System.out.println("The count for your negative numbers are: "+ neg_count);
//        System.out.println("The count for your zeros are: "+ zero_count);

        //--------------------------------------------------------------------------------------------------------------------
        // 16) Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.

//        System.out.println("Pleas enter a number and we will reverse it:");
//        String num = input.nextLine();
//        StringBuilder my_stringbuilder= new StringBuilder(num);
//        System.out.println("the new numbers are: "+my_stringbuilder.reverse());

        //--------------------------------------------------------------------------------------------------------------------
        // 17) Write a program to enter the numbers till the user wants and at the end the
        //program should display the largest and smallest numbers entered

        System.out.println("Please enter numbers and we will fine the largest and smallest:");
        boolean isrun=true;
        int largest=-1000;
        int smallest =1000;

        while (isrun){
            System.out.println("Enter a new number:");
            int num = input.nextInt();
            if (num>largest){
                largest=num;
            }
            if (num<smallest) {
                smallest=num;
            }
            System.out.println("Do you want to exit: (yes/no)");
            String exit= input.next();
            if (exit.equals("yes")){
                isrun=false;
            }
        }
        System.out.println("The largest number is: "+ largest);
        System.out.println("The smallest number is: "+ smallest);

        //--------------------------------------------------------------------------------------------------------------------
        // 18) Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user.

//        System.out.println("Please enter a sentence:");
//        String sentence= input.nextLine();
//        int count=0;
//        for (int i=0;i<=sentence.length()-1;i++){
//
//            if (sentence.charAt(i)=='a'){
//                count++;
//            }
//        }
//        System.out.println("The number of repeated 'a' in the sentence is: "+count);


    }


}
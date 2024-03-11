package com.scanner.user.ex_1;

import java.util.Scanner;

public class ScannerCheck {

	public static void main(String[] args) {
	// create the scanner class object 
		Scanner sc = new Scanner(System.in);
		
		// read the data from command prompt 
		System.out.println("Enter Seasons");
		int month = sc.nextInt();
		
		//Switch case is used to where multiple options are append then user argument with switch 
   switch (month) {
     case 3 :System.out.println("Your In Summer season");
      case 4 :System.out.println("Your In Summer season");
       case 5 :System.out.println("Your In Summer season");
         case 6 :System.out.println("Your In Summer season");
           break;

      case 7 :System.out.println("Your In Rainy season");
        case 8 :System.out.println("Your In Rainy season");
           case 9 :System.out.println("Your In Rainy season");
               case 10 :System.out.println("Your In Rainy season");
                   break;
         

        case 11 :System.out.println("Your In Winter season");
           case 12 :System.out.println("Your In Winter season");
            case 1:System.out.println("Your In Winter season");
              case 2  :System.out.println("Your In Winter season");
                  break;

      default:System.out.println("Enter Valid Data...");
	   break;
   }
   sc.close();
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainseat;

import java.util.Scanner;

/**
 *
 * @author shubham
 */
public class TrainSeat {

      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //take input of total seats user want to find
        System.out.println("Enter  how many seat number you want to enter");
        int inputnumber = sc.nextInt();
        int SeatNumbers[];
        
        if (inputnumber == 0 || inputnumber > 105)
            System.out.println("Please enter between 1 to 105..."); // validation of Test Cases
        else {
            SeatNumbers = new int[inputnumber];
            for (int i = 0; i < inputnumber; i++) {
                System.out.println("Enter seat number:"); //input of particular seat number
               SeatNumbers[i] = sc.nextInt();
               
                
                if (SeatNumbers[i] == 0 || SeatNumbers[i] > 108) {
                    System.out.println("Please, enter seat no between 1 to 108.."); //validation of seat number
                   return;
                }
            }

            // for loop for seatnumber find the opposite seat number which is either WS , MS or AS
            for (int j = 0; j < SeatNumbers.length; j++) {
                int num = SeatNumbers[j];
                int val = num % 12; // total 12 case  in one lane of train
                switch (val) {
                    case 1:
                        System.out.print(num + 11 + " WS \n");
                        break;
                    case 2:
                        System.out.print(num + 9 + " MS \n");
                        break;
                    case 3:
                        System.out.print(num + 7 + " AS \n");
                        break;
                    case 4:
                        System.out.print(num + 5 + " AS \n");
                        break;
                    case 5:
                        System.out.print(num + 3 + " MS \n");
                        break;
                    case 6:
                        System.out.print(num + 1 + " WS \n");
                        break;
                    case 7:
                        System.out.print(num - 1 + " WS \n");
                        break;
                    case 8:
                        System.out.print(num - 3 + " MS \n");
                        break;
                    case 9:
                        System.out.print(num - 5 + " AS \n");
                        break;
                    case 10:
                        System.out.print(num - 7 + " AS \n");
                        break;
                    case 11:
                        System.out.print(num - 9 + " MS \n");
                        break;
                    case 0:
                        System.out.print(num - 11 + " WS \n");
                        break;
                    default:
                        break;
                }
            }

        }
        System.out.print("\n");
        // print thr value here
    }
    
}

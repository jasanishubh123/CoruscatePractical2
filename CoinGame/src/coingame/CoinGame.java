/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coingame;

import java.util.Scanner;

/**
 *
 * @author shubham
 */
public class CoinGame {

    public static void main(String[] args) {
       
        int nofplayer;
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter Number of Players-");
        nofplayer = sc.nextInt(); // take input of Players
        
        int coincount;
       
        
        System.out.print("Number of Coin Count-");
        coincount=sc.nextInt(); //take input of number of player count
        
        
        if(nofplayer>coincount){
            
            System.err.println("Please Enter Valid Coins"); //if number of Player is greater than coin count- it is not valid 
            return;
        }
        
        int x=coincount%nofplayer;
        if(x!=0){
            System.err.println("Please Enter Suffienciet Coins so divide equally"); // if example number of player are 2 and coins are 5 so taht is not allowed
            return;
        }else{
            
            int arr[]=new int[coincount];
            System.out.println("Enter all the Coins Value:");// take input of coins value
           for(int i=0;i<arr.length;i++){
                System.out.println("value of coin["+(i+1)+"]");
                arr[i] = sc.nextInt();

           }
           
           int winner= decidePlayer(arr, nofplayer); // pass total number of coins value and number of player to User define function
            
        }

   
        
    }
    
    
    // User define function  which is return winner player
    static int decidePlayer(int arr[],int nofplayer){
        int j=0,k=arr.length-1;
        int player[]=new int[nofplayer];    // array of number of players
        
        
        //here we applied loop for count coins value to particular players
        for(int i=0; i!=k+1 ; i++,j++){
            if(j==player.length){
                j=0;
            }
            if(arr[i]>arr[k]){
                player[j]+=arr[i];
            }else{
                player[j]+=arr[k];
                i--;
                k--;
            }
        }
        
        // at the end of above loop we will have array of players where index is player number and value is player coin count
        
        
        // here i find the maximum coins from the players and return number of that player
        int max = 0, playerIndex=0;
        for(int i = 0;i<player.length;i++) {
            if(max < player[i]) {
                max = player[i];
                playerIndex = i;
            }
        }
        
        System.out.println("The Winner is "+(playerIndex+1) + " player and Coin get "+max);
        return playerIndex+1;
    }
    

}

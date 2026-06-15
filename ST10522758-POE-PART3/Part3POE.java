/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part3poe;

/**
 *
 * @author AGOBOKOE DINGAAN ST10522758
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Part3POE {

     public static ArrayList<String> storedSender = new ArrayList<>();
     public static ArrayList<String> storedReciever = new ArrayList<>();
     public static ArrayList<String> storedMessage = new ArrayList<>();
     public static ArrayList<String> MessageID =new ArrayList<>();
     public static ArrayList<String> messageHash =new ArrayList<>();
      public static ArrayList<String> hash =new ArrayList<>();
     
      public static void main(String[] args){
         
     }
       
    public void messageReport(){
     Scanner input = new Scanner(System.in);
       
        System.out.println("Message Report");
        System.out.println("a) Display the sender and recipient of all stored messages");
        System.out.println("a) Display the longest stored message");
        System.out.println("c ) Search for message ID and display the corresponding reciever and message");
        System.out.println("d) Search for all the message using the messages hash");
        System.out.println("e) delete a message using the message hash ");
        System.out.println("f) Display a report that lists the full details of all the stored messages");
        
        int choice = input.nextInt();
       input.nextLine();
        
        switch(choice){
            case 1:
                 break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                return;
            default:
                System.out.println("Invalid Option");
                
        }
        
    }

     //DISPLAY SENDER AND RECIPIENT
    public static void displayRecipient(){
        for (int i = 0; i < storedMessage.size(); i++ ){
            
            System.out.println(
            "Sender: " + storedSender.get(i) +   "| Recipient: " + storedReciever.get(i)
            );
        }
    }  
    
    // DISPLAY LONGEST STORED MESSAGE
    public static void displayLongestMessage(){
        String longest ="";
        for (String message : storedMessage){
         
            if (message.length() > longest.length()){
                longest = message;
            }
        }
        System.out.println("Longest Message:");
        System.out.println(longest);
    }
    
    // SEARCH MESSAGE ID 
    public static void MessageIDsearch(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Message ID: ");
        String ID = input.nextLine();
        
        for( int i = 0; i < MessageID.size(); i++){
            if(MessageID.get(i).equals(ID)){
             System.out.println("Recipient: " + storedReciever.get(i));
             System.out.println("Message: " + storedMessage.get(i));
             
             return;
            }
        }
       System.out.println("Message ID not found."); 
    }
    
    //SEARCH FOR RECIPIENT
    public static void searchRecipient(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Recipient: ");
        String recipient = input.nextLine();
        
        boolean found = false;
        
        for (int i = 0; i < storedReciever.size(); i++){
            if (storedReciever.get(i).equalsIgnoreCase(recipient)){
                System.out.println(storedMessage.get(i));
                found = true;
            }
        }
        if(!found){
            System.out.println("No messages found.");
        }
    }
    
    //DELETING MESSAGES USING HASH
    public static void MessageHashdeleting(){
        Scanner input = new Scanner(System.in);
       
        for(int i = 0; i <messageHash.size(); i++){
          
         if(messageHash.get(i).equals(hash)){
             storedMessage.remove(i);
             storedReciever.remove(i);
             storedSender.remove(i);
             
             MessageID.remove(i);
             messageHash.remove(i);
             
             System.out.println("Message deleted.");
            return; 
         }    
       }
        System.out.println("Hash not found.");
    }
    
    //FULL MESSAGE REPORT
    public static void Report(){
        System.out.println("\nMessage Report");
        for (int i = 0; i < storedMessage.size(); i++){
            System.out.println("--------------");
            System.out.println("Sender: " + storedSender.get(i));
            System.out.println("Recipient: " + storedReciever.get(i));
            System.out.println("Mesage ID: " + messageHash.get(i));
            System.out.println("Message: " + storedMessage.get(i));
        }
    }
    }
 
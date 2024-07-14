package br.com.myproj;


import java.util.Scanner;


public class Bank {

    private String userName;
    private String userSurname;
    private int options;
    private float userMoney;

    Scanner myScan = new Scanner(System.in);

    private void welcome() {
        System.out.println("Hi, welcome to Bank! We are glad that you came.");
    }

    public void userInteraction() {
        userCreation();

        System.out.println("Welcome, " + userName + " " + userSurname);

        System.out.println("\n \n Please, select a service:\n\n");
        System.out.println("Press 1 to show your money current in our bank.\n");
        System.out.println("Press 2 to make a money deposit.\n");
        System.out.println("Press 3 to make a withdraw.\n");
        System.out.println("Press 4 to exit our system.\n");

        System.out.println("Please insert your option");
        options = myScan.nextInt();
        checkNumber(options);

    }

    private void checkNumber(int num)   {
        if(num > 4 || num < 0) {
            System.out.println("Please, insert a valid number");
            userInteraction();
        }else {
            selectOption(num);
        }
    }

    public void selectOption(int option) {

        switch(option) {
            case 1:
                showMoney();
                break;
            case 2:
                depositMoney();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                exit();
                break;
        }

    }

    private void depositMoney() {
        float depositedValue;



        System.out.println("Please, inform the value you want to deposit");
        depositedValue = myScan.nextFloat();
        userMoney = userMoney + depositedValue;

        System.out.println("\n" + userMoney);
    }

    private void withdraw() {
        float withdrawValue;



        System.out.println("Please, inform the value you want to withdraw");
        withdrawValue = myScan.nextFloat();
        userMoney = userMoney - withdrawValue;

        System.out.println("\n" + userMoney);
    }

    private void exit() {
        System.out.println("Thanks for using our system. Come back soon! ");
    }

    private void showMoney() {

        System.out.println("You have:\t" + userMoney);
    }

    private void userCreation() {



        welcome();

        System.out.println("Please, can you give us your name and age? \n");
        System.out.println("Name: \t");

        this.userName =  myScan.nextLine();

        System.out.println("Age: \t");
        this.userSurname = myScan.nextLine();

        System.out.println("\n We are pleased to meet you, " +  this.userName + " " + this.userSurname);



    }


}



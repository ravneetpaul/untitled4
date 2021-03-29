package com.ravneet;

        import java.util.Scanner;

public class assignment7 {
    public static void main(String[] args){
        String user[] = {"ravneet ", "veerpal", "inder", "davinder"};
        String usercredentils[] = {"rk", "vk", "is", "ds"};
        Scanner scanner = new Scanner(System.in);
        account obj1 = new account();
        String password;
        int option;

        for (int i=0; i<user.length; i++){
            System.out.println("Enter Credentials for user " + user[i]);
            password = scanner.next();
            if(password.equals(usercredentils[i])) {
                boolean blnContinue = true;
                while(blnContinue != false)
                {
                    System.out.println("press 1 for withdrawal");
                    System.out.println("press 2 for deposit");
                    System.out.println("press 3 to view balance");
                    option = scanner.nextInt();
                    double amount;
                    switch (option){
                        case 1:
                            System.out.println("Enter the Amount you to withdraw:");
                            amount = scanner.nextDouble();
                            obj1.withdrawal(amount);
                            break;
                        case 2:
                            System.out.println("Enter the Amount you to deposit:");
                            amount = scanner.nextDouble();
                            obj1.deposit(amount);
                            break;
                        case 3:
                            double balance;
                            balance = obj1.getBalance();
                            System.out.println("Balance : " +balance);
                            break;
                        default:
                            System.out.println("Please select form the given option");
                            break;
                    }
                    System.out.println("do you want to continue banking for " + user[i]+ "? yes or no");
                    String result = scanner.next();
                    if (result.equals("yes")){
                        blnContinue = true;
                    } else {
                        blnContinue = false;
                    }
                }
            } else {
                System.out.println("Invalid user password");
            }
        }
    }
}

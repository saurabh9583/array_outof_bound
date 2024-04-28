import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Bank_AccountManagement[] bankAccountManagements = new Bank_AccountManagement[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bank_Account_Number as below\n");
        try {
            for (int i = 0; i < 2; i++) {
                Bank_AccountManagement bankAccountManagement = new Bank_AccountManagement();
                System.out.println("Enter the Account Number carefully:-  ");
                bankAccountManagement.setAccount_number(sc.nextInt());

                System.out.println("Enter the Account Holder Name:-  ");
                bankAccountManagement.setAccountHolderName(sc.next());

                System.out.println("Enter the Account Balance:-  ");
                bankAccountManagement.setBalance(sc.nextDouble());
                bankAccountManagements[i] = bankAccountManagement;
            }
        } catch (NullPointerException e)
        {
            System.out.println(bankAccountManagements[1].toString());
        }
        System.out.println("-----------------------Showing the Bank_Account_Management Details------------------------");
        for (int i = 0; i < 2; i++) {
            System.out.println(bankAccountManagements[i]);
  }

}

}


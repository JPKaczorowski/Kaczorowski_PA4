public class Application {


    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setBalance(2000.00);
        saver2.setBalance(3000.00);

        saver1.modifyInterestRate(0.04);
        saver2.modifyInterestRate(0.04);


        System.out.println("Initial balance: ");
        System.out.printf("Saver 1: $%.2f", saver1.getBalance());
        System.out.printf("    Saver 2: $%.2f", saver2.getBalance());
        System.out.println("");
        System.out.println("");

        for (int i = 1; i<13; i++) {
            saver1.setBalance(saver1.getBalance() + saver1.calculateMonthlyInterest());
            saver2.setBalance(saver2.getBalance() + saver2.calculateMonthlyInterest());
            System.out.println("Month " + i + " balance: ");
            System.out.printf("Saver 1: $%.2f", saver1.getBalance());
            System.out.printf("    Saver 2: $%.2f", saver2.getBalance());
            System.out.println("");
            System.out.println("");
        }

        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        saver1.setBalance(saver1.getBalance() + saver1.calculateMonthlyInterest());
        saver2.setBalance(saver2.getBalance() + saver2.calculateMonthlyInterest());
        System.out.println("Month " + 13 + " balance: ");
        System.out.printf("Saver 1: $%.2f", saver1.getBalance());
        System.out.printf("    Saver 2: $%.2f", saver2.getBalance());












    }
}

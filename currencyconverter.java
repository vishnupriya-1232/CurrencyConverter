import java. util.Scanner;
public class currencyconverter {
    public static void main(String[] args) {
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        switch (choice) {
            case 1:
                convertRupee(amount);
                break;
            case 2:
                convertDollar(amount);
                break;
            case 3:
                convertEuro(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

public static void convertRupee(double amt) {
    System.out.println("1 Ruppe = " + 0.013 + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + (amt*0.013) + " Dollar");
    System.out.println();

    System.out.println("1 Ruppe = " + 0.012 + " Euro");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.012) + " Euro");
    System.out.println();

}
public static void convertDollar(double amt) {
    System.out.println("1 Dollar = " + 79.37 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
    System.out.println();

    System.out.println("1 Dollar= " + 0.98 + " Euro");
    System.out.println();

    System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
}

    

public static void convertEuro(double amt){
    System.out.println("1 Euro = " + 80.85 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");
    System.out.println();

    System.out.println("1 Euro = " + 1.02 + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
}
}

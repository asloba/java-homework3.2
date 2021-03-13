public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int deposit;
        deposit = 1100;
        int totalBonus;
        if (deposit >= 1000) {
            totalBonus = deposit / 100;
        } else {
            totalBonus = 0;
        }
        int totalBalance = startBalance + deposit + totalBonus;
        System.out.println("Your total bonus: " + totalBonus);
        System.out.println("Your total balance: " + totalBalance);
    }
}

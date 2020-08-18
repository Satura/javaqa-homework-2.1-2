public class Main {
    public static void main(String[] args) {
        int balance = 15;
        int refillSum = 1150;
        int bonus = 0;

        if (refillSum > 1000)
            bonus = refillSum / 100;
        balance += refillSum+bonus;

        System.out.println("Начислено бонусов: " + bonus);

    }
}

import java.util.Scanner;

class FooodOrders {

    int orderAmount;
    int discount;

    int calculateTotal() {
        return orderAmount;
    }
}

class ZomatiGoldOrder extends FooodOrders {

    @Override
    int calculateTotal() {

        // Parent class ka calculateTotal() call
        int amount = super.calculateTotal();

        // 10% discount
        discount = amount * 10 / 100;

        int finalPrice = amount - discount;

        System.out.println("Order amount is: " + amount);
        System.out.println("10% discount is: " + discount);
        System.out.println("Final price is: " + finalPrice);

        return finalPrice;
    }
}

public class Session9Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an order amount:");
        int orderAmount = sc.nextInt();

        ZomatiGoldOrder z = new ZomatiGoldOrder();

        // Input ko object ke orderAmount me store karna
        z.orderAmount = orderAmount;

        // Overridden method call
        z.calculateTotal();

        sc.close();
    }
}
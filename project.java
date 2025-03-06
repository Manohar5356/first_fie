class LaptopPurchase {
    public static void main(String[] args) {
        double price = 35000.0;
        double discount = 10.0;
        double tax = 8.0;
        boolean warrantyChoice = true;
        boolean emiChoice = true;
        boolean cashPayment = false; // New option for cash payment
        int emiMonths = 12;

        double discountAmount = price * (discount / 100);
        double discountedPrice = price - discountAmount;
        double taxAmount = discountedPrice * (tax / 100);
        double finalPrice = discountedPrice + taxAmount;

        double warrantyCost = 0;
        if (warrantyChoice) {
            warrantyCost = 0.05 * price; // 5% of original price
            finalPrice += warrantyCost;
        }

        System.out.println("\nLaptop Purchase Summary:");
        System.out.println("Original Price: " + price);
        System.out.println("Discount Applied: -" + discountAmount);
        System.out.println("Tax Applied: +" + taxAmount);
        System.out.println("Warranty Cost: +" + warrantyCost);
        System.out.println("_______________________________");
        System.out.println("Total Price: " + finalPrice);

        if (cashPayment) {
            System.out.println("Payment Mode: Cash");
            System.out.println("Amount Paid: " + finalPrice);
        } else if (emiChoice) {
            float emi = (float)(finalPrice / emiMonths);
            System.out.println("Payment Mode: EMI");
            System.out.println("EMI per month for " + emiMonths + " months: " + emi);
        }
    }
}
public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int paymentOnALoanForAYear = (int) service.calculate(1);
        System.out.println("Ежемесячный платеж при кредите на 1 год:" + paymentOnALoanForAYear);

        int paymentFor2Years = (int) service.calculate(2);
        System.out.println("Ежемесячный платеж при кредите на 2 года:" + paymentFor2Years);

        int paymentFor3Years = (int) service.calculate(3);
        System.out.println("Ежемесячный платеж при кредите на 3 года:" + paymentFor3Years);
    }
}

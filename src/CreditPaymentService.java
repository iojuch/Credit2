public class CreditPaymentService {

    public double calculate(double loanDuration) {
        int loanAmount = 1_000_000;
        double interestOnTheLoan = 9.99;
        double monthlyRate = interestOnTheLoan / 100 / 12;
        double numberOfPayment = loanDuration * 12;
        double pow = Math.pow((1 + monthlyRate), numberOfPayment);
        double monthlyPayment = loanAmount * (monthlyRate + monthlyRate / (pow -1));
        return monthlyPayment;
    }
}

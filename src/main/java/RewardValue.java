public class RewardValue {
    private double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor accepting a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor accepting a value in miles
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // Convert to miles
    private static  int convertToMiles(double cashValue){
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
    // Convert to cash
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Getter for the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for the miles value
    public int getMilesValue() {
        return convertToMiles((this.cashValue));
    }
}

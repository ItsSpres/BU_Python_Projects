/*
 Ian Spresney
 CSD320
 Assignment Module 8

 Sources:

 */

public class CostAuto {

    private static final double standardServiceCharge = 100.0;
    private static final double oilChangeFee = 30.0;
    private static final double tireRotationCharge = 20.0;

    // Method to calculate the yearly service cost without any additional services
    public static double yearlyService() {
        return standardServiceCharge;
    }

    // Method to calculate the yearly service cost with an added oil change fee
    public static double yearlyService(double oilChangeFee) {
        return standardServiceCharge + oilChangeFee;
    }

    // Method to calculate the yearly service cost with added oil change and tire rotation fees
    public static double yearlyService(double oilChangeFee, double tireRotationCharge) {
        return standardServiceCharge + oilChangeFee + tireRotationCharge;
    }

    // Method to calculate the yearly service cost with added oil change, tire rotation, and coupon deductions
    public static double yearlyService(double oilChangeFee, double tireRotationCharge, double couponAmount) {
        double totalCost = standardServiceCharge + oilChangeFee + tireRotationCharge;
        return Math.max(0, totalCost - couponAmount); // Ensure the total cost is not negative
    }

    // Main method to test each of the yearlyService methods
    public static void main(String[] args) {
        
        //--------------- TEST #1 -------------
        System.out.println("Test Case 1:");
        System.out.println("Standard Service Charge: $" + yearlyService());
        System.out.println();

        //--------------- TEST #2 -------------
        System.out.println("Test Case 2:");
        System.out.println("Service Charge with Oil Change: $" + yearlyService(oilChangeFee));
        System.out.println("Service Charge with Oil Change and Tire Rotation: $" +
                yearlyService(oilChangeFee, tireRotationCharge));
        System.out.println("Service Charge with Oil Change, Tire Rotation, and Coupon Deduction: $" +
                yearlyService(oilChangeFee, tireRotationCharge, 25.0));
    }
}


package Date_1809.entities;

import java.util.InputMismatchException;

public class BMI {
    protected double weight, height;

    public BMI() {
    }

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public static double calculateBMI(double weight, double height) {
        double bmi = 0;
        if (weight > 0 && height > 0) {
            bmi = weight / Math.pow(height, 2);
        }
        return bmi;
    }

    private static boolean hasLetter (String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean validate(String input) throws InputMismatchException, NullPointerException {
        if (input == null) {
            throw new NullPointerException("Input data can NOT be NULL!");
        } else if (hasLetter(input)) {
            throw new InputMismatchException("Input data can NOT has LETTER!");
        } else if (input.equals("")) {
            throw new InputMismatchException("Input data can NOT be EMPTY!");
        }

        Double doubleNumber = Double.parseDouble(input);
        if(doubleNumber <= 0){
            throw new InputMismatchException("Input data can NOT be NEGATIVE!");
        }
        return true;
    }


}


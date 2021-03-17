package project;

public class FizzBuzzQix {
    public String interpret(int numberToInterpret) {
        String output = "";
        if (isFizzNumber(numberToInterpret)) {
            output += "Fizz";
        }
        if (isBuzzNumber(numberToInterpret)) {
            output += "Buzz";
        }
        if (isQixNumber(numberToInterpret)) {
            output += "Qix";
        }
        if (output.isEmpty()) {
            output += numberToInterpret;
        }
        return output;
    }

    public boolean isFizzNumber(int numberToInterpret) {
        return numberToInterpret % 3 == 0;
    }
    public boolean isBuzzNumber(int numberToInterpret) {
        return numberToInterpret % 5 == 0;
    }
    public boolean isQixNumber(int numberToInterpret) {
        return numberToInterpret % 7 == 0;
    }
}

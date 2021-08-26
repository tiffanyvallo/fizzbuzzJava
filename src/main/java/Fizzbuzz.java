public class Fizzbuzz {

    public String fizzbuzz(Integer upTo) {
        String result = "";
        for (int i = 1; i <= upTo; i++) {
            if (i == 1) {
                result = play(i);
            } else {
                result += ", " + play(i);
            }
        }
        return result;
    }

    public static String play(Integer number){
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return number.toString();
        }
    }
}
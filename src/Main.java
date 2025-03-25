public class Main {
    public static void main(String[] args) {

        int[] num = {3, 5};
        String[] word = {"Fizz", "Buzz"};
        int start = 1;
        int end = 100;

        for (int i = start; i <= end; i++) {
            String answer = "";


            for (int j = 0; j < num.length; j++) {
                if (i % num[j] == 0) {
                    answer = answer + word[j];
                }
            }

            if (answer.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(answer);
            }
        }
    }
}
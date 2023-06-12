import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber = 77; // プログラマによって設定された数
        int maxGuesses = 5; // ユーザが数を入力できる最大回数
        int guessesTaken = 0; // ユーザが現在までに入力した回数
        boolean isGuessCorrect = false; // 当たりの数が予想されたかどうかを示すフラグ

        Scanner scanner = new Scanner(System.in);

        System.out.println("数当てゲームを開始します！");
        System.out.println("2桁の正の整数を予想して入力してください（1回あたりの入力回数制限: 5回）");

        while (guessesTaken < maxGuesses) {
            System.out.print("予想した数を入力してください: ");
            int userGuess = scanner.nextInt();
            if (userGuess < 0 || userGuess >=100) {
                System.out.println("0～99までの値を入力してください。");
                continue;
            }
            guessesTaken++;

            if (userGuess == targetNumber) {
                isGuessCorrect = true;
                break;
            } else if (userGuess > targetNumber) {
                System.out.println("入力した数は設定された数より大きいです。");
            } else {
                System.out.println("入力した数は設定された数より小さいです。");
            }

            if (Math.abs(userGuess - targetNumber) >= 20) {
                System.out.println("設定された数から20以上の差があります。");
            }
        }

        if (isGuessCorrect) {
            System.out.println("当たり！おめでとうございます！");
        } else {
            System.out.println("残念！正解は " + targetNumber + " でした。");
        }

        scanner.close();
    }
}






package ex;

import java.util.Scanner;

/**
 * Loginを実行するクラス
 */
public class Login {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // idを取得
        System.out.print("IDを入力してください : ");
        final String id = scanner.nextLine();

        // パスワードを取得
        System.out.print("パスワードを入力してください : ");
        final String password = scanner.nextLine();

        // Admin用アカウントにログインできるかチェック
        AccountAdmin accountAdmin = new AccountAdmin();
        if (accountAdmin.loginCheck(id, password) == true) {
            System.out.println("ログインできました！");
        } else {
            System.out.println("ログインできませんでした。");
        }
    }
}

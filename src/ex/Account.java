package ex;

/**
 * アカウント情報クラス
 */
public class Account {
    private String id;  // ログイン用id
    private String password;    // ログイン用password

    /**
     * コンストラクタ
     * ※引数なしは許さない
     * メンバ変数に値をセットする
     *
     * @param id       ログインid
     * @param password ログインpassword
     */
    public Account(final String id, final String password) {
        this.id = id;
        this.password = password;
    }

    /**
     * メンバ変数idの値を返す
     *
     * @return idの値
     */
    public String getId() {
        return id;
    }

    /**
     * メンバ変数passwordの値を返す
     *
     * @return passwordの値
     */
    public String getPassword() {
        return password;
    }
}

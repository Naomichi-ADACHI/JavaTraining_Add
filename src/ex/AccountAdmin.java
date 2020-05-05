package ex;

/**
 * Adminアカウントクラス
 */
public class AccountAdmin {
    private static final String id = "embexEduU";  // Admin用ID
    private static final String password = "embexEduP";    // Admin用Password

    /**
     * 引数のid, passwordがAdmin用（メンバ変数）のid, passwordと一致しているか判定する
     *
     * @param id       判定対象id
     * @param password 判定対象password
     * @return id, passwordがどちらも完全に一致したらTrue、それ以外はFalse
     */
    static protected boolean loginCheck(String id, String password) {
        if (id.equals(AccountAdmin.id)) {
            if (password.equals(AccountAdmin.password)) {
                // id, passwordがどちらも一致したときのみtrueを返す
                return true;
            }
        }
        return false;
    }
}

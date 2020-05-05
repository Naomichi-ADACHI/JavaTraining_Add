package ex;

import java.util.ArrayList;
import java.util.List;

/**
 * Adminアカウントクラス
 */
public class AccountAdmin {
    private List<Account> accList = new ArrayList<>();  // ログインできるアカウントを保持するList

    /**
     * コンストラクタ
     * ログインできるアカウントをListに追加する
     */
    public AccountAdmin() {
        accList.add(new Account("YAMADA", "yamada"));
        accList.add(new Account("SATO", "sato"));
        accList.add(new Account("KOIKE", "koike"));
    }

    /**
     * 引数のid, passwordがログインできるアカウント一覧(accList)ののid, passwordと一致しているか判定する
     *
     * @param id       判定対象id
     * @param password 判定対象password
     * @return id, passwordがどちらも完全に一致したらTrue、それ以外はFalse
     */
    protected boolean loginCheck(String id, String password) {
        for (Account account :
                accList) {
            if (id.equals(account.getId())) {
                if (password.equals(account.getPassword())) {
                    // id, passwordがどちらも一致したときのみtrueを返す
                    return true;
                }
            }
        }
        return false;
    }
}

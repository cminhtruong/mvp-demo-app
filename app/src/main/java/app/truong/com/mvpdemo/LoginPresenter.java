package app.truong.com.mvpdemo;

/**
 * Created by ctruong on 12/03/2018.
 */

public interface LoginPresenter {
    void validAccount(String username, String password);

    void onDestroy();
}

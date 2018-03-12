package app.truong.com.mvpdemo;

/**
 * Created by ctruong on 12/03/2018.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}

package app.truong.com.mvpdemo;

/**
 * Created by ctruong on 12/03/2018.
 */

public interface LoginInteractor {
    interface OnLoginFinishListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishListener listener);

}

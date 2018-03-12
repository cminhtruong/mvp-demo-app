package app.truong.com.mvpdemo;

import java.util.List;

/**
 * Created by ctruong on 12/03/2018.
 */

public interface DetailView {
    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessages(String message);
}

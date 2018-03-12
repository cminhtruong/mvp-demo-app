package app.truong.com.mvpdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements LoginView {

    private ProgressBar progressBar;
    private EditText login, password;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progress);
        login = findViewById(R.id.username);
        password = findViewById(R.id.password);
        presenter = new LoginPresenterImpl(this, new LoginInteractorImpl());
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        login.setError(getString(R.string.loginError));
    }

    @Override
    public void setPasswordError() {
        password.setError(getString(R.string.passwordError));
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, DetailActivity.class));
        finish();
    }


    public void Login(View view) {
        presenter.validAccount(login.getText().toString(), password.getText().toString());
    }
}

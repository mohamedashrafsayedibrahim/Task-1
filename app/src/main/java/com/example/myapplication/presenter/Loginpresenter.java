package com.example.myapplication.presenter;

import com.example.myapplication.Model.User;
import com.example.myapplication.view.ILoginView;

public class Loginpresenter implements ILoginPresenter{

    ILoginView loginView;

    public Loginpresenter(ILoginView loginView){

        this.loginView=loginView;
    }
    @Override
    public void onLogin(String email, String password) {
     User user =new User ();
     boolean isLoginSuccess = user.isValidData();

     if(isLoginSuccess)
         loginView.onLoginResult("Login Success");
     else
         loginView.onLoginResult("Login Error");
    }
}

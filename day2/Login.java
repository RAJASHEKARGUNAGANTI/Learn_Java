package com.company.Learn_Java.day2;

interface LoginUI {
    abstract void submit(String userName, String pass);
    abstract void forgotPass();

}
class LoginPage implements LoginUI {
    String userName = "Raja";
    String pass = "123";
    @Override
    public void submit(String userName, String pass) {
        if(this.userName.equals(userName) && this.pass.equals(pass)){
            System.out.println("Login Successsfull");
        }
        else {
            System.out.println("Login failed..!");
        }
    }

    @Override
    public void forgotPass() {

    }
}
class TestUI{
    public static void main(String[] args) {
        LoginPage l = new LoginPage();
        l.submit("Raja", "123");
        l.submit("dfdg","dfgg");
    }
}

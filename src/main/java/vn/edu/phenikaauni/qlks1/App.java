
package vn.edu.phenikaauni.qlks1;

import vn.edu.phenikaauni.qlks1.ViewAndController.LoginView;


public class App {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView();
            }
        });
    }
}

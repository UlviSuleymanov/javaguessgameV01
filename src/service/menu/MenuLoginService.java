package service.menu;

import bean.Config;
import service.menu.inter.MenuLoginInterface;
import service.menu.inter.MenuService;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginInterface {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("username:");
        String username = sc.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("password:");
        String password = sc2.nextLine();
        if (!(username.equals("Ulvi") && password.equals("12345"))) {
            throw new IllegalArgumentException("User or password is invalid");
        }
        Config.setLoggedIn(true);
    }


}


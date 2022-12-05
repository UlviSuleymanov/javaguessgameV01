package service.menu;

import bean.Config;
import bean.User;
import service.menu.inter.MenuAddUserServiceInter;

import java.util.Scanner;

public class MenuAddUserService implements MenuAddUserServiceInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's participants name?");
        String name = sc.nextLine();
        System.out.println("What's participants surname?");
        Scanner sc2 = new Scanner(System.in);
        String surname=sc2.nextLine();
        User user = new User();
        user.setUserName(name);
        user.setSurname(surname);
        Config.getInstance().appendUser(user);
    }
}

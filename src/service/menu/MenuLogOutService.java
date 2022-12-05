package service.menu;

import service.menu.inter.MenuLogOutInter;

public class MenuLogOutService implements MenuLogOutInter {
    @Override
    public void process() {
        System.out.println("Logged out");
    }
}

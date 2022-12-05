package service.menu;

import service.menu.inter.MenuRegisterInterface;
import service.menu.inter.MenuService;

public class MenuRegisterService implements MenuRegisterInterface  {
    @Override
    public void process() {
        System.out.println("Register");
    }
}

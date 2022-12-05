package service.menu;

import service.menu.inter.MenuExitInter;

public class MenuExitService implements MenuExitInter {
    @Override
    public void process() {
        System.out.println("Quiting");
    }
}

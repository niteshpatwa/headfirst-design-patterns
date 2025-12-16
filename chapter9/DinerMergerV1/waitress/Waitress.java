package DinerMergerV1.waitress;

import java.util.List;

import DinerMergerV1.menus.DinerMenu;
import DinerMergerV1.menus.MenuItem;
import DinerMergerV1.menus.PancakeHouseMenu;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n----------------------\nBREAKFAST");
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            printMenu(breakfastItems.get(i));
        }

        System.out.println("\nLUNCH");
        MenuItem[] lunchItems = dinerMenu.getMenuItems();
        for (int i = 0; i < lunchItems.length; i++) {
            printMenu(lunchItems[i]);
        }
    }

    private void printMenu(MenuItem item) {
        System.out.println(item.getName() + ", " + item.getPrice() + " -- " + item.getDescription());
    }
}

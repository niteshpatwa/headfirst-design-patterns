package DinerMergerV3;

import DinerMergerV3.menus.DinerMenu;
import DinerMergerV3.menus.PancakeHouseMenu;
import DinerMergerV3.waitress.Waitress;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}

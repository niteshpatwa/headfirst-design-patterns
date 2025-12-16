package DinerMergerV2;

import DinerMergerV2.menus.DinerMenu;
import DinerMergerV2.menus.PancakeHouseMenu;
import DinerMergerV2.waitress.Waitress;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}

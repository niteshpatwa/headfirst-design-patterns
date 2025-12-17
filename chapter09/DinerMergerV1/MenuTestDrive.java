package DinerMergerV1;

import DinerMergerV1.menus.DinerMenu;
import DinerMergerV1.menus.PancakeHouseMenu;
import DinerMergerV1.waitress.Waitress;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}

package DinerMergerV4;

import DinerMergerV4.menus.CafeMenu;
import DinerMergerV4.menus.DinerMenu;
import DinerMergerV4.menus.PancakeHouseMenu;
import DinerMergerV4.waitress.Waitress;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}

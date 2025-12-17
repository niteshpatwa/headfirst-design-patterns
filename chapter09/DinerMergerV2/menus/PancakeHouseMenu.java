package DinerMergerV2.menus;

import java.util.ArrayList;
import java.util.List;

import DinerMergerV2.iterators.Iterator;
import DinerMergerV2.iterators.PancakeHouseMenuIterator;

public class PancakeHouseMenu {
    private List<MenuItem> items;

    public PancakeHouseMenu() {
        items = new ArrayList<MenuItem>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        items.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(items);
    }
}

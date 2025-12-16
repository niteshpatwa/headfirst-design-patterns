package DinerMergerV2.iterators;

import java.util.List;

import DinerMergerV2.menus.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {
    private List<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.size();
    }

    public MenuItem next() {
        return items.get(position++);
    }
}

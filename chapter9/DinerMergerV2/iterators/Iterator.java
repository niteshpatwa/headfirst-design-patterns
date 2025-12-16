package DinerMergerV2.iterators;

import DinerMergerV2.menus.MenuItem;

public interface Iterator {
    boolean hasNext();

    MenuItem next();
}

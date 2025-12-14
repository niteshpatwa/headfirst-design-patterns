package Lists;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {
    private String[] elements;

    public MyStringList(String[] elements) {
        this.elements = elements;
    }

    public String get(int index) {
        return elements[index];
    }

    public int size() {
        return elements.length;
    }

    public String set(int index, String element) {
        String oldValue = elements[index];
        elements[index] = element;
        return oldValue;
    }
}

package xyz.prgrm.paste.models;

import java.util.List;
import java.util.ArrayList;

public class GenericDS<ListType> {
    private int dsSize;
    private List<ListType> dataStore;
    private static final int BOTTOM_INDEX = 0;

    public GenericDS() {
        dataStore = new ArrayList<ListType>();
        // TODO Load from file if data exists
    }

    public boolean insertTop(ListType data) {
        this.dataStore.add(data);
        int size = this.dataStore.size();
        // Removing Overflow than the maximum size allowed
        if (size > dsSize) {
            this.dataStore.remove(GenericDS.BOTTOM_INDEX);
        }
        // TODO Save to file
        return true;
    }

    public boolean insertBottom(ListType data) {
        this.dataStore.add(GenericDS.BOTTOM_INDEX, data);
        int size = this.dataStore.size();
        int topIndex = size - 1;
        // Removing Overflow than the maximum size allowed
        if (size > dsSize) {
            this.dataStore.remove(topIndex);
        }
        // TODO Save to file
        return true;
    }

    public ListType popTop() {
        int topIndex = this.dataStore.size() - 1;
        if (topIndex < 0) {
            return null;
        }
        ListType data = this.dataStore.get(topIndex);
        this.dataStore.remove(topIndex);
        // TODO save to file
        return data;
    }

    public ListType popBottom() {
        int size = this.dataStore.size();
        if (size == 0) {
            return null;
        }
        ListType data = this.dataStore.get(GenericDS.BOTTOM_INDEX);
        this.dataStore.remove(GenericDS.BOTTOM_INDEX);
        // TODO save to file
        return data;
    }
}

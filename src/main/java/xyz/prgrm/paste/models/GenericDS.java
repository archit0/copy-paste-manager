package xyz.prgrm.paste.models;

import xyz.prgrm.paste.enums.DataStrutureType;

import java.util.List;
import java.util.ArrayList;

public class GenericDS<ListType> {
    private List<ListType> dataStore;
    private static final int BOTTOM_INDEX = 0;

    public GenericDS() {
        dataStore = new ArrayList<ListType>();
        this.load();
        // TODO fix loading size
    }

    private void load() {
        // TODO loading from file
    }

    private void save() {
        // TODO writing to file
    }

    public List<ListType> list() {
        return this.dataStore;
    }

    public boolean insert(ListType data) {
        int dsSize = ModeConfiguration.getDsSize();
        int storeSize = this.dataStore.size();
        boolean sameAllowed = ModeConfiguration.isAllowDuplicated();

        ListType lastData = storeSize == 0 ? null : this.dataStore.get(storeSize - 1);
        boolean same = lastData.equals(data);
        if (!lastData.equals(data) || sameAllowed) {
            int size = this.dataStore.size();
            // Removing Overflow than the maximum size allowed
            if (size > dsSize) {
                this.dataStore.remove(GenericDS.BOTTOM_INDEX);
            }
            this.save();
            return true;
        }

        return false;
    }

    public ListType pop(int index) {
        ListType data = null;
        try {
            data = this.dataStore.get(index);
            this.dataStore.remove(index);
            this.save();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return data;
    }

    public ListType pop() {
        int popIndex = -1;
        if (ModeConfiguration.getDataStrutureType() == DataStrutureType.STACK) {
            popIndex = this.dataStore.size() - 1;
        } else if (ModeConfiguration.getDataStrutureType() == DataStrutureType.QUEUE) {
            popIndex = GenericDS.BOTTOM_INDEX;
        }
        if (popIndex != -1) {
            return this.pop(popIndex);
        }
        return null;
    }

}

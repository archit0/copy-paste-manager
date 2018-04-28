package xyz.prgrm.paste.models;

import xyz.prgrm.paste.DefaultConfiguration;
import xyz.prgrm.paste.enums.DataStrutureType;

public class ModeConfiguration {

    private static boolean pasteTracker;
    private static DataStrutureType dataStrutureType;
    private static boolean allowDuplicated;
    private static int dsSize;

    static {
        pasteTracker = DefaultConfiguration.DEFAULT_PASTE_TRACKER;
        dataStrutureType = DefaultConfiguration.DEFAULT_DS;
        allowDuplicated = DefaultConfiguration.DEFAULT_ALLOW_DUPLICATED;
        dsSize = DefaultConfiguration.DEFAULT_DS_SIZE;
    }

    public static void load(String sessionId) {

    }

    public static boolean isPasteTracker() {
        return pasteTracker;
    }

    public static void setPasteTracker(boolean pasteTracker) {
        ModeConfiguration.pasteTracker = pasteTracker;
        // TODO: Save the config to file
    }

    public static DataStrutureType getDataStrutureType() {
        return dataStrutureType;
    }

    public static void setDataStrutureType(DataStrutureType dataStrutureType) {
        ModeConfiguration.dataStrutureType = dataStrutureType;
        // TODO: Save the config to file
    }

    public static boolean isAllowDuplicated() {
        return allowDuplicated;
    }

    public static void setAllowDuplicated(boolean allowDuplicated) {
        ModeConfiguration.allowDuplicated = allowDuplicated;
        // TODO: Save the config to file
    }

    public static int getDsSize() {
        return dsSize;
    }

    public static void setDsSize(int dsSize) {
        ModeConfiguration.dsSize = dsSize;
        // TODO: Save the config to file
    }


}

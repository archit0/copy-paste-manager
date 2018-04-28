package xyz.prgrm.paste.models;

import xyz.prgrm.paste.DefaultConfiguration;
import xyz.prgrm.paste.enums.DataStrutureType;

public class ModeConfiguration {

    private boolean keyLogging;
    private DataStrutureType dataStrutureType;
    private boolean allowDuplicated;
    private int dsSize;

    public ModeConfiguration() {
        // TODO: Load from Storage and set the value
        keyLogging = DefaultConfiguration.DEFAULT_KEY_LOGGING;
        dataStrutureType = DefaultConfiguration.DEFAULT_DS;
        allowDuplicated = DefaultConfiguration.DEFAULT_ALLOW_DUPLICATED;
        dsSize = DefaultConfiguration.DEFAULT_DS_SIZE;
    }

    public boolean isKeyLogging() {
        return keyLogging;
    }

    public void setKeyLogging(boolean keyLogging) {
        this.keyLogging = keyLogging;
        // TODO: Save the config to file
    }

    public DataStrutureType getDataStrutureType() {
        return dataStrutureType;
    }

    public void setDataStrutureType(DataStrutureType dataStrutureType) {
        this.dataStrutureType = dataStrutureType;
        // TODO: Save the config to file
    }

    public boolean isAllowDuplicated() {
        return allowDuplicated;
    }

    public void setAllowDuplicated(boolean allowDuplicated) {
        this.allowDuplicated = allowDuplicated;
        // TODO: Save the config to file
    }

    public int getDsSize() {
        return dsSize;
    }

    public void setDsSize(int dsSize) {
        this.dsSize = dsSize;
        // TODO: Save the config to file
    }


}

package org.launchcode.studio7;

public abstract class BaseDisc {
    private int storageCapacity;
    private String discName;
    private String contents;
    private String discType;

    public BaseDisc(){}

    public BaseDisc(int storageCapacity, String name, String contents, String discType){
        this.storageCapacity = storageCapacity;
        this.discName = name;
        this.contents = contents;
        this.discType = discType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}

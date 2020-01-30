package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    public CD (int storageCapacity, String name, String contents, String discType){
        super(storageCapacity,name,contents,discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins ata rate of 200-500 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println("Some CDs, such as CD-Rs, are a blank canvas for your mixtape.");
    }

    @Override
    public void readData() {
        System.out.println("A red laser scans through the tiny grooves looking for bits. You find some.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}

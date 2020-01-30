package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD (int storageCapacity, String name, String contents, String discType){
        super(storageCapacity,name,contents,discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 RPM");
    }

    @Override
    public void writeData() {
        System.out.println("You can store files and embarrassing home videos on a DVD.");
    }

    @Override
    public void readData() {
        System.out.println("Shorter wavelength lasers bounce off, scattering mad data, yo.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}

package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        BaseDisc myCd = new CD(100,"RHCP","the greatest hits of the chili peppers","CD");
        BaseDisc myDvd = new DVD(800,"My PRIVATE files", "none yo beeswax", "DVD-RW");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(myCd.getDiscName() + " is a treasured part of my collection. I couldn't live without " + myCd.getContents() + ".");
        System.out.println(myDvd.getDiscName() + " contains many things, including '" + myDvd.getContents() + "'.");

    }
}

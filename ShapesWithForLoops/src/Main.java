public class Main {

    public static void main(String[] args) {

        LoopShapes a = new LoopShapes();

        a.printBaum(6);
        a.printBaumKugeln(6);
        LoopShapes.printBaumKerzen(6);

        a.printDreieck1(6);
        a.printDreieck2(6);
        a.printDreieck3(6);
        a.printDreieck4(6);

        a.printFrameV1(6);
        a.printFrameV3(6);
        a.printFrameV2(6);

        a.printFilledX(6);

        a.printRahmen(6);
        a.printRahmen(6,12);
        a.printRahmenX(6);
        a.printRahmenX2(6);
        a.printRahmenSlash(6);
        a.printRahmenPLUE2(6);

        a.printEck1(6);
        LoopShapes.printBlock3(6,7);
        a.printEck2(6);

        a.printBlock1(6);
        a.printBlock2(6);
    }
}

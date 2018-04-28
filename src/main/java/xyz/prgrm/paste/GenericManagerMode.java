package xyz.prgrm.paste;

import xyz.prgrm.paste.models.GenericDS;

public class GenericManagerMode extends Thread {

    private GenericDS<String> genericDS;

    public GenericManagerMode(GenericDS<String> genericDS) {
        this.genericDS = genericDS;
    }


    public void run() {
        while (true) {
            String cpText = Utils.getClipBoardText();
            if (cpText != null) {
                boolean ins = this.genericDS.insert(cpText);
                if (ins) {
                    System.out.println("Inserted One");
                }
            }

        }
    }
}

package xyz.prgrm.paste.managers;

import xyz.prgrm.paste.TaskClass;
import xyz.prgrm.paste.Utils;
import xyz.prgrm.paste.models.GenericDS;

public class GenericManagerMode extends TaskClass {

    private GenericDS<String> genericDS;

    public GenericManagerMode(GenericDS<String> genericDS) {
        this.genericDS = genericDS;
    }

    @Override
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

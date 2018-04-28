package xyz.prgrm.paste;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public class Utils {
    private static Toolkit toolkit;

    static {
        toolkit = Toolkit.getDefaultToolkit();
    }

    public static String getClipBoardText() {
        String result = null;
        try {
            Clipboard clipboard = toolkit.getSystemClipboard();
            result = (String) clipboard.getData(DataFlavor.stringFlavor);
            Thread.sleep(100);
        } catch (Exception e) {
        }
        return result;
    }
}

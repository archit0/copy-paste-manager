package xyz.prgrm.paste;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public class Utils {

    public static String getClipBoardText() {
        String result = null;
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            result = (String) clipboard.getData(DataFlavor.stringFlavor);
        } catch (Exception e) {
        }
        return result;
    }
}

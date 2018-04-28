package xyz.prgrm.paste;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public class Utils {

    public static String getClipBoardText(){
        String result = "";
        try {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Clipboard clipboard = toolkit.getSystemClipboard();
            result = (String) clipboard.getData(DataFlavor.stringFlavor);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}

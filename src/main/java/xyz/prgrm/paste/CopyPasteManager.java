package xyz.prgrm.paste;

import xyz.prgrm.paste.managers.GenericManagerMode;
import xyz.prgrm.paste.models.GenericDS;
import xyz.prgrm.paste.models.ModeConfiguration;

import java.util.List;
import java.util.Scanner;


public class CopyPasteManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModeConfiguration.load("");
        GenericDS<String> genericDS = new GenericDS<String>();
        GenericManagerMode genericManagerMode = new GenericManagerMode(genericDS);
        genericManagerMode.setPriority(1);
        genericManagerMode.start();
        while(true){
            String query = sc.nextLine();
            if (query.equals("list")){
                List<String> list = genericDS.list();
                for(String each: list){
                    System.out.println(each);
                }
            }
        }
    }
}

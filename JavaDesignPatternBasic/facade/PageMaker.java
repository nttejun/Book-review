package facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker{
    private PageMaker(){

    }
    public static void makeWelcomePage(String mailaddr, String filename){
        try{
//            Properties mailprop = Database.getProperties("maildata");
//            String username = mailprop.getProperty(mailaddr);
        		String username = mailaddr;
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page");
            writer.paragraph("메일 수신대기중");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " and " + username);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
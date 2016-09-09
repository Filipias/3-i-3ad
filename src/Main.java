import   javax.swing.*;

public class Main{

    public static void main(String[] arg){
        String user1;
        String user2;

        user1   =   JOptionPane.showInputDialog(null, "Ange namn för spelare 1.");
        user2   =   JOptionPane.showInputDialog(null, "Ange namn för spelare 2.");

        System.out.println(user1 + " "+ user2);
    }

}
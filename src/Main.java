import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * @author Mhosein Abbasi, 1/31/2022 6:49 PM
 */
public class Main {

    public static void main(String[] args) {
        String text = "sample...";
        text = text.replace("\n", "");
        String[] split = text.split("\\.");
        StringBuilder finals = new StringBuilder();
        for (String s : split) {
            finals.append("\n").append(s).append(".").append("\n");
        }
        System.out.println("COPY TO CLIPBOARD");
        StringSelection stringSelection = new StringSelection(finals.toString());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
}

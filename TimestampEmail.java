import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;

class TimestampEmail {
  private static final String BASE = "jrobertson+";
  private static final String URL = "@hirevue.com";

  public static void main(String[] args) {
    // Validate email address
    if (args.length != 1) {
        System.out.println("Needs a valid email address as the only arg");
        return;
    }
    String emailArg = args[0];

    String[] split = emailArg.split("@");
    if (split.length != 2) {
        System.out.println("Needs a valid email address (missing an '@' symbol)");
        return;
    }

    String base = split[0] + "+";
    String url = "@" + split[1];

    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    String email = base + timeStamp + url;

    // Print it for debugging purposes
    System.out.println(email);

    // Copy to the clipboard
    StringSelection stringSelection = new StringSelection(email);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);

    // It will remove it from the clipboard when the program ends so pause for 5 seconds
    try {
      Thread.sleep(5000);
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}

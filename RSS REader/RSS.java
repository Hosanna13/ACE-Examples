import java.io.FileWriter;
import java.io.IOException;

public class RSS {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("output.html", false); // false = overwrite
       
        // Header Example 
        writer.write("<html> <head> <title>the channel tag title as the page title</title>");
        writer.write("<p>  * the channel description ** </p>" + " <table border=\"1\">  <tr>" +
        "<th>Date</th>" +
        "<th>Source</th>" +
        "<th>News</th>" +
        "</tr>");


        // Footer example
        writer.write("</table>\n" + "</body> </html>");

        String header = "HeADER";
        System.out.println("<h1>" + header + "</h1>");
        writer.close();
    }
}

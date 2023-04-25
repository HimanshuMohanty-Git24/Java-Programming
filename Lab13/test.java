import java.applet.*;
import java.awt.*;

class RectangleApplet extends Applet {

    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {

        g.setColor(Color.RED);

        int x = 50;
        int y = 50;
        int width = 300;
        int height = 200;
        int arcWidth = 50;
        int arcHeight = 50;
        g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);

        Font font = new Font("Arial", Font.BOLD, 18);
        g.setFont(font);
        g.setColor(Color.WHITE);

        String rollNo = "Roll No: 2105719";
        String name = "Name: Himanshu Mohanty";
        String section = "Section: CSE-26";

        FontMetrics fm = g.getFontMetrics();
        int rollNoWidth = fm.stringWidth(rollNo);
        int nameWidth = fm.stringWidth(name);
        int sectionWidth = fm.stringWidth(section);
        int textHeight = fm.getHeight();

        int textX = x + (width - Math.max(rollNoWidth, Math.max(nameWidth, sectionWidth))) / 2;
        int textY = y + (height + textHeight) / 2;

        g.drawString(rollNo, textX, textY - textHeight);
        g.drawString(name, textX, textY);
        g.drawString(section, textX, textY + textHeight);
    }
}

class test {
    public static void main(String[] args) {
        RectangleApplet applet = new RectangleApplet();
        applet.init();
        applet.paint(null);
    }
}

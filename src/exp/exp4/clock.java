package exp.exp4;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class clock extends JFrame {
    public clock() {
        ClockPaint cp = new ClockPaint(60, 60, 70);
        this.add(cp);
        this.setSize(300, 300);
        this.setLocation(260, 120);
        this.setTitle("指针时钟");
        this.setVisible(true);
        this.setResizable(false);
    }
    public static void main(String[] s) {
        new clock();
    }
}

class ClockPaint extends JPanel implements Runnable {
    int x, y, r;
    int hour, minute, second; //时，分，秒
    final double rad = Math.PI / 180;
    public ClockPaint(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
        Calendar now = new GregorianCalendar();
        //获得时间转换成度数
        second = now.get(Calendar.SECOND) * 6;
        minute = now.get(Calendar.MINUTE) * 6;
        hour = (now.get(Calendar.HOUR_OF_DAY) - 12) * 30 + now.get(Calendar.MINUTE) / 12 * 6;
        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 300, 300);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, r * 2, r * 2);

        //秒针
        g.setColor(Color.GREEN);
        int x1 = (int)((r - 10) * Math.sin(rad * second));
        int y1 = (int)((r - 10) * Math.cos(rad * second));
        g.drawLine(x + r, y + r, x + r + x1, y + r - y1);

        //分针
        g.setColor(Color.BLUE);
        x1 = (int)((r - r / 2.5) * Math.sin(rad * minute));
        y1 = (int)((r - r / 2.5) * Math.cos(rad * minute));
        g.drawLine(x + r, y + r, x + r + x1, y + r - y1);

        //时针
        g.setColor(Color.RED);
        x1 = (int)((r - r / 1.5) * Math.sin(rad * hour));
        y1 = (int)((r - r / 1.5) * Math.cos(rad * hour));
        g.drawLine(x + r, y + r, x + r + x1, y + r - y1);

        //数字
        g.setColor(Color.BLACK);
        int d = 28;
        for (int i = 1; i <= 12; i++) {
            x1 = (int)((r - 10) * Math.sin(rad * d));
            y1 = (int)((r - 10) * Math.cos(rad * d));
            g.drawString(i + "", x + r + x1 - 4, x + r - y1 + 5);
            d += 30;
        }

        //刻度线
        d = 0;
        for (int i = 0; i < 60; i++) {
            int len = 0; //控制每个分割点的长度，数字点上的分割线长一点
            if(d % 30 == 0) {
                len = 5;
            }
            else {
                len = 2;
            }
            for (int j = 1; j <= len; j++)
            {
                x1 = (int)((r - j) * Math.sin(rad * d));
                y1 = (int)((r - j) * Math.cos(rad * d));
                g.drawString(".", x + r + x1 - 1, x + r - y1 + 1);
            }
            d += 6;
        }
    }
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000); //休眠一秒
            }
            catch (Exception ex) {

            }
            second += 6; //每一秒，秒针动6度
            if (second == 60 || second == 120 || second == 180 || second == 240 || second == 300) {
                minute += 1;  //每10秒，分针动1度
            }
            //大于一分钟，分针和时针开始出现改变
            if (second == 360) {
                second = 0;
                minute += 1;
                if (minute == 72 || minute == 144 || minute == 216 || minute == 288) {
                    hour += 6;
                }
                if (minute >= 360) {
                    minute = 0;
                    hour += 6;
                }
                if (hour >= 360) {
                    hour = 0;
                }
            }
            this.repaint();
        }
    }
}

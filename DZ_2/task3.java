package DZ_2;

import java.util.logging.*;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws java.io.IOException {
        Logger logger = Logger.getLogger(task3.class.getName());
        FileHandler fh = new FileHandler("DZ_2\\log-calc.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        System.out.println("Первое число: ");
        Scanner iScanner = new Scanner(System.in);
        int x = iScanner.nextInt();
        System.out.println("Действие (+, -, /, *): ");
        char calcChar = (char) System.in.read();
        System.out.println("Второе число: ");
        int y = iScanner.nextInt();
        iScanner.close();
        int result = 0;
        switch(calcChar) { 
            case '+': 
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '/':
                result = x / y;
                break;
            case '*':
                result = x * y;
                break;
        }              
        System.out.printf("%d %c %d = %d\n", x, (char) calcChar, y, result);
        logger.info(String.format("%d %c %d = %d", x, (char) calcChar, y, result));        
    }
}

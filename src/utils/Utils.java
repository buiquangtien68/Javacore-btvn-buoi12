package utils;

import java.util.Scanner;

public class Utils {
    public long inputLong(Scanner scanner){
        while (true){
            try {
                return Long.parseLong(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Lỗi input, vui lòng nhập lại!");
            }
        }

    }
}

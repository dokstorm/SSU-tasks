import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Source {
    public static void encryptDirectory(String path, String password) {
        File dir = new File(path);
        

    }

    public static void main(String[] args) {
        System.out.println("Введите путь к шифруемой директории:");
        Scanner in = new Scanner(System.in);
        //String path = in.nextLine();
        String path = "C:/Users/Dmitriy/Desktop/test1";
        System.out.println("Введите пароль:");
        String pass1 = in.nextLine();
        System.out.println("Повторите пароль:");
        String pass2 = in.nextLine();
        if (!pass1.equals(pass2)) {
            System.out.println("Пароли не совпадают");
        }
        else {
            encryptDirectory(path, pass2);
            System.out.println("Директория успешно зашифрована");
        }



    }
}

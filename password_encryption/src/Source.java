import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Source {
    public static void encryptDirectory(String path, String password) throws IOException {
        File dir = new File(path);

        File archive = new File(dir.getCanonicalPath() + ".arch");
        archive.createNewFile();
        for (File item : dir.listFiles()) {

        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к шифруемой директории:");
        Scanner in = new Scanner(System.in);
        //String path = in.nextLine();
        String path = "C:/Users/Dmitriy/Desktop/test1/test";
        /*System.out.println("Введите пароль:");
        String pass1 = in.nextLine();
        System.out.println("Повторите пароль:");
        String pass2 = in.nextLine();
        if (!pass1.equals(pass2)) {
            System.out.println("Пароли не совпадают");
        }
        else {*/
        String pass2 = "123";

            encryptDirectory(path, pass2);
            System.out.println("Директория успешно зашифрована");
        //}



    }
}

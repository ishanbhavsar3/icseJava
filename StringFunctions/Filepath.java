import java.util.Scanner;
public class Filepath {
    public static void main(String[] args) {
        String str, path, fileName, fileType;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter filepath to get the folder path, file name & extension.");
        str = sc.next();
        path = str.substring(0, str.lastIndexOf("\\"));
        fileName = str.substring((char)(str.lastIndexOf("\\")+1), (str.indexOf(".")));
        fileType = str.substring((char)(str.indexOf(".")+1), str.length());

        System.out.println("Path:       "+path);
        System.out.println("File name:  "+fileName);
        System.out.println("Extension:  "+fileType);
    }
}

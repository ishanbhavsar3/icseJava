import java.util.Scanner;
public class Filepath {
    public static void main(String[] args) {
        String str, path, fileName, fileType;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter filepath to get the folder path, file name & extension.");
        str = sc.next();
        //storing the folder path in variable path
        path = str.substring(0, str.lastIndexOf("\\"));
        //storing the file name using substring(), indexOf() & lastIndexOf() fns on str
        fileName = str.substring((char)(str.lastIndexOf("\\")+1), (str.indexOf(".")));
        //storing the file type using indexOf() & length() fns on String str
        fileType = str.substring((char)(str.indexOf(".")+1), str.length());

        System.out.println("Path:       "+path);
        System.out.println("File name:  "+fileName);
        System.out.println("Extension:  "+fileType);
    }
}

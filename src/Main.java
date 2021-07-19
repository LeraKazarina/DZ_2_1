import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static StringBuilder log = new StringBuilder();

    public static void main(String[] args) {
        try {
            File dir = new File("C://Workspace//13.1.1.1//Game");
            log.append(dir + " успешно создан\n" + dir.mkdir());;

            File dir1 = new File(dir + "//src");
            log.append(dir1 + " успешно создан\n" + dir1.mkdir());

            File dir2 = new File(dir + "//res");
            log.append(dir2 + " успешно создан\n" + dir2.mkdir());

            File dir3 = new File(dir + "//savegames");
            log.append(dir3 + " успешно создан\n" + dir3.mkdir());

            File dir4 = new File(dir + "//temp");
            log.append(dir4 + " успешно создан\n" + dir4.mkdir());

            File dir5 = new File(dir1 + "//main");
            log.append(dir5 + " успешно создан\n " + dir5.mkdir());

            File dir6 = new File(dir1 + "//test");
            log.append(dir6 + " успешно создан\n" + dir6.mkdir());

            File dir7 = new File(dir2 + "//drawables");
            log.append(dir7 + " успешно создан\n" + dir7.mkdir());

            File dir8 = new File(dir2 + "//vectors");
            log.append(dir8 + " успешно создан\n" + dir8.mkdir());

            File dir9 = new File(dir2 + "//icons");
            log.append(dir9 + " успешно создан\n" + dir9.mkdir());
            File myFile2 = new File("C://Workspace//13.1.1.1//Game//src//main//Main.java");
            log.append(myFile2 + " успешно создан\n" + myFile2.createNewFile());

            File myFile3 = new File("C://Workspace//13.1.1.1//Game//src//main//Utils.java");
            log.append(myFile3 + " успешно создан\n" + myFile3.createNewFile());

            File myFile4 = new File("C://Workspace//13.1.1.1//Game//temp//temp.txt");
            log.append(myFile4 + " успешно создан\n" + myFile4.createNewFile());

            String text = log.toString();

            try (FileWriter writer = new FileWriter(myFile4)) {
                writer.write(text);
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (IOException e) {
            System.out.println(log.append(e));
        }
    }

    private static boolean mkdir(File file) {
        if (file.mkdir()) {
            return true;
        } else return false;
    }

    private static boolean createNewFile(File file) {
        try {
            if (file.createNewFile())
                return true;
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        } return false;
    }
}


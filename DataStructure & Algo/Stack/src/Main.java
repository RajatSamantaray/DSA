import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// Press Shift twice to open the Search Ever+ywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static String fixGCN(String gcn) {
        String zeroes = "0000";
        if (gcn == null || gcn.trim().isEmpty()) {
            return null;
        }


        // check GCNs are only Alphanumeric
        if (!gcn.matches("^[0-9]*$")) {
            gcn = gcn.replaceAll("[^0-9]", "");
        }
        // ensure GCNs start with 0's

        if (gcn.replaceAll("[^0-9]", "").length() < 4) {

            gcn = new StringBuffer().append(zeroes.substring(gcn.replaceAll("[^0-9]", "").length())).append(gcn).toString();
        }
        return gcn;
    }

    public static void changeColumbforCSVFile(String filePath) {
        //  String csvFile = filePath;
        ArrayList<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // String[] values = new String[20];
            int count = 0;

            String[] oldValue = new String[20];
            while ((line = br.readLine()) != null) {
                count++;
                String[] values = line.split(",");
                if (count % 2 == 0) {
                    //even
                    String[] newValue = new String[20];
                    for (int i = 0; i < oldValue.length; i++) {
                        newValue[i] = oldValue[i];
                    }
                    newValue[19] = values[1];
                    for (int i = 0; i < oldValue.length; i++) {
                        System.out.print(oldValue[i] + " ");
                    }
                    System.out.println();
                    data.add(newValue);
                    //             System.out.println(data);
                } else {
                    //odd

                    for (int i = 0; i < oldValue.length; i++) {
                        oldValue[i] = "";
                    }
                    for (int i = 0; i < values.length; i++) {
                        oldValue[i] = values[i];
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        // write the modified data back to the file
        try (FileWriter fw = new FileWriter("C:\\Users\\rsamantaray\\Downloads\\NewTest.csv")) {
            for (String[] row : data) {
                fw.write(String.join(",", row) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*public static void splitCSVFile(String fileName,String Dir,int maxCount) {
        ArrayList<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // String[] values = new String[20];
            long count = 0;

            String[] oldValue = new String[7];
            while ((line = br.readLine()) != null) {
                count++;
                String[] oldValue = new String[7];
                String[] values = line.split(";");

                for (int i = 0; i < values.length; i++) {
                    oldValue[i] = values[i];
                }
                data.add(oldValue);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public static void splitCSV(String inputFilePath, String outputFolderPath, int rowsPerFile) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        String header = reader.readLine();
        String line;
        int fileNumber = 1;
        int rowCount = 0;
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFolderPath + "/AuditLiceneceName_" + fileNumber + ".csv"));
        writer.write(header);
        writer.newLine();
        while ((line = reader.readLine()) != null) {
            if (rowCount == rowsPerFile) {
                writer.close();
                fileNumber++;
                rowCount = 0;
                writer = new BufferedWriter(new FileWriter(outputFolderPath + "/AuditLiceneceName_" + fileNumber + ".csv"));
                writer.write(header);

                writer.newLine();
            }
            writer.write(line);
            Thread.sleep(1);
            writer.newLine();
            rowCount++;
        }
        writer.close();
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.


        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
        //System.out.println(fixGCN(" 123a"));
        //changeColumbforCSVFile("C:\\Users\\rsamantaray\\Downloads\\");
        try {
            splitCSV("C:\\Users\\rsamantaray\\Downloads\\AuditLiceneceName\\AuditLiceneceName.csv","C:\\Users\\rsamantaray\\Downloads\\test",900000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
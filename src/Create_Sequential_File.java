import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Create_Sequential_File {
    private static ObjectOutputStream output;


    public static void main(String[] args) {

            openAccountDocument();
            addRecordsToAccountDocument();
            closeDocumentRecords();
    }

    public static void openAccountDocument(){

        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("user.rf")));
        }catch(IOException ioException){
            System.err.println("Error while opening document....terminating");
            System.exit(1);
        }

    }
    public static void addRecordsToAccountDocument(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your firstName, lastName, account and balance details");

        while(scan.hasNext()){

            try {
                Account document = new Account(scan.next(), scan.next(), scan.nextInt(), scan.nextDouble());

                output.writeObject(document);

            }catch (NoSuchElementException noSuchElementException){

                System.err.println("Invalid elements entered....please try again");
                scan.nextLine();

            }catch(IOException ioException){

                System.err.println("Error while writing to file...please try again");
                break;
            }
            System.out.println("?");
        }

    }
    public static void closeDocumentRecords(){

            try {
                if (output != null)
                    output.close();
            }catch (IOException ioException){
                System.err.println("File is about to close.....");
            }
        }
    }

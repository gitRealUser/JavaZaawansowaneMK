package powtorka.exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestException {

    public List<Book> read()   {
        List<Book> bookList = new ArrayList<>();
        try {
            File file = new File("src\\main\\java\\powtorka\\exceptions\\books.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String bookLine = scanner.nextLine();
                bookList.add(book(bookLine));
            }
        }catch(FileNotFoundException e){
            System.out.println("File downloading impossible...");
        }
        return bookList;
    }

    public Book book(String line){
        try {
            String[] splitedLine = line.split(";");
            String name = splitedLine[0];
            int releaseYear = Integer.parseInt(splitedLine[1]);
            return new Book(name,releaseYear);
        }catch(NumberFormatException e){
            System.out.println("wrong date in " + line);
        }
        return null;
    }

    public static void main(String[] args) {
        TestException testException = new TestException();
        System.out.println(testException.read());
    }


}


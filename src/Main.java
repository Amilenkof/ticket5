import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
//    - 5 билет
//    Когда применяется ключевое слово this?
//    Что такое сигнатура метода?
//    Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: «Название книги» И. О. Автора.
    public static void main(String[] args) {
        System.out.println("Билет 5");
//    Как сравнить две строки в Java и/или отсортировать их?
// строки нельзя сравнивать с помощью ==
//     строки являются обьектами и сравниваются с помощью метода equals
        System.out.println("Вопрос 1.Сравнение строк");
    String one = "dsafjl";
    String two = "abcdefg";
        System.out.println(one.equals(two));
        System.out.println("Вопрос1. сортировка строк");
        char[] oneArr =  one.toCharArray();
        Arrays.sort(oneArr);
        System.out.println(Arrays.toString(oneArr));

        System.out.println("Задача");
        //Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: «Название книги» ИмяАвтора.

        Book[] booksArr = new Book[3];
        Author[] authorArr = new Author[3];
        booksArr[0] = new  Book("1984");
        booksArr[1] = new Book("Война и мир");
        booksArr[2] = new Book("Идиот");

        authorArr[0] = new Author("Джордж","Оруэл");
        authorArr[1] = new Author("Лев","Толстой");
        authorArr[2] = new Author("Федор","Достоевский");

        for (int i = 0; i < authorArr.length; i++) {
            System.out.println(booksArr[i].toString()+" "+authorArr[i].toString());
        }

        }
        }




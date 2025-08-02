import java.util.*;

public class Main {
    public static void main(String[] args) {

       List<Book> library = List.of(
                new Book("Краткая история времени", "Стивен Хокинг", 1988, 256),
                new Book("Человек не хочет ничего, кроме как быть оставшимся в покое", "Фёдор Достоевский", 1875, 120),
                new Book("Слепая лошадь", "Андрей Битов", 1978, 352),
                new Book("Dune", "Фрэнк Герберт", 1965, 688),
                new Book("Мы", "Евгений Замятин", 1924, 256),
                new Book("Мастер и Маргарита", "Михаил Булгаков", 1967, 480),
                new Book("Sapiens: Краткая история человечества", "Юваль Ной Харари", 2011, 443),
                new Book("Над пропастью во ржи", "Джером Д. Сэлинджер", 1951, 277),
                new Book("Атлант расправил плечи", "Айн Рэнд", 1943, 1069),
                new Book("Посторонний", "Альбер Камю", 1942, 159),
                new Book("Книга о вкусной и здоровой пище", "А. А. Земсков", 1939, 400),
                new Book("Психология влияния", "Роберт Чалдини", 1984, 320),
                new Book("Ночь, когда солнце не было", "Виктор Пелевин", 2021, 288),
                new Book("Малыш и Карлсон", "Астрид Линдгрен", 1955, 189),
                new Book("Американский психопат", "Брет Истон Эллис", 1991, 400),
                new Book("Три товарища", "Эрих Мария Ремарк", 1936, 400),
                new Book("Гаргантюа и Пантагрюэль", "Франсуа Рабле", 1534, 672),
                new Book("Код да Винчи", "Дэн Браун", 2003, 489),
                new Book("Цвет пурпурной фиалки", "Элис Уокер", 1982, 304),
                new Book("Туманность Андромеды", "Иван Ефремов", 1957, 416)
        );


        List<Student> students = List.of(

                new Student("Vasya", List.of(
                        library.get(9),
                        library.get(4),
                        library.get(3),
                        library.get(7),
                        library.get(0)

                )),
                new Student("Petya", List.of(
                        library.get(2),
                        library.get(19),
                        library.get(5),
                        library.get(6),
                        library.get(8)
                )),
                new Student("Masha", List.of(
                        library.get(1),
                        library.get(18),
                        library.get(16),
                        library.get(15),
                        library.get(14)
                )),
                new Student("Zoya", List.of(
                        library.get(11),
                        library.get(10),
                        library.get(12),
                        library.get(13),
                        library.get(17)
                ))
        );



        students.stream()
                .peek(System.out::println)
                .map(Student::getBooks)
                .flatMap(books -> books.stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYearOfPublish() > 2000)
                .limit(3)
                .peek(book -> book.getYearOfPublish())
                .findAny()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Такая книга отсутствует"));

    }
}






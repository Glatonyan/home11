public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("L.", "Tolstoy");
        Author author2 = new Author("A.", "Pushkin");

        Book book1 = new Book("Война и мир", author1, 1865);
        Book book2 = new Book("Капитанская дочка", author2, 1836);

        System.out.println(book1.toString());;
        System.out.println(book2.toString());

        book1.setPublicationYear(1867);
        System.out.println("Новый год публикации книги 1:\n " + book1.getPublicationYear());


    }
}
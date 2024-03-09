public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("L.", "Tolstoy");
        Author author2 = new Author("A.", "Pushkin");

        Book book1 = new Book("Война и мир", author1, 1865);
        Book book2 = new Book("Капитанская дочка", author2, 1836);
        System.out.println("Название книги 1: " + book1.getTitle());
        System.out.println("Автор книги 1: " + book1.getAuthor().getFirstName() + book1.getAuthor().getLastName());
        System.out.println("Год публикации книги 1: " + book1.getPublicationYear());
        System.out.println("Название книги 2: " + book2.getTitle());
        System.out.println("Автор книги 2: " + book2.getAuthor().getFirstName() + book2.getAuthor().getLastName());
        System.out.println("Год публикации книги 2: " + book2.getPublicationYear());

        book1.setPublicationYear(1867);
        System.out.println("Новый год публикации книги 1: " + book1.getPublicationYear());
    }
}
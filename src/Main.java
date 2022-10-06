public class Main {
    public static void main(String[] args) {
        Author ivanovIvan = new Author("Иван" , "Иванов");
        Author costenkoDmitri = new Author("Дмитрий" , "Костенко");
        Book sevenDays = new Book("Семь дней" , ivanovIvan , 2020);
        Book luckySummer = new Book("Удачное лето" , costenkoDmitri , 2010);

        System.out.println("Название книги - " + sevenDays.getBook() + ", Автор - " + ivanovIvan.getFirstName() + " " + ivanovIvan.getLastName() + ", Год " + sevenDays.getYear());
        System.out.println("Название книги - " + luckySummer.getBook() + ", Автор - " + costenkoDmitri.getFirstName() + " " + costenkoDmitri.getLastName() + ", Год " + luckySummer.getYear());
        luckySummer.setYear(2013);
        System.out.println("Название книги - " + luckySummer.getBook() + ", Автор - " + costenkoDmitri.getFirstName() + " " + costenkoDmitri.getLastName() + ", Год перенесен на " + luckySummer.getYear());
    }
}
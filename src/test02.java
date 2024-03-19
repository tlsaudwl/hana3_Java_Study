import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class test02 {
    static class Book {
        private String name;
        private String publisher;
        private LocalDate pubDate;
        private int price;

        public Book() {

        }

        public Book(String name, String publisher, LocalDate pubDate, int price) {
            this.name = name;
            this.publisher = publisher;
            this.price = price;
            this.pubDate = pubDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public LocalDate getPubDate() {
            return pubDate;
        }

        public void setPubDate(LocalDate pubDate) {
            this.pubDate = pubDate;
        }
    }

    static List<Book> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------도서 재고 관리 프로그램--------");
        System.out.print("1.입력 2.전체출력 3.정렬 4.수정: ");
        while (true) {
            int num = scan.nextInt();
            if (num == 1) {
                System.out.print("책이름 입력: ");
                String name = scan.next();
                System.out.print("출판사 입력: ");
                String publisher = scan.next();
                scan.nextLine();
                System.out.print("출판일 입력: ");
                String dateString = scan.nextLine();
                LocalDate pubDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                System.out.print("가격 입력: ");
                int price = scan.nextInt();

                Book book = new Book(name, publisher, pubDate, price);
                list.add(book);
                System.out.println("도서가 입고되었습니다.");
                System.out.println("총 도서의 수는 " + list.size() + "권입니다.");
            } else if (num == 2) {
                for (Book book : list) {
                    printInfo(book);
                }
            } else if (num == 3) {
                System.out.println("책이름 가나다순(1) 출판일 최근순(2)");
                int sortOption = scan.nextInt();
                if (sortOption == 1) {

                    Collections.sort(list, Comparator.comparing(Book::getName));
                    System.out.println("책이름 가나다순으로 정렬되었습니다.");
                } else if (sortOption == 2) {

                    Collections.sort(list, Comparator.comparing(Book::getPubDate).reversed());
                    System.out.println("출판일 최근순으로 정렬되었습니다.");
                } else {
                    System.out.println("잘못된 입력입니다.");
                    return;
                }


                for (Book book : list) {
                    System.out.println(book);
                }
            }

            else if (num == 4) {
                System.out.print("수정할 책이름 입력:");
                String name = scan.next();
                Book foundBook = null;
                for (Book book : list) {
                    if (book.name.equals(name)) {
                        foundBook = book;
                        break;
                    }
                }
                System.out.print("출판사 입력: ");
                String publisher = scan.next();
                foundBook.setPublisher(publisher);
                scan.nextLine();
                System.out.print("출판일 입력: ");
                String dateString = scan.nextLine();
                LocalDate pubDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                foundBook.setPubDate(pubDate);
                System.out.print("가격 입력: ");
                int price = scan.nextInt();
                foundBook.setPrice(price);

                System.out.println("도서정보가 수정되었습니다.");
            }
        }
    }

    static void printInfo(Book book) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        System.out.println(book.name + "/ " + book.publisher + "/ " + book.pubDate + "/ " + decimalFormat.format(book.price));
    }
}




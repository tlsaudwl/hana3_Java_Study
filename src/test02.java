//import java.text.DecimalFormat;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.*;
//
//public class test02 {
//    static class Book {
//        private String name;
//        private String publisher;
//        private LocalDate pubDate;
//        private int price;
//
//        public Book() {
//
//        }
//
//        public Book(String name, String publisher, LocalDate pubDate, int price) {
//            this.name = name;
//            this.publisher = publisher;
//            this.price = price;
//            this.pubDate = pubDate;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getPublisher() {
//            return publisher;
//        }
//
//        public void setPublisher(String publisher) {
//            this.publisher = publisher;
//        }
//
//        public int getPrice() {
//            return price;
//        }
//
//        public void setPrice(int price) {
//            this.price = price;
//        }
//
//        public LocalDate getPubDate() {
//            return pubDate;
//        }
//
//        public void setPubDate(LocalDate pubDate) {
//            this.pubDate = pubDate;
//        }
//    }
//
//    static List<Book> list = new ArrayList<>();
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("--------도서 재고 관리 프로그램--------");
//        System.out.print("1.입력 2.전체출력 3.정렬 4.수정: ");
//        while (true) {
//            int num = scan.nextInt();
//            if (num == 1) {
//                System.out.print("책이름 입력: ");
//                String name = scan.next();
//                System.out.print("출판사 입력: ");
//                String publisher = scan.next();
//                scan.nextLine();
//                System.out.print("출판일 입력: ");
//                String dateString = scan.nextLine();
//                LocalDate pubDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//                System.out.print("가격 입력: ");
//                int price = scan.nextInt();
//
//                Book book = new Book(name, publisher, pubDate, price);
//                list.add(book);
//                System.out.println("도서가 입고되었습니다.");
//                System.out.println("총 도서의 수는 " + list.size() + "권입니다.");
//            } else if (num == 2) {
//                for (Book book : list) {
//                    printInfo(book);
//                }
//            } else if (num == 3) {
//                System.out.println("책이름 가나다순(1) 출판일 최근순(2)");
//                int sortOption = scan.nextInt();
//                if (sortOption == 1) {
//
//                    Collections.sort(list, Comparator.comparing(Book::getName));
//                    System.out.println("책이름 가나다순으로 정렬되었습니다.");
//                } else if (sortOption == 2) {
//
//                    Collections.sort(list, Comparator.comparing(Book::getPubDate).reversed());
//                    System.out.println("출판일 최근순으로 정렬되었습니다.");
//                } else {
//                    System.out.println("잘못된 입력입니다.");
//                    return;
//                }
//
//
//                for (Book book : list) {
//                    System.out.println(book.getName());
//                }
//            }
//
//            else if (num == 4) {
//                System.out.print("수정할 책이름 입력:");
//                String name = scan.next();
//                Book foundBook = null;
//                for (Book book : list) {
//                    if (book.name.equals(name)) {
//                        foundBook = book;
//                        break;
//                    }
//                }
//                System.out.print("출판사 입력: ");
//                String publisher = scan.next();
//                foundBook.setPublisher(publisher);
//                scan.nextLine();
//                System.out.print("출판일 입력: ");
//                String dateString = scan.nextLine();
//                LocalDate pubDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//                foundBook.setPubDate(pubDate);
//                System.out.print("가격 입력: ");
//                int price = scan.nextInt();
//                foundBook.setPrice(price);
//
//                System.out.println("도서정보가 수정되었습니다.");
//            }
//        }
//    }
//
//    static void printInfo(Book book) {
//        DecimalFormat decimalFormat = new DecimalFormat("#,###");
//        System.out.println(book.name + "/ " + book.publisher + "/ " + book.pubDate + "/ " + decimalFormat.format(book.price));
//    }
//}
//
//
//

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test02{
    static class Book {
        private String name;
        private String publisher;
        private int price;
        private LocalDate pubDate;

        public Book() {}

        public Book(String name, String publisher, int price, LocalDate pubDate) {
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

        public String printInfo() {
            return name + '/' + publisher + '/' + pubDate.format(DateTimeFormatter.ofPattern("yyyy년M월d일"))
                    + '/' + comma(price);
        }
        public String comma(int value) {
            //DecimalFormat df = new DecimalFormat("###,###");
            //String value_str = df.format(value);
            //return value_str;

            int value1 = value % 1000;
            int value2 = value / 1000;

            String str = String.valueOf( value1);
            str = String.format("%3s", str).replace(" ", "0");

            return String.valueOf( value2 ) + "," + str;
        }
    }

    static ArrayList<Book> bookList = new ArrayList<>();
    public static void main(String[] args) {
        // 입력은 Scanner
        // 가격 출력 시 세자리 수마다 , 붙여야 함
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---------도서 재고 관리 프로그램--------------");
            System.out.print("1.입력 2.전체출력 3.정렬 4.수정 : ");

            int input = sc.nextInt();
            sc.nextLine();

            if (input == 1) { // 입력
                System.out.print("책이름 입력 : ");
                String name = sc.next();
                System.out.print("출판사 입력 : ");
                String publisher = sc.next();
                System.out.print("출판일 입력 : ");
                LocalDate pubDate = LocalDate.parse(sc.next());
                System.out.print("가격 입력 : ");
                int price = sc.nextInt();
                sc.nextLine();
                bookList.add(new Book(name, publisher, price, pubDate));
                System.out.println("도서가 입고되었습니다.");
                System.out.println("총 도서의 수는 " + bookList.size() + "권입니다.");
                System.out.println();
            } else if (input == 2) { // 전체 출력
                for (Book book : bookList) {
                    System.out.println(book.printInfo());
                }
                System.out.println("총 도서의 수는 " + bookList.size() + "권입니다.");
                System.out.println();
            } else if (input == 3) { // 정렬
                System.out.println("책이름 가나다순(1) 출판일 최근순(2)");
                System.out.print("정렬 기준 : ");
                int flag = sc.nextInt();
                sc.nextLine();

                if (flag == 1) { // 책이름 가나다순
                    //버블정렬처럼 모든 요소의 쌍이 o1, o2로 들어온다.
                    Collections.sort(bookList, (o1, o2) -> {
                        return o1.getName().compareTo(o2.getName());
                    });
                    //반복문 돌면서, 가장 작은 값으로 설정하고,
                    //자기보다 큰값을 만나면, add list한다.
                } else if (flag == 2) { // 출판일 최근순
                    Collections.sort(bookList, (o1, o2) -> {
                        return o2.getPubDate().compareTo(o1.getPubDate());
                    });
                } else {
                    System.out.println("잘못된 입력값입니다. 프로그램을 종료합니다.");
                    break;
                }

                int index = 0;
                for (Book book : bookList) {
                    System.out.print(++index + ". ");
                    System.out.println(book.printInfo());
                }
                System.out.println("총 도서의 수는 " + bookList.size() + "권입니다.");
                System.out.println();
            } else if (input == 4) { // 수정
                System.out.print("수정할 책이름 입력 : ");
                String name = sc.next();
                System.out.print("출판사 입력 : ");
                String publisher = sc.next();
                System.out.print("출판일 입력 : ");
                LocalDate pubDate = LocalDate.parse(sc.next().trim());
                System.out.print("가격 입력 : ");
                int price = sc.nextInt();
                sc.nextLine();

                Book findBook = null;
                for (Book book : bookList) {
                    if (book.getName().equals(name)) {
                        findBook = book;
                        break;
                    }
                }
                findBook.setPublisher(publisher);
                findBook.setPubDate(pubDate);
                findBook.setPrice(price);

                //ArrayList에서 set함수를 이용해도 됨.

                System.out.println("도서정보가 수정되었습니다.");
                System.out.println();
            } else { // 예외
                System.out.println("잘못된 입력값입니다. 프로그램을 종료합니다.");
                break;
            }
        }
        sc.close();
    }
}

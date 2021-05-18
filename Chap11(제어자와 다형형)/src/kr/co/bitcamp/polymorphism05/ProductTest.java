package kr.co.bitcamp.polymorphism05;

import java.util.Scanner;

public class ProductTest {

    static int productId = 0;
    static int numberOfProduct = 0;
    static Product[] product = new Product[10];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        while (choice != 3) {
            int type = 0;
            System.out.println("=========상품조회,추가 프로그램입니다.=================");
            System.out.print("상품추가(1),상품조회(2),끝내기(3) >> ");

            choice = scan.nextInt();
            switch (choice) {
            case 1:
                if (numberOfProduct >= product.length) {
                    System.out.println("더 이상 상품추가 불가");
                    break;
                }

                System.out.print("책(1), 음악CD(2), 회화책(3) >> ");
                type = scan.nextInt();
                if (type < 1 || type > 3) {
                    System.out.println("잘못 입력함");
                    break;
                }

                addProduct(type);
                break;

            case 2:
                for (int i = 0; i < numberOfProduct; i++) {
                    product[i].shouwInfo();
                }
                break;
            case 3:
                System.out.println("프로그램 종료");
                break;
            }
        }

    }

    public static void addProduct(int type) {
        scan.nextLine(); // 버퍼비우기

        System.out.print("상품설명 >> ");
        String desc = scan.nextLine();
        System.out.print("생산자 >> ");
        String maker = scan.nextLine();
        System.out.print("가격 >> ");
        int price = scan.nextInt();

        scan.nextLine();

        switch (type) {
        case 1:
            System.out.print("일반책 제목 >> ");
            String title = scan.nextLine();
            System.out.print("저자 >> ");
            String author = scan.nextLine();
            System.out.print("국제표준도서번호 >> ");
            int ISBN = scan.nextInt();

            // 필드의 다형성(조상타입의 배열에 자손의 인스턴스를 담고 있음)
            product[numberOfProduct] = new Book(productId++, desc, maker, price, ISBN, title, author);
            break;
        case 2:
            System.out.print("앨범 제목 >> ");
            String albumTitle = scan.nextLine();
            System.out.print("가수 >> ");
            String artist = scan.nextLine();

            // 필드의 다형성(조상타입의 배열에 자손의 인스턴스를 담고 있음)
            product[numberOfProduct] = new CompactDisc(productId++, desc, maker, price, albumTitle, artist);
            break;
        case 3:
            System.out.print("회화책 제목 >> ");
            String title2 = scan.nextLine();
            System.out.print("저자 >> ");
            String author2 = scan.nextLine();
            System.out.print("언어 >> ");
            String language = scan.nextLine();
            System.out.print("ISBN >> ");
            int ISBN2 = scan.nextInt();

            product[numberOfProduct] = new ConversionBook(productId++, desc, maker, price, ISBN2, title2, author2,
                    language);
            break;
        }
        numberOfProduct++;
    }

}

//import java.util.Scanner;
//public class ProductTest {
//
//    static int productID = 0;                           //static은 메모리에 따로 올라간다. 공유하는 목적
//    static int numberofproduct = 0; 
//    static Product[] product = new Product[10];         //모든 클래스가 Product를 상속받고있기 때문에 Product배열 생성
//    static Scanner scanner = new Scanner(System.in);                                                  //Array는 정적이기때문에 안쓰더라도 메모리에 할당되어져 있음
//    
//    
//    public static void main(String[] args) {
//        int choice = 0;
//        
//        while(choice !=3 ) {
//            int type = 0;
//            System.out.println("========상품조회, 추가 프로그램입니다.========");
//            System.out.println("1.상품추가 2.상품조회 3.종료");
//            System.out.print(">> ");
//            choice = scanner.nextInt();
//            
//            switch(choice) {
//            case 1:
//                if(numberofproduct >= product.length) {
//                    System.out.println("더이상 상품을 추가할 수 없습니다. >> ");
//                    break;
//                }
//                System.out.println("1.책 2.음악CD 3.회화책");
//                System.out.print(">> ");
//                type = scanner.nextInt();
//                
//                if(type < 1 || type > 3) {
//                    System.out.println("잘못입력했습니다.");
//                    break;
//                }
//                
//                addProduct(type);
//                break;
//                
//            case 2:
//                for(int i=0; i<numberofproduct; i++) {
//                    product[i].shouwInfo();
//                    break;
//                }
//            
//            case 3:
//                System.out.println("프로그램 종료");
//                break;
//            
//        }
//
//    }
// 
//}
//    
//    public static void addProduct(int type) {
//        scanner.nextLine();                         //버퍼비우기
//        
//        System.out.print("상품설명 >> ");
//        String desc = scanner.nextLine();
//
//        System.out.print("생산자 >> ");
//        String maker = scanner.nextLine();
//
//        System.out.print("가격 >> ");
//        int price = scanner.nextInt();
//    
//        scanner.nextLine();                     
//        
//        switch(type) {
//            case 1:
//                System.out.print("일반 책 제목 >> ");
//                String title = scanner.nextLine();
//                
//                System.out.print("저자 >> ");
//                String author = scanner.nextLine();
//                
//                System.out.print("국제표준도서번호 >> ");
//                int isbn = scanner.nextInt();
//            
//                scanner.nextInt();
//                
//                //필드의 다형성(조상타입 배열에 자손에 인스턴스를 담고있음) --> 원래는 같은 타입만 되지만 필드의 다형성으로 인해 됨
//                product[numberofproduct] = new Book(productID++, desc , maker, price, isbn, title, author);
//                break;
//                
//               
//            case 2:
//                System.out.print("앨범 제목 >>");
//                String albumTitle = scanner.nextLine();
//                
//                System.out.print("가수 >>");
//                String artist = scanner.nextLine();
//                
//                product[numberofproduct] = new CompactDisc(productID++, desc, maker, price, albumTitle, artist);
//                break;
//                
//            case 3:
//                System.out.println("회화책 제목 >> ");
//                String title2 = scanner.nextLine();
//                
//                System.out.println("저자 >> ");
//                String author2 = scanner.nextLine();
//                
//                System.out.println("언어 >> ");
//                String language = scanner.nextLine();
//                
//                System.out.println("국제표준도서번호 >> ");
//                int isbn2 = scanner.nextInt();
//                
//                product[numberofproduct] = new ConversionBook(productID, desc, maker, price, isbn2, title2, author2, language);
//                //product[numberofproduct] = new ConversionBook(productID++, desc, maker, price, isbn2, title2, author2);
//                break;
//                
//        }
//        numberofproduct ++;
//    }
//    
//    
//}

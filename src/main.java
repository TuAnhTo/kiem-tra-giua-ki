import java.util.Scanner;

public class main {
    public static void main(String[] args){
        menu();
        check();
    }

    public  static void menu(){
        System.out.println("1. nhap sinh vien");
        System.out.println("2. hien thi danh  sach sinh vien");
        System.out.println("3. sap xep theo ten");
        System.out.println("4. tim kiem sinh vien");
        System.out.println("5. sua thong tin");
        System.out.println("6. xoa sinh vien ");
        System.out.println("0. thoat");
    }
    public  static void check(){
        Scanner scanner = new Scanner(System.in);
        SinhVienTest sinhVienTest = new SinhVienTest();

        int i = 1;
        do {
            System.out.println("chon cac so duoi day de thuc hien:");
            i = scanner.nextInt();
            switch (i)
            {
                case 0 : System.exit(0);
                    break;

                case 1 : sinhVienTest.add();
                    break;

               case 2 : scanner.display();
                    break;

                default:
                    System.exit(0);
            }
        }while (i != 0);



    }


}


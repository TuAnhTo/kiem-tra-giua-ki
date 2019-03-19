import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienTest implements ISinhVienTest {
    public ArrayList<Sinhvien> student = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void add () {
        Sinhvien sinhvien = new Sinhvien();

        System.out.println(" nhap vao ma sinh vien: ");
        int maSv = scanner.nextInt();
        sinhvien.setMaSv(maSv);

        System.out.println(" nhap vao ten sinh vien");
        String name = scanner.nextLine();
        sinhvien.setName(name);

        System.out.println(" nhap vao gioi tinh");
        String sex = scanner.nextLine();
        sinhvien.getSex(sex);

        System.out.println(" nhao vao diem Toan:");
        int toan = scanner.nextInt();
        sinhvien.setToan(toan);

        System.out.println("nhap vao diem Ly: ");
        int ly = scanner.nextInt();
        sinhvien.setLy(ly);

        System.out.println("nhap vao diem Hoa: ");
        int hoa = scanner.nextInt();
        sinhvien.setHoa(hoa);

    }


    @Override
    public void sortStudentpoint () {
        for (int i = 0; i < student.size(); i++) {
            for (int j = i + 1; j < student.size(); j++) {
                if (student.get(i).sumNumber() > student.get(j).sumNumber()) {
                    Sinhvien count;
                    count = student.get(i);
                    student.set(i, student.get(j));
                    student.set(j, count);
                }
            }

        }
    }

    @Override
    public void edit () {

    }

    @Override
    public void delete () {

    }


    @Override
    public void sortStudentmasv () {

    }


    @Override
    public void testId () {

    }

    @Override
    public void display () {

    }
}
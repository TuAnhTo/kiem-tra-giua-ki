public class Sinhvien {
    private int maSv;
    private String name;
    private String sex;
    private int toan;
    private int ly;
    private int hoa;

    public Sinhvien (int maSv, String name, String sex, int toan, int ly, int hoa) {
        this.maSv = maSv;
        this.name = name;
        this.sex = sex;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public Sinhvien () {

    }
    // getter va setter
    public int getMaSv () {
        return maSv;
    }

    public void setMaSv (int maSv) {
        this.maSv = maSv;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSex (String sex) {
        return this.sex;
    }

    public void setSex (String sex) {
        this.sex = sex;
    }

    public int getToan (int toan) {
        return this.toan;
    }

    public void setToan (int toan) {
        this.toan = toan;
    }

    public int getLy () {
        return ly;
    }

    public void setLy (int ly) {
        this.ly = ly;
    }

    public int getHoa () {
        return hoa;
    }

    public void setHoa (int hoa) {
        this.hoa = hoa;
    }


    // tinh tong diem 3 mon
    public float sumNumber(){
        return this.getToan(toan) + this.getHoa() + this.getLy();
    }
    //hien thi ra man hinh
    public void display(){
        System.out.println("MSV: " + this.getMaSv());
        System.out.println(" Ten: " + this.getName());
        System.out.println("Gioi tinh: " + this.getSex(sex));
        System.out.println("Diem Toan " + this.getToan(toan) + " Diem Ly: " + this.getLy() + " Diem Hoa: " + this.getHoa());
    }
}
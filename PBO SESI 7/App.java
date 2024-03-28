public class App {
    public static void main(String[] args) {
        Mahasiswa<String> mhs1 = new Mahasiswa<String>("Wafa", "2022");
        Mahasiswa<Integer> mhs2 = new Mahasiswa<Integer>("Wafa", 2022);
        Mahasiswa<Double> mhs3 = new Mahasiswa<Double>("Wafa", 2022.0);

        mhs1.info();
        mhs2.info();
        mhs3.info();

        Concatenation X = new Concatenation();
        X.add(1, "Budi");
        X.add(1, "Budi", "12345");
        X.add(1, "Budi", "12345", "123");
    }
}


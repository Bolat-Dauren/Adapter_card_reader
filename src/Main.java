public class Main {
    public static void main(String[] args) {
        SD_Karta sd_karta = new SD_Karta();

        Memory_Karta memory_Karta = new SD_Karta_Adapter(sd_karta);

        Karta_Reader karta_Reader = new Karta_Reader(memory_Karta);

        karta_Reader.read_Karta();
        karta_Reader.write_Karta();
    }
}
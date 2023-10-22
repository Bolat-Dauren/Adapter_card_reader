// important elegance to illustrate the use of the reminiscence card, SD card, and the cardboard reader
public class Main {
    public static void main(String[] args) {
        // Create an SD card instance
        SD_Karta sd_karta = new SD_Karta();

        // Create an adapter to make the SD card like minded with the reminiscence card interface
        Memory_Karta memory_Karta = new SD_Karta_Adapter(sd_karta);

        // Create a card reader and set it to paintings with the reminiscence card
        Karta_Reader karta_Reader = new Karta_Reader(memory_Karta);

        // carry out read and write operations the usage of the cardboard reader
        karta_Reader.read_Karta();
        karta_Reader.write_Karta();
    }
}
// create a card reader magnificence to have interaction with reminiscence playing cards
class Karta_Reader {
    private Memory_Karta memory_Karta;

    // constructor to set the memory card for use with the cardboard reader
    public Karta_Reader(Memory_Karta memoryCard) {
        this.memory_Karta = memoryCard;
    }

    // technique to study data from the reminiscence card
    public void read_Karta() {
        memory_Karta.readMemory();
    }

    // method to jot down information to the reminiscence card
    public void write_Karta() {
        memory_Karta.writeMemory();
    }
}
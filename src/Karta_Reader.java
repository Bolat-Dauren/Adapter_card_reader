class Karta_Reader {
    private Memory_Karta memory_Karta;

    public Karta_Reader(Memory_Karta memoryCard) {
        this.memory_Karta = memoryCard;
    }

    public void read_Karta() {
        memory_Karta.readMemory();
    }

    public void write_Karta() {
        memory_Karta.writeMemory();
    }
}
// create an adapter magnificence to make the SD card
// compatible with the memory card interface
class SD_Karta_Adapter implements Memory_Karta {
    private SD_Karta sd_karta;
    // constructor to initialize the adapter with an SD card
    public SD_Karta_Adapter(SD_Karta sd_karta) {
        this.sd_karta = sd_karta;
    }
    public void readMemory() {
        // delegate the reminiscence reading operation to the SD card
        sd_karta.readSD_Karta();
    }
    public void writeMemory() {
        // delegate the reminiscence writing operation to the SD card
        sd_karta.writeSD_Karta();
    }
}
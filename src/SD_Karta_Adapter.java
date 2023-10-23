class SD_Karta_Adapter implements Memory_Karta {
    private SD_Karta sd_karta;
    public SD_Karta_Adapter(SD_Karta sd_karta) {
        this.sd_karta = sd_karta;
    }
    public void readMemory() {
        sd_karta.readSD_Karta();
    }
    public void writeMemory() {
        sd_karta.writeSD_Karta();
    }
}
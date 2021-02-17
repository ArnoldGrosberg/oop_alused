public class Lamp {
    private String stiil;
    private boolean sisseLulitatud;

    public Lamp(String stiil, boolean sisseLulitatud) {
        this.stiil = stiil;
        this.sisseLulitatud = sisseLulitatud;
    }

    public String getStiil() {
        return stiil;
    }

    public boolean isSisseLulitatud() {
        return sisseLulitatud;
    }

    public void lulitaSisse() {
        if (!this.sisseLulitatud) {
            this.sisseLulitatud = true;
            System.out.println("Lamp on lülitatud sisse");
        }
    }

}
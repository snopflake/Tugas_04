package LCD;

//Nama  : Nofa Nisrina Salsabila
//NIM   : 235150700111005
//Prodi : Teknolofi Informasi (A)

public class LCD {

    //Deklarasi
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    //Constructor
    public LCD() {

        //Kondisi default LCD
        this.status = "Off";
        this.volume = 50;
        this.brightness = 50;
        this.cable = null;
        
    }

    //Method Status--------------------

    //Method Manyalah
    public void turnOn() { 
        this.status = "On";
    }

    //Method Ded
    public void turnOff() {
        this.status = "Off";
    }

    //Method Brr
    public void Freeze() {
        this.status = "Freeze";
    }

    //Method  Volume-------------------

    //Method ++
    public void volumeUp() {
        this.volume++;
    }

    //Method --
    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    //Method Set Suara Fix
    public void setVolume(int volume) {
        if (volume >= 0) {
            this.volume = volume;
        }
    }

    //Method Kecerahan------------------

    //Method Menuju Aura 1/3 Malam
    public void brightnessUp() {
        this.brightness++;
    }

    //Method Menuju Aura Maghrib
    public void brightnessDown() {
        if(this.brightness > 0) {
            this.brightness--;
        }
    }

    //Method Set Brightness Fix
    public void setBrightness(int brightness) {
        if(this.brightness >= 0) {
            this.brightness = brightness;
        }
    }

    //Method Kabel (Pakai Array)----------

    public void setCable(int option) {
        String[] cableTypes = {
            "VGA",
            "DVI",
            "HDMI",
            "DisplayPort"
        };

        this.cable = cableTypes[option];
    }
    
    //Method Print Output-----------------
    public void displayMessage() {
        System.out.println("LCD Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cable);
    }
     
}
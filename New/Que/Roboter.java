class Roboter {
    private String name;
     int hoehe;
    Roboter nachfolger;

    public Roboter(String name, int hoehe) {
        this.name = name;
        this.hoehe = hoehe;
        this.nachfolger = null;
    }

    public String toString() {
        return "Hallo, ich bin " + name + ", ich bin " + hoehe + " Zentimeter groß.";
    }
}

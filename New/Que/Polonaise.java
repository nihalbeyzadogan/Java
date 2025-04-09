class Polonaise {
    private Roboter start;

    public void anhaengen(Roboter neuer) {
        if (start == null || neuer.hoehe < start.hoehe) {
            neuer.nachfolger = start;
            start = neuer;
        } else {
            Roboter current = start;
            while (current.nachfolger != null && current.nachfolger.hoehe < neuer.hoehe) {
                current = current.nachfolger;
            }
            neuer.nachfolger = current.nachfolger;
            current.nachfolger = neuer;
        }
    }

    public void vorstellen() {
        Roboter current = start;
        while (current != null) {
            System.out.println(current);
            current = current.nachfolger;
        }
    }


    public static void main(String[] args) {
        Polonaise polonaise = new Polonaise();
        polonaise.anhaengen(new Roboter("Robo1", 150));
        polonaise.anhaengen(new Roboter("Robo2", 120));
        polonaise.anhaengen(new Roboter("Robo3", 180));

        polonaise.vorstellen();
    }
} 
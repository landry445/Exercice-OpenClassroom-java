package vehicule;

public class Vehicule {
    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        Bateau bateau = new Bateau();
        
        voiture.start();
        bateau.start();
    }
}

class Vehicules {
    void start() {
        System.out.println("Vrooooooom!");
    }
    
}

class Voiture extends Vehicules {

    @Override
    void start() {
        super.start();
        allumerFeux();
    }
    void allumerFeux() {
        System.out.println("Les feux sont allumés");
    }
}

class Bateau extends Vehicules {
    void start() {
        super.start();
        allumerLampe();
    }

    void allumerLampe() {
        System.out.println("Les lampes sont allumées");
    }
}
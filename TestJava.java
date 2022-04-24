class TestJava {
    public static void main(String[] args) {
        SemaforoSEAV semaforoBasico = new SemaforoSEAV();
        semaforoBasico.cambiarColor();
        semaforoBasico.mostrarEstado();
        semaforoBasico.cambiarColor();
        semaforoBasico.mostrarEstado();
        semaforoBasico.cambiarColor();
        semaforoBasico.mostrarEstado();
        semaforoBasico.cambiarColor();
        semaforoBasico.mostrarEstado();
        semaforoBasico.cambiarColor();
        semaforoBasico.mostrarEstado();
        semaforoBasico.cambiarColor();
        semaforoBasico.mostrarEstado();
        semaforoBasico.cambiarColor();
        semaforoBasico.mostrarEstado();
        semaforoBasico.cambiarColor();

        semaforoBasico.mostrarVecesQueSemaforoCambio();

    }
}

interface ISemaforo {
    public void cambiarColor();

    public void mostrarEstado();
}

class SemaforoSEBA implements ISemaforo {

    private boolean esRojo = true;
    private boolean esAmarillo = false;
    private boolean esVerde = false;

    public void cambiarColor() {
        if (esAmarillo && !esVerde) {
            esRojo = true;
            esAmarillo = false;
            esVerde = false;
        } else if (!esRojo && esVerde) {
            esAmarillo = true;
            esVerde = false;
            esRojo = false;
        } else {
            esVerde = true;
            esRojo = false;
            esAmarillo = false;
        }
    }

    public void mostrarEstado() {
        if (esRojo) {
            System.out.println("ROJO");
        } else if (esAmarillo) {
            System.out.println("AMARILLO");
        } else {
            System.out.println("VERDE");
        }

    }

}

class SemaforoSEES implements ISemaforo {

    private boolean esRojo = true;
    private boolean esAmarillo = false;
    private boolean esVerde = false;
    private int vecesQueSemaforoCambio = 0;

    public void cambiarColor() {
        if (esAmarillo && !esVerde) {
            esRojo = true;
            esAmarillo = false;
            esVerde = false;
        } else if (!esRojo && esVerde) {
            esAmarillo = true;
            esVerde = false;
            esRojo = false;
        } else {
            esVerde = true;
            esRojo = false;
            esAmarillo = false;
        }

        vecesQueSemaforoCambio++;
    }

    public void mostrarEstado() {
        if (esRojo) {
            System.out.println("ROJO");
        } else if (esAmarillo) {
            System.out.println("AMARILLO");
        } else {
            System.out.println("VERDE");
        }
    }

    public void mostrarVecesQueSemaforoCambio() {
        System.out.println("El semáforo cambió: " + vecesQueSemaforoCambio + " veces.");
    }

}

class SemaforoSEAV implements ISemaforo {

    private boolean esRojo = true;
    private boolean esAmarillo = false;
    private boolean esVerde = false;
    private int rojos = 0;
    private int verdes = 0;
    private int amarillos = 0;

    public void cambiarColor() {
        if (esAmarillo && !esVerde) {
            esRojo = true;
            esAmarillo = false;
            esVerde = false;

            rojos++;
        } else if (!esRojo && esVerde) {
            esAmarillo = true;
            esVerde = false;
            esRojo = false;

            amarillos++;
        } else {
            esVerde = true;
            esRojo = false;
            esAmarillo = false;

            verdes++;
        }

    }

    public void mostrarEstado() {
        if (esRojo) {
            System.out.println("ROJO");
        } else if (esAmarillo) {
            System.out.println("AMARILLO");
        } else {
            System.out.println("VERDE");
        }
    }

    public void mostrarVecesQueSemaforoCambio() {
        System.out.println("El semaforo cambió " + verdes + " veces a verde");
        System.out.println("El semaforo cambió " + amarillos + " veces a amarillo");
        System.out.println("El semaforo cambió " + rojos + " veces a rojo");

    }

}

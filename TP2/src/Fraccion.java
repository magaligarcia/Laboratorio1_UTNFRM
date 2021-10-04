public class Fraccion {

    int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {
        numerador = this.numerador;
        if (denominador == 0) {
            denominador = 1;
        }
        denominador = this.denominador;
        simplificar();
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    // Contructor
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    //Getters & Setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        simplificar();
        return numerador + "/" + denominador;
    }

    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2) {

        Fraccion f = new Fraccion();
        f.setDenominador(f1.getDenominador() * f2.getDenominador());
        f.setNumerador((f2.getDenominador() * f1.getNumerador()) + (f2.getNumerador() * f1.getDenominador()));
        f.simplificar();
        return f;
    }

    public Fraccion restarFracciones(Fraccion f1, Fraccion f2) {
        Fraccion f = new Fraccion();
        int denominador1 = f1.getDenominador();
        int denominador2 = f2.getDenominador();

        if (denominador1 == denominador2) {
            f.setDenominador(f1.getDenominador());
        } else {
            f.setDenominador(f1.getDenominador() * f2.getDenominador());
        }
        f.setNumerador((f1.getNumerador() * f2.getDenominador()) - (f2.getNumerador() * f1.getDenominador()));
        f.simplificar();
        return f;
    }

    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2) {
        Fraccion f = new Fraccion();

        f.setNumerador(f1.getNumerador() * f2.getNumerador());
        f.setDenominador(f1.getDenominador() * f2.getDenominador());
        f.simplificar();
        return f;
    }

    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2) {
        Fraccion f = new Fraccion();
        f.setNumerador(f1.getNumerador() * f2.getDenominador());
        f.setDenominador(f1.getDenominador() * f2.getNumerador());
        f.simplificar();
        return f;
    }

    //Máximo común divisor
    private int mcd() {
        int n = Math.abs(numerador); //valor absoluto del numerador
        int d = Math.abs(denominador); //valor absoluto del denominador
        if (d == 0) {
            return n;
        }
        int r;
        while (d != 0) {
            r = n % d;
            n = d;
            d = r;
        }
        return n;
    }

    private void simplificar() {
        int n = mcd();
        numerador = numerador / n;
        denominador = denominador / n;
    }

}
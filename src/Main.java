public class Main {
    public static void main(String[] args) {
myHeroe Fabiola = new myHeroe(100, 50, "Fabiola" , "Fabi" , "fuerza, invisible, vuela", "rosa", 21 , "Española");

Fabiola.volverseTransparente();
Fabiola.hablar();
Fabiola.moverse();
Fabiola.usarMente();
Fabiola.usarMnos();
Fabiola.ataque();
Fabiola.miSuperPoder();

        System.out.println("apodo:" + Fabiola.apodo + " Poder: " + Fabiola.poderes + " Color traje: " + Fabiola.colortraje);
        System.out.println("Energia restante " + Fabiola.getEnergia());
        System.out.println("Salud restante " + Fabiola.getSalud());
    }
}

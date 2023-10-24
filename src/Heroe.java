public class Heroe implements  Action {
    private int salud;
    private int energia;



    @Override
    public void usarMnos() {
        System.out.println("usando la mente");
    }

    @Override
    public void sarPies() {
        System.out.println("Usando los pies");

    }

    @Override
    public void moverse() {
        System.out.println("moviendome");
    }

    @Override
    public void saltar() {
        System.out.println("saltando");
    }

    @Override
    public void hablar() {
        System.out.println("hablando");
    }

    @Override
    public void usarMente() {
        System.out.println("usando la mente");
    }

    public Heroe(int salud, int energia) {
        this.salud = salud;
        this.energia = energia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}

public class myHeroe extends Heroe {
    String nombre;
    String apodo;
    String poderes;
    String colortraje;
    int edad;
    String nacionalidad;

    public myHeroe(int salud, int energia, String nombre, String apodo, String poderes, String colortraje, int edad, String nacionalidad) {
        super(salud, energia);
        this.nombre = nombre;
        this.apodo = apodo;
        this.poderes = poderes;
        this.colortraje = colortraje;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public void volar(){
        moverse();
    }
    public void invisible(){
        usarMente();
        hablar();
    }
    public  void superFuerza(){
        usarMnos();
    }


    public void volverseTransparente(){

    }

    public void miSuperPoder(){
        setEnergia(getEnergia() - 1);
        this.usarMente();
        this.hablar();
        this.volverseTransparente();
    }

    public void ataque(){
        setSalud(getSalud() - 10);
    }
}

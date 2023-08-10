package controle.interfaces;

public interface Controlador {

    public boolean ligar();
    public boolean menu();
    public int volume(boolean mais);
    public boolean mudo();
    public boolean play();
    public int canal(boolean mais);
    public int canal(int num);
}

package controle.television;

import controle.interfaces.Controlador;

import java.util.List;

public class ControleRemoto implements Controlador {
    private boolean ligado;
    private boolean menu;
    private boolean mudo;
    private boolean parado;
    private int volume;
    private int canal;
    private final List<Integer> canais;
    private final int volumeMaximo;
    @Override
    public boolean ligar() {
        setLigado(!isLigado());
        return !isLigado();
    }

    @Override
    public boolean menu() {
        setMenu(!isMenu());
        return !isMenu();
    }

    @Override
    public int volume(boolean mais) {
        if (mais) {
            setVolume(getVolume() == volumeMaximo ? volumeMaximo : getVolume() + 1);
            return getVolume() == volumeMaximo ? volumeMaximo : getVolume() + 1;
        } else {
            setVolume(getVolume() == 0 ? 0 : getVolume() - 1);
            return getVolume() == 0 ? 0 : getVolume() - 1;
        }
    }

    @Override
    public boolean mudo() {
        setMudo(!isMudo());
        return !isMudo();
    }

    @Override
    public boolean play() {
        setParado(!isParado());
        return !isParado();
    }

    // retorna o Índice do canal na lista de canais
    @Override
    public int canal(boolean mais) {
        if (mais) {
            int proximo = canais.indexOf(getCanal() + 1);
            setCanal(canais.size() > proximo ? proximo : 0);
            return canais.size() > proximo ? proximo : 0;
        } else {
            int anterior = canais.indexOf(getCanal() - 1);
            setCanal(anterior < 0 ? canais.size() - 1 : anterior);
            return anterior < 0 ? canais.size() - 1 : anterior;
        }
    }

    // retorna o Índice do canal na lista de canais
    @Override
    public int canal(int num) {
        if (canais.contains(num)) {
            setCanal(canais.indexOf(num));
            return canais.indexOf(num);
        }
        setCanal(canais.indexOf(getCanal()));
        return canais.indexOf(getCanal());
    }

    public ControleRemoto(List canais, int volumeMaximo) {
        this.canais = canais;
        this.volumeMaximo = volumeMaximo;
        this.ligado = false;
        this.menu = false;
        this.mudo = false;
        this.parado = false;
        this.volume = 10;
        this.canal = (int) canais.get(0);
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    public boolean isMudo() {
        return mudo;
    }

    public void setMudo(boolean mudo) {
        this.mudo = mudo;
    }

    public boolean isParado() {
        return parado;
    }

    public void setParado(boolean parado) {
        this.parado = parado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
}

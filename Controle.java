public class Controle {
    public class Controle {
    private TV tv;

    public Controle(TV tv) {
        this.tv = tv;
    }

    public void ligar() {
        tv.ligar();
    }

    public void desligar() {
        tv.desligar();
    }

    public void aumentarVolume() {
        if (!tv.isLigada()) {
            System.out.println("A TV está desligada. Ligue-a antes de ajustar o volume.");
            return;
        }
        tv.aumentarVolume();
        System.out.println("Volume: " + tv.getVolume());
    }

    public void diminuirVolume() {
        if (!tv.isLigada()) {
            System.out.println("A TV está desligada. Ligue-a antes de ajustar o volume.");
            return;
        }
        tv.diminuirVolume();
        System.out.println("Volume: " + tv.getVolume());
    }

    public void proximoCanal() {
        if (!tv.isLigada()) {
            System.out.println("A TV está desligada. Ligue-a antes de trocar o canal.");
            return;
        }
        tv.proximoCanal();
        System.out.println("Canal atual: " + tv.getCanalAtual());
    }

    public void canalAnterior() {
        if (!tv.isLigada()) {
            System.out.println("A TV está desligada. Ligue-a antes de trocar o canal.");
            return;
        }
        tv.canalAnterior();
        System.out.println("Canal atual: " + tv.getCanalAtual());
    }

    public void escolherCanal(int numero) {
        if (!tv.isLigada()) {
            System.out.println("A TV está desligada. Ligue-a antes de trocar o canal.");
            return;
        }
        tv.trocarCanal(numero);
        System.out.println("Canal atual: " + tv.getCanalAtual());
    }

    public void listarCanais() {
        if (!tv.isLigada()) {
            System.out.println("A TV está desligada. Ligue-a para listar os canais.");
            return;
        }
        tv.listarCanais();
    }

    public void verInfo() {
        if (!tv.isLigada()) {
            System.out.println("A TV está desligada.");
            return;
        }
        tv.verInfo();
    }
}
}

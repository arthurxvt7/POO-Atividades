public class TV {
    import java.util.ArrayList;
import java.util.List;
    private int volume;
    private boolean ligada;
    private List<Canal> canais;
    private Canal canalAtual;
    private int idTV;

    public TV(int idTV) {
        this.idTV = idTV;
        this.volume = 10; 
        this.ligada = false;
        this.canais = new ArrayList<>();
    }

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV desligada.");
    }

    public void adicionarCanal(Canal canal) {
        canais.add(canal);
        if (canalAtual == null) {
            canalAtual = canal;
        }
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
        }
    }

    public void trocarCanal(int numero) {
        if (ligada) {
            for (Canal c : canais) {
                if (c.getNumero() == numero) {
                    canalAtual = c;
                    return;
                }
            }
            System.out.println("Canal não encontrado.");
        }
    }

    public void proximoCanal() {
        if (ligada && !canais.isEmpty()) {
            int index = canal.atual(canalAtual);
            canalAtual = canais.get((index + 1) % canais.size());
        }
    }

    public void canalAnterior() {
        if (ligada && !canais.isEmpty()) {
            int index = canais.indexOf(canalAtual);
            canalAtual = canais.get((index - 1 + canais.size()) % canais.size());
        }
    }

    public void listarCanais() {
        if (ligada) {
            for (Canal c : canais) {
                System.out.println(c);
            }
        }
    }

    public void verInfo() {
        if (ligada) {
            System.out.println("TV " + idTV);
            System.out.println("Volume: " + volume);
            System.out.println("Canal atual: " + canalAtual);
        }
    }

    
    public Canal getCanalAtual() {
        return canalAtual;
    }

    public int getVolume() {
        return volume;
    }

    public int getIdTV() {
        return idTV;
    }

    public boolean isLigada() {
        return ligada;
    }

    
}
}

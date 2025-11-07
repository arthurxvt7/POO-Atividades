public class Principal {
    import java.util.Scanner;

{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
    TV tv = new TV(1);
    Controle controle = new Controle(tv);

        // adicionar alguns canais
        tv.adicionarCanal(new Canal(2, "SBT"));
        tv.adicionarCanal(new Canal(4, "Band"));
        tv.adicionarCanal(new Canal(5, "Record"));
        tv.adicionarCanal(new Canal(7, "Globo"));

    
    System.out.println("Tentando aumentar volume com a TV desligada (deve ser bloqueado):");
    controle.aumentarVolume();

    controle.ligar();
    System.out.println("Agora a TV está ligada. Repetindo ações:");
    controle.aumentarVolume();
    controle.proximoCanal();
    controle.verInfo();

    boolean sair = false;

        while (!sair) {
            System.out.println("\n--- MENU TV ---");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Aumentar volume");
            System.out.println("4 - Diminuir volume");
            System.out.println("5 - Trocar para próximo canal");
            System.out.println("6 - Trocar para canal anterior");
            System.out.println("7 - Escolher canal por número");
            System.out.println("8 - Listar canais");
            System.out.println("9 - Ver informações da TV");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int opc = -1;
            try {
                opc = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida");
                continue;
            }

            switch (opc) {
                case 1:
                    controle.ligar();
                    break;
                case 2:
                    controle.desligar();
                    break;
                case 3:
                    controle.aumentarVolume();
                    break;
                case 4:
                    controle.diminuirVolume();
                    break;
                case 5:
                    controle.proximoCanal();
                    break;
                case 6:
                    controle.canalAnterior();
                    break;
                case 7:
                    System.out.print("Digite o número do canal: ");
                    try {
                        int num = Integer.parseInt(sc.nextLine());
                        controle.escolherCanal(num);
                    } catch (NumberFormatException e) {
                        System.out.println("Número inválido");
                    }
                    break;
                case 8:
                    controle.listarCanais();
                    break;
                case 9:
                    controle.verInfo();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

        sc.close();
        System.out.println("Programa finalizado.");
    }
}
}

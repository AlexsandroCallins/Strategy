import java.util.Scanner;

public class Usuario {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int op;

    Jogo jogo = new Jogo();
    System.out.println("Jogo iniciado!");

    System.out.print("Nível inicial: ");
    jogo.jogar();

    System.out.println("Escolha uma opção e altere o nível do jogo.");

    System.out.println("1 - Nível fácil!");
    System.out.println("2 - Nível Médio!");
    System.out.println("3 - Nível Difícil!");

    System.out.print("Opção:");
    System.out.println(op = in.nextInt());

    switch (op) {
      case 1:
        jogo.setStrategy(new FacilStrategy());
        System.out.print("Nível inicial: ");
        jogo.jogar();
        break;
      case 2:
        jogo.setStrategy(new MedioStrategy());
        System.out.print("Nível atual: ");
        jogo.jogar();
        break;
      case 3:
        jogo.setStrategy(new DificilStrategy());
        System.out.print("Nível atual: ");
        jogo.jogar();
        break;
      default:
        System.out.println("Opção incorreta!");
        break;
    }
  }
}
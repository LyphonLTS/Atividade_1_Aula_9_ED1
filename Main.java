import java.util.Scanner;

import Controller.StringStack;

class Main {
  public static void main(String[] args) {
    String texto1 = "ESTE EXERCICIO E MUITO FACIL";
    String texto2 = "UM CIENTISTA DA COMPUTAÇAO E UM TECNOLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
    String texto3 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";
    int option = 0;
    Scanner scanner = new Scanner(System.in);

    do {
      String reversedString = "";

      System.out.println("\t\tMenu do *inversor de textos*");
      System.out.println("1 - " + texto1);
      System.out.println("2 - " + texto2);
      System.out.println("3 - " + texto3);
      System.out.println("0 - Sair");
      System.out.print("Digite o número referente ao texto desejado para inversão: ");
      option = Integer.parseInt(scanner.nextLine());

      System.out.println();

      switch (option) {
        case 0:
          reversedString = "Encerrando o programa!";
          break;
        case 1:
          reversedString = reverseLetters(texto1);
          break;

        case 2:
          reversedString = reverseLetters(texto2);
          break;

        case 3:
          reversedString = reverseLetters(texto3);
          break;

        default:
          reversedString = "Opção incorreta digitada! Fim do programa!";
          break;
      }

      // Exibir as palavras invertidas na posição correta
      System.out.println("##\t" + reversedString + "\t##\n");
    } while (1 <= option && option <= 3);

    scanner.close();
  }

  public static String reverseLetters(String text) {
    StringStack originalStack = new StringStack();
    StringStack reversedStack = new StringStack();
    String reversedString = "";

    // Separar as palavras
    for (String word : text.split(" ")) {
      originalStack.push(" " + word);
    }

    // Separar as letras e inverte-las
    for (int i = originalStack.getTop(); -1 < i; i--) {
      for (String letter : originalStack.getWords().get(i).split("")) {
        reversedStack.push(letter);
      }
    }

    for (int i = reversedStack.getTop(); 0 < i; i--) {
      reversedString += reversedStack.pop();
    }

    return reversedString;
  }
}
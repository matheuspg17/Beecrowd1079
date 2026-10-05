
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] lista;
        String linha;
        int controle;
        double num1, num2, num3, media;

        controle = leia.nextInt();
        leia.nextLine();

        for (int i = 0; i < controle; i++) {
            linha = leia.nextLine();
            lista = linha.split(" ");
            num1 = Double.parseDouble(lista[0]);
            num2 = Double.parseDouble(lista[1]);
            num3 = Double.parseDouble(lista[2]);

            media = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10;
            System.out.printf("%.1f\n", media);
        }
    }
}

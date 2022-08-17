import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int horas;

        System.out.print("Digite a hora atual: ");
        horas = scanner.nextInt();
        
        if(horas < 12){
            System.out.println("bom dia");
        } else if(horas >= 12 && horas<18){
            System.out.println("boa tarde");
        } else if (horas >= 18 && horas < 24){
            System.out.println("Boa noite");
        } else {
            System.out.println("valor invalido");
        }
        scanner.close();
    }
}

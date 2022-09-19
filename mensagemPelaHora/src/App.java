import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDateTime hora = LocalDateTime.now();

        if(hora.getHour() >= 5 && hora.getHour() <= 12){
            dia();
        }else if(hora.getHour() >= 11 && hora.getHour() <= 18){
            tarde();
        }else{
            noite();
        }
        
    }

    public static void dia() {
        System.out.println("Bom dia");
    }

    public static void tarde() {
        System.out.println("Boa tarde");
    }

    public static void noite() {
        System.out.println("Boa noite");
    }
}

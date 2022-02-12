package uaslp.objetos.parcial1.time;

public class Main {

    public static void main(String[] args) {

        System.out.println("Inicializamos el reloj");
        Time time = new Time(0, 0, 0);
        System.out.println(time.toString());
        System.out.println("Sumamos 90 segundos (1 minuto y medio)");
        time.addSecond(90);
        System.out.println(time.toString());
        System.out.println("Sumamos 90 minutos (1 hora y media)");
        time.addMinute(90);
        System.out.println(time.toString());
        System.out.println("Sumamos 23 horas (debería de ya ser el otro dia con 31 min y 30 segundos)");
        time.addHour(23);
        System.out.println(time.toString());

        System.out.println("Aqui metemos una hora que no es valida 24:33:11");
        time.setTime(24,33,11);

        System.out.println("hora:");
        System.out.println(time.getHour());
        System.out.println("minuto:");
        System.out.println(time.getMinute());
        System.out.println("segundo:");
        System.out.println(time.getSecond());

    }
}

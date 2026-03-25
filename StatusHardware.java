// Primeiro código Java do Sallyz-dev
public class StatusHardware {
    public static void main(String[] args) {
        String desenvolvedor = "Alyson Sousa Brandão";
        int ramDisponivel = 16; // Simulação em GB
        boolean sistemaPronto = true;

        System.out.println("--- Sistema Sallyz-dev Inicializado ---");
        System.out.println("Desenvolvedor: " + desenvolvedor);
        System.out.println("Memória RAM detectada: " + ramDisponivel + "GB");
        
        if (sistemaPronto) {
            System.out.println("Status: Pronto para compilar Java e JS!");
        } else {
            System.out.println("Status: Verificando componentes...");
        }
    }
}

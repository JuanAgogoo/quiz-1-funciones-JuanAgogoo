package quiz1sistemasg2;

public class quiz1sistemasg2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingrese el tipo de vehiculo estacionado( C, M o B): ");
        String tipoVehiculo =  scanner.nextLine();

        System.out.println("Ingrese la cantidad de horas de permanencia ");
        int horas = scanner.nextLine();

        System.out.println("¿Es estudiante?(1: Si, 2: No) : ");
        int esEstudiante = scanner.nextint();

        boolean esEstudianteBoolean = (esEstudiante == 1);
        double valorBase = calcularValorHora(tipoVehiculo, horas);

        double valorAntesDescuentos = valorBase;
        double valorConDescuento = calcularDescuentos(valorAntesDescuentos, horas, esEstudianteBoolean);

        double iva = valorConDescuento * 0.19;
        double valorTotalFactura = valorConDescuento + iva;

        System.out.println("\nFactura del parqueadero:");
        System.out.println("Tipo de vehículo estacionado: " + tipoVehiculo);
        System.out.println("Horas de permanencia: " + horas);
        System.out.println("Valor total antes de descuentos: $" + valorAntesDescuentos);
        System.out.println("Valor total después de descuentos: $" + valorConDescuento);
        System.out.println("Valor total de la factura (incluyendo IVA 19%): $" + valorTotalFactura);
 
        scanner.close();

    }

    public static double calcularValorHora(char tipoVehiculo, int horas) {

        double tarifaPorHora;
        switch (tipoVehiculo) {

            case 'C':

                tarifaPorHora = 5000;

                break;

            case 'M':

                tarifaPorHora = 3000;

                break;

            case 'B':

                tarifaPorHora = 1000;

                break;

                double valorTotal;

                if (horas <= 3) {
        
                    valorTotal = tarifaPorHora * horas;
        
                } else {
        
                    valorTotal = (tarifaPorHora * 3) + ((horas - 3) * (tarifaPorHora + 2000));
        
                }
         
                return valorTotal;
        
            }

             double calcularDescuentos (double valorTotal, int horas, boolean esEstudiante) {

                if (horas > 4) {

                    valorTotal *= 0.7;  


                    if (esEstudiante) {
            
                        valorTotal *= 0.95; 
            
                    }
             
                    return valorTotal;
            
                }
            
            }
            
        
        

        



    }
}
 

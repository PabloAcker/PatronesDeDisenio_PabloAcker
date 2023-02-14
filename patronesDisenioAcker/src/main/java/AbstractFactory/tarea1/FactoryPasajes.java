package AbstractFactory.tarea1;

public class FactoryPasajes {
    public static Pasajes make(String type){

        Pasajes pasajes;
        switch (type.toLowerCase()) {
            case "pasajestandard1" -> {
                pasajes = new PasajeStandard();
                ((PasajeStandard)pasajes).setAvion(new Avion("Nedforce 69", "200 pasajeros", "Airbus 300", "170 asientos"));
                ((PasajeStandard)pasajes).setPasajero(new Pasajero("Ema",9641944));
                ((PasajeStandard)pasajes).setOrigen(new Origen("Bolivia","La Paz", "Aeropuerto Internacional El Alto"));
                ((PasajeStandard)pasajes).setDestino(new Destino("Bolivia", "Santa Cruz", "Viru Viru"));
                pasajes.setNumeroAsiento(14);
                pasajes.setNumeroVuelo(672);
                ((PasajeStandard)pasajes).setCostoPasaje(200);
            }
            case "pasajestandard2" -> {
                pasajes = new PasajeStandard();
                ((PasajeStandard)pasajes).setAvion(new Avion("Nedforce 69", "200 pasajeros", "Airbus 300", "170 asientos"));
                ((PasajeStandard)pasajes).setPasajero(new Pasajero("Andres",2017492));
                ((PasajeStandard)pasajes).setOrigen(new Origen("Bolivia","La Paz", "Aeropuerto Internacional El Alto"));
                ((PasajeStandard)pasajes).setDestino(new Destino("Bolivia", "Santa Cruz", "Viru Viru"));
                pasajes.setNumeroAsiento(23);
                pasajes.setNumeroVuelo(672);
                ((PasajeStandard)pasajes).setCostoPasaje(200);
            }
            case "pasajesolidario1" -> {
                pasajes = new PasajeSolidario();
                ((PasajeSolidario)pasajes).setAvion(new Avion("Nedforce 69", "200 pasajeros", "Airbus 300", "170 asientos"));
                ((PasajeSolidario)pasajes).setPasajero(new Pasajero("Lagu",39691464));
                ((PasajeSolidario)pasajes).setOrigen(new Origen("Bolivia","La Paz", "Aeropuerto Internacional El Alto"));
                ((PasajeSolidario)pasajes).setDestino(new Destino("Bolivia", "Santa Cruz", "Viru Viru"));
                pasajes.setNumeroVuelo(450);
                pasajes.setNumeroAsiento(32);
                ((PasajeSolidario)pasajes).setCostoPasaje(150);
                ((PasajeSolidario)pasajes).setDescuento(30);
                ((PasajeSolidario)pasajes).setMotivoDescuento("Economia");
            }
            case "pasajesolidario2" -> {
                pasajes = new PasajeSolidario();
                ((PasajeSolidario)pasajes).setAvion(new Avion("Nedforce 69", "200 pasajeros", "Airbus 300", "170 asientos"));
                ((PasajeSolidario)pasajes).setPasajero(new Pasajero("Mauricio",6914391));
                ((PasajeSolidario)pasajes).setOrigen(new Origen("Bolivia","La Paz", "Aeropuerto Internacional El Alto"));
                ((PasajeSolidario)pasajes).setDestino(new Destino("Bolivia", "Santa Cruz", "Viru Viru"));
                pasajes.setNumeroVuelo(450);
                pasajes.setNumeroAsiento(70);
                ((PasajeSolidario)pasajes).setCostoPasaje(150);
                ((PasajeSolidario)pasajes).setDescuento(30);
                ((PasajeSolidario)pasajes).setMotivoDescuento("Economia");
            }
            case "pasajeinfantes1" -> {
                pasajes = new PasajeInfantes();
                ((PasajeInfantes)pasajes).setAvion(new Avion("Nedforce 69", "200 pasajeros", "Airbus 300", "170 asientos"));
                ((PasajeInfantes)pasajes).setPasajero(new Pasajero("Nico",7016349));
                ((PasajeInfantes)pasajes).setOrigen(new Origen("Bolivia","La Paz", "Aeropuerto Internacional El Alto"));
                ((PasajeInfantes)pasajes).setDestino(new Destino("Bolivia", "Santa Cruz", "Viru Viru"));
                pasajes.setNumeroVuelo(320);
                pasajes.setNumeroAsiento(24);
                ((PasajeInfantes)pasajes).setCostoEspecial(100);
            }
            case "pasajeinfantes2" -> {
                pasajes = new PasajeInfantes();
                ((PasajeInfantes)pasajes).setAvion(new Avion("Nedforce 69", "200 pasajeros", "Airbus 300", "170 asientos"));
                ((PasajeInfantes)pasajes).setPasajero(new Pasajero("Julian",8013491));
                ((PasajeInfantes)pasajes).setOrigen(new Origen("Bolivia","La Paz", "Aeropuerto Internacional El Alto"));
                ((PasajeInfantes)pasajes).setDestino(new Destino("Bolivia", "Santa Cruz", "Viru Viru"));
                pasajes.setNumeroVuelo(320);
                pasajes.setNumeroAsiento(84);
                ((PasajeInfantes)pasajes).setCostoEspecial(100);
            }
            default -> {
                pasajes = new PasajeStandard();
                ((PasajeStandard)pasajes).setAvion(new Avion("Nedforce 69", "200 pasajeros", "Airbus 300", "170 asientos"));
                ((PasajeStandard)pasajes).setPasajero(new Pasajero("EmaDefault",9641944));
                ((PasajeStandard)pasajes).setOrigen(new Origen("Bolivia","La Paz", "Aeropuerto Internacional El Alto"));
                ((PasajeStandard)pasajes).setDestino(new Destino("Bolivia", "Santa Cruz", "Viru Viru"));
                pasajes.setNumeroAsiento(14);
                pasajes.setNumeroVuelo(672);
                ((PasajeStandard)pasajes).setCostoPasaje(200);
            }
        }
        return pasajes;
    }
}

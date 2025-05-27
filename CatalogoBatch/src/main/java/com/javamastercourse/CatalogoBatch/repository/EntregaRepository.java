package com.javamastercourse.CatalogoBatch.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javamastercourse.CatalogoBatch.model.Entrega;

@Repository
public class EntregaRepository {

    List<Entrega> entregas = new ArrayList<>(Arrays.asList(
        new Entrega(1, "Información de contribuyentes", "Formulario A", "SAT", "Anual", Arrays.asList("RFC", "Nombre", "Domicilio")),
        new Entrega(2, "Declaración de ingresos", "Formulario B", "Contador", "Mensual", Arrays.asList("Ingresos", "Deducciones", "Periodo")),
        new Entrega(3, "Pago de impuestos", "Formulario C", "Tesorería", "Trimestral", Arrays.asList("Monto", "Fecha de pago", "Referencia")),
        new Entrega(4, "Actualización de domicilio", "Formulario D", "Usuario", "Eventual", Arrays.asList("Nuevo domicilio", "Fecha de cambio")),
        new Entrega(5, "Solicitud de devolución", "Formulario E", "SAT", "Anual", Arrays.asList("Importe solicitado", "Motivo", "Cuenta bancaria"))
    ));

    public List<Entrega> findAll() {
        System.out.println("estoy buscnado");
        return entregas;
    }

    public void save(Entrega entrega) {
        entregas.add(entrega);
    }   
}

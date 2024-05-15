package com.example.ordenesservice.Ordenes.Application.UseCase.Orden;

import com.example.ordenesservice.Ordenes.Domain.Entities.Orden;
import com.example.ordenesservice.Ordenes.Domain.Ports.IOrdenPort;
import com.example.ordenesservice.Ordenes.Infrestructure.dtos.requests.CreateOrdenRequest;
import com.example.ordenesservice.Ordenes.Infrestructure.dtos.responses.OrdenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateOrdenUseCase {

    @Autowired
    IOrdenPort repository;

    public OrdenResponse run(CreateOrdenRequest request) {
        Orden orden = new Orden();
        orden.setFecha(request.getFecha());
        orden.setStatus(request.getStatus());
        orden.setTotal(request.getTotal());
        return repository.Crear(orden);
    }

}

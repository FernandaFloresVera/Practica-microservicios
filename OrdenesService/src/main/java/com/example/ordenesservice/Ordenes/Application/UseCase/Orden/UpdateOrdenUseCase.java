package com.example.ordenesservice.Ordenes.Application.UseCase.Orden;

import com.example.ordenesservice.Ordenes.Domain.Ports.IOrdenPort;
import com.example.ordenesservice.Ordenes.Infrestructure.dtos.requests.UpdateOrdenRequest;
import com.example.ordenesservice.Ordenes.Infrestructure.dtos.responses.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateOrdenUseCase {

    @Autowired
    IOrdenPort repository;

    public BaseResponse run(UpdateOrdenRequest request){
        return repository.ActualizarStatus(request.getId(), request.getStatus());
    }
}

package com.example.ordenesservice.Ordenes.Infrestructure.Controllers.Orden;

import com.example.ordenesservice.Ordenes.Application.UseCase.Orden.UpdateOrdenUseCase;
import com.example.ordenesservice.Ordenes.Infrestructure.dtos.requests.UpdateOrdenRequest;
import com.example.ordenesservice.Ordenes.Infrestructure.dtos.responses.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ordenes")
public class UpdateOrdenController {

    @Autowired
    private UpdateOrdenUseCase useCase;

    @PutMapping
    public BaseResponse update(@RequestBody UpdateOrdenRequest request) {return useCase.run(request);}

}

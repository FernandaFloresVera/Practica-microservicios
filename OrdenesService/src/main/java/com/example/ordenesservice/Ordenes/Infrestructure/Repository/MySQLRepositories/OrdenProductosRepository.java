package com.example.ordenesservice.Ordenes.Infrestructure.Repository.MySQLRepositories;

import com.example.ordenesservice.Ordenes.Domain.Entities.OrdenProductos;
import com.example.ordenesservice.Ordenes.Domain.Ports.IOrdenProductosPort;
import com.example.ordenesservice.Ordenes.Infrestructure.Models.MySQLModels.MySQLOrdenProductosModel;
import com.example.ordenesservice.Ordenes.Infrestructure.dtos.responses.OrdenProductosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrdenProductosRepository implements IOrdenProductosPort {

    @Autowired
    OrdenRepository ordenRepository = new OrdenRepository();

    @Override
    public OrdenProductosResponse CrearOrdenProducto(OrdenProductos ordenProductos) {
        MySQLOrdenProductosModel model = new MySQLOrdenProductosModel();
        model.setId(ordenProductos.getId());
        model.setProducto_id(ordenProductos.getProductoId());
        model.setOrden(ordenRepository.findAndEnsureExist(ordenProductos.getOrdenId()));
        model.setCantidad(ordenProductos.getCantidad());
        return from(model);
    }

    OrdenProductosResponse from(MySQLOrdenProductosModel ordenProductos) {
        OrdenProductosResponse resp = new OrdenProductosResponse();
        resp.setId(ordenProductos.getId());
        resp.setProductoId(ordenProductos.getProducto_id());
        resp.setOrdenId(ordenProductos.getOrden().getId());
        resp.setCantidad(ordenProductos.getCantidad());
        resp.setTotal(ordenProductos.getTotal());
        return resp;
    }
}

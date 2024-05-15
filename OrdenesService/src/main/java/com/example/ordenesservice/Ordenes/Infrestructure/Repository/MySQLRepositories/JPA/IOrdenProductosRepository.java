package com.example.ordenesservice.Ordenes.Infrestructure.Repository.MySQLRepositories.JPA;

import com.example.ordenesservice.Ordenes.Infrestructure.Models.MySQLModels.MySQLOrdenProductosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrdenProductosRepository extends JpaRepository<MySQLOrdenProductosModel, String> {
}

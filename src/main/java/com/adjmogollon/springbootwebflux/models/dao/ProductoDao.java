package com.adjmogollon.springbootwebflux.models.dao;

import com.adjmogollon.springbootwebflux.models.documents.Producto;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoDao extends ReactiveMongoRepository<Producto, String> {

}

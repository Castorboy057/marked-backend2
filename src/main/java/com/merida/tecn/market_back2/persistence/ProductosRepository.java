package com.merida.tecn.market_back2.persistence;

import com.merida.tecn.market_back2.persistence.crud.ProductosCrudRepository;
import com.merida.tecn.market_back2.persistence.entity.Producto;

import java.util.List;

public class ProductosRepository {
    private ProductosCrudRepository productosCrudRepository;

    public List<Producto> getAll(){
      return (List<Producto>) productosCrudRepository.findAll();
    }


}

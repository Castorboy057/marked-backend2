package com.merida.tecn.market_back2.persistence.crud;

import com.merida.tecn.market_back2.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductosCrudRepository extends CrudRepository<Producto, Integer> {
}

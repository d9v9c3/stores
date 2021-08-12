package com.team.stores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team.stores.entity.Producto;

@Repository
public interface ProductoRepo extends JpaRepository<Producto, Integer> {

}

package com.team.stores.service;

import java.util.List;
import java.util.Optional;

import com.team.stores.entity.Producto;

public interface IProductoService {

	public void SaveProduct(Producto prd);
	public List<Producto> list();
	public void DeletebyId(int id);
	public Optional<Producto> findById(int id);
	
	
}

package com.team.stores.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.stores.entity.Producto;
import com.team.stores.repository.ProductoRepo;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private ProductoRepo productorep;

	@Override
	public void SaveProduct(Producto prd) {
		productorep.save(prd);

	}

	@Override
	public List<Producto> list() {
		return productorep.findAll();
	}

	@Override
	public void DeletebyId(int id) {
		productorep.deleteById(id);
	}

	@Override
	public Optional<Producto> findById(int id) {
		return productorep.findById(id);
	}

}

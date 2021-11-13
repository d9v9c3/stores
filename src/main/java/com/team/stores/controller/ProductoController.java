package com.team.stores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.team.stores.service.ProductoService;
import com.team.stores.DTO.ProductoDTO;
import com.team.stores.entity.Producto;

@RestController
public class ProductoController {

	@Autowired
	ProductoService prdservice;

	@GetMapping("/myproducts")
	public ResponseEntity<List<Producto>> list() {
		List<Producto> list = prdservice.list();
		System.out.println("Tus productos se han listado");
		return new ResponseEntity(list, HttpStatus.OK);
	}

	@GetMapping("/myproducts/{id}")
	public ResponseEntity<Producto> findingObject(@PathVariable int id) {
		Producto prd = prdservice.findById(id).get();
		System.out.println("El producto ha sido solicitado");
		return new ResponseEntity(prd, HttpStatus.OK);
	}

	@PostMapping("/insert-your-product")
	public ResponseEntity<?> savemethod(@RequestBody ProductoDTO producto) {
		// Construye el entity
		Producto product = new Producto(0, producto.getPrecio(), producto.getNombre(), producto.getTipo(),
				producto.getMarca(), producto.isStock());
		// Guarda el entity
		prdservice.SaveProduct(product);

		return new ResponseEntity("Your product is save", HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") int id) {
		prdservice.DeletebyId(id);
		return new ResponseEntity("Your product is deleted", HttpStatus.OK);
	}

}

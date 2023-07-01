package cl.datawise.musicpro.bffproductos.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.datawise.musicpro.bffproductos.dto.ProductoDto;
import cl.datawise.musicpro.bffproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.bffproductos.exceptions.ProductoException;
import cl.datawise.musicpro.bffproductos.services.ProductoService;

@RestController
@RequestMapping("Producto")
public class ProductoController {
    private ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<RespuestaGenericaDto> getProductoById(@PathVariable int id) throws ProductoException{
        return new ResponseEntity<>(productoService.getProductoById(id), HttpStatus.OK);
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<RespuestaGenericaDto> getProductoByNombre(@PathVariable String nombre) throws ProductoException{
        return new ResponseEntity<>(productoService.getProductoByNombre(nombre), HttpStatus.OK);
    }

    @GetMapping("getByPrecio/{precio}")
    public ResponseEntity<RespuestaGenericaDto> getProductoByPrecio(@PathVariable int precio) throws ProductoException{
        return new ResponseEntity<>(productoService.getProductoByPrecio(precio), HttpStatus.OK);
    }

    @GetMapping("getByCategoria/{idCategoria}")
    public ResponseEntity<RespuestaGenericaDto> getProductoByCategoria(@PathVariable int idCategoria) throws ProductoException{
        return new ResponseEntity<>(productoService.getProductoByCategoria(idCategoria), HttpStatus.OK);
    }

    @GetMapping("create")
    public ResponseEntity<RespuestaGenericaDto> createProducto(@RequestBody ProductoDto productoDto) throws ProductoException{
        return new ResponseEntity<>(productoService.createProducto(productoDto), HttpStatus.OK);
    }

    @GetMapping("update")
    public ResponseEntity<RespuestaGenericaDto> updateProducto(@RequestBody ProductoDto productoDto) throws ProductoException{
        return new ResponseEntity<>(productoService.updateProducto(productoDto), HttpStatus.OK);
    }

    @GetMapping("delete/{id}")
    public ResponseEntity<RespuestaGenericaDto> deleteProducto(@PathVariable int id) throws ProductoException{
        return new ResponseEntity<>(productoService.deleteProducto(id), HttpStatus.OK);
    }
}

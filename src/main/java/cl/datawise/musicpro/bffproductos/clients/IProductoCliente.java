package cl.datawise.musicpro.bffproductos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import cl.datawise.musicpro.bffproductos.dto.ProductoDto;
import cl.datawise.musicpro.bffproductos.dto.RespuestaGenericaDto;

@FeignClient(name="svc-producto", url="${api.feign.url}/Producto")
public interface IProductoCliente {
    
    @GetMapping("getById/{id}")
    RespuestaGenericaDto getProductoById(@PathVariable int id);

    @GetMapping("getByNombre/{nombre}")
    RespuestaGenericaDto getProductoByNombre(@PathVariable String nombre);

    @GetMapping("getByPrecio/{precio}")
    RespuestaGenericaDto getProductoByPrecio(@PathVariable int precio);

    @GetMapping("getByIdCategoria/{idCategoria}")
    RespuestaGenericaDto getProductoByCategoria(@PathVariable int idCategoria);

    @PostMapping("Producto")
    RespuestaGenericaDto createProducto(@RequestBody ProductoDto productoDto);

    @PutMapping("Producto")
    RespuestaGenericaDto updateProducto(@RequestBody ProductoDto productoDto);

    @DeleteMapping("Producto/{id}")
    RespuestaGenericaDto deleteProducto(@PathVariable int id);
}

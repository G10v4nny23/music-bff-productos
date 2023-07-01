package cl.datawise.musicpro.bffproductos.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import cl.datawise.musicpro.bffproductos.clients.IProductoCliente;
import cl.datawise.musicpro.bffproductos.dto.ProductoDto;
import cl.datawise.musicpro.bffproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.bffproductos.exceptions.ProductoException;


@Service
@AllArgsConstructor
public class ProductoService {
    private final IProductoCliente __productoCliente;

    public RespuestaGenericaDto getProductoById(int id) throws ProductoException {
        return __productoCliente.getProductoById(id);
    }

    public RespuestaGenericaDto getProductoByNombre(String nombre) throws ProductoException{
        return __productoCliente.getProductoByNombre(nombre);
    }

    public RespuestaGenericaDto getProductoByPrecio(int precio) throws ProductoException{
        return __productoCliente.getProductoByPrecio(precio);
    }

    public RespuestaGenericaDto getProductoByCategoria(int idCategoria) throws ProductoException{
        return __productoCliente.getProductoByCategoria(idCategoria);
    }

    public RespuestaGenericaDto createProducto(ProductoDto productoDto) throws ProductoException{
        return __productoCliente.createProducto(productoDto);
    }

    public RespuestaGenericaDto updateProducto(ProductoDto productoDto) throws ProductoException{
        return __productoCliente.updateProducto(productoDto);
    }

    public RespuestaGenericaDto deleteProducto(int id) throws ProductoException{
        return __productoCliente.deleteProducto(id);
    }
}

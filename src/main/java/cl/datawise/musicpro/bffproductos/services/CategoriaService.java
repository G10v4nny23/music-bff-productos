package cl.datawise.musicpro.bffproductos.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import cl.datawise.musicpro.bffproductos.clients.ICategoriaCliente;
import cl.datawise.musicpro.bffproductos.dto.CategoriaDto;
import cl.datawise.musicpro.bffproductos.dto.RespuestaGenericaDto;

@Service
@AllArgsConstructor
public class CategoriaService {
    private final ICategoriaCliente __categoriaCliente;

    public RespuestaGenericaDto getCategoriaById(int id){
        return __categoriaCliente.getCategoriaById(id);
    }

    public RespuestaGenericaDto getCategoriaByNombre(String nombre){
        return __categoriaCliente.getCategoriaByNombre(nombre);
    }

    public RespuestaGenericaDto createCategoria(CategoriaDto categoriaDto){
        return __categoriaCliente.createCategoria(categoriaDto);
    }

    public RespuestaGenericaDto updateCategoria(CategoriaDto categoriaDto){
        return __categoriaCliente.updateCategoria(categoriaDto);
    }

    public RespuestaGenericaDto deleteCategoria(int id){
        return __categoriaCliente.deleteCategoria(id);
    }
}
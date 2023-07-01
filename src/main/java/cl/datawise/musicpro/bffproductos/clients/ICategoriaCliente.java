package cl.datawise.musicpro.bffproductos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.datawise.musicpro.bffproductos.dto.CategoriaDto;
import cl.datawise.musicpro.bffproductos.dto.RespuestaGenericaDto;


@FeignClient(name="svc-categoria", url="${api.feign.url}/Categoria")
public interface ICategoriaCliente {
        
    @GetMapping("getById/{id}")
    RespuestaGenericaDto getCategoriaById(@PathVariable int id);

    @GetMapping("getByNombre/{nombre}")
    RespuestaGenericaDto getCategoriaByNombre(@PathVariable String nombre);

    @PostMapping("create")
    RespuestaGenericaDto createCategoria(@RequestBody CategoriaDto categoriaDto);

    @PutMapping("update")
    RespuestaGenericaDto updateCategoria(@RequestBody CategoriaDto categoriaDto);

    @DeleteMapping("delete/{id}")
    RespuestaGenericaDto deleteCategoria (@PathVariable int id);
    
}

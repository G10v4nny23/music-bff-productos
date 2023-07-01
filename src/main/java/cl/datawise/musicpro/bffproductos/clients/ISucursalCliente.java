package cl.datawise.musicpro.bffproductos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.datawise.musicpro.bffproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.bffproductos.dto.SucursalDto;


@FeignClient(name="svc-sucursal", url="${api.feign.url}/Sucursal")
public interface ISucursalCliente {
        
    @GetMapping("getById/{id}")
    RespuestaGenericaDto getSucursalById(@PathVariable int id);

    @GetMapping("getByNombre/{nombre}")
    RespuestaGenericaDto getSucursalByNombre(@PathVariable String nombre);

    @GetMapping("getByDireccion/{direccion}")
    RespuestaGenericaDto getSucursalByDireccion(@PathVariable String direccion);

    @GetMapping("getByPermisoMunicipal/{permisoMunicipal}")
    RespuestaGenericaDto getSucursalByPermisoMunicipal(@PathVariable String permisoMunicipal);

    @GetMapping("getByRut/{rut}")
    RespuestaGenericaDto getSucursalByRut(@PathVariable String rut);

    @GetMapping("getByIdEncargado/{idEncargado}")
    RespuestaGenericaDto getSucursalByIdEncargado(@PathVariable Integer idEncargado);

    @PostMapping("Sucursal")
    RespuestaGenericaDto createSucursal(@RequestBody SucursalDto sucursalDto);

    @PutMapping("Sucursal")
    RespuestaGenericaDto updateSucursal(@RequestBody SucursalDto sucursalDto);

    @DeleteMapping("Sucursal/{id}")
    RespuestaGenericaDto deleteSucursal(@PathVariable int id);
    
}

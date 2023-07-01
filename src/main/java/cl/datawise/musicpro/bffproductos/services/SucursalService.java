package cl.datawise.musicpro.bffproductos.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import cl.datawise.musicpro.bffproductos.clients.ISucursalCliente;
import cl.datawise.musicpro.bffproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.bffproductos.dto.SucursalDto;
import cl.datawise.musicpro.bffproductos.exceptions.SucursalException;

@Service
@AllArgsConstructor
public class SucursalService {
    private final ISucursalCliente __sucursalCliente;

    public RespuestaGenericaDto getSucursalById(int id) throws SucursalException{
        return __sucursalCliente.getSucursalById(id);
    }    

    public RespuestaGenericaDto getSucursalByNombre(String nombre) throws SucursalException{
        return __sucursalCliente.getSucursalByNombre(nombre);
    }    
    
    public RespuestaGenericaDto getSucursalByDireccion(String direccion) throws SucursalException{
        return __sucursalCliente.getSucursalByDireccion(direccion);
    }    

    public RespuestaGenericaDto getSucursalByPermisoMunicipal(String permisoMunicipal) throws SucursalException{
        return __sucursalCliente.getSucursalByPermisoMunicipal(permisoMunicipal);
    }    

    public RespuestaGenericaDto getSucursalByRut(String rut) throws SucursalException{
        return __sucursalCliente.getSucursalByRut(rut);
    }    

    public RespuestaGenericaDto getSucursalByIdEncargado(Integer idEncargado) throws SucursalException{
        return __sucursalCliente.getSucursalByIdEncargado(idEncargado);
    }    

    public RespuestaGenericaDto createSucursal(SucursalDto sucursalDto) throws SucursalException{
        return __sucursalCliente.createSucursal(sucursalDto);
    }    

    public RespuestaGenericaDto updateSucursal(SucursalDto sucursalDto) throws SucursalException{
        return __sucursalCliente.updateSucursal(sucursalDto);
    }    

    public RespuestaGenericaDto deleteSucursal(int id) throws SucursalException{
        return __sucursalCliente.deleteSucursal(id);
    }    
}

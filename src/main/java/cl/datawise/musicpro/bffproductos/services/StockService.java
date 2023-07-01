package cl.datawise.musicpro.bffproductos.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import cl.datawise.musicpro.bffproductos.clients.IStockCliente;
import cl.datawise.musicpro.bffproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.bffproductos.dto.StockDto;
import cl.datawise.musicpro.bffproductos.exceptions.StockException;

@Service
@AllArgsConstructor
public class StockService {
    private final IStockCliente __stockCliente;

    public RespuestaGenericaDto getStockById(int id) throws StockException{
        return __stockCliente.getStockById(id);
    }    

    public RespuestaGenericaDto getStockByProducto(int id) throws StockException{
        return __stockCliente.getStockByProducto(id);
    }

    public RespuestaGenericaDto getStockBySucursal(int id) throws StockException{
        return __stockCliente.getStockBySucursal(id);
    }

    public RespuestaGenericaDto getStockByCantidad(int cantidad) throws StockException{
        return __stockCliente.getStockByCantidad(cantidad);
    }

    public RespuestaGenericaDto createStock(StockDto stockDto) throws StockException{
        return __stockCliente.createStock(stockDto);
    }

    public RespuestaGenericaDto updateStock(StockDto stockDto) throws StockException{
        return __stockCliente.updateStock(stockDto);
    }

    public RespuestaGenericaDto deleteStock(int id) throws StockException{
        return __stockCliente.deleteStock(id);
    }
}

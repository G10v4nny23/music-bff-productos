package cl.datawise.musicpro.bffproductos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.datawise.musicpro.bffproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.bffproductos.dto.StockDto;


@FeignClient(name="svc-stock", url="${api.feign.url}/Stock")
public interface IStockCliente {
   
    @GetMapping("getById/{id}")
    RespuestaGenericaDto getStockById(@PathVariable int id);

    @GetMapping("getByProducto/{id}")
    RespuestaGenericaDto getStockByProducto(@PathVariable int id);

    @GetMapping("getBySucursal/{id}")
    RespuestaGenericaDto getStockBySucursal(@PathVariable int id);

    @GetMapping("getByCantidad/{cantidad}")
    RespuestaGenericaDto getStockByCantidad(@PathVariable int cantidad);

    @PostMapping("Stock")
    RespuestaGenericaDto createStock(@RequestBody StockDto stockDto);

    @PutMapping("Stock")
    RespuestaGenericaDto updateStock(@RequestBody StockDto stockDto);

    @DeleteMapping("Stock/{id}")
    RespuestaGenericaDto deleteStock(@PathVariable int id);
 
}

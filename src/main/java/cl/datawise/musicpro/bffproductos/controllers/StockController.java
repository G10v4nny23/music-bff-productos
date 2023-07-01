package cl.datawise.musicpro.bffproductos.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.datawise.musicpro.bffproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.bffproductos.dto.StockDto;
import cl.datawise.musicpro.bffproductos.exceptions.StockException;
import cl.datawise.musicpro.bffproductos.services.StockService;

@RestController
@RequestMapping("Stock")
public class StockController {
    private StockService stockService;

    public StockController(StockService stockService){
        this.stockService = stockService;
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<RespuestaGenericaDto> getStockById(@PathVariable int id) throws StockException{
        return new ResponseEntity<>(stockService.getStockById(id), HttpStatus.OK);
    }

    @GetMapping("getByProducto/{id}")
    public ResponseEntity<RespuestaGenericaDto> getStockByProducto(@PathVariable int id) throws StockException{
        return new ResponseEntity<>(stockService.getStockByProducto(id), HttpStatus.OK);
    }

    @GetMapping("getBySucursal/{id}")
    public ResponseEntity<RespuestaGenericaDto> getStockBySucursal(@PathVariable int id) throws StockException{
        return new ResponseEntity<>(stockService.getStockBySucursal(id), HttpStatus.OK);
    }

    @GetMapping("getByCantidad/{id}")
    public ResponseEntity<RespuestaGenericaDto> getStockByCantidad(@PathVariable int cantidad) throws StockException{
        return new ResponseEntity<>(stockService.getStockByCantidad(cantidad), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<RespuestaGenericaDto> createStock(@RequestBody StockDto stockDto) throws StockException{
        return new ResponseEntity<>(stockService.createStock(stockDto), HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<RespuestaGenericaDto> updateStock(@RequestBody StockDto stockDto) throws StockException{
        return new ResponseEntity<>(stockService.updateStock(stockDto), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<RespuestaGenericaDto> deleteStock(@PathVariable int id) throws StockException{
        return new ResponseEntity<>(stockService.deleteStock(id), HttpStatus.OK);
    }
}

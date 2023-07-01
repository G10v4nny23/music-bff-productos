package cl.datawise.musicpro.bffproductos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StockDto {
    private Integer id;
    private ProductoDto producto;
    private SucursalDto sucursal;
    private int cantidad;   
}

package guru.springframework.msscbeerorderservice.web.mapper;

import guru.springframework.msscbeerorderservice.domain.BeerOrder;
import guru.springframework.msscbeerorderservice.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

  BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

  BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}

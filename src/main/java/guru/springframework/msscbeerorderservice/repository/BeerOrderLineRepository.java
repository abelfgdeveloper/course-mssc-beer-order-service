package guru.springframework.msscbeerorderservice.repository;

import guru.springframework.msscbeerorderservice.domain.BeerOrderLine;
import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {}

package guru.springframework.msscbeerorderservice.web.model;

import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CustomerDto extends BaseItem {

  @Builder
  public CustomerDto(
      UUID id,
      Integer version,
      OffsetDateTime createdDate,
      OffsetDateTime lastModifiedDate,
      String name) {
    super(id, version, createdDate, lastModifiedDate);
    this.name = name;
  }

  private String name;
}

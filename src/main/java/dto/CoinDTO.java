package dto;

import java.math.BigDecimal;
import java.util.Map;

public record CoinDTO(Map<String, BigDecimal> conversion_rates ) {
}

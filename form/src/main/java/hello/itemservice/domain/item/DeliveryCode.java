package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * FAST: 파른 배송
 * NORMAL: 일반 배송
 * SLOW: 느린 배송
 */
@Getter
@AllArgsConstructor
public class DeliveryCode {
    private String code;
    private String displayName;
}

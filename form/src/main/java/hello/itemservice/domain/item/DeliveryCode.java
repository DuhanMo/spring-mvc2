package hello.itemservice.domain.item;

import lombok.*;

/**
 * FAST: 파른 배송
 * NORMAL: 일반 배송
 * SLOW: 느린 배송
 * 참고로 AllArgsConstructor 만으로도 타임리프에서 넘어오는 값을 바인딩 할 수 있지만
 * 그 이전에 타임리프가 Getter를 찾기못해 화면에 빈객체를 그려내지 못한다.
 * 그래서 타임리프를 위한 Getter, 스프링이 바인딩 할 수 있게끔 Setter를 추가 해준다.(사실은 Setter + NoArgsConstructor 조합)
 * DeleveryCode객체를 만들어서 타임리프로 보내줄 때 편하게 끔 AllArgsConstructor도 추가해준다.
 * AllArgsConstructor를 추가 해주면 NoArgsConstructor도 명시적으로 추가해줘야 한다.
 *
 * --> 이 과정을 축소 해서 (Setter + NoArgsConstructor 조합을 AllArgsContstructor로 대체)
 *      Getter + AllArgsConstructor 를 이용하자.
 */
@Getter
@AllArgsConstructor
public class DeliveryCode {
    private String code;
    private String displayName;
}

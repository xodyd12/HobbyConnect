<<<<<<<< HEAD:src/main/java/com/spring/mvc/member/dto/request/LoginRequestDTO.java
package com.spring.mvc.member.dto.request;
========
package com.spring.mvc.member.dto;
>>>>>>>> origin/merge2:src/main/java/com/spring/mvc/member/dto/LoginRequestDTO.java


import lombok.*;
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequestDTO {

    private String personId;
    private String password;
    private boolean autoLogion; //자동 로그인 체크 여부
}

package com.margaritasosnovskaya.MyLocation.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @JsonIgnore
    private Long id;
    private String email;
    private String name;
    private String password;
}

package com.nisum.test.dto;

import java.util.Set;

public record UserDTO(String name, String email, String password, Set<PhoneDTO> phones) {

}

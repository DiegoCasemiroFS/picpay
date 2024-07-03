package br.com.DiegoCasemiroFS.PicpayApi.entity.dtos;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password) {
}

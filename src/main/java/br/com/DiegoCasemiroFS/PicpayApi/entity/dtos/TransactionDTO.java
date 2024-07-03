package br.com.DiegoCasemiroFS.PicpayApi.entity.dtos;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, Long receiverId) {
}

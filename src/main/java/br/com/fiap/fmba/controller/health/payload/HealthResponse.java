package br.com.fiap.fmba.controller.health.payload;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HealthResponse {

    private String message;
}

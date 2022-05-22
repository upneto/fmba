package br.com.fiap.fmba.controller.health;

import br.com.fiap.fmba.controller.health.payload.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping(value = "/", produces="application/json" )
    public HealthResponse getMessage() {
        return new HealthResponse("Hello word!!");
    }
}

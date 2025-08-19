package com.alura.forohub.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record ActualizacionUsuarioDTO(
        @NotNull Long id,
        String name,
        String email
) {
}

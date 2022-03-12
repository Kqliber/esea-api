package me.kaliber.esea.api.user;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

public record GraphValue(
        @NotNull LocalDateTime label,
        int value,
        @NotNull String rank
) {}

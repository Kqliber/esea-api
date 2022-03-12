package me.kaliber.esea.api.user;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public record GraphData(
        @NotNull String name,
        @NotNull List<@NotNull GraphValue> values
) {}

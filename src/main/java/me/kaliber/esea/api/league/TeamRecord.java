package me.kaliber.esea.api.league;

import org.jetbrains.annotations.NotNull;

public record TeamRecord(@NotNull String win, @NotNull String loss, @NotNull String tie) {}

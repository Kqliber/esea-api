package me.kaliber.esea.api.league;

import org.jetbrains.annotations.NotNull;

public record LeagueInfo(
        int ind,
        @NotNull String name,
        @NotNull String type
) {}

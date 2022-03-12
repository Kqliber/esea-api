package me.kaliber.esea.api.user;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

public record RecentVisitor(
        int id,
        @NotNull String name,
        @NotNull String link,
        @NotNull LocalDateTime date
) {}

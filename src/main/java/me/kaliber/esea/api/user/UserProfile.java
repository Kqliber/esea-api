package me.kaliber.esea.api.user;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public record UserProfile(
        @Nullable String message,
        @NotNull List<String> errors,
        @Nullable String pagination,
        @NotNull UserProfileData data,
        @NotNull List<String> filters
) {}

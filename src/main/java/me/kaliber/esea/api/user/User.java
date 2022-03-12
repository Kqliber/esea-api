package me.kaliber.esea.api.user;

import me.kaliber.esea.api.avatar.Avatar;
import me.kaliber.esea.api.ban.BanInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface User {

    int id();

    int eslId();

    @NotNull
    String alias();

    @NotNull
    String tier();

    boolean isOnline();

    int karma();

    @NotNull
    String banner();

    // todo change to Locale
    @NotNull
    String locale();

    @NotNull
    Avatar avatar();

    @NotNull
    String name();

    int age();

    @NotNull
    String gender();

    @NotNull
    String location();

    // todo change to Date/Instant
    @NotNull
    String joinDate();

    int posts();

    // todo change to Date/Instant
    @NotNull
    String lastOnline();

    @Nullable
    String gameStatus();

    @Nullable
    BanInfo ban();

    boolean isLookingForTeam();

    int comments();
}

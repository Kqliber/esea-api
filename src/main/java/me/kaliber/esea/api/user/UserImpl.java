package me.kaliber.esea.api.user;

import me.kaliber.esea.api.avatar.Avatar;
import me.kaliber.esea.api.ban.BanInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public record UserImpl(
        @Nullable String message,
        @NotNull List<String> errors,
        @NotNull List<String> sockets,
        @Nullable String pagination,
        @NotNull UserData data,
        @NotNull List<String> filters
) implements User {

    @Override
    public int id() {
        return data.id();
    }

    @Override
    public int eslId() {
        return data.eslId();
    }

    @Override
    @NotNull
    public String alias() {
        return data.alias();
    }

    @Override
    @NotNull
    public String tier() {
        return data.tier();
    }

    // todo online json "online_status" is only present when user is offline
    @Override
    public boolean isOnline() {
        return true;
    }

    @Override
    public int karma() {
        return data().karma();
    }

    @Override
    @NotNull
    public String banner() {
        return data.bannerURL();
    }

    @Override
    @NotNull
    public String locale() {
        return data.locale();
    }

    @Override
    @NotNull
    public Avatar avatar() {
        return new Avatar() {

            @Override
            @NotNull
            public String badge() {
                return data.avatarBadge();
            }

            @Override
            @Nullable
            public String url() {
                return data.avatarURL();
            }

            @Override
            @Nullable
            public String fullURL() {
                return data.avatarFullURL();
            }
        };
    }

    @Override
    @NotNull
    public String name() {
        return data.name();
    }

    @Override
    public int age() {
        return data.age();
    }

    @Override
    @NotNull
    public String gender() {
        return data.gender();
    }

    @Override
    @NotNull
    public String location() {
        return data.location();
    }

    @Override
    @NotNull
    public String joinDate() {
        return data.joined();
    }

    @Override
    public int posts() {
        return data.posts();
    }

    @Override
    @NotNull
    public String lastOnline() {
        return data.lastOnline();
    }

    // todo find out what this returns
    @Override
    @Nullable
    public String gameStatus() {
        return data.gameStatus();
    }

    // todo find out what this returns
    @Override
    @Nullable
    public BanInfo ban() {
        return data.ban();
    }

    @Override
    public boolean isLookingForTeam() {
        return data.lookingForTeam();
    }

    @Override
    public int comments() {
        return data.commentsCount();
    }
}

package me.kaliber.esea.api.user;

import com.google.gson.annotations.SerializedName;
import me.kaliber.esea.api.ban.BanInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

record UserData(
        int id,
        @SerializedName("esl_id") int eslId,
        @NotNull String alias,
        @NotNull String tier,
        @SerializedName("online_status") @NotNull String onlineStatus,
        int karma,
        @SerializedName("banner_url") @NotNull String bannerURL,
        @SerializedName("avatar_badge") @NotNull String avatarBadge,
        @NotNull String locale,
        @SerializedName("twitch_username") @Nullable String twitchUsername,
        int streaming,
        @SerializedName("avatar_url") @Nullable String avatarURL,
        @SerializedName("avatar_full_url") @Nullable String avatarFullURL,
        @NotNull String name,
        int age,
        @NotNull String gender,
        @NotNull String location,
        @NotNull String joined,
        int posts,
        @SerializedName("last_online") @NotNull String lastOnline,
        @SerializedName("game_status") @Nullable String gameStatus,
        @SerializedName("is_blocked") boolean isBlocked,
        @SerializedName("is_buddied") boolean isBuddied,
        @Nullable BanInfo ban,
        @SerializedName("looking_for_team") boolean lookingForTeam,
        @SerializedName("comments_count") int commentsCount,
        @NotNull ConductData conduct
) {}

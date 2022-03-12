package me.kaliber.esea.api.user;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public record Rank(
        @NotNull String rank,
        int mmr,
        @SerializedName("rank_up") int rankUp,
        @SerializedName("rank_down") int rankDown
) {}

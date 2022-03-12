package me.kaliber.esea.api.user;

import com.google.gson.annotations.SerializedName;

public record Level(
        int value,
        int current,
        int max, @SerializedName("total_xp")
        int totalXp,
        int prestige
) {}

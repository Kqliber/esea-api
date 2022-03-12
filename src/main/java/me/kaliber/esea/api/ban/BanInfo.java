package me.kaliber.esea.api.ban;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;

public record BanInfo(
        @SerializedName("ban_id") int banId,
        @SerializedName("end_date") LocalDateTime endDate,
        String offense,
        @SerializedName("ban_reason") BanReason reason
) {}

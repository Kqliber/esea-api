package me.kaliber.esea.api.user;

import com.google.gson.annotations.SerializedName;
import me.kaliber.esea.api.league.League;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public record UserProfileData(
        @NotNull RankedData rank,
        @SerializedName("graph_data") @NotNull List<@NotNull GraphData> graphData,
        @NotNull List<@NotNull PredefinedRank> ranks,
        int id,
        @SerializedName("pc_specs") @NotNull List<@NotNull Gear> specs,
        @NotNull List<@NotNull Gear> gear,
        @SerializedName("trophy_case") @NotNull List<@NotNull TrophyCase> trophyCase,
        @SerializedName("recent_posts") @NotNull List<@NotNull RecentPost> recentPosts,
        @SerializedName("recent_visitors") @NotNull List<@NotNull RecentVisitor> recentVisitors,
        @NotNull List<@NotNull Club> clubs,
        @NotNull String bio,
        @NotNull Level level,
        @NotNull List<@NotNull League> league
) {}

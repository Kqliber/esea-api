package me.kaliber.esea.api.ban;

import org.jetbrains.annotations.NotNull;

import java.util.EnumSet;
import java.util.Set;

public enum BanReason {

    CHEATING("all.ban_cheating",
            "Cheating is not tolerated in ESEA servers."),

    TROLLING("all.ban_trolling",
            "Trolling"),

    SMURFING("all.ban_smurfing",
            "Using a smurf account on ESEA is not permitted"),

    THREATENING("all.ban_threatening",
            "Threatening"),

    DISCRIMINATION("all.ban_discrimination",
            "Discrimination"),

    INTENTIONAL_SUICIDE("all.ban_intentional_suicide",
            "Intentional Suicide"),

    LOW_KARMA("all.ban_karma_threshhold",
            "You have been banned for low karma. When this ban expires you will get a fresh start with your karma at 0."),

    ACCOUNT_SHARING("all.ban_account_sharing",
            "Sharing your ESEA account is not permitted."),

    BAN_EVASION("all.ban_ban_evasion",
            "Any attempt to evade a previously placed ban is not tolerated."),

    GHOSTING("all.ban_ghosting",
            "Attempting to evade ghosting prevention measures is not permitted."),

    COMMUNITY_CONDUCT_VIOLATION("all.ban_community_conduct_violation",
            "Community Conduct Violation"),

    BLOCKING("all.ban_blocking",
            "Blocking"),

    MALICIOUS_ACTIVITY("all.ban_malicious_activity",
            "Malicious Activity"),

    UNSPORTSMANLIKE_CONDUCT("all.ban_unsportsmanlike_conduct",
            "Unsportsmanlike conduct in the ESEA League will not be tolerated."),

    SERVER_DISRUPTION("all.ban_server_disruption",
            "Server disruption is not tolerated in ESEA servers (improper conduct)."),

    WEBSITE_ABUSE("all.ban_website_abuse",
            "Improper usage of the ESEA website."),

    // all needs testing below
    TEAM_FLASHING("all.ban_team_flashing",
            "Team Flashing"),

    VOTE_KICK_ABUSE("all.ban_vote_kick_abuse",
            "Improper use of the Vote Kick system."),

    DISRESPECTING_AN_ADMIN("all.ban_disrespecting_an_admin",
            "Disrespecting an ESEA admin will not be tolerated."),

    GAMBLING_VIOLATION("all.ban_gambling_violation",
            "Having any association with a player gambling on or falsifying the outcome of their own match is not permitted."),

    ILLEGAL_CUSTOMIZATION("all.ban_illegal_customization",
            "Illegal use of a model, sprite, sound, material, graphic setting etc.that provides an unfair advantage. Clear any custom game files you may have."),

    PAYMENT_FRAUD("all.ban_payment_fraud",
            "Banned for reversed funds."),

    PRO_LEAGUE_CONDUCT_POLICY_VIOLATION("all.ban_pro_league_conduct_policy_violation",
            "Violating the Pro League Conduct Policy will not be tolerated."),

    PUG_MODERATOR_ABUSE("all.ban_pug_moderator_abuse",
            "Improper use of the pug moderator system."),

    RANK_G_VIOLATION("all.ban_rank_g_violation",
            "Rank G Conduct Violation"),

    RANK_S_VIOLATION("all.ban_rank_s_violation",
            "Rank S Conduct Violation"),

    SUPPORT_SYSTEM_ABUSE("all.ban_support_system_abuse",
            "Opening up repeated tickets for the same issue, opening up a ticket that the presented FAQ entries clearly solved, or opening server issue tickets in an effort to get around the \".block\" system will not be tolerated."),

    VIP_PROGRAM_VIOLATION("all.ban_vip_program_violation",
            "Violating the terms of the VIP Program will not be tolerated.");

    private static final Set<BanReason> VALUES = Set.copyOf(EnumSet.allOf(BanReason.class));
    private final String raw;
    private final String description;

    BanReason(@NotNull final String raw, @NotNull final String description) {
        this.raw = raw;
        this.description = description;
    }

    /**
     * gets the raw representation of the ban reason
     * @return the raw string of the ban reason
     */
    @NotNull
    public String raw() {
        return raw;
    }

    /**
     * gets the description related to the ban reason, which can be found at <a href="https://play.esea.net/content/ban-types">the ESEA Ban Types Page</a>.
     * Some ban reasons aren't displayed on this website however, in which case their description will be a simple representation of the enum name, separated by a space
     * @return the description of the ban reason
     */
    @NotNull
    public String description() {
        return description;
    }

    /**
     * Finds a BanReason from its raw string
     * @param input the input to match against
     * @return the BanReason enum constant matching the input
     */
    @NotNull
    public static BanReason find(@NotNull final String input) {
        return VALUES.stream()
                .filter(reason -> reason.raw().equals(input))
                .findAny()
                .orElseThrow(IllegalArgumentException::new);
    }
}

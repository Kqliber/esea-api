package me.kaliber.esea.api.league;

public record League(
        LeagueInfo league,
        TeamRecord record,
        Team team
) {}

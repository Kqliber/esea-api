package me.kaliber.esea.api.user;

import org.jetbrains.annotations.NotNull;

record PredefinedRank(@NotNull String rank, int low, int high) {}

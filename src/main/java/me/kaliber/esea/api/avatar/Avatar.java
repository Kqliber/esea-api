package me.kaliber.esea.api.avatar;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Avatar {

    @NotNull
    String badge();

    @Nullable
    String url();

    @Nullable
    String fullURL();
}

package me.kaliber.esea.api.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.kaliber.esea.api.ban.BanReason;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

public final class GsonHandler {

    private static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter())
            .registerTypeAdapter(BanReason.class, new BanReasonTypeAdapter())
            .registerTypeAdapterFactory(new RecordTypeAdapterFactory())
            .serializeNulls()
            .create();

    /**
     * returns the gson instance, serializing nulls and with registered specific type adapters
     * @return the Gson instance
     */
    @NotNull
    public static Gson gson() {
        return GSON;
    }
}

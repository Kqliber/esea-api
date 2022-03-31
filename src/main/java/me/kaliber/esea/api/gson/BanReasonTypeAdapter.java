package me.kaliber.esea.api.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import me.kaliber.esea.api.ban.BanReason;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public final class BanReasonTypeAdapter extends TypeAdapter<BanReason> {

    @Override
    public void write(@NotNull final JsonWriter out, @Nullable final BanReason value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        out.value(value.toString());
    }

    @Nullable
    @Override
    public BanReason read(@NotNull final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return BanReason.find(in.nextString());
    }
}

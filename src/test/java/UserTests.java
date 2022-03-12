import me.kaliber.esea.api.gson.GsonHandler;
import me.kaliber.esea.api.user.UserImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTests {

    @Test
    public void userTest() {
        var testString = "{\"message\":null,\"errors\":[],\"sockets\":[],\"pagination\":null,\"data\":{\"id\":404749,\"esl_id\":null,\"alias\":\"Mtz_-\",\"tier\":\"premium\",\"online_status\":\"offline\",\"karma\":1015,\"banner_url\":\"https:\\/\\/static.esea.net\\/global\\/images\\/content_images\\/11773.jpg\",\"avatar_badge\":\"karma\",\"locale\":\"es-ES\",\"twitch_username\":null,\"streaming\":0,\"avatar_url\":\"\\/\\/static.esea.net\\/cdn-cgi\\/image\\/metadata=none,width=150,height=150\\/global\\/images\\/users\\/404749.1642447323.jpeg\",\"avatar_full_url\":\"\\/\\/static.esea.net\\/cdn-cgi\\/image\\/metadata=none\\/global\\/images\\/users\\/404749.1642447323.jpeg\",\"name\":\"Omar Martinez Mendoza\",\"age\":91,\"gender\":\"male\",\"location\":\"sinaloa\",\"joined\":\"2010-03-02T08:18:30Z\",\"posts\":99,\"last_online\":\"2022-03-08T01:57:57Z\",\"game_status\":null,\"is_blocked\":false,\"is_buddied\":false,\"ban\":{\"ban_id\":195197,\"end_date\":\"2022-04-07T15:43:26.000Z\",\"offense\":\"3rd\",\"ban_reason\":\"all.ban_trolling\"},\"looking_for_team\":false,\"comments_count\":49,\"conduct\":{\"attitude\":46,\"communication\":46,\"skill\":35},\"comments_cant_comment_reason\":\"all.cannot_post_privacy_setting\"},\"filters\":[]}";
        var user = GsonHandler.gson().fromJson(testString, UserImpl.class);
        System.out.println(user);
        assertNotNull(user);
    }

}
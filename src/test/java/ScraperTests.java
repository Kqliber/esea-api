import me.kaliber.esea.api.scraper.WebManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

public class ScraperTests {

    @Test
    public void visitSite() {
        var driver = new WebManager().driver();
        driver.get("https://play.esea.net/api/users/1745078");
        var str = driver.findElement(By.tagName("pre")).getText();
        assertEquals(str, "{\"message\":null,\"errors\":[],\"sockets\":[],\"pagination\"" + ":null,\"data\":{\"id\":1745078,\"esl_id\":null,\"alias\":\"biguzera\",\"tier\":\"premium\",\"online_status\":\"offline\",\"karma\":216,\"banner_url\":\"https:\\/\\/static.esea.net\\/global\\/images\\/content_images\\/11775.jpg\",\"avatar_badge\":\"karma\",\"locale\":\"pt-BR\",\"twitch_username\":null,\"streaming\":0,\"avatar_url\":null,\"avatar_full_url\":null,\"name\":\"Rodrigo Bittencourt\",\"age\":25,\"gender\":\"male\",\"location\":\"\",\"joined\":\"2017-06-09T19:12:58Z\",\"posts\":1,\"last_online\":\"2021-11-11T00:53:09Z\",\"game_status\":null,\"is_blocked\":false,\"is_buddied\":false,\"ban\":null,\"looking_for_team\":false,\"comments_count\":1,\"conduct\":[]},\"filters\":[]}");
        driver.quit();
    }
}

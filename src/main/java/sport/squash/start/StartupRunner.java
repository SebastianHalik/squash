package sport.squash.start;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StartupRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        log.info("HELLO WORLD");
    }
}

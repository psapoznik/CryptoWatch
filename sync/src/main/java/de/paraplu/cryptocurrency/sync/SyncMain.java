package de.paraplu.cryptocurrency.sync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import de.paraplu.cryptocurrency.domain.mongodb.repository.SyncStatusInfoRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = SyncStatusInfoRepository.class)
@EnableBinding(Source.class)
public class SyncMain {

    public static void main(String[] args) {
        SpringApplication.run(SyncMain.class, args);
    }
}

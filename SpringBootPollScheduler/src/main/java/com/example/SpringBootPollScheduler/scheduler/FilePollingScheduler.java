package com.example.SpringBootPollScheduler.scheduler;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FilePollingScheduler {

    // Specify the file path to poll
    private final String filePath = "/Users/rahulvaish/Downloads/scheduler/myFile.txt";

    @Scheduled(fixedRate = 60000) // Polls the file every 60 seconds
    public void pollFile() {
        try {
            // Read file content
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            // Process file content
            processFileContent(lines);
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
        }
    }

    private void processFileContent(List<String> lines) {
        // Process file content here
        // For example, print each line
        lines.forEach(System.out::println);
    }
}

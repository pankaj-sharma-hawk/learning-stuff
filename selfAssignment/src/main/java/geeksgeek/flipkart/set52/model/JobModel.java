package geeksgeek.flipkart.set52.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDateTime;

/**
 * Created by pankaj on 02,2019
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobModel {
    private int durationInMinutes;
    private LocalDateTime duration;
    private int priority;
    private UserLevel userLevel;
    private int numberOfThread;


}

/**
 * Given a list of Jobs,
 * (Each job contains duration,
 * deadline before which it should be
 * completed, Priority,
 * User Level(Root>Admin>User))
 * and number of threads,
 SJF(Shortest Job first),
 FCFS(First come first serve),
 FPS(First priority Scheduling), and
 EDF(Elapsed deadline Scheduling) scheduling algorithms.
 */
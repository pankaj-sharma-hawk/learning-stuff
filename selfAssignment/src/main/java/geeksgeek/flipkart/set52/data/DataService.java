package geeksgeek.flipkart.set52.data;

import geeksgeek.flipkart.set52.model.JobModel;
import geeksgeek.flipkart.set52.model.UserLevel;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
public class DataService {


    List<JobModel> createJobs(){
        List<JobModel> listJobModel=new ArrayList();

        LocalDateTime now = LocalDateTime.now();

        listJobModel.add(new JobModel(2,now.plusMinutes(10),0,UserLevel.ADMIN,5));
        listJobModel.add(new JobModel(3,now.plusMinutes(12),1,UserLevel.USER,3));
        listJobModel.add(new JobModel(4,now.plusMinutes(14),2,UserLevel.ADMIN,4));
        listJobModel.add(new JobModel(2,now.plusMinutes(20),3,UserLevel.ROOT,2));
        listJobModel.add(new JobModel(2,now.plusMinutes(17),4,UserLevel.USER,5));

        return listJobModel;
    }
}


















package linklist;

import lombok.Data;

/**
 * Created by pankaj on 01,2019
 */
@Data
public class WeeklySalesSummaryResponse {
    private String merchantName;
    private String weeklyTotalVol;
    private String prevWeekTotalVol;
}

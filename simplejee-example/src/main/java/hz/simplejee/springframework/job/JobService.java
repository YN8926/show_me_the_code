package hz.simplejee.springframework.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by 辉辉大侠 on 30/10/2016.
 */
@Service
public class JobService {
    @Scheduled(fixedRate = 5000)
    public void repeat() {
        System.out.println("每隔5秒执行一次");
    }

    //@Scheduled(cron = "")
    //public void fixTime() {
    //
    //}
}

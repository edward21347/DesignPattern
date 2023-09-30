package fc.service.impl;

import card.IQiYiCardService;
import com.alibaba.fastjson.JSON;
import fc.service.ICommodity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
@Slf4j
public class CardServiceImpl implements ICommodity {

    private IQiYiCardService iQiYiCardService = new IQiYiCardService();
    @Override
    public void sendCommodity(String userId, String commodityId, String busiId, Map<String, String> extMap) {
        String mobile = getUserMobile(userId);
        iQiYiCardService.grantToken(mobile, busiId);
        log.info("请求参数[爱奇艺兑换卡] => userId:{} commodityId:{} busiId:{} extMap:{}",
                userId,commodityId,busiId, JSON.toJSON(extMap));
        log.info("测试结果[爱奇艺兑换卡], success");
    }

    private String getUserMobile(String userId){
        return "13375390243";
    }
}

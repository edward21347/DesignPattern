package fc.service;

import java.util.Map;

public interface ICommodity {
    void sendCommodity(String userId, String commodityId, String busiId,Map<String, String> extMap);
}

package fc.service.store;

import fc.AwardApp;
import fc.service.ICommodity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;
@SpringBootTest(classes = AwardApp.class)
class StoreFactoryServiceImplTest {

    @Autowired
    private StoreFactoryServiceImpl storeFactoryService;
    @Test
    void getCommodityService() {
        // 1. 优惠券
        ICommodity commodityService_1 = storeFactoryService.getCommodityService("1");
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);
        // 2. 实物商品
        ICommodity commodityService_2 = storeFactoryService.getCommodityService("3");
        Map<String,String> extMap = new HashMap<String,String>();
        extMap.put("consigneeUserName", "谢飞机");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        commodityService_2.sendCommodity("10001","9820198721311","1023000020112221113",new HashMap<String, String>() {{
            put("consigneeUserName", "谢飞机");
            put("consigneeUserPhone", "15200292123");
            put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        }});

        // 3. 第三方兑换卡(爱奇艺)
        ICommodity commodityService_3 = storeFactoryService.getCommodityService("2");
        extMap.put("consigneeUserName", "张中锋");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        commodityService_3.sendCommodity("10001","AQY1xjkUodl8LO975GdfrYUio",null,extMap);


    }
}
package method.service.impl;

import api.goods.DeliverReq;
import api.goods.GoodsService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import method.service.ICommodity;
import org.springframework.stereotype.Service;

import java.util.Map;
@Slf4j
@Service
public class GoodServiceImpl implements ICommodity {
    private GoodsService goodsService = new GoodsService();
    @Override
    public void sendCommodity(String userId, String commodityId, String busiId, Map<String, String> extMap) {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(userId));
        deliverReq.setUserPhone(queryUserPhoneNumber(userId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(busiId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", userId, commodityId, busiId, JSON.toJSON(extMap));
        log.info("测试结果[优惠券]：{}", isSuccess);

        if (!isSuccess) throw new RuntimeException("实物商品发放失败");
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}

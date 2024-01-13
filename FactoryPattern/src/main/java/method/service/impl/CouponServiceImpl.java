package method.service.impl;

import api.coupon.CouponResult;
import api.coupon.CouponService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import method.service.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class CouponServiceImpl implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);

    private CouponService couponService = new CouponService();

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
    }
}

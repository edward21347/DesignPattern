package method.service.store;

import lombok.extern.slf4j.Slf4j;
import method.service.ICommodity;
import method.service.impl.CardServiceImpl;
import method.service.impl.CouponServiceImpl;
import method.service.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StoreFactoryServiceImpl {
    @Autowired
    private CardServiceImpl cardService;
    @Autowired
    private CouponServiceImpl couponService;
    @Autowired
    private GoodServiceImpl goodService;

    public ICommodity getCommodityService(String commodityType){
        switch (commodityType){
            case "1":
                return cardService;

            case "2":
                return couponService;

            case "3":
                return goodService;

            default:
                log.info("unsupport serviceType!");
                return null;
        }
    }
}

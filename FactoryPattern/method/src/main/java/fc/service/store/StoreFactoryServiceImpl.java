package fc.service.store;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fc.service.ICommodity;
import fc.service.impl.CardServiceImpl;
import fc.service.impl.CouponServiceImpl;
import fc.service.impl.GoodServiceImpl;

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

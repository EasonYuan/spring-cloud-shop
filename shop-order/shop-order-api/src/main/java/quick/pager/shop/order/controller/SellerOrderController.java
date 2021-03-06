package quick.pager.shop.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import quick.pager.shop.constants.Constants;
import quick.pager.shop.order.model.SellerOrder;
import quick.pager.shop.order.request.SellerOrderSaveRequest;
import quick.pager.shop.response.Response;
import quick.pager.shop.order.service.SellerOrderService;

/**
 * 商户订单
 */
@RestController
@RequestMapping(Constants.Module.ORDER)
public class SellerOrderController {

    @Autowired
    private SellerOrderService sellerOrderService;

    /**
     * 创建商户订单
     *
     * @param request 订单
     */
    @RequestMapping(value = "/seller/create", method = RequestMethod.POST)
    public Response sellerOrderCreate(@RequestBody SellerOrderSaveRequest request) {

        return sellerOrderService.sellerOrderCreate(request);
    }
}

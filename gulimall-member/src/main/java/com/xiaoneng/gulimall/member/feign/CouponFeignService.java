package com.xiaoneng.gulimall.member.feign;

import com.xiaoneng.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author guobineng
 * @Date 2021-06-07 09:43
 * @Description //TODO
 **/

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R membercoupon();
}

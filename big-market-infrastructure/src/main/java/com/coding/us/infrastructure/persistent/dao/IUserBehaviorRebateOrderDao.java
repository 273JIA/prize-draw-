package com.coding.us.infrastructure.persistent.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import com.coding.us.infrastructure.persistent.po.UserBehaviorRebateOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户行为返利流水订单表
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserBehaviorRebateOrderDao {

    void insert(UserBehaviorRebateOrder userBehaviorRebateOrder);

    @DBRouter
    List<UserBehaviorRebateOrder> queryOrderByOutBusinessNo(UserBehaviorRebateOrder userBehaviorRebateOrderReq);

}
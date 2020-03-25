package com.zhangz.security.service;

import com.zhangz.security.model.Address;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/22 14:42
 */
public interface AddressService {
    List<Address> listOfProvince();
    List<Address> listOfCity();
    List<Address> listOfCountry();
    List<Address> listByParentId(String parentId);
}

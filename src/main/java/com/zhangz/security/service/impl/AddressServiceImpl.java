package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.AddressMapper;
import com.zhangz.security.model.Address;
import com.zhangz.security.model.AddressExample;
import com.zhangz.security.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/22 14:48
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> listOfProvince() {
        AddressExample addressExample = new AddressExample();
        addressExample.createCriteria()
                .andParentIdEqualTo("100000");
        List<Address> provinces = addressMapper.selectByExample(addressExample);
        return provinces;
    }

    @Override
    public List<Address> listOfCity() {
        List<Address> provinces = listOfProvince();
        //获取省份的id
        List<String> provinceIds = provinces.stream().map(province -> province.getId()).collect(Collectors.toList());
        AddressExample addressExample = new AddressExample();
        addressExample.createCriteria()
                .andParentIdIn(provinceIds);
        List<Address> citys = addressMapper.selectByExample(addressExample);
        return citys;
    }

    @Override
    public List<Address> listOfCountry() {
        List<Address> citys = listOfCity();
        //获取城市的id
        List<String> cityIds = citys.stream().map(city -> city.getId()).collect(Collectors.toList());
        AddressExample addressExample = new AddressExample();
        addressExample.createCriteria()
                .andParentIdIn(cityIds);
        List<Address> counties = addressMapper.selectByExample(addressExample);
        return counties;
    }

    @Override
    public List<Address> listByParentId(String parentId) {
        if (ObjectUtils.isEmpty(parentId)){
            return new ArrayList<>();
        }
        AddressExample adressExample = new AddressExample();
        adressExample.createCriteria()
                .andParentIdEqualTo(parentId);
        List<Address> addresses = addressMapper.selectByExample(adressExample);
        return addresses;
    }
}

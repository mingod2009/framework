package com.nie.framework.controller;

import com.nie.framework.annotation.Action;
import com.nie.framework.annotation.Controller;
import com.nie.framework.annotation.Inject;
import com.nie.framework.bean.Data;
import com.nie.framework.bean.Param;
import com.nie.framework.bean.View;
import com.nie.framework.model.Customer;
import com.nie.framework.service.CustomerService;

import java.util.List;
import java.util.Map;

/**
 * Created by sam on 2017/10/24.
 */
@Controller
public class CustomerController {
    @Inject
    private CustomerService customerService;

    @Action("get:/customer")
    public View index(Param param) {
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList", customerList);
    }
    @Action("get:/customer_show")
    public View show(Param param) {
        long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new View("customer_show.jsp").addModel("customer", customer);
    }
    @Action("get:/customer_create")
    public View create(Param param) {
        return new View("customer_create.jsp");
    }
    @Action("post:/customer_create")
    public Data createSubmit(Param param) {
        Map<String, Object> fieldMap = param.getMap();
        boolean result = customerService.createCustomer(fieldMap);
        return new Data(result);
    }
    @Action("get:/customer_edit")
    public View edit(Param param) {
        long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new View("customer_edit.jsp").addModel("customer", customer);
    }
    @Action("put:/customer_edit")
    public Data editSubmit(Param param) {
        long id = param.getLong("id");
        Map<String, Object> fieldMap = param.getMap();
        boolean result = customerService.updateCustomer(id, fieldMap);
        return new Data(result);
    }
    @Action("delete:/customer_edit")
    public Data delete(Param param) {
        long id = param.getLong("id");
        boolean result = customerService.deleteCustomer(id);
        return new Data(result);
    }
}

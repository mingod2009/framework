package com.nie.framework.service;

import com.nie.framework.model.Customer;
import com.nie.framework.helper.DatabaseHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by sam on 2017/10/20.
 */
public class CustomerService {

    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList() {

        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);

    }

    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer WHERE id=?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {

        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }
    public boolean deleteCustomer(long id) {

        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}

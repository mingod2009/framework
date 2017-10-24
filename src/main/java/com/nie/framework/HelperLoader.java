package com.nie.framework;

import com.nie.framework.helper.BeanHelper;
import com.nie.framework.helper.ClassHelper;
import com.nie.framework.helper.ControllerHelper;
import com.nie.framework.helper.IocHelper;
import com.nie.framework.util.ClassUtil;

/**
 * Created by sam on 2017/10/23.
 */
public final class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), true);
        }
    }
}

package com.nie.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by sam on 2017/10/23.
 */
public final class ArrayUtil {
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}

package com.nadongbin.retrofitexe.util;

import com.nadongbin.retrofitexe.data.remote.RetrofitClient;
import com.nadongbin.retrofitexe.data.remote.SOService;

/**
 * Created by decur on 2017-05-25.
 */

public class ApiUtils {

    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }

}

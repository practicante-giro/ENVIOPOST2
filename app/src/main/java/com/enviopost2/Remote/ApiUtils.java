package com.enviopost2.Remote;

import com.enviopost2.APIService;

public class ApiUtils {

    private ApiUtils(){}
        public static final String BASE_URL = "http://www.giro.com.mx/";
        public static APIService getApiService(){
            return RetrofitClient.getClient(BASE_URL).create(APIService.class);
        }



}

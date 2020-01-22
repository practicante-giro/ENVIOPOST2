package com.enviopost2;

import com.enviopost2.Entities.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface APIService {

    @POST("/api/checklist")
    @FormUrlEncoded
    Call<Post> savePost(@Field("CLAVE") String CLAVE,
                        @Field("FECHA") String FECHA,
                        @Field("LECTOR") String LECTOR,
                        @Field("FECHA_LECTURA") String FECHA_LECTURA
            //,
                        //@Field("REGISTRADO") boolean REGISTRADO


    );
}

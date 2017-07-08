package com.nadongbin.retrofitexe.data.remote;

import com.nadongbin.retrofitexe.data.model.SOAnswersResponse;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by decur on 2017-05-25.
 */

public interface SOService {

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    // Call<SOAnswersResponse> getAnswers();
    Observable<SOAnswersResponse> getAnswers(); // rxjava 적용

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    // Call<SOAnswersResponse> getAnswers(@Query("tagged") String tags);
    Observable<SOAnswersResponse> getAnswers(@Query("tagged") String tags); // rxjava 적용

    @Headers("User-Agent: Android")
    @FormUrlEncoded
    @POST("/answers")
    Observable<SOAnswersResponse> getAnswers1(@Field("field1") String field1, @Field("field2") String field2);

}

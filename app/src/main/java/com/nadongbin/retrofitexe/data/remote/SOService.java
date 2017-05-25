package com.nadongbin.retrofitexe.data.remote;

import com.nadongbin.retrofitexe.data.model.SOAnswersResponse;

import retrofit2.http.GET;
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

}

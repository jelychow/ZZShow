package com.ys.yoosir.zzshow.apis.interfaces;

import com.ys.yoosir.zzshow.Constants;
import com.ys.yoosir.zzshow.mvp.modle.toutiao.ArticleResult;
import com.ys.yoosir.zzshow.mvp.modle.toutiao.VideoData;

import java.util.List;
import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 *  视频模块
 * Created by Yoosir on 2016/10/24 0024.
 */
public interface VideoModuleApi {

    @GET(Constants.VIDEO_PATH)
    Observable<ArticleResult<List<VideoData>>> getVideos(@QueryMap Map<String,String> params);

}

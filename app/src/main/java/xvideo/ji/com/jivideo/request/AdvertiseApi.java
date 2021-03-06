package xvideo.ji.com.jivideo.request;

import android.content.Context;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import xvideo.ji.com.jivideo.MyApplication;
import xvideo.ji.com.jivideo.config.Consts;
import xvideo.ji.com.jivideo.utils.Utils;

/**
 * Created by Domon on 15-10-20.
 */
public class AdvertiseApi {
    private static final String TAG = AdvertiseApi.class.getSimpleName();

    private static AdvertiseApi mInstance = null;

    private InterstitialAd mInterstitialAd;

    private static Context mContext;

    private AdvertiseApi() {
        mContext = MyApplication.getAppContext();
    }

    public synchronized static AdvertiseApi getInstance() {
        if (mInstance == null) {
            mInstance = new AdvertiseApi();
        }
        return mInstance;
    }

    public void showAd() {
        initInterstitialAd();

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

    private void initInterstitialAd() {
        mInterstitialAd = new InterstitialAd(MyApplication.getAppContext());
        mInterstitialAd.setAdUnitId(Consts.AD_GOOGLE_TABLE_ID);
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                requestNewInterstitial();
            }
        });

        requestNewInterstitial();
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(Utils.getDevId())
                .build();

        mInterstitialAd.loadAd(adRequest);
    }
}

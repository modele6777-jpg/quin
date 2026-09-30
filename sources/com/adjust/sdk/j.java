package com.adjust.sdk;

import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Runnable {
    public final /* synthetic */ SdkClickHandler a;

    public j(SdkClickHandler sdkClickHandler) {
        this.a = sdkClickHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SdkClickHandler sdkClickHandler = this.a;
        IActivityHandler iActivityHandler = (IActivityHandler) sdkClickHandler.activityHandlerWeakRef.get();
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
        try {
            JSONArray rawReferrerArray = defaultInstance.getRawReferrerArray();
            boolean z = false;
            for (int i = 0; i < rawReferrerArray.length(); i++) {
                JSONArray jSONArray = rawReferrerArray.getJSONArray(i);
                if (jSONArray.optInt(2, -1) == 0) {
                    String strOptString = jSONArray.optString(0, null);
                    z = true;
                    long jOptLong = jSONArray.optLong(1, -1L);
                    jSONArray.put(2, 1);
                    sdkClickHandler.sendSdkClick(PackageFactory.buildReftagSdkClickPackage(strOptString, jOptLong, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager(), iActivityHandler.getInternalState()));
                }
            }
            if (z) {
                defaultInstance.saveRawReferrerArray(rawReferrerArray);
            }
        } catch (JSONException e) {
            sdkClickHandler.logger.error("Send saved raw referrers error (%s)", e.getMessage());
        }
    }
}

package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface mug extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(tug tugVar);

    void getAppInstanceId(tug tugVar);

    void getCachedAppInstanceId(tug tugVar);

    void getConditionalUserProperties(String str, String str2, tug tugVar);

    void getCurrentScreenClass(tug tugVar);

    void getCurrentScreenName(tug tugVar);

    void getGmpAppId(tug tugVar);

    void getMaxUserProperties(String str, tug tugVar);

    void getSessionId(tug tugVar);

    void getTestFlag(tug tugVar, int i);

    void getUserProperties(String str, String str2, boolean z, tug tugVar);

    void initForTests(Map map);

    void initialize(vt6 vt6Var, gwg gwgVar, long j);

    void initializeWithElapsedTime(vt6 vt6Var, gwg gwgVar, long j, long j2);

    void isDataCollectionEnabled(tug tugVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, tug tugVar, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, vt6 vt6Var, vt6 vt6Var2, vt6 vt6Var3);

    void onActivityCreated(vt6 vt6Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(iwg iwgVar, Bundle bundle, long j);

    void onActivityDestroyed(vt6 vt6Var, long j);

    void onActivityDestroyedByScionActivityInfo(iwg iwgVar, long j);

    void onActivityPaused(vt6 vt6Var, long j);

    void onActivityPausedByScionActivityInfo(iwg iwgVar, long j);

    void onActivityResumed(vt6 vt6Var, long j);

    void onActivityResumedByScionActivityInfo(iwg iwgVar, long j);

    void onActivitySaveInstanceState(vt6 vt6Var, tug tugVar, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(iwg iwgVar, tug tugVar, long j);

    void onActivityStarted(vt6 vt6Var, long j);

    void onActivityStartedByScionActivityInfo(iwg iwgVar, long j);

    void onActivityStopped(vt6 vt6Var, long j);

    void onActivityStoppedByScionActivityInfo(iwg iwgVar, long j);

    void performAction(Bundle bundle, tug tugVar, long j);

    void registerOnMeasurementEventListener(nvg nvgVar);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(hvg hvgVar);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(vt6 vt6Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(iwg iwgVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(nvg nvgVar);

    void setInstanceIdProvider(dwg dwgVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, vt6 vt6Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(nvg nvgVar);
}

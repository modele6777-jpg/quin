package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iug extends meg implements mug {
    @Override // defpackage.mug
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeLong(j);
        K(parcelJ, 23);
    }

    @Override // defpackage.mug
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        lsg.b(parcelJ, bundle);
        K(parcelJ, 9);
    }

    @Override // defpackage.mug
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeLong(j);
        K(parcelJ, 24);
    }

    @Override // defpackage.mug
    public final void generateEventId(tug tugVar) {
        Parcel parcelJ = J();
        lsg.c(parcelJ, tugVar);
        K(parcelJ, 22);
    }

    @Override // defpackage.mug
    public final void getCachedAppInstanceId(tug tugVar) {
        Parcel parcelJ = J();
        lsg.c(parcelJ, tugVar);
        K(parcelJ, 19);
    }

    @Override // defpackage.mug
    public final void getConditionalUserProperties(String str, String str2, tug tugVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        lsg.c(parcelJ, tugVar);
        K(parcelJ, 10);
    }

    @Override // defpackage.mug
    public final void getCurrentScreenClass(tug tugVar) {
        Parcel parcelJ = J();
        lsg.c(parcelJ, tugVar);
        K(parcelJ, 17);
    }

    @Override // defpackage.mug
    public final void getCurrentScreenName(tug tugVar) {
        Parcel parcelJ = J();
        lsg.c(parcelJ, tugVar);
        K(parcelJ, 16);
    }

    @Override // defpackage.mug
    public final void getGmpAppId(tug tugVar) {
        Parcel parcelJ = J();
        lsg.c(parcelJ, tugVar);
        K(parcelJ, 21);
    }

    @Override // defpackage.mug
    public final void getMaxUserProperties(String str, tug tugVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        lsg.c(parcelJ, tugVar);
        K(parcelJ, 6);
    }

    @Override // defpackage.mug
    public final void getUserProperties(String str, String str2, boolean z, tug tugVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        ClassLoader classLoader = lsg.a;
        parcelJ.writeInt(z ? 1 : 0);
        lsg.c(parcelJ, tugVar);
        K(parcelJ, 5);
    }

    @Override // defpackage.mug
    public final void initialize(vt6 vt6Var, gwg gwgVar, long j) {
        Parcel parcelJ = J();
        lsg.c(parcelJ, vt6Var);
        lsg.b(parcelJ, gwgVar);
        parcelJ.writeLong(j);
        K(parcelJ, 1);
    }

    @Override // defpackage.mug
    public final void initializeWithElapsedTime(vt6 vt6Var, gwg gwgVar, long j, long j2) {
        Parcel parcelJ = J();
        lsg.c(parcelJ, vt6Var);
        lsg.b(parcelJ, gwgVar);
        parcelJ.writeLong(j);
        parcelJ.writeLong(j2);
        K(parcelJ, 60);
    }

    @Override // defpackage.mug
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        lsg.b(parcelJ, bundle);
        parcelJ.writeInt(z ? 1 : 0);
        parcelJ.writeInt(1);
        parcelJ.writeLong(j);
        parcelJ.writeLong(j2);
        K(parcelJ, 59);
    }

    @Override // defpackage.mug
    public final void logHealthData(int i, String str, vt6 vt6Var, vt6 vt6Var2, vt6 vt6Var3) {
        Parcel parcelJ = J();
        parcelJ.writeInt(5);
        parcelJ.writeString("Error with data collection. Data lost.");
        lsg.c(parcelJ, vt6Var);
        lsg.c(parcelJ, vt6Var2);
        lsg.c(parcelJ, vt6Var3);
        K(parcelJ, 33);
    }

    @Override // defpackage.mug
    public final void onActivityCreatedByScionActivityInfo(iwg iwgVar, Bundle bundle, long j) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, iwgVar);
        lsg.b(parcelJ, bundle);
        parcelJ.writeLong(j);
        K(parcelJ, 53);
    }

    @Override // defpackage.mug
    public final void onActivityDestroyedByScionActivityInfo(iwg iwgVar, long j) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, iwgVar);
        parcelJ.writeLong(j);
        K(parcelJ, 54);
    }

    @Override // defpackage.mug
    public final void onActivityPausedByScionActivityInfo(iwg iwgVar, long j) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, iwgVar);
        parcelJ.writeLong(j);
        K(parcelJ, 55);
    }

    @Override // defpackage.mug
    public final void onActivityResumedByScionActivityInfo(iwg iwgVar, long j) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, iwgVar);
        parcelJ.writeLong(j);
        K(parcelJ, 56);
    }

    @Override // defpackage.mug
    public final void onActivitySaveInstanceStateByScionActivityInfo(iwg iwgVar, tug tugVar, long j) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, iwgVar);
        lsg.c(parcelJ, tugVar);
        parcelJ.writeLong(j);
        K(parcelJ, 57);
    }

    @Override // defpackage.mug
    public final void onActivityStartedByScionActivityInfo(iwg iwgVar, long j) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, iwgVar);
        parcelJ.writeLong(j);
        K(parcelJ, 51);
    }

    @Override // defpackage.mug
    public final void onActivityStoppedByScionActivityInfo(iwg iwgVar, long j) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, iwgVar);
        parcelJ.writeLong(j);
        K(parcelJ, 52);
    }

    @Override // defpackage.mug
    public final void registerOnMeasurementEventListener(nvg nvgVar) {
        Parcel parcelJ = J();
        lsg.c(parcelJ, nvgVar);
        K(parcelJ, 35);
    }

    @Override // defpackage.mug
    public final void resetAnalyticsData(long j) {
        Parcel parcelJ = J();
        parcelJ.writeLong(j);
        K(parcelJ, 12);
    }

    @Override // defpackage.mug
    public final void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        Parcel parcelJ = J();
        parcelJ.writeLong(j);
        parcelJ.writeLong(j2);
        K(parcelJ, 61);
    }

    @Override // defpackage.mug
    public final void retrieveAndUploadBatches(hvg hvgVar) {
        Parcel parcelJ = J();
        lsg.c(parcelJ, hvgVar);
        K(parcelJ, 58);
    }

    @Override // defpackage.mug
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, bundle);
        parcelJ.writeLong(j);
        K(parcelJ, 8);
    }

    @Override // defpackage.mug
    public final void setCurrentScreenByScionActivityInfo(iwg iwgVar, String str, String str2, long j) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, iwgVar);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeLong(j);
        K(parcelJ, 50);
    }

    @Override // defpackage.mug
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.mug
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelJ = J();
        ClassLoader classLoader = lsg.a;
        parcelJ.writeInt(z ? 1 : 0);
        parcelJ.writeLong(j);
        K(parcelJ, 11);
    }

    @Override // defpackage.mug
    public final void setUserId(String str, long j) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeLong(j);
        K(parcelJ, 7);
    }

    @Override // defpackage.mug
    public final void setUserProperty(String str, String str2, vt6 vt6Var, boolean z, long j) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        lsg.c(parcelJ, vt6Var);
        parcelJ.writeInt(z ? 1 : 0);
        parcelJ.writeLong(j);
        K(parcelJ, 4);
    }
}

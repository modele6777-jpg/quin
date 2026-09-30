package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;

    public i(ActivityState activityState) {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1L;
        this.e = -1L;
        this.f = null;
        this.g = null;
        if (activityState == null) {
            return;
        }
        this.a = activityState.eventCount;
        this.b = activityState.sessionCount;
        this.c = activityState.subsessionCount;
        this.d = activityState.timeSpent;
        this.e = activityState.sessionLength;
        this.f = activityState.uuid;
        this.g = activityState.pushToken;
    }
}

package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ResponseParser {
    public static final int ResponseActionDiscard = 0;
    public static final int ResponseActionRetry = 1;

    public static int parse(int i) {
        if (i < 200 || i > 299) {
            return ((i < 300 || i > 399) && i >= 400 && i <= 499) ? 0 : 1;
        }
        return 0;
    }
}

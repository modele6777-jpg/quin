package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lga extends Exception {
    public final int errorCode;
    public final Bundle extras;
    public final long timestampMs;

    static {
        kv2.v(0, 1, 2, 3, 4);
        pqf.D(5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lga(String str, Throwable th, int i, long j) {
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        this.errorCode = i;
        this.extras = bundle;
        this.timestampMs = j;
    }
}

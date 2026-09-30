package io.sentry.android.replay;

import defpackage.ap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {
    public volatile t a;

    public final boolean a(t tVar) {
        tVar.getClass();
        switch (r.a[this.a.ordinal()]) {
            case 1:
                return tVar == t.STARTED || tVar == t.CLOSED;
            case 2:
                return tVar == t.PAUSED || tVar == t.STOPPED || tVar == t.CLOSED;
            case 3:
                return tVar == t.PAUSED || tVar == t.STOPPED || tVar == t.CLOSED;
            case 4:
                return tVar == t.RESUMED || tVar == t.STOPPED || tVar == t.CLOSED;
            case 5:
                return tVar == t.STARTED || tVar == t.CLOSED;
            default:
                ap.c();
            case 6:
                return false;
        }
    }
}

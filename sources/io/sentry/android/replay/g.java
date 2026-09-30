package io.sentry.android.replay;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.valueOf(((l) obj).b).compareTo(Long.valueOf(((l) obj2).b));
            default:
                return Long.valueOf(((io.sentry.rrweb.b) obj).b).compareTo(Long.valueOf(((io.sentry.rrweb.b) obj2).b));
        }
    }
}

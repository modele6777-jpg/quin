package io.sentry.android.replay.capture;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((io.sentry.rrweb.b) obj).b).compareTo(Long.valueOf(((io.sentry.rrweb.b) obj2).b));
    }
}

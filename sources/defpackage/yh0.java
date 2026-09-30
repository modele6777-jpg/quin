package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yh0 {
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(yh0.class, "a");
    public volatile long a;

    public final String toString() {
        return String.valueOf(this.a);
    }
}

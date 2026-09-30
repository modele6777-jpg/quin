package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.v5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Comparable {
    public String a;
    public long b;
    public long c;
    public long d;

    public final long a() {
        if (e()) {
            return this.d - this.c;
        }
        return 0L;
    }

    public final v5 b() {
        if (d()) {
            return new v5(this.b * 1000000);
        }
        return null;
    }

    public final boolean c() {
        return this.d == 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((h) obj).b);
    }

    public final boolean d() {
        return this.c != 0;
    }

    public final boolean e() {
        return this.d != 0;
    }

    public final void f(long j) {
        this.c = j;
        this.b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.c);
    }
}

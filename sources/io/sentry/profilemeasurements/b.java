package io.sentry.profilemeasurements;

import io.sentry.e;
import io.sentry.internal.debugmeta.c;
import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements k2 {
    public ConcurrentHashMap a;
    public double b;
    public String c;
    public double d;

    public b(Long l, Number number, long j) {
        this.c = l.toString();
        this.d = number.doubleValue();
        this.b = j / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return io.sentry.util.b.i(this.a, bVar.a) && this.c.equals(bVar.c) && this.d == bVar.d && this.b == bVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, Double.valueOf(this.d)});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        c cVar = (c) m3Var;
        cVar.j();
        cVar.q("value");
        cVar.w(z0Var, Double.valueOf(this.d));
        cVar.q("elapsed_since_start_ns");
        cVar.w(z0Var, this.c);
        cVar.q("timestamp");
        cVar.w(z0Var, io.sentry.config.a.g(this.b));
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.a, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}

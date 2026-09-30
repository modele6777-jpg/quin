package io.sentry.profilemeasurements;

import io.sentry.e;
import io.sentry.internal.debugmeta.c;
import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements k2 {
    public ConcurrentHashMap a;
    public String b;
    public Collection c;

    public a(String str, AbstractCollection abstractCollection) {
        this.b = str;
        this.c = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.util.b.i(this.a, aVar.a) && this.b.equals(aVar.b) && new ArrayList(this.c).equals(new ArrayList(aVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        c cVar = (c) m3Var;
        cVar.j();
        cVar.q("unit");
        cVar.w(z0Var, this.b);
        cVar.q("values");
        cVar.w(z0Var, this.c);
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.a, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}

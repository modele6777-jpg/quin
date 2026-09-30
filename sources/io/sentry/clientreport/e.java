package io.sentry.clientreport;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements k2 {
    public final String a;
    public final String b;
    public final Long c;
    public HashMap d;

    public e(String str, String str2, Long l) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("reason");
        cVar.z(this.a);
        cVar.q("category");
        cVar.z(this.b);
        cVar.q("quantity");
        cVar.y(this.c);
        HashMap map = this.d;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.d, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.a + "', category='" + this.b + "', quantity=" + this.c + '}';
    }
}

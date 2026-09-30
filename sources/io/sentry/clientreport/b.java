package io.sentry.clientreport;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements k2 {
    public final Date a;
    public final ArrayList b;
    public HashMap c;

    public b(Date date, ArrayList arrayList) {
        this.a = date;
        this.b = arrayList;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("timestamp");
        cVar.z(io.sentry.vendor.a.f(this.a.getTime()));
        cVar.q("discarded_events");
        cVar.w(z0Var, this.b);
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.c, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}

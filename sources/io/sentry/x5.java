package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x5 implements k2 {
    public final List a;
    public HashMap b;

    public x5(List list) {
        this.a = list;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("items");
        cVar.w(z0Var, this.a);
        HashMap map = this.b;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.b, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}

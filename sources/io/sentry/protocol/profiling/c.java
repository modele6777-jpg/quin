package io.sentry.protocol.profiling;

import io.sentry.e;
import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements k2 {
    public String a;
    public int b;
    public HashMap c;

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("name");
            cVar.w(z0Var, this.a);
        }
        cVar.q("priority");
        cVar.w(z0Var, Integer.valueOf(this.b));
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.c, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}

package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements k2 {
    public String a;
    public Integer b;
    public Integer c;
    public Integer d;
    public HashMap e;

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("sdk_name");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("version_major");
            cVar.y(this.b);
        }
        if (this.c != null) {
            cVar.q("version_minor");
            cVar.y(this.c);
        }
        if (this.d != null) {
            cVar.q("version_patchlevel");
            cVar.y(this.d);
        }
        HashMap map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.e, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}

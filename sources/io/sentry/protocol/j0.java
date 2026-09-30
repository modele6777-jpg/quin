package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements k2 {
    public final String a;
    public final List b;
    public HashMap c;

    public j0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        String str = this.a;
        if (str != null) {
            cVar.q("rendering_system");
            cVar.z(str);
        }
        List list = this.b;
        if (list != null) {
            cVar.q("windows");
            cVar.w(z0Var, list);
        }
        HashMap map = this.c;
        if (map != null) {
            for (String str2 : map.keySet()) {
                io.sentry.e.a(this.c, str2, cVar, str2, z0Var);
            }
        }
        cVar.m();
    }
}

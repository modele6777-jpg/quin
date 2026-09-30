package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a4 implements k2 {
    public Integer a;
    public List b;
    public HashMap c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a4.class == obj.getClass()) {
            a4 a4Var = (a4) obj;
            if (io.sentry.util.b.i(this.a, a4Var.a) && io.sentry.util.b.i(this.b, a4Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.b;
        if (this.a != null) {
            cVar.q("segment_id");
            cVar.y(this.a);
        }
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.c, str, cVar, str, z0Var);
            }
        }
        cVar.m();
        cVar2.f = true;
        if (this.a != null) {
            cVar2.G();
            cVar2.b();
            cVar2.a.append((CharSequence) "\n");
        }
        List list = this.b;
        if (list != null) {
            cVar.w(z0Var, list);
        }
        cVar2.f = false;
    }
}

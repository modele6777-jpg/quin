package io.sentry.rrweb;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends b implements k2 {
    public String c;
    public int d;
    public int e;
    public HashMap f;

    public j() {
        super(c.Meta);
        this.c = "";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.d == jVar.d && this.e == jVar.e && io.sentry.util.b.i(this.c, jVar.c);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("type");
        cVar.w(z0Var, this.a);
        cVar.q("timestamp");
        cVar.v(this.b);
        cVar.q("data");
        cVar.j();
        cVar.q("href");
        cVar.z(this.c);
        cVar.q("height");
        cVar.v(this.d);
        cVar.q("width");
        cVar.v(this.e);
        HashMap map = this.f;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.f, str, cVar, str, z0Var);
            }
        }
        cVar.m();
        cVar.m();
    }
}

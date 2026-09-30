package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements k2 {
    public final String a;
    public final String b;
    public HashMap c;

    public x(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.a.equals(xVar.a) && this.b.equals(xVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("name");
        cVar.z(this.a);
        cVar.q("version");
        cVar.z(this.b);
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.c, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}

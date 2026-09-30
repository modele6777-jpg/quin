package io.sentry;

import defpackage.ks0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p7 implements k2 {
    public final io.sentry.protocol.w a;
    public final String b;
    public final String c;
    public final String d;
    public HashMap e;

    public p7(io.sentry.protocol.w wVar, String str, String str2, String str3) {
        this.a = wVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("event_id");
        this.a.serialize(cVar, z0Var);
        String str = this.b;
        if (str != null) {
            cVar.q("name");
            cVar.z(str);
        }
        String str2 = this.c;
        if (str2 != null) {
            cVar.q("email");
            cVar.z(str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            cVar.q("comments");
            cVar.z(str3);
        }
        HashMap map = this.e;
        if (map != null) {
            for (String str4 : map.keySet()) {
                e.a(this.e, str4, cVar, str4, z0Var);
            }
        }
        cVar.m();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', email='");
        sb.append(this.c);
        sb.append("', comments='");
        return ks0.l(sb, this.d, "'}");
    }
}

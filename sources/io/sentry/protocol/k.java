package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements k2 {
    public String a;
    public String b;
    public String c;
    public w d;
    public w e;
    public String f;
    public AbstractMap g;

    public k(String str) {
        if (str.length() > 4096) {
            this.a = str.substring(0, 4096);
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return io.sentry.util.b.i(this.a, kVar.a) && io.sentry.util.b.i(this.b, kVar.b) && io.sentry.util.b.i(this.c, kVar.c) && io.sentry.util.b.i(this.d, kVar.d) && io.sentry.util.b.i(this.e, kVar.e) && io.sentry.util.b.i(this.f, kVar.f) && io.sentry.util.b.i(this.g, kVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("message");
        cVar.z(this.a);
        if (this.b != null) {
            cVar.q("contact_email");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("name");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("associated_event_id");
            this.d.serialize(cVar, z0Var);
        }
        if (this.e != null) {
            cVar.q("replay_id");
            this.e.serialize(cVar, z0Var);
        }
        if (this.f != null) {
            cVar.q("url");
            cVar.z(this.f);
        }
        AbstractMap abstractMap = this.g;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.g.get(str);
                cVar.q(str);
                cVar.w(z0Var, obj);
            }
        }
        cVar.m();
    }

    public final String toString() {
        return "Feedback{message='" + this.a + "', contactEmail='" + this.b + "', name='" + this.c + "', associatedEventId=" + this.d + ", replayId=" + this.e + ", url='" + this.f + "', unknown=" + this.g + '}';
    }
}

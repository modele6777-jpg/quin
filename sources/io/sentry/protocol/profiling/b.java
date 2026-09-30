package io.sentry.protocol.profiling;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements k2 {
    public double a;
    public int b;
    public String c;
    public AbstractMap d;

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("timestamp");
        cVar.w(z0Var, io.sentry.config.a.g(this.a));
        cVar.q("stack_id");
        cVar.w(z0Var, Integer.valueOf(this.b));
        if (this.c != null) {
            cVar.q("thread_id");
            cVar.w(z0Var, this.c);
        }
        AbstractMap abstractMap = this.d;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.d.get(str);
                cVar.q(str);
                cVar.w(z0Var, obj);
            }
        }
        cVar.m();
    }
}

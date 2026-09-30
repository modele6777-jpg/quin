package io.sentry;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t5 implements k2 {
    public final /* synthetic */ int a;
    public final Object b;
    public AbstractMap c;

    public /* synthetic */ t5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
                cVar.j();
                cVar.q("items");
                cVar.w(z0Var, (List) obj);
                HashMap map = (HashMap) this.c;
                if (map != null) {
                    for (String str : map.keySet()) {
                        e.a((HashMap) this.c, str, cVar, str, z0Var);
                    }
                }
                cVar.m();
                break;
            default:
                io.sentry.internal.debugmeta.c cVar2 = (io.sentry.internal.debugmeta.c) m3Var;
                cVar2.j();
                String str2 = (String) obj;
                if (str2 != null) {
                    cVar2.q("source");
                    cVar2.w(z0Var, str2);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
                if (concurrentHashMap != null) {
                    for (String str3 : concurrentHashMap.keySet()) {
                        e.b((ConcurrentHashMap) this.c, str3, cVar2, str3, z0Var);
                    }
                }
                cVar2.m();
                break;
        }
    }
}

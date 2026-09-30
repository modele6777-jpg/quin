package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.t4;
import io.sentry.z0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements k2 {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final Object c;
    public AbstractMap d;

    public n(Object obj, String str) {
        this.b = str;
        if (obj == null || !str.equals("string")) {
            this.c = obj;
        } else {
            this.c = obj.toString();
        }
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        int i = this.a;
        Object obj = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
                cVar.j();
                cVar.q("value");
                cVar.y((Number) obj);
                if (str != null) {
                    cVar.q("unit");
                    cVar.z(str);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d;
                if (concurrentHashMap != null) {
                    for (String str2 : concurrentHashMap.keySet()) {
                        io.sentry.e.b((ConcurrentHashMap) this.d, str2, cVar, str2, z0Var);
                    }
                }
                cVar.m();
                break;
            default:
                io.sentry.internal.debugmeta.c cVar2 = (io.sentry.internal.debugmeta.c) m3Var;
                cVar2.j();
                cVar2.q("type");
                cVar2.w(z0Var, str);
                cVar2.q("value");
                cVar2.w(z0Var, obj);
                HashMap map = (HashMap) this.d;
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        io.sentry.e.a((HashMap) this.d, str3, cVar2, str3, z0Var);
                    }
                }
                cVar2.m();
                break;
        }
    }

    public n(t4 t4Var, Object obj) {
        this(obj, t4Var.apiName());
    }

    public n(String str, Number number) {
        this.c = number;
        this.b = str;
    }
}

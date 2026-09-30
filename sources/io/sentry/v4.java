package io.sentry;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v4 {
    public List X;
    public io.sentry.protocol.f Y;
    public AbstractMap Z;
    public io.sentry.protocol.w a;
    public final io.sentry.protocol.e b;
    public io.sentry.protocol.u c;
    public io.sentry.protocol.r d;
    public AbstractMap e;
    public String f;
    public String g;
    public String v;
    public io.sentry.protocol.i0 w;
    public transient Throwable x;
    public String y;
    public String z;

    public v4(io.sentry.protocol.w wVar) {
        this.b = new io.sentry.protocol.e();
        this.a = wVar;
    }

    public final Throwable a() {
        Throwable th = this.x;
        return th instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th).c() : th;
    }

    public final void b(String str, String str2) {
        AbstractMap map = this.e;
        if (map == null) {
            map = new HashMap();
            this.e = map;
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    public final void c(Map map) {
        this.e = map != null ? new HashMap(map) : null;
    }

    public v4() {
        this(new io.sentry.protocol.w());
    }
}

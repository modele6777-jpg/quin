package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h5 implements k2 {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final p5 e;
    public final int f;
    public final Callable g;
    public final String v;
    public final Callable w;
    public HashMap x;

    public h5(p5 p5Var, int i, Callable callable, String str, String str2, String str3, String str4, Integer num, Callable callable2) {
        io.sentry.util.b.r(p5Var, "type is required");
        this.e = p5Var;
        this.a = str;
        this.f = i;
        this.c = str2;
        this.g = callable;
        this.v = str3;
        this.d = str4;
        this.b = num;
        this.w = callable2;
    }

    public final int a() {
        Callable callable = this.g;
        if (callable == null) {
            return this.f;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        String str = this.a;
        if (str != null) {
            cVar.q("content_type");
            cVar.z(str);
        }
        String str2 = this.c;
        if (str2 != null) {
            cVar.q("filename");
            cVar.z(str2);
        }
        cVar.q("type");
        cVar.w(z0Var, this.e);
        String str3 = this.v;
        if (str3 != null) {
            cVar.q("attachment_type");
            cVar.z(str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            cVar.q("platform");
            cVar.z(str4);
        }
        Integer num = this.b;
        if (num != null) {
            cVar.q("item_count");
            cVar.y(num);
        }
        cVar.q("length");
        cVar.v(a());
        Integer num2 = null;
        Callable callable = this.w;
        if (callable != null) {
            try {
                num2 = (Integer) callable.call();
            } catch (Throwable unused) {
            }
        }
        if (num2 != null) {
            cVar.q("meta_length");
            cVar.y(num2);
        }
        HashMap map = this.x;
        if (map != null) {
            for (String str5 : map.keySet()) {
                e.a(this.x, str5, cVar, str5, z0Var);
            }
        }
        cVar.m();
    }

    public h5(p5 p5Var, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        this(p5Var, -1, callable, str, str2, str3, str4, num, null);
    }

    public h5(p5 p5Var, Callable callable, String str, String str2, String str3) {
        this(p5Var, callable, str, str2, str3, null, null);
    }
}

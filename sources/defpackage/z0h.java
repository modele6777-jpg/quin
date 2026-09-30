package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0h {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public z0h(long j, long j2, Bundle bundle, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.e = bundle;
        this.c = j;
        this.d = j2;
    }

    public static z0h a(hsg hsgVar) {
        String str = hsgVar.a;
        String str2 = hsgVar.c;
        return new z0h(hsgVar.d, hsgVar.e, hsgVar.b.f(), str, str2);
    }

    public final hsg b() {
        esg esgVar = new esg(new Bundle(this.e));
        return new hsg(this.a, esgVar, this.b, this.c, this.d);
    }

    public final String toString() {
        String string = this.e.toString();
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        ub3.v(sb, "origin=", str, ",name=", str2);
        return ks0.l(sb, ",params=", string);
    }
}

package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class as9 {
    public final Context a;
    public final ykd b;
    public final zdc c;
    public final bpa d;
    public final String e;
    public final zd5 f;
    public final m81 g;
    public final m81 h;
    public final m81 i;
    public final r95 j;

    public as9(Context context, ykd ykdVar, zdc zdcVar, bpa bpaVar, String str, zd5 zd5Var, m81 m81Var, m81 m81Var2, m81 m81Var3, r95 r95Var) {
        this.a = context;
        this.b = ykdVar;
        this.c = zdcVar;
        this.d = bpaVar;
        this.e = str;
        this.f = zd5Var;
        this.g = m81Var;
        this.h = m81Var2;
        this.i = m81Var3;
        this.j = r95Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as9)) {
            return false;
        }
        as9 as9Var = (as9) obj;
        return pa7.t(this.a, as9Var.a) && pa7.t(this.b, as9Var.b) && this.c == as9Var.c && this.d == as9Var.d && pa7.t(this.e, as9Var.e) && pa7.t(this.f, as9Var.f) && this.g == as9Var.g && this.h == as9Var.h && this.i == as9Var.i && pa7.t(this.j, as9Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ")";
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lsf extends nsf implements Iterable, zm7 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float v;
    public final List w;
    public final ArrayList x;

    public lsf(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.v = f7;
        this.w = list;
        this.x = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lsf)) {
            return false;
        }
        lsf lsfVar = (lsf) obj;
        return pa7.t(this.a, lsfVar.a) && this.b == lsfVar.b && this.c == lsfVar.c && this.d == lsfVar.d && this.e == lsfVar.e && this.f == lsfVar.f && this.g == lsfVar.g && this.v == lsfVar.v && pa7.t(this.w, lsfVar.w) && this.x.equals(lsfVar.x);
    }

    public final int hashCode() {
        return this.x.hashCode() + tec.a(ub3.a(this.v, ub3.a(this.g, ub3.a(this.f, ub3.a(this.e, ub3.a(this.d, ub3.a(this.c, ub3.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.w);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e9a(this);
    }
}

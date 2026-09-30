package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vne implements CharSequence {
    public final List a;
    public final xse b;
    public final CharSequence c;
    public final long d;
    public final eue e;
    public final iy9 f;

    public vne(CharSequence charSequence, long j, eue eueVar, iy9 iy9Var, List list, List list2, xse xseVar, int i) {
        eueVar = (i & 4) != 0 ? null : eueVar;
        iy9Var = (i & 8) != 0 ? null : iy9Var;
        list = (i & 16) != 0 ? null : list;
        xseVar = (i & 64) != 0 ? null : xseVar;
        this.a = list;
        this.b = xseVar;
        this.c = charSequence instanceof vne ? ((vne) charSequence).c : charSequence;
        this.d = u3c.d(charSequence.length(), j);
        this.e = eueVar != null ? new eue(u3c.d(charSequence.length(), eueVar.a)) : null;
        this.f = iy9Var != null ? iy9.c(iy9Var, new eue(u3c.d(charSequence.length(), ((eue) iy9Var.e()).a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.c.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vne.class != obj.getClass()) {
            return false;
        }
        vne vneVar = (vne) obj;
        if (eue.c(this.d, vneVar.d) && pa7.t(this.e, vneVar.e) && pa7.t(this.f, vneVar.f) && pa7.t(this.a, vneVar.a)) {
            return c5e.t(this.c, vneVar.c) && pa7.t(this.b, vneVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        int i = eue.c;
        int iB = ib8.b(iHashCode, 31, this.d);
        eue eueVar = this.e;
        int iHashCode2 = (iB + (eueVar != null ? Long.hashCode(eueVar.a) : 0)) * 31;
        iy9 iy9Var = this.f;
        int iHashCode3 = (iHashCode2 + (iy9Var != null ? iy9Var.hashCode() : 0)) * 31;
        List list = this.a;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        xse xseVar = this.b;
        return iHashCode4 + (xseVar != null ? xseVar.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.c.toString();
    }
}

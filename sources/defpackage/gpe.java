package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gpe {
    public static final gpe f = new gpe(false, 9205357640488583168L, 0.0f, txb.a, false);
    public final boolean a;
    public final long b;
    public final float c;
    public final txb d;
    public final boolean e;

    public gpe(boolean z, long j, float f2, txb txbVar, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = f2;
        this.d = txbVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpe)) {
            return false;
        }
        gpe gpeVar = (gpe) obj;
        return this.a == gpeVar.a && hl9.c(this.b, gpeVar.b) && Float.compare(this.c, gpeVar.c) == 0 && this.d == gpeVar.d && this.e == gpeVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ub3.a(this.c, ib8.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        String strI = hl9.i(this.b);
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(strI);
        sb.append(", lineHeight=");
        sb.append(this.c);
        sb.append(", direction=");
        sb.append(this.d);
        sb.append(", handlesCrossed=");
        return ub3.m(sb, this.e, ")");
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c6d {
    public final cv6 a;
    public final qad b;
    public final int c;
    public final int d;
    public final int e;
    public final List f;

    public c6d(cv6 cv6Var, qad qadVar, int i, int i2, int i3, c78 c78Var) {
        cv6Var.getClass();
        c78Var.getClass();
        this.a = cv6Var;
        this.b = qadVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = c78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6d)) {
            return false;
        }
        c6d c6dVar = (c6d) obj;
        return pa7.t(this.a, c6dVar.a) && this.b.equals(c6dVar.b) && this.c == c6dVar.c && this.d == c6dVar.d && this.e == c6dVar.e && this.f.equals(c6dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ub3.b(this.e, ub3.b(this.d, ub3.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareBitmapPreviewPlan(imageBitmap=");
        sb.append(this.a);
        sb.append(", metrics=");
        sb.append(this.b);
        sb.append(", sourceStripHeight=");
        ub3.u(sb, this.c, ", beforeContentPaddingPx=", this.d, ", afterContentPaddingPx=");
        sb.append(this.e);
        sb.append(", strips=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}

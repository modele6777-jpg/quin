package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zn4 implements hu2 {
    public final Drawable a;
    public final int b;
    public final int c;

    public zn4(Drawable drawable, int i, int i2) {
        this.a = drawable;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.hu2
    public final int c() {
        return this.c;
    }

    @Override // defpackage.hu2
    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn4)) {
            return false;
        }
        zn4 zn4Var = (zn4) obj;
        return this.a.equals(zn4Var.a) && this.b == zn4Var.b && this.c == zn4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DrawableImage(drawable=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return tec.n(sb, this.c, ')');
    }
}

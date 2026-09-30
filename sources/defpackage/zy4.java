package defpackage;

import android.util.Range;
import android.util.Rational;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zy4 {
    public final boolean a;
    public final int b;
    public final Range c;
    public final Rational d;

    public zy4(boolean z, int i, Range range, Rational rational) {
        this.a = z;
        this.b = i;
        this.c = range;
        this.d = rational;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy4)) {
            return false;
        }
        zy4 zy4Var = (zy4) obj;
        return this.a == zy4Var.a && this.b == zy4Var.b && this.c.equals(zy4Var.c) && this.d.equals(zy4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ub3.b(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "EvCompValue(supported=" + this.a + ", index=" + this.b + ", range=" + this.c + ", step=" + this.d + ')';
    }
}

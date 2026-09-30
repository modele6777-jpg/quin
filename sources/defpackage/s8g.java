package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s8g {
    public final h21 a;
    public final float b;

    public s8g(Rect rect, float f) {
        this.a = new h21(rect);
        this.b = f;
    }

    public final Rect a() {
        h21 h21Var = this.a;
        h21Var.getClass();
        return new Rect(h21Var.a, h21Var.b, h21Var.c, h21Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s8g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        s8g s8gVar = (s8g) obj;
        return pa7.t(this.a, s8gVar.a) && this.b == s8gVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public s8g(h21 h21Var, float f) {
        this.a = h21Var;
        this.b = f;
    }
}

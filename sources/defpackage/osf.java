package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class osf extends nsf {
    public final float X;
    public final float Y;
    public final String a;
    public final List b;
    public final int c;
    public final b41 d;
    public final float e;
    public final b41 f;
    public final float g;
    public final float v;
    public final int w;
    public final int x;
    public final float y;
    public final float z;

    public osf(String str, List list, int i, b41 b41Var, float f, b41 b41Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = b41Var;
        this.e = f;
        this.f = b41Var2;
        this.g = f2;
        this.v = f3;
        this.w = i2;
        this.x = i3;
        this.y = f4;
        this.z = f5;
        this.X = f6;
        this.Y = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || osf.class != obj.getClass()) {
            return false;
        }
        osf osfVar = (osf) obj;
        return this.a.equals(osfVar.a) && pa7.t(this.d, osfVar.d) && this.e == osfVar.e && pa7.t(this.f, osfVar.f) && this.g == osfVar.g && this.v == osfVar.v && this.w == osfVar.w && this.x == osfVar.x && this.y == osfVar.y && this.z == osfVar.z && this.X == osfVar.X && this.Y == osfVar.Y && this.c == osfVar.c && pa7.t(this.b, osfVar.b);
    }

    public final int hashCode() {
        int iA = tec.a(this.a.hashCode() * 31, 31, this.b);
        b41 b41Var = this.d;
        int iA2 = ub3.a(this.e, (iA + (b41Var != null ? b41Var.hashCode() : 0)) * 31, 31);
        b41 b41Var2 = this.f;
        return Integer.hashCode(this.c) + ub3.a(this.Y, ub3.a(this.X, ub3.a(this.z, ub3.a(this.y, ub3.b(this.x, ub3.b(this.w, ub3.a(this.v, ub3.a(this.g, (iA2 + (b41Var2 != null ? b41Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}

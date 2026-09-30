package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l8f implements yn7 {
    public final um7 a;
    public final List b;
    public final int c;

    public l8f(um7 um7Var, List list, int i) {
        um7Var.getClass();
        list.getClass();
        this.a = um7Var;
        this.b = list;
        this.c = i;
    }

    @Override // defpackage.yn7
    public final List A() {
        return this.b;
    }

    @Override // defpackage.yn7
    public final um7 B() {
        return this.a;
    }

    public final String d(boolean z) {
        String name;
        um7 um7Var = this.a;
        em7 em7Var = um7Var instanceof em7 ? (em7) um7Var : null;
        Class clsR = em7Var != null ? af1.R(em7Var) : null;
        if (clsR == null) {
            name = um7Var.toString();
        } else if ((this.c & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (!clsR.isArray()) {
            name = (z && clsR.isPrimitive()) ? af1.S((em7) um7Var).getName() : clsR.getName();
        } else if (clsR.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsR.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsR.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsR.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsR.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsR.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsR.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsR.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        return ub3.j(name, this.b.isEmpty() ? "" : s72.D0(this.b, ", ", "<", ">", new k8f(this), 24), o() ? "?" : "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l8f)) {
            return false;
        }
        l8f l8fVar = (l8f) obj;
        return pa7.t(this.a, l8fVar.a) && pa7.t(this.b, l8fVar.b) && this.c == l8fVar.c;
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return pu4.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + tec.a(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.yn7
    public final boolean o() {
        return (this.c & 1) != 0;
    }

    public final String toString() {
        return d(false).concat(" (Kotlin reflection is not available)");
    }
}

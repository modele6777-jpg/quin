package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bx4 {
    public static final cx4 a = new cx4(new o3f((x95) null, (ood) null, (vv1) null, (aec) null, (LinkedHashMap) null, 127));

    public final cx4 a(bx4 bx4Var) {
        x95 x95Var = ((cx4) bx4Var).b.a;
        if (x95Var == null) {
            x95Var = ((cx4) this).b.a;
        }
        o3f o3fVar = ((cx4) bx4Var).b;
        ood oodVar = o3fVar.b;
        if (oodVar == null) {
            oodVar = ((cx4) this).b.b;
        }
        vv1 vv1Var = o3fVar.c;
        if (vv1Var == null) {
            vv1Var = ((cx4) this).b.c;
        }
        aec aecVar = o3fVar.d;
        if (aecVar == null) {
            aecVar = ((cx4) this).b.d;
        }
        return new cx4(new o3f(x95Var, oodVar, vv1Var, aecVar, bm8.L(((cx4) this).b.f, o3fVar.f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bx4) && ((cx4) ((bx4) obj)).b.equals(((cx4) this).b);
    }

    public final int hashCode() {
        return ((cx4) this).b.hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "EnterTransition.None";
        }
        o3f o3fVar = ((cx4) this).b;
        x95 x95Var = o3fVar.a;
        String string = x95Var != null ? x95Var.toString() : null;
        ood oodVar = o3fVar.b;
        String string2 = oodVar != null ? oodVar.toString() : null;
        vv1 vv1Var = o3fVar.c;
        String string3 = vv1Var != null ? vv1Var.toString() : null;
        aec aecVar = o3fVar.d;
        return ks0.m(ib8.o("EnterTransition: Fade - ", string, ", Slide - ", string2, ", Shrink - "), string3, ", Scale - ", aecVar != null ? aecVar.toString() : null, ", Veil - null");
    }
}

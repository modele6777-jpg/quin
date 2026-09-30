package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e45 {
    public static final f45 a;
    public static final f45 b;

    static {
        LinkedHashMap linkedHashMap = null;
        x95 x95Var = null;
        ood oodVar = null;
        vv1 vv1Var = null;
        aec aecVar = null;
        a = new f45(new o3f(x95Var, oodVar, vv1Var, aecVar, linkedHashMap, 127));
        b = new f45(new o3f(x95Var, oodVar, vv1Var, aecVar, linkedHashMap, 95));
    }

    public final f45 a(e45 e45Var) {
        x95 x95Var = ((f45) e45Var).c.a;
        if (x95Var == null) {
            x95Var = ((f45) this).c.a;
        }
        o3f o3fVar = ((f45) e45Var).c;
        ood oodVar = o3fVar.b;
        if (oodVar == null) {
            oodVar = ((f45) this).c.b;
        }
        vv1 vv1Var = o3fVar.c;
        if (vv1Var == null) {
            vv1Var = ((f45) this).c.c;
        }
        aec aecVar = o3fVar.d;
        if (aecVar == null) {
            aecVar = ((f45) this).c.d;
        }
        boolean z = o3fVar.e;
        o3f o3fVar2 = ((f45) this).c;
        return new f45(new o3f(x95Var, oodVar, vv1Var, aecVar, z || o3fVar2.e, bm8.L(o3fVar2.f, o3fVar.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e45) && ((f45) ((e45) obj)).c.equals(((f45) this).c);
    }

    public final int hashCode() {
        return ((f45) this).c.hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "ExitTransition.None";
        }
        if (equals(b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        o3f o3fVar = ((f45) this).c;
        x95 x95Var = o3fVar.a;
        String string = x95Var != null ? x95Var.toString() : null;
        ood oodVar = o3fVar.b;
        String string2 = oodVar != null ? oodVar.toString() : null;
        vv1 vv1Var = o3fVar.c;
        String string3 = vv1Var != null ? vv1Var.toString() : null;
        aec aecVar = o3fVar.d;
        String string4 = aecVar != null ? aecVar.toString() : null;
        boolean z = o3fVar.e;
        StringBuilder sbO = ib8.o("ExitTransition:  Fade - ", string, ",  Slide - ", string2, ",  Shrink - ");
        ub3.v(sbO, string3, ",  Scale - ", string4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        sbO.append(z);
        return sbO.toString();
    }
}

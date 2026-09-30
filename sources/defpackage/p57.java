package defpackage;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p57 {
    public static final p57 a = new p57();

    public static Set b(String str) {
        ue5 ue5Var = new ue5(new ve5(fyc.x(new td0(6, str), m57.a), true, n57.a));
        if (!ue5Var.hasNext()) {
            return xu4.a;
        }
        Object next = ue5Var.next();
        if (!ue5Var.hasNext()) {
            return n3d.p(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (ue5Var.hasNext()) {
            linkedHashSet.add(ue5Var.next());
        }
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, boolean z, zn2 zn2Var) {
        k57 k57Var;
        Object dzbVar;
        if (zn2Var instanceof k57) {
            k57Var = (k57) zn2Var;
            int i = k57Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                k57Var.label = i - Integer.MIN_VALUE;
            } else {
                k57Var = new k57(this, zn2Var);
            }
        } else {
            k57Var = new k57(this, zn2Var);
        }
        Object obj = k57Var.result;
        int i2 = k57Var.label;
        wef wefVar = wef.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                if (!v4e.Q(str)) {
                    ypa ypaVar = ypa.a;
                    l57 l57Var = new l57(str, z, this, null);
                    k57Var.L$0 = null;
                    k57Var.L$1 = null;
                    k57Var.Z$0 = z;
                    k57Var.label = 1;
                    Object objA = ypaVar.a(l57Var, k57Var);
                    bw2 bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                }
                return wefVar;
            }
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            dzbVar = wefVar;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("InstallationAccountRegistry").c("Failed to persist signed-in account", thA);
        }
        return wefVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(String str, zn2 zn2Var) {
        o57 o57Var;
        Serializable dzbVar;
        if (zn2Var instanceof o57) {
            o57Var = (o57) zn2Var;
            int i = o57Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                o57Var.label = i - Integer.MIN_VALUE;
            } else {
                o57Var = new o57(this, zn2Var);
            }
        } else {
            o57Var = new o57(this, zn2Var);
        }
        Object objB = o57Var.result;
        int i2 = o57Var.label;
        try {
            if (i2 == 0) {
                jzb.q(objB);
                if (v4e.Q(str)) {
                    return Boolean.FALSE;
                }
                ypa.a.getClass();
                wj5 wj5VarB = ypa.b();
                o57Var.L$0 = str;
                o57Var.L$1 = null;
                o57Var.L$2 = this;
                o57Var.label = 1;
                objB = tm7.B(wj5VarB, o57Var);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (p57) o57Var.L$2;
                str = (String) o57Var.L$0;
                jzb.q(objB);
            }
            String str2 = (String) ((p79) objB).c(xqa.G.a);
            if (str2 == null) {
                str2 = "";
            }
            this.getClass();
            dzbVar = Boolean.valueOf(b(str2).contains(str));
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("InstallationAccountRegistry").c("Failed to load locally registered accounts", thA);
        }
        return dzbVar instanceof dzb ? Boolean.FALSE : dzbVar;
    }
}

package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n8c {
    public static final j22 a;

    static {
        dx5 dx5Var = new dx5("java.lang.Void");
        a = new j22(dx5Var.b(), dx5Var.a.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qk7 a(c36 c36Var) {
        String strG = m7c.g(c36Var);
        if (strG == null) {
            if (c36Var instanceof zxa) {
                String strB = qz3.i(c36Var).getName().b();
                strB.getClass();
                strG = oj7.a(strB);
            } else if (c36Var instanceof dya) {
                String strB2 = qz3.i(c36Var).getName().b();
                strB2.getClass();
                strG = "set".concat(oj7.b(strB2) ? strB2.substring(2) : ym8.s(strB2));
            } else {
                strG = ((cm3) c36Var).getName().b();
                strG.getClass();
            }
        }
        return new qk7(new sk7(strG, xo1.q(c36Var, 1)));
    }

    public static m93 b(wxa wxaVar) {
        wxaVar.getClass();
        wxa wxaVarA = ((wxa) oz3.r(wxaVar)).a();
        wxaVarA.getClass();
        if (wxaVarA instanceof q04) {
            q04 q04Var = (q04) wxaVarA;
            kza kzaVar = q04Var.Q0;
            s56 s56Var = rl7.d;
            s56Var.getClass();
            ll7 ll7Var = (ll7) vpf.F(kzaVar, s56Var);
            if (ll7Var != null) {
                return new el7(wxaVarA, kzaVar, ll7Var, q04Var.R0, q04Var.S0);
            }
        } else if (wxaVarA instanceof lf7) {
            lf7 lf7Var = (lf7) wxaVarA;
            ntd ntdVarE = lf7Var.e();
            l8c l8cVar = ntdVarE instanceof l8c ? (l8c) ntdVarE : null;
            jnb jnbVar = l8cVar != null ? l8cVar.a : null;
            if (jnbVar instanceof lnb) {
                return new cl7(((lnb) jnbVar).a);
            }
            if (!(jnbVar instanceof onb)) {
                r82.h("Incorrect resolution sequence for Java field ", wxaVarA, " (source = ", jnbVar);
                return null;
            }
            Method method = ((onb) jnbVar).a;
            dya dyaVar = lf7Var.N0;
            ntd ntdVarE2 = dyaVar != null ? dyaVar.e() : null;
            l8c l8cVar2 = ntdVarE2 instanceof l8c ? (l8c) ntdVarE2 : null;
            jnb jnbVar2 = l8cVar2 != null ? l8cVar2.a : null;
            onb onbVar = jnbVar2 instanceof onb ? (onb) jnbVar2 : null;
            return new dl7(method, onbVar != null ? onbVar.a : null);
        }
        zxa zxaVarB = wxaVarA.b();
        zxaVarB.getClass();
        qk7 qk7VarA = a(zxaVarB);
        dya dyaVarC = wxaVarA.c();
        return new fl7(qk7VarA, dyaVarC != null ? a(dyaVarC) : null);
    }

    public static xo1 c(c36 c36Var) {
        c36Var.getClass();
        c36 c36VarA = ((c36) oz3.r(c36Var)).a();
        c36VarA.getClass();
        if (c36VarA instanceof vz3) {
            i04 i04Var = (i04) c36VarA;
            ut8 ut8VarR = i04Var.r();
            if (ut8VarR instanceof dza) {
                o85 o85Var = sl7.a;
                sk7 sk7VarC = sl7.c((dza) ut8VarR, i04Var.H(), i04Var.A());
                if (sk7VarC != null) {
                    return new qk7(sk7VarC);
                }
            }
            if (ut8VarR instanceof qya) {
                o85 o85Var2 = sl7.a;
                sk7 sk7VarA = sl7.a((qya) ut8VarR, i04Var.H(), i04Var.A());
                if (sk7VarA != null) {
                    bm3 bm3VarK = c36Var.k();
                    bm3VarK.getClass();
                    return n37.a(bm3VarK) ? new qk7(sk7VarA) : new pk7(sk7VarA);
                }
            }
            return a(c36VarA);
        }
        if (c36VarA instanceof if7) {
            ntd ntdVarE = ((if7) c36VarA).e();
            l8c l8cVar = ntdVarE instanceof l8c ? (l8c) ntdVarE : null;
            jnb jnbVar = l8cVar != null ? l8cVar.a : null;
            onb onbVar = jnbVar instanceof onb ? (onb) jnbVar : null;
            if (onbVar != null) {
                return new ok7(onbVar.a);
            }
            ho7.m(c36VarA, "Incorrect resolution sequence for Java method ");
            return null;
        }
        if (!(c36VarA instanceof wd7)) {
            return a(c36VarA);
        }
        ntd ntdVarE2 = ((wd7) c36VarA).e();
        l8c l8cVar2 = ntdVarE2 instanceof l8c ? (l8c) ntdVarE2 : null;
        jnb jnbVar2 = l8cVar2 != null ? l8cVar2.a : null;
        if (jnbVar2 instanceof inb) {
            return new nk7(((inb) jnbVar2).a);
        }
        if (jnbVar2 instanceof enb) {
            Class cls = ((enb) jnbVar2).a;
            if (cls.isAnnotation()) {
                return new mk7(cls);
            }
        }
        r82.h("Incorrect resolution sequence for Java constructor ", c36VarA, " (", jnbVar2);
        return null;
    }
}

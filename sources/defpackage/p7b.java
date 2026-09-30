package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p7b {
    public static final void a(q7b q7bVar, Object obj, j09 j09Var, l46 l46Var, int i) {
        j09 j09Var2;
        pwf pwfVarH;
        l46Var.h0(1218334232);
        int i2 = i | (l46Var.g(q7bVar) ? 4 : 2) | (l46Var.i(obj) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            cb9 cb9Var = q7bVar.a;
            b1b b1bVar = uq.b;
            Object obj2 = (Context) l46Var.k(b1bVar);
            nfc nfcVarB = kr7.b(l46Var);
            Object obj3 = null;
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj4 = sf2.a;
            if (zG || objR == obj4) {
                objR = nfcVarB.b(job.a.b(j4a.class), null, null);
                l46Var.p0(objR);
            }
            j4a j4aVar = (j4a) objR;
            nfc nfcVarB2 = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(b1bVar);
                Object objR2 = l46Var.R();
                if (objR2 == obj4) {
                    objR2 = d5a.v;
                    l46Var.p0(objR2);
                }
                for (Object obj5 : fyc.u((a26) objR2, objK)) {
                    if (((Context) obj5) instanceof pwf) {
                        obj3 = obj5;
                        break;
                    }
                }
                pwfVarH = (pwf) obj3;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            Object obj6 = (orc) z5c.G(job.a.b(orc.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB2, null);
            Object objR3 = l46Var.R();
            if (objR3 == obj4) {
                objR3 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR3);
            }
            e89 e89Var = (e89) objR3;
            boolean zI = l46Var.i(cb9Var);
            Object objR4 = l46Var.R();
            if (zI || objR4 == obj4) {
                objR4 = new mr2(cb9Var, 3);
                l46Var.p0(objR4);
            }
            af1.g(cb9Var, (a26) objR4, l46Var);
            boolean zI2 = l46Var.i(cb9Var) | l46Var.i(obj2) | l46Var.i(obj6);
            Object objR5 = l46Var.R();
            if (zI2 || objR5 == obj4) {
                Object wcaVar = new wca(cb9Var, obj2, obj6, e89Var, 1);
                l46Var.p0(wcaVar);
                objR5 = wcaVar;
            }
            af1.h(cb9Var, obj2, (a26) objR5, l46Var);
            if (((Boolean) e89Var.getValue()).booleanValue()) {
                l46Var.f0(-1368190747);
                Object objR6 = l46Var.R();
                if (objR6 == obj4) {
                    objR6 = new x08(e89Var, 28);
                    l46Var.p0(objR6);
                }
                x16 x16Var = (x16) objR6;
                Object objR7 = l46Var.R();
                if (objR7 == obj4) {
                    objR7 = new x08(e89Var, 29);
                    l46Var.p0(objR7);
                }
                b21.h(438, x16Var, (x16) objR7, l46Var, false);
                l46Var.r(false);
            } else {
                l46Var.f0(-1368001430);
                l46Var.r(false);
            }
            dd2 dd2VarB0 = af1.b0(-937228518, new sz7(cb9Var, obj, q7bVar, j4aVar, 13), l46Var);
            j09Var2 = j09Var;
            ded.a(j09Var2, dd2VarB0, l46Var, 54, 0);
        } else {
            j09Var2 = j09Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i, q7bVar, obj, j09Var2, 28);
        }
    }
}

package defpackage;

import tech.chatmind.api.AppSettings;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c0e {
    public final vx7 a;
    public final za6 b;

    public c0e(vx7 vx7Var, za6 za6Var) {
        this.a = vx7Var;
        this.b = za6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(zn2 zn2Var) {
        b0e b0eVar;
        Object dzbVar;
        int iM;
        if (zn2Var instanceof b0e) {
            b0eVar = (b0e) zn2Var;
            int i = b0eVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                b0eVar.label = i - Integer.MIN_VALUE;
            } else {
                b0eVar = new b0e(this, zn2Var);
            }
        } else {
            b0eVar = new b0e(this, zn2Var);
        }
        Object objD = b0eVar.result;
        int i2 = b0eVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objD);
                vx7 vx7Var = this.a;
                b0eVar.L$0 = null;
                b0eVar.label = 1;
                objD = vx7Var.d(b0eVar);
                bw2 bw2Var = bw2.a;
                if (objD == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objD);
            }
            dzbVar = (AppSettings) objD;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            this.b.d(thA);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        AppSettings appSettings = (AppSettings) dzbVar;
        if (appSettings == null) {
            return null;
        }
        String forceUpdateSince = appSettings.getForceUpdateSince();
        String suggestUpdateSince = appSettings.getSuggestUpdateSince();
        rob robVar = lb0.d;
        lb0 lb0VarW = oa7.W("5.23.0");
        if (lb0VarW == null) {
            return null;
        }
        lb0 lb0VarW2 = oa7.W(forceUpdateSince);
        int i3 = 0;
        if (lb0VarW2 != null) {
            a26[] a26VarArr = {ib0.a, jb0.a, kb0.a};
            int i4 = 0;
            while (true) {
                if (i4 >= 3) {
                    iM = 0;
                    break;
                }
                a26 a26Var = a26VarArr[i4];
                iM = i7h.m((Comparable) a26Var.d(lb0VarW), (Comparable) a26Var.d(lb0VarW2));
                if (iM != 0) {
                    break;
                }
                i4++;
            }
            if (iM < 0) {
                return d0e.b;
            }
        }
        lb0 lb0VarW3 = oa7.W(suggestUpdateSince);
        if (lb0VarW3 == null) {
            return null;
        }
        a26[] a26VarArr2 = {ib0.a, jb0.a, kb0.a};
        for (int i5 = 0; i5 < 3; i5++) {
            a26 a26Var2 = a26VarArr2[i5];
            int iM2 = i7h.m((Comparable) a26Var2.d(lb0VarW), (Comparable) a26Var2.d(lb0VarW3));
            if (iM2 != 0) {
                i3 = iM2;
                break;
            }
        }
        if (i3 < 0) {
            return d0e.a;
        }
        return null;
    }
}

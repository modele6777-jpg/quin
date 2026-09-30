package defpackage;

import java.time.Instant;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fr3 implements v97, hf8 {
    public final uc4 a;
    public final fab b;
    public final gd8 c;

    public fr3(uc4 uc4Var, fab fabVar, gd8 gd8Var, s7 s7Var) {
        this.a = uc4Var;
        this.b = fabVar;
        this.c = gd8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, String str2, String str3, Instant instant, j97 j97Var, zn2 zn2Var) throws Throwable {
        er3 er3Var;
        String strJ;
        mmb mmbVar;
        String str4;
        if (zn2Var instanceof er3) {
            er3Var = (er3) zn2Var;
            int i = er3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                er3Var.label = i - Integer.MIN_VALUE;
            } else {
                er3Var = new er3(this, zn2Var);
            }
        } else {
            er3Var = new er3(this, zn2Var);
        }
        Object obj = er3Var.result;
        int i2 = er3Var.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                strJ = k99.J(str2);
                j97 j97VarP = tm7.p(j97Var, strJ);
                mmb mmbVar2 = new mmb();
                mmbVar2.element = str;
                k11 k11Var = new k11(j97VarP, strJ, str3, mmbVar2, str, instant, 3);
                er3Var.L$0 = null;
                er3Var.L$1 = null;
                er3Var.L$2 = null;
                er3Var.L$3 = null;
                er3Var.L$4 = null;
                er3Var.L$5 = strJ;
                er3Var.L$6 = null;
                er3Var.L$7 = mmbVar2;
                er3Var.label = 1;
                gq3 gq3Var = (gq3) this.a;
                za2 za2Var = new za2();
                gq3Var.a(new zp3(strJ, k11Var, za2Var));
                Object objS = za2Var.s(er3Var);
                if (objS != bw2Var) {
                    objS = wefVar;
                }
                if (objS != bw2Var) {
                    mmbVar = mmbVar2;
                }
                return bw2Var;
            }
            if (i2 == 1) {
                mmbVar = (mmb) er3Var.L$7;
                String str5 = (String) er3Var.L$5;
                jzb.q(obj);
                strJ = str5;
            } else {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = (String) er3Var.L$5;
                try {
                    jzb.q(obj);
                    return wefVar;
                } catch (Exception e) {
                    e = e;
                }
            }
            d().h("Failed to record completed interpretation " + str4, e);
            return wefVar;
            if (pa7.t(mmbVar.element, s7.a())) {
                ((rab) this.b).f();
                try {
                    gd8 gd8Var = this.c;
                    er3Var.L$0 = null;
                    er3Var.L$1 = null;
                    er3Var.L$2 = null;
                    er3Var.L$3 = null;
                    er3Var.L$4 = null;
                    er3Var.L$5 = strJ;
                    er3Var.L$6 = null;
                    er3Var.L$7 = null;
                    er3Var.label = 2;
                    if (gd8Var.l(er3Var) == bw2Var) {
                        return bw2Var;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str4 = strJ;
                }
            }
            return wefVar;
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}

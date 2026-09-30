package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a16 {
    public final y06 a;

    public a16(y06 y06Var, k16 k16Var) {
        this.a = y06Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, u06 u06Var, c16 c16Var, ok3 ok3Var, i06 i06Var, zn2 zn2Var) {
        z06 z06Var;
        a26 a26Var;
        x16 x16Var;
        if (zn2Var instanceof z06) {
            z06Var = (z06) zn2Var;
            int i = z06Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                z06Var.label = i - Integer.MIN_VALUE;
            } else {
                z06Var = new z06(this, zn2Var);
            }
        } else {
            z06Var = new z06(this, zn2Var);
        }
        Object objC = z06Var.result;
        int i2 = z06Var.label;
        if (i2 == 0) {
            jzb.q(objC);
            z06Var.L$0 = null;
            z06Var.L$1 = null;
            z06Var.L$2 = null;
            z06Var.L$3 = null;
            z06Var.L$4 = ok3Var;
            z06Var.L$5 = i06Var;
            z06Var.label = 1;
            objC = this.a.c(context, u06Var, c16Var, z06Var);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                x16Var = ok3Var;
                a26Var = i06Var;
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a26 a26Var2 = (a26) z06Var.L$5;
            x16 x16Var2 = (x16) z06Var.L$4;
            jzb.q(objC);
            x16Var = x16Var2;
            a26Var = a26Var2;
        }
        x16Var = ok3Var;
        a26Var = i06Var;
        h16 h16Var = (h16) objC;
        k16.b(h16Var);
        if (h16Var.equals(e16.a) || (h16Var instanceof g16)) {
            x16Var.invoke();
            return h16Var;
        }
        if (h16Var instanceof f16) {
            a26Var.d(((f16) h16Var).a);
            return h16Var;
        }
        ap.c();
        return null;
    }
}

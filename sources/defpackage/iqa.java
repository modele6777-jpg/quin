package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iqa implements m06 {
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, zn2 zn2Var) {
        gqa gqaVar;
        if (zn2Var instanceof gqa) {
            gqaVar = (gqa) zn2Var;
            int i = gqaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gqaVar.label = i - Integer.MIN_VALUE;
            } else {
                gqaVar = new gqa(this, zn2Var);
            }
        } else {
            gqaVar = new gqa(this, zn2Var);
        }
        Object objC = gqaVar.result;
        int i2 = gqaVar.label;
        if (i2 == 0) {
            jzb.q(objC);
            if (!v4e.Q(str)) {
                hs3 hs3Var = xqa.F;
                gqaVar.L$0 = str;
                gqaVar.label = 1;
                objC = bsa.c(hs3Var, gqaVar);
                bw2 bw2Var = bw2.a;
                if (objC == bw2Var) {
                    return bw2Var;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = (String) gqaVar.L$0;
        jzb.q(objC);
        boolean z = ((Set) objC).contains(str);
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, zn2 zn2Var) {
        hqa hqaVar;
        if (zn2Var instanceof hqa) {
            hqaVar = (hqa) zn2Var;
            int i = hqaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hqaVar.label = i - Integer.MIN_VALUE;
            } else {
                hqaVar = new hqa(this, zn2Var);
            }
        } else {
            hqaVar = new hqa(this, zn2Var);
        }
        Object obj = hqaVar.result;
        int i2 = hqaVar.label;
        wef wefVar = wef.a;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wefVar;
        }
        jzb.q(obj);
        if (!v4e.Q(str)) {
            hs3 hs3Var = xqa.F;
            hqaVar.L$0 = null;
            hqaVar.label = 1;
            Object objB = bsa.b(hs3Var, str, hqaVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }
}

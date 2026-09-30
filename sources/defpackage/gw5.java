package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gw5 {
    public final gl a;

    public gw5(gl glVar) {
        this.a = glVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, a26 a26Var, zn2 zn2Var) {
        fw5 fw5Var;
        if (zn2Var instanceof fw5) {
            fw5Var = (fw5) zn2Var;
            int i = fw5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fw5Var.label = i - Integer.MIN_VALUE;
            } else {
                fw5Var = new fw5(this, zn2Var);
            }
        } else {
            fw5Var = new fw5(this, zn2Var);
        }
        Object obj = fw5Var.result;
        int i2 = fw5Var.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                fw5Var.L$0 = str;
                fw5Var.L$1 = null;
                fw5Var.label = 1;
                Object objD = a26Var.d(fw5Var);
                bw2 bw2Var = bw2.a;
                str = bw2Var;
                if (objD == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = (String) fw5Var.L$0;
                jzb.q(obj);
                str = str2;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            hf8.Q.getClass();
            ef8.a("FourSeasonsReminderPreferences").c("Failed to " + str, e2);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

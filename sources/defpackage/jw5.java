package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jw5 {
    public static final jw5 a = new jw5();
    public static final gw5 b = new gw5(new gl(2, ypa.a, ypa.class, "edit", "edit(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 16));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) {
        hw5 hw5Var;
        if (zn2Var instanceof hw5) {
            hw5Var = (hw5) zn2Var;
            int i = hw5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hw5Var.label = i - Integer.MIN_VALUE;
            } else {
                hw5Var = new hw5(this, zn2Var);
            }
        } else {
            hw5Var = new hw5(this, zn2Var);
        }
        Object obj = hw5Var.result;
        int i2 = hw5Var.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                ypa ypaVar = ypa.a;
                iw5 iw5Var = new iw5(2, null);
                hw5Var.label = 1;
                Object objA = ypaVar.a(iw5Var, hw5Var);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            tec.t(hf8.Q, "FourSeasonsReminderPreferences", "Failed to clear reminder owner and state", e2);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

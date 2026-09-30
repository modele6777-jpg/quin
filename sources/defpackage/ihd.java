package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ihd {
    public static final ihd a = new ihd();
    public static final AtomicBoolean b;
    public static final chd c;

    static {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        b = atomicBoolean;
        c = new chd(new ohd(), new v5c(2, x1f.a, x1f.class, "handoffSignUp", "handoffSignUp$Quin_core_common_release(Lnet/xmind/donut/common/track/PendingSignUp;Lnet/xmind/donut/common/track/SignUpDestination;)Lnet/xmind/donut/common/track/SignUpHandoffResult;", 0, 5), new yv9(0, atomicBoolean, AtomicBoolean.class, "get", "get()Z", 0, 16));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(a26 a26Var, zn2 zn2Var) {
        hhd hhdVar;
        if (zn2Var instanceof hhd) {
            hhdVar = (hhd) zn2Var;
            int i = hhdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hhdVar.label = i - Integer.MIN_VALUE;
            } else {
                hhdVar = new hhd(this, zn2Var);
            }
        } else {
            hhdVar = new hhd(this, zn2Var);
        }
        Object obj = hhdVar.result;
        int i2 = hhdVar.label;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                hhdVar.L$0 = null;
                hhdVar.label = 1;
                Object objD = a26Var.d(hhdVar);
                Object obj2 = bw2.a;
                if (objD == obj2) {
                    return obj2;
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
            tec.t(hf8.Q, "SignUpAnalytics", "Failed to hand off pending registration", e2);
        }
        return wef.a;
    }
}

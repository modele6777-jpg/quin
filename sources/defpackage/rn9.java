package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rn9 extends ewf {
    public final t7 b;
    public final fab c;
    public final m7 d;
    public final o9 e;
    public final gpf f;

    public rn9(t7 t7Var, fab fabVar, m7 m7Var, o9 o9Var, gpf gpfVar) {
        this.b = t7Var;
        this.c = fabVar;
        this.d = m7Var;
        this.e = o9Var;
        this.f = gpfVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a6 A[Catch: Exception -> 0x00bc, CancellationException -> 0x00bf, PHI: r11
  0x00a6: PHI (r11v1 boolean) = (r11v0 boolean), (r11v0 boolean), (r11v2 boolean) binds: [B:41:0x0090, B:43:0x00a3, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00bf, Exception -> 0x00bc, blocks: (B:14:0x0030, B:19:0x0040, B:45:0x00a6, B:22:0x0048, B:38:0x0089, B:25:0x004f, B:27:0x0057, B:29:0x005a, B:31:0x0060, B:35:0x0077, B:33:0x0071, B:40:0x008c, B:42:0x0092), top: B:53:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(boolean z, zn2 zn2Var) throws Throwable {
        qn9 qn9Var;
        Object objF;
        if (zn2Var instanceof qn9) {
            qn9Var = (qn9) zn2Var;
            int i = qn9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qn9Var.label = i - Integer.MIN_VALUE;
            } else {
                qn9Var = new qn9(this, zn2Var);
            }
        } else {
            qn9Var = new qn9(this, zn2Var);
        }
        Object obj = qn9Var.result;
        int i2 = qn9Var.label;
        t7 t7Var = this.b;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                f8a f8aVar = f8a.a;
                PendingUserProfile pendingUserProfileC = f8a.c();
                if (pendingUserProfileC == null) {
                    return Boolean.TRUE;
                }
                if ((pendingUserProfileC.getAccountId() != null && !pa7.t(pendingUserProfileC.getAccountId(), ((mo3) t7Var).a())) || !g(z)) {
                    qn9Var.L$0 = null;
                    qn9Var.Z$0 = z;
                    qn9Var.label = 1;
                    if (f8aVar.b(pendingUserProfileC, new w7a(1, null), qn9Var) == bw2Var) {
                    }
                    return Boolean.TRUE;
                }
                if (pendingUserProfileC.getAccountId() == null) {
                    String strA = ((mo3) t7Var).a();
                    qn9Var.L$0 = null;
                    qn9Var.Z$0 = z;
                    qn9Var.label = 2;
                    if (f8a.a(strA, qn9Var) != bw2Var) {
                        o9 o9Var = this.e;
                        String strA2 = ((mo3) t7Var).a();
                        qn9Var.L$0 = null;
                        qn9Var.Z$0 = z;
                        qn9Var.label = 3;
                        objF = o9Var.f(strA2, qn9Var);
                        if (objF != bw2Var) {
                            return objF;
                        }
                    }
                } else {
                    o9 o9Var2 = this.e;
                    String strA3 = ((mo3) t7Var).a();
                    qn9Var.L$0 = null;
                    qn9Var.Z$0 = z;
                    qn9Var.label = 3;
                    objF = o9Var2.f(strA3, qn9Var);
                    if (objF != bw2Var) {
                        return objF;
                    }
                }
            } else {
                if (i2 == 1) {
                    jzb.q(obj);
                    return Boolean.TRUE;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jzb.q(obj);
                    return obj;
                }
                z = qn9Var.Z$0;
                jzb.q(obj);
                o9 o9Var3 = this.e;
                String strA4 = ((mo3) t7Var).a();
                qn9Var.L$0 = null;
                qn9Var.Z$0 = z;
                qn9Var.label = 3;
                objF = o9Var3.f(strA4, qn9Var);
                if (objF != bw2Var) {
                    return objF;
                }
            }
            return bw2Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public final boolean g(boolean z) {
        PendingUserProfile pendingUserProfileC;
        String accountId;
        return z || !((pendingUserProfileC = f8a.c()) == null || (accountId = pendingUserProfileC.getAccountId()) == null || !accountId.equals(((mo3) this.b).a()));
    }
}

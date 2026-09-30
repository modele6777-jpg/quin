package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gq3 implements uc4, hf8 {
    public static final /* synthetic */ int e = 0;
    public final nb4 a;
    public final r41 b = urg.a(Integer.MAX_VALUE, null, null, 6);
    public final LinkedHashSet c = new LinkedHashSet();
    public final bq3 d = new bq3(0.75f, 64, true);

    public gq3(nb4 nb4Var, s7 s7Var, aw2 aw2Var) {
        this.a = nb4Var;
        ynb.V(aw2Var, null, null, new fq3(this, null), 3).E(new ot1(14, this));
    }

    public static String b(aq3 aq3Var) {
        if (aq3Var instanceof yp3) {
            return ub3.i("divination snapshot ", ((yp3) aq3Var).a.a);
        }
        if (aq3Var instanceof zp3) {
            return "terminal snapshot ".concat(((zp3) aq3Var).a);
        }
        if (aq3Var instanceof xp3) {
            return ub3.i("feedback state ", ((xp3) aq3Var).b);
        }
        ap.c();
        return null;
    }

    public final void a(aq3 aq3Var) {
        Object objD = this.b.d(aq3Var);
        if (objD instanceof qw1) {
            Throwable thA = rw1.a(objD);
            if (thA == null) {
                thA = new IllegalStateException("Divination writer is not accepting commands");
            }
            ya2 ya2VarA = aq3Var.a();
            if (ya2VarA != null) {
                ((za2) ya2VarA).i0(thA);
            }
            if (aq3Var.a() == null) {
                d().c("Failed to enqueue ".concat(b(aq3Var)), thA);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, zn2 zn2Var) {
        cq3 cq3Var;
        if (zn2Var instanceof cq3) {
            cq3Var = (cq3) zn2Var;
            int i = cq3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cq3Var.label = i - Integer.MIN_VALUE;
            } else {
                cq3Var = new cq3(this, zn2Var);
            }
        } else {
            cq3Var = new cq3(this, zn2Var);
        }
        Object objA = cq3Var.result;
        int i2 = cq3Var.label;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                nb4 nb4Var = this.a;
                cq3Var.L$0 = str;
                cq3Var.label = 1;
                objA = nb4.a(nb4Var, str, cq3Var);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) cq3Var.L$0;
                jzb.q(objA);
            }
            return (List) objA;
        } catch (CancellationException e2) {
            throw e2;
        } catch (IllegalStateException e3) {
            String message = e3.getMessage();
            if (message == null || !v4e.F(message, "CursorWindow", false)) {
                throw e3;
            }
            d().h("loadAiRecommendedSpreadsById hit CursorWindow for " + str + "; falling back to legacy spread UI", e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, zn2 zn2Var) {
        dq3 dq3Var;
        if (zn2Var instanceof dq3) {
            dq3Var = (dq3) zn2Var;
            int i = dq3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dq3Var.label = i - Integer.MIN_VALUE;
            } else {
                dq3Var = new dq3(this, zn2Var);
            }
        } else {
            dq3Var = new dq3(this, zn2Var);
        }
        Object objK = dq3Var.result;
        int i2 = dq3Var.label;
        try {
            if (i2 == 0) {
                jzb.q(objK);
                nb4 nb4Var = this.a;
                dq3Var.L$0 = str;
                dq3Var.label = 1;
                vb4 vb4Var = (vb4) nb4Var;
                objK = urg.K(dq3Var, new ob4(str, vb4Var, 2), vb4Var.a, true, false);
                bw2 bw2Var = bw2.a;
                if (objK == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) dq3Var.L$0;
                jzb.q(objK);
            }
            return (yc4) objK;
        } catch (CancellationException e2) {
            throw e2;
        } catch (IllegalStateException e3) {
            String message = e3.getMessage();
            if (message == null || !v4e.F(message, "CursorWindow", false)) {
                throw e3;
            }
            d().h("findSnapshotById hit CursorWindow for " + str + " (oversized content row); treating as absent", e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r4 == r9) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.yc4 r27, java.lang.String r28, defpackage.zn2 r29) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq3.f(yc4, java.lang.String, zn2):java.lang.Object");
    }

    public final void g(yc4 yc4Var) {
        String strA = yc4Var.r;
        if (v4e.Q(strA)) {
            strA = null;
        }
        if (strA == null) {
            strA = s7.a();
        }
        a(new yp3(yc4Var, strA, null));
    }

    public final Object h(yc4 yc4Var, xn2 xn2Var) throws Throwable {
        za2 za2Var = new za2();
        String strA = yc4Var.r;
        if (v4e.Q(strA)) {
            strA = null;
        }
        if (strA == null) {
            strA = s7.a();
        }
        a(new yp3(yc4Var, strA, za2Var));
        Object objS = za2Var.s(xn2Var);
        return objS == bw2.a ? objS : wef.a;
    }

    public final void i(String str, boolean z) {
        str.getClass();
        a(new xp3(z, str));
    }
}

package defpackage;

import java.io.IOException;
import java.io.Serializable;
import tech.chatmind.api.account.model.CsrfResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cb implements ht6, hf8 {
    public static final /* synthetic */ int b = 0;
    public final d56 a;

    public cb() {
        oq8 oq8Var = rzb.a;
        this.a = (d56) rzb.b().b(d56.class);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) {
        la laVar;
        if (zn2Var instanceof la) {
            laVar = (la) zn2Var;
            int i = laVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                laVar.label = i - Integer.MIN_VALUE;
            } else {
                laVar = new la(this, zn2Var);
            }
        } else {
            laVar = new la(this, zn2Var);
        }
        Object obj = laVar.result;
        int i2 = laVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            laVar.label = 1;
            js3 js3Var = ga4.a;
            Object objP0 = ynb.p0(hr3.c, new oa(this, null), laVar);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(zn2 zn2Var) {
        ma maVar;
        if (zn2Var instanceof ma) {
            maVar = (ma) zn2Var;
            int i = maVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                maVar.label = i - Integer.MIN_VALUE;
            } else {
                maVar = new ma(this, zn2Var);
            }
        } else {
            maVar = new ma(this, zn2Var);
        }
        Object objQ = maVar.result;
        int i2 = maVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objQ);
                d56 d56Var = this.a;
                maVar.label = 1;
                objQ = d56Var.q(maVar);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objQ);
            }
            return ((CsrfResponse) objQ).getCsrfToken();
        } catch (Throwable th) {
            return new dzb(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
    
        if (r10 == r6) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r8, defpackage.a26 r9, defpackage.zn2 r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb.c(boolean, a26, zn2):java.lang.Object");
    }

    public final xgd e(Throwable th, boolean z) {
        Throwable thB = nzc.b(th);
        if (z && (thB instanceof jzc) && ((jzc) thB).getErrorCode() == 10017) {
            d().e("sign rejected because the verification code is invalid");
            return sgd.a;
        }
        for (Throwable cause = thB; cause != null; cause = cause.getCause()) {
            if ((cause instanceof IOException) || cause.getClass().getName().equals("android.system.GaiException")) {
                d().c("sign network error", thB);
                return ugd.a;
            }
        }
        d().c("sign server error", thB);
        return vgd.a;
    }
}

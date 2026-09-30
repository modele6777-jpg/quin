package defpackage;

import java.util.concurrent.CancellationException;
import tech.chatmind.api.UserInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eb implements hf8 {
    public final t7 a;
    public final ht6 b;
    public final fab c;

    public eb(t7 t7Var, ht6 ht6Var, fab fabVar) {
        this.a = t7Var;
        this.b = ht6Var;
        this.c = fabVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) throws Throwable {
        db dbVar;
        if (zn2Var instanceof db) {
            dbVar = (db) zn2Var;
            int i = dbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dbVar.label = i - Integer.MIN_VALUE;
            } else {
                dbVar = new db(this, zn2Var);
            }
        } else {
            dbVar = new db(this, zn2Var);
        }
        Object objE = dbVar.result;
        int i2 = dbVar.label;
        boolean z = false;
        try {
            if (i2 == 0) {
                jzb.q(objE);
                if (!((mo3) this.a).b()) {
                    return Boolean.FALSE;
                }
                ht6 ht6Var = this.b;
                dbVar.label = 1;
                objE = ((cb) ht6Var).a.e(dbVar);
                bw2 bw2Var = bw2.a;
                if (objE == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objE);
            }
            if (((UserInfo) objE).getUser() == null) {
                z = true;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ynb.h0(e2);
            if (!tgc.j(e2, false)) {
                d().c("Failed to validate account session", e2);
            }
        }
        if (z) {
            ((rab) this.c).g(true);
            d().e("Account session expired");
        }
        return Boolean.valueOf(z);
    }
}

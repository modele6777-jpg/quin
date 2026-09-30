package defpackage;

import java.io.Serializable;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.payment.SubscriptionStatusResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c2g implements x1g, hf8 {
    public final w1g a;

    public c2g(w1g w1gVar) {
        this.a = w1gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, zn2 zn2Var) throws Throwable {
        y1g y1gVar;
        Serializable dzbVar;
        if (zn2Var instanceof y1g) {
            y1gVar = (y1g) zn2Var;
            int i = y1gVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                y1gVar.label = i - Integer.MIN_VALUE;
            } else {
                y1gVar = new y1g(this, zn2Var);
            }
        } else {
            y1gVar = new y1g(this, zn2Var);
        }
        Object objP0 = y1gVar.result;
        int i2 = y1gVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objP0);
                js3 js3Var = ga4.a;
                hr3 hr3Var = hr3.c;
                z1g z1gVar = new z1g(this, str, null);
                y1gVar.L$0 = null;
                y1gVar.L$1 = null;
                y1gVar.label = 1;
                objP0 = ynb.p0(hr3Var, z1gVar, y1gVar);
                bw2 bw2Var = bw2.a;
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objP0);
            }
            dzbVar = (Boolean) objP0;
            dzbVar.getClass();
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            d().c("Failed to cancel contract", thA);
        }
        return dzbVar instanceof dzb ? Boolean.FALSE : dzbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zn2 zn2Var) {
        a2g a2gVar;
        Object dzbVar;
        if (zn2Var instanceof a2g) {
            a2gVar = (a2g) zn2Var;
            int i = a2gVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                a2gVar.label = i - Integer.MIN_VALUE;
            } else {
                a2gVar = new a2g(this, zn2Var);
            }
        } else {
            a2gVar = new a2g(this, zn2Var);
        }
        Object objP0 = a2gVar.result;
        int i2 = a2gVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objP0);
                js3 js3Var = ga4.a;
                hr3 hr3Var = hr3.c;
                b2g b2gVar = new b2g(this, null);
                a2gVar.L$0 = null;
                a2gVar.label = 1;
                objP0 = ynb.p0(hr3Var, b2gVar, a2gVar);
                bw2 bw2Var = bw2.a;
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objP0);
            }
            dzbVar = (SubscriptionStatusResponse) objP0;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            d().c("Failed to get subscription status", thA);
        }
        if (dzbVar instanceof dzb) {
            return null;
        }
        return dzbVar;
    }
}

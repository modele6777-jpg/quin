package defpackage;

import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.payment.ContractInfo;
import tech.chatmind.api.payment.SubscriptionStatusResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sn0 extends yu0 {
    public static final /* synthetic */ int Y0 = 0;
    public final fab P0;
    public final x1g Q0;
    public final p5a R0;
    public final s0e S0;
    public final s0e T0;
    public final s0e U0;
    public final s0e V0;
    public final whb W0;
    public List X0;

    public sn0(q9b q9bVar, fab fabVar, x1g x1gVar, p5a p5aVar, t7 t7Var) {
        super(t7Var, hwa.a);
        this.P0 = fabVar;
        this.Q0 = x1gVar;
        this.R0 = p5aVar;
        s0e s0eVarA = t0e.a(0L);
        this.S0 = s0eVarA;
        ynb.V(hwf.a(this), null, null, new gn0(this, null), 3);
        int i = 0;
        mw1 mw1VarA = am5.a(dj6.I(jzb.p(new fn0(q9bVar, i))), new on0(this, null));
        int i2 = 1;
        String str = null;
        int i3 = 255;
        boolean z = false;
        whb whbVarF = if9.F(new tm5(new wj5[]{jzb.p(new fn0(q9bVar, i2)), s0eVarA, mw1VarA}, new in0(this, null), i), hwf.a(this), new xzd(5000L, Long.MAX_VALUE), new en0(null, null, z, str, i3));
        Boolean bool = Boolean.FALSE;
        s0e s0eVarA2 = t0e.a(bool);
        this.T0 = s0eVarA2;
        s0e s0eVarA3 = t0e.a(bool);
        this.U0 = s0eVarA3;
        s0e s0eVarA4 = t0e.a(null);
        this.V0 = s0eVarA4;
        this.W0 = if9.F(new tm5(new wj5[]{whbVarF, s0eVarA2, s0eVarA3, s0eVarA4}, new rn0(5, null), i2), hwf.a(this), new xzd(5000L, Long.MAX_VALUE), new en0(null, null, z, str, i3));
        this.X0 = pu4.a;
    }

    @Override // defpackage.g4
    public final void D(ArrayList arrayList) {
        this.X0 = arrayList;
    }

    @Override // defpackage.g4
    public final void E(String str) {
        str.getClass();
        x1f x1fVar = x1f.a;
        x1f.k(new r05("subscribe_succeeded"), new ia(str, 3), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(zn2 zn2Var) {
        jn0 jn0Var;
        ContractInfo contract;
        String contractId;
        if (zn2Var instanceof jn0) {
            jn0Var = (jn0) zn2Var;
            int i = jn0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jn0Var.label = i - Integer.MIN_VALUE;
            } else {
                jn0Var = new jn0(this, zn2Var);
            }
        } else {
            jn0Var = new jn0(this, zn2Var);
        }
        Object objR = jn0Var.result;
        int i2 = jn0Var.label;
        if (i2 == 0) {
            jzb.q(objR);
            SubscriptionStatusResponse subscriptionStatusResponse = (SubscriptionStatusResponse) this.V0.getValue();
            if (subscriptionStatusResponse == null || (contract = subscriptionStatusResponse.getContract()) == null || (contractId = contract.getContractId()) == null) {
                return Boolean.FALSE;
            }
            a26 kn0Var = new kn0(this, contractId, null);
            jn0Var.L$0 = null;
            jn0Var.label = 1;
            objR = R(kn0Var, jn0Var);
            Object obj = bw2.a;
            if (objR == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objR);
        }
        Boolean bool = (Boolean) objR;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a7 A[Catch: all -> 0x0047, Exception -> 0x004a, Merged into TryCatch #2 {all -> 0x0047, Exception -> 0x004a, blocks: (B:42:0x00a1, B:44:0x00a7, B:41:0x009b, B:20:0x0043, B:46:0x00ba, B:30:0x0065), top: B:51:0x0023 }, TRY_LEAVE] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(a26 a26Var, zn2 zn2Var) {
        ln0 ln0Var;
        Throwable th;
        Object obj;
        Object dzbVar;
        Throwable thA;
        if (zn2Var instanceof ln0) {
            ln0Var = (ln0) zn2Var;
            int i = ln0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ln0Var.label = i - Integer.MIN_VALUE;
            } else {
                ln0Var = new ln0(this, zn2Var);
            }
        } else {
            ln0Var = new ln0(this, zn2Var);
        }
        Object objP0 = ln0Var.result;
        int i2 = ln0Var.label;
        s0e s0eVar = this.T0;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i2 == 0) {
                    jzb.q(objP0);
                    if (((Boolean) s0eVar.getValue()).booleanValue()) {
                        return null;
                    }
                    Boolean bool = Boolean.TRUE;
                    s0eVar.getClass();
                    s0eVar.n(null, bool);
                    js3 js3Var = ga4.a;
                    hr3 hr3Var = hr3.c;
                    nn0 nn0Var = new nn0(null, a26Var);
                    ln0Var.L$0 = null;
                    ln0Var.label = 1;
                    objP0 = ynb.p0(hr3Var, nn0Var, ln0Var);
                    if (objP0 != bw2Var) {
                    }
                    return bw2Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = ln0Var.L$1;
                    try {
                        jzb.q(objP0);
                        dzbVar = (QuotaUsage) objP0;
                    } catch (Throwable th2) {
                        th = th2;
                        dzbVar = new dzb(th);
                    }
                    thA = ezb.a(dzbVar);
                    if (thA != null) {
                        d().h("Failed to refresh quota after action", thA);
                    }
                    Boolean bool2 = Boolean.FALSE;
                    s0eVar.getClass();
                    s0eVar.n(null, bool2);
                    return obj;
                }
                jzb.q(objP0);
                js3 js3Var2 = ga4.a;
                hr3 hr3Var2 = hr3.c;
                mn0 mn0Var = new mn0(this, null);
                ln0Var.L$0 = null;
                ln0Var.L$1 = objP0;
                ln0Var.L$2 = null;
                ln0Var.label = 2;
                Object objP1 = ynb.p0(hr3Var2, mn0Var, ln0Var);
                if (objP1 != bw2Var) {
                    Object obj2 = objP0;
                    objP0 = objP1;
                    obj = obj2;
                    dzbVar = (QuotaUsage) objP0;
                    thA = ezb.a(dzbVar);
                    if (thA != null) {
                        d().h("Failed to refresh quota after action", thA);
                    }
                    Boolean bool3 = Boolean.FALSE;
                    s0eVar.getClass();
                    s0eVar.n(null, bool3);
                    return obj;
                }
                return bw2Var;
            } catch (Throwable th3) {
                Object obj3 = objP0;
                th = th3;
                obj = obj3;
                dzbVar = new dzb(th);
            }
        } catch (Exception e) {
            ynb.h0(e);
            d().c("Action failed", e);
            return null;
        } finally {
            Boolean bool4 = Boolean.FALSE;
            s0eVar.getClass();
            s0eVar.n(null, bool4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S(zn2 zn2Var) {
        pn0 pn0Var;
        if (zn2Var instanceof pn0) {
            pn0Var = (pn0) zn2Var;
            int i = pn0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pn0Var.label = i - Integer.MIN_VALUE;
            } else {
                pn0Var = new pn0(this, zn2Var);
            }
        } else {
            pn0Var = new pn0(this, zn2Var);
        }
        Object objP0 = pn0Var.result;
        int i2 = pn0Var.label;
        wef wefVar = wef.a;
        s0e s0eVar = this.U0;
        try {
            if (i2 == 0) {
                jzb.q(objP0);
                if (((Boolean) s0eVar.getValue()).booleanValue()) {
                    return wefVar;
                }
                Boolean bool = Boolean.TRUE;
                s0eVar.getClass();
                s0eVar.n(null, bool);
                js3 js3Var = ga4.a;
                hr3 hr3Var = hr3.c;
                qn0 qn0Var = new qn0(this, null);
                pn0Var.label = 1;
                objP0 = ynb.p0(hr3Var, qn0Var, pn0Var);
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
            this.V0.m((SubscriptionStatusResponse) objP0);
        } catch (Exception e) {
            ynb.h0(e);
            d().c("Failed to refresh subscription status", e);
        } finally {
            Boolean bool2 = Boolean.FALSE;
            s0eVar.getClass();
            s0eVar.n(null, bool2);
        }
        return wefVar;
    }

    @Override // defpackage.yu0, defpackage.g4
    public final Object i(zn2 zn2Var) {
        return ((rab) this.P0).b(zn2Var);
    }

    @Override // defpackage.g4
    public final void z() {
    }
}

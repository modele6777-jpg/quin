package defpackage;

import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.UsageBilling;
import tech.chatmind.api.credits.UsageBillingDailyLimit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j4a implements hf8 {
    public static final /* synthetic */ int d = 0;
    public final q9b a;
    public final fab b;
    public final lm4 c;

    public j4a(q9b q9bVar, fab fabVar, lm4 lm4Var) {
        this.a = q9bVar;
        this.b = fabVar;
        this.c = lm4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, zn2 zn2Var) {
        d4a d4aVar;
        if (zn2Var instanceof d4a) {
            d4aVar = (d4a) zn2Var;
            int i2 = d4aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d4aVar.label = i2 - Integer.MIN_VALUE;
            } else {
                d4aVar = new d4a(this, zn2Var);
            }
        } else {
            d4aVar = new d4a(this, zn2Var);
        }
        Object objE = d4aVar.result;
        int i3 = d4aVar.label;
        if (i3 == 0) {
            jzb.q(objE);
            d4aVar.I$0 = i;
            d4aVar.label = 1;
            objE = e(d4aVar);
            Object obj = bw2.a;
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = d4aVar.I$0;
            jzb.q(objE);
        }
        QuotaUsage quotaUsage = (QuotaUsage) objE;
        return quotaUsage == null ? n9b.a : lm4.b(quotaUsage, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zn2 zn2Var) {
        e4a e4aVar;
        if (zn2Var instanceof e4a) {
            e4aVar = (e4a) zn2Var;
            int i = e4aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4aVar.label = i - Integer.MIN_VALUE;
            } else {
                e4aVar = new e4a(this, zn2Var);
            }
        } else {
            e4aVar = new e4a(this, zn2Var);
        }
        Object objE = e4aVar.result;
        int i2 = e4aVar.label;
        if (i2 == 0) {
            jzb.q(objE);
            e4aVar.label = 1;
            objE = e(e4aVar);
            Object obj = bw2.a;
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objE);
        }
        QuotaUsage quotaUsage = (QuotaUsage) objE;
        return quotaUsage == null ? n9b.a : lm4.a(quotaUsage);
    }

    public final String c() {
        UsageBilling usageBilling;
        UsageBillingDailyLimit dailyLimit;
        QuotaUsage quotaUsageB = ((eab) this.a).b();
        if (quotaUsageB == null || (usageBilling = quotaUsageB.getUsageBilling()) == null || (dailyLimit = usageBilling.getDailyLimit()) == null) {
            return null;
        }
        return dailyLimit.getResetAt();
    }

    public final Object e(zn2 zn2Var) {
        lmb lmbVar = new lmb();
        lmbVar.element = 5000L;
        QuotaUsage quotaUsageB = ((eab) this.a).b();
        if (quotaUsageB != null) {
            return quotaUsageB;
        }
        ybc ybcVar = new ybc(new f4a(this, null));
        qfc qfcVar = ar4.b;
        return tm7.D(new al5(oa7.b0(new kl5(new sc3(1, new pk5(y41.T(10, gr4.SECONDS), ybcVar, null)), new g4a(this, null), 1), 3L, new h4a(lmbVar, 3, null)), new i4a(this, null)), zn2Var);
    }
}

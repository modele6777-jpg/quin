package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u1d implements d3b {
    public final gd8 a;
    public final List b = t72.H(new ParamSpec(UsageBillingBalance.STATUS_ACTIVE, ParamType.BOOLEAN, false, (nh7) null, 8, (rp3) null));

    public u1d(gd8 gd8Var) {
        this.a = gd8Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        boolean zBooleanValue;
        va8 va8VarE;
        Object dzbVar;
        nh7 nh7Var = (nh7) ti7Var.get(UsageBillingBalance.STATUS_ACTIVE);
        if (nh7Var != null) {
            try {
                dzbVar = Boolean.valueOf(v4e.n0(oh7.i(nh7Var).c()));
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            Boolean bool = (Boolean) dzbVar;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = true;
            }
        } else {
            zBooleanValue = true;
        }
        if (zBooleanValue) {
            w57 w57VarA = z57.a.a();
            th5 th5Var = cye.b;
            va8VarE = gcc.E(w57VarA, fbc.d());
        } else {
            va8VarE = null;
        }
        bm8.P(new t1d(this, va8VarE, null));
        return new QaResult.Ok(new ti7(ib8.q(UsageBillingBalance.STATUS_ACTIVE, oh7.a(Boolean.valueOf(zBooleanValue)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "data.set-discount-start";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "设置折扣活动开始时间（active=false 清除）";
    }
}

package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r2d implements d3b {
    public final List a = t72.H(new ParamSpec("enabled", ParamType.BOOLEAN, false, (nh7) null, 8, (rp3) null));

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        nh7 nh7Var = (nh7) ti7Var.get("enabled");
        Boolean boolValueOf = nh7Var != null ? Boolean.valueOf(oh7.e(oh7.i(nh7Var))) : null;
        if (boolValueOf == null) {
            hs3 hs3Var = xqa.P0;
            return new QaResult.Ok(new ti7(ib8.q("enabled", oh7.a((Boolean) z5c.I(nu4.a, new k2d(hs3Var.a, hs3Var.b, null))))));
        }
        isa isaVar = xqa.P0.a;
        qn2 qn2Var = lw2.a;
        ynb.V(qn2Var, null, null, new n2d(isaVar, boolValueOf, null), 3);
        ynb.V(qn2Var, null, null, new q2d(xqa.Q0.a, Boolean.TRUE, null), 3);
        return new QaResult.Ok(new ti7(ib8.q("enabled", oh7.a(boolValueOf))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "account.set-legacy-user";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "设置 legacy-user 标记（含 detected；不传 enabled=只读当前值）";
    }
}

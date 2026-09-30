package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n1d implements d3b {
    public final List a = t72.H(new ParamSpec("enabled", ParamType.BOOLEAN, false, (nh7) null, 8, (rp3) null));

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        nh7 nh7Var = (nh7) ti7Var.get("enabled");
        Boolean boolValueOf = nh7Var != null ? Boolean.valueOf(oh7.e(oh7.i(nh7Var))) : null;
        if (boolValueOf != null) {
            ynb.V(lw2.a, null, null, new a20(xqa.u.a, boolValueOf, null), 3);
            return new QaResult.Ok(new ti7(ib8.q("enabled", oh7.a(boolValueOf))));
        }
        hs3 hs3Var = xqa.u;
        Boolean bool = (Boolean) z5c.I(nu4.a, new x10(hs3Var.a, hs3Var.b, null));
        bool.getClass();
        return new QaResult.Ok(new ti7(ib8.q("enabled", oh7.a(bool))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "flag.set-annual-fortune";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "强制开启年运活动2026（不传 enabled=只读当前值）";
    }
}

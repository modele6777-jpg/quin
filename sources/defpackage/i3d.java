package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i3d implements d3b {
    public final List a = t72.H(new ParamSpec("enabled", ParamType.BOOLEAN, false, (nh7) null, 8, (rp3) null));

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        nh7 nh7Var = (nh7) ti7Var.get("enabled");
        Boolean boolB = nh7Var != null ? n4e.b(oh7.i(nh7Var).c()) : null;
        if (boolB == null) {
            hs3 hs3Var = xqa.r0;
            return new QaResult.Ok(new ti7(ib8.q("enabled", oh7.a((Boolean) z5c.I(nu4.a, new e3d(hs3Var.a, hs3Var.b, null))))));
        }
        ynb.V(lw2.a, null, null, new h3d(xqa.r0.a, boolB, null), 3);
        return new QaResult.Ok(new ti7(ib8.q("enabled", oh7.a(boolB))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "account.set-yearly-unlock-all-cards";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "年卡解锁全部塔罗牌开关（不传 enabled=只读当前值）";
    }
}

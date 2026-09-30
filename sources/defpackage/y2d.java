package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y2d implements d3b {
    public final List a = t72.I(new ParamSpec("group", ParamType.STRING, true, (nh7) null, 8, (rp3) null), new ParamSpec("usedOffer", ParamType.BOOLEAN, false, oh7.a(Boolean.FALSE)));

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String strC;
        nh7 nh7Var = (nh7) ti7Var.get("group");
        if (nh7Var == null || (strC = oh7.i(nh7Var).c()) == null) {
            return new QaResult.Err("missing 'group'", "invalid_params");
        }
        nh7 nh7Var2 = (nh7) ti7Var.get("usedOffer");
        boolean zE = nh7Var2 != null ? oh7.e(oh7.i(nh7Var2)) : false;
        isa isaVar = xqa.w0.a;
        qn2 qn2Var = lw2.a;
        ynb.V(qn2Var, null, null, new u2d(isaVar, strC, null), 3);
        ynb.V(qn2Var, null, null, new x2d(xqa.x0.a, Boolean.valueOf(zE), null), 3);
        return new QaResult.Ok(new ti7(bm8.H(new iy9("group", oh7.c(strC)), new iy9("usedOffer", oh7.a(Boolean.valueOf(zE))))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "paywall.set-ab-group";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "强制 Paywall AB 分组（空串=走真实接口）";
    }
}

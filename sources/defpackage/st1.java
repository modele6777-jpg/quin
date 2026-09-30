package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class st1 implements d3b {
    public final List a = t72.H(new ParamSpec("enabled", ParamType.BOOLEAN, false, (nh7) null, 8, (rp3) null));

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        nh7 nh7Var = (nh7) ti7Var.get("enabled");
        boolean zE = nh7Var != null ? oh7.e(oh7.i(nh7Var)) : true;
        kh3.b.setValue(Boolean.valueOf(zE));
        return new QaResult.Ok(new ti7(ib8.q("enabled", oh7.a(Boolean.valueOf(zE)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "debug.card-wheel-tap-overlay";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "牌轮触摸校准浮层开关（诊断点牌命中区）";
    }
}

package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d2d implements d3b {
    public final List a = t72.H(new ParamSpec("enabled", ParamType.BOOLEAN, false, (nh7) null, 8, (rp3) null));

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        return k74.a(ti7Var, new gpc(24), new fnc(29));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "home.set-event-banner-visible";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "覆盖首页运营飘条可见性";
    }
}

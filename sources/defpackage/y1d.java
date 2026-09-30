package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y1d implements d3b {
    public final List a = t72.H(new ParamSpec("value", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String strC;
        nh7 nh7Var = (nh7) ti7Var.get("value");
        if (nh7Var == null || (strC = oh7.i(nh7Var).c()) == null) {
            return new QaResult.Err("missing 'value'", "invalid_params");
        }
        ynb.V(lw2.a, null, null, new x1d(xqa.Y.a, strC, null), 3);
        return new QaResult.Ok(new ti7(ib8.q("value", oh7.c(strC))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.set-events-info";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "设置首页活动（传空串清除）";
    }
}

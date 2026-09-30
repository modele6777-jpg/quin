package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class id9 implements d3b {
    public final List a = t72.H(new ParamSpec("ms", ParamType.INT, true, (nh7) null, 8, (rp3) null));

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        nh7 nh7Var = (nh7) ti7Var.get("ms");
        if (nh7Var == null) {
            return new QaResult.Err("missing/invalid 'ms'", "invalid_params");
        }
        int iF = oh7.f(oh7.i(nh7Var));
        boolean z = jd9.a;
        jd9.b = iF;
        return new QaResult.Ok(new ti7(ib8.q("slow_ms", oh7.b(Integer.valueOf(iF)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "env.net-sim.slow";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "给每个请求加 N 毫秒延迟";
    }
}

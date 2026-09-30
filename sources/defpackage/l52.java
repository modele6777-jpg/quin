package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l52 implements d3b {
    public final u79 a;
    public final List b;

    public l52(u79 u79Var) {
        this.a = u79Var;
        ParamType paramType = ParamType.INT;
        this.b = t72.I(new ParamSpec("hours", paramType, true, (nh7) null, 8, (rp3) null), new ParamSpec("minutes", paramType, false, oh7.b(0)));
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        nh7 nh7Var = (nh7) ti7Var.get("hours");
        if (nh7Var == null) {
            return new QaResult.Err("missing/invalid 'hours'", "invalid_params");
        }
        int iF = oh7.f(oh7.i(nh7Var));
        nh7 nh7Var2 = (nh7) ti7Var.get("minutes");
        long jF = (((long) (nh7Var2 != null ? oh7.f(oh7.i(nh7Var2)) : 0)) * 60000) + (((long) iF) * 3600000);
        long jCurrentTimeMillis = System.currentTimeMillis() + jF;
        u79 u79Var = this.a;
        u79Var.d(jCurrentTimeMillis);
        iy9 iy9Var = new iy9("advanced_ms", oh7.b(Long.valueOf(jF)));
        Long l = (Long) u79Var.b.a.getValue();
        return new QaResult.Ok(new ti7(bm8.H(iy9Var, new iy9("offset_ms", oh7.b(Long.valueOf(l != null ? l.longValue() - System.currentTimeMillis() : 0L))))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "env.clock.advance";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "把 App 时钟快进 N 小时（不改系统时间）";
    }
}

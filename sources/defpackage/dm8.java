package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dm8 implements d3b {
    public final gd8 a;
    public final List b = t72.H(new ParamSpec("drawn", ParamType.BOOLEAN, false, (nh7) null, 8, (rp3) null));

    public dm8(gd8 gd8Var) {
        this.a = gd8Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        boolean zBooleanValue;
        ma8 ma8Var;
        Object dzbVar;
        nh7 nh7Var = (nh7) ti7Var.get("drawn");
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
            th5 th5Var = cye.b;
            ma8Var = gcc.E(z57.a.a(), fbc.d()).a();
        } else {
            ma8Var = new ma8(2023, 10, 1);
        }
        bm8.P(new cm8(this, ma8Var, null));
        return new QaResult.Ok(new ti7(bm8.H(new iy9("drawn", oh7.a(Boolean.valueOf(zBooleanValue))), new iy9("date", oh7.c(ma8Var.toString())))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "data.mark-today-free-draw";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "标记今日免费抽牌（drawn=false 写旧日期=清除）";
    }
}

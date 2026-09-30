package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import android.database.Cursor;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class be0 implements d3b {
    public final d6c a;
    public final List b = t72.I(new ParamSpec("sql", ParamType.STRING, true, (nh7) null, 8, (rp3) null), new ParamSpec("expected", ParamType.INT, true, (nh7) null, 8, (rp3) null));

    public be0(d6c d6cVar) {
        this.a = d6cVar;
    }

    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) throws IOException {
        String strC;
        nh7 nh7Var = (nh7) ti7Var.get("sql");
        if (nh7Var == null || (strC = oh7.i(nh7Var).c()) == null) {
            return new QaResult.Err("missing 'sql'", "invalid_params");
        }
        nh7 nh7Var2 = (nh7) ti7Var.get("expected");
        if (nh7Var2 == null) {
            return new QaResult.Err("missing/invalid 'expected'", "invalid_params");
        }
        int iF = oh7.f(oh7.i(nh7Var2));
        if (!ynb.T(strC)) {
            return new QaResult.Err("assert.count requires a read-only count query", "not_read_only");
        }
        Cursor cursorL0 = this.a.a().l0(strC);
        try {
            long j = cursorL0.moveToFirst() ? cursorL0.getLong(0) : 0L;
            cursorL0.close();
            return new QaResult.Ok(new ti7(bm8.H(new iy9("pass", oh7.a(Boolean.valueOf(j == ((long) iF)))), new iy9("actual", oh7.b(Long.valueOf(j))), new iy9("expected", oh7.b(Integer.valueOf(iF))))));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(cursorL0, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "assert.count";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "断言：count SQL 的结果等于期望值";
    }
}

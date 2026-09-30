package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import android.database.Cursor;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rb3 implements d3b {
    public final d6c a;
    public final List b = t72.H(new ParamSpec("sql", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    public rb3(d6c d6cVar) {
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
        if (!ynb.T(strC)) {
            return new QaResult.Err("data.query only allows SELECT/PRAGMA; use data.exec for mutations", "not_read_only");
        }
        Cursor cursorL0 = this.a.a().l0(strC);
        try {
            yg7 yg7VarY = kn2.Y(cursorL0);
            QaResult.Ok ok = new QaResult.Ok(new ti7(bm8.H(new iy9("rows", yg7VarY), new iy9("count", oh7.b(Integer.valueOf(yg7VarY.a.size()))))));
            cursorL0.close();
            return ok;
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
        return "data.query";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "执行只读 SQL 查询，返回行 JSON";
    }
}

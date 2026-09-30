package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.database.Cursor;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wb3 implements d3b {
    public final d6c a;

    public wb3(d6c d6cVar) {
        this.a = d6cVar;
    }

    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) throws IOException {
        Cursor cursorL0 = this.a.a().l0("PRAGMA user_version");
        try {
            long j = cursorL0.moveToFirst() ? cursorL0.getLong(0) : -1L;
            cursorL0.close();
            return new QaResult.Ok(new ti7(ib8.q("version", oh7.b(Long.valueOf(j)))));
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
        return "data.schema-version";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "读取 Room schema 版本（user_version）";
    }
}

package androidx.sqlite.driver;

import defpackage.cva;
import defpackage.e9e;
import defpackage.h9e;
import defpackage.ib8;
import defpackage.q8c;
import defpackage.qc0;
import defpackage.s8c;
import defpackage.v4e;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteDriver;", "Ls8c;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class SupportSQLiteDriver implements s8c {
    public final h9e a;

    public SupportSQLiteDriver(h9e h9eVar) {
        h9eVar.getClass();
        this.a = h9eVar;
    }

    @Override // defpackage.s8c
    public final q8c p(String str) {
        str.getClass();
        h9e h9eVar = this.a;
        String databaseName = h9eVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                qc0.o(ib8.j("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !v4e.g0('/', databaseName, databaseName).equals(v4e.g0('/', str, str))) {
            cva.o("This driver is configured to open a database named '", h9eVar.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new e9e(h9eVar.j0());
    }

    @Override // defpackage.s8c
    public final boolean y() {
        return true;
    }
}

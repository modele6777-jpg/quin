package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@ec9("dialog")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lq84;", "Lfc9;", "Lp84;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public final class q84 extends fc9 {
    @Override // defpackage.fc9
    public final ua9 a() {
        return new p84(this, new s84(false, false, 7), wd2.a);
    }

    @Override // defpackage.fc9
    public final void d(List list, pb9 pb9Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((da9) it.next());
        }
    }

    @Override // defpackage.fc9
    public final void e(da9 da9Var, boolean z) {
        b().e(da9Var, z);
        int iZ0 = s72.z0((Iterable) b().f.a.getValue(), da9Var);
        int i = 0;
        for (Object obj : (Iterable) b().f.a.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                t72.Z();
                throw null;
            }
            da9 da9Var2 = (da9) obj;
            if (i > iZ0) {
                b().c(da9Var2);
            }
            i = i2;
        }
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gg2 implements i2a {
    public final List a;

    public gg2(List list) {
        this.a = list;
    }

    @Override // defpackage.i2a
    public final e2a a(String str) {
        str.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            e2a e2aVarA = ((i2a) it.next()).a(str);
            if (e2aVarA != null) {
                return e2aVarA;
            }
        }
        return null;
    }
}

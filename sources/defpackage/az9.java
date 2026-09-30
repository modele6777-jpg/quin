package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class az9 extends n16 {
    public final /* synthetic */ int J;
    public final /* synthetic */ n16 K;

    public /* synthetic */ az9(n16 n16Var, int i) {
        this.J = i;
        this.K = n16Var;
    }

    @Override // defpackage.n16
    public final void t(htb htbVar, Object obj) {
        int i = this.J;
        n16 n16Var = this.K;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        n16Var.t(htbVar, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        n16Var.t(htbVar, Array.get(obj, i2));
                    }
                    break;
                }
                break;
        }
    }
}

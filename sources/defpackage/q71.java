package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q71 implements k71 {
    public final boolean a;
    public final String b;

    public q71(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.k71
    public final boolean a(fac facVar) {
        int i;
        boolean z = this.a;
        String strO = this.b;
        if (z && strO == null) {
            strO = facVar.o();
        }
        dac dacVar = facVar.b;
        if (dacVar != null) {
            Iterator it = dacVar.a().iterator();
            i = 0;
            while (it.hasNext()) {
                fac facVar2 = (fac) ((hac) it.next());
                if (strO == null || facVar2.o().equals(strO)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.a ? ib8.j("only-of-type <", this.b, ">") : "only-child";
    }
}

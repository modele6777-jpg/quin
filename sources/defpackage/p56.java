package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p56 extends l56 implements wt8 {
    public xc5 b = xc5.c;
    public boolean c;

    public final void j(q56 q56Var) {
        tpd tpdVar;
        if (!this.c) {
            this.b = this.b.clone();
            this.c = true;
        }
        xc5 xc5Var = this.b;
        xc5 xc5Var2 = q56Var.extensions;
        xc5Var.getClass();
        int i = 0;
        while (true) {
            int size = xc5Var2.a.b.size();
            tpdVar = xc5Var2.a;
            if (i >= size) {
                break;
            }
            xc5Var.g((Map.Entry) tpdVar.b.get(i));
            i++;
        }
        Iterator it = tpdVar.d().iterator();
        while (it.hasNext()) {
            xc5Var.g((Map.Entry) it.next());
        }
    }
}

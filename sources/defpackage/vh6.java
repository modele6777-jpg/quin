package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vh6 implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gi6 b;

    public /* synthetic */ vh6(xh6 xh6Var, gi6 gi6Var) {
        this.b = gi6Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        gi6 gi6Var = this.b;
        switch (i) {
            case 0:
                sh6 sh6Var = (sh6) obj;
                sh6Var.getClass();
                boolean z = true;
                if (gi6Var != null && sh6Var.c.j() >= 0.0f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ((Long) obj).getClass();
                Iterator it = gi6Var.Z.e.iterator();
                while (true) {
                    g1e g1eVar = (g1e) it;
                    if (!g1eVar.hasNext()) {
                        return wef.a;
                    }
                    qn4.G(((wh6) g1eVar.next()).a);
                }
                break;
        }
    }

    public /* synthetic */ vh6(gi6 gi6Var) {
        this.b = gi6Var;
    }
}

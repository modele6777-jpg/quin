package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d9g implements u48 {
    public final /* synthetic */ qn2 a;
    public final /* synthetic */ l2a b;
    public final /* synthetic */ xjb c;
    public final /* synthetic */ mmb d;

    public d9g(qn2 qn2Var, l2a l2aVar, xjb xjbVar, mmb mmbVar) {
        this.a = qn2Var;
        this.b = l2aVar;
        this.c = xjbVar;
        this.d = mmbVar;
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        boolean z;
        ol1 ol1VarC = null;
        switch (b9g.a[f48Var.ordinal()]) {
            case 1:
                ynb.V(this.a, null, dw2.d, new c9g(this.d, this.c, x48Var, this, null), 1);
                return;
            case 2:
                l2a l2aVar = this.b;
                if (l2aVar != null) {
                    zi0 zi0Var = l2aVar.b;
                    synchronized (zi0Var.b) {
                        try {
                            synchronized (zi0Var.b) {
                                z = zi0Var.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) zi0Var.c;
                                zi0Var.c = (ArrayList) zi0Var.d;
                                zi0Var.d = arrayList;
                                zi0Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((xn2) arrayList.get(i)).g(wef.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                xjb xjbVar = this.c;
                synchronized (xjbVar.c) {
                    if (xjbVar.t) {
                        xjbVar.t = false;
                        ol1VarC = xjbVar.C();
                    }
                    break;
                }
                if (ol1VarC != null) {
                    ((pl1) ol1VarC).g(wef.a);
                    return;
                }
                return;
            case 3:
                xjb xjbVar2 = this.c;
                synchronized (xjbVar2.c) {
                    xjbVar2.t = true;
                }
                return;
            case 4:
                this.c.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                ap.c();
                return;
        }
    }
}

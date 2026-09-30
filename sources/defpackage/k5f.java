package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k5f implements zl2, zt0 {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final f82 d;
    public final f82 e;
    public final f82 f;

    public k5f(eu0 eu0Var, q5d q5dVar) {
        this.a = q5dVar.e;
        this.c = q5dVar.a;
        f82 f82VarC0 = q5dVar.b.c0();
        this.d = f82VarC0;
        f82 f82VarC1 = q5dVar.c.c0();
        this.e = f82VarC1;
        f82 f82VarC2 = q5dVar.d.c0();
        this.f = f82VarC2;
        eu0Var.d(f82VarC0);
        eu0Var.d(f82VarC1);
        eu0Var.d(f82VarC2);
        f82VarC0.a(this);
        f82VarC1.a(this);
        f82VarC2.a(this);
    }

    @Override // defpackage.zt0
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((zt0) arrayList.get(i)).a();
            i++;
        }
    }

    public final void d(zt0 zt0Var) {
        this.b.add(zt0Var);
    }

    @Override // defpackage.zl2
    public final void b(List list, List list2) {
    }
}

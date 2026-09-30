package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zy5 extends j6 implements nt9 {
    public final /* synthetic */ cz5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy5(cz5 cz5Var) {
        super(5);
        this.c = cz5Var;
    }

    @Override // defpackage.nt9
    public final void b(Object obj) {
        Object obj2;
        bz5 bz5Var;
        bz5 bz5Var2 = bz5.d;
        ((za2) this.b).R(new tt9(obj));
        cz5 cz5Var = this.c;
        zh0 zh0Var = cz5Var.f;
        do {
            obj2 = zh0Var.a;
            bz5 bz5Var3 = (bz5) obj2;
            int iOrdinal = bz5Var3.ordinal();
            if (iOrdinal == 0) {
                bz5Var = bz5.b;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Unexpected frame state for " + cz5Var + "! State is " + bz5Var3 + ' ');
                }
                bz5Var = bz5Var2;
            }
        } while (!zh0Var.a(obj2, bz5Var));
        Iterator it = cz5Var.h.iterator();
        it.getClass();
        if (it.hasNext()) {
            throw kv2.g(it);
        }
        if (bz5Var == bz5Var2) {
            Iterator it2 = cz5Var.h.iterator();
            it2.getClass();
            if (it2.hasNext()) {
                throw kv2.g(it2);
            }
        }
    }

    @Override // defpackage.j6
    public final void t() {
    }
}

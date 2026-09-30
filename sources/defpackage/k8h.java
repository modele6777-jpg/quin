package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k8h implements u8e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k8h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.u8e
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object obj2 = f8h.j;
                return new xdh((ArrayList) obj);
            default:
                pdh pdhVar = (pdh) obj;
                i39 i39Var = (i39) pdhVar.c.get();
                i39Var.getClass();
                s9h s9hVar = (s9h) pdhVar.b.get();
                s9hVar.getClass();
                w6h w6hVar = s9hVar.a;
                j27 j27VarB = j27.b();
                j27VarB.c = new ysd(12, w6hVar);
                j27VarB.d = new za5[]{k99.l};
                j27VarB.a = false;
                e0 e0VarB = s9h.b(w6hVar.b(0, j27VarB.a()));
                f0 f0Var = new f0(e0VarB, o9h.class, nog.e);
                e0VarB.b(f0Var, bzd.G(i39Var, f0Var));
                bch bchVar = new bch(1, pdhVar);
                int i2 = i5.y;
                h5 h5Var = new h5(f0Var, bchVar);
                f0Var.b(h5Var, bzd.G(i39Var, h5Var));
                h5Var.b(new jfg(18, h5Var), i39Var);
                return h5Var;
        }
    }
}

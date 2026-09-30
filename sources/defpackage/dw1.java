package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class dw1 extends cw1 {
    public final /* synthetic */ int d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dw1(Object obj, pv2 pv2Var, int i, i41 i41Var, int i2) {
        super(pv2Var, i, i41Var);
        this.d = i2;
        this.e = obj;
    }

    @Override // defpackage.cw1
    public Object f(awa awaVar, xn2 xn2Var) {
        int i = this.d;
        wef wefVar = wef.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                Object objZ = ((l26) obj).z(awaVar, xn2Var);
                return objZ == bw2.a ? objZ : wefVar;
            default:
                byc bycVar = new byc(awaVar);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    ynb.V(awaVar, null, null, new nw1((wj5) it.next(), bycVar, null), 3);
                }
                return wefVar;
        }
    }

    @Override // defpackage.cw1
    public cw1 g(pv2 pv2Var, int i, i41 i41Var) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                return new dw1((l26) obj, pv2Var, i, i41Var, 0);
            default:
                return new dw1((Iterable) obj, pv2Var, i, i41Var, 1);
        }
    }

    @Override // defpackage.cw1
    public yv1 k(aw2 aw2Var) {
        switch (this.d) {
            case 1:
                l26 bw1Var = new bw1(this, null);
                zva zvaVar = new zva(y7h.B(aw2Var, this.a), urg.a(this.b, i41.a, null, 4));
                zvaVar.k0(dw2.a, zvaVar, bw1Var);
                return zvaVar;
            default:
                return super.k(aw2Var);
        }
    }

    @Override // defpackage.cw1
    public String toString() {
        switch (this.d) {
            case 0:
                return "block[" + ((l26) this.e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}

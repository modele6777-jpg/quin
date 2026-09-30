package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gf9 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ use b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ gf9(use useVar, x16 x16Var, x16 x16Var2) {
        this.b = useVar;
        this.c = x16Var;
        this.d = x16Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        use useVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                db6.l(useVar, this.c, this.d, (l46) obj, k99.P(1));
                break;
            default:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    b21.a(null, ynb.d0(0.0f, 0.0f, 0.0f, 12.0f, 7, mh3.L(mh3.N(b.c(g09.a, 1.0f)))), false, !v4e.Q(useVar.d().c), this.c, this.d, l46Var, 0, 11);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ gf9(use useVar, x16 x16Var, x16 x16Var2, int i) {
        this.b = useVar;
        this.c = x16Var;
        this.d = x16Var2;
    }
}

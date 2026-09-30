package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d61 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ m26 d;

    public /* synthetic */ d61(long j, Object obj, m26 m26Var, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
        this.d = m26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        m26 m26Var = this.d;
        Object obj3 = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    cgg.l(this.b, ((p9f) l46Var.k(r9f.a)).m, af1.b0(417635459, new fw0(i2, (xw9) obj3, (n26) m26Var), l46Var), l46Var, 384);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    iec.b(this.b, (mue) obj3, (l26) m26Var, l46Var2, 0);
                }
                break;
        }
        return wefVar;
    }
}

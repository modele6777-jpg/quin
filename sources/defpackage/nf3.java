package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nf3 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ nf3(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.b;
        switch (i) {
            case 0:
                c0f c0fVar = (c0f) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? l46Var.g(c0fVar) : l46Var.i(c0fVar) ? 4 : 2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var.Z();
                } else {
                    a0f.a(c0fVar, null, 0.0f, null, 0L, 0L, af1.b0(1905952188, new de3(str, 1), l46Var), l46Var, (iIntValue & 14) | 805306368);
                }
                break;
            default:
                c0f c0fVar2 = (c0f) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? l46Var2.g(c0fVar2) : l46Var2.i(c0fVar2) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else {
                    a0f.a(c0fVar2, null, 0.0f, null, 0L, 0L, af1.b0(-999924215, new de3(str, 2), l46Var2), l46Var2, (iIntValue2 & 14) | 805306368);
                }
                break;
        }
        return wefVar;
    }
}

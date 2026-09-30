package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dt9 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ t69 c;
    public final /* synthetic */ wne d;
    public final /* synthetic */ x4d e;

    public /* synthetic */ dt9(boolean z, t69 t69Var, wne wneVar, x4d x4dVar, int i) {
        this.a = i;
        this.b = z;
        this.c = t69Var;
        this.d = wneVar;
        this.e = x4dVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    qk6.O0.a(this.b, false, this.c, null, this.d, this.e, 0.0f, 0.0f, l46Var, 100663296, 200);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    qk6.O0.a(this.b, false, this.c, null, this.d, this.e, 0.0f, 0.0f, l46Var2, 100663296, 200);
                }
                break;
            default:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    m8c.f.h(this.b, this.c, null, this.d, this.e, 0.0f, 0.0f, l46Var3, 100663296, 200);
                }
                break;
        }
        return wefVar;
    }
}

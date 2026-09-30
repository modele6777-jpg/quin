package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ht9 implements l26 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ t69 c;
    public final /* synthetic */ wne d;
    public final /* synthetic */ x4d e;

    public ht9(boolean z, boolean z2, t69 t69Var, wne wneVar, x4d x4dVar) {
        this.a = z;
        this.b = z2;
        this.c = t69Var;
        this.d = wneVar;
        this.e = x4dVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            qk6.O0.a(this.a, this.b, this.c, null, this.d, this.e, 0.0f, 0.0f, l46Var, 100663296, 200);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}

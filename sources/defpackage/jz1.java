package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 implements l26 {
    public final /* synthetic */ auc a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ dd2 d;
    public final /* synthetic */ mue e;
    public final /* synthetic */ float f;
    public final /* synthetic */ xw9 g;

    public jz1(auc aucVar, boolean z, boolean z2, dd2 dd2Var, mue mueVar, float f, xw9 xw9Var) {
        this.a = aucVar;
        this.b = z;
        this.c = z2;
        this.d = dd2Var;
        this.e = mueVar;
        this.f = f;
        this.g = xw9Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        long j;
        long j2;
        long j3;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            auc aucVar = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            if (z) {
                j = !z2 ? aucVar.b : aucVar.k;
            } else {
                j = aucVar.f;
            }
            long j4 = j;
            if (z) {
                j2 = !z2 ? aucVar.c : aucVar.l;
            } else {
                j2 = aucVar.g;
            }
            if (z) {
                j3 = !z2 ? aucVar.d : aucVar.m;
            } else {
                j3 = aucVar.h;
            }
            kz1.a(this.d, this.e, j4, j2, j3, this.f, this.g, l46Var, 0);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}

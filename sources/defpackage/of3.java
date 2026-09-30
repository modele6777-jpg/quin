package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class of3 implements l26 {
    public final /* synthetic */ x16 a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gx6 d;
    public final /* synthetic */ String e;

    public of3(x16 x16Var, j09 j09Var, boolean z, gx6 gx6Var, String str) {
        this.a = x16Var;
        this.b = j09Var;
        this.c = z;
        this.d = gx6Var;
        this.e = str;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z = false;
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            bm8.h(this.a, this.b, this.c, null, null, af1.b0(-1301085432, new fw0(this.d, this.e, z, 4), l46Var), l46Var, 1572864, 56);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}

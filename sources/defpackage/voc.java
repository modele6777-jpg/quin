package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class voc implements xj5 {
    public final /* synthetic */ e89 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public voc(e89 e89Var, String str, boolean z, String str2) {
        this.a = e89Var;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int iIntValue = ((Number) obj).intValue();
        e89 e89Var = this.a;
        Integer num = (Integer) e89Var.getValue();
        if (num == null || iIntValue != num.intValue()) {
            e89Var.setValue(new Integer(iIntValue));
            x1f x1fVar = x1f.a;
            x1f.k(new r05("page_view"), new px6(this.b, iIntValue, this.c, this.d), 2);
        }
        return wef.a;
    }
}

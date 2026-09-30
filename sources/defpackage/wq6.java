package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wq6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ imb b;

    public /* synthetic */ wq6(imb imbVar, int i) {
        this.a = i;
        this.b = imbVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        imb imbVar = this.b;
        switch (i) {
            case 0:
                if (!((xq6) obj).F0) {
                    return h4f.a;
                }
                imbVar.element = false;
                return h4f.c;
            default:
                if (((guc) obj).f.a.a.b.length() > 0) {
                    imbVar.element = false;
                }
                return wef.a;
        }
    }
}

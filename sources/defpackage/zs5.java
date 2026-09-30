package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zs5 implements x16 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zs5(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        boolean z = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                if (z) {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05.a, new bt5(str, 1), 2);
                }
                return wef.a;
            default:
                return db6.A0(str, Boolean.valueOf(z));
        }
    }

    public /* synthetic */ zs5(boolean z, String str) {
        this.c = z;
        this.b = str;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v0a implements gdb, jja {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v0a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gdb
    public final q8c c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((a1a) obj).b;
            default:
                return ((qja) obj).b;
        }
    }

    @Override // defpackage.jja
    public final Object d(String str, a26 a26Var, zn2 zn2Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((a1a) obj).d(str, a26Var, zn2Var);
            default:
                return ((qja) obj).d(str, a26Var, zn2Var);
        }
    }
}

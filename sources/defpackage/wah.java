package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wah extends jbh {
    public volatile boolean e;
    public final boolean f;

    public wah(String str, gn2 gn2Var, boolean z) {
        super(str, gn2Var);
        this.f = z;
    }

    @Override // defpackage.jbh
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.jbh
    public final /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.jbh
    public final /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.jbh
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.jbh
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Boolean) obj).booleanValue();
    }
}

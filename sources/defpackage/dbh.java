package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dbh extends jbh {
    public volatile long e;
    public final long f;

    public dbh(String str, gn2 gn2Var, long j) {
        super(str, gn2Var);
        this.f = j;
    }

    @Override // defpackage.jbh
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.f);
    }

    @Override // defpackage.jbh
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.jbh
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.jbh
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.e);
    }

    @Override // defpackage.jbh
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Long) obj).longValue();
    }
}

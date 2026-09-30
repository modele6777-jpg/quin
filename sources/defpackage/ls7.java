package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ls7 implements f04 {
    public final cob a;

    public ls7(cob cobVar, apa apaVar, e04 e04Var) {
        this.a = cobVar;
    }

    @Override // defpackage.f04
    public final String b() {
        return ub3.l(new StringBuilder("Class '"), smb.a(this.a.a).a().a.a, '\'');
    }

    public final String toString() {
        return ls7.class.getSimpleName() + ": " + this.a;
    }
}

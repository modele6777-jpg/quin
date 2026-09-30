package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rib extends vyb {
    public final String c;
    public final long d;
    public final yhb e;

    public rib(String str, long j, yhb yhbVar) {
        this.c = str;
        this.d = j;
        this.e = yhbVar;
    }

    @Override // defpackage.vyb
    public final v41 P0() {
        return this.e;
    }

    @Override // defpackage.vyb
    public final long h() {
        return this.d;
    }

    @Override // defpackage.vyb
    public final oq8 l() {
        String str = this.c;
        if (str != null) {
            rob robVar = oq8.e;
            try {
                return kj0.c0(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}

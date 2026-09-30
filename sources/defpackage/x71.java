package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x71 extends vyb {
    public final q94 c;
    public final String d;
    public final String e;
    public final yhb f;

    public x71(q94 q94Var, String str, String str2) {
        this.c = q94Var;
        this.d = str;
        this.e = str2;
        this.f = new yhb(new yy0((mtd) q94Var.c.get(1), this));
    }

    @Override // defpackage.vyb
    public final v41 P0() {
        return this.f;
    }

    @Override // defpackage.vyb
    public final long h() {
        String str = this.e;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = ieg.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // defpackage.vyb
    public final oq8 l() {
        String str = this.d;
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

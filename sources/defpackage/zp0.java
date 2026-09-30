package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zp0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public byte f;

    public final aq0 a() {
        if (this.f == 1 && this.a != null && this.b != null && this.c != null && this.d != null) {
            return new aq0(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutId");
        }
        if (this.b == null) {
            sb.append(" variantId");
        }
        if (this.c == null) {
            sb.append(" parameterKey");
        }
        if (this.d == null) {
            sb.append(" parameterValue");
        }
        if ((this.f & 1) == 0) {
            sb.append(" templateVersion");
        }
        qc0.p(kv2.o("Missing required properties:", sb));
        return null;
    }
}

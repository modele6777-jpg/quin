package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c05 implements qu8 {
    public static final rr5 g;
    public static final rr5 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        qr5 qr5Var = new qr5();
        qr5Var.o = qv8.l("application/id3");
        g = new rr5(qr5Var);
        qr5 qr5Var2 = new qr5();
        qr5Var2.o = qv8.l("application/x-scte35");
        h = new rr5(qr5Var2);
    }

    public c05(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // defpackage.qu8
    public final rr5 a() {
        switch (this.a) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // defpackage.qu8
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c05.class != obj.getClass()) {
            return false;
        }
        c05 c05Var = (c05) obj;
        return this.c == c05Var.c && this.d == c05Var.d && this.a.equals(c05Var.a) && this.b.equals(c05Var.b) && Arrays.equals(this.e, c05Var.e);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iC = ub3.c(ub3.c(527, 31, this.a), 31, this.b);
        long j = this.c;
        int i2 = (iC + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iHashCode = Arrays.hashCode(this.e) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        this.f = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}

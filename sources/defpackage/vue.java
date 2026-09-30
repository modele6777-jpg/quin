package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vue {
    public static final uzd i = new uzd(5);
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final rne h;

    public vue(int i2, String str, String str2, long j, long j2, long j3, boolean z, int i3) {
        j3 = (i3 & 32) != 0 ? System.currentTimeMillis() : j3;
        z = (i3 & 64) != 0 ? true : z;
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        if (str.length() == 0 && str2.length() == 0) {
            qc0.j("Either pre or post text must not be empty");
            throw null;
        }
        this.h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? rne.c : rne.b : rne.a;
    }

    public final one a() {
        rne rneVar = this.h;
        rne rneVar2 = rne.b;
        one oneVar = one.d;
        if (rneVar != rneVar2) {
            return oneVar;
        }
        long j = this.e;
        if (!eue.d(j)) {
            return oneVar;
        }
        long j2 = this.d;
        if (eue.d(j2)) {
            return ((int) (j2 >> 32)) > ((int) (j >> 32)) ? one.a : one.b;
        }
        int i2 = (int) (j2 >> 32);
        return (i2 == ((int) (j >> 32)) && i2 == this.a) ? one.c : oneVar;
    }
}

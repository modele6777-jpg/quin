package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tlg {
    public int a;
    public long b;
    public Object c;
    public int d;

    public tlg(hmg hmgVar) {
        hmgVar.getClass();
    }

    public static /* synthetic */ String b(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public long a() {
        int i;
        long j = this.b;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        u49 u49Var = (u49) this.c;
        long j2 = j * ((long) u49Var.f);
        int i2 = this.a;
        if (i2 != -1 && (i = this.d) != -1) {
            j2 -= (long) (i2 + i);
        }
        if (j2 <= 0) {
            return -9223372036854775807L;
        }
        return pqf.L(u49Var.c, j2 - 1);
    }
}

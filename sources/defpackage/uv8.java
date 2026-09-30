package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uv8 {
    public final f09 a;
    public final int b;
    public final int c;
    public final int d;
    public final uv8 e;
    public final int f;

    public uv8(zi0 zi0Var, f09 f09Var, int i, int i2, int i3, uv8 uv8Var, mtf mtfVar) {
        this.a = f09Var;
        this.b = i;
        f09 f09Var2 = f09.BYTE;
        int i4 = (f09Var == f09Var2 || uv8Var == null) ? i2 : uv8Var.c;
        this.c = i4;
        this.d = i3;
        this.e = uv8Var;
        boolean z = false;
        int iB = uv8Var != null ? uv8Var.f : 0;
        if ((f09Var == f09Var2 && uv8Var == null && i4 != 0) || (uv8Var != null && i4 != uv8Var.c)) {
            z = true;
        }
        iB = (uv8Var == null || f09Var != uv8Var.a || z) ? iB + f09Var.b(mtfVar) + 4 : iB;
        int iOrdinal = f09Var.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                iB += i3 != 1 ? 11 : 6;
            } else if (iOrdinal == 4) {
                iB += ((String) zi0Var.b).substring(i, i3 + i).getBytes(((ds4) zi0Var.c).a[i2].charset()).length * 8;
                if (z) {
                    iB += 12;
                }
            } else if (iOrdinal == 6) {
                iB += 13;
            }
        } else {
            iB += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        }
        this.f = iB;
    }
}

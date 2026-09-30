package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uvc {
    public final long a;
    public final long b;
    public final bv7 c;
    public final boolean d;
    public final vuc e;
    public final tvc f;
    public final y85 g;
    public final boolean h;
    public final w69 i;
    public final ArrayList j;
    public int k;
    public int l;
    public int m;

    public uvc(long j, long j2, bv7 bv7Var, boolean z, vuc vucVar, tvc tvcVar, y85 y85Var, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = bv7Var;
        this.d = z;
        this.e = vucVar;
        this.f = tvcVar;
        this.g = y85Var;
        this.h = z2;
        int i = mf8.a;
        this.i = new w69(6);
        this.j = new ArrayList();
        this.k = -1;
        this.l = -1;
        this.m = -1;
    }

    public final int a(int i, i94 i94Var, i94 i94Var2) {
        if (i == -1) {
            int iOrdinal = hcc.l(i94Var, i94Var2).ordinal();
            if (iOrdinal == 0) {
                return this.m - 1;
            }
            if (iOrdinal == 1) {
                return this.m;
            }
            if (iOrdinal != 2) {
                ap.c();
                return 0;
            }
        }
        return i;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pq6 {
    public final qte a;
    public int b = -1;
    public float c;

    public pq6(qte qteVar) {
        this.a = qteVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public final float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2 = 1;
        qte qteVar = this.a;
        if (z) {
            int iU = jgb.U(qteVar.f, i, z);
            int lineStart = qteVar.f.getLineStart(iU);
            int iF = qteVar.f(iU);
            if (i == lineStart || i == iF) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.b == i4) {
            return this.c;
        }
        float fJ = z3 ? qteVar.j(i, z) : qteVar.k(i, z);
        if (z2) {
            this.b = i4;
            this.c = fJ;
        }
        return fJ;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h61 extends eua {
    public static final h61 c = new h61(l61.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        f61 f61Var = (f61) obj;
        f61Var.getClass();
        byte bN = zf2Var.n(this.b, i);
        f61Var.b(f61Var.d() + 1);
        byte[] bArr = f61Var.a;
        int i2 = f61Var.b;
        f61Var.b = i2 + 1;
        bArr[i2] = bN;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        f61 f61Var = new f61();
        f61Var.a = bArr;
        f61Var.b = bArr.length;
        f61Var.b(10);
        return f61Var;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new byte[0];
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        ag2Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.r(this.b, i2, bArr[i2]);
        }
    }
}

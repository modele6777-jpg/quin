package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x9f extends eua {
    public static final x9f c = new x9f(y9f.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        return ((v9f) obj).a.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        w9f w9fVar = (w9f) obj;
        w9fVar.getClass();
        byte bA = zf2Var.e(this.b, i).A();
        w9fVar.b(w9fVar.d() + 1);
        byte[] bArr = w9fVar.a;
        int i2 = w9fVar.b;
        w9fVar.b = i2 + 1;
        bArr[i2] = bA;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        byte[] bArr = ((v9f) obj).a;
        w9f w9fVar = new w9f();
        w9fVar.a = bArr;
        w9fVar.b = bArr.length;
        w9fVar.b(10);
        return w9fVar;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new v9f(new byte[0]);
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        byte[] bArr = ((v9f) obj).a;
        ag2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.C(this.b, i2).l(bArr[i2]);
        }
    }
}

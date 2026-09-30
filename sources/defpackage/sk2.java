package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sk2 extends tk2 {
    public final x3c e;
    public final x3c f;
    public final float[] g;

    public sk2(x3c x3cVar, x3c x3cVar2) {
        float[] fArrB0;
        super(x3cVar2, x3cVar, x3cVar2, null);
        this.e = x3cVar;
        this.f = x3cVar2;
        float[] fArr = (float[]) m6c.e.b;
        y3g y3gVar = x3cVar.d;
        float[] fArr2 = x3cVar.i;
        y3g y3gVar2 = x3cVar2.d;
        float[] fArr3 = x3cVar2.j;
        if (hkg.f0(y3gVar, y3gVar2)) {
            fArrB0 = hkg.B0(fArr3, fArr2);
        } else {
            float[] fArrA = y3gVar.a();
            float[] fArrA2 = y3gVar2.a();
            y3g y3gVar3 = cgg.k;
            fArrB0 = hkg.B0(hkg.f0(y3gVar2, y3gVar3) ? fArr3 : hkg.y0(hkg.B0(hkg.b0(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), x3cVar2.i)), hkg.f0(y3gVar, y3gVar3) ? fArr2 : hkg.B0(hkg.b0(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrB0;
    }

    @Override // defpackage.tk2
    public final long a(long j) {
        float fG = y72.g(j);
        float f = y72.f(j);
        float fD = y72.d(j);
        float fC = y72.c(j);
        r3c r3cVar = this.e.p;
        float fB = (float) r3cVar.b(fG);
        float fB2 = (float) r3cVar.b(f);
        float fB3 = (float) r3cVar.b(fD);
        float[] fArr = this.g;
        float f2 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f3 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        float f4 = (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
        x3c x3cVar = this.f;
        r3c r3cVar2 = x3cVar.m;
        return abg.b((float) r3cVar2.b(f2), (float) r3cVar2.b(f3), (float) r3cVar2.b(f4), fC, x3cVar);
    }
}

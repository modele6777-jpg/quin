package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class tk2 {
    public final p82 a;
    public final p82 b;
    public final p82 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public tk2(p82 p82Var, p82 p82Var2, int i) {
        p82 p82VarP = cgg.y(p82Var.b, 12884901888L) ? hkg.P(p82Var) : p82Var;
        p82 p82VarP2 = cgg.y(p82Var2.b, 12884901888L) ? hkg.P(p82Var2) : p82Var2;
        float[] fArrA = cgg.n;
        float[] fArr = null;
        if (i == 3) {
            boolean zY = cgg.y(p82Var.b, 12884901888L);
            boolean zY2 = cgg.y(p82Var2.b, 12884901888L);
            if ((!zY || !zY2) && (zY || zY2)) {
                y3g y3gVar = ((x3c) (zY ? p82Var : p82Var2)).d;
                float[] fArrA2 = zY ? y3gVar.a() : fArrA;
                fArrA = zY2 ? y3gVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            }
        }
        this(p82Var2, p82VarP, p82VarP2, fArr);
    }

    public long a(long j) {
        float fG = y72.g(j);
        float f = y72.f(j);
        float fD = y72.d(j);
        float fC = y72.c(j);
        p82 p82Var = this.b;
        long jD = p82Var.d(fG, f, fD);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE = p82Var.e(fG, f, fD);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f3 = fIntBitsToFloat2;
        return this.c.f(f2, f3, fE, fC, this.a);
    }

    public tk2(p82 p82Var, p82 p82Var2, p82 p82Var3, float[] fArr) {
        this.a = p82Var;
        this.b = p82Var2;
        this.c = p82Var3;
        this.d = fArr;
    }
}

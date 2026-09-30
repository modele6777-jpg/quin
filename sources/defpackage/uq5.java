package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uq5 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile fud b = new fud(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c(115, new vq5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c(130, new vq5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c(150, new vq5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c(180, new vq5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c(200, new vq5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.b(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        k37.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static tq5 a(float f) {
        float fB;
        tq5 vq5Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        fud fudVar = b;
        int i = (int) (f * 100.0f);
        fudVar.getClass();
        tq5 tq5Var = (tq5) abg.q(fudVar, i);
        if (tq5Var != null) {
            return tq5Var;
        }
        fud fudVar2 = b;
        if (fudVar2.a) {
            abg.x(fudVar2);
        }
        int iQ = cgg.q(fudVar2.d, i, fudVar2.b);
        if (iQ >= 0) {
            return (tq5) b.e(iQ);
        }
        int i2 = -(iQ + 1);
        int i3 = i2 - 1;
        if (i2 >= b.d()) {
            vq5 vq5Var2 = new vq5(new float[]{1.0f}, new float[]{f});
            b(f, vq5Var2);
            return vq5Var2;
        }
        if (i3 < 0) {
            vq5Var = new vq5(fArr, fArr);
            fB = 1.0f;
        } else {
            fB = b.b(i3) / 100.0f;
            vq5Var = (tq5) b.e(i3);
        }
        float fB2 = b.b(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fB == fB2 ? 0.0f : (f - fB) / (fB2 - fB))) * 1.0f) + 0.0f;
        tq5 tq5Var2 = (tq5) b.e(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB3 = vq5Var.b(f2);
            fArr2[i4] = ((tq5Var2.b(f2) - fB3) * fMax) + fB3;
        }
        vq5 vq5Var3 = new vq5(fArr, fArr2);
        b(f, vq5Var3);
        return vq5Var3;
    }

    public static void b(float f, vq5 vq5Var) {
        synchronized (c) {
            fud fudVarClone = b.clone();
            fudVarClone.c((int) (f * 100.0f), vq5Var);
            b = fudVarClone;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class btf {
    public final boolean a;
    public final atf b;
    public final int c;
    public final qb3[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public btf(boolean z, atf atfVar) {
        int i;
        this.a = z;
        this.b = atfVar;
        if (z && atfVar.equals(atf.a)) {
            qc0.p("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = atfVar.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                ap.c();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new qb3[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.e + 1) % 20;
        this.e = i;
        qb3[] qb3VarArr = this.d;
        qb3 qb3Var = qb3VarArr[i];
        if (qb3Var != null) {
            qb3Var.a = j;
            qb3Var.b = f;
        } else {
            qb3 qb3Var2 = new qb3();
            qb3Var2.a = j;
            qb3Var2.b = f;
            qb3VarArr[i] = qb3Var2;
        }
    }

    public final float b() {
        boolean z;
        atf atfVar;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.e;
        qb3[] qb3VarArr = this.d;
        qb3 qb3Var = qb3VarArr[i3];
        if (qb3Var == null) {
            return 0.0f;
        }
        int i4 = 0;
        qb3 qb3Var2 = qb3Var;
        do {
            qb3 qb3Var3 = qb3VarArr[i3];
            z = this.a;
            atfVar = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (qb3Var3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = qb3Var.a;
                i = i4;
                f = 0.0f;
                long j2 = qb3Var3.a;
                float f3 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float fAbs = Math.abs(j2 - qb3Var2.a);
                qb3Var2 = (atfVar == atf.a || z) ? qb3Var3 : qb3Var;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i] = qb3Var3.b;
                    fArr[i] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.c) {
            return f;
        }
        int iOrdinal = atfVar.ordinal();
        if (iOrdinal == 0) {
            try {
                float[] fArr4 = this.h;
                z7c.o(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iOrdinal != i2) {
                ap.c();
                return f;
            }
            int i5 = i4 - i2;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
        }
        return fSignum * 1000.0f;
    }

    public final float c(float f) {
        if (f <= 0.0f) {
            i37.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fB = b();
        if (fB == 0.0f || Float.isNaN(fB)) {
            return 0.0f;
        }
        if (fB <= 0.0f) {
            float f2 = -f;
            if (fB < f2) {
                return f2;
            }
        } else if (fB > f) {
            return f;
        }
        return fB;
    }

    public /* synthetic */ btf() {
        this(false, atf.a);
    }

    public btf(boolean z) {
        this(z, atf.b);
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class um implements erd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ m26 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ um(Object obj, m26 m26Var, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = m26Var;
        this.d = obj2;
    }

    @Override // defpackage.erd
    public final float a(float f, float f2) {
        switch (this.a) {
            case 0:
                return 0.0f;
            default:
                yx9 yx9Var = (yx9) this.b;
                int iM = yx9Var.m();
                vz9 vz9Var = yx9Var.m;
                int i = ((qx9) vz9Var.getValue()).c + iM;
                if (i == 0) {
                    return 0.0f;
                }
                int i2 = yx9Var.e;
                if (f < 0.0f) {
                    i2++;
                }
                int iO = mh3.o(((int) (f2 / i)) + i2, 0, yx9Var.l());
                sx9 sx9Var = (sx9) this.d;
                yx9Var.m();
                int i3 = ((qx9) vz9Var.getValue()).c;
                long j = i2;
                long j2 = sx9Var.a;
                long j3 = j - j2;
                if (j3 < 0) {
                    j3 = 0;
                }
                int i4 = (int) j3;
                long j4 = j + j2;
                if (j4 > 2147483647L) {
                    j4 = 2147483647L;
                }
                int iAbs = Math.abs((mh3.o(mh3.o(iO, i4, (int) j4), 0, yx9Var.l()) - i2) * i) - i;
                int i5 = iAbs >= 0 ? iAbs : 0;
                if (i5 == 0) {
                    return i5;
                }
                return Math.signum(f) * i5;
        }
    }

    @Override // defpackage.erd
    public final float b(float f) {
        int i = this.a;
        m26 m26Var = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                mo moVar = (mo) obj;
                float fE = moVar.e();
                Object objD = jn.d(moVar.b(), fE, f, (a26) m26Var, (tm) this.d);
                if (!((Boolean) moVar.a.d(objD)).booleanValue()) {
                    objD = moVar.h.getValue();
                }
                return moVar.b().e(objD) - fE;
            default:
                yx9 yx9Var = (yx9) obj;
                frd frdVar = yx9Var.k().n;
                List list = yx9Var.k().a;
                int size = list.size();
                float f2 = Float.POSITIVE_INFINITY;
                float f3 = Float.NEGATIVE_INFINITY;
                for (int i2 = 0; i2 < size; i2++) {
                    ao8 ao8Var = (ao8) list.get(i2);
                    int iA = xo1.A(yx9Var.k());
                    int i3 = -yx9Var.k().f;
                    int i4 = yx9Var.k().d;
                    int i5 = yx9Var.k().b;
                    int i6 = ao8Var.j;
                    yx9Var.l();
                    float fG = i6 - frdVar.g(iA, i5, i3, i4);
                    if (fG <= 0.0f && fG > f3) {
                        f3 = fG;
                    }
                    if (fG >= 0.0f && fG < f2) {
                        f2 = fG;
                    }
                }
                if (f3 == Float.NEGATIVE_INFINITY) {
                    f3 = f2;
                }
                if (f2 == Float.POSITIVE_INFINITY) {
                    f2 = f3;
                }
                if (!yx9Var.d()) {
                    if (m93.G(yx9Var, f)) {
                        f3 = 0.0f;
                        f2 = 0.0f;
                    } else {
                        f2 = 0.0f;
                    }
                }
                if (!yx9Var.c()) {
                    f3 = 0.0f;
                    if (!m93.G(yx9Var, f)) {
                        f2 = 0.0f;
                    }
                }
                iy9 iy9Var = new iy9(Float.valueOf(f3), Float.valueOf(f2));
                float fFloatValue = ((Number) iy9Var.a()).floatValue();
                float fFloatValue2 = ((Number) iy9Var.b()).floatValue();
                float fFloatValue3 = ((Number) ((s19) m26Var).m(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
                if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
                    l37.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
                }
                if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
                    return 0.0f;
                }
                return fFloatValue3;
        }
    }
}

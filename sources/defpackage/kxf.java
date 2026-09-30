package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kxf implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ kxf(int i, int i2, t2f t2fVar, int i3, bn2 bn2Var, yi yiVar, e89 e89Var) {
        this.b = i;
        this.c = i2;
        this.e = t2fVar;
        this.d = i3;
        this.f = bn2Var;
        this.g = yiVar;
        this.v = e89Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.v;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                boolean z = true;
                final t2f t2fVar = (t2f) obj7;
                final bn2 bn2Var = (bn2) obj6;
                final yi yiVar = (yi) obj5;
                final e89 e89Var = (e89) obj4;
                zn8 zn8Var = (zn8) obj;
                tn8 tn8Var = (tn8) obj2;
                final kl2 kl2Var = (kl2) obj3;
                final int i2 = this.b;
                boolean z2 = i2 >= 0;
                final int i3 = this.c;
                if (i3 < 0) {
                    z = false;
                }
                if (!(z & z2)) {
                    k37.a("width and height must be >= 0");
                }
                final cea ceaVarV = tn8Var.v(ll2.h(i2, i2, i3, i3));
                int iH = (ceaVarV.a - kl2.h(kl2Var.a)) / 2;
                if (iH <= 0) {
                    iH = 0;
                }
                int iG = (ceaVarV.b - kl2.g(kl2Var.a)) / 2;
                int i4 = iG > 0 ? iG : 0;
                int i5 = ceaVarV.a;
                int i6 = ceaVarV.b;
                final int i7 = this.d;
                final int i8 = iH;
                final int i9 = i4;
                return zn8Var.n0(i5, i6, qu4.a, new a26() { // from class: lxf
                    @Override // defpackage.a26
                    public final Object d(Object obj8) {
                        final kl2 kl2Var2 = kl2Var;
                        final int i10 = i2;
                        final int i11 = i3;
                        final t2f t2fVar2 = t2fVar;
                        final int i12 = i7;
                        final bn2 bn2Var2 = bn2Var;
                        final yi yiVar2 = yiVar;
                        final e89 e89Var2 = e89Var;
                        bea.q((bea) obj8, ceaVarV, i8, i9, new a26() { // from class: mxf
                            /* JADX WARN: Code duplicated, block: B:17:0x0061  */
                            @Override // defpackage.a26
                            public final Object d(Object obj9) {
                                SizeF sizeF;
                                cv7 cv7Var;
                                RectF rectF;
                                long j = kl2Var2.a;
                                g0c g0cVar = (g0c) obj9;
                                boolean zBooleanValue = ((Boolean) e89Var2.getValue()).booleanValue();
                                wef wefVar = wef.a;
                                if (!zBooleanValue) {
                                    return wefVar;
                                }
                                Size size = new Size(kl2.h(j), kl2.g(j));
                                int i13 = i10;
                                int i14 = i11;
                                Size size2 = new Size(i13, i14);
                                t2f t2fVar3 = t2fVar2;
                                RectF rectFE = tgc.e(t2fVar3, size2);
                                int i15 = t2fVar3.a;
                                if (i15 == 0) {
                                    sizeF = new SizeF(rectFE.width(), rectFE.height());
                                } else {
                                    if (i15 != 90) {
                                        if (i15 == 180) {
                                            sizeF = new SizeF(rectFE.width(), rectFE.height());
                                        } else if (i15 != 270) {
                                            qc0.j(tec.e(i15, "Invalid rotation degrees: "));
                                            return null;
                                        }
                                    }
                                    sizeF = new SizeF(rectFE.height(), rectFE.width());
                                }
                                float width = (sizeF.getWidth() + 1.0f) / (sizeF.getHeight() - 1.0f);
                                float width2 = (sizeF.getWidth() - 1.0f) / (sizeF.getHeight() + 1.0f);
                                float width3 = size.getWidth() / size.getHeight();
                                if (width < width3 || width3 < width2) {
                                    Matrix matrix = new Matrix();
                                    SizeF sizeF2 = new SizeF(size.getWidth(), size.getHeight());
                                    long jK = bn2Var2.k(dec.a(sizeF.getWidth(), sizeF.getHeight()), dec.a(sizeF2.getWidth(), sizeF2.getHeight()));
                                    int i16 = cec.a;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jK >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK & 4294967295L));
                                    RectF rectF2 = u2f.a;
                                    int iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                    SizeF sizeF3 = sizeF;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) iFloatToRawIntBits) << 32);
                                    int i17 = (int) (jFloatToRawIntBits >> 32);
                                    int i18 = (int) (jFloatToRawIntBits & 4294967295L);
                                    matrix.setScale(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18));
                                    SizeF sizeF4 = new SizeF(Float.intBitsToFloat(i17) * sizeF3.getWidth(), Float.intBitsToFloat(i18) * sizeF3.getHeight());
                                    SizeF sizeF5 = new SizeF(size.getWidth(), size.getHeight());
                                    long j2 = db6.j(Math.round(sizeF4.getWidth()), Math.round(sizeF4.getHeight()));
                                    long j3 = db6.j(Math.round(sizeF5.getWidth()), Math.round(sizeF5.getHeight()));
                                    int i19 = i12;
                                    if (i19 == 0) {
                                        cv7Var = cv7.a;
                                    } else {
                                        if (i19 != 1) {
                                            qc0.j(tec.e(i19, "Invalid layout direction: "));
                                            return null;
                                        }
                                        cv7Var = cv7.b;
                                    }
                                    long jA = yiVar2.a(j2, j3, cv7Var);
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((int) (jA & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jA >> 32)) << 32);
                                    matrix.postTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                                    rectF = new RectF(0.0f, 0.0f, sizeF3.getWidth(), sizeF3.getHeight());
                                    matrix.mapRect(rectF);
                                } else {
                                    rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
                                }
                                RectF rectFE2 = tgc.e(t2fVar3, size2);
                                Matrix matrix2 = new Matrix();
                                RectF rectF3 = u2f.a;
                                Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
                                matrix2.setRectToRect(rectFE2, rectF3, scaleToFit);
                                matrix2.postRotate(i15);
                                Matrix matrix3 = new Matrix();
                                matrix3.setRectToRect(rectF3, rectF, scaleToFit);
                                matrix2.postConcat(matrix3);
                                if (t2fVar3.b) {
                                    matrix2.preScale(-1.0f, 1.0f, rectFE2.centerX(), rectFE2.centerY());
                                }
                                float f = i13;
                                float f2 = i14;
                                RectF rectF4 = new RectF(0.0f, 0.0f, f, f2);
                                matrix2.mapRect(rectF4);
                                g0cVar.D(sfc.d(0.0f, 0.0f));
                                g0cVar.q(rectF4.width() / f);
                                g0cVar.r(rectF4.height() / f2);
                                g0cVar.E(rectF4.left);
                                g0cVar.G(rectF4.top);
                                return wefVar;
                            }
                        }, 4);
                        return wef.a;
                    }
                });
            default:
                List list = (List) obj7;
                l26 l26Var = (l26) obj6;
                String[] strArr = (String[]) obj5;
                String[] strArr2 = (String[]) obj4;
                u7c u7cVar = (u7c) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                u7cVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(u7cVar) ? 4 : 2;
                }
                if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    z67 z67VarB = t72.B(list);
                    g09 g09Var = g09.a;
                    j09 j09VarA = u7cVar.a(g09Var, 1.0f, true);
                    boolean zG = l46Var.g(l26Var) | l46Var.i(list);
                    int i10 = this.c;
                    boolean zE = zG | l46Var.e(i10);
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (zE || objR == i8cVar) {
                        objR = new g01(l26Var, list, i10, 7);
                        l46Var.p0(objR);
                    }
                    xxb.k(this.b, z67VarB, (a26) objR, j09VarA, strArr, null, 0.0f, 0, 0.0f, null, null, l46Var, 0, 2016);
                    int iO = mh3.o(i10, 0, 59);
                    z67 z67Var = new z67(0, 59, 1);
                    j09 j09VarA2 = u7cVar.a(g09Var, 1.0f, true);
                    boolean zG2 = l46Var.g(l26Var);
                    int i11 = this.d;
                    boolean zE2 = zG2 | l46Var.e(i11);
                    Object objR2 = l46Var.R();
                    if (zE2 || objR2 == i8cVar) {
                        objR2 = new v3g(i11, 1, l26Var);
                        l46Var.p0(objR2);
                    }
                    xxb.k(iO, z67Var, (a26) objR2, j09VarA2, strArr2, null, 0.0f, 0, 0.0f, null, null, l46Var, 0, 2016);
                } else {
                    l46Var.Z();
                }
                return wef.a;
        }
    }

    public /* synthetic */ kxf(List list, int i, l26 l26Var, int i2, String[] strArr, int i3, String[] strArr2) {
        this.e = list;
        this.b = i;
        this.f = l26Var;
        this.c = i2;
        this.g = strArr;
        this.d = i3;
        this.v = strArr2;
    }
}

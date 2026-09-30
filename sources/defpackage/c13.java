package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c13 {
    public final z2f a;
    public final ute b;
    public final ne2 c;
    public final aw2 d;
    public lyd e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final CursorAnchorInfo.Builder j = new CursorAnchorInfo.Builder();
    public final float[] k = zm8.a();
    public final Matrix l = new Matrix();

    public c13(z2f z2fVar, ute uteVar, ne2 ne2Var, aw2 aw2Var) {
        this.a = z2fVar;
        this.b = uteVar;
        this.c = ne2Var;
        this.d = aw2Var;
    }

    public final CursorAnchorInfo a() {
        bv7 bv7Var;
        bv7 bv7VarB;
        ste steVarC;
        ute uteVar = this.b;
        bv7 bv7VarE = uteVar.e();
        if (bv7VarE != null) {
            if (!bv7VarE.h()) {
                bv7VarE = null;
            }
            if (bv7VarE != null && (bv7Var = (bv7) uteVar.e.getValue()) != null) {
                if (!bv7Var.h()) {
                    bv7Var = null;
                }
                if (bv7Var != null && (bv7VarB = uteVar.b()) != null) {
                    if (!bv7VarB.h()) {
                        bv7VarB = null;
                    }
                    if (bv7VarB != null && (steVarC = uteVar.c()) != null) {
                        vne vneVarD = this.a.d();
                        float[] fArr = this.k;
                        zm8.d(fArr);
                        bv7VarE.j(fArr);
                        Matrix matrix = this.l;
                        hkg.L0(matrix, fArr);
                        hkb hkbVarK = dj6.Z(bv7Var).k(bv7VarE.K(bv7Var, 0L));
                        hkb hkbVarK2 = dj6.Z(bv7VarB).k(bv7VarE.K(bv7VarB, 0L));
                        long j = vneVarD.d;
                        eue eueVar = vneVarD.e;
                        boolean z = this.f;
                        boolean z2 = this.g;
                        boolean z3 = this.h;
                        boolean z4 = this.i;
                        CursorAnchorInfo.Builder builder = this.j;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int iG = eue.g(j);
                        builder.setSelectionRange(iG, eue.f(j));
                        txb txbVar = txb.b;
                        if (z && iG >= 0) {
                            hkb hkbVarC = steVarC.c(iG);
                            float fN = mh3.n(hkbVarC.a, 0.0f, (int) (steVarC.c >> 32));
                            boolean zW = k99.w(hkbVarK, fN, hkbVarC.b);
                            boolean zW2 = k99.w(hkbVarK, fN, hkbVarC.d);
                            boolean z5 = steVarC.a(iG) == txbVar;
                            int i = (zW || zW2) ? 1 : 0;
                            if (!zW || !zW2) {
                                i |= 2;
                            }
                            if (z5) {
                                i |= 4;
                            }
                            int i2 = i;
                            float f = hkbVarC.b;
                            float f2 = hkbVarC.d;
                            builder.setInsertionMarkerLocation(fN, f, f2, f2, i2);
                        }
                        if (z2) {
                            int iG2 = eueVar != null ? eue.g(eueVar.a) : -1;
                            int iF = eueVar != null ? eue.f(eueVar.a) : -1;
                            if (iG2 >= 0 && iG2 < iF) {
                                builder.setComposingText(iG2, vneVarD.c.subSequence(iG2, iF));
                                float[] fArr2 = new float[(iF - iG2) * 4];
                                steVarC.b.a(u3c.b(iG2, iF), fArr2);
                                int i3 = iG2;
                                while (i3 < iF) {
                                    int i4 = (i3 - iG2) * 4;
                                    float f3 = fArr2[i4];
                                    float f4 = fArr2[i4 + 1];
                                    float f5 = fArr2[i4 + 2];
                                    float f6 = fArr2[i4 + 3];
                                    int i5 = iF;
                                    int i6 = (f3 < hkbVarK.c ? 1 : 0) & (hkbVarK.a < f5 ? 1 : 0) & (hkbVarK.b < f6 ? 1 : 0) & (f4 < hkbVarK.d ? 1 : 0);
                                    if (!k99.w(hkbVarK, f3, f4) || !k99.w(hkbVarK, f5, f6)) {
                                        i6 |= 2;
                                    }
                                    if (steVarC.a(i3) == txbVar) {
                                        i6 |= 4;
                                    }
                                    builder.addCharacterBounds(i3, f3, f4, f5, f6, i6);
                                    i3++;
                                    iF = i5;
                                }
                            }
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 33 && z3) {
                            q6.J(builder, hkbVarK2);
                        }
                        if (i7 >= 34 && z4) {
                            hgc.c(builder, steVarC, hkbVarK);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}

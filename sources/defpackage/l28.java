package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l28 {
    public final vs a;
    public final k47 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public zse j;
    public ste k;
    public sl9 l;
    public hkb m;
    public hkb n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = zm8.a();
    public final Matrix q = new Matrix();

    public l28(vs vsVar, k47 k47Var) {
        this.a = vsVar;
        this.b = k47Var;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01b9  */
    public final void a() {
        k47 k47Var = this.b;
        InputMethodManager inputMethodManagerC = k47Var.C();
        View view = (View) k47Var.b;
        if (!inputMethodManagerC.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        zm8.d(fArr);
        bv7 bv7Var = (bv7) ((h28) this.a.$node).G0.getValue();
        if (bv7Var != null) {
            if (!bv7Var.h()) {
                bv7Var = null;
            }
            if (bv7Var != null) {
                bv7Var.j(fArr);
            }
        }
        hkb hkbVar = this.n;
        hkbVar.getClass();
        float f = -hkbVar.a;
        hkb hkbVar2 = this.n;
        hkbVar2.getClass();
        zm8.f(fArr, f, -hkbVar2.b);
        Matrix matrix = this.q;
        hkg.L0(matrix, fArr);
        zse zseVar = this.j;
        zseVar.getClass();
        long j = zseVar.b;
        sl9 sl9Var = this.l;
        sl9Var.getClass();
        ste steVar = this.k;
        steVar.getClass();
        hkb hkbVar3 = this.m;
        hkbVar3.getClass();
        hkb hkbVar4 = this.n;
        hkbVar4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        eue eueVar = zseVar.c;
        int iG = eue.g(j);
        builder.setSelectionRange(iG, eue.f(j));
        txb txbVar = txb.b;
        if (z && iG >= 0) {
            int iV = sl9Var.v(iG);
            hkb hkbVarC = steVar.c(iV);
            float fN = mh3.n(hkbVarC.a, 0.0f, (int) (steVar.c >> 32));
            boolean zW = k99.w(hkbVar3, fN, hkbVarC.b);
            boolean zW2 = k99.w(hkbVar3, fN, hkbVarC.d);
            boolean z5 = steVar.a(iV) == txbVar;
            int i = (zW || zW2) ? 1 : 0;
            if (!zW || !zW2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f2 = hkbVarC.b;
            float f3 = hkbVarC.d;
            builder.setInsertionMarkerLocation(fN, f2, f3, f3, i);
        }
        if (z2) {
            int iG2 = eueVar != null ? eue.g(eueVar.a) : -1;
            int iF = eueVar != null ? eue.f(eueVar.a) : -1;
            if (iG2 >= 0 && iG2 < iF) {
                builder.setComposingText(iG2, zseVar.a.b.subSequence(iG2, iF));
                int iV2 = sl9Var.v(iG2);
                int iV3 = sl9Var.v(iF);
                float[] fArr2 = new float[(iV3 - iV2) * 4];
                steVar.b.a(u3c.b(iV2, iV3), fArr2);
                while (iG2 < iF) {
                    int iV4 = sl9Var.v(iG2);
                    int i2 = (iV4 - iV2) * 4;
                    float f4 = fArr2[i2];
                    float f5 = fArr2[i2 + 1];
                    int i3 = iF;
                    float f6 = fArr2[i2 + 2];
                    float f7 = fArr2[i2 + 3];
                    int i4 = iV2;
                    int i5 = (hkbVar3.a < f6 ? 1 : 0) & (f4 < hkbVar3.c ? 1 : 0) & (hkbVar3.b < f7 ? 1 : 0) & (f5 < hkbVar3.d ? 1 : 0);
                    if (!k99.w(hkbVar3, f4, f5) || !k99.w(hkbVar3, f6, f7)) {
                        i5 |= 2;
                    }
                    if (steVar.a(iV4) == txbVar) {
                        i5 |= 4;
                    }
                    int i6 = iG2;
                    builder.addCharacterBounds(i6, f4, f5, f6, f7, i5);
                    iG2 = i6 + 1;
                    iF = i3;
                    iV2 = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            q6.J(builder, hkbVar4);
        }
        if (i7 >= 34 && z4) {
            hgc.c(builder, steVar, hkbVar3);
        }
        k47Var.C().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}

package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b13 {
    public final AndroidComposeView a;
    public final ta0 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public zse j;
    public ste k;
    public sl9 l;
    public hkb n;
    public hkb o;
    public final Object c = new Object();
    public a26 m = z03.c;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = zm8.a();
    public final Matrix r = new Matrix();

    public b13(AndroidComposeView androidComposeView, ta0 ta0Var) {
        this.a = androidComposeView;
        this.b = ta0Var;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0185  */
    public final void a() {
        ta0 ta0Var = this.b;
        lw7 lw7Var = (lw7) ta0Var.d;
        InputMethodManager inputMethodManager = (InputMethodManager) lw7Var.getValue();
        View view = (View) ta0Var.c;
        if (inputMethodManager.isActive(view)) {
            a26 a26Var = this.m;
            float[] fArr = this.q;
            a26Var.d(new zm8(fArr));
            this.a.p(fArr);
            Matrix matrix = this.r;
            hkg.L0(matrix, fArr);
            zse zseVar = this.j;
            zseVar.getClass();
            long j = zseVar.b;
            sl9 sl9Var = this.l;
            sl9Var.getClass();
            ste steVar = this.k;
            steVar.getClass();
            hkb hkbVar = this.n;
            hkbVar.getClass();
            hkb hkbVar2 = this.o;
            hkbVar2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
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
                boolean zS = xo1.s(hkbVar, fN, hkbVarC.b);
                boolean zS2 = xo1.s(hkbVar, fN, hkbVarC.d);
                boolean z5 = steVar.a(iV) == txbVar;
                int i = (zS || zS2) ? 1 : 0;
                if (!zS || !zS2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f = hkbVarC.b;
                float f2 = hkbVarC.d;
                builder.setInsertionMarkerLocation(fN, f, f2, f2, i);
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
                        float f3 = fArr2[i2];
                        float f4 = fArr2[i2 + 1];
                        int i3 = iF;
                        float f5 = fArr2[i2 + 2];
                        float f6 = fArr2[i2 + 3];
                        int i4 = iV2;
                        int i5 = (hkbVar.a < f5 ? 1 : 0) & (f3 < hkbVar.c ? 1 : 0) & (hkbVar.b < f6 ? 1 : 0) & (f4 < hkbVar.d ? 1 : 0);
                        if (!xo1.s(hkbVar, f3, f4) || !xo1.s(hkbVar, f5, f6)) {
                            i5 |= 2;
                        }
                        if (steVar.a(iV4) == txbVar) {
                            i5 |= 4;
                        }
                        int i6 = iG2;
                        builder.addCharacterBounds(i6, f3, f4, f5, f6, i5);
                        iG2 = i6 + 1;
                        iF = i3;
                        iV2 = i4;
                    }
                }
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33 && z3) {
                q6.I(builder, hkbVar2);
            }
            if (i7 >= 34 && z4) {
                hgc.b(builder, steVar, hkbVar);
            }
            ((InputMethodManager) lw7Var.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}

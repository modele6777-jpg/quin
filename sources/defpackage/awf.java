package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class awf extends View {
    public static final t84 E0 = new t84(3);
    public final kn4 a;
    public final yl1 b;
    public final xl1 c;
    public boolean d;
    public Outline e;
    public boolean f;
    public sw3 g;
    public cv7 v;
    public a26 w;
    public ke6 x;
    public float y;
    public float z;

    public awf(kn4 kn4Var, yl1 yl1Var, xl1 xl1Var) {
        super(kn4Var.getContext());
        this.a = kn4Var;
        this.b = yl1Var;
        this.c = xl1Var;
        setOutlineProvider(E0);
        this.f = true;
        this.g = rs0.n;
        this.v = cv7.a;
        me6.a.getClass();
        this.w = xx.S0;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.y;
        xl1 xl1Var = this.c;
        yl1 yl1Var = this.b;
        if (f > 0.0f || this.z > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.y, this.z);
            lp lpVar = yl1Var.a;
            Canvas canvas2 = lpVar.a;
            lpVar.a = canvas;
            sw3 sw3Var = this.g;
            cv7 cv7Var = this.v;
            float width = getWidth();
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width) << 32);
            ke6 ke6Var = this.x;
            a26 a26Var = this.w;
            ta0 ta0Var = xl1Var.b;
            ta0 ta0Var2 = xl1Var.b;
            sw3 sw3VarU = ta0Var.u();
            cv7 cv7VarW = ta0Var2.w();
            vl1 vl1VarP = ta0Var2.p();
            long jZ = ta0Var2.z();
            ke6 ke6Var2 = (ke6) ta0Var2.d;
            ta0Var2.P(sw3Var);
            ta0Var2.Q(cv7Var);
            ta0Var2.O(lpVar);
            ta0Var2.R(jFloatToRawIntBits);
            ta0Var2.d = ke6Var;
            lpVar.g();
            try {
                a26Var.d(xl1Var);
                lpVar.o();
                ta0Var2.P(sw3VarU);
                ta0Var2.Q(cv7VarW);
                ta0Var2.O(vl1VarP);
                ta0Var2.R(jZ);
                ta0Var2.d = ke6Var2;
                yl1Var.a.a = canvas2;
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                lpVar.o();
                ta0Var2.P(sw3VarU);
                ta0Var2.Q(cv7VarW);
                ta0Var2.O(vl1VarP);
                ta0Var2.R(jZ);
                ta0Var2.d = ke6Var2;
                throw th;
            }
        } else {
            lp lpVar2 = yl1Var.a;
            Canvas canvas3 = lpVar2.a;
            lpVar2.a = canvas;
            sw3 sw3Var2 = this.g;
            cv7 cv7Var2 = this.v;
            float width2 = getWidth();
            long jFloatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width2) << 32);
            ke6 ke6Var3 = this.x;
            a26 a26Var2 = this.w;
            ta0 ta0Var3 = xl1Var.b;
            ta0 ta0Var4 = xl1Var.b;
            sw3 sw3VarU2 = ta0Var3.u();
            cv7 cv7VarW2 = ta0Var4.w();
            vl1 vl1VarP2 = ta0Var4.p();
            long jZ2 = ta0Var4.z();
            ke6 ke6Var4 = (ke6) ta0Var4.d;
            ta0Var4.P(sw3Var2);
            ta0Var4.Q(cv7Var2);
            ta0Var4.O(lpVar2);
            ta0Var4.R(jFloatToRawIntBits2);
            ta0Var4.d = ke6Var3;
            lpVar2.g();
            try {
                a26Var2.d(xl1Var);
                lpVar2.o();
                ta0Var4.P(sw3VarU2);
                ta0Var4.Q(cv7VarW2);
                ta0Var4.O(vl1VarP2);
                ta0Var4.R(jZ2);
                ta0Var4.d = ke6Var4;
                yl1Var.a.a = canvas3;
            } catch (Throwable th2) {
                lpVar2.o();
                ta0Var4.P(sw3VarU2);
                ta0Var4.Q(cv7VarW2);
                ta0Var4.O(vl1VarP2);
                ta0Var4.R(jZ2);
                ta0Var4.d = ke6Var4;
                throw th2;
            }
        }
        this.d = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f;
    }

    public final yl1 getCanvasHolder() {
        return this.b;
    }

    public final View getOwnerView() {
        return this.a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.d) {
            return;
        }
        this.d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}

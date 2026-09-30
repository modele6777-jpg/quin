package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e90 extends a90 {
    public boolean X;
    public final d90 v;
    public Drawable w;
    public ColorStateList x;
    public PorterDuff.Mode y;
    public boolean z;

    public e90(d90 d90Var) {
        super(0, d90Var);
        this.x = null;
        this.y = null;
        this.z = false;
        this.X = false;
        this.v = d90Var;
    }

    @Override // defpackage.a90
    public final void H(AttributeSet attributeSet, int i) {
        super.H(attributeSet, R.attr.seekBarStyle);
        d90 d90Var = this.v;
        Context context = d90Var.getContext();
        int[] iArr = hbb.g;
        psd psdVarX = psd.x(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) psdVarX.c;
        nvf.i(d90Var, d90Var.getContext(), iArr, attributeSet, (TypedArray) psdVarX.c, R.attr.seekBarStyle);
        Drawable drawableQ = psdVarX.q(0);
        if (drawableQ != null) {
            d90Var.setThumb(drawableQ);
        }
        Drawable drawableP = psdVarX.p(1);
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.w = drawableP;
        if (drawableP != null) {
            drawableP.setCallback(d90Var);
            drawableP.setLayoutDirection(d90Var.getLayoutDirection());
            if (drawableP.isStateful()) {
                drawableP.setState(d90Var.getDrawableState());
            }
            Z();
        }
        d90Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.y = do4.b(typedArray.getInt(3, -1), this.y);
            this.X = true;
        }
        if (typedArray.hasValue(2)) {
            this.x = psdVarX.o(2);
            this.z = true;
        }
        psdVarX.z();
        Z();
    }

    public final void Z() {
        Drawable drawable = this.w;
        if (drawable != null) {
            if (this.z || this.X) {
                Drawable drawableMutate = drawable.mutate();
                this.w = drawableMutate;
                if (this.z) {
                    drawableMutate.setTintList(this.x);
                }
                if (this.X) {
                    this.w.setTintMode(this.y);
                }
                if (this.w.isStateful()) {
                    this.w.setState(this.v.getDrawableState());
                }
            }
        }
    }

    public final void a0(Canvas canvas) {
        if (this.w != null) {
            d90 d90Var = this.v;
            int max = d90Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.w.getIntrinsicWidth();
                int intrinsicHeight = this.w.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.w.setBounds(-i, -i2, i, i2);
                float width = ((d90Var.getWidth() - d90Var.getPaddingLeft()) - d90Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(d90Var.getPaddingLeft(), d90Var.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.w.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}

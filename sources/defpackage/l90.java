package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l90 extends g88 implements n90 {
    public CharSequence Q0;
    public i90 R0;
    public final Rect S0;
    public int T0;
    public final /* synthetic */ o90 U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(o90 o90Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.U0 = o90Var;
        this.S0 = new Rect();
        this.Z = o90Var;
        this.M0 = true;
        this.N0.setFocusable(true);
        this.E0 = new j90(this);
    }

    @Override // defpackage.n90
    public final CharSequence e() {
        return this.Q0;
    }

    @Override // defpackage.n90
    public final void h(CharSequence charSequence) {
        this.Q0 = charSequence;
    }

    @Override // defpackage.n90
    public final void m(int i) {
        this.T0 = i;
    }

    @Override // defpackage.n90
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        z80 z80Var = this.N0;
        boolean zIsShowing = z80Var.isShowing();
        s();
        z80Var.setInputMethodMode(2);
        f();
        hq4 hq4Var = this.c;
        hq4Var.setChoiceMode(1);
        hq4Var.setTextDirection(i);
        hq4Var.setTextAlignment(i2);
        o90 o90Var = this.U0;
        int selectedItemPosition = o90Var.getSelectedItemPosition();
        hq4 hq4Var2 = this.c;
        if (z80Var.isShowing() && hq4Var2 != null) {
            hq4Var2.setListSelectionHidden(false);
            hq4Var2.setSelection(selectedItemPosition);
            if (hq4Var2.getChoiceMode() != 0) {
                hq4Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = o90Var.getViewTreeObserver()) == null) {
            return;
        }
        g90 g90Var = new g90(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(g90Var);
        z80Var.setOnDismissListener(new k90(this, g90Var));
    }

    @Override // defpackage.g88, defpackage.n90
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.R0 = (i90) listAdapter;
    }

    public final void s() {
        int i;
        z80 z80Var = this.N0;
        Drawable background = z80Var.getBackground();
        o90 o90Var = this.U0;
        Rect rect = o90Var.v;
        if (background != null) {
            background.getPadding(rect);
            boolean z = zwf.a;
            i = o90Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = o90Var.getPaddingLeft();
        int paddingRight = o90Var.getPaddingRight();
        int width = o90Var.getWidth();
        int i2 = o90Var.g;
        if (i2 == -2) {
            int iA = o90Var.a(this.R0, z80Var.getBackground());
            int i3 = (o90Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = zwf.a;
        this.f = o90Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.T0) + i : paddingLeft + this.T0 + i;
    }
}

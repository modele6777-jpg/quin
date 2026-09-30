package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b90 extends RadioButton {
    public final g80 a;
    public final a80 b;
    public final u90 c;
    public v80 d;

    public b90(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        yve.a(this, getContext());
        g80 g80Var = new g80(this);
        this.a = g80Var;
        g80Var.c(attributeSet, R.attr.radioButtonStyle);
        a80 a80Var = new a80(this);
        this.b = a80Var;
        a80Var.s(attributeSet, R.attr.radioButtonStyle);
        u90 u90Var = new u90(this);
        this.c = u90Var;
        u90Var.g(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private v80 getEmojiTextViewHelper() {
        v80 v80Var = this.d;
        if (v80Var != null) {
            return v80Var;
        }
        v80 v80Var2 = new v80(this);
        this.d = v80Var2;
        return v80Var2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a80 a80Var = this.b;
        if (a80Var != null) {
            a80Var.c();
        }
        u90 u90Var = this.c;
        if (u90Var != null) {
            u90Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        a80 a80Var = this.b;
        if (a80Var != null) {
            return a80Var.q();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a80 a80Var = this.b;
        if (a80Var != null) {
            return a80Var.r();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        g80 g80Var = this.a;
        if (g80Var != null) {
            return g80Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g80 g80Var = this.a;
        if (g80Var != null) {
            return g80Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.e();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.f();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a80 a80Var = this.b;
        if (a80Var != null) {
            a80Var.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        a80 a80Var = this.b;
        if (a80Var != null) {
            a80Var.v(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g80 g80Var = this.a;
        if (g80Var != null) {
            if (g80Var.e) {
                g80Var.e = false;
            } else {
                g80Var.e = true;
                g80Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u90 u90Var = this.c;
        if (u90Var != null) {
            u90Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u90 u90Var = this.c;
        if (u90Var != null) {
            u90Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((qn4) getEmojiTextViewHelper().b.b).A(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a80 a80Var = this.b;
        if (a80Var != null) {
            a80Var.E(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a80 a80Var = this.b;
        if (a80Var != null) {
            a80Var.F(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g80 g80Var = this.a;
        if (g80Var != null) {
            g80Var.a = colorStateList;
            g80Var.c = true;
            g80Var.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g80 g80Var = this.a;
        if (g80Var != null) {
            g80Var.b = mode;
            g80Var.d = true;
            g80Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        u90 u90Var = this.c;
        u90Var.l(colorStateList);
        u90Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        u90 u90Var = this.c;
        u90Var.m(mode);
        u90Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(x57.T(getContext(), i));
    }
}

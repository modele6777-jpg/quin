package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f80 extends CheckedTextView {
    public final g80 a;
    public final a80 b;
    public final u90 c;
    public v80 d;

    public f80(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        yve.a(this, getContext());
        u90 u90Var = new u90(this);
        this.c = u90Var;
        u90Var.g(attributeSet, R.attr.checkedTextViewStyle);
        u90Var.b();
        a80 a80Var = new a80(this);
        this.b = a80Var;
        a80Var.s(attributeSet, R.attr.checkedTextViewStyle);
        this.a = new g80(this);
        Context context2 = getContext();
        int[] iArr = hbb.l;
        psd psdVarX = psd.x(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) psdVarX.c;
        nvf.i(this, getContext(), iArr, attributeSet, (TypedArray) psdVarX.c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(x57.T(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(x57.T(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(x57.T(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(psdVarX.o(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(do4.b(typedArray.getInt(3, -1), null));
            }
            psdVarX.z();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            psdVarX.z();
            throw th;
        }
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        u90 u90Var = this.c;
        if (u90Var != null) {
            u90Var.b();
        }
        a80 a80Var = this.b;
        if (a80Var != null) {
            a80Var.c();
        }
        g80 g80Var = this.a;
        if (g80Var != null) {
            g80Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof yue ? ((yue) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
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

    public ColorStateList getSupportCheckMarkTintList() {
        g80 g80Var = this.a;
        if (g80Var != null) {
            return g80Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        dj6.U(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        g80 g80Var = this.a;
        if (g80Var != null) {
            if (g80Var.e) {
                g80Var.e = false;
            } else {
                g80Var.e = true;
                g80Var.b();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(m7c.v(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        g80 g80Var = this.a;
        if (g80Var != null) {
            g80Var.a = colorStateList;
            g80Var.c = true;
            g80Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        g80 g80Var = this.a;
        if (g80Var != null) {
            g80Var.b = mode;
            g80Var.d = true;
            g80Var.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        u90 u90Var = this.c;
        if (u90Var != null) {
            u90Var.h(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(x57.T(getContext(), i));
    }
}

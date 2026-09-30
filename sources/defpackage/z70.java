package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class z70 extends AutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};
    public final a80 a;
    public final u90 b;
    public final k47 c;

    public z70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ai.askquin.R.attr.autoCompleteTextViewStyle);
        yve.a(this, getContext());
        psd psdVarX = psd.x(getContext(), attributeSet, d, ai.askquin.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) psdVarX.c).hasValue(0)) {
            setDropDownBackgroundDrawable(psdVarX.p(0));
        }
        psdVarX.z();
        a80 a80Var = new a80(this);
        this.a = a80Var;
        a80Var.s(attributeSet, ai.askquin.R.attr.autoCompleteTextViewStyle);
        u90 u90Var = new u90(this);
        this.b = u90Var;
        u90Var.g(attributeSet, ai.askquin.R.attr.autoCompleteTextViewStyle);
        u90Var.b();
        k47 k47Var = new k47((EditText) this);
        this.c = k47Var;
        k47Var.F(attributeSet, ai.askquin.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerD = k47Var.D(keyListener);
        if (keyListenerD == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerD);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a80 a80Var = this.a;
        if (a80Var != null) {
            a80Var.c();
        }
        u90 u90Var = this.b;
        if (u90Var != null) {
            u90Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof yue ? ((yue) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        a80 a80Var = this.a;
        if (a80Var != null) {
            return a80Var.q();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a80 a80Var = this.a;
        if (a80Var != null) {
            return a80Var.r();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.e();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.f();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        dj6.U(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.c.G(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a80 a80Var = this.a;
        if (a80Var != null) {
            a80Var.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        a80 a80Var = this.a;
        if (a80Var != null) {
            a80Var.v(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u90 u90Var = this.b;
        if (u90Var != null) {
            u90Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u90 u90Var = this.b;
        if (u90Var != null) {
            u90Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(m7c.v(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(x57.T(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.J(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.D(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a80 a80Var = this.a;
        if (a80Var != null) {
            a80Var.E(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a80 a80Var = this.a;
        if (a80Var != null) {
            a80Var.F(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        u90 u90Var = this.b;
        u90Var.l(colorStateList);
        u90Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        u90 u90Var = this.b;
        u90Var.m(mode);
        u90Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        u90 u90Var = this.b;
        if (u90Var != null) {
            u90Var.h(context, i);
        }
    }
}

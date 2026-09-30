package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c80 extends Button {
    public final a80 a;
    public final u90 b;
    public v80 c;
    public t90 d;

    public c80(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        yve.a(this, getContext());
        a80 a80Var = new a80(this);
        this.a = a80Var;
        a80Var.s(attributeSet, R.attr.buttonStyle);
        u90 u90Var = new u90(this);
        this.b = u90Var;
        u90Var.g(attributeSet, R.attr.buttonStyle);
        u90Var.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private v80 getEmojiTextViewHelper() {
        v80 v80Var = this.c;
        if (v80Var != null) {
            return v80Var;
        }
        v80 v80Var2 = new v80(this);
        this.c = v80Var2;
        return v80Var2;
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
    public int getAutoSizeMaxTextSize() {
        if (zwf.c) {
            return super.getAutoSizeMaxTextSize();
        }
        u90 u90Var = this.b;
        if (u90Var != null) {
            return Math.round(u90Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (zwf.c) {
            return super.getAutoSizeMinTextSize();
        }
        u90 u90Var = this.b;
        if (u90Var != null) {
            return Math.round(u90Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (zwf.c) {
            return super.getAutoSizeStepGranularity();
        }
        u90 u90Var = this.b;
        if (u90Var != null) {
            return Math.round(u90Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (zwf.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        u90 u90Var = this.b;
        return u90Var != null ? u90Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (zwf.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        u90 u90Var = this.b;
        if (u90Var != null) {
            return u90Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof yue ? ((yue) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public t90 getFontVariationSettingsManager() {
        t90 t90Var = this.d;
        if (t90Var != null) {
            return t90Var;
        }
        t90 t90Var2 = new t90(this, new b80(0, this));
        this.d = t90Var2;
        return t90Var2;
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

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return getFontVariationSettingsManager().c;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        u90 u90Var = this.b;
        if (u90Var == null || zwf.c) {
            return;
        }
        u90Var.i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        u90 u90Var = this.b;
        if (u90Var != null) {
            ba0 ba0Var = u90Var.i;
            if (zwf.c || !ba0Var.f()) {
                return;
            }
            ba0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (zwf.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        u90 u90Var = this.b;
        if (u90Var != null) {
            u90Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (zwf.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        u90 u90Var = this.b;
        if (u90Var != null) {
            u90Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (zwf.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        u90 u90Var = this.b;
        if (u90Var != null) {
            u90Var.k(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(m7c.v(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((qn4) getEmojiTextViewHelper().b.b).A(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    public void setSupportAllCaps(boolean z) {
        u90 u90Var = this.b;
        if (u90Var != null) {
            u90Var.a.setAllCaps(z);
        }
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

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = zwf.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        u90 u90Var = this.b;
        if (u90Var != null) {
            ba0 ba0Var = u90Var.i;
            if (z || ba0Var.f()) {
                return;
            }
            ba0Var.g(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        t90 fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.c = typeface;
        fontVariationSettingsManager.d = typeface;
        fontVariationSettingsManager.b.accept(typeface);
    }
}

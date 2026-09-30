package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.hbb;
import defpackage.ns8;
import defpackage.pr8;
import defpackage.qr8;
import defpackage.tc;
import defpackage.uc;
import defpackage.vr8;
import defpackage.y90;
import defpackage.zc;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends y90 implements ns8, View.OnClickListener, zc {
    public tc E0;
    public uc F0;
    public boolean G0;
    public boolean H0;
    public final int I0;
    public int J0;
    public final int K0;
    public vr8 w;
    public CharSequence x;
    public Drawable y;
    public pr8 z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.G0 = h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hbb.c, 0, 0);
        this.I0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.K0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.J0 = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.ns8
    public final void a(vr8 vr8Var) {
        this.w = vr8Var;
        setIcon(vr8Var.getIcon());
        setTitle(vr8Var.getTitleCondensed());
        setId(vr8Var.a);
        setVisibility(vr8Var.isVisible() ? 0 : 8);
        setEnabled(vr8Var.isEnabled());
        if (vr8Var.hasSubMenu() && this.E0 == null) {
            this.E0 = new tc(this);
        }
    }

    @Override // defpackage.zc
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.zc
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.w.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.ns8
    public vr8 getItemData() {
        return this.w;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void i() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.x);
        if (this.y != null && ((this.w.y & 4) != 4 || (!this.G0 && !this.H0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.x : null);
        CharSequence charSequence = this.w.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.w.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.w.r;
        if (TextUtils.isEmpty(charSequence2)) {
            setTooltipText(z3 ? null : this.w.e);
        } else {
            setTooltipText(charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pr8 pr8Var = this.z;
        if (pr8Var != null) {
            pr8Var.a(this.w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G0 = h();
        i();
    }

    @Override // defpackage.y90, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.J0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.I0;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.y == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.y.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tc tcVar;
        if (this.w.hasSubMenu() && (tcVar = this.E0) != null && tcVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.H0 != z) {
            this.H0 = z;
            vr8 vr8Var = this.w;
            if (vr8Var != null) {
                qr8 qr8Var = vr8Var.n;
                qr8Var.k = true;
                qr8Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.y = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.K0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(pr8 pr8Var) {
        this.z = pr8Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.J0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(uc ucVar) {
        this.F0 = ucVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.x = charSequence;
        i();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}

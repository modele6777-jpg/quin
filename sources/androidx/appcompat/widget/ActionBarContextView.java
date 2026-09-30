package androidx.appcompat.widget;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.cd;
import defpackage.hbb;
import defpackage.nc;
import defpackage.nvf;
import defpackage.os8;
import defpackage.qc0;
import defpackage.qr8;
import defpackage.swf;
import defpackage.v71;
import defpackage.vc;
import defpackage.x57;
import defpackage.yc;
import defpackage.zwf;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public View E0;
    public LinearLayout F0;
    public TextView G0;
    public TextView H0;
    public final int I0;
    public final int J0;
    public boolean K0;
    public final int L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public final v71 a;
    public final Context b;
    public ActionMenuView c;
    public yc d;
    public int e;
    public swf f;
    public boolean g;
    public boolean v;
    public CharSequence w;
    public CharSequence x;
    public View y;
    public View z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        v71 v71Var = new v71();
        v71Var.c = this;
        v71Var.a = false;
        this.a = v71Var;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hbb.d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : x57.T(context, resourceId));
        this.I0 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.J0 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.L0 = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
        this.P0 = getPaddingLeft();
        this.Q0 = getPaddingTop();
        this.R0 = getPaddingRight();
        this.S0 = getPaddingBottom();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int h(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(cd cdVar) {
        View view = this.y;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.L0, (ViewGroup) this, false);
            this.y = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.y);
        }
        View viewFindViewById = this.y.findViewById(R.id.action_mode_close_button);
        this.z = viewFindViewById;
        viewFindViewById.setOnClickListener(new nc(i, cdVar));
        qr8 qr8VarF = cdVar.f();
        yc ycVar = this.d;
        if (ycVar != null) {
            ycVar.f();
            vc vcVar = ycVar.I0;
            if (vcVar != null && vcVar.b()) {
                vcVar.i.dismiss();
            }
        }
        yc ycVar2 = new yc(getContext());
        this.d = ycVar2;
        ycVar2.z = true;
        ycVar2.X = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        qr8VarF.b(this.d, this.b);
        yc ycVar3 = this.d;
        os8 os8Var = ycVar3.v;
        if (os8Var == null) {
            os8 os8Var2 = (os8) ycVar3.d.inflate(ycVar3.f, (ViewGroup) this, false);
            ycVar3.v = os8Var2;
            os8Var2.b(ycVar3.c);
            ycVar3.i();
        }
        os8 os8Var3 = ycVar3.v;
        if (os8Var != os8Var3) {
            ((ActionMenuView) os8Var3).setPresenter(ycVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) os8Var3;
        this.c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void d() {
        if (this.F0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.F0 = linearLayout;
            this.G0 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.H0 = (TextView) this.F0.findViewById(R.id.action_bar_subtitle);
            int i = this.I0;
            if (i != 0) {
                this.G0.setTextAppearance(getContext(), i);
            }
            int i2 = this.J0;
            if (i2 != 0) {
                this.H0.setTextAppearance(getContext(), i2);
            }
        }
        this.G0.setText(this.w);
        this.H0.setText(this.x);
        boolean zIsEmpty = TextUtils.isEmpty(this.w);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.x);
        this.H0.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.F0.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.F0.getParent() == null) {
            addView(this.F0);
        }
    }

    public final void e() {
        removeAllViews();
        this.E0 = null;
        this.c = null;
        this.d = null;
        View view = this.z;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void g(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, hbb.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        yc ycVar = this.d;
        if (ycVar != null) {
            Configuration configuration2 = ycVar.b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            ycVar.E0 = i;
            qr8 qr8Var = ycVar.c;
            if (qr8Var != null) {
                qr8Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.a.b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.x;
    }

    public CharSequence getTitle() {
        return this.w;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            swf swfVar = this.f;
            if (swfVar != null) {
                swfVar.b();
            }
            super.setVisibility(i);
        }
    }

    public final swf j(int i, long j) {
        swf swfVar = this.f;
        if (swfVar != null) {
            swfVar.b();
        }
        v71 v71Var = this.a;
        if (i != 0) {
            swf swfVarA = nvf.a(this);
            swfVarA.a(0.0f);
            swfVarA.c(j);
            ((ActionBarContextView) v71Var.c).f = swfVarA;
            v71Var.b = i;
            swfVarA.d(v71Var);
            return swfVarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        swf swfVarA2 = nvf.a(this);
        swfVarA2.a(1.0f);
        swfVarA2.c(j);
        ((ActionBarContextView) v71Var.c).f = swfVarA2;
        v71Var.b = i;
        swfVarA2.d(v71Var);
        return swfVarA2;
    }

    public final void k() {
        super.setPadding(this.M0 + this.P0, this.N0 + this.Q0, this.O0 + this.R0, this.S0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        g(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, hbb.d, R.attr.actionModeStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yc ycVar = this.d;
        if (ycVar != null) {
            ycVar.f();
            vc vcVar = this.d.I0;
            if (vcVar == null || !vcVar.b()) {
                return;
            }
            vcVar.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.v = false;
        }
        if (!this.v) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.v = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.v = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = zwf.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.y;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.y.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iH = h(this.y, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iH - i6 : iH + i6;
        }
        LinearLayout linearLayout = this.F0;
        if (linearLayout != null && this.E0 == null && linearLayout.getVisibility() != 8) {
            paddingRight += h(this.F0, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.E0;
        if (view2 != null) {
            h(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            h(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            qc0.p(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            qc0.p(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.e;
        int size2 = i3 > 0 ? i3 + this.N0 : View.MeasureSpec.getSize(i2);
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.y;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.y.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.F0;
        if (linearLayout != null && this.E0 == null) {
            if (this.K0) {
                this.F0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.F0.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.F0.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.E0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.E0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.g = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.E0;
        if (view2 != null) {
            removeView(view2);
        }
        this.E0 = view;
        if (view != null && (linearLayout = this.F0) != null) {
            removeView(linearLayout);
            this.F0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.P0 = i;
        this.Q0 = i2;
        this.R0 = i3;
        this.S0 = i4;
        k();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getLayoutDirection() != 1) {
            this.P0 = i;
            this.R0 = i3;
        } else {
            this.P0 = i3;
            this.R0 = i;
        }
        this.Q0 = i2;
        this.S0 = i4;
        k();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.x = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.w = charSequence;
        d();
        nvf.k(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.K0) {
            requestLayout();
        }
        this.K0 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}

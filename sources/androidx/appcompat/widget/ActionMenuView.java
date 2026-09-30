package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.ad;
import defpackage.bd;
import defpackage.c68;
import defpackage.d68;
import defpackage.fnb;
import defpackage.gec;
import defpackage.mjg;
import defpackage.os8;
import defpackage.pr8;
import defpackage.qr8;
import defpackage.vc;
import defpackage.vr8;
import defpackage.xc;
import defpackage.yc;
import defpackage.zc;
import defpackage.zwf;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends d68 implements pr8, os8 {
    public qr8 H0;
    public Context I0;
    public int J0;
    public boolean K0;
    public yc L0;
    public fnb M0;
    public boolean N0;
    public int O0;
    public final int P0;
    public final int Q0;
    public bd R0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.P0 = (int) (56.0f * f);
        this.Q0 = (int) (f * 4.0f);
        this.I0 = context;
        this.J0 = 0;
    }

    public static ad i() {
        ad adVar = new ad(-2, -2);
        adVar.a = false;
        ((LinearLayout.LayoutParams) adVar).gravity = 16;
        return adVar;
    }

    public static ad j(ViewGroup.LayoutParams layoutParams) {
        ad adVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof ad) {
            ad adVar2 = (ad) layoutParams;
            adVar = new ad(adVar2);
            adVar.a = adVar2.a;
        } else {
            adVar = new ad(layoutParams);
        }
        if (((LinearLayout.LayoutParams) adVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) adVar).gravity = 16;
        }
        return adVar;
    }

    @Override // defpackage.pr8
    public final boolean a(vr8 vr8Var) {
        return this.H0.q(vr8Var, null, 0);
    }

    @Override // defpackage.os8
    public final void b(qr8 qr8Var) {
        this.H0 = qr8Var;
    }

    @Override // defpackage.d68, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ad;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.d68
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ c68 generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.d68
    /* JADX INFO: renamed from: f */
    public final c68 generateLayoutParams(AttributeSet attributeSet) {
        return new ad(getContext(), attributeSet);
    }

    @Override // defpackage.d68
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ c68 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // defpackage.d68, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.d68, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ad(getContext(), attributeSet);
    }

    public Menu getMenu() {
        qr8 qr8Var = this.H0;
        if (qr8Var != null) {
            return qr8Var;
        }
        Context context = getContext();
        qr8 qr8Var2 = new qr8(context);
        this.H0 = qr8Var2;
        qr8Var2.e = new mjg(this);
        yc ycVar = new yc(context);
        this.L0 = ycVar;
        ycVar.z = true;
        ycVar.X = true;
        ycVar.e = new gec(9);
        this.H0.b(ycVar, this.I0);
        yc ycVar2 = this.L0;
        ycVar2.v = this;
        qr8 qr8Var3 = ycVar2.c;
        this.H0 = qr8Var3;
        return qr8Var3;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        yc ycVar = this.L0;
        xc xcVar = ycVar.w;
        if (xcVar != null) {
            return xcVar.getDrawable();
        }
        if (ycVar.y) {
            return ycVar.x;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.J0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof zc)) {
            zB = ((zc) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof zc)) ? zB : ((zc) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        yc ycVar = this.L0;
        if (ycVar != null) {
            ycVar.i();
            if (this.L0.j()) {
                this.L0.f();
                this.L0.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yc ycVar = this.L0;
        if (ycVar != null) {
            ycVar.f();
            vc vcVar = ycVar.I0;
            if (vcVar == null || !vcVar.b()) {
                return;
            }
            vcVar.i.dismiss();
        }
    }

    @Override // defpackage.d68, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.N0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = zwf.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ad adVar = (ad) childAt.getLayoutParams();
                if (adVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) adVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) adVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) adVar).leftMargin) + ((LinearLayout.LayoutParams) adVar).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                ad adVar2 = (ad) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !adVar2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) adVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) adVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            ad adVar3 = (ad) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !adVar3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) adVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) adVar3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.d68, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        qr8 qr8Var;
        boolean z = this.N0;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.N0 = z2;
        if (z != z2) {
            this.O0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.N0 && (qr8Var = this.H0) != null && size != this.O0) {
            this.O0 = size;
            qr8Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.N0 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                ad adVar = (ad) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) adVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) adVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.P0;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.Q0;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                ad adVar2 = (ad) childAt.getLayoutParams();
                adVar2.f = false;
                adVar2.c = 0;
                adVar2.b = 0;
                adVar2.d = false;
                ((LinearLayout.LayoutParams) adVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) adVar2).rightMargin = 0;
                adVar2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = adVar2.a ? 1 : i10;
                ad adVar3 = (ad) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                adVar3.d = !adVar3.a && z6;
                adVar3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (adVar2.d) {
                    i15++;
                }
                if (adVar2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                ad adVar4 = (ad) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (adVar4.d) {
                    int i28 = adVar4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                ad adVar5 = (ad) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && adVar5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    adVar5.b += r11;
                    adVar5.f = r11;
                    i23--;
                } else if (adVar5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((ad) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((ad) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    ad adVar6 = (ad) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        adVar6.c = i32;
                        adVar6.f = true;
                        if (i33 == 0 && !adVar6.e) {
                            ((LinearLayout.LayoutParams) adVar6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (adVar6.a) {
                        adVar6.c = i32;
                        adVar6.f = true;
                        ((LinearLayout.LayoutParams) adVar6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) adVar6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) adVar6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                ad adVar7 = (ad) childAt4.getLayoutParams();
                if (adVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((adVar7.b * i22) + adVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.L0.F0 = z;
    }

    public void setOnMenuItemClickListener(bd bdVar) {
        this.R0 = bdVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        yc ycVar = this.L0;
        xc xcVar = ycVar.w;
        if (xcVar != null) {
            xcVar.setImageDrawable(drawable);
        } else {
            ycVar.y = true;
            ycVar.x = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.K0 = z;
    }

    public void setPopupTheme(int i) {
        if (this.J0 != i) {
            this.J0 = i;
            if (i == 0) {
                this.I0 = getContext();
            } else {
                this.I0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(yc ycVar) {
        this.L0 = ycVar;
        ycVar.v = this;
        this.H0 = ycVar.c;
    }

    @Override // defpackage.d68, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}

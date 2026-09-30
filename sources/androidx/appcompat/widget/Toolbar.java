package androidx.appcompat.widget;

import ai.askquin.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import defpackage.c9e;
import defpackage.fnb;
import defpackage.gg7;
import defpackage.hbb;
import defpackage.nc;
import defpackage.nvf;
import defpackage.nze;
import defpackage.oze;
import defpackage.psd;
import defpackage.pze;
import defpackage.q6;
import defpackage.qr8;
import defpackage.qze;
import defpackage.r60;
import defpackage.rze;
import defpackage.sx5;
import defpackage.uze;
import defpackage.vr8;
import defpackage.w80;
import defpackage.wwg;
import defpackage.wze;
import defpackage.x57;
import defpackage.x7c;
import defpackage.x80;
import defpackage.xm3;
import defpackage.y90;
import defpackage.yc;
import defpackage.yea;
import defpackage.zwf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int E0;
    public final int F0;
    public final int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public x7c L0;
    public int M0;
    public int N0;
    public final int O0;
    public CharSequence P0;
    public CharSequence Q0;
    public ColorStateList R0;
    public ColorStateList S0;
    public boolean T0;
    public boolean U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final int[] X0;
    public final gg7 Y0;
    public ArrayList Z0;
    public ActionMenuView a;
    public final yea a1;
    public y90 b;
    public wze b1;
    public y90 c;
    public yc c1;
    public w80 d;
    public oze d1;
    public x80 e;
    public boolean e1;
    public final Drawable f;
    public r60 f1;
    public final CharSequence g;
    public OnBackInvokedDispatcher g1;
    public boolean h1;
    public final wwg i1;
    public w80 v;
    public View w;
    public Context x;
    public int y;
    public int z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.O0 = 8388627;
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new int[2];
        this.Y0 = new gg7(new nze(this, 1));
        this.Z0 = new ArrayList();
        this.a1 = new yea(this);
        this.i1 = new wwg(28, this);
        Context context2 = getContext();
        int[] iArr = hbb.w;
        psd psdVarX = psd.x(context2, attributeSet, iArr, R.attr.toolbarStyle);
        nvf.i(this, context, iArr, attributeSet, (TypedArray) psdVarX.c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) psdVarX.c;
        this.z = typedArray.getResourceId(28, 0);
        this.E0 = typedArray.getResourceId(19, 0);
        this.O0 = typedArray.getInteger(0, 8388627);
        this.F0 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.K0 = dimensionPixelOffset;
        this.J0 = dimensionPixelOffset;
        this.I0 = dimensionPixelOffset;
        this.H0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.H0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.I0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.J0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.K0 = dimensionPixelOffset5;
        }
        this.G0 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        x7c x7cVar = this.L0;
        x7cVar.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            x7cVar.e = dimensionPixelSize;
            x7cVar.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            x7cVar.f = dimensionPixelSize2;
            x7cVar.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            x7cVar.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.M0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.N0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f = psdVarX.p(4);
        this.g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.x = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableP = psdVarX.p(16);
        if (drawableP != null) {
            setNavigationIcon(drawableP);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableP2 = psdVarX.p(11);
        if (drawableP2 != null) {
            setLogo(drawableP2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(psdVarX.o(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(psdVarX.o(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        psdVarX.z();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new c9e(getContext());
    }

    public static pze h() {
        pze pzeVar = new pze(-2, -2);
        pzeVar.b = 0;
        pzeVar.a = 8388627;
        return pzeVar;
    }

    public static pze i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof pze;
        if (z) {
            pze pzeVar = (pze) layoutParams;
            pze pzeVar2 = new pze(pzeVar);
            pzeVar2.b = 0;
            pzeVar2.b = pzeVar.b;
            return pzeVar2;
        }
        if (z) {
            pze pzeVar3 = new pze((pze) layoutParams);
            pzeVar3.b = 0;
            return pzeVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            pze pzeVar4 = new pze(layoutParams);
            pzeVar4.b = 0;
            return pzeVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        pze pzeVar5 = new pze(marginLayoutParams);
        pzeVar5.b = 0;
        ((ViewGroup.MarginLayoutParams) pzeVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) pzeVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) pzeVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) pzeVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return pzeVar5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                pze pzeVar = (pze) childAt.getLayoutParams();
                if (pzeVar.b == 0 && s(childAt)) {
                    int i3 = pzeVar.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            pze pzeVar2 = (pze) childAt2.getLayoutParams();
            if (pzeVar2.b == 0 && s(childAt2)) {
                int i5 = pzeVar2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        pze pzeVarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            pzeVarI = h();
        } else {
            pzeVarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (pze) layoutParams;
        }
        pzeVarI.b = 1;
        if (!z || this.w == null) {
            addView(view, pzeVarI);
        } else {
            view.setLayoutParams(pzeVarI);
            this.W0.add(view);
        }
    }

    public final void c() {
        if (this.v == null) {
            w80 w80Var = new w80(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.v = w80Var;
            w80Var.setImageDrawable(this.f);
            this.v.setContentDescription(this.g);
            pze pzeVarH = h();
            pzeVarH.a = (this.F0 & 112) | 8388611;
            pzeVarH.b = 2;
            this.v.setLayoutParams(pzeVarH);
            this.v.setOnClickListener(new nc(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof pze);
    }

    public final void d() {
        if (this.L0 == null) {
            x7c x7cVar = new x7c();
            x7cVar.a = 0;
            x7cVar.b = 0;
            x7cVar.c = Integer.MIN_VALUE;
            x7cVar.d = Integer.MIN_VALUE;
            x7cVar.e = 0;
            x7cVar.f = 0;
            x7cVar.g = false;
            x7cVar.h = false;
            this.L0 = x7cVar;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.H0 == null) {
            qr8 qr8Var = (qr8) actionMenuView.getMenu();
            if (this.d1 == null) {
                this.d1 = new oze(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            qr8Var.b(this.d1, this.x);
            t();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.y);
            this.a.setOnMenuItemClickListener(this.a1);
            ActionMenuView actionMenuView2 = this.a;
            fnb fnbVar = new fnb(this);
            actionMenuView2.getClass();
            actionMenuView2.M0 = fnbVar;
            pze pzeVarH = h();
            pzeVarH.a = (this.F0 & 112) | 8388613;
            this.a.setLayoutParams(pzeVarH);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new w80(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            pze pzeVarH = h();
            pzeVarH.a = (this.F0 & 112) | 8388611;
            this.d.setLayoutParams(pzeVarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        pze pzeVar = new pze(context, attributeSet);
        pzeVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hbb.b);
        pzeVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        pzeVar.b = 0;
        return pzeVar;
    }

    public CharSequence getCollapseContentDescription() {
        w80 w80Var = this.v;
        if (w80Var != null) {
            return w80Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        w80 w80Var = this.v;
        if (w80Var != null) {
            return w80Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        x7c x7cVar = this.L0;
        if (x7cVar != null) {
            return x7cVar.g ? x7cVar.a : x7cVar.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.N0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        x7c x7cVar = this.L0;
        if (x7cVar != null) {
            return x7cVar.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        x7c x7cVar = this.L0;
        if (x7cVar != null) {
            return x7cVar.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        x7c x7cVar = this.L0;
        if (x7cVar != null) {
            return x7cVar.g ? x7cVar.b : x7cVar.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.M0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        qr8 qr8Var;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (qr8Var = actionMenuView.H0) == null || !qr8Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.N0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.M0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        x80 x80Var = this.e;
        if (x80Var != null) {
            return x80Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        x80 x80Var = this.e;
        if (x80Var != null) {
            return x80Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        w80 w80Var = this.d;
        if (w80Var != null) {
            return w80Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        w80 w80Var = this.d;
        if (w80Var != null) {
            return w80Var.getDrawable();
        }
        return null;
    }

    public yc getOuterActionMenuPresenter() {
        return this.c1;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.x;
    }

    public int getPopupTheme() {
        return this.y;
    }

    public CharSequence getSubtitle() {
        return this.Q0;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.P0;
    }

    public int getTitleMarginBottom() {
        return this.K0;
    }

    public int getTitleMarginEnd() {
        return this.I0;
    }

    public int getTitleMarginStart() {
        return this.H0;
    }

    public int getTitleMarginTop() {
        return this.J0;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public xm3 getWrapper() {
        Drawable drawable;
        wze wzeVar = this.b1;
        if (wzeVar == null) {
            wzeVar = new wze();
            wzeVar.n = 0;
            wzeVar.a = this;
            wzeVar.h = getTitle();
            wzeVar.i = getSubtitle();
            wzeVar.g = wzeVar.h != null;
            wzeVar.f = getNavigationIcon();
            psd psdVarX = psd.x(getContext(), null, hbb.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) psdVarX.c;
            wzeVar.o = psdVarX.p(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                wzeVar.g = true;
                wzeVar.h = text;
                if ((wzeVar.b & 8) != 0) {
                    setTitle(text);
                    if (wzeVar.g) {
                        nvf.k(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                wzeVar.i = text2;
                if ((wzeVar.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableP = psdVarX.p(20);
            if (drawableP != null) {
                wzeVar.e = drawableP;
                wzeVar.c();
            }
            Drawable drawableP2 = psdVarX.p(17);
            if (drawableP2 != null) {
                wzeVar.d = drawableP2;
                wzeVar.c();
            }
            if (wzeVar.f == null && (drawable = wzeVar.o) != null) {
                wzeVar.f = drawable;
                if ((wzeVar.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            wzeVar.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = wzeVar.c;
                if (view != null && (wzeVar.b & 16) != 0) {
                    removeView(view);
                }
                wzeVar.c = viewInflate;
                if (viewInflate != null && (wzeVar.b & 16) != 0) {
                    addView(viewInflate);
                }
                wzeVar.a(wzeVar.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.L0.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.z = resourceId2;
                y90 y90Var = this.b;
                if (y90Var != null) {
                    y90Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.E0 = resourceId3;
                y90 y90Var2 = this.c;
                if (y90Var2 != null) {
                    y90Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            psdVarX.z();
            if (R.string.abc_action_bar_up_description != wzeVar.n) {
                wzeVar.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = wzeVar.n;
                    wzeVar.j = i != 0 ? getContext().getString(i) : null;
                    wzeVar.b();
                }
            }
            wzeVar.j = getNavigationContentDescription();
            setNavigationOnClickListener(new uze(wzeVar));
            this.b1 = wzeVar;
        }
        return wzeVar;
    }

    public final int j(View view, int i) {
        pze pzeVar = (pze) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = pzeVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.O0 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) pzeVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) pzeVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) pzeVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.Z0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.Y0.c).iterator();
        while (it2.hasNext()) {
            ((sx5) it2.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.Z0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.W0.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        pze pzeVar = (pze) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) pzeVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) pzeVar).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.i1);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.U0 = false;
        }
        if (!this.U0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.U0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.U0 = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zS;
        boolean zS2;
        int measuredHeight;
        y90 y90Var;
        y90 y90Var2;
        pze pzeVar;
        pze pzeVar2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iO2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        x80 x80Var;
        View view;
        ActionMenuView actionMenuView;
        w80 w80Var;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.X0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = nvf.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (s(this.d)) {
            w80 w80Var2 = this.d;
            if (z3) {
                iP = p(w80Var2, i26, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(w80Var2, paddingLeft, iMin2, iArr);
            }
            if (s(this.v)) {
                w80Var = this.v;
                if (z3) {
                    iP = p(w80Var, iP, iMin2, iArr);
                } else {
                    iO = o(w80Var, iO, iMin2, iArr);
                }
            }
            if (s(this.a)) {
                actionMenuView = this.a;
                if (z3) {
                    iO = o(actionMenuView, iO, iMin2, iArr);
                } else {
                    iP = p(actionMenuView, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i26 - currentContentInsetRight);
            if (s(this.w)) {
                view = this.w;
                if (z3) {
                    iMin = p(view, iMin, iMin2, iArr);
                } else {
                    iMax = o(view, iMax, iMin2, iArr);
                }
            }
            if (s(this.e)) {
                x80Var = this.e;
                if (z3) {
                    iMin = p(x80Var, iMin, iMin2, iArr);
                } else {
                    iMax = o(x80Var, iMax, iMin2, iArr);
                }
            }
            zS = s(this.b);
            zS2 = s(this.c);
            if (zS) {
                pze pzeVar3 = (pze) this.b.getLayoutParams();
                measuredHeight = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) pzeVar3).topMargin + ((ViewGroup.MarginLayoutParams) pzeVar3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zS2) {
                pze pzeVar4 = (pze) this.c.getLayoutParams();
                measuredHeight = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) pzeVar4).topMargin + ((ViewGroup.MarginLayoutParams) pzeVar4).bottomMargin + measuredHeight;
            }
            if (zS || zS2) {
                if (zS) {
                    y90Var = this.b;
                } else {
                    y90Var = this.c;
                }
                if (zS2) {
                    y90Var2 = this.c;
                } else {
                    y90Var2 = this.b;
                }
                pzeVar = (pze) y90Var.getLayoutParams();
                pzeVar2 = (pze) y90Var2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zS && this.b.getMeasuredWidth() > 0) || (zS2 && this.c.getMeasuredWidth() > 0);
                i6 = this.O0 & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) pzeVar).topMargin + this.J0;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) pzeVar).topMargin + this.J0;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) pzeVar).bottomMargin;
                        i17 = this.K0;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) pzeVar2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) pzeVar2).bottomMargin) - this.K0) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.H0;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zS) {
                        pze pzeVar5 = (pze) this.b.getLayoutParams();
                        int measuredWidth2 = iMin - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.I0;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) pzeVar5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zS2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((pze) this.c.getLayoutParams())).topMargin;
                        this.c.layout(iMin - this.c.getMeasuredWidth(), i28, iMin, this.c.getMeasuredHeight() + i28);
                        i13 = iMin - this.I0;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.H0;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zS) {
                        pze pzeVar6 = (pze) this.b.getLayoutParams();
                        int measuredWidth3 = this.b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.I0;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) pzeVar6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zS2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((pze) this.c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.c.getMeasuredWidth() + iMax;
                        this.c.layout(iMax, i30, measuredWidth4, this.c.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.I0;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.V0;
            a(3, arrayList);
            size = arrayList.size();
            iO2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                pze pzeVar7 = (pze) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) pzeVar7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) pzeVar7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iO2) {
                if (i25 > iMin) {
                    iO2 = i24 - (i25 - iMin);
                } else {
                    iO2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i26;
        if (s(this.v)) {
            w80Var = this.v;
            if (z3) {
                iP = p(w80Var, iP, iMin2, iArr);
            } else {
                iO = o(w80Var, iO, iMin2, iArr);
            }
        }
        if (s(this.a)) {
            actionMenuView = this.a;
            if (z3) {
                iO = o(actionMenuView, iO, iMin2, iArr);
            } else {
                iP = p(actionMenuView, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i26 - currentContentInsetRight2);
        if (s(this.w)) {
            view = this.w;
            if (z3) {
                iMin = p(view, iMin, iMin2, iArr);
            } else {
                iMax = o(view, iMax, iMin2, iArr);
            }
        }
        if (s(this.e)) {
            x80Var = this.e;
            if (z3) {
                iMin = p(x80Var, iMin, iMin2, iArr);
            } else {
                iMax = o(x80Var, iMax, iMin2, iArr);
            }
        }
        zS = s(this.b);
        zS2 = s(this.c);
        if (zS) {
            pze pzeVar8 = (pze) this.b.getLayoutParams();
            measuredHeight = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) pzeVar8).topMargin + ((ViewGroup.MarginLayoutParams) pzeVar8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zS2) {
            pze pzeVar9 = (pze) this.c.getLayoutParams();
            measuredHeight = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) pzeVar9).topMargin + ((ViewGroup.MarginLayoutParams) pzeVar9).bottomMargin + measuredHeight;
        }
        if (zS) {
            if (zS) {
                y90Var = this.b;
            } else {
                y90Var = this.c;
            }
            if (zS2) {
                y90Var2 = this.c;
            } else {
                y90Var2 = this.b;
            }
            pzeVar = (pze) y90Var.getLayoutParams();
            pzeVar2 = (pze) y90Var2.getLayoutParams();
            i5 = measuredHeight;
            if (zS) {
            }
            i6 = this.O0 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) pzeVar).topMargin + this.J0;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) pzeVar).topMargin + this.J0;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) pzeVar).bottomMargin;
                    i17 = this.K0;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) pzeVar2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) pzeVar2).bottomMargin) - this.K0) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.H0;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zS) {
                    pze pzeVar10 = (pze) this.b.getLayoutParams();
                    int measuredWidth5 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.I0;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) pzeVar10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((pze) this.c.getLayoutParams())).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i211, iMin, this.c.getMeasuredHeight() + i211);
                    i13 = iMin - this.I0;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.H0;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zS) {
                    pze pzeVar11 = (pze) this.b.getLayoutParams();
                    int measuredWidth6 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.I0;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) pzeVar11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zS2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((pze) this.c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i35, measuredWidth7, this.c.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.I0;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zS) {
                y90Var = this.b;
            } else {
                y90Var = this.c;
            }
            if (zS2) {
                y90Var2 = this.c;
            } else {
                y90Var2 = this.b;
            }
            pzeVar = (pze) y90Var.getLayoutParams();
            pzeVar2 = (pze) y90Var2.getLayoutParams();
            i5 = measuredHeight;
            if (zS) {
            }
            i6 = this.O0 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) pzeVar).topMargin + this.J0;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) pzeVar).topMargin + this.J0;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) pzeVar).bottomMargin;
                    i17 = this.K0;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) pzeVar2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) pzeVar2).bottomMargin) - this.K0) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.H0;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zS) {
                    pze pzeVar12 = (pze) this.b.getLayoutParams();
                    int measuredWidth8 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight6 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.I0;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) pzeVar12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((pze) this.c.getLayoutParams())).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i214, iMin, this.c.getMeasuredHeight() + i214);
                    i13 = iMin - this.I0;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.H0;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zS) {
                    pze pzeVar13 = (pze) this.b.getLayoutParams();
                    int measuredWidth9 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.I0;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) pzeVar13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zS2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((pze) this.c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i36, measuredWidth10, this.c.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.I0;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.V0;
        a(3, arrayList);
        size = arrayList.size();
        iO2 = iMax;
        while (i18 < size) {
            iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            pze pzeVar14 = (pze) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) pzeVar14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) pzeVar14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iO2) {
            if (i25 > iMin) {
                iO2 = i24 - (i25 - iMin);
            } else {
                iO2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b;
        byte b2;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = zwf.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            b2 = true;
            b = 0;
        } else {
            b = 1;
            b2 = false;
        }
        if (s(this.d)) {
            r(this.d, i, 0, i2, this.G0);
            iK = k(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.v)) {
            r(this.v, i, 0, i2, this.G0);
            iK = k(this.v) + this.v.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.v) + this.v.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.v.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        byte b3 = b2;
        int[] iArr = this.X0;
        iArr[b3 == true ? 1 : 0] = iMax4;
        if (s(this.a)) {
            r(this.a, i, iMax3, i2, this.G0);
            iK2 = k(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[b] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.w)) {
            iMax5 += q(this.w, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.w) + this.w.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.w.getMeasuredState());
        }
        if (s(this.e)) {
            iMax5 += q(this.e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((pze) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                iMax5 += q(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.J0 + this.K0;
        int i7 = this.H0 + this.I0;
        if (s(this.b)) {
            q(this.b, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.b) + this.b.getMeasuredWidth();
            iL = l(this.b) + this.b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.c)) {
            iMax2 = Math.max(iMax2, q(this.c, i, i5 + i7, i2, iL + i6, iArr));
            iL += l(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        if (s(this.b) || s(this.c)) {
            iL += i6;
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.e1) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof rze)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        rze rzeVar = (rze) parcelable;
        super.onRestoreInstanceState(rzeVar.a);
        ActionMenuView actionMenuView = this.a;
        qr8 qr8Var = actionMenuView != null ? actionMenuView.H0 : null;
        int i = rzeVar.c;
        if (i != 0 && this.d1 != null && qr8Var != null && (menuItemFindItem = qr8Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (rzeVar.d) {
            wwg wwgVar = this.i1;
            removeCallbacks(wwgVar);
            post(wwgVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        x7c x7cVar = this.L0;
        boolean z = i == 1;
        if (z == x7cVar.g) {
            return;
        }
        x7cVar.g = z;
        if (!x7cVar.h) {
            x7cVar.a = x7cVar.e;
            x7cVar.b = x7cVar.f;
            return;
        }
        if (z) {
            int i2 = x7cVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = x7cVar.e;
            }
            x7cVar.a = i2;
            int i3 = x7cVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = x7cVar.f;
            }
            x7cVar.b = i3;
            return;
        }
        int i4 = x7cVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = x7cVar.e;
        }
        x7cVar.a = i4;
        int i5 = x7cVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = x7cVar.f;
        }
        x7cVar.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        yc ycVar;
        vr8 vr8Var;
        rze rzeVar = new rze(super.onSaveInstanceState());
        oze ozeVar = this.d1;
        if (ozeVar != null && (vr8Var = ozeVar.b) != null) {
            rzeVar.c = vr8Var.a;
        }
        ActionMenuView actionMenuView = this.a;
        rzeVar.d = (actionMenuView == null || (ycVar = actionMenuView.L0) == null || !ycVar.j()) ? false : true;
        return rzeVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.T0 = false;
        }
        if (!this.T0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.T0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.T0 = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        pze pzeVar = (pze) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) pzeVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) pzeVar).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.h1 != z) {
            this.h1 = z;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        w80 w80Var = this.v;
        if (w80Var != null) {
            w80Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.v.setImageDrawable(drawable);
        } else {
            w80 w80Var = this.v;
            if (w80Var != null) {
                w80Var.setImageDrawable(this.f);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.e1 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.N0) {
            this.N0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.M0) {
            this.M0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        x80 x80Var = this.e;
        if (drawable != null) {
            if (x80Var == null) {
                x80Var = new x80(getContext(), null, 0);
                this.e = x80Var;
            }
            if (!n(x80Var)) {
                b(this.e, true);
            }
        } else if (x80Var != null && n(x80Var)) {
            removeView(this.e);
            this.W0.remove(this.e);
        }
        x80 x80Var2 = this.e;
        if (x80Var2 != null) {
            x80Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new x80(getContext(), null, 0);
        }
        x80 x80Var = this.e;
        if (x80Var != null) {
            x80Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        w80 w80Var = this.d;
        if (w80Var != null) {
            w80Var.setContentDescription(charSequence);
            this.d.setTooltipText(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            w80 w80Var = this.d;
            if (w80Var != null && n(w80Var)) {
                removeView(this.d);
                this.W0.remove(this.d);
            }
        }
        w80 w80Var2 = this.d;
        if (w80Var2 != null) {
            w80Var2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.y != i) {
            this.y = i;
            if (i == 0) {
                this.x = getContext();
            } else {
                this.x = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        y90 y90Var = this.c;
        if (!zIsEmpty) {
            if (y90Var == null) {
                Context context = getContext();
                y90 y90Var2 = new y90(context, null);
                this.c = y90Var2;
                y90Var2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.E0;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.S0;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!n(this.c)) {
                b(this.c, true);
            }
        } else if (y90Var != null && n(y90Var)) {
            removeView(this.c);
            this.W0.remove(this.c);
        }
        y90 y90Var3 = this.c;
        if (y90Var3 != null) {
            y90Var3.setText(charSequence);
        }
        this.Q0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.S0 = colorStateList;
        y90 y90Var = this.c;
        if (y90Var != null) {
            y90Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        y90 y90Var = this.b;
        if (!zIsEmpty) {
            if (y90Var == null) {
                Context context = getContext();
                y90 y90Var2 = new y90(context, null);
                this.b = y90Var2;
                y90Var2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.z;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.R0;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!n(this.b)) {
                b(this.b, true);
            }
        } else if (y90Var != null && n(y90Var)) {
            removeView(this.b);
            this.W0.remove(this.b);
        }
        y90 y90Var3 = this.b;
        if (y90Var3 != null) {
            y90Var3.setText(charSequence);
        }
        this.P0 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.K0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.I0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.H0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.J0 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.R0 = colorStateList;
        y90 y90Var = this.b;
        if (y90Var != null) {
            y90Var.setTextColor(colorStateList);
        }
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherE = q6.e(this);
            oze ozeVar = this.d1;
            int i = 0;
            boolean z = (ozeVar == null || ozeVar.b == null || onBackInvokedDispatcherE == null || !isAttachedToWindow() || !this.h1) ? false : true;
            if (!z || this.g1 != null) {
                if (z || (onBackInvokedDispatcher = this.g1) == null) {
                    return;
                }
                q6.Q(onBackInvokedDispatcher, this.f1);
                this.g1 = null;
                return;
            }
            r60 r60Var = this.f1;
            if (r60Var == null) {
                r60 r60Var2 = new r60(3, new nze(this, i));
                this.f1 = r60Var2;
                r60Var = r60Var2;
            }
            q6.P(onBackInvokedDispatcherE, r60Var);
            this.g1 = onBackInvokedDispatcherE;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(x57.T(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setOnMenuItemClickListener(qze qzeVar) {
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(x57.T(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(x57.T(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}

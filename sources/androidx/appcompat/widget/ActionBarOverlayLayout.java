package androidx.appcompat.widget;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import defpackage.bd9;
import defpackage.c7g;
import defpackage.cd9;
import defpackage.e8g;
import defpackage.fvf;
import defpackage.h71;
import defpackage.h8g;
import defpackage.ks8;
import defpackage.nvf;
import defpackage.o7g;
import defpackage.oc;
import defpackage.oze;
import defpackage.p7g;
import defpackage.pc;
import defpackage.q7g;
import defpackage.qc;
import defpackage.qc0;
import defpackage.qr8;
import defpackage.r7g;
import defpackage.rc;
import defpackage.rha;
import defpackage.s7g;
import defpackage.t7g;
import defpackage.twf;
import defpackage.u7g;
import defpackage.v7g;
import defpackage.wze;
import defpackage.x47;
import defpackage.x57;
import defpackage.xm3;
import defpackage.yc;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements bd9, cd9 {
    public static final int[] X0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final h8g Y0;
    public static final Rect Z0;
    public final Rect E0;
    public final Rect F0;
    public final Rect G0;
    public final Rect H0;
    public final Rect I0;
    public boolean J0;
    public boolean K0;
    public h8g L0;
    public h8g M0;
    public h8g N0;
    public h8g O0;
    public pc P0;
    public OverScroller Q0;
    public ViewPropertyAnimator R0;
    public final rha S0;
    public final oc T0;
    public final oc U0;
    public final h71 V0;
    public final rc W0;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public xm3 e;
    public Drawable f;
    public boolean g;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    static {
        v7g p7gVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            p7gVar = new u7g();
        } else if (i >= 35) {
            p7gVar = new t7g();
        } else if (i >= 34) {
            p7gVar = new s7g();
        } else if (i >= 31) {
            p7gVar = new r7g();
        } else if (i >= 30) {
            p7gVar = new q7g();
        } else {
            p7gVar = i >= 29 ? new p7g() : new o7g();
        }
        p7gVar.h(x47.b(0, 1, 0, 1));
        Y0 = p7gVar.b();
        Z0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new Rect();
        this.H0 = new Rect();
        this.I0 = new Rect();
        this.J0 = true;
        this.K0 = false;
        h8g h8gVar = h8g.b;
        this.L0 = h8gVar;
        this.M0 = h8gVar;
        this.N0 = h8gVar;
        this.O0 = h8gVar;
        this.S0 = new rha(6, this);
        this.T0 = new oc(this, 0);
        this.U0 = new oc(this, 1);
        d(context);
        this.V0 = new h71(4, (byte) 0);
        rc rcVar = new rc(context, 0);
        rcVar.setWillNotDraw(true);
        this.W0 = rcVar;
        addView(rcVar);
    }

    public static boolean k(View view, int i, int i2, int i3, int i4) {
        boolean z;
        qc qcVar = (qc) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) qcVar).leftMargin != i) {
            ((ViewGroup.MarginLayoutParams) qcVar).leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (((ViewGroup.MarginLayoutParams) qcVar).topMargin != i2) {
            ((ViewGroup.MarginLayoutParams) qcVar).topMargin = i2;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) qcVar).rightMargin != i3) {
            ((ViewGroup.MarginLayoutParams) qcVar).rightMargin = i3;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) qcVar).bottomMargin == i4) {
            return z;
        }
        ((ViewGroup.MarginLayoutParams) qcVar).bottomMargin = i4;
        return true;
    }

    @Override // defpackage.bd9
    public final void a(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(viewGroup, i, i2, i3, i4);
        }
    }

    public final void b() {
        removeCallbacks(this.T0);
        removeCallbacks(this.U0);
        ViewPropertyAnimator viewPropertyAnimator = this.R0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.cd9
    public final void c(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        a(viewGroup, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qc;
    }

    public final void d(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(X0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.Q0 = new OverScroller(context);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f.setBounds(0, translationY, getWidth(), this.f.getIntrinsicHeight() + translationY);
            this.f.draw(canvas);
        }
    }

    @Override // defpackage.bd9
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.bd9
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new qc(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new qc(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        h71 h71Var = this.V0;
        return h71Var.c | h71Var.b;
    }

    public CharSequence getTitle() {
        j();
        return ((wze) this.e).a.getTitle();
    }

    @Override // defpackage.bd9
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void i(int i) {
        j();
        if (i == 2) {
            ((wze) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((wze) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void j() {
        xm3 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof xm3) {
                wrapper = (xm3) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    qc0.p("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void l(qr8 qr8Var, ks8 ks8Var) {
        j();
        wze wzeVar = (wze) this.e;
        Toolbar toolbar = wzeVar.a;
        yc ycVar = wzeVar.m;
        if (ycVar == null) {
            ycVar = new yc(toolbar.getContext());
            wzeVar.m = ycVar;
        }
        ycVar.e = ks8Var;
        if (qr8Var == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        qr8 qr8Var2 = toolbar.a.H0;
        if (qr8Var2 == qr8Var) {
            return;
        }
        if (qr8Var2 != null) {
            qr8Var2.r(toolbar.c1);
            qr8Var2.r(toolbar.d1);
        }
        if (toolbar.d1 == null) {
            toolbar.d1 = new oze(toolbar);
        }
        ycVar.F0 = true;
        Context context = toolbar.x;
        if (qr8Var != null) {
            qr8Var.b(ycVar, context);
            qr8Var.b(toolbar.d1, toolbar.x);
        } else {
            ycVar.k(context, null);
            toolbar.d1.k(toolbar.x, null);
            ycVar.i();
            toolbar.d1.i();
        }
        toolbar.a.setPopupTheme(toolbar.y);
        toolbar.a.setPresenter(ycVar);
        toolbar.c1 = ycVar;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zK;
        j();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = true;
        boolean z2 = (windowSystemUiVisibility & 256) != 0;
        boolean z3 = (windowSystemUiVisibility & 1536) != 0;
        WeakHashMap weakHashMap = nvf.a;
        rc rcVar = this.W0;
        h8g h8gVar = Y0;
        Rect rect = this.I0;
        fvf.b(rcVar, h8gVar, rect);
        boolean zEquals = rect.equals(Z0);
        this.J0 = !zEquals;
        boolean z4 = zEquals || (z2 && z3);
        this.K0 = z4;
        pc pcVar = this.P0;
        if (pcVar != null) {
            ((c7g) pcVar).o = (z2 || z4) ? false : true;
        }
        h8g h8gVarC = h8g.c(windowInsets, this);
        e8g e8gVar = h8gVarC.a;
        x47 x47VarN = e8gVar.n();
        int i = x47VarN.a;
        int i2 = x47VarN.a;
        int i3 = x47VarN.b;
        int i4 = x47VarN.c;
        this.H0.set(i, i3, i4, x47VarN.d);
        if (this.K0) {
            x47 x47VarI = e8gVar.i(2);
            int i5 = x47VarI.a;
            int i6 = x47VarI.c;
            this.d.setPadding(i2 - i5, i3, i4 - i6, 0);
            zK = k(this.d, x47VarI.a, 0, i6, 0);
        } else {
            this.d.setPadding(0, 0, 0, 0);
            zK = k(this.d, i2, i3, i4, 0);
        }
        Rect rect2 = this.E0;
        fvf.b(this, h8gVarC, rect2);
        h8g h8gVarR = e8gVar.r(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.L0 = h8gVarR;
        if (!this.M0.equals(h8gVarR)) {
            this.M0 = this.L0;
            zK = true;
        }
        Rect rect3 = this.F0;
        if (rect3.equals(rect2)) {
            z = zK;
        } else {
            rect3.set(rect2);
        }
        if (z) {
            requestLayout();
        }
        return e8gVar.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d(getContext());
        WeakHashMap weakHashMap = nvf.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                qc qcVar = (qc) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) qcVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) qcVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        v7g p7gVar;
        j();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        qc qcVar = (qc) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) qcVar).leftMargin + ((ViewGroup.MarginLayoutParams) qcVar).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) qcVar).topMargin + ((ViewGroup.MarginLayoutParams) qcVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = nvf.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.K0) {
                measuredHeight += this.H0.top;
            }
            if (this.v && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.E0;
        Rect rect2 = this.G0;
        rect2.set(rect);
        h8g h8gVar = this.L0;
        this.N0 = h8gVar;
        if (this.g || z || !this.J0) {
            x47 x47VarB = this.K0 ? x47.b(h8gVar.a.n().a, Math.max(this.N0.a.n().b, measuredHeight), this.N0.a.n().c, Math.max(this.N0.a.n().d, 0)) : x47.b(h8gVar.a.n().a, this.N0.a.n().b + measuredHeight, this.N0.a.n().c, this.N0.a.n().d);
            h8g h8gVar2 = this.N0;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                p7gVar = new u7g(h8gVar2);
            } else if (i3 >= 35) {
                p7gVar = new t7g(h8gVar2);
            } else if (i3 >= 34) {
                p7gVar = new s7g(h8gVar2);
            } else if (i3 >= 31) {
                p7gVar = new r7g(h8gVar2);
            } else if (i3 >= 30) {
                p7gVar = new q7g(h8gVar2);
            } else {
                p7gVar = i3 >= 29 ? new p7g(h8gVar2) : new o7g(h8gVar2);
            }
            p7gVar.h(x47VarB);
            this.N0 = p7gVar.b();
        } else {
            boolean z2 = this.K0;
            int i4 = rect2.top;
            if (z2) {
                rect2.top = Math.max(i4, measuredHeight);
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                rect2.top = i4 + measuredHeight;
                rect2.bottom = rect2.bottom;
            }
            this.N0 = this.N0.a.r(0, measuredHeight, 0, 0);
        }
        k(this.c, rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!this.O0.equals(this.N0)) {
            h8g h8gVar3 = this.N0;
            this.O0 = h8gVar3;
            nvf.b(this.c, h8gVar3);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        qc qcVar2 = (qc) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) qcVar2).leftMargin + ((ViewGroup.MarginLayoutParams) qcVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) qcVar2).topMargin + ((ViewGroup.MarginLayoutParams) qcVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.w || !z) {
            return false;
        }
        this.Q0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.Q0.getFinalY() > this.d.getHeight()) {
            b();
            this.U0.run();
        } else {
            b();
            this.T0.run();
        }
        this.x = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.y + i2;
        this.y = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        c7g c7gVar;
        twf twfVar;
        this.V0.b = i;
        this.y = getActionBarHideOffset();
        b();
        pc pcVar = this.P0;
        if (pcVar == null || (twfVar = (c7gVar = (c7g) pcVar).s) == null) {
            return;
        }
        twfVar.a();
        c7gVar.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.w;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.w || this.x) {
            return;
        }
        if (this.y <= this.d.getHeight()) {
            b();
            postDelayed(this.T0, 600L);
        } else {
            b();
            postDelayed(this.U0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
        int i2 = this.z ^ i;
        this.z = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        pc pcVar = this.P0;
        if (pcVar != null) {
            c7g c7gVar = (c7g) pcVar;
            c7gVar.o = (z2 || this.K0) ? false : true;
            if (z || !z2) {
                if (c7gVar.p) {
                    c7gVar.p = false;
                    c7gVar.e(true);
                }
            } else if (!c7gVar.p) {
                c7gVar.p = true;
                c7gVar.e(true);
            }
        }
        if ((i2 & 256) == 0 || this.P0 == null) {
            return;
        }
        WeakHashMap weakHashMap = nvf.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        pc pcVar = this.P0;
        if (pcVar != null) {
            ((c7g) pcVar).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(pc pcVar) {
        this.P0 = pcVar;
        if (getWindowToken() != null) {
            ((c7g) this.P0).n = this.b;
            int i = this.z;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = nvf.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.v = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.w) {
            this.w = z;
            if (z) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        wze wzeVar = (wze) this.e;
        wzeVar.d = i != 0 ? x57.T(wzeVar.a.getContext(), i) : null;
        wzeVar.c();
    }

    public void setLogo(int i) {
        j();
        wze wzeVar = (wze) this.e;
        wzeVar.e = i != 0 ? x57.T(wzeVar.a.getContext(), i) : null;
        wzeVar.c();
    }

    public void setOverlayMode(boolean z) {
        this.g = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((wze) this.e).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        wze wzeVar = (wze) this.e;
        if (wzeVar.g) {
            return;
        }
        Toolbar toolbar = wzeVar.a;
        wzeVar.h = charSequence;
        if ((wzeVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (wzeVar.g) {
                nvf.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new qc(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        wze wzeVar = (wze) this.e;
        wzeVar.d = drawable;
        wzeVar.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.bd9
    public final void e(int i, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }
}

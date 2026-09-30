package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.a82;
import defpackage.ad9;
import defpackage.alb;
import defpackage.an1;
import defpackage.blb;
import defpackage.clb;
import defpackage.cva;
import defpackage.dlb;
import defpackage.elb;
import defpackage.eu4;
import defpackage.fbb;
import defpackage.flb;
import defpackage.g5b;
import defpackage.gg8;
import defpackage.gp3;
import defpackage.h71;
import defpackage.hlb;
import defpackage.hvf;
import defpackage.i12;
import defpackage.kb6;
import defpackage.kd9;
import defpackage.kv2;
import defpackage.lqb;
import defpackage.m6c;
import defpackage.mjg;
import defpackage.nkb;
import defpackage.nr3;
import defpackage.nvf;
import defpackage.od4;
import defpackage.pa5;
import defpackage.pkb;
import defpackage.pvf;
import defpackage.qc0;
import defpackage.qkb;
import defpackage.r46;
import defpackage.rkb;
import defpackage.s8f;
import defpackage.sug;
import defpackage.ta0;
import defpackage.tkb;
import defpackage.ua5;
import defpackage.ukb;
import defpackage.vkb;
import defpackage.wid;
import defpackage.wkb;
import defpackage.wvf;
import defpackage.wwg;
import defpackage.x0f;
import defpackage.xf;
import defpackage.xkb;
import defpackage.yg5;
import defpackage.ykb;
import defpackage.zkb;
import defpackage.zy1;
import io.sentry.android.core.b1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView {
    public static final int[] L1 = {R.attr.nestedScrollingEnabled};
    public static final float M1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean N1 = true;
    public static final boolean O1 = true;
    public static final Class[] P1;
    public static final pa5 Q1;
    public static final clb R1;
    public final int[] A1;
    public ad9 B1;
    public final int[] C1;
    public final int[] D1;
    public tkb E0;
    public final int[] E1;
    public final ArrayList F0;
    public final ArrayList F1;
    public final ArrayList G0;
    public final wwg G1;
    public final ArrayList H0;
    public boolean H1;
    public ua5 I0;
    public int I1;
    public boolean J0;
    public int J1;
    public boolean K0;
    public final mjg K1;
    public boolean L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public int Q0;
    public final AccessibilityManager R0;
    public boolean S0;
    public boolean T0;
    public int U0;
    public int V0;
    public qkb W0;
    public EdgeEffect X0;
    public EdgeEffect Y0;
    public EdgeEffect Z0;
    public final float a;
    public EdgeEffect a1;
    public final eu4 b;
    public rkb b1;
    public final gp3 c;
    public int c1;
    public alb d;
    public int d1;
    public final a82 e;
    public VelocityTracker e1;
    public final ta0 f;
    public int f1;
    public final lqb g;
    public int g1;
    public int h1;
    public int i1;
    public int j1;
    public final int k1;
    public final int l1;
    public final float m1;
    public final float n1;
    public boolean o1;
    public final elb p1;
    public r46 q1;
    public final i12 r1;
    public final blb s1;
    public wkb t1;
    public ArrayList u1;
    public boolean v;
    public boolean v1;
    public final Rect w;
    public boolean w1;
    public final Rect x;
    public final kb6 x1;
    public final RectF y;
    public boolean y1;
    public nkb z;
    public hlb z1;

    static {
        Class cls = Integer.TYPE;
        P1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        Q1 = new pa5(1);
        R1 = new clb();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, ai.askquin.R.attr.recyclerViewStyle);
        this.b = new eu4(22);
        this.c = new gp3(this);
        this.g = new lqb(17);
        this.w = new Rect();
        this.x = new Rect();
        this.y = new RectF();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.M0 = 0;
        this.S0 = false;
        this.T0 = false;
        this.U0 = 0;
        this.V0 = 0;
        this.W0 = R1;
        nr3 nr3Var = new nr3();
        nr3Var.a = null;
        nr3Var.b = new ArrayList();
        nr3Var.c = 120L;
        nr3Var.d = 120L;
        nr3Var.e = 250L;
        nr3Var.f = 250L;
        int i3 = 1;
        nr3Var.g = true;
        nr3Var.h = new ArrayList();
        nr3Var.i = new ArrayList();
        nr3Var.j = new ArrayList();
        nr3Var.k = new ArrayList();
        nr3Var.l = new ArrayList();
        nr3Var.m = new ArrayList();
        nr3Var.n = new ArrayList();
        nr3Var.o = new ArrayList();
        nr3Var.p = new ArrayList();
        nr3Var.q = new ArrayList();
        nr3Var.r = new ArrayList();
        this.b1 = nr3Var;
        this.c1 = 0;
        this.d1 = -1;
        this.m1 = Float.MIN_VALUE;
        this.n1 = Float.MIN_VALUE;
        this.o1 = true;
        this.p1 = new elb(this);
        this.r1 = O1 ? new i12() : null;
        blb blbVar = new blb();
        blbVar.a = 0;
        blbVar.b = 0;
        blbVar.c = 1;
        blbVar.d = 0;
        blbVar.e = false;
        blbVar.f = false;
        blbVar.g = false;
        blbVar.h = false;
        blbVar.i = false;
        blbVar.j = false;
        this.s1 = blbVar;
        this.v1 = false;
        this.w1 = false;
        kb6 kb6Var = new kb6(27, this);
        this.x1 = kb6Var;
        this.y1 = false;
        this.A1 = new int[2];
        this.C1 = new int[2];
        this.D1 = new int[2];
        this.E1 = new int[2];
        this.F1 = new ArrayList();
        this.G1 = new wwg(20, this);
        this.I1 = 0;
        this.J1 = 0;
        this.K1 = new mjg(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.j1 = viewConfiguration.getScaledTouchSlop();
        this.m1 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.n1 = viewConfiguration.getScaledVerticalScrollFactor();
        this.k1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.b1.a = kb6Var;
        this.e = new a82(new m6c(29, this));
        this.f = new ta0(new g5b(i3, this));
        WeakHashMap weakHashMap = nvf.a;
        if (hvf.a(this) == 0) {
            hvf.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.R0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new hlb(this));
        int[] iArr = fbb.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, ai.askquin.R.attr.recyclerViewStyle, 0);
        nvf.i(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, ai.askquin.R.attr.recyclerViewStyle);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.v = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                qc0.j("Trying to set fast scroller without both required drawables.".concat(w()));
                throw null;
            }
            Resources resources = getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(ai.askquin.R.dimen.fastscroll_default_thickness);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(ai.askquin.R.dimen.fastscroll_minimum_range);
            int dimensionPixelOffset = resources.getDimensionPixelOffset(ai.askquin.R.dimen.fastscroll_margin);
            i2 = 4;
            i = ai.askquin.R.attr.recyclerViewStyle;
            new ua5(this, stateListDrawable, drawable, stateListDrawable2, drawable2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelOffset);
        } else {
            i = ai.askquin.R.attr.recyclerViewStyle;
            i2 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(tkb.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(P1);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[2] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((tkb) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    cva.i(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    cva.i(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    cva.i(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    cva.i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    cva.i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = L1;
        int i4 = i;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        nvf.i(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i4);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(ai.askquin.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView B(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewB = B(viewGroup.getChildAt(i));
            if (recyclerViewB != null) {
                return recyclerViewB;
            }
        }
        return null;
    }

    public static flb F(View view) {
        if (view == null) {
            return null;
        }
        return ((ukb) view.getLayoutParams()).a;
    }

    public static void G(View view, Rect rect) {
        ukb ukbVar = (ukb) view.getLayoutParams();
        Rect rect2 = ukbVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) ukbVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) ukbVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) ukbVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) ukbVar).bottomMargin);
    }

    public static void g(flb flbVar) {
        WeakReference weakReference = flbVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == flbVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            flbVar.b = null;
        }
    }

    private ad9 getScrollingChildHelper() {
        ad9 ad9Var = this.B1;
        if (ad9Var != null) {
            return ad9Var;
        }
        ad9 ad9Var2 = new ad9(this);
        this.B1 = ad9Var2;
        return ad9Var2;
    }

    public static int j(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && an1.z(edgeEffect) != 0.0f) {
            int iRound = Math.round(an1.H(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || an1.z(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(an1.H(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public final void A(int[] iArr) {
        ta0 ta0Var = this.f;
        int iR = ta0Var.r();
        if (iR == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iR; i3++) {
            flb flbVarF = F(ta0Var.q(i3));
            if (!flbVarF.n()) {
                int iB = flbVarF.b();
                if (iB < i) {
                    i = iB;
                }
                if (iB > i2) {
                    i2 = iB;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final flb C(int i) {
        flb flbVar = null;
        if (this.S0) {
            return null;
        }
        ta0 ta0Var = this.f;
        int iC = ta0Var.C();
        for (int i2 = 0; i2 < iC; i2++) {
            flb flbVarF = F(ta0Var.A(i2));
            if (flbVarF != null && !flbVarF.g() && D(flbVarF) == i) {
                if (!((ArrayList) ta0Var.b).contains(flbVarF.a)) {
                    return flbVarF;
                }
                flbVar = flbVarF;
            }
        }
        return flbVar;
    }

    public final int D(flb flbVar) {
        if ((flbVar.i & 524) == 0 && flbVar.d()) {
            int i = flbVar.c;
            ArrayList arrayList = (ArrayList) this.e.b;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                xf xfVar = (xf) arrayList.get(i2);
                int i3 = xfVar.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = xfVar.b;
                        if (i4 <= i) {
                            int i5 = xfVar.c;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = xfVar.b;
                        if (i6 == i) {
                            i = xfVar.c;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (xfVar.c <= i) {
                                i++;
                            }
                        }
                    }
                } else if (xfVar.b <= i) {
                    i += xfVar.c;
                }
            }
            return i;
        }
        return -1;
    }

    public final flb E(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return F(view);
        }
        s8f.k("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect H(View view) {
        ukb ukbVar = (ukb) view.getLayoutParams();
        boolean z = ukbVar.c;
        Rect rect = ukbVar.b;
        if (!z || (this.s1.f && (ukbVar.a.j() || ukbVar.a.e()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.G0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.w;
            rect2.set(0, 0, 0, 0);
            ((ua5) arrayList.get(i)).getClass();
            ((ukb) view.getLayoutParams()).a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        ukbVar.c = false;
        return rect;
    }

    public final boolean I() {
        return !this.L0 || this.S0 || ((ArrayList) this.e.b).size() > 0;
    }

    public final boolean J() {
        return this.U0 > 0;
    }

    public final void K() {
        ta0 ta0Var = this.f;
        int iC = ta0Var.C();
        for (int i = 0; i < iC; i++) {
            ((ukb) ta0Var.A(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.c.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ukb ukbVar = (ukb) ((flb) arrayList.get(i2)).a.getLayoutParams();
            if (ukbVar != null) {
                ukbVar.c = true;
            }
        }
    }

    public final void L(int i, int i2, boolean z) {
        int i3 = i + i2;
        ta0 ta0Var = this.f;
        int iC = ta0Var.C();
        for (int i4 = 0; i4 < iC; i4++) {
            flb flbVarF = F(ta0Var.A(i4));
            if (flbVarF != null && !flbVarF.n()) {
                int i5 = flbVarF.c;
                blb blbVar = this.s1;
                if (i5 >= i3) {
                    flbVarF.k(-i2, z);
                    blbVar.e = true;
                } else if (i5 >= i) {
                    flbVarF.a(8);
                    flbVarF.k(-i2, z);
                    flbVarF.c = i - 1;
                    blbVar.e = true;
                }
            }
        }
        gp3 gp3Var = this.c;
        ArrayList arrayList = (ArrayList) gp3Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            flb flbVar = (flb) arrayList.get(size);
            if (flbVar != null) {
                int i6 = flbVar.c;
                if (i6 >= i3) {
                    flbVar.k(-i2, z);
                } else if (i6 >= i) {
                    flbVar.a(8);
                    gp3Var.l(size);
                }
            }
        }
        requestLayout();
    }

    public final void M() {
        this.U0++;
    }

    public final void N(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.U0 - 1;
        this.U0 = i2;
        if (i2 < 1) {
            this.U0 = 0;
            if (z) {
                int i3 = this.Q0;
                this.Q0 = 0;
                if (i3 != 0 && (accessibilityManager = this.R0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.F1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    flb flbVar = (flb) arrayList.get(size);
                    if (flbVar.a.getParent() == this && !flbVar.n() && (i = flbVar.p) != -1) {
                        View view = flbVar.a;
                        WeakHashMap weakHashMap = nvf.a;
                        view.setImportantForAccessibility(i);
                        flbVar.p = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void O(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.d1) {
            int i = actionIndex == 0 ? 1 : 0;
            this.d1 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.h1 = x;
            this.f1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.i1 = y;
            this.g1 = y;
        }
    }

    public final void P() {
        if (this.y1 || !this.J0) {
            return;
        }
        WeakHashMap weakHashMap = nvf.a;
        postOnAnimation(this.G1);
        this.y1 = true;
    }

    public final void Q(flb flbVar, h71 h71Var) {
        flbVar.i &= -8193;
        boolean z = this.s1.g;
        lqb lqbVar = this.g;
        if (z && flbVar.j() && !flbVar.g() && !flbVar.n()) {
            this.z.getClass();
            ((gg8) lqbVar.c).e(flbVar.c, flbVar);
        }
        wid widVar = (wid) lqbVar.b;
        wvf wvfVarA = (wvf) widVar.get(flbVar);
        if (wvfVarA == null) {
            wvfVarA = wvf.a();
            widVar.put(flbVar, wvfVarA);
        }
        wvfVarA.b = h71Var;
        wvfVarA.a |= 4;
    }

    public final int R(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.X0;
        float f2 = 0.0f;
        if (edgeEffect == null || an1.z(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.Z0;
            if (edgeEffect2 != null && an1.z(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.Z0;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fH = an1.H(edgeEffect3, width, height);
                    if (an1.z(this.Z0) == 0.0f) {
                        this.Z0.onRelease();
                    }
                    f2 = fH;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.X0;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -an1.H(edgeEffect4, -width, 1.0f - height);
                if (an1.z(this.X0) == 0.0f) {
                    this.X0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public final int S(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.Y0;
        float f2 = 0.0f;
        if (edgeEffect == null || an1.z(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.a1;
            if (edgeEffect2 != null && an1.z(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.a1;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fH = an1.H(edgeEffect3, height, 1.0f - width);
                    if (an1.z(this.a1) == 0.0f) {
                        this.a1.onRelease();
                    }
                    f2 = fH;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.Y0;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -an1.H(edgeEffect4, -height, width);
                if (an1.z(this.Y0) == 0.0f) {
                    this.Y0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void T(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.w;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof ukb) {
            ukb ukbVar = (ukb) layoutParams;
            if (!ukbVar.c) {
                Rect rect2 = ukbVar.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.E0.f0(this, view, this.w, !this.L0, view2 == null);
    }

    public final void U() {
        VelocityTracker velocityTracker = this.e1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        b0(0);
        EdgeEffect edgeEffect = this.X0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.X0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.Y0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.Y0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Z0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.Z0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.a1;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.a1.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = nvf.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc A[DONT_INVERT, PHI: r7
  0x00fc: PHI (r7v10 boolean) = (r7v8 boolean), (r7v11 boolean) binds: [B:34:0x00e3, B:32:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    public final boolean V(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        k();
        nkb nkbVar = this.z;
        int[] iArr = this.E1;
        if (nkbVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            W(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.G0.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        q(i4, i5, i6, i7, this.C1, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z3 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.h1;
        int[] iArr2 = this.C1;
        int i13 = iArr2[0];
        this.h1 = i12 - i13;
        int i14 = this.i1;
        int i15 = iArr2[1];
        this.i1 = i14 - i15;
        int[] iArr3 = this.D1;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z = true;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    t();
                    z = true;
                    an1.H(this.X0, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    if (f > 0.0f) {
                        u();
                        an1.H(this.Z0, f / getWidth(), y / getHeight());
                    } else {
                        z2 = false;
                    }
                    if (f2 < 0.0f) {
                        v();
                        an1.H(this.Y0, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        s();
                        an1.H(this.a1, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else if (z2 || f != 0.0f || f2 != 0.0f) {
                        WeakHashMap weakHashMap = nvf.a;
                        postInvalidateOnAnimation();
                    }
                    z2 = z;
                    if (z2) {
                        WeakHashMap weakHashMap2 = nvf.a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = nvf.a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = z;
                if (f2 < 0.0f) {
                    v();
                    an1.H(this.Y0, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    s();
                    an1.H(this.a1, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else if (z2) {
                    WeakHashMap weakHashMap4 = nvf.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = nvf.a;
                    postInvalidateOnAnimation();
                }
                z2 = z;
                if (z2) {
                    WeakHashMap weakHashMap6 = nvf.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = nvf.a;
                    postInvalidateOnAnimation();
                }
            }
            i(i, i2);
        } else {
            z = true;
        }
        if (i4 != 0 || i5 != 0) {
            r(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z3 && i4 == 0 && i5 == 0) {
            return false;
        }
        return z;
    }

    public final void W(int i, int i2, int[] iArr) {
        flb flbVar;
        Z();
        M();
        int i3 = x0f.a;
        Trace.beginSection("RV Scroll");
        blb blbVar = this.s1;
        x(blbVar);
        gp3 gp3Var = this.c;
        int iH0 = i != 0 ? this.E0.h0(i, gp3Var, blbVar) : 0;
        int iI0 = i2 != 0 ? this.E0.i0(i2, gp3Var, blbVar) : 0;
        Trace.endSection();
        ta0 ta0Var = this.f;
        int iR = ta0Var.r();
        for (int i4 = 0; i4 < iR; i4++) {
            View viewQ = ta0Var.q(i4);
            flb flbVarE = E(viewQ);
            if (flbVarE != null && (flbVar = flbVarE.h) != null) {
                View view = flbVar.a;
                int left = viewQ.getLeft();
                int top = viewQ.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        N(true);
        a0(false);
        if (iArr != null) {
            iArr[0] = iH0;
            iArr[1] = iI0;
        }
    }

    public final boolean X(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fZ = an1.z(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = M1;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fZ;
    }

    public final void Y(int i, int i2, boolean z) {
        tkb tkbVar = this.E0;
        if (tkbVar == null) {
            b1.d("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.O0) {
            return;
        }
        int i3 = !tkbVar.c() ? 0 : i;
        int i4 = !this.E0.d() ? 0 : i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        if (z) {
            int i5 = i3 != 0 ? 1 : 0;
            if (i4 != 0) {
                i5 |= 2;
            }
            getScrollingChildHelper().g(i5, 1);
        }
        elb elbVar = this.p1;
        RecyclerView recyclerView = elbVar.g;
        int iAbs = Math.abs(i3);
        int iAbs2 = Math.abs(i4);
        boolean z2 = iAbs > iAbs2;
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z2) {
            iAbs = iAbs2;
        }
        int iMin = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        Interpolator interpolator = elbVar.d;
        pa5 pa5Var = Q1;
        if (interpolator != pa5Var) {
            elbVar.d = pa5Var;
            elbVar.c = new OverScroller(recyclerView.getContext(), pa5Var);
        }
        elbVar.b = 0;
        elbVar.a = 0;
        recyclerView.setScrollState(2);
        elbVar.c.startScroll(0, 0, i3, i4, iMin);
        if (elbVar.e) {
            elbVar.f = true;
            return;
        }
        RecyclerView recyclerView2 = elbVar.g;
        recyclerView2.removeCallbacks(elbVar);
        WeakHashMap weakHashMap = nvf.a;
        recyclerView2.postOnAnimation(elbVar);
    }

    public final void Z() {
        int i = this.M0 + 1;
        this.M0 = i;
        if (i != 1 || this.O0) {
            return;
        }
        this.N0 = false;
    }

    public final void a0(boolean z) {
        int i = this.M0;
        if (i < 1) {
            this.M0 = 1;
            i = 1;
        }
        if (!z && !this.O0) {
            this.N0 = false;
        }
        if (i == 1) {
            if (z && this.N0 && !this.O0 && this.E0 != null && this.z != null) {
                m();
            }
            if (!this.O0) {
                this.N0 = false;
            }
        }
        this.M0--;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        tkb tkbVar = this.E0;
        if (tkbVar != null) {
            tkbVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ukb) && this.E0.e((ukb) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        tkb tkbVar = this.E0;
        if (tkbVar != null && tkbVar.c()) {
            return this.E0.i(this.s1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        tkb tkbVar = this.E0;
        if (tkbVar != null && tkbVar.c()) {
            return this.E0.j(this.s1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        tkb tkbVar = this.E0;
        if (tkbVar != null && tkbVar.c()) {
            return this.E0.k(this.s1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        tkb tkbVar = this.E0;
        if (tkbVar != null && tkbVar.d()) {
            return this.E0.l(this.s1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        tkb tkbVar = this.E0;
        if (tkbVar != null && tkbVar.d()) {
            return this.E0.m(this.s1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        tkb tkbVar = this.E0;
        if (tkbVar != null && tkbVar.d()) {
            return this.E0.n(this.s1);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.G0;
        int size = arrayList.size();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            ua5 ua5Var = (ua5) arrayList.get(i);
            if (ua5Var.q != ua5Var.s.getWidth() || ua5Var.r != ua5Var.s.getHeight()) {
                ua5Var.q = ua5Var.s.getWidth();
                ua5Var.r = ua5Var.s.getHeight();
                ua5Var.d(0);
            } else if (ua5Var.A != 0) {
                if (ua5Var.t) {
                    int i2 = ua5Var.q;
                    int i3 = ua5Var.e;
                    int i4 = i2 - i3;
                    int i5 = ua5Var.l;
                    int i6 = ua5Var.k;
                    int i7 = i5 - (i6 / 2);
                    StateListDrawable stateListDrawable = ua5Var.c;
                    stateListDrawable.setBounds(0, 0, i3, i6);
                    Drawable drawable = ua5Var.d;
                    drawable.setBounds(0, 0, ua5Var.f, ua5Var.r);
                    RecyclerView recyclerView = ua5Var.s;
                    WeakHashMap weakHashMap = nvf.a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i3, i7);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i3, -i7);
                    } else {
                        canvas.translate(i4, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i7);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i4, -i7);
                    }
                }
                if (ua5Var.u) {
                    int i8 = ua5Var.r;
                    int i9 = ua5Var.i;
                    int i10 = i8 - i9;
                    int i11 = ua5Var.o;
                    int i12 = ua5Var.n;
                    int i13 = i11 - (i12 / 2);
                    StateListDrawable stateListDrawable2 = ua5Var.g;
                    stateListDrawable2.setBounds(0, 0, i12, i9);
                    Drawable drawable2 = ua5Var.h;
                    drawable2.setBounds(0, 0, ua5Var.q, ua5Var.j);
                    canvas.translate(0.0f, i10);
                    drawable2.draw(canvas);
                    canvas.translate(i13, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i13, -i10);
                }
            }
            i++;
        }
        EdgeEffect edgeEffect = this.X0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.v ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.X0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.Y0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.v) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.Y0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.Z0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.v ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.Z0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.a1;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.v) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.a1;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.b1 == null || arrayList.size() <= 0 || !this.b1.f()) ? z : true) {
            WeakHashMap weakHashMap2 = nvf.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(flb flbVar) {
        View view = flbVar.a;
        boolean z = view.getParent() == this;
        this.c.q(E(view));
        boolean zI = flbVar.i();
        ta0 ta0Var = this.f;
        if (zI) {
            ta0Var.d(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            ta0Var.c(view, -1, true);
            return;
        }
        int iIndexOfChild = ((RecyclerView) ((g5b) ta0Var.c).b).indexOfChild(view);
        if (iIndexOfChild < 0) {
            yg5.l(view, "view is not a child, cannot hide ");
        } else {
            ((zy1) ta0Var.d).y(iIndexOfChild);
            ta0Var.G(view);
        }
    }

    public final void f(String str) {
        if (!J()) {
            if (this.V0 > 0) {
                b1.n("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(w()));
            }
        } else if (str == null) {
            qc0.p("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(w()));
        } else {
            qc0.p(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0161  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x018c  */
    /* JADX WARN: Code duplicated, block: B:126:0x018e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0190  */
    /* JADX WARN: Code duplicated, block: B:130:0x0194  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:132:0x0198  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0117  */
    /* JADX WARN: Code duplicated, block: B:81:0x0119  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0165, code lost:
    
        if (r16 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0183, code lost:
    
        if (r5 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0186, code lost:
    
        if (r16 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0189, code lost:
    
        if (r5 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0191, code lost:
    
        if ((r5 * r6) <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0199, code lost:
    
        if ((r5 * r6) >= 0) goto L135;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:117:0x0168, please report this as an issue */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        tkb tkbVar = this.E0;
        if (tkbVar != null) {
            return tkbVar.q();
        }
        qc0.p("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        tkb tkbVar = this.E0;
        if (tkbVar != null) {
            return tkbVar.r(getContext(), attributeSet);
        }
        qc0.p("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public nkb getAdapter() {
        return this.z;
    }

    @Override // android.view.View
    public int getBaseline() {
        tkb tkbVar = this.E0;
        if (tkbVar == null) {
            return super.getBaseline();
        }
        tkbVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.v;
    }

    public hlb getCompatAccessibilityDelegate() {
        return this.z1;
    }

    public qkb getEdgeEffectFactory() {
        return this.W0;
    }

    public rkb getItemAnimator() {
        return this.b1;
    }

    public int getItemDecorationCount() {
        return this.G0.size();
    }

    public tkb getLayoutManager() {
        return this.E0;
    }

    public int getMaxFlingVelocity() {
        return this.l1;
    }

    public int getMinFlingVelocity() {
        return this.k1;
    }

    public long getNanoTime() {
        if (O1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public vkb getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.o1;
    }

    public ykb getRecycledViewPool() {
        return this.c.d();
    }

    public int getScrollState() {
        return this.c1;
    }

    public final void h() {
        ta0 ta0Var = this.f;
        int iC = ta0Var.C();
        for (int i = 0; i < iC; i++) {
            flb flbVarF = F(ta0Var.A(i));
            if (!flbVarF.n()) {
                flbVarF.d = -1;
                flbVarF.f = -1;
            }
        }
        gp3 gp3Var = this.c;
        ArrayList arrayList = (ArrayList) gp3Var.c;
        ArrayList arrayList2 = (ArrayList) gp3Var.e;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            flb flbVar = (flb) arrayList2.get(i2);
            flbVar.d = -1;
            flbVar.f = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            flb flbVar2 = (flb) arrayList.get(i3);
            flbVar2.d = -1;
            flbVar2.f = -1;
        }
        ArrayList arrayList3 = (ArrayList) gp3Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                flb flbVar3 = (flb) ((ArrayList) gp3Var.d).get(i4);
                flbVar3.d = -1;
                flbVar3.f = -1;
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.X0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.X0.onRelease();
            zIsFinished = this.X0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.Z0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.Z0.onRelease();
            zIsFinished |= this.Z0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Y0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.Y0.onRelease();
            zIsFinished |= this.Y0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.a1;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.a1.onRelease();
            zIsFinished |= this.a1.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = nvf.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.J0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.O0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        if (!this.L0 || this.S0) {
            int i = x0f.a;
            Trace.beginSection("RV FullInvalidate");
            m();
            Trace.endSection();
            return;
        }
        a82 a82Var = this.e;
        if (((ArrayList) a82Var.b).size() > 0) {
            a82Var.getClass();
            if (((ArrayList) a82Var.b).size() > 0) {
                int i2 = x0f.a;
                Trace.beginSection("RV FullInvalidate");
                m();
                Trace.endSection();
            }
        }
    }

    public final void l(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = nvf.a;
        setMeasuredDimension(tkb.f(i, paddingRight, getMinimumWidth()), tkb.f(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code duplicated, block: B:117:0x026c  */
    /* JADX WARN: Code duplicated, block: B:157:0x033c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0342  */
    /* JADX WARN: Code duplicated, block: B:162:0x034d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0352  */
    /* JADX WARN: Code duplicated, block: B:168:0x035a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0361  */
    /* JADX WARN: Code duplicated, block: B:174:0x036b A[LOOP:3: B:167:0x0358->B:174:0x036b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x0378  */
    /* JADX WARN: Code duplicated, block: B:180:0x037f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0389 A[LOOP:4: B:176:0x0376->B:183:0x0389, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x038e  */
    /* JADX WARN: Code duplicated, block: B:209:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x038c A[EDGE_INSN: B:213:0x038c->B:184:0x038c BREAK  A[LOOP:4: B:176:0x0376->B:183:0x0389], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m() {
        byte b;
        int i;
        View viewFindViewById;
        int i2;
        int iB;
        int i3;
        int iMin;
        flb flbVarC;
        View view;
        flb flbVarC2;
        View view2;
        wid widVar;
        h71 h71Var;
        int i4;
        boolean zG;
        byte b2;
        if (this.z == null) {
            b1.l("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.E0 == null) {
            b1.d("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        blb blbVar = this.s1;
        byte b3 = 0;
        blbVar.h = false;
        byte b4 = 1;
        byte b5 = this.H1 && !(this.I1 == getWidth() && this.J1 == getHeight());
        this.I1 = 0;
        this.J1 = 0;
        this.H1 = false;
        if (blbVar.c == 1) {
            n();
            this.E0.j0(this);
            o();
        } else {
            a82 a82Var = this.e;
            if ((((ArrayList) a82Var.d).isEmpty() || ((ArrayList) a82Var.b).isEmpty()) && !b5 == true && this.E0.m == getWidth() && this.E0.n == getHeight()) {
                this.E0.j0(this);
            } else {
                this.E0.j0(this);
                o();
            }
        }
        int i5 = 4;
        blbVar.a(4);
        Z();
        M();
        blbVar.c = 1;
        boolean z = blbVar.i;
        ta0 ta0Var = this.f;
        gp3 gp3Var = this.c;
        lqb lqbVar = this.g;
        if (z) {
            int iR = ta0Var.r() - 1;
            while (iR >= 0) {
                flb flbVarF = F(ta0Var.q(iR));
                if (flbVarF.n()) {
                    b2 = b4;
                } else {
                    this.z.getClass();
                    long j = flbVarF.c;
                    this.b1.getClass();
                    h71 h71Var2 = new h71(5, b3);
                    h71Var2.b(flbVarF);
                    gg8 gg8Var = (gg8) lqbVar.c;
                    b2 = b4;
                    wid widVar2 = (wid) lqbVar.b;
                    flb flbVar = (flb) gg8Var.c(j);
                    if (flbVar == null || flbVar.n()) {
                        lqbVar.b(flbVarF, h71Var2);
                    } else {
                        wvf wvfVar = (wvf) widVar2.get(flbVar);
                        byte b6 = (wvfVar == null || (wvfVar.a & 1) == 0) ? b3 : b2;
                        wvf wvfVar2 = (wvf) widVar2.get(flbVarF);
                        byte b7 = (wvfVar2 == null || (wvfVar2.a & 1) == 0) ? b3 : b2;
                        if (b6 == 0 || flbVar != flbVarF) {
                            h71 h71VarR = lqbVar.r(flbVar, i5);
                            lqbVar.b(flbVarF, h71Var2);
                            h71 h71VarR2 = lqbVar.r(flbVarF, 8);
                            if (h71VarR == null) {
                                int iR2 = ta0Var.r();
                                for (int i6 = 0; i6 < iR2; i6++) {
                                    flb flbVarF2 = F(ta0Var.q(i6));
                                    if (flbVarF2 != flbVarF) {
                                        this.z.getClass();
                                        if (flbVarF2.c == j) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(flbVarF2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(flbVarF);
                                            r3.k(sb, w());
                                            return;
                                        }
                                    }
                                }
                                b1.d("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + flbVar + " cannot be found but it is necessary for " + flbVarF + w());
                            } else {
                                flbVar.m(false);
                                if (b6 != 0) {
                                    e(flbVar);
                                }
                                if (flbVar != flbVarF) {
                                    if (b7 != 0) {
                                        e(flbVarF);
                                    }
                                    flbVar.g = flbVarF;
                                    e(flbVar);
                                    gp3Var.q(flbVar);
                                    flbVarF.m(false);
                                    flbVarF.h = flbVar;
                                }
                                if (this.b1.a(flbVar, flbVarF, h71VarR, h71VarR2)) {
                                    P();
                                }
                            }
                        } else {
                            lqbVar.b(flbVarF, h71Var2);
                        }
                    }
                }
                iR--;
                b4 = b2;
                b3 = 0;
                i5 = 4;
            }
            b = b4;
            wid widVar3 = (wid) lqbVar.b;
            int i7 = widVar3.c - 1;
            while (i7 >= 0) {
                flb flbVar2 = (flb) widVar3.f(i7);
                wvf wvfVar3 = (wvf) widVar3.g(i7);
                int i8 = wvfVar3.a;
                int i9 = i8 & 3;
                mjg mjgVar = this.K1;
                if (i9 == 3) {
                    RecyclerView recyclerView = (RecyclerView) mjgVar.a;
                    recyclerView.E0.d0(flbVar2.a, recyclerView.c);
                } else if ((i8 & 1) != 0) {
                    h71 h71Var3 = wvfVar3.b;
                    if (h71Var3 == null) {
                        RecyclerView recyclerView2 = (RecyclerView) mjgVar.a;
                        recyclerView2.E0.d0(flbVar2.a, recyclerView2.c);
                    } else {
                        mjgVar.I(flbVar2, h71Var3, wvfVar3.c);
                    }
                } else if ((i8 & 14) == 14) {
                    mjgVar.H(flbVar2, wvfVar3.b, wvfVar3.c);
                } else {
                    if ((i8 & 12) == 12) {
                        h71 h71Var4 = wvfVar3.b;
                        h71 h71Var5 = wvfVar3.c;
                        mjgVar.getClass();
                        flbVar2.m(false);
                        RecyclerView recyclerView3 = (RecyclerView) mjgVar.a;
                        boolean z2 = recyclerView3.S0;
                        rkb rkbVar = recyclerView3.b1;
                        if (!z2) {
                            nr3 nr3Var = (nr3) rkbVar;
                            nr3Var.getClass();
                            int i10 = h71Var4.b;
                            int i11 = h71Var5.b;
                            if (i10 == i11) {
                                widVar = widVar3;
                                if (h71Var4.c == h71Var5.c) {
                                    nr3Var.c(flbVar2);
                                    zG = false;
                                }
                                if (zG) {
                                    recyclerView3.P();
                                }
                            } else {
                                widVar = widVar3;
                            }
                            zG = nr3Var.g(flbVar2, i10, h71Var4.c, i11, h71Var5.c);
                            if (zG) {
                                recyclerView3.P();
                            }
                        } else if (rkbVar.a(flbVar2, flbVar2, h71Var4, h71Var5)) {
                            recyclerView3.P();
                        }
                        i4 = 0;
                        h71Var = null;
                    } else {
                        widVar = widVar3;
                        if ((i8 & 4) != 0) {
                            h71Var = null;
                            mjgVar.I(flbVar2, wvfVar3.b, null);
                        } else {
                            h71Var = null;
                            if ((i8 & 8) != 0) {
                                mjgVar.H(flbVar2, wvfVar3.b, wvfVar3.c);
                            }
                        }
                        i4 = 0;
                    }
                    wvfVar3.a = i4;
                    wvfVar3.b = h71Var;
                    wvfVar3.c = h71Var;
                    wvf.d.q(wvfVar3);
                    i7--;
                    widVar3 = widVar;
                }
                widVar = widVar3;
                i4 = 0;
                h71Var = null;
                wvfVar3.a = i4;
                wvfVar3.b = h71Var;
                wvfVar3.c = h71Var;
                wvf.d.q(wvfVar3);
                i7--;
                widVar3 = widVar;
            }
        } else {
            b = 1;
        }
        View view3 = null;
        this.E0.c0(gp3Var);
        blbVar.a = blbVar.d;
        this.S0 = false;
        this.T0 = false;
        blbVar.i = false;
        blbVar.j = false;
        this.E0.e = false;
        ArrayList arrayList = (ArrayList) gp3Var.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        tkb tkbVar = this.E0;
        if (tkbVar.j) {
            tkbVar.i = 0;
            tkbVar.j = false;
            gp3Var.r();
        }
        this.E0.X(blbVar);
        boolean z3 = b;
        N(z3);
        a0(false);
        ((wid) lqbVar.b).clear();
        ((gg8) lqbVar.c).a();
        int[] iArr = this.A1;
        int i12 = iArr[0];
        int i13 = iArr[z3 ? 1 : 0];
        A(iArr);
        if (iArr[0] != i12 || iArr[z3 ? 1 : 0] != i13) {
            r(0, 0);
        }
        if (this.o1 && this.z != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                if (blbVar.l != -1) {
                    this.z.getClass();
                }
                if (ta0Var.r() > 0) {
                    i2 = blbVar.k;
                    if (i2 == -1) {
                        i2 = 0;
                    }
                    iB = blbVar.b();
                    i3 = i2;
                    while (true) {
                        if (i3 >= iB) {
                            flbVarC2 = C(i3);
                            if (flbVarC2 == null) {
                                view2 = flbVarC2.a;
                                if (view2.hasFocusable()) {
                                    view3 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        for (iMin = Math.min(iB, i2) - 1; iMin >= 0; iMin--) {
                            flbVarC = C(iMin);
                            if (flbVarC == null) {
                                break;
                                break;
                            }
                            view = flbVarC.a;
                            if (view.hasFocusable()) {
                                view3 = view;
                                break;
                            }
                        }
                    }
                }
                if (view3 != null) {
                    i = blbVar.m;
                    if (i != -1) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            } else if (((ArrayList) ta0Var.b).contains(getFocusedChild())) {
                if (blbVar.l != -1) {
                    this.z.getClass();
                }
                if (ta0Var.r() > 0) {
                    i2 = blbVar.k;
                    if (i2 == -1) {
                        i2 = 0;
                    }
                    iB = blbVar.b();
                    i3 = i2;
                    while (true) {
                        if (i3 >= iB) {
                            flbVarC2 = C(i3);
                            if (flbVarC2 == null) {
                                view2 = flbVarC2.a;
                                if (view2.hasFocusable()) {
                                    view3 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            flbVarC = C(iMin);
                            if (flbVarC == null) {
                                break;
                            }
                            view = flbVarC.a;
                            if (view.hasFocusable()) {
                                view3 = view;
                                break;
                            }
                        }
                    }
                }
                if (view3 != null) {
                    i = blbVar.m;
                    if (i != -1 && (viewFindViewById = view3.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            }
        }
        blbVar.l = -1L;
        blbVar.k = -1;
        blbVar.m = -1;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:118:0x0204  */
    /* JADX WARN: Code duplicated, block: B:119:0x0208  */
    /* JADX WARN: Code duplicated, block: B:121:0x020d  */
    /* JADX WARN: Code duplicated, block: B:251:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:345:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:52:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:57:0x011b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0191  */
    /* JADX WARN: Code duplicated, block: B:89:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x019e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bc  */
    public final void n() {
        gg8 gg8Var;
        wid widVar;
        boolean z;
        View viewY;
        int iD;
        wvf wvfVar;
        gg8 gg8Var2;
        wid widVar2;
        boolean z2;
        boolean z3;
        byte b;
        boolean z4;
        boolean z5;
        xf xfVarL;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        xf xfVarL2;
        int i9;
        int i10;
        int i11;
        xf xfVarL3;
        blb blbVar = this.s1;
        int i12 = 1;
        blbVar.a(1);
        x(blbVar);
        int i13 = 0;
        blbVar.h = false;
        Z();
        lqb lqbVar = this.g;
        wid widVar3 = (wid) lqbVar.b;
        wid widVar4 = (wid) lqbVar.b;
        widVar3.clear();
        gg8 gg8Var3 = (gg8) lqbVar.c;
        gg8Var3.a();
        M();
        boolean z6 = this.S0;
        a82 a82Var = this.e;
        if (z6) {
            a82Var.N((ArrayList) a82Var.b);
            a82Var.N((ArrayList) a82Var.d);
            if (this.T0) {
                this.E0.S();
            }
        }
        int i14 = -1;
        if (this.b1 != null && this.E0.r0()) {
            sug sugVar = (sug) a82Var.c;
            m6c m6cVar = (m6c) a82Var.e;
            kd9 kd9Var = (kd9) a82Var.f;
            ArrayList arrayList = (ArrayList) a82Var.b;
            while (true) {
                int size = arrayList.size() - i12;
                int i15 = i13;
                while (true) {
                    if (size < 0) {
                        size = i14;
                        break;
                    }
                    if (((xf) arrayList.get(size)).a == 8) {
                        if (i15 != 0) {
                            break;
                        }
                    } else {
                        i15 = i12;
                    }
                    size--;
                }
                if (size == i14) {
                    break;
                }
                int i16 = size + 1;
                a82 a82Var2 = (a82) kd9Var.b;
                sug sugVar2 = (sug) a82Var2.c;
                xf xfVar = (xf) arrayList.get(size);
                xf xfVar2 = (xf) arrayList.get(i16);
                kd9 kd9Var2 = kd9Var;
                int i17 = xfVar2.a;
                if (i17 == i12) {
                    gg8Var3 = gg8Var3;
                    widVar4 = widVar4;
                    int i18 = xfVar.c;
                    int i19 = xfVar2.b;
                    int i20 = i18 < i19 ? -1 : 0;
                    int i21 = xfVar.b;
                    if (i21 < i19) {
                        i20++;
                    }
                    if (i19 <= i21) {
                        xfVar.b = i21 + xfVar2.c;
                    }
                    int i22 = xfVar2.b;
                    if (i22 <= i18) {
                        xfVar.c = i18 + xfVar2.c;
                    }
                    xfVar2.b = i22 + i20;
                    arrayList.set(size, xfVar2);
                    arrayList.set(i16, xfVar);
                } else if (i17 == 2) {
                    gg8Var3 = gg8Var3;
                    widVar4 = widVar4;
                    int i23 = xfVar.b;
                    int i24 = xfVar.c;
                    int i25 = xfVar2.b;
                    if (i23 < i24) {
                        z4 = i25 == i23 && xfVar2.c == i24 - i23;
                        z5 = false;
                    } else {
                        z4 = i25 == i24 + 1 && xfVar2.c == i23 - i24;
                        z5 = true;
                    }
                    if (i24 < i25) {
                        i25--;
                        xfVar2.b = i25;
                    } else {
                        int i26 = xfVar2.c;
                        if (i24 < i25 + i26) {
                            xfVar2.c = i26 - 1;
                            xfVar.a = 2;
                            xfVar.c = 1;
                            if (xfVar2.c == 0) {
                                arrayList.remove(i16);
                                sugVar2.q(xfVar2);
                            }
                        }
                    }
                    int i27 = xfVar.b;
                    if (i27 <= i25) {
                        xfVar2.b = i25 + 1;
                    } else {
                        int i28 = i25 + xfVar2.c;
                        if (i27 < i28) {
                            xfVarL = a82Var2.L(2, i27 + 1, i28 - i27);
                            xfVar2.c = xfVar.b - xfVar2.b;
                        }
                        if (z4) {
                            arrayList.set(size, xfVar2);
                            arrayList.remove(i16);
                            sugVar2.q(xfVar);
                        } else {
                            if (z5) {
                                if (xfVarL != null) {
                                    i7 = xfVar.b;
                                    if (i7 > xfVarL.b) {
                                        xfVar.b = i7 - xfVarL.c;
                                    }
                                    i8 = xfVar.c;
                                    if (i8 > xfVarL.b) {
                                        xfVar.c = i8 - xfVarL.c;
                                    }
                                }
                                i5 = xfVar.b;
                                if (i5 > xfVar2.b) {
                                    xfVar.b = i5 - xfVar2.c;
                                }
                                i6 = xfVar.c;
                                if (i6 > xfVar2.b) {
                                    xfVar.c = i6 - xfVar2.c;
                                }
                            } else {
                                if (xfVarL != null) {
                                    i3 = xfVar.b;
                                    if (i3 >= xfVarL.b) {
                                        xfVar.b = i3 - xfVarL.c;
                                    }
                                    i4 = xfVar.c;
                                    if (i4 >= xfVarL.b) {
                                        xfVar.c = i4 - xfVarL.c;
                                    }
                                }
                                i = xfVar.b;
                                if (i >= xfVar2.b) {
                                    xfVar.b = i - xfVar2.c;
                                }
                                i2 = xfVar.c;
                                if (i2 >= xfVar2.b) {
                                    xfVar.c = i2 - xfVar2.c;
                                }
                            }
                            arrayList.set(size, xfVar2);
                            if (xfVar.b != xfVar.c) {
                                arrayList.set(i16, xfVar);
                            } else {
                                arrayList.remove(i16);
                            }
                            if (xfVarL != null) {
                                arrayList.add(size, xfVarL);
                            }
                        }
                    }
                    xfVarL = null;
                    if (z4) {
                        arrayList.set(size, xfVar2);
                        arrayList.remove(i16);
                        sugVar2.q(xfVar);
                    } else {
                        if (z5) {
                            if (xfVarL != null) {
                                i7 = xfVar.b;
                                if (i7 > xfVarL.b) {
                                    xfVar.b = i7 - xfVarL.c;
                                }
                                i8 = xfVar.c;
                                if (i8 > xfVarL.b) {
                                    xfVar.c = i8 - xfVarL.c;
                                }
                            }
                            i5 = xfVar.b;
                            if (i5 > xfVar2.b) {
                                xfVar.b = i5 - xfVar2.c;
                            }
                            i6 = xfVar.c;
                            if (i6 > xfVar2.b) {
                                xfVar.c = i6 - xfVar2.c;
                            }
                        } else {
                            if (xfVarL != null) {
                                i3 = xfVar.b;
                                if (i3 >= xfVarL.b) {
                                    xfVar.b = i3 - xfVarL.c;
                                }
                                i4 = xfVar.c;
                                if (i4 >= xfVarL.b) {
                                    xfVar.c = i4 - xfVarL.c;
                                }
                            }
                            i = xfVar.b;
                            if (i >= xfVar2.b) {
                                xfVar.b = i - xfVar2.c;
                            }
                            i2 = xfVar.c;
                            if (i2 >= xfVar2.b) {
                                xfVar.c = i2 - xfVar2.c;
                            }
                        }
                        arrayList.set(size, xfVar2);
                        if (xfVar.b != xfVar.c) {
                            arrayList.set(i16, xfVar);
                        } else {
                            arrayList.remove(i16);
                        }
                        if (xfVarL != null) {
                            arrayList.add(size, xfVarL);
                        }
                    }
                } else if (i17 != 4) {
                    gg8Var3 = gg8Var3;
                    widVar4 = widVar4;
                } else {
                    int i29 = xfVar.c;
                    int i30 = xfVar2.b;
                    if (i29 < i30) {
                        xfVar2.b = i30 - 1;
                    } else {
                        int i31 = xfVar2.c;
                        if (i29 < i30 + i31) {
                            xfVar2.c = i31 - 1;
                            xfVarL2 = a82Var2.L(4, xfVar.b, 1);
                        }
                        i9 = xfVar.b;
                        i10 = xfVar2.b;
                        if (i9 <= i10) {
                            xfVar2.b = i10 + 1;
                        } else {
                            i11 = i10 + xfVar2.c;
                            if (i9 < i11) {
                                int i32 = i11 - i9;
                                xfVarL3 = a82Var2.L(4, i9 + 1, i32);
                                xfVar2.c -= i32;
                            }
                            arrayList.set(i16, xfVar);
                            if (xfVar2.c > 0) {
                                arrayList.set(size, xfVar2);
                            } else {
                                arrayList.remove(size);
                                sugVar2.q(xfVar2);
                            }
                            if (xfVarL2 != null) {
                                arrayList.add(size, xfVarL2);
                            }
                            if (xfVarL3 != null) {
                                arrayList.add(size, xfVarL3);
                            }
                        }
                        xfVarL3 = null;
                        arrayList.set(i16, xfVar);
                        if (xfVar2.c > 0) {
                            arrayList.set(size, xfVar2);
                        } else {
                            arrayList.remove(size);
                            sugVar2.q(xfVar2);
                        }
                        if (xfVarL2 != null) {
                            arrayList.add(size, xfVarL2);
                        }
                        if (xfVarL3 != null) {
                            arrayList.add(size, xfVarL3);
                        }
                    }
                    xfVarL2 = null;
                    i9 = xfVar.b;
                    i10 = xfVar2.b;
                    if (i9 <= i10) {
                        xfVar2.b = i10 + 1;
                    } else {
                        i11 = i10 + xfVar2.c;
                        if (i9 < i11) {
                            int i33 = i11 - i9;
                            xfVarL3 = a82Var2.L(4, i9 + 1, i33);
                            xfVar2.c -= i33;
                        }
                        arrayList.set(i16, xfVar);
                        if (xfVar2.c > 0) {
                            arrayList.set(size, xfVar2);
                        } else {
                            arrayList.remove(size);
                            sugVar2.q(xfVar2);
                        }
                        if (xfVarL2 != null) {
                            arrayList.add(size, xfVarL2);
                        }
                        if (xfVarL3 != null) {
                            arrayList.add(size, xfVarL3);
                        }
                    }
                    xfVarL3 = null;
                    arrayList.set(i16, xfVar);
                    if (xfVar2.c > 0) {
                        arrayList.set(size, xfVar2);
                    } else {
                        arrayList.remove(size);
                        sugVar2.q(xfVar2);
                    }
                    if (xfVarL2 != null) {
                        arrayList.add(size, xfVarL2);
                    }
                    if (xfVarL3 != null) {
                        arrayList.add(size, xfVarL3);
                    }
                }
                kd9Var = kd9Var2;
                gg8Var3 = gg8Var3;
                widVar4 = widVar4;
                i12 = 1;
                i13 = 0;
                i14 = -1;
            }
            gg8Var = gg8Var3;
            widVar = widVar4;
            int size2 = arrayList.size();
            for (int i34 = 0; i34 < size2; i34++) {
                xf xfVarL4 = (xf) arrayList.get(i34);
                int i35 = xfVarL4.a;
                if (i35 == 1) {
                    a82Var.M(xfVarL4);
                } else if (i35 == 2) {
                    int i36 = xfVarL4.b;
                    int i37 = xfVarL4.c + i36;
                    int i38 = i36;
                    byte b2 = -1;
                    int i39 = 0;
                    while (i38 < i37) {
                        if (m6cVar.u(i38) != null || a82Var.u(i38)) {
                            if (b2 == 0) {
                                a82Var.y(a82Var.L(2, i36, i39));
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            b = 1;
                        } else {
                            if (b2 == 1) {
                                a82Var.M(a82Var.L(2, i36, i39));
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            b = 0;
                        }
                        if (z3) {
                            i38 -= i39;
                            i37 -= i39;
                            i39 = 1;
                        } else {
                            i39++;
                        }
                        i38++;
                        b2 = b;
                    }
                    if (i39 != xfVarL4.c) {
                        sugVar.q(xfVarL4);
                        xfVarL4 = a82Var.L(2, i36, i39);
                    }
                    if (b2 == 0) {
                        a82Var.y(xfVarL4);
                    } else {
                        a82Var.M(xfVarL4);
                    }
                } else if (i35 == 4) {
                    int i40 = xfVarL4.b;
                    int i41 = xfVarL4.c + i40;
                    int i42 = i40;
                    byte b3 = -1;
                    int i43 = 0;
                    while (i40 < i41) {
                        if (m6cVar.u(i40) != null || a82Var.u(i40)) {
                            if (b3 == 0) {
                                a82Var.y(a82Var.L(4, i42, i43));
                                i42 = i40;
                                i43 = 0;
                            }
                            b3 = 1;
                        } else {
                            if (b3 == 1) {
                                a82Var.M(a82Var.L(4, i42, i43));
                                i42 = i40;
                                i43 = 0;
                            }
                            b3 = 0;
                        }
                        i43++;
                        i40++;
                    }
                    if (i43 != xfVarL4.c) {
                        sugVar.q(xfVarL4);
                        xfVarL4 = a82Var.L(4, i42, i43);
                    }
                    if (b3 == 0) {
                        a82Var.y(xfVarL4);
                    } else {
                        a82Var.M(xfVarL4);
                    }
                } else if (i35 == 8) {
                    a82Var.M(xfVarL4);
                }
            }
            arrayList.clear();
        } else {
            gg8Var = gg8Var3;
            widVar = widVar4;
            a82Var.v();
        }
        boolean z7 = this.v1 || this.w1;
        if (!this.L0 || this.b1 == null || (!(z2 = this.S0) && !z7 && !this.E0.e)) {
            z = false;
        } else if (z2) {
            this.z.getClass();
            z = false;
        } else {
            z = true;
        }
        blbVar.i = z;
        blbVar.j = z && z7 && !this.S0 && this.b1 != null && this.E0.r0();
        View focusedChild = (this.o1 && hasFocus() && this.z != null) ? getFocusedChild() : null;
        flb flbVarE = (focusedChild == null || (viewY = y(focusedChild)) == null) ? null : E(viewY);
        if (flbVarE == null) {
            blbVar.l = -1L;
            blbVar.k = -1;
            blbVar.m = -1;
        } else {
            this.z.getClass();
            blbVar.l = -1L;
            if (this.S0) {
                iD = -1;
            } else if (flbVarE.g()) {
                iD = flbVarE.d;
            } else {
                RecyclerView recyclerView = flbVarE.q;
                if (recyclerView == null) {
                    iD = -1;
                } else {
                    iD = recyclerView.D(flbVarE);
                }
            }
            blbVar.k = iD;
            View focusedChild2 = flbVarE.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            blbVar.m = id;
        }
        blbVar.g = blbVar.i && this.w1;
        this.w1 = false;
        this.v1 = false;
        blbVar.f = blbVar.j;
        blbVar.d = this.z.a();
        A(this.A1);
        boolean z8 = blbVar.i;
        int i44 = 5;
        ta0 ta0Var = this.f;
        if (z8) {
            int iR = ta0Var.r();
            int i45 = 0;
            while (i45 < iR) {
                flb flbVarF = F(ta0Var.q(i45));
                if (flbVarF.n()) {
                    gg8Var2 = gg8Var;
                    widVar2 = widVar;
                } else if (flbVarF.e()) {
                    this.z.getClass();
                    gg8Var2 = gg8Var;
                    widVar2 = widVar;
                } else {
                    rkb rkbVar = this.b1;
                    rkb.b(flbVarF);
                    flbVarF.c();
                    rkbVar.getClass();
                    h71 h71Var = new h71(i44, (byte) 0);
                    h71Var.b(flbVarF);
                    widVar2 = widVar;
                    wvf wvfVarA = (wvf) widVar2.get(flbVarF);
                    if (wvfVarA == null) {
                        wvfVarA = wvf.a();
                        widVar2.put(flbVarF, wvfVarA);
                    }
                    wvfVarA.b = h71Var;
                    wvfVarA.a |= 4;
                    if (!blbVar.g || !flbVarF.j() || flbVarF.g() || flbVarF.n() || flbVarF.e()) {
                        gg8Var2 = gg8Var;
                    } else {
                        this.z.getClass();
                        gg8Var2 = gg8Var;
                        gg8Var2.e(flbVarF.c, flbVarF);
                    }
                }
                i45++;
                gg8Var = gg8Var2;
                widVar = widVar2;
            }
        }
        wid widVar5 = widVar;
        if (blbVar.j) {
            int iC = ta0Var.C();
            for (int i46 = 0; i46 < iC; i46++) {
                flb flbVarF2 = F(ta0Var.A(i46));
                if (!flbVarF2.n() && flbVarF2.d == -1) {
                    flbVarF2.d = flbVarF2.c;
                }
            }
            boolean z9 = blbVar.e;
            blbVar.e = false;
            this.E0.W(this.c, blbVar);
            blbVar.e = z9;
            for (int i47 = 0; i47 < ta0Var.r(); i47++) {
                flb flbVarF3 = F(ta0Var.q(i47));
                if (!flbVarF3.n() && ((wvfVar = (wvf) widVar5.get(flbVarF3)) == null || (wvfVar.a & 4) == 0)) {
                    rkb.b(flbVarF3);
                    boolean z10 = (flbVarF3.i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0;
                    rkb rkbVar2 = this.b1;
                    flbVarF3.c();
                    rkbVar2.getClass();
                    h71 h71Var2 = new h71(i44, (byte) 0);
                    h71Var2.b(flbVarF3);
                    if (z10) {
                        Q(flbVarF3, h71Var2);
                    } else {
                        wvf wvfVarA2 = (wvf) widVar5.get(flbVarF3);
                        if (wvfVarA2 == null) {
                            wvfVarA2 = wvf.a();
                            widVar5.put(flbVarF3, wvfVarA2);
                        }
                        wvfVarA2.a |= 2;
                        wvfVarA2.b = h71Var2;
                    }
                }
            }
            h();
        } else {
            h();
        }
        N(true);
        a0(false);
        blbVar.c = 2;
    }

    public final void o() {
        Z();
        M();
        blb blbVar = this.s1;
        blbVar.a(6);
        this.e.v();
        blbVar.d = this.z.a();
        blbVar.b = 0;
        if (this.d != null) {
            nkb nkbVar = this.z;
            nkbVar.getClass();
            int iB = kv2.B(1);
            if (iB == 1 ? nkbVar.a() > 0 : iB != 2) {
                Parcelable parcelable = this.d.c;
                if (parcelable != null) {
                    this.E0.Y(parcelable);
                }
                this.d = null;
            }
        }
        blbVar.f = false;
        this.E0.W(this.c, blbVar);
        blbVar.e = false;
        blbVar.i = blbVar.i && this.b1 != null;
        blbVar.c = 4;
        N(true);
        a0(false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.U0 = 0;
        this.J0 = true;
        this.L0 = this.L0 && !isLayoutRequested();
        this.c.h();
        tkb tkbVar = this.E0;
        if (tkbVar != null) {
            tkbVar.f = true;
        }
        this.y1 = false;
        if (O1) {
            ThreadLocal threadLocal = r46.e;
            r46 r46Var = (r46) threadLocal.get();
            this.q1 = r46Var;
            if (r46Var == null) {
                r46 r46Var2 = new r46();
                r46Var2.a = new ArrayList();
                r46Var2.d = new ArrayList();
                this.q1 = r46Var2;
                WeakHashMap weakHashMap = nvf.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                r46 r46Var3 = this.q1;
                r46Var3.c = (long) (1.0E9f / refreshRate);
                threadLocal.set(r46Var3);
            }
            this.q1.a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        r46 r46Var;
        super.onDetachedFromWindow();
        rkb rkbVar = this.b1;
        if (rkbVar != null) {
            rkbVar.e();
        }
        int i = 0;
        setScrollState(0);
        elb elbVar = this.p1;
        elbVar.g.removeCallbacks(elbVar);
        elbVar.c.abortAnimation();
        this.J0 = false;
        tkb tkbVar = this.E0;
        if (tkbVar != null) {
            tkbVar.f = false;
            tkbVar.L(this);
        }
        this.F1.clear();
        removeCallbacks(this.G1);
        this.g.getClass();
        while (wvf.d.a() != null) {
        }
        gp3 gp3Var = this.c;
        ArrayList arrayList = (ArrayList) gp3Var.e;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            od4.j(((flb) arrayList.get(i2)).a);
        }
        gp3Var.i(((RecyclerView) gp3Var.h).z, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = od4.u(childAt).a;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((pvf) arrayList2.get(size)).a.e();
                }
            }
            i = i3;
        }
        if (!O1 || (r46Var = this.q1) == null) {
            return;
        }
        r46Var.a.remove(this);
        this.q1 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.G0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ua5) arrayList.get(i)).getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.E0 != null && !this.O0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.E0.d() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.E0.c() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.E0.d()) {
                    f = -axisValue2;
                } else if (this.E0.c()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i = (int) (axisValue * this.m1);
                int i2 = (int) (f * this.n1);
                tkb tkbVar = this.E0;
                if (tkbVar == null) {
                    b1.d("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return false;
                }
                if (!this.O0) {
                    int[] iArr = this.E1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zC = tkbVar.c();
                    boolean zD = this.E0.d();
                    int i3 = zD ? (zC ? 1 : 0) | 2 : zC ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iR = i - R(i, y);
                    int iS = i2 - S(i2, x);
                    getScrollingChildHelper().g(i3, 1);
                    if (p(zC ? iR : 0, zD ? iS : 0, 1, this.E1, this.C1)) {
                        iR -= iArr[0];
                        iS -= iArr[1];
                    }
                    V(zC ? iR : 0, zD ? iS : 0, motionEvent, 1);
                    r46 r46Var = this.q1;
                    if (r46Var != null && (iR != 0 || iS != 0)) {
                        r46Var.a(this, iR, iS);
                    }
                    b0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.O0) {
            this.I0 = null;
            if (z(motionEvent)) {
                U();
                setScrollState(0);
                return true;
            }
            tkb tkbVar = this.E0;
            if (tkbVar != null) {
                boolean zC = tkbVar.c();
                boolean zD = this.E0.d();
                VelocityTracker velocityTrackerObtain = this.e1;
                if (velocityTrackerObtain == null) {
                    velocityTrackerObtain = VelocityTracker.obtain();
                    this.e1 = velocityTrackerObtain;
                }
                velocityTrackerObtain.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.P0) {
                        this.P0 = false;
                    }
                    this.d1 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.h1 = x;
                    this.f1 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.i1 = y;
                    this.g1 = y;
                    EdgeEffect edgeEffect = this.X0;
                    if (edgeEffect == null || an1.z(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        an1.H(this.X0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.Z0;
                    boolean z3 = z;
                    if (edgeEffect2 != null && an1.z(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        z3 = z;
                        z3 = z;
                        an1.H(this.Z0, 0.0f, motionEvent.getY() / getHeight());
                        z3 = true;
                    }
                    z3 = z;
                    z3 = z;
                    z3 = z;
                    EdgeEffect edgeEffect3 = this.Y0;
                    boolean z4 = z3;
                    if (edgeEffect3 != null && an1.z(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        z4 = z3;
                        z4 = z3;
                        an1.H(this.Y0, 0.0f, motionEvent.getX() / getWidth());
                        z4 = true;
                    }
                    z4 = z3;
                    z4 = z3;
                    z4 = z3;
                    EdgeEffect edgeEffect4 = this.a1;
                    boolean z5 = z4;
                    if (edgeEffect4 != null && an1.z(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        z5 = z4;
                        z5 = z4;
                        an1.H(this.a1, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z5 = true;
                    }
                    if (z5 || this.c1 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        b0(1);
                    }
                    int[] iArr = this.D1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zC;
                    if (zD) {
                        i = (zC ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.e1.clear();
                    b0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.d1);
                    if (iFindPointerIndex < 0) {
                        b1.d("RecyclerView", "Error processing scroll; pointer index for id " + this.d1 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.c1 != 1) {
                        int i2 = x2 - this.f1;
                        int i3 = y2 - this.g1;
                        if (!zC || Math.abs(i2) <= this.j1) {
                            z2 = false;
                        } else {
                            this.h1 = x2;
                            z2 = true;
                        }
                        if (zD && Math.abs(i3) > this.j1) {
                            this.i1 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    U();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.d1 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.h1 = x3;
                    this.f1 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.i1 = y3;
                    this.g1 = y3;
                } else if (actionMasked == 6) {
                    O(motionEvent);
                }
                if (this.c1 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = x0f.a;
        Trace.beginSection("RV OnLayout");
        m();
        Trace.endSection();
        this.L0 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        tkb tkbVar = this.E0;
        if (tkbVar == null) {
            l(i, i2);
            return;
        }
        boolean zF = tkbVar.F();
        boolean z = false;
        blb blbVar = this.s1;
        if (!zF) {
            if (this.K0) {
                this.E0.b.l(i, i2);
                return;
            }
            if (blbVar.j) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            nkb nkbVar = this.z;
            if (nkbVar != null) {
                blbVar.d = nkbVar.a();
            } else {
                blbVar.d = 0;
            }
            Z();
            this.E0.b.l(i, i2);
            a0(false);
            blbVar.f = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.E0.b.l(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        this.H1 = z;
        if (z || this.z == null) {
            return;
        }
        if (blbVar.c == 1) {
            n();
        }
        this.E0.k0(i, i2);
        blbVar.h = true;
        o();
        this.E0.m0(i, i2);
        if (this.E0.p0()) {
            this.E0.k0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            blbVar.h = true;
            o();
            this.E0.m0(i, i2);
        }
        this.I1 = getMeasuredWidth();
        this.J1 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (J()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof alb)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        alb albVar = (alb) parcelable;
        this.d = albVar;
        super.onRestoreInstanceState(albVar.a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        alb albVar = new alb(super.onSaveInstanceState());
        alb albVar2 = this.d;
        if (albVar2 != null) {
            albVar.c = albVar2.c;
            return albVar;
        }
        tkb tkbVar = this.E0;
        if (tkbVar != null) {
            albVar.c = tkbVar.Z();
            return albVar;
        }
        albVar.c = null;
        return albVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.a1 = null;
        this.Y0 = null;
        this.Z0 = null;
        this.X0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x033f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0381  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f5 A[PHI: r1
  0x01f5: PHI (r1v58 int) = (r1v42 int), (r1v62 int) binds: [B:90:0x01e0, B:95:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int iMax;
        int i2;
        boolean z2;
        if (!this.O0 && !this.P0) {
            ua5 ua5Var = this.I0;
            if (ua5Var == null) {
                z = motionEvent.getAction() == 0 ? false : z(motionEvent);
            } else {
                int i3 = ua5Var.b;
                if (ua5Var.v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zB = ua5Var.b(motionEvent.getX(), motionEvent.getY());
                        boolean zA = ua5Var.a(motionEvent.getX(), motionEvent.getY());
                        if (zB || zA) {
                            if (zA) {
                                ua5Var.w = 1;
                                ua5Var.p = (int) motionEvent.getX();
                            } else if (zB) {
                                ua5Var.w = 2;
                                ua5Var.m = (int) motionEvent.getY();
                            }
                            ua5Var.d(2);
                        }
                    } else if (motionEvent.getAction() == 1 && ua5Var.v == 2) {
                        ua5Var.m = 0.0f;
                        ua5Var.p = 0.0f;
                        ua5Var.d(1);
                        ua5Var.w = 0;
                    } else if (motionEvent.getAction() == 2 && ua5Var.v == 2) {
                        ua5Var.e();
                        if (ua5Var.w == 1) {
                            float x = motionEvent.getX();
                            int[] iArr = ua5Var.y;
                            iArr[0] = i3;
                            int i4 = ua5Var.q - i3;
                            iArr[1] = i4;
                            float fMax = Math.max(i3, Math.min(i4, x));
                            if (Math.abs(ua5Var.o - fMax) >= 2.0f) {
                                int iC = ua5.c(ua5Var.p, fMax, iArr, ua5Var.s.computeHorizontalScrollRange(), ua5Var.s.computeHorizontalScrollOffset(), ua5Var.q);
                                if (iC != 0) {
                                    ua5Var.s.scrollBy(iC, 0);
                                }
                                ua5Var.p = fMax;
                            }
                        }
                        if (ua5Var.w == 2) {
                            float y = motionEvent.getY();
                            int[] iArr2 = ua5Var.x;
                            iArr2[0] = i3;
                            int i5 = ua5Var.r - i3;
                            iArr2[1] = i5;
                            float fMax2 = Math.max(i3, Math.min(i5, y));
                            if (Math.abs(ua5Var.l - fMax2) >= 2.0f) {
                                int iC2 = ua5.c(ua5Var.m, fMax2, iArr2, ua5Var.s.computeVerticalScrollRange(), ua5Var.s.computeVerticalScrollOffset(), ua5Var.r);
                                if (iC2 != 0) {
                                    ua5Var.s.scrollBy(0, iC2);
                                }
                                ua5Var.m = fMax2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.I0 = null;
                }
                z = true;
            }
            if (z) {
                U();
                setScrollState(0);
                return true;
            }
            tkb tkbVar = this.E0;
            if (tkbVar != null) {
                boolean zC = tkbVar.c();
                boolean zD = this.E0.d();
                if (this.e1 == null) {
                    this.e1 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.D1;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.e1.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker = this.e1;
                        int i6 = this.l1;
                        velocityTracker.computeCurrentVelocity(1000, i6);
                        float f = zC ? -this.e1.getXVelocity(this.d1) : 0.0f;
                        float f2 = zD ? -this.e1.getYVelocity(this.d1) : 0.0f;
                        if (f == 0.0f && f2 == 0.0f) {
                            setScrollState(0);
                        } else {
                            int i7 = (int) f;
                            int iMax2 = (int) f2;
                            tkb tkbVar2 = this.E0;
                            if (tkbVar2 == null) {
                                b1.d("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.O0) {
                                boolean zC2 = tkbVar2.c();
                                boolean zD2 = this.E0.d();
                                int i8 = this.k1;
                                if (!zC2 || Math.abs(i7) < i8) {
                                    i7 = 0;
                                }
                                if (!zD2 || Math.abs(iMax2) < i8) {
                                    iMax2 = 0;
                                }
                                if (i7 != 0 || iMax2 != 0) {
                                    if (i7 == 0) {
                                        iMax = 0;
                                    } else {
                                        EdgeEffect edgeEffect = this.X0;
                                        if (edgeEffect == null || an1.z(edgeEffect) == 0.0f) {
                                            EdgeEffect edgeEffect2 = this.Z0;
                                            if (edgeEffect2 == null || an1.z(edgeEffect2) == 0.0f) {
                                                iMax = 0;
                                            } else if (X(this.Z0, i7, getWidth())) {
                                                this.Z0.onAbsorb(i7);
                                                i7 = 0;
                                            }
                                        } else {
                                            int i9 = -i7;
                                            if (X(this.X0, i9, getWidth())) {
                                                this.X0.onAbsorb(i9);
                                                i7 = 0;
                                            }
                                        }
                                        iMax = i7;
                                        i7 = 0;
                                    }
                                    if (iMax2 == 0) {
                                        i2 = iMax2;
                                        iMax2 = 0;
                                    } else {
                                        EdgeEffect edgeEffect3 = this.Y0;
                                        if (edgeEffect3 == null || an1.z(edgeEffect3) == 0.0f) {
                                            EdgeEffect edgeEffect4 = this.a1;
                                            if (edgeEffect4 == null || an1.z(edgeEffect4) == 0.0f) {
                                                i2 = iMax2;
                                                iMax2 = 0;
                                            } else if (X(this.a1, iMax2, getHeight())) {
                                                this.a1.onAbsorb(iMax2);
                                                iMax2 = 0;
                                            }
                                        } else {
                                            int i10 = -iMax2;
                                            if (X(this.Y0, i10, getHeight())) {
                                                this.Y0.onAbsorb(i10);
                                                iMax2 = 0;
                                            }
                                        }
                                        i2 = 0;
                                    }
                                    elb elbVar = this.p1;
                                    if (iMax != 0 || iMax2 != 0) {
                                        int i11 = -i6;
                                        iMax = Math.max(i11, Math.min(iMax, i6));
                                        iMax2 = Math.max(i11, Math.min(iMax2, i6));
                                        elbVar.a(iMax, iMax2);
                                    }
                                    if (i7 != 0 || i2 != 0) {
                                        float f3 = i7;
                                        float f4 = i2;
                                        if (!dispatchNestedPreFling(f3, f4)) {
                                            boolean z3 = zC2 || zD2;
                                            dispatchNestedFling(f3, f4, z3);
                                            int i12 = zC2;
                                            if (z3) {
                                                if (zD2) {
                                                    i12 = (zC2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i12, 1);
                                                int i13 = -i6;
                                                elbVar.a(Math.max(i13, Math.min(i7, i6)), Math.max(i13, Math.min(i2, i6)));
                                            }
                                        }
                                    } else if (iMax == 0 && iMax2 == 0) {
                                    }
                                }
                            }
                            setScrollState(0);
                        }
                        U();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.d1);
                        if (iFindPointerIndex < 0) {
                            b1.d("RecyclerView", "Error processing scroll; pointer index for id " + this.d1 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax3 = this.h1 - x2;
                        int iMax4 = this.i1 - y2;
                        if (this.c1 != 1) {
                            if (zC) {
                                int i14 = this.j1;
                                iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - i14) : Math.min(0, iMax3 + i14);
                                if (iMax3 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = false;
                            }
                            if (zD) {
                                int i15 = this.j1;
                                iMax4 = iMax4 > 0 ? Math.max(0, iMax4 - i15) : Math.min(0, iMax4 + i15);
                                if (iMax4 != 0) {
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                        if (this.c1 == 1) {
                            int[] iArr4 = this.E1;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            int iR = iMax3 - R(iMax3, motionEvent.getY());
                            int iS = iMax4 - S(iMax4, motionEvent.getX());
                            boolean zP = p(zC ? iR : 0, zD ? iS : 0, 0, this.E1, this.C1);
                            int[] iArr5 = this.C1;
                            if (zP) {
                                iR -= iArr4[0];
                                iS -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i16 = iR;
                            int i17 = iS;
                            this.h1 = x2 - iArr5[0];
                            this.i1 = y2 - iArr5[1];
                            if (V(zC ? i16 : 0, zD ? i17 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            r46 r46Var = this.q1;
                            if (r46Var != null && (i16 != 0 || i17 != 0)) {
                                r46Var.a(this, i16, i17);
                            }
                        }
                    } else if (actionMasked == 3) {
                        U();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.d1 = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.h1 = x3;
                        this.f1 = x3;
                        int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.i1 = y3;
                        this.g1 = y3;
                    } else if (actionMasked == 6) {
                        O(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.d1 = motionEvent.getPointerId(0);
                int x4 = (int) (motionEvent.getX() + 0.5f);
                this.h1 = x4;
                this.f1 = x4;
                int y4 = (int) (motionEvent.getY() + 0.5f);
                this.i1 = y4;
                this.g1 = y4;
                if (zD) {
                    i = zC;
                    i = (zC ? 1 : 0) | 2;
                }
                i = zC;
                getScrollingChildHelper().g(i, 0);
                this.e1.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final boolean p(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void q(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void r(int i, int i2) {
        this.V0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        wkb wkbVar = this.t1;
        if (wkbVar != null) {
            wkbVar.a(this);
        }
        ArrayList arrayList = this.u1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((wkb) this.u1.get(size)).a(this);
            }
        }
        this.V0--;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        flb flbVarF = F(view);
        if (flbVarF != null) {
            if (flbVarF.i()) {
                flbVarF.i &= -257;
            } else if (!flbVarF.n()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(flbVarF);
                qc0.l(sb, w());
                return;
            }
        }
        view.clearAnimation();
        F(view);
        nkb nkbVar = this.z;
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.E0.getClass();
        if (!J() && view2 != null) {
            T(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.E0.f0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.H0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ua5) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.M0 != 0 || this.O0) {
            this.N0 = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        if (this.a1 != null) {
            return;
        }
        ((clb) this.W0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.a1 = edgeEffect;
        if (this.v) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        tkb tkbVar = this.E0;
        if (tkbVar == null) {
            b1.d("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.O0) {
            return;
        }
        boolean zC = tkbVar.c();
        boolean zD = this.E0.d();
        if (zC || zD) {
            if (!zC) {
                i = 0;
            }
            if (!zD) {
                i2 = 0;
            }
            V(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        b1.l("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!J()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.Q0 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(hlb hlbVar) {
        this.z1 = hlbVar;
        nvf.j(this, hlbVar);
    }

    public void setAdapter(nkb nkbVar) {
        setLayoutFrozen(false);
        nkb nkbVar2 = this.z;
        eu4 eu4Var = this.b;
        if (nkbVar2 != null) {
            nkbVar2.a.unregisterObserver(eu4Var);
            this.z.getClass();
        }
        rkb rkbVar = this.b1;
        if (rkbVar != null) {
            rkbVar.e();
        }
        tkb tkbVar = this.E0;
        gp3 gp3Var = this.c;
        if (tkbVar != null) {
            tkbVar.b0(gp3Var);
            this.E0.c0(gp3Var);
        }
        ((ArrayList) gp3Var.c).clear();
        gp3Var.k();
        a82 a82Var = this.e;
        a82Var.N((ArrayList) a82Var.b);
        a82Var.N((ArrayList) a82Var.d);
        nkb nkbVar3 = this.z;
        this.z = nkbVar;
        if (nkbVar != null) {
            nkbVar.a.registerObserver(eu4Var);
        }
        tkb tkbVar2 = this.E0;
        if (tkbVar2 != null) {
            tkbVar2.K();
        }
        nkb nkbVar4 = this.z;
        ((ArrayList) gp3Var.c).clear();
        gp3Var.k();
        gp3Var.i(nkbVar3, true);
        ykb ykbVarD = gp3Var.d();
        if (nkbVar3 != null) {
            ykbVarD.b--;
        }
        if (ykbVarD.b == 0) {
            SparseArray sparseArray = ykbVarD.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                xkb xkbVar = (xkb) sparseArray.valueAt(i);
                Iterator it = xkbVar.a.iterator();
                while (it.hasNext()) {
                    od4.j(((flb) it.next()).a);
                }
                xkbVar.a.clear();
            }
        }
        if (nkbVar4 != null) {
            ykbVarD.b++;
        }
        gp3Var.h();
        this.s1.e = true;
        this.T0 = this.T0;
        this.S0 = true;
        ta0 ta0Var = this.f;
        int iC = ta0Var.C();
        for (int i2 = 0; i2 < iC; i2++) {
            flb flbVarF = F(ta0Var.A(i2));
            if (flbVarF != null && !flbVarF.n()) {
                flbVarF.a(6);
            }
        }
        K();
        ArrayList arrayList = (ArrayList) gp3Var.e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            flb flbVar = (flb) arrayList.get(i3);
            if (flbVar != null) {
                flbVar.a(6);
                flbVar.a(UserMetadata.MAX_ATTRIBUTE_SIZE);
            }
        }
        gp3Var.k();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(pkb pkbVar) {
        if (pkbVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.v) {
            this.a1 = null;
            this.Y0 = null;
            this.Z0 = null;
            this.X0 = null;
        }
        this.v = z;
        super.setClipToPadding(z);
        if (this.L0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(qkb qkbVar) {
        qkbVar.getClass();
        this.W0 = qkbVar;
        this.a1 = null;
        this.Y0 = null;
        this.Z0 = null;
        this.X0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.K0 = z;
    }

    public void setItemAnimator(rkb rkbVar) {
        rkb rkbVar2 = this.b1;
        if (rkbVar2 != null) {
            rkbVar2.e();
            this.b1.a = null;
        }
        this.b1 = rkbVar;
        if (rkbVar != null) {
            rkbVar.a = this.x1;
        }
    }

    public void setItemViewCacheSize(int i) {
        gp3 gp3Var = this.c;
        gp3Var.a = i;
        gp3Var.r();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(tkb tkbVar) {
        RecyclerView recyclerView;
        if (tkbVar == this.E0) {
            return;
        }
        setScrollState(0);
        elb elbVar = this.p1;
        elbVar.g.removeCallbacks(elbVar);
        elbVar.c.abortAnimation();
        tkb tkbVar2 = this.E0;
        gp3 gp3Var = this.c;
        if (tkbVar2 != null) {
            rkb rkbVar = this.b1;
            if (rkbVar != null) {
                rkbVar.e();
            }
            this.E0.b0(gp3Var);
            this.E0.c0(gp3Var);
            ((ArrayList) gp3Var.c).clear();
            gp3Var.k();
            if (this.J0) {
                tkb tkbVar3 = this.E0;
                tkbVar3.f = false;
                tkbVar3.L(this);
            }
            this.E0.n0(null);
            this.E0 = null;
        } else {
            ((ArrayList) gp3Var.c).clear();
            gp3Var.k();
        }
        ta0 ta0Var = this.f;
        ((zy1) ta0Var.d).x();
        ArrayList arrayList = (ArrayList) ta0Var.b;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((g5b) ta0Var.c).b;
            if (size < 0) {
                break;
            }
            flb flbVarF = F((View) arrayList.get(size));
            if (flbVarF != null) {
                int i = flbVarF.o;
                if (recyclerView.J()) {
                    flbVarF.p = i;
                    recyclerView.F1.add(flbVarF);
                } else {
                    View view = flbVarF.a;
                    WeakHashMap weakHashMap = nvf.a;
                    view.setImportantForAccessibility(i);
                }
                flbVarF.o = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            F(childAt);
            nkb nkbVar = recyclerView.z;
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.E0 = tkbVar;
        if (tkbVar != null) {
            if (tkbVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(tkbVar);
                s8f.l(sb, " is already attached to a RecyclerView:", tkbVar.b.w());
                return;
            } else {
                tkbVar.n0(this);
                if (this.J0) {
                    this.E0.f = true;
                }
            }
        }
        gp3Var.r();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            qc0.j("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        ad9 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = nvf.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    @Deprecated
    public void setOnScrollListener(wkb wkbVar) {
        this.t1 = wkbVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.o1 = z;
    }

    public void setRecycledViewPool(ykb ykbVar) {
        gp3 gp3Var = this.c;
        RecyclerView recyclerView = (RecyclerView) gp3Var.h;
        gp3Var.i(recyclerView.z, false);
        ykb ykbVar2 = (ykb) gp3Var.g;
        if (ykbVar2 != null) {
            ykbVar2.b--;
        }
        gp3Var.g = ykbVar;
        if (ykbVar != null && recyclerView.getAdapter() != null) {
            ((ykb) gp3Var.g).b++;
        }
        gp3Var.h();
    }

    public void setScrollState(int i) {
        if (i == this.c1) {
            return;
        }
        this.c1 = i;
        if (i != 2) {
            elb elbVar = this.p1;
            elbVar.g.removeCallbacks(elbVar);
            elbVar.c.abortAnimation();
        }
        tkb tkbVar = this.E0;
        if (tkbVar != null) {
            tkbVar.a0(i);
        }
        ArrayList arrayList = this.u1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((wkb) this.u1.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.j1 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            b1.l("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.j1 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(dlb dlbVar) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.O0) {
            f("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.O0 = false;
                if (this.N0 && this.E0 != null && this.z != null) {
                    requestLayout();
                }
                this.N0 = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.O0 = true;
            this.P0 = true;
            setScrollState(0);
            elb elbVar = this.p1;
            elbVar.g.removeCallbacks(elbVar);
            elbVar.c.abortAnimation();
        }
    }

    public final void t() {
        if (this.X0 != null) {
            return;
        }
        ((clb) this.W0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.X0 = edgeEffect;
        if (this.v) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void u() {
        if (this.Z0 != null) {
            return;
        }
        ((clb) this.W0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Z0 = edgeEffect;
        if (this.v) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void v() {
        if (this.Y0 != null) {
            return;
        }
        ((clb) this.W0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Y0 = edgeEffect;
        if (this.v) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String w() {
        return " " + super.toString() + ", adapter:" + this.z + ", layout:" + this.E0 + ", context:" + getContext();
    }

    public final void x(blb blbVar) {
        if (getScrollState() != 2) {
            blbVar.getClass();
            return;
        }
        OverScroller overScroller = this.p1.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        blbVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[SYNTHETIC] */
    public final boolean z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.H0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ua5 ua5Var = (ua5) arrayList.get(i);
            int i2 = ua5Var.v;
            if (i2 == 1) {
                boolean zB = ua5Var.b(motionEvent.getX(), motionEvent.getY());
                boolean zA = ua5Var.a(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zB || zA)) {
                    if (zA) {
                        ua5Var.w = 1;
                        ua5Var.p = (int) motionEvent.getX();
                    } else if (zB) {
                        ua5Var.w = 2;
                        ua5Var.m = (int) motionEvent.getY();
                    }
                    ua5Var.d(2);
                    if (action != 3) {
                        this.I0 = ua5Var;
                        return true;
                    }
                }
            } else if (i2 != 2) {
                continue;
            } else if (action != 3) {
                this.I0 = ua5Var;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        tkb tkbVar = this.E0;
        if (tkbVar != null) {
            return tkbVar.s(layoutParams);
        }
        qc0.p("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    public void setOnFlingListener(vkb vkbVar) {
    }

    @Deprecated
    public void setRecyclerListener(zkb zkbVar) {
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}

package defpackage;

import ai.askquin.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ox5 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox5(Context context, AttributeSet attributeSet, zx5 zx5Var) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbb.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        kx5 kx5VarB = zx5Var.B(id);
        if (classAttribute != null && kx5VarB == null) {
            if (id == -1) {
                qc0.p(ib8.j("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            tx5 tx5VarF = zx5Var.F();
            context.getClassLoader();
            kx5 kx5VarA = tx5VarF.a(classAttribute);
            kx5VarA.getClass();
            kx5VarA.M0 = id;
            kx5VarA.N0 = id;
            kx5VarA.O0 = string;
            kx5VarA.I0 = zx5Var;
            mx5 mx5Var = zx5Var.w;
            kx5VarA.J0 = mx5Var;
            kx5VarA.T0 = true;
            if ((mx5Var == null ? null : mx5Var.G0) != null) {
                kx5VarA.T0 = true;
            }
            hs0 hs0Var = new hs0(zx5Var);
            hs0Var.o = true;
            kx5VarA.U0 = this;
            kx5VarA.E0 = true;
            hs0Var.f(getId(), kx5VarA, string);
            if (hs0Var.g) {
                qc0.p("This transaction is already being added to the back stack");
                throw null;
            }
            zx5 zx5Var2 = hs0Var.q;
            if (zx5Var2.w != null && !zx5Var2.J) {
                zx5Var2.y(true);
                hs0 hs0Var2 = zx5Var2.h;
                if (hs0Var2 != null) {
                    hs0Var2.r = false;
                    hs0Var2.d();
                    if (zx5.I(3)) {
                        Log.d("FragmentManager", "Reversing mTransitioningOp " + zx5Var2.h + " as part of execSingleAction for action " + hs0Var);
                    }
                    zx5Var2.h.e(false, false);
                    zx5Var2.h.a(zx5Var2.L, zx5Var2.M);
                    Iterator it = zx5Var2.h.a.iterator();
                    while (it.hasNext()) {
                        kx5 kx5Var = ((ky5) it.next()).b;
                        if (kx5Var != null) {
                            kx5Var.X = false;
                        }
                    }
                    zx5Var2.h = null;
                }
                hs0Var.a(zx5Var2.L, zx5Var2.M);
                zx5Var2.b = true;
                try {
                    zx5Var2.S(zx5Var2.L, zx5Var2.M);
                    zx5Var2.d();
                    zx5Var2.d0();
                    if (zx5Var2.K) {
                        zx5Var2.K = false;
                        zx5Var2.b0();
                    }
                    ((HashMap) zx5Var2.c.c).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    zx5Var2.d();
                    throw th;
                }
            }
        }
        Iterator it2 = zx5Var.c.H().iterator();
        while (it2.hasNext()) {
            kx5 kx5Var2 = ((fy5) it2.next()).c;
            getId();
        }
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof kx5 ? (kx5) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            r82.e(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        h8g h8gVarC;
        windowInsets.getClass();
        h8g h8gVarC2 = h8g.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            h8gVarC = h8g.c(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = nvf.a;
            WindowInsets windowInsetsB = h8gVarC2.b();
            if (windowInsetsB != null && !windowInsetsB.equals(windowInsetsB)) {
                h8gVarC2 = h8g.c(windowInsetsB, this);
            }
            h8gVarC = h8gVarC2;
        }
        if (!h8gVarC.a.s()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                nvf.b(getChildAt(i), h8gVarC);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.d) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.d) {
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends kx5> F getFragment() {
        kx5 kx5Var;
        nx5 nx5Var;
        zx5 zx5VarQ;
        View view = this;
        while (true) {
            if (view == null) {
                kx5Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            kx5Var = tag instanceof kx5 ? (kx5) tag : null;
            if (kx5Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (kx5Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    nx5Var = null;
                    break;
                }
                if (context instanceof nx5) {
                    nx5Var = (nx5) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (nx5Var == null) {
                yg5.k(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            zx5VarQ = nx5Var.q();
        } else {
            if (!kx5Var.n()) {
                throw new IllegalStateException("The Fragment " + kx5Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            zx5VarQ = kx5Var.f();
        }
        return (F) zx5VarQ.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }
}

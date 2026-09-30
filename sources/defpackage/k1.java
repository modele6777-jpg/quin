package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k1 extends ViewGroup {
    public WeakReference a;
    public IBinder b;
    public kcg c;
    public lg2 d;
    public qf2 e;
    public smc f;
    public boolean g;
    public boolean v;
    public boolean w;

    public k1(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        hs hsVar = new hs(3, this);
        addOnAttachStateChangeListener(hsVar);
        pvf pvfVar = new pvf(this);
        od4.u(this).a.add(pvfVar);
        this.f = new smc(this, hsVar, pvfVar, 9);
    }

    private final void setParentContext(lg2 lg2Var) {
        if (this.d != lg2Var) {
            this.d = lg2Var;
            if (lg2Var != null) {
                this.a = null;
            }
            kcg kcgVar = this.c;
            if (kcgVar != null) {
                kcgVar.a();
                this.c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.b != iBinder) {
            this.b = iBinder;
            this.a = null;
        }
    }

    public abstract void a(int i, l46 l46Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.e == null) {
                AndroidComposeView androidComposeView = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(l(kn2.G(this), androidComposeView.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.v) {
            return;
        }
        s8f.i(ib8.j("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        qf2 qf2Var;
        if (this.d != null || isAttachedToWindow() || ((qf2Var = this.e) != null && qf2Var.a.isAttachedToWindow())) {
            f();
        } else {
            qc0.p("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void e() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null && androidComposeView.composeViewContextIncrementedDuringInit) {
            androidComposeView.getComposeViewContext().b();
            androidComposeView.composeViewContextIncrementedDuringInit = false;
        }
        kcg kcgVar = this.c;
        if (kcgVar != null) {
            kcgVar.a();
        }
        this.c = null;
        requestLayout();
    }

    public final void f() {
        if (this.c == null) {
            int i = 0;
            try {
                this.v = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    qf2 qf2VarJ = this.e;
                    if (qf2VarJ == null) {
                        qf2VarJ = j();
                    }
                    this.c = qcg.a(this, qf2VarJ, new dd2(new i1(i, this), true, 1003123809));
                    Trace.endSection();
                    this.v = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.v = false;
                throw th2;
            }
        }
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m32getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        km0 km0Var = tag instanceof km0 ? (km0) tag : null;
        if (km0Var != null) {
            return km0Var.a;
        }
        return 1;
    }

    public final qf2 getComposeViewContext$ui() {
        return this.e;
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.g;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.w || super.isTransitionGroup();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final qf2 j() {
        qf2 composeViewContext;
        pwf pwfVar;
        pwf pwfVar2 = null;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                composeViewContext = androidComposeView.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewG = kn2.G(this);
        qf2 qf2VarI = kn2.I(viewG);
        if (qf2VarI != null) {
            return l(viewG, qf2VarI);
        }
        lg2 lg2VarK = k();
        x48 x48VarJ = scc.j(viewG);
        if (x48VarJ == null) {
            x48VarJ = composeViewContext != null ? composeViewContext.d() : null;
            if (x48VarJ == null) {
                qc0.p("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        x48 x48Var = x48VarJ;
        kdc kdcVarI = fdc.i(viewG);
        if (kdcVarI == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                kdcVarI = composeViewContext.e;
                kdcVarI.getClass();
            } else {
                kdcVarI = null;
            }
            if (kdcVarI == null) {
                qc0.p("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        kdc kdcVar = kdcVarI;
        pwf pwfVarD = gdc.d(viewG);
        if (pwfVarD == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                pwfVar2 = composeViewContext.f;
            }
            pwfVar = pwfVar2;
        } else {
            pwfVar = pwfVarD;
        }
        qf2 qf2Var = new qf2(kn2.I(kn2.G(viewG)), viewG, lg2VarK, x48Var, kdcVar, pwfVar);
        viewG.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(qf2Var));
        return qf2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [lg2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [lg2] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [lg2] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [xjb] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    public final lg2 k() {
        lg2 lg2Var;
        ?? A = this.d;
        if (A == 0) {
            A = g9g.a(this);
            if (A == 0) {
                Object parent = getParent();
                while (true) {
                    if (A != 0 || !(parent instanceof View)) {
                        A = A;
                        break;
                    }
                    A = A;
                    View view = (View) parent;
                    lg2 lg2VarA = g9g.a(view);
                    parent = jcc.g(view);
                    A = lg2VarA;
                }
            }
            sjb sjbVar = sjb.b;
            if (A != 0) {
                ?? r3 = (!(A instanceof xjb) || ((sjb) ((xjb) A).u.getValue()).compareTo(sjbVar) > 0) ? A : 0;
                if (r3 != 0) {
                    this.a = new WeakReference(r3);
                }
            } else {
                A = 0;
            }
            if (A == 0) {
                WeakReference weakReference = this.a;
                if (weakReference == null || (lg2Var = (lg2) weakReference.get()) == null || ((lg2Var instanceof xjb) && ((sjb) ((xjb) lg2Var).u.getValue()).compareTo(sjbVar) <= 0)) {
                    A = lg2Var;
                    A = lg2Var;
                    A = 0;
                }
                if (A == 0) {
                    A = g9g.b(this);
                    ?? r2 = ((sjb) A.u.getValue()).compareTo(sjbVar) > 0 ? A : 0;
                    if (r2 != 0) {
                        this.a = new WeakReference(r2);
                    }
                }
            }
        }
        return A;
    }

    public final qf2 l(View view, qf2 qf2Var) {
        lg2 lg2VarK = k();
        x48 x48VarJ = scc.j(view);
        pwf pwfVarD = gdc.d(view);
        kdc kdcVarI = fdc.i(view);
        if (lg2VarK == qf2Var.c() && x48VarJ == qf2Var.d()) {
            qf2Var.g();
            if (pwfVarD == qf2Var.f) {
                qf2Var.g();
                kdc kdcVar = qf2Var.e;
                kdcVar.getClass();
                if (kdcVarI == kdcVar) {
                    return qf2Var;
                }
            }
        }
        if (lg2VarK.k() != qf2Var.c().k()) {
            e();
        }
        if (x48VarJ == null) {
            x48VarJ = qf2Var.d();
        }
        x48 x48Var = x48VarJ;
        if (kdcVarI == null) {
            qf2Var.g();
            kdcVarI = qf2Var.e;
            kdcVarI.getClass();
        }
        qf2 qf2Var2 = new qf2(qf2Var, view, lg2VarK, x48Var, kdcVarI, pwfVarD);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(qf2Var2));
        return qf2Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w79 w79Var = g9g.a;
        Object objG = jcc.g(this);
        View view = this;
        while (objG instanceof View) {
            View view2 = (View) objG;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objG = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new j1(0, this));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m33setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new km0(i));
    }

    public final void setComposeViewContext$ui(qf2 qf2Var) {
        if (this.e != qf2Var) {
            if (qf2Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != qf2Var.c().k()) {
                        e();
                    }
                    androidComposeView.setComposeViewContext(qf2Var);
                }
            }
            this.e = qf2Var;
        }
    }

    public final void setParentCompositionContext(lg2 lg2Var) {
        setParentContext(lg2Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.g = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.w = true;
    }

    public final void setViewCompositionStrategy(qvf qvfVar) {
        smc smcVar = this.f;
        if (smcVar != null) {
            smcVar.invoke();
        }
        ((z8c) qvfVar).getClass();
        hs hsVar = new hs(3, this);
        addOnAttachStateChangeListener(hsVar);
        pvf pvfVar = new pvf(this);
        od4.u(this).a.add(pvfVar);
        this.f = new smc(this, hsVar, pvfVar, 9);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}

package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ax extends ViewGroup implements cd9, ue2, fw9, lm9 {
    public static final zv S0 = new zv(1);
    public kdc E0;
    public final int[] F0;
    public long G0;
    public h8g H0;
    public a26 I0;
    public final vw J0;
    public final vw K0;
    public a26 L0;
    public final int[] M0;
    public int N0;
    public int O0;
    public final h71 P0;
    public boolean Q0;
    public final LayoutNode R0;
    public final sc9 a;
    public final View b;
    public final Owner c;
    public x16 d;
    public boolean e;
    public x16 f;
    public x16 g;
    public j09 v;
    public a26 w;
    public sw3 x;
    public a26 y;
    public x48 z;

    public ax(Context context, j46 j46Var, int i, sc9 sc9Var, View view, Owner owner) {
        super(context);
        this.a = sc9Var;
        this.b = view;
        this.c = owner;
        w79 w79Var = g9g.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, j46Var);
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        uvf uvfVar = (uvf) this;
        ww wwVar = new ww(uvfVar, i2);
        WeakHashMap weakHashMap = nvf.a;
        n7g.a(this, wwVar);
        fvf.c(this, this);
        this.d = new q(23);
        this.f = new q(24);
        this.g = new q(25);
        g09 g09Var = g09.a;
        this.v = g09Var;
        this.x = g21.b();
        int i3 = 2;
        this.F0 = new int[2];
        this.G0 = 0L;
        this.J0 = new vw(uvfVar, i2);
        int i4 = 1;
        this.K0 = new vw(uvfVar, i4);
        this.M0 = new int[2];
        this.N0 = Integer.MIN_VALUE;
        this.O0 = Integer.MIN_VALUE;
        this.P0 = new h71(4, (byte) 0);
        LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.E0 = uvfVar;
        j09 j09VarB = vwc.b(dj6.S(g09Var, cn1.a, sc9Var), true, new zv(i3));
        via viaVar = new via();
        viaVar.a = new uw(uvfVar, i3);
        ymb ymbVar = new ymb();
        ymb ymbVar2 = viaVar.b;
        if (ymbVar2 != null) {
            ymbVar2.b = null;
        }
        viaVar.b = ymbVar;
        ymbVar.b = viaVar;
        setOnRequestDisallowInterceptTouchEvent$ui(ymbVar);
        j09 j09VarD = nk8.w(b21.s(j09VarB.D(viaVar), new w6(uvfVar, layoutNode, uvfVar, 6)), new tw(uvfVar, layoutNode, i2)).D(new g31(new uw(uvfVar, i2)));
        layoutNode.C0(this.v.D(j09VarD));
        this.w = new l0(9, layoutNode, j09VarD);
        layoutNode.y0(this.x);
        this.y = new c1(15, layoutNode);
        layoutNode.b1 = new tw(uvfVar, layoutNode, i4);
        layoutNode.c1 = new uw(uvfVar, i4);
        layoutNode.B0(new xw(uvfVar, layoutNode));
        this.R0 = layoutNode;
    }

    private final gw9 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            i37.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.c.getSnapshotObserver();
    }

    public static x47 j(x47 x47Var, int i, int i2, int i3, int i4) {
        int i5 = x47Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = x47Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = x47Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = x47Var.d - i4;
        return x47.b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    public static int l(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(mh3.o(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static final void m(uvf uvfVar) {
        if (uvfVar.e && uvfVar.isAttachedToWindow() && uvfVar.b.getParent() == uvfVar) {
            gw9 snapshotObserver = uvfVar.getSnapshotObserver();
            snapshotObserver.a.d(uvfVar, S0, uvfVar.d);
        }
    }

    @Override // defpackage.bd9
    public final void a(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            wc9 wc9Var = this.a.a;
            wc9 wc9VarM1 = wc9Var != null ? wc9Var.m1() : null;
            if (wc9VarM1 != null) {
                wc9VarM1.G(jFloatToRawIntBits, i6, jFloatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.ue2
    public final void b() {
        this.g.invoke();
    }

    @Override // defpackage.cd9
    public final void c(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            wc9 wc9Var = this.a.a;
            wc9 wc9VarM1 = wc9Var != null ? wc9Var.m1() : null;
            long jG = wc9VarM1 != null ? wc9VarM1.G(jFloatToRawIntBits, i6, jFloatToRawIntBits2) : 0L;
            iArr[0] = ym8.L(Float.intBitsToFloat((int) (jG >> 32))) * (-1);
            iArr[1] = ym8.L(Float.intBitsToFloat((int) (jG & 4294967295L))) * (-1);
        }
    }

    @Override // defpackage.ue2
    public final void d() {
        this.f.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.bd9
    public final void e(int i, int i2, int i3, int[] iArr) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            wc9 wc9Var = this.a.a;
            wc9 wc9VarM1 = wc9Var != null ? wc9Var.m1() : null;
            long jU = wc9VarM1 != null ? wc9VarM1.U(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = ym8.L(Float.intBitsToFloat((int) (jU >> 32))) * (-1);
            iArr[1] = ym8.L(Float.intBitsToFloat((int) (jU & 4294967295L))) * (-1);
        }
    }

    @Override // defpackage.bd9
    public final boolean f(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.bd9
    public final void g(View view, View view2, int i, int i2) {
        h71 h71Var = this.P0;
        if (i2 == 1) {
            h71Var.c = i;
        } else {
            h71Var.b = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.M0;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final sw3 getDensity() {
        return this.x;
    }

    public final View getInteropView() {
        return this.b;
    }

    public final LayoutNode getLayoutNode() {
        return this.R0;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final x48 getLifecycleOwner() {
        return this.z;
    }

    public final j09 getModifier() {
        return this.v;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        h71 h71Var = this.P0;
        return h71Var.c | h71Var.b;
    }

    public final a26 getOnDensityChanged$ui() {
        return this.y;
    }

    public final a26 getOnModifierChanged$ui() {
        return this.w;
    }

    public final a26 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.L0;
    }

    public final x16 getRelease() {
        return this.g;
    }

    public final x16 getReset() {
        return this.f;
    }

    public final kdc getSavedStateRegistryOwner() {
        return this.E0;
    }

    public final x16 getUpdate() {
        return this.d;
    }

    public final View getView() {
        return this.b;
    }

    @Override // defpackage.bd9
    public final void h(View view, int i) {
        h71 h71Var = this.P0;
        if (i == 1) {
            h71Var.c = 0;
        } else {
            h71Var.b = 0;
        }
    }

    @Override // defpackage.lm9
    public final h8g i(View view, h8g h8gVar) {
        this.H0 = new h8g(h8gVar);
        return k(h8gVar);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.Q0) {
            this.R0.P();
            return null;
        }
        this.b.postOnAnimation(new wp(3, this.K0));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    public final h8g k(h8g h8gVar) {
        e8g e8gVar = h8gVar.a;
        x47 x47VarI = e8gVar.i(-1);
        x47 x47Var = x47.e;
        if (!x47VarI.equals(x47Var) || !e8gVar.j(-9).equals(x47Var) || e8gVar.h() != null) {
            c47 c47Var = (c47) this.R0.V0.d;
            if (c47Var.t1.Y) {
                long jR = qn4.R(c47Var.N(0L));
                int i = (int) (jR >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jR & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jL = vd0.S(c47Var).l();
                int i3 = (int) (jL >> 32);
                int i4 = (int) (jL & 4294967295L);
                long j = c47Var.c;
                long jR2 = qn4.R(c47Var.N((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jR2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jR2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return h8gVar.a.r(i, i2, i5, i7);
                }
            }
        }
        return h8gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J0.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.Q0) {
            this.R0.P();
        } else {
            this.b.postOnAnimation(new wp(3, this.K0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.N0 = i;
        this.O0 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        ynb.V(this.a.c(), null, null, new yw(z, this, q7c.j(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        ynb.V(this.a.c(), null, null, new zw(this, q7c.j(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        a26 a26Var = this.I0;
        if (a26Var == null) {
            return true;
        }
        a26Var.d(rect != null ? ynb.l0(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        a26 a26Var = this.L0;
        if (a26Var != null) {
            a26Var.d(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(sw3 sw3Var) {
        if (sw3Var != this.x) {
            this.x = sw3Var;
            a26 a26Var = this.y;
            if (a26Var != null) {
                a26Var.d(sw3Var);
            }
        }
    }

    public final void setLifecycleOwner(x48 x48Var) {
        if (x48Var != this.z) {
            this.z = x48Var;
            setTag(R.id.view_tree_lifecycle_owner, x48Var);
        }
    }

    public final void setModifier(j09 j09Var) {
        if (j09Var != this.v) {
            this.v = j09Var;
            a26 a26Var = this.w;
            if (a26Var != null) {
                a26Var.d(j09Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(a26 a26Var) {
        this.y = a26Var;
    }

    public final void setOnModifierChanged$ui(a26 a26Var) {
        this.w = a26Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(a26 a26Var) {
        this.L0 = a26Var;
    }

    public final void setRelease(x16 x16Var) {
        this.g = x16Var;
    }

    public final void setReset(x16 x16Var) {
        this.f = x16Var;
    }

    public final void setSavedStateRegistryOwner(kdc kdcVar) {
        if (kdcVar != this.E0) {
            this.E0 = kdcVar;
            setTag(R.id.view_tree_saved_state_registry_owner, kdcVar);
        }
    }

    public final void setUpdate(x16 x16Var) {
        this.d = x16Var;
        this.e = true;
        this.J0.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.fw9
    public final boolean w() {
        return isAttachedToWindow();
    }
}

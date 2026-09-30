package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.bf6;
import defpackage.blb;
import defpackage.d55;
import defpackage.e68;
import defpackage.fz3;
import defpackage.gp3;
import defpackage.i12;
import defpackage.ib8;
import defpackage.nvf;
import defpackage.qc0;
import defpackage.qj0;
import defpackage.s8f;
import defpackage.t6;
import defpackage.tec;
import defpackage.tkb;
import defpackage.ukb;
import io.sentry.android.core.b1;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean D;
    public final int E;
    public int[] F;
    public View[] G;
    public final SparseIntArray H;
    public final SparseIntArray I;
    public final fz3 J;
    public final Rect K;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.D = false;
        this.E = -1;
        this.H = new SparseIntArray();
        this.I = new SparseIntArray();
        fz3 fz3Var = new fz3(10);
        this.J = fz3Var;
        this.K = new Rect();
        int i3 = tkb.C(context, attributeSet, i, i2).b;
        if (i3 == this.E) {
            return;
        }
        this.D = true;
        if (i3 < 1) {
            qc0.j(tec.e(i3, "Span count should be at least 1. Provided "));
            throw null;
        }
        this.E = i3;
        fz3Var.u();
        g0();
    }

    @Override // defpackage.tkb
    public final int D(gp3 gp3Var, blb blbVar) {
        if (this.o == 0) {
            return this.E;
        }
        if (blbVar.b() < 1) {
            return 0;
        }
        return X0(blbVar.b() - 1, gp3Var, blbVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View D0(gp3 gp3Var, blb blbVar, boolean z, boolean z2) {
        int i;
        int iU;
        int iU2 = u();
        int i2 = 1;
        if (z2) {
            iU = u() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iU2;
            iU = 0;
        }
        int iB = blbVar.b();
        x0();
        int iM = this.q.m();
        int i3 = this.q.i();
        View view = null;
        View view2 = null;
        while (iU != i) {
            View viewT = t(iU);
            int iB2 = tkb.B(viewT);
            if (iB2 >= 0 && iB2 < iB && Y0(iB2, gp3Var, blbVar) == 0) {
                if (((ukb) viewT.getLayoutParams()).a.g()) {
                    if (view2 == null) {
                        view2 = viewT;
                    }
                } else {
                    if (this.q.g(viewT) < i3 && this.q.d(viewT) >= iM) {
                        return viewT;
                    }
                    if (view == null) {
                        view = viewT;
                    }
                }
            }
            iU += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void J0(gp3 gp3Var, blb blbVar, e68 e68Var, qj0 qj0Var) {
        int i;
        int i2;
        int i3;
        int iF;
        int iY;
        int iV;
        int iV2;
        ?? r14;
        View viewB;
        int iL = this.q.l();
        boolean z = iL != 1073741824;
        int iU = u();
        int i4 = this.E;
        int i5 = iU > 0 ? this.F[i4] : 0;
        if (z) {
            b1();
        }
        boolean z2 = e68Var.e == 1;
        int iZ0 = !z2 ? Z0(e68Var.d, gp3Var, blbVar) + Y0(e68Var.d, gp3Var, blbVar) : i4;
        int i6 = 0;
        while (i6 < i4) {
            int i7 = e68Var.d;
            if (i7 < 0 || i7 >= blbVar.b() || iZ0 <= 0) {
                break;
            }
            int i8 = e68Var.d;
            int iZ1 = Z0(i8, gp3Var, blbVar);
            if (iZ1 > i4) {
                qc0.j(tec.g(i4, " spans.", ib8.n(i8, iZ1, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
                return;
            }
            iZ0 -= iZ1;
            if (iZ0 < 0 || (viewB = e68Var.b(gp3Var)) == null) {
                break;
            }
            this.G[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            qj0Var.a = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i9 = 0;
        while (i != i2) {
            View view = this.G[i];
            bf6 bf6Var = (bf6) view.getLayoutParams();
            int iZ2 = Z0(tkb.B(view), gp3Var, blbVar);
            bf6Var.f = iZ2;
            bf6Var.e = i9;
            i9 += iZ2;
            i += i3;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            View view2 = this.G[i11];
            if (e68Var.k != null) {
                r14 = 0;
                r14 = 0;
                if (z2) {
                    a(view2, -1, true);
                } else {
                    a(view2, 0, true);
                }
            } else if (z2) {
                r14 = 0;
                a(view2, -1, false);
            } else {
                r14 = 0;
                a(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.K;
            if (recyclerView == null) {
                rect.set(r14, r14, r14, r14);
            } else {
                rect.set(recyclerView.H(view2));
            }
            a1(view2, iL, r14);
            int iE = this.q.e(view2);
            if (iE > i10) {
                i10 = iE;
            }
            float f2 = (this.q.f(view2) * 1.0f) / ((bf6) view2.getLayoutParams()).f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            U0(Math.max(Math.round(f * i4), i5));
            i10 = 0;
            for (int i12 = 0; i12 < i6; i12++) {
                View view3 = this.G[i12];
                a1(view3, 1073741824, true);
                int iE2 = this.q.e(view3);
                if (iE2 > i10) {
                    i10 = iE2;
                }
            }
        }
        for (int i13 = 0; i13 < i6; i13++) {
            View view4 = this.G[i13];
            if (this.q.e(view4) != i10) {
                bf6 bf6Var2 = (bf6) view4.getLayoutParams();
                Rect rect2 = bf6Var2.b;
                int i14 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) bf6Var2).topMargin + ((ViewGroup.MarginLayoutParams) bf6Var2).bottomMargin;
                int i15 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) bf6Var2).leftMargin + ((ViewGroup.MarginLayoutParams) bf6Var2).rightMargin;
                int iW0 = W0(bf6Var2.e, bf6Var2.f);
                if (this.o == 1) {
                    iV2 = tkb.v(false, iW0, 1073741824, i15, ((ViewGroup.MarginLayoutParams) bf6Var2).width);
                    iV = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iV = tkb.v(false, iW0, 1073741824, i14, ((ViewGroup.MarginLayoutParams) bf6Var2).height);
                    iV2 = iMakeMeasureSpec;
                }
                if (q0(view4, iV2, iV, (ukb) view4.getLayoutParams())) {
                    view4.measure(iV2, iV);
                }
            }
        }
        int iA = 0;
        qj0Var.d = i10;
        int i16 = this.o;
        int i17 = e68Var.f;
        int iF2 = e68Var.b;
        if (i16 != 1) {
            if (i17 == -1) {
                iY = iF2 - i10;
                iF = iF2;
            } else {
                iF = iF2 + i10;
                iY = iF2;
            }
            iF2 = iA;
        } else if (i17 == -1) {
            iA = iF2 - i10;
            iY = 0;
            iF = 0;
        } else {
            iF = 0;
            iA = iF2;
            iF2 += i10;
            iY = 0;
        }
        int i18 = 0;
        while (true) {
            View[] viewArr = this.G;
            if (i18 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i18];
            bf6 bf6Var3 = (bf6) view5.getLayoutParams();
            if (this.o != 1) {
                iA = A() + this.F[bf6Var3.e];
                iF2 = this.q.f(view5) + iA;
            } else if (I0()) {
                int iY2 = y() + this.F[i4 - bf6Var3.e];
                iF = iY2;
                iY = iY2 - this.q.f(view5);
            } else {
                iY = y() + this.F[bf6Var3.e];
                iF = this.q.f(view5) + iY;
            }
            tkb.H(view5, iY, iA, iF, iF2);
            if (bf6Var3.a.g() || bf6Var3.a.j()) {
                qj0Var.b = true;
            }
            qj0Var.c = view5.hasFocusable() | qj0Var.c;
            i18++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void K0(gp3 gp3Var, blb blbVar, d55 d55Var, int i) {
        b1();
        if (blbVar.b() > 0 && !blbVar.f) {
            boolean z = i == 1;
            int iY0 = Y0(d55Var.b, gp3Var, blbVar);
            if (z) {
                while (iY0 > 0) {
                    int i2 = d55Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    d55Var.b = i3;
                    iY0 = Y0(i3, gp3Var, blbVar);
                }
            } else {
                int iB = blbVar.b() - 1;
                int i4 = d55Var.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iY1 = Y0(i5, gp3Var, blbVar);
                    if (iY1 <= iY0) {
                        break;
                    }
                    i4 = i5;
                    iY0 = iY1;
                }
                d55Var.b = i4;
            }
        }
        V0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.tkb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View M(android.view.View r23, int r24, defpackage.gp3 r25, defpackage.blb r26) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.M(android.view.View, int, gp3, blb):android.view.View");
    }

    @Override // defpackage.tkb
    public final void O(gp3 gp3Var, blb blbVar, t6 t6Var) {
        super.O(gp3Var, blbVar, t6Var);
        t6Var.h("android.widget.GridView");
    }

    @Override // defpackage.tkb
    public final void P(gp3 gp3Var, blb blbVar, View view, t6 t6Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof bf6)) {
            Q(view, t6Var);
            return;
        }
        bf6 bf6Var = (bf6) layoutParams;
        int iX0 = X0(bf6Var.a.b(), gp3Var, blbVar);
        int i = this.o;
        int i2 = bf6Var.e;
        int i3 = bf6Var.f;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, iX0, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iX0, 1, i2, i3, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q0(boolean z) {
        if (z) {
            s8f.i("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.Q0(false);
        }
    }

    @Override // defpackage.tkb
    public final void R(int i, int i2) {
        fz3 fz3Var = this.J;
        fz3Var.u();
        ((SparseIntArray) fz3Var.c).clear();
    }

    @Override // defpackage.tkb
    public final void S() {
        fz3 fz3Var = this.J;
        fz3Var.u();
        ((SparseIntArray) fz3Var.c).clear();
    }

    @Override // defpackage.tkb
    public final void T(int i, int i2) {
        fz3 fz3Var = this.J;
        fz3Var.u();
        ((SparseIntArray) fz3Var.c).clear();
    }

    @Override // defpackage.tkb
    public final void U(int i, int i2) {
        fz3 fz3Var = this.J;
        fz3Var.u();
        ((SparseIntArray) fz3Var.c).clear();
    }

    public final void U0(int i) {
        int i2;
        int[] iArr = this.F;
        int i3 = this.E;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.F = iArr;
    }

    @Override // defpackage.tkb
    public final void V(int i, int i2) {
        fz3 fz3Var = this.J;
        fz3Var.u();
        ((SparseIntArray) fz3Var.c).clear();
    }

    public final void V0() {
        View[] viewArr = this.G;
        if (viewArr == null || viewArr.length != this.E) {
            this.G = new View[this.E];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.tkb
    public final void W(gp3 gp3Var, blb blbVar) {
        boolean z = blbVar.f;
        SparseIntArray sparseIntArray = this.I;
        SparseIntArray sparseIntArray2 = this.H;
        if (z) {
            int iU = u();
            for (int i = 0; i < iU; i++) {
                bf6 bf6Var = (bf6) t(i).getLayoutParams();
                int iB = bf6Var.a.b();
                sparseIntArray2.put(iB, bf6Var.f);
                sparseIntArray.put(iB, bf6Var.e);
            }
        }
        super.W(gp3Var, blbVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final int W0(int i, int i2) {
        if (this.o != 1 || !I0()) {
            int[] iArr = this.F;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.F;
        int i3 = this.E;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.tkb
    public final void X(blb blbVar) {
        super.X(blbVar);
        this.D = false;
    }

    public final int X0(int i, gp3 gp3Var, blb blbVar) {
        boolean z = blbVar.f;
        int i2 = this.E;
        fz3 fz3Var = this.J;
        if (!z) {
            fz3Var.getClass();
            return fz3.t(i, i2);
        }
        int iB = gp3Var.b(i);
        if (iB != -1) {
            fz3Var.getClass();
            return fz3.t(iB, i2);
        }
        b1.l("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int Y0(int i, gp3 gp3Var, blb blbVar) {
        boolean z = blbVar.f;
        int i2 = this.E;
        fz3 fz3Var = this.J;
        if (!z) {
            fz3Var.getClass();
            return i % i2;
        }
        int i3 = this.I.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = gp3Var.b(i);
        if (iB != -1) {
            fz3Var.getClass();
            return iB % i2;
        }
        b1.l("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int Z0(int i, gp3 gp3Var, blb blbVar) {
        boolean z = blbVar.f;
        fz3 fz3Var = this.J;
        if (!z) {
            fz3Var.getClass();
            return 1;
        }
        int i2 = this.H.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (gp3Var.b(i) != -1) {
            fz3Var.getClass();
            return 1;
        }
        b1.l("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void a1(View view, int i, boolean z) {
        int iV;
        int iV2;
        bf6 bf6Var = (bf6) view.getLayoutParams();
        Rect rect = bf6Var.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bf6Var).topMargin + ((ViewGroup.MarginLayoutParams) bf6Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bf6Var).leftMargin + ((ViewGroup.MarginLayoutParams) bf6Var).rightMargin;
        int iW0 = W0(bf6Var.e, bf6Var.f);
        if (this.o == 1) {
            iV2 = tkb.v(false, iW0, i, i3, ((ViewGroup.MarginLayoutParams) bf6Var).width);
            iV = tkb.v(true, this.q.n(), this.l, i2, ((ViewGroup.MarginLayoutParams) bf6Var).height);
        } else {
            int iV3 = tkb.v(false, iW0, i, i2, ((ViewGroup.MarginLayoutParams) bf6Var).height);
            int iV4 = tkb.v(true, this.q.n(), this.k, i3, ((ViewGroup.MarginLayoutParams) bf6Var).width);
            iV = iV3;
            iV2 = iV4;
        }
        ukb ukbVar = (ukb) view.getLayoutParams();
        if (z ? q0(view, iV2, iV, ukbVar) : o0(view, iV2, iV, ukbVar)) {
            view.measure(iV2, iV);
        }
    }

    public final void b1() {
        int iX;
        int iA;
        if (this.o == 1) {
            iX = this.m - z();
            iA = y();
        } else {
            iX = this.n - x();
            iA = A();
        }
        U0(iX - iA);
    }

    @Override // defpackage.tkb
    public final boolean e(ukb ukbVar) {
        return ukbVar instanceof bf6;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.tkb
    public final int h0(int i, gp3 gp3Var, blb blbVar) {
        b1();
        V0();
        return super.h0(i, gp3Var, blbVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.tkb
    public final int i0(int i, gp3 gp3Var, blb blbVar) {
        b1();
        V0();
        return super.i0(i, gp3Var, blbVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.tkb
    public final int j(blb blbVar) {
        return u0(blbVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.tkb
    public final int k(blb blbVar) {
        return v0(blbVar);
    }

    @Override // defpackage.tkb
    public final void l0(Rect rect, int i, int i2) {
        int iF;
        int iF2;
        if (this.F == null) {
            super.l0(rect, i, i2);
        }
        int iZ = z() + y();
        int iX = x() + A();
        if (this.o == 1) {
            int iHeight = rect.height() + iX;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = nvf.a;
            iF2 = tkb.f(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.F;
            iF = tkb.f(i, iArr[iArr.length - 1] + iZ, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iZ;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = nvf.a;
            iF = tkb.f(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.F;
            iF2 = tkb.f(i2, iArr2[iArr2.length - 1] + iX, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iF, iF2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.tkb
    public final int m(blb blbVar) {
        return u0(blbVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.tkb
    public final int n(blb blbVar) {
        return v0(blbVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.tkb
    public final ukb q() {
        return this.o == 0 ? new bf6(-2, -1) : new bf6(-1, -2);
    }

    @Override // defpackage.tkb
    public final ukb r(Context context, AttributeSet attributeSet) {
        bf6 bf6Var = new bf6(context, attributeSet);
        bf6Var.e = -1;
        bf6Var.f = 0;
        return bf6Var;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.tkb
    public final boolean r0() {
        return this.y == null && !this.D;
    }

    @Override // defpackage.tkb
    public final ukb s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            bf6 bf6Var = new bf6((ViewGroup.MarginLayoutParams) layoutParams);
            bf6Var.e = -1;
            bf6Var.f = 0;
            return bf6Var;
        }
        bf6 bf6Var2 = new bf6(layoutParams);
        bf6Var2.e = -1;
        bf6Var2.f = 0;
        return bf6Var2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void s0(blb blbVar, e68 e68Var, i12 i12Var) {
        int i = this.E;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = e68Var.d;
            if (i4 < 0 || i4 >= blbVar.b() || i2 <= 0) {
                return;
            }
            i12Var.b(e68Var.d, Math.max(0, e68Var.g));
            this.J.getClass();
            i2--;
            e68Var.d += e68Var.e;
        }
    }

    @Override // defpackage.tkb
    public final int w(gp3 gp3Var, blb blbVar) {
        if (this.o == 1) {
            return this.E;
        }
        if (blbVar.b() < 1) {
            return 0;
        }
        return X0(blbVar.b() - 1, gp3Var, blbVar) + 1;
    }
}

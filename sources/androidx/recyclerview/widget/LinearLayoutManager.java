package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.aic;
import defpackage.blb;
import defpackage.d55;
import defpackage.e68;
import defpackage.f68;
import defpackage.flb;
import defpackage.gp3;
import defpackage.gt4;
import defpackage.i12;
import defpackage.nvf;
import defpackage.qc0;
import defpackage.qj0;
import defpackage.skb;
import defpackage.tec;
import defpackage.tkb;
import defpackage.ukb;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends tkb {
    public final qj0 A;
    public final int B;
    public final int[] C;
    public int o;
    public e68 p;
    public gt4 q;
    public boolean r;
    public final boolean s;
    public boolean t;
    public boolean u;
    public final boolean v;
    public int w;
    public int x;
    public f68 y;
    public final d55 z;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.o = 1;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.y = null;
        this.z = new d55();
        this.A = new qj0();
        this.B = 2;
        this.C = new int[2];
        skb skbVarC = tkb.C(context, attributeSet, i, i2);
        P0(skbVarC.a);
        boolean z = skbVarC.c;
        b(null);
        if (z != this.s) {
            this.s = z;
            g0();
        }
        Q0(skbVarC.d);
    }

    public final View A0(boolean z) {
        return this.t ? C0(u() - 1, -1, z) : C0(0, u(), z);
    }

    public final View B0(int i, int i2) {
        int i3;
        int i4;
        x0();
        if (i2 <= i && i2 >= i) {
            return t(i);
        }
        if (this.q.g(t(i)) < this.q.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.o == 0 ? this.c.q(i, i2, i3, i4) : this.d.q(i, i2, i3, i4);
    }

    public final View C0(int i, int i2, boolean z) {
        x0();
        int i3 = z ? 24579 : 320;
        return this.o == 0 ? this.c.q(i, i2, i3, 320) : this.d.q(i, i2, i3, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View D0(gp3 gp3Var, blb blbVar, boolean z, boolean z2) {
        int i;
        int iU;
        int i2;
        x0();
        int iU2 = u();
        if (z2) {
            iU = u() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iU2;
            iU = 0;
            i2 = 1;
        }
        int iB = blbVar.b();
        int iM = this.q.m();
        int i3 = this.q.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iU != i) {
            View viewT = t(iU);
            int iB2 = tkb.B(viewT);
            int iG = this.q.g(viewT);
            int iD = this.q.d(viewT);
            if (iB2 >= 0 && iB2 < iB) {
                if (!((ukb) viewT.getLayoutParams()).a.g()) {
                    boolean z3 = iD <= iM && iG < iM;
                    boolean z4 = iG >= i3 && iD > i3;
                    if (!z3 && !z4) {
                        return viewT;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewT;
                        } else if (view == null) {
                            view = viewT;
                        }
                    } else if (z3) {
                        view2 = viewT;
                    } else if (view == null) {
                        view = viewT;
                    }
                } else if (view3 == null) {
                    view3 = viewT;
                }
            }
            iU += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final int E0(int i, gp3 gp3Var, blb blbVar, boolean z) {
        int i2;
        int i3 = this.q.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -O0(-i3, gp3Var, blbVar);
        int i5 = i + i4;
        if (!z || (i2 = this.q.i() - i5) <= 0) {
            return i4;
        }
        this.q.q(i2);
        return i2 + i4;
    }

    @Override // defpackage.tkb
    public final boolean F() {
        return true;
    }

    public final int F0(int i, gp3 gp3Var, blb blbVar, boolean z) {
        int iM;
        int iM2 = i - this.q.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -O0(iM2, gp3Var, blbVar);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.q.m()) <= 0) {
            return i2;
        }
        this.q.q(-iM);
        return i2 - iM;
    }

    public final View G0() {
        return t(this.t ? 0 : u() - 1);
    }

    public final View H0() {
        return t(this.t ? u() - 1 : 0);
    }

    public final boolean I0() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = nvf.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public void J0(gp3 gp3Var, blb blbVar, e68 e68Var, qj0 qj0Var) {
        int i;
        int iF;
        int i2;
        int iF2;
        View viewB = e68Var.b(gp3Var);
        if (viewB == null) {
            qj0Var.a = true;
            return;
        }
        ukb ukbVar = (ukb) viewB.getLayoutParams();
        List list = e68Var.k;
        boolean z = this.t;
        int i3 = e68Var.f;
        if (list == null) {
            if (z == (i3 == -1)) {
                a(viewB, -1, false);
            } else {
                a(viewB, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                a(viewB, -1, true);
            } else {
                a(viewB, 0, true);
            }
        }
        ukb ukbVar2 = (ukb) viewB.getLayoutParams();
        Rect rectH = this.b.H(viewB);
        int i4 = rectH.left + rectH.right;
        int i5 = rectH.top + rectH.bottom;
        int iV = tkb.v(c(), this.m, this.k, z() + y() + ((ViewGroup.MarginLayoutParams) ukbVar2).leftMargin + ((ViewGroup.MarginLayoutParams) ukbVar2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) ukbVar2).width);
        int iV2 = tkb.v(d(), this.n, this.l, x() + A() + ((ViewGroup.MarginLayoutParams) ukbVar2).topMargin + ((ViewGroup.MarginLayoutParams) ukbVar2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) ukbVar2).height);
        if (o0(viewB, iV, iV2, ukbVar2)) {
            viewB.measure(iV, iV2);
        }
        qj0Var.d = this.q.e(viewB);
        if (this.o == 1) {
            if (I0()) {
                iF2 = this.m - z();
                iF = iF2 - this.q.f(viewB);
            } else {
                int iY = y();
                iF2 = this.q.f(viewB) + iY;
                iF = iY;
            }
            int i6 = e68Var.f;
            i2 = e68Var.b;
            int i7 = qj0Var.d;
            if (i6 == -1) {
                int i8 = i2 - i7;
                i = i2;
                i2 = i8;
            } else {
                i = i7 + i2;
            }
        } else {
            int iA = A();
            int iF3 = this.q.f(viewB) + iA;
            int i9 = e68Var.f;
            int i10 = e68Var.b;
            int i11 = qj0Var.d;
            if (i9 == -1) {
                int i12 = i10 - i11;
                iF2 = i10;
                i2 = iA;
                i = iF3;
                iF = i12;
            } else {
                int i13 = i10 + i11;
                i = iF3;
                iF = i10;
                i2 = iA;
                iF2 = i13;
            }
        }
        tkb.H(viewB, iF, i2, iF2, i);
        if (ukbVar.a.g() || ukbVar.a.j()) {
            qj0Var.b = true;
        }
        qj0Var.c = viewB.hasFocusable();
    }

    public final void L0(gp3 gp3Var, e68 e68Var) {
        if (!e68Var.a || e68Var.l) {
            return;
        }
        int i = e68Var.g;
        int i2 = e68Var.i;
        if (e68Var.f == -1) {
            int iU = u();
            if (i < 0) {
                return;
            }
            int iH = (this.q.h() - i) + i2;
            if (this.t) {
                for (int i3 = 0; i3 < iU; i3++) {
                    View viewT = t(i3);
                    if (this.q.g(viewT) < iH || this.q.p(viewT) < iH) {
                        M0(gp3Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iU - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewT2 = t(i5);
                if (this.q.g(viewT2) < iH || this.q.p(viewT2) < iH) {
                    M0(gp3Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iU2 = u();
        if (!this.t) {
            for (int i7 = 0; i7 < iU2; i7++) {
                View viewT3 = t(i7);
                if (this.q.d(viewT3) > i6 || this.q.o(viewT3) > i6) {
                    M0(gp3Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iU2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewT4 = t(i9);
            if (this.q.d(viewT4) > i6 || this.q.o(viewT4) > i6) {
                M0(gp3Var, i8, i9);
                return;
            }
        }
    }

    @Override // defpackage.tkb
    public View M(View view, int i, gp3 gp3Var, blb blbVar) {
        int iW0;
        View viewB0;
        N0();
        if (u() != 0 && (iW0 = w0(i)) != Integer.MIN_VALUE) {
            x0();
            R0(iW0, (int) (this.q.n() * 0.33333334f), false, blbVar);
            e68 e68Var = this.p;
            e68Var.g = Integer.MIN_VALUE;
            e68Var.a = false;
            y0(gp3Var, e68Var, blbVar, true);
            boolean z = this.t;
            if (iW0 == -1) {
                viewB0 = z ? B0(u() - 1, -1) : B0(0, u());
            } else {
                viewB0 = z ? B0(0, u()) : B0(u() - 1, -1);
            }
            View viewH0 = iW0 == -1 ? H0() : G0();
            if (!viewH0.hasFocusable()) {
                return viewB0;
            }
            if (viewB0 != null) {
                return viewH0;
            }
        }
        return null;
    }

    public final void M0(gp3 gp3Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewT = t(i);
                e0(i);
                gp3Var.m(viewT);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewT2 = t(i3);
            e0(i3);
            gp3Var.m(viewT2);
        }
    }

    @Override // defpackage.tkb
    public final void N(AccessibilityEvent accessibilityEvent) {
        super.N(accessibilityEvent);
        if (u() > 0) {
            View viewC0 = C0(0, u(), false);
            accessibilityEvent.setFromIndex(viewC0 == null ? -1 : tkb.B(viewC0));
            View viewC1 = C0(u() - 1, -1, false);
            accessibilityEvent.setToIndex(viewC1 != null ? tkb.B(viewC1) : -1);
        }
    }

    public final void N0() {
        if (this.o == 1 || !I0()) {
            this.t = this.s;
        } else {
            this.t = !this.s;
        }
    }

    public final int O0(int i, gp3 gp3Var, blb blbVar) {
        if (u() != 0 && i != 0) {
            x0();
            this.p.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            R0(i2, iAbs, true, blbVar);
            e68 e68Var = this.p;
            int iY0 = y0(gp3Var, e68Var, blbVar, false) + e68Var.g;
            if (iY0 >= 0) {
                if (iAbs > iY0) {
                    i = i2 * iY0;
                }
                this.q.q(-i);
                this.p.j = i;
                return i;
            }
        }
        return 0;
    }

    public final void P0(int i) {
        if (i != 0 && i != 1) {
            qc0.j(tec.e(i, "invalid orientation:"));
            return;
        }
        b(null);
        if (i != this.o || this.q == null) {
            gt4 gt4VarB = gt4.b(this, i);
            this.q = gt4VarB;
            this.z.f = gt4VarB;
            this.o = i;
            g0();
        }
    }

    public void Q0(boolean z) {
        b(null);
        if (this.u == z) {
            return;
        }
        this.u = z;
        g0();
    }

    public final void R0(int i, int i2, boolean z, blb blbVar) {
        int iM;
        this.p.l = this.q.k() == 0 && this.q.h() == 0;
        this.p.f = i;
        int[] iArr = this.C;
        iArr[0] = 0;
        iArr[1] = 0;
        blbVar.getClass();
        int i3 = this.p.f;
        iArr[0] = 0;
        iArr[1] = 0;
        int iMax = Math.max(0, 0);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        e68 e68Var = this.p;
        int i4 = z2 ? iMax2 : iMax;
        e68Var.h = i4;
        if (!z2) {
            iMax = iMax2;
        }
        e68Var.i = iMax;
        if (z2) {
            e68Var.h = this.q.j() + i4;
            View viewG0 = G0();
            e68 e68Var2 = this.p;
            e68Var2.e = this.t ? -1 : 1;
            int iB = tkb.B(viewG0);
            e68 e68Var3 = this.p;
            e68Var2.d = iB + e68Var3.e;
            e68Var3.b = this.q.d(viewG0);
            iM = this.q.d(viewG0) - this.q.i();
        } else {
            View viewH0 = H0();
            e68 e68Var4 = this.p;
            e68Var4.h = this.q.m() + e68Var4.h;
            e68 e68Var5 = this.p;
            e68Var5.e = this.t ? 1 : -1;
            int iB2 = tkb.B(viewH0);
            e68 e68Var6 = this.p;
            e68Var5.d = iB2 + e68Var6.e;
            e68Var6.b = this.q.g(viewH0);
            iM = (-this.q.g(viewH0)) + this.q.m();
        }
        e68 e68Var7 = this.p;
        e68Var7.c = i2;
        if (z) {
            e68Var7.c = i2 - iM;
        }
        e68Var7.g = iM;
    }

    public final void S0(int i, int i2) {
        this.p.c = this.q.i() - i2;
        e68 e68Var = this.p;
        e68Var.e = this.t ? -1 : 1;
        e68Var.d = i;
        e68Var.f = 1;
        e68Var.b = i2;
        e68Var.g = Integer.MIN_VALUE;
    }

    public final void T0(int i, int i2) {
        this.p.c = i2 - this.q.m();
        e68 e68Var = this.p;
        e68Var.d = i;
        e68Var.e = this.t ? 1 : -1;
        e68Var.f = -1;
        e68Var.b = i2;
        e68Var.g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0206  */
    /* JADX WARN: Code duplicated, block: B:126:0x0212  */
    /* JADX WARN: Code duplicated, block: B:130:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0236  */
    /* JADX WARN: Code duplicated, block: B:134:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x023d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0240 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0242  */
    /* JADX WARN: Code duplicated, block: B:141:0x0246  */
    /* JADX WARN: Code duplicated, block: B:143:0x024a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0251  */
    /* JADX WARN: Code duplicated, block: B:146:0x0257  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.tkb
    public void W(gp3 gp3Var, blb blbVar) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewD0;
        boolean z3;
        gt4 gt4Var;
        int iG;
        int iD;
        int iM;
        int i;
        boolean z4;
        boolean z5;
        gt4 gt4Var2;
        int iN;
        ukb ukbVar;
        int i2;
        int iG2;
        int i3;
        int i4;
        ?? r4;
        List list;
        int i5;
        int i6;
        int iE0;
        int i7;
        View viewP;
        int iG3;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.y == null && this.w == -1) && blbVar.b() == 0) {
            b0(gp3Var);
            return;
        }
        f68 f68Var = this.y;
        if (f68Var != null && (i9 = f68Var.a) >= 0) {
            this.w = i9;
        }
        x0();
        boolean z6 = false;
        this.p.a = false;
        N0();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.b).contains(focusedChild)) {
            focusedChild = null;
        }
        d55 d55Var = this.z;
        if (!d55Var.e || this.w != -1 || this.y != null) {
            d55Var.f();
            d55Var.d = this.t ^ this.u;
            if (blbVar.f || (i2 = this.w) == -1) {
                if (u() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.b).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        ukbVar = (ukb) focusedChild2.getLayoutParams();
                        if (!ukbVar.a.g() || ukbVar.a.b() < 0 || ukbVar.a.b() >= blbVar.b()) {
                            z = this.r;
                            z2 = this.u;
                            if (z == z2 || (viewD0 = D0(gp3Var, blbVar, d55Var.d, z2)) == null) {
                                d55Var.b();
                                if (this.u) {
                                    iB = blbVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                d55Var.b = iB;
                            } else {
                                int iB2 = tkb.B(viewD0);
                                z3 = d55Var.d;
                                gt4Var = (gt4) d55Var.f;
                                if (z3) {
                                    int iD2 = gt4Var.d(viewD0);
                                    gt4Var2 = (gt4) d55Var.f;
                                    if (Integer.MIN_VALUE == gt4Var2.a) {
                                        iN = 0;
                                    } else {
                                        iN = gt4Var2.n() - gt4Var2.a;
                                    }
                                    d55Var.c = iN + iD2;
                                } else {
                                    d55Var.c = gt4Var.g(viewD0);
                                }
                                d55Var.b = iB2;
                                if (!blbVar.f && r0()) {
                                    iG = this.q.g(viewD0);
                                    iD = this.q.d(viewD0);
                                    iM = this.q.m();
                                    i = this.q.i();
                                    if (iD <= iM || iG >= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iG >= i || iD <= i) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (d55Var.d) {
                                            iM = i;
                                        }
                                        d55Var.c = iM;
                                    }
                                }
                            }
                        } else {
                            d55Var.c(focusedChild2, tkb.B(focusedChild2));
                        }
                    } else {
                        z = this.r;
                        z2 = this.u;
                        if (z == z2) {
                            d55Var.b();
                            if (this.u) {
                                iB = blbVar.b() - 1;
                            } else {
                                iB = 0;
                            }
                            d55Var.b = iB;
                        } else {
                            int iB3 = tkb.B(viewD0);
                            z3 = d55Var.d;
                            gt4Var = (gt4) d55Var.f;
                            if (z3) {
                                int iD3 = gt4Var.d(viewD0);
                                gt4Var2 = (gt4) d55Var.f;
                                if (Integer.MIN_VALUE == gt4Var2.a) {
                                    iN = 0;
                                } else {
                                    iN = gt4Var2.n() - gt4Var2.a;
                                }
                                d55Var.c = iN + iD3;
                            } else {
                                d55Var.c = gt4Var.g(viewD0);
                            }
                            d55Var.b = iB3;
                            if (!blbVar.f) {
                                iG = this.q.g(viewD0);
                                iD = this.q.d(viewD0);
                                iM = this.q.m();
                                i = this.q.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (d55Var.d) {
                                        iM = i;
                                    }
                                    d55Var.c = iM;
                                } else {
                                    if (d55Var.d) {
                                        iM = i;
                                    }
                                    d55Var.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    d55Var.b();
                    if (this.u) {
                        iB = blbVar.b() - 1;
                    } else {
                        iB = 0;
                    }
                    d55Var.b = iB;
                }
            } else if (i2 < 0 || i2 >= blbVar.b()) {
                this.w = -1;
                this.x = Integer.MIN_VALUE;
                if (u() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        ukbVar = (ukb) focusedChild2.getLayoutParams();
                        if (ukbVar.a.g()) {
                            z = this.r;
                            z2 = this.u;
                            if (z == z2) {
                                d55Var.b();
                                if (this.u) {
                                    iB = blbVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                d55Var.b = iB;
                            } else {
                                int iB4 = tkb.B(viewD0);
                                z3 = d55Var.d;
                                gt4Var = (gt4) d55Var.f;
                                if (z3) {
                                    int iD4 = gt4Var.d(viewD0);
                                    gt4Var2 = (gt4) d55Var.f;
                                    if (Integer.MIN_VALUE == gt4Var2.a) {
                                        iN = 0;
                                    } else {
                                        iN = gt4Var2.n() - gt4Var2.a;
                                    }
                                    d55Var.c = iN + iD4;
                                } else {
                                    d55Var.c = gt4Var.g(viewD0);
                                }
                                d55Var.b = iB4;
                                if (!blbVar.f) {
                                    iG = this.q.g(viewD0);
                                    iD = this.q.d(viewD0);
                                    iM = this.q.m();
                                    i = this.q.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (d55Var.d) {
                                            iM = i;
                                        }
                                        d55Var.c = iM;
                                    } else {
                                        if (d55Var.d) {
                                            iM = i;
                                        }
                                        d55Var.c = iM;
                                    }
                                }
                            }
                        } else {
                            z = this.r;
                            z2 = this.u;
                            if (z == z2) {
                                d55Var.b();
                                if (this.u) {
                                    iB = blbVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                d55Var.b = iB;
                            } else {
                                int iB5 = tkb.B(viewD0);
                                z3 = d55Var.d;
                                gt4Var = (gt4) d55Var.f;
                                if (z3) {
                                    int iD5 = gt4Var.d(viewD0);
                                    gt4Var2 = (gt4) d55Var.f;
                                    if (Integer.MIN_VALUE == gt4Var2.a) {
                                        iN = 0;
                                    } else {
                                        iN = gt4Var2.n() - gt4Var2.a;
                                    }
                                    d55Var.c = iN + iD5;
                                } else {
                                    d55Var.c = gt4Var.g(viewD0);
                                }
                                d55Var.b = iB5;
                                if (!blbVar.f) {
                                    iG = this.q.g(viewD0);
                                    iD = this.q.d(viewD0);
                                    iM = this.q.m();
                                    i = this.q.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (d55Var.d) {
                                            iM = i;
                                        }
                                        d55Var.c = iM;
                                    } else {
                                        if (d55Var.d) {
                                            iM = i;
                                        }
                                        d55Var.c = iM;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.r;
                        z2 = this.u;
                        if (z == z2) {
                            d55Var.b();
                            if (this.u) {
                                iB = blbVar.b() - 1;
                            } else {
                                iB = 0;
                            }
                            d55Var.b = iB;
                        } else {
                            int iB6 = tkb.B(viewD0);
                            z3 = d55Var.d;
                            gt4Var = (gt4) d55Var.f;
                            if (z3) {
                                int iD6 = gt4Var.d(viewD0);
                                gt4Var2 = (gt4) d55Var.f;
                                if (Integer.MIN_VALUE == gt4Var2.a) {
                                    iN = 0;
                                } else {
                                    iN = gt4Var2.n() - gt4Var2.a;
                                }
                                d55Var.c = iN + iD6;
                            } else {
                                d55Var.c = gt4Var.g(viewD0);
                            }
                            d55Var.b = iB6;
                            if (!blbVar.f) {
                                iG = this.q.g(viewD0);
                                iD = this.q.d(viewD0);
                                iM = this.q.m();
                                i = this.q.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (d55Var.d) {
                                        iM = i;
                                    }
                                    d55Var.c = iM;
                                } else {
                                    if (d55Var.d) {
                                        iM = i;
                                    }
                                    d55Var.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    d55Var.b();
                    if (this.u) {
                        iB = blbVar.b() - 1;
                    } else {
                        iB = 0;
                    }
                    d55Var.b = iB;
                }
            } else {
                int i11 = this.w;
                d55Var.b = i11;
                f68 f68Var2 = this.y;
                if (f68Var2 != null && f68Var2.a >= 0) {
                    boolean z7 = f68Var2.c;
                    d55Var.d = z7;
                    gt4 gt4Var3 = this.q;
                    if (z7) {
                        d55Var.c = gt4Var3.i() - this.y.b;
                    } else {
                        d55Var.c = gt4Var3.m() + this.y.b;
                    }
                } else if (this.x == Integer.MIN_VALUE) {
                    View viewP2 = p(i11);
                    if (viewP2 == null) {
                        if (u() > 0) {
                            d55Var.d = (this.w < tkb.B(t(0))) == this.t;
                        }
                        d55Var.b();
                    } else if (this.q.e(viewP2) > this.q.n()) {
                        d55Var.b();
                    } else {
                        int iG4 = this.q.g(viewP2) - this.q.m();
                        gt4 gt4Var4 = this.q;
                        if (iG4 < 0) {
                            d55Var.c = gt4Var4.m();
                            d55Var.d = false;
                        } else if (gt4Var4.i() - this.q.d(viewP2) < 0) {
                            d55Var.c = this.q.i();
                            d55Var.d = true;
                        } else {
                            boolean z8 = d55Var.d;
                            gt4 gt4Var5 = this.q;
                            if (z8) {
                                int iD7 = gt4Var5.d(viewP2);
                                gt4 gt4Var6 = this.q;
                                iG2 = (Integer.MIN_VALUE == gt4Var6.a ? 0 : gt4Var6.n() - gt4Var6.a) + iD7;
                            } else {
                                iG2 = gt4Var5.g(viewP2);
                            }
                            d55Var.c = iG2;
                        }
                    }
                } else {
                    boolean z9 = this.t;
                    d55Var.d = z9;
                    gt4 gt4Var7 = this.q;
                    if (z9) {
                        d55Var.c = gt4Var7.i() - this.x;
                    } else {
                        d55Var.c = gt4Var7.m() + this.x;
                    }
                }
            }
            d55Var.e = true;
        } else if (focusedChild != null && (this.q.g(focusedChild) >= this.q.i() || this.q.d(focusedChild) <= this.q.m())) {
            d55Var.c(focusedChild, tkb.B(focusedChild));
        }
        e68 e68Var = this.p;
        e68Var.f = e68Var.j >= 0 ? 1 : -1;
        int[] iArr = this.C;
        iArr[0] = 0;
        iArr[1] = 0;
        blbVar.getClass();
        int i12 = this.p.f;
        iArr[0] = 0;
        iArr[1] = 0;
        int iM2 = this.q.m() + Math.max(0, 0);
        int iJ = this.q.j() + Math.max(0, iArr[1]);
        if (blbVar.f && (i7 = this.w) != -1 && this.x != Integer.MIN_VALUE && (viewP = p(i7)) != null) {
            boolean z10 = this.t;
            gt4 gt4Var8 = this.q;
            if (z10) {
                i8 = gt4Var8.i() - this.q.d(viewP);
                iG3 = this.x;
            } else {
                iG3 = gt4Var8.g(viewP) - this.q.m();
                i8 = this.x;
            }
            int i13 = i8 - iG3;
            if (i13 > 0) {
                iM2 += i13;
            } else {
                iJ -= i13;
            }
        }
        boolean z11 = d55Var.d;
        boolean z12 = this.t;
        if (!z11 ? !z12 : z12) {
            i10 = 1;
        }
        K0(gp3Var, blbVar, d55Var, i10);
        o(gp3Var);
        this.p.l = this.q.k() == 0 && this.q.h() == 0;
        this.p.getClass();
        this.p.i = 0;
        boolean z13 = d55Var.d;
        int i14 = d55Var.b;
        if (z13) {
            T0(i14, d55Var.c);
            e68 e68Var2 = this.p;
            e68Var2.h = iM2;
            y0(gp3Var, e68Var2, blbVar, false);
            e68 e68Var3 = this.p;
            i4 = e68Var3.b;
            int i15 = e68Var3.d;
            int i16 = e68Var3.c;
            if (i16 > 0) {
                iJ += i16;
            }
            S0(d55Var.b, d55Var.c);
            e68 e68Var4 = this.p;
            e68Var4.h = iJ;
            e68Var4.d += e68Var4.e;
            y0(gp3Var, e68Var4, blbVar, false);
            e68 e68Var5 = this.p;
            i3 = e68Var5.b;
            int i17 = e68Var5.c;
            if (i17 > 0) {
                T0(i15, i4);
                e68 e68Var6 = this.p;
                e68Var6.h = i17;
                y0(gp3Var, e68Var6, blbVar, false);
                i4 = this.p.b;
            }
        } else {
            S0(i14, d55Var.c);
            e68 e68Var7 = this.p;
            e68Var7.h = iJ;
            y0(gp3Var, e68Var7, blbVar, false);
            e68 e68Var8 = this.p;
            i3 = e68Var8.b;
            int i18 = e68Var8.d;
            int i19 = e68Var8.c;
            if (i19 > 0) {
                iM2 += i19;
            }
            T0(d55Var.b, d55Var.c);
            e68 e68Var9 = this.p;
            e68Var9.h = iM2;
            e68Var9.d += e68Var9.e;
            y0(gp3Var, e68Var9, blbVar, false);
            e68 e68Var10 = this.p;
            int i20 = e68Var10.b;
            int i21 = e68Var10.c;
            if (i21 > 0) {
                S0(i18, i3);
                e68 e68Var11 = this.p;
                e68Var11.h = i21;
                y0(gp3Var, e68Var11, blbVar, false);
                i3 = this.p.b;
            }
            i4 = i20;
        }
        if (u() > 0) {
            if (this.t ^ this.u) {
                int iE1 = E0(i3, gp3Var, blbVar, true);
                i5 = i4 + iE1;
                i6 = i3 + iE1;
                iE0 = F0(i5, gp3Var, blbVar, false);
            } else {
                int iF0 = F0(i4, gp3Var, blbVar, true);
                i5 = i4 + iF0;
                i6 = i3 + iF0;
                iE0 = E0(i6, gp3Var, blbVar, false);
            }
            i4 = i5 + iE0;
            i3 = i6 + iE0;
        }
        if (blbVar.j && u() != 0 && !blbVar.f && r0()) {
            List list2 = (List) gp3Var.f;
            int size = list2.size();
            int iB7 = tkb.B(t(0));
            int i22 = 0;
            int iE = 0;
            int iE2 = 0;
            while (i22 < size) {
                flb flbVar = (flb) list2.get(i22);
                boolean zG = flbVar.g();
                View view = flbVar.a;
                if (!zG) {
                    boolean z14 = flbVar.b() < iB7 ? true : z6;
                    boolean z15 = this.t;
                    gt4 gt4Var9 = this.q;
                    if (z14 != z15) {
                        iE += gt4Var9.e(view);
                    } else {
                        iE2 += gt4Var9.e(view);
                    }
                }
                i22++;
                z6 = false;
            }
            this.p.k = list2;
            if (iE > 0) {
                T0(tkb.B(H0()), i4);
                e68 e68Var12 = this.p;
                e68Var12.h = iE;
                r4 = 0;
                e68Var12.c = 0;
                e68Var12.a(null);
                y0(gp3Var, this.p, blbVar, false);
            } else {
                r4 = 0;
            }
            if (iE2 > 0) {
                S0(tkb.B(G0()), i3);
                e68 e68Var13 = this.p;
                e68Var13.h = iE2;
                e68Var13.c = r4;
                list = null;
                e68Var13.a(null);
                y0(gp3Var, this.p, blbVar, r4);
            } else {
                list = null;
            }
            this.p.k = list;
        }
        if (blbVar.f) {
            d55Var.f();
        } else {
            gt4 gt4Var10 = this.q;
            gt4Var10.a = gt4Var10.n();
        }
        this.r = this.u;
    }

    @Override // defpackage.tkb
    public void X(blb blbVar) {
        this.y = null;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.z.f();
    }

    @Override // defpackage.tkb
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof f68) {
            f68 f68Var = (f68) parcelable;
            this.y = f68Var;
            if (this.w != -1) {
                f68Var.a = -1;
            }
            g0();
        }
    }

    @Override // defpackage.tkb
    public final Parcelable Z() {
        f68 f68Var = this.y;
        if (f68Var != null) {
            f68 f68Var2 = new f68();
            f68Var2.a = f68Var.a;
            f68Var2.b = f68Var.b;
            f68Var2.c = f68Var.c;
            return f68Var2;
        }
        f68 f68Var3 = new f68();
        if (u() <= 0) {
            f68Var3.a = -1;
            return f68Var3;
        }
        x0();
        boolean z = this.r ^ this.t;
        f68Var3.c = z;
        if (z) {
            View viewG0 = G0();
            f68Var3.b = this.q.i() - this.q.d(viewG0);
            f68Var3.a = tkb.B(viewG0);
            return f68Var3;
        }
        View viewH0 = H0();
        f68Var3.a = tkb.B(viewH0);
        f68Var3.b = this.q.g(viewH0) - this.q.m();
        return f68Var3;
    }

    @Override // defpackage.tkb
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.y != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.f(str);
    }

    @Override // defpackage.tkb
    public final boolean c() {
        return this.o == 0;
    }

    @Override // defpackage.tkb
    public final boolean d() {
        return this.o == 1;
    }

    @Override // defpackage.tkb
    public final void g(int i, int i2, blb blbVar, i12 i12Var) {
        if (this.o != 0) {
            i = i2;
        }
        if (u() == 0 || i == 0) {
            return;
        }
        x0();
        R0(i > 0 ? 1 : -1, Math.abs(i), true, blbVar);
        s0(blbVar, this.p, i12Var);
    }

    @Override // defpackage.tkb
    public final void h(int i, i12 i12Var) {
        boolean z;
        int i2;
        f68 f68Var = this.y;
        if (f68Var == null || (i2 = f68Var.a) < 0) {
            N0();
            z = this.t;
            i2 = this.w;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = f68Var.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.B && i2 >= 0 && i2 < i; i4++) {
            i12Var.b(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.tkb
    public int h0(int i, gp3 gp3Var, blb blbVar) {
        if (this.o == 1) {
            return 0;
        }
        return O0(i, gp3Var, blbVar);
    }

    @Override // defpackage.tkb
    public final int i(blb blbVar) {
        return t0(blbVar);
    }

    @Override // defpackage.tkb
    public int i0(int i, gp3 gp3Var, blb blbVar) {
        if (this.o == 0) {
            return 0;
        }
        return O0(i, gp3Var, blbVar);
    }

    @Override // defpackage.tkb
    public int j(blb blbVar) {
        return u0(blbVar);
    }

    @Override // defpackage.tkb
    public int k(blb blbVar) {
        return v0(blbVar);
    }

    @Override // defpackage.tkb
    public final int l(blb blbVar) {
        return t0(blbVar);
    }

    @Override // defpackage.tkb
    public int m(blb blbVar) {
        return u0(blbVar);
    }

    @Override // defpackage.tkb
    public int n(blb blbVar) {
        return v0(blbVar);
    }

    @Override // defpackage.tkb
    public final View p(int i) {
        int iU = u();
        if (iU == 0) {
            return null;
        }
        int iB = i - tkb.B(t(0));
        if (iB >= 0 && iB < iU) {
            View viewT = t(iB);
            if (tkb.B(viewT) == i) {
                return viewT;
            }
        }
        return super.p(i);
    }

    @Override // defpackage.tkb
    public final boolean p0() {
        if (this.l != 1073741824 && this.k != 1073741824) {
            int iU = u();
            for (int i = 0; i < iU; i++) {
                ViewGroup.LayoutParams layoutParams = t(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.tkb
    public ukb q() {
        return new ukb(-2, -2);
    }

    @Override // defpackage.tkb
    public boolean r0() {
        return this.y == null && this.r == this.u;
    }

    public void s0(blb blbVar, e68 e68Var, i12 i12Var) {
        int i = e68Var.d;
        if (i < 0 || i >= blbVar.b()) {
            return;
        }
        i12Var.b(i, Math.max(0, e68Var.g));
    }

    public final int t0(blb blbVar) {
        if (u() == 0) {
            return 0;
        }
        x0();
        gt4 gt4Var = this.q;
        boolean z = !this.v;
        return aic.f(blbVar, gt4Var, A0(z), z0(z), this, this.v);
    }

    public final int u0(blb blbVar) {
        if (u() == 0) {
            return 0;
        }
        x0();
        gt4 gt4Var = this.q;
        boolean z = !this.v;
        return aic.g(blbVar, gt4Var, A0(z), z0(z), this, this.v, this.t);
    }

    public final int v0(blb blbVar) {
        if (u() == 0) {
            return 0;
        }
        x0();
        gt4 gt4Var = this.q;
        boolean z = !this.v;
        return aic.h(blbVar, gt4Var, A0(z), z0(z), this, this.v);
    }

    public final int w0(int i) {
        if (i == 1) {
            return (this.o != 1 && I0()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.o != 1 && I0()) ? -1 : 1;
        }
        if (i == 17) {
            return this.o == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.o == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.o == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.o == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void x0() {
        if (this.p == null) {
            e68 e68Var = new e68();
            e68Var.a = true;
            e68Var.h = 0;
            e68Var.i = 0;
            e68Var.k = null;
            this.p = e68Var;
        }
    }

    public final int y0(gp3 gp3Var, e68 e68Var, blb blbVar, boolean z) {
        int i;
        int i2 = e68Var.c;
        int i3 = e68Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                e68Var.g = i3 + i2;
            }
            L0(gp3Var, e68Var);
        }
        int i4 = e68Var.c + e68Var.h;
        while (true) {
            if ((!e68Var.l && i4 <= 0) || (i = e68Var.d) < 0 || i >= blbVar.b()) {
                break;
            }
            qj0 qj0Var = this.A;
            qj0Var.d = 0;
            qj0Var.a = false;
            qj0Var.b = false;
            qj0Var.c = false;
            J0(gp3Var, blbVar, e68Var, qj0Var);
            if (!qj0Var.a) {
                int i5 = e68Var.b;
                int i6 = qj0Var.d;
                e68Var.b = (e68Var.f * i6) + i5;
                if (!qj0Var.b || e68Var.k != null || !blbVar.f) {
                    e68Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = e68Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    e68Var.g = i8;
                    int i9 = e68Var.c;
                    if (i9 < 0) {
                        e68Var.g = i8 + i9;
                    }
                    L0(gp3Var, e68Var);
                }
                if (z && qj0Var.c) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - e68Var.c;
    }

    public final View z0(boolean z) {
        return this.t ? C0(0, u(), z) : C0(u() - 1, -1, z);
    }

    @Override // defpackage.tkb
    public final void L(RecyclerView recyclerView) {
    }

    public LinearLayoutManager() {
        this.o = 1;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.y = null;
        this.z = new d55();
        this.A = new qj0();
        this.B = 2;
        this.C = new int[2];
        P0(1);
        b(null);
        if (this.s) {
            this.s = false;
            g0();
        }
    }

    public void K0(gp3 gp3Var, blb blbVar, d55 d55Var, int i) {
    }
}

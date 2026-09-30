package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tkb {
    public ta0 a;
    public RecyclerView b;
    public final vea c;
    public final vea d;
    public boolean e;
    public boolean f;
    public final boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;

    public tkb() {
        kd9 kd9Var = new kd9(26, this);
        yea yeaVar = new yea(this);
        this.c = new vea((avf) kd9Var);
        this.d = new vea((avf) yeaVar);
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int B(View view) {
        return ((ukb) view.getLayoutParams()).a.b();
    }

    public static skb C(Context context, AttributeSet attributeSet, int i, int i2) {
        skb skbVar = new skb();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fbb.a, i, i2);
        skbVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        skbVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        skbVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        skbVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return skbVar;
    }

    public static boolean G(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void H(View view, int i, int i2, int i3, int i4) {
        ukb ukbVar = (ukb) view.getLayoutParams();
        Rect rect = ukbVar.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) ukbVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) ukbVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) ukbVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) ukbVar).bottomMargin);
    }

    public static int f(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int v(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public final int A() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int D(gp3 gp3Var, blb blbVar) {
        return -1;
    }

    public final void E(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((ukb) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.y;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean F();

    public void I(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iR = recyclerView.f.r();
            for (int i2 = 0; i2 < iR; i2++) {
                recyclerView.f.q(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void J(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iR = recyclerView.f.r();
            for (int i2 = 0; i2 < iR; i2++) {
                recyclerView.f.q(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void L(RecyclerView recyclerView);

    public abstract View M(View view, int i, gp3 gp3Var, blb blbVar);

    public void N(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        gp3 gp3Var = recyclerView.c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        nkb nkbVar = this.b.z;
        if (nkbVar != null) {
            accessibilityEvent.setItemCount(nkbVar.a());
        }
    }

    public void O(gp3 gp3Var, blb blbVar, t6 t6Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            t6Var.a(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            t6Var.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(D(gp3Var, blbVar), w(gp3Var, blbVar), false, 0));
    }

    public final void Q(View view, t6 t6Var) {
        flb flbVarF = RecyclerView.F(view);
        if (flbVarF == null || flbVarF.g()) {
            return;
        }
        ta0 ta0Var = this.a;
        if (((ArrayList) ta0Var.b).contains(flbVarF.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        P(recyclerView.c, recyclerView.s1, view, t6Var);
    }

    public abstract void W(gp3 gp3Var, blb blbVar);

    public abstract void X(blb blbVar);

    public abstract void Y(Parcelable parcelable);

    public abstract Parcelable Z();

    public final void a(View view, int i, boolean z) {
        flb flbVarF = RecyclerView.F(view);
        if (z || flbVarF.g()) {
            wid widVar = (wid) this.b.g.b;
            wvf wvfVarA = (wvf) widVar.get(flbVarF);
            if (wvfVarA == null) {
                wvfVarA = wvf.a();
                widVar.put(flbVarF, wvfVarA);
            }
            wvfVarA.a |= 1;
        } else {
            this.b.g.u(flbVarF);
        }
        ukb ukbVar = (ukb) view.getLayoutParams();
        if (flbVarF.o() || flbVarF.h()) {
            if (flbVarF.h()) {
                flbVarF.m.q(flbVarF);
            } else {
                flbVarF.i &= -33;
            }
            this.a.d(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            ta0 ta0Var = this.a;
            if (parent == recyclerView) {
                zy1 zy1Var = (zy1) ta0Var.d;
                int iIndexOfChild = ((RecyclerView) ((g5b) ta0Var.c).b).indexOfChild(view);
                int iS = (iIndexOfChild == -1 || zy1Var.u(iIndexOfChild)) ? -1 : iIndexOfChild - zy1Var.s(iIndexOfChild);
                if (i == -1) {
                    i = this.a.r();
                }
                if (iS == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.w());
                }
                if (iS != i) {
                    tkb tkbVar = this.b.E0;
                    View viewT = tkbVar.t(iS);
                    if (viewT == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iS + tkbVar.b.toString());
                    }
                    tkbVar.t(iS);
                    tkbVar.a.l(iS);
                    ukb ukbVar2 = (ukb) viewT.getLayoutParams();
                    flb flbVarF2 = RecyclerView.F(viewT);
                    boolean zG = flbVarF2.g();
                    RecyclerView recyclerView2 = tkbVar.b;
                    if (zG) {
                        wid widVar2 = (wid) recyclerView2.g.b;
                        wvf wvfVarA2 = (wvf) widVar2.get(flbVarF2);
                        if (wvfVarA2 == null) {
                            wvfVarA2 = wvf.a();
                            widVar2.put(flbVarF2, wvfVarA2);
                        }
                        wvfVarA2.a = 1 | wvfVarA2.a;
                    } else {
                        recyclerView2.g.u(flbVarF2);
                    }
                    tkbVar.a.d(viewT, i, ukbVar2, flbVarF2.g());
                }
            } else {
                ta0Var.c(view, i, false);
                ukbVar.c = true;
            }
        }
        if (ukbVar.d) {
            flbVarF.a.invalidate();
            ukbVar.d = false;
        }
    }

    public abstract void b(String str);

    public final void b0(gp3 gp3Var) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            if (!RecyclerView.F(t(iU)).n()) {
                View viewT = t(iU);
                e0(iU);
                gp3Var.m(viewT);
            }
        }
    }

    public abstract boolean c();

    public final void c0(gp3 gp3Var) {
        ArrayList arrayList;
        int size = ((ArrayList) gp3Var.c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) gp3Var.c;
            if (i < 0) {
                break;
            }
            View view = ((flb) arrayList.get(i)).a;
            flb flbVarF = RecyclerView.F(view);
            if (!flbVarF.n()) {
                flbVarF.m(false);
                if (flbVarF.i()) {
                    this.b.removeDetachedView(view, false);
                }
                rkb rkbVar = this.b.b1;
                if (rkbVar != null) {
                    rkbVar.d(flbVarF);
                }
                flbVarF.m(true);
                flb flbVarF2 = RecyclerView.F(view);
                flbVarF2.m = null;
                flbVarF2.n = false;
                flbVarF2.i &= -33;
                gp3Var.n(flbVarF2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) gp3Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract boolean d();

    public final void d0(View view, gp3 gp3Var) {
        ta0 ta0Var = this.a;
        g5b g5bVar = (g5b) ta0Var.c;
        int iIndexOfChild = ((RecyclerView) g5bVar.b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((zy1) ta0Var.d).w(iIndexOfChild)) {
                ta0Var.U(view);
            }
            g5bVar.r(iIndexOfChild);
        }
        gp3Var.m(view);
    }

    public boolean e(ukb ukbVar) {
        return true;
    }

    public final void e0(int i) {
        if (t(i) != null) {
            ta0 ta0Var = this.a;
            int iY = ta0Var.y(i);
            g5b g5bVar = (g5b) ta0Var.c;
            View childAt = ((RecyclerView) g5bVar.b).getChildAt(iY);
            if (childAt == null) {
                return;
            }
            if (((zy1) ta0Var.d).w(iY)) {
                ta0Var.U(childAt);
            }
            g5bVar.r(iY);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    public final boolean f0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iY = y();
        int iA = A();
        int iZ = this.m - z();
        int iX = this.n - x();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iY;
        int iMin = Math.min(0, i);
        int i2 = top - iA;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iZ;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iX);
        RecyclerView recyclerView2 = this.b;
        WeakHashMap weakHashMap = nvf.a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iY2 = y();
                int iA2 = A();
                int iZ2 = this.m - z();
                int iX2 = this.n - x();
                Rect rect2 = this.b.w;
                RecyclerView.G(focusedChild, rect2);
                if (rect2.left - i4 < iZ2 && rect2.right - i4 > iY2 && rect2.top - i5 < iX2 && rect2.bottom - i5 > iA2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.Y(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.Y(i4, i5, false);
            return true;
        }
        return false;
    }

    public abstract void g(int i, int i2, blb blbVar, i12 i12Var);

    public final void g0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int h0(int i, gp3 gp3Var, blb blbVar);

    public abstract int i(blb blbVar);

    public abstract int i0(int i, gp3 gp3Var, blb blbVar);

    public abstract int j(blb blbVar);

    public final void j0(RecyclerView recyclerView) {
        k0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int k(blb blbVar);

    public final void k0(int i, int i2) {
        this.m = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.k = mode;
        if (mode == 0 && !RecyclerView.N1) {
            this.m = 0;
        }
        this.n = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.l = mode2;
        if (mode2 != 0 || RecyclerView.N1) {
            return;
        }
        this.n = 0;
    }

    public abstract int l(blb blbVar);

    public void l0(Rect rect, int i, int i2) {
        int iZ = z() + y() + rect.width();
        int iX = x() + A() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = nvf.a;
        this.b.setMeasuredDimension(f(i, iZ, recyclerView.getMinimumWidth()), f(i2, iX, this.b.getMinimumHeight()));
    }

    public abstract int m(blb blbVar);

    public final void m0(int i, int i2) {
        int iU = u();
        if (iU == 0) {
            this.b.l(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iU; i7++) {
            View viewT = t(i7);
            Rect rect = this.b.w;
            RecyclerView.G(viewT, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.w.set(i6, i4, i3, i5);
        l0(this.b.w, i, i2);
    }

    public abstract int n(blb blbVar);

    public final void n0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.m = 0;
            this.n = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.f;
            this.m = recyclerView.getWidth();
            this.n = recyclerView.getHeight();
        }
        this.k = 1073741824;
        this.l = 1073741824;
    }

    public final void o(gp3 gp3Var) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            flb flbVarF = RecyclerView.F(viewT);
            if (!flbVarF.n()) {
                if (!flbVarF.e() || flbVarF.g()) {
                    t(iU);
                    this.a.l(iU);
                    gp3Var.o(viewT);
                    this.b.g.u(flbVarF);
                } else {
                    this.b.z.getClass();
                    e0(iU);
                    gp3Var.n(flbVarF);
                }
            }
        }
    }

    public final boolean o0(View view, int i, int i2, ukb ukbVar) {
        return (!view.isLayoutRequested() && this.g && G(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) ukbVar).width) && G(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) ukbVar).height)) ? false : true;
    }

    public View p(int i) {
        int iU = u();
        for (int i2 = 0; i2 < iU; i2++) {
            View viewT = t(i2);
            flb flbVarF = RecyclerView.F(viewT);
            if (flbVarF != null && flbVarF.b() == i && !flbVarF.n() && (this.b.s1.f || !flbVarF.g())) {
                return viewT;
            }
        }
        return null;
    }

    public boolean p0() {
        return false;
    }

    public abstract ukb q();

    public final boolean q0(View view, int i, int i2, ukb ukbVar) {
        return (this.g && G(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) ukbVar).width) && G(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) ukbVar).height)) ? false : true;
    }

    public ukb r(Context context, AttributeSet attributeSet) {
        return new ukb(context, attributeSet);
    }

    public abstract boolean r0();

    public ukb s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ukb) {
            return new ukb((ukb) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ukb((ViewGroup.MarginLayoutParams) layoutParams) : new ukb(layoutParams);
    }

    public final View t(int i) {
        ta0 ta0Var = this.a;
        if (ta0Var != null) {
            return ta0Var.q(i);
        }
        return null;
    }

    public final int u() {
        ta0 ta0Var = this.a;
        if (ta0Var != null) {
            return ta0Var.r();
        }
        return 0;
    }

    public int w(gp3 gp3Var, blb blbVar) {
        return -1;
    }

    public final int x() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int y() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int z() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public void K() {
    }

    public void S() {
    }

    public void R(int i, int i2) {
    }

    public void T(int i, int i2) {
    }

    public void U(int i, int i2) {
    }

    public void V(int i, int i2) {
    }

    public void h(int i, i12 i12Var) {
    }

    public void a0(int i) {
    }

    public void P(gp3 gp3Var, blb blbVar, View view, t6 t6Var) {
    }
}

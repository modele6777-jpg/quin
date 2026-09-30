package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class elb implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView g;

    public elb(RecyclerView recyclerView) {
        this.g = recyclerView;
        pa5 pa5Var = RecyclerView.Q1;
        this.d = pa5Var;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), pa5Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.g;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.d;
        pa5 pa5Var = RecyclerView.Q1;
        if (interpolator != pa5Var) {
            this.d = pa5Var;
            this.c = new OverScroller(recyclerView.getContext(), pa5Var);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.e) {
            this.f = true;
            return;
        }
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = nvf.a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.g;
        int[] iArr = recyclerView.E1;
        if (recyclerView.E0 == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.k();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.a;
            int i7 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int iJ = RecyclerView.j(i6, recyclerView.X0, recyclerView.Z0, recyclerView.getWidth());
            int iJ2 = RecyclerView.j(i7, recyclerView.Y0, recyclerView.a1, recyclerView.getHeight());
            int[] iArr2 = recyclerView.E1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.p(iJ, iJ2, 1, iArr2, null)) {
                iJ -= iArr[0];
                iJ2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.i(iJ, iJ2);
            }
            if (recyclerView.z != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.W(iJ, iJ2, iArr);
                int i8 = iArr[0];
                int i9 = iArr[1];
                recyclerView.E0.getClass();
                i = iJ - i8;
                i3 = i8;
                i2 = iJ2 - i9;
                i4 = i9;
            } else {
                i = iJ;
                i2 = iJ2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.G0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.E1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.q(i3, i4, i, i2, null, 1, iArr3);
            int i10 = i - iArr[0];
            int i11 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.r(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i10 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i11 != 0));
            recyclerView.E0.getClass();
            if (z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i10 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i10 > 0 ? currVelocity : 0;
                    }
                    if (i11 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i11 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.t();
                        if (recyclerView.X0.isFinished()) {
                            recyclerView.X0.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.u();
                        if (recyclerView.Z0.isFinished()) {
                            recyclerView.Z0.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.v();
                        if (recyclerView.Y0.isFinished()) {
                            recyclerView.Y0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.s();
                        if (recyclerView.a1.isFinished()) {
                            recyclerView.a1.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = nvf.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.O1) {
                    i12 i12Var = recyclerView.r1;
                    int[] iArr4 = i12Var.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    i12Var.d = 0;
                }
            } else {
                if (this.e) {
                    this.f = true;
                } else {
                    recyclerView.removeCallbacks(this);
                    WeakHashMap weakHashMap2 = nvf.a;
                    recyclerView.postOnAnimation(this);
                }
                r46 r46Var = recyclerView.q1;
                if (r46Var != null) {
                    r46Var.a(recyclerView, i3, i4);
                }
            }
        }
        recyclerView.E0.getClass();
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.b0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap3 = nvf.a;
            recyclerView.postOnAnimation(this);
        }
    }
}

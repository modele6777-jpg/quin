package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import io.sentry.android.core.b1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class w7g extends e8g {
    public static boolean n = false;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public x47[] d;
    public x47 e;
    public h8g f;
    public x47 g;
    public int h;
    public ma4 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public w7g(h8g h8gVar, WindowInsets windowInsets) {
        super(h8gVar);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    private ma4 D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return ma4.a(point.x, point.y, 0, 0, 0, 0, true);
        }
        x6c x6cVarP = xq.p(display, 0);
        x6c x6cVarP2 = xq.p(display, 1);
        x6c x6cVarP3 = xq.p(display, 2);
        x6c x6cVarP4 = xq.p(display, 3);
        return ma4.a(point.x, point.y, x6cVarP != null ? x6cVarP.b : 0, x6cVarP2 != null ? x6cVarP2.b : 0, x6cVarP3 != null ? x6cVarP3.b : 0, x6cVarP4 != null ? x6cVarP4.b : 0, false);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[m7c.m(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(x47 x47Var) {
        ArrayList arrayList = new ArrayList();
        int i = x47Var.a;
        int i2 = x47Var.d;
        int i3 = x47Var.c;
        int i4 = x47Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, x47Var.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private x47 G(int i, boolean z) {
        x47 x47VarA = x47.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                x47VarA = x47.a(x47VarA, H(i2, z));
            }
        }
        return x47VarA;
    }

    private x47 I() {
        h8g h8gVar = this.f;
        return h8gVar != null ? h8gVar.a.l() : x47.e;
    }

    private x47 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            s8f.i("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!n) {
            L();
        }
        Method method = o;
        if (method != null && p != null && q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    b1.n("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) q.get(r.get(objInvoke));
                if (rect != null) {
                    return x47.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                b1.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void L() {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            b1.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        n = true;
    }

    public static boolean M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.e8g
    public void A(int i) {
        this.h = i;
    }

    @Override // defpackage.e8g
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.e8g
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public x47 H(int i, boolean z) {
        x47 x47VarL;
        int i2;
        x47 x47Var = x47.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    x47[] x47VarArr = this.d;
                    x47VarL = x47VarArr != null ? x47VarArr[m7c.m(8)] : null;
                    if (x47VarL != null) {
                        return x47VarL;
                    }
                    x47 x47VarN = n();
                    x47 x47VarI = I();
                    int i3 = x47VarN.d;
                    if (i3 > x47VarI.d) {
                        return x47.b(0, 0, 0, i3);
                    }
                    x47 x47Var2 = this.g;
                    if (x47Var2 != null && !x47Var2.equals(x47Var) && (i2 = this.g.d) > x47VarI.d) {
                        return x47.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        h8g h8gVar = this.f;
                        ha4 ha4VarH = h8gVar != null ? h8gVar.a.h() : h();
                        if (ha4VarH != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return x47.b(i4 >= 28 ? s.G(ha4VarH.a) : 0, i4 >= 28 ? s.I(ha4VarH.a) : 0, i4 >= 28 ? s.H(ha4VarH.a) : 0, i4 >= 28 ? s.F(ha4VarH.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    x47 x47VarI2 = I();
                    x47 x47VarL2 = l();
                    return x47.b(Math.max(x47VarI2.a, x47VarL2.a), 0, Math.max(x47VarI2.c, x47VarL2.c), Math.max(x47VarI2.d, x47VarL2.d));
                }
                if ((this.h & 2) == 0) {
                    x47 x47VarN2 = n();
                    h8g h8gVar2 = this.f;
                    x47VarL = h8gVar2 != null ? h8gVar2.a.l() : null;
                    int iMin = x47VarN2.d;
                    if (x47VarL != null) {
                        iMin = Math.min(iMin, x47VarL.d);
                    }
                    return x47.b(x47VarN2.a, 0, x47VarN2.c, iMin);
                }
            }
        } else {
            if (z) {
                return x47.b(0, Math.max(I().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return x47.b(0, n().b, 0, 0);
            }
        }
        return x47Var;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(x47.e);
    }

    @Override // defpackage.e8g
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        x47 x47VarJ = J(view);
        if (x47VarJ == null) {
            x47VarJ = x47.e;
        }
        x(x47VarJ);
    }

    @Override // defpackage.e8g
    public void e(h8g h8gVar) {
        h8gVar.a.y(this.f);
        x47 x47Var = this.g;
        e8g e8gVar = h8gVar.a;
        e8gVar.x(x47Var);
        e8gVar.A(this.h);
        e8gVar.v(this.i);
        e8gVar.B(this.l);
        e8gVar.C(this.m);
    }

    @Override // defpackage.e8g
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        w7g w7gVar = (w7g) obj;
        return Objects.equals(this.g, w7gVar.g) && M(this.h, w7gVar.h);
    }

    @Override // defpackage.e8g
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    @Override // defpackage.e8g
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    @Override // defpackage.e8g
    public x47 i(int i) {
        return G(i, false);
    }

    @Override // defpackage.e8g
    public x47 j(int i) {
        return G(i, true);
    }

    @Override // defpackage.e8g
    public final x47 n() {
        x47 x47Var = this.e;
        if (x47Var != null) {
            return x47Var;
        }
        WindowInsets windowInsets = this.c;
        x47 x47VarB = x47.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = x47VarB;
        return x47VarB;
    }

    @Override // defpackage.e8g
    public void p(View view) {
        this.i = D(view);
    }

    @Override // defpackage.e8g
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM = m7c.m(i);
            this.l[iM] = F(i(i));
            if (i != 8) {
                this.m[iM] = F(j(i));
            }
        }
    }

    @Override // defpackage.e8g
    public h8g r(int i, int i2, int i3, int i4) {
        v7g p7gVar;
        h8g h8gVarC = h8g.c(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            p7gVar = new u7g(h8gVarC);
        } else if (i5 >= 35) {
            p7gVar = new t7g(h8gVarC);
        } else if (i5 >= 34) {
            p7gVar = new s7g(h8gVarC);
        } else if (i5 >= 31) {
            p7gVar = new r7g(h8gVarC);
        } else if (i5 >= 30) {
            p7gVar = new q7g(h8gVarC);
        } else {
            p7gVar = i5 >= 29 ? new p7g(h8gVarC) : new o7g(h8gVarC);
        }
        p7gVar.h(h8g.a(n(), i, i2, i3, i4));
        p7gVar.f(h8g.a(l(), i, i2, i3, i4));
        return p7gVar.b();
    }

    @Override // defpackage.e8g
    public boolean t() {
        return this.c.isRound();
    }

    @Override // defpackage.e8g
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.e8g
    public void v(ma4 ma4Var) {
        this.i = ma4Var;
    }

    @Override // defpackage.e8g
    public void w(x47[] x47VarArr) {
        this.d = x47VarArr;
    }

    @Override // defpackage.e8g
    public void x(x47 x47Var) {
        this.g = x47Var;
    }

    @Override // defpackage.e8g
    public void y(h8g h8gVar) {
        this.f = h8gVar;
    }

    public w7g(h8g h8gVar, w7g w7gVar) {
        this(h8gVar, new WindowInsets(w7gVar.c));
    }
}

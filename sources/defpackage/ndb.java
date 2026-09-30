package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ndb implements n21, cu2, yrf, tw3, z41, bc2, ov2, gv8, mm0, xle, dk9, af0 {
    public static final ndb F0;
    public static final ar M0;
    public final /* synthetic */ int a;
    public static final lx0 b = new lx0(-1.0f, -1.0f);
    public static final lx0 c = new lx0(0.0f, -1.0f);
    public static final lx0 d = new lx0(1.0f, -1.0f);
    public static final lx0 e = new lx0(-1.0f, 0.0f);
    public static final lx0 f = new lx0(0.0f, 0.0f);
    public static final lx0 g = new lx0(1.0f, 0.0f);
    public static final lx0 v = new lx0(-1.0f, 1.0f);
    public static final lx0 w = new lx0(0.0f, 1.0f);
    public static final lx0 x = new lx0(1.0f, 1.0f);
    public static final kx0 y = new kx0(-1.0f);
    public static final kx0 z = new kx0(0.0f);
    public static final kx0 X = new kx0(1.0f);
    public static final jx0 Y = new jx0(-1.0f);
    public static final jx0 Z = new jx0(0.0f);
    public static final jx0 E0 = new jx0(1.0f);
    public static final ndb G0 = new ndb(3);
    public static final ndb H0 = new ndb(4);
    public static final ndb I0 = new ndb(5);
    public static final ndb J0 = new ndb(6);
    public static final ar K0 = new ar(0);
    public static final ar L0 = new ar(1);
    public static final ndb N0 = new ndb(8);
    public static final ndb O0 = new ndb(9);
    public static final ndb P0 = new ndb(10);
    public static final ndb Q0 = new ndb(11);
    public static final cv7 R0 = cv7.a;
    public static final vw3 S0 = new vw3(1.0f, 1.0f);
    public static final ndb T0 = new ndb(12);
    public static final ndb U0 = new ndb(13);
    public static final ndb V0 = new ndb(14);
    public static final /* synthetic */ ndb W0 = new ndb(15);
    public static final ndb X0 = new ndb(16);
    public static final /* synthetic */ ndb Y0 = new ndb(17);
    public static final ndb Z0 = new ndb(18);
    public static final ndb a1 = new ndb(19);
    public static final ndb b1 = new ndb(20);
    public static final ndb c1 = new ndb(21);
    public static final ndb d1 = new ndb(22);
    public static final ndb e1 = new ndb(23);
    public static final ndb f1 = new ndb(24);
    public static final ndb g1 = new ndb(25);
    public static final /* synthetic */ ndb h1 = new ndb(27);
    public static final ndb i1 = new ndb(28);
    public static final ndb j1 = new ndb(29);

    static {
        int i = 2;
        F0 = new ndb(i);
        M0 = new ar(i);
    }

    public /* synthetic */ ndb(int i) {
        this.a = i;
    }

    public static Bitmap g(Bitmap bitmap) {
        int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (iMax <= 2048) {
            return bitmap;
        }
        float f2 = 2048.0f / iMax;
        int iL = ym8.L(bitmap.getWidth() * f2);
        if (iL < 1) {
            iL = 1;
        }
        int iL2 = ym8.L(bitmap.getHeight() * f2);
        if (iL2 < 1) {
            iL2 = 1;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iL, iL2, true);
        bitmapCreateScaledBitmap.getClass();
        return bitmapCreateScaledBitmap;
    }

    @Override // defpackage.xle
    public Map a(ttb ttbVar) {
        return qu4.a;
    }

    @Override // defpackage.tw3
    public float b(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.bc2
    public Object c(hbc hbcVar) {
        Object objR = hbcVar.r(new y3b(yaf.class, Executor.class));
        objR.getClass();
        return t72.z((Executor) objR);
    }

    @Override // defpackage.af0
    public boolean d(df0 df0Var) {
        return df0Var.equals(xf0.l) || (df0Var instanceof if0) || (df0Var instanceof gf0) || (df0Var instanceof mf0) || df0Var.equals(fg0.l);
    }

    @Override // defpackage.mm0
    public int e() {
        return 2;
    }

    @Override // defpackage.z41
    public long f() {
        return 9205357640488583168L;
    }

    @Override // defpackage.z41
    public sw3 getDensity() {
        return S0;
    }

    @Override // defpackage.z41
    public cv7 getLayoutDirection() {
        return R0;
    }

    @Override // defpackage.n21
    public Rect i(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
                return rect;
            }
            int i2 = rect.right + dimensionPixelSize;
            if (i2 == point.x) {
                rect.right = i2;
            }
        }
        return rect;
    }

    @Override // defpackage.cu2
    public Object v(Object obj) {
        switch (this.a) {
            case 4:
                return (ftb) obj;
            default:
                ((vyb) obj).close();
                return null;
        }
    }

    @Override // defpackage.dk9
    public String w() {
        return "expected an Int value";
    }

    @Override // defpackage.yrf
    public Object x(cj7 cj7Var, float f2) {
        switch (this.a) {
            case 6:
                boolean z2 = cj7Var.l() == 1;
                if (z2) {
                    cj7Var.beginArray();
                }
                double dNextDouble = cj7Var.nextDouble();
                double dNextDouble2 = cj7Var.nextDouble();
                double dNextDouble3 = cj7Var.nextDouble();
                double dNextDouble4 = cj7Var.l() == 7 ? cj7Var.nextDouble() : 1.0d;
                if (z2) {
                    cj7Var.endArray();
                }
                if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
                    dNextDouble *= 255.0d;
                    dNextDouble2 *= 255.0d;
                    dNextDouble3 *= 255.0d;
                    if (dNextDouble4 <= 1.0d) {
                        dNextDouble4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
            default:
                return Integer.valueOf(Math.round(lj7.d(cj7Var) * f2));
        }
    }

    @Override // defpackage.af0
    public void y0(c4c c4cVar, rf0 rf0Var, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        rf0Var.getClass();
        l46Var.h0(1461299557);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(c4cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(rf0Var) : l46Var.i(rf0Var) ? 32 : 16;
        }
        final int i3 = 1;
        final int i4 = 0;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            final z5c z5cVar = rf0Var.a;
            if (z5cVar instanceof if0) {
                l46Var.f0(-145426555);
                t72.f(((if0) z5cVar).l, (i2 & 14) | 384, af1.b0(-1646837738, new vu0(rf0Var, i3), l46Var), l46Var, c4cVar);
                l46Var.r(false);
            } else if (z5cVar instanceof gf0) {
                l46Var.f0(-145422504);
                s62.a((i2 & 14) | 384, 1, af1.b0(969396189, new n26() { // from class: kgb
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        int i5 = i4;
                        wef wefVar = wef.a;
                        z5c z5cVar2 = z5cVar;
                        c4c c4cVar2 = (c4c) obj;
                        l46 l46Var2 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i5) {
                            case 0:
                                c4cVar2.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= l46Var2.g(c4cVar2) ? 4 : 2;
                                }
                                if (!l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    l46Var2.Z();
                                } else {
                                    oa7.j(c4cVar2, v4e.o0(((gf0) z5cVar2).p).toString(), l46Var2, iIntValue & 14);
                                }
                                break;
                            default:
                                c4cVar2.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= l46Var2.g(c4cVar2) ? 4 : 2;
                                }
                                if (!l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    l46Var2.Z();
                                } else {
                                    oa7.j(c4cVar2, v4e.o0(((mf0) z5cVar2).l).toString(), l46Var2, iIntValue & 14);
                                }
                                break;
                        }
                        return wefVar;
                    }
                }, l46Var), l46Var, c4cVar);
                l46Var.r(false);
            } else if (z5cVar instanceof mf0) {
                l46Var.f0(-145419784);
                s62.a((i2 & 14) | 384, 1, af1.b0(837072444, new n26() { // from class: kgb
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        int i5 = i3;
                        wef wefVar = wef.a;
                        z5c z5cVar2 = z5cVar;
                        c4c c4cVar2 = (c4c) obj;
                        l46 l46Var2 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i5) {
                            case 0:
                                c4cVar2.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= l46Var2.g(c4cVar2) ? 4 : 2;
                                }
                                if (!l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    l46Var2.Z();
                                } else {
                                    oa7.j(c4cVar2, v4e.o0(((gf0) z5cVar2).p).toString(), l46Var2, iIntValue & 14);
                                }
                                break;
                            default:
                                c4cVar2.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= l46Var2.g(c4cVar2) ? 4 : 2;
                                }
                                if (!l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    l46Var2.Z();
                                } else {
                                    oa7.j(c4cVar2, v4e.o0(((mf0) z5cVar2).l).toString(), l46Var2, iIntValue & 14);
                                }
                                break;
                        }
                        return wefVar;
                    }
                }, l46Var), l46Var, c4cVar);
                l46Var.r(false);
            } else if (z5cVar.equals(fg0.l)) {
                l46Var.f0(-145417446);
                oa7.m(c4cVar, rf0Var, l46Var, i2 & 126);
                l46Var.r(false);
            } else {
                l46Var.f0(-145416291);
                oa7.k(c4cVar, rf0Var, null, l46Var, i2 & 126, 2);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(i, 15, this, c4cVar, rf0Var, dd2Var);
        }
    }
}

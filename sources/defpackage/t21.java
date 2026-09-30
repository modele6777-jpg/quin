package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t21 implements a26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ t21(cea ceaVar, tn8 tn8Var, zn8 zn8Var, int i, int i2, u21 u21Var) {
        this.d = ceaVar;
        this.e = tn8Var;
        this.f = zn8Var;
        this.b = i;
        this.c = i2;
        this.g = u21Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Throwable {
        Bitmap bitmap;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                s21.d((bea) obj, (cea) obj5, (tn8) obj4, ((zn8) obj3).getLayoutDirection(), this.b, this.c, ((u21) obj2).a);
                return wefVar;
            default:
                Set set = (Set) obj5;
                e89 e89Var = (e89) obj2;
                im2 im2Var = (im2) obj;
                im2Var.getClass();
                vv7 vv7Var = (vv7) im2Var;
                xl1 xl1Var = vv7Var.a;
                vv7Var.a();
                if (((Boolean) ((e89) obj3).getValue()).booleanValue()) {
                    long jIntBitsToFloat = (((long) ((int) Float.intBitsToFloat((int) (xl1Var.f() & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (xl1Var.f() >> 32)))) << 32);
                    if (set == null || !set.contains(new e77(jIntBitsToFloat))) {
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        long jIntBitsToFloat2 = (((long) ((int) Float.intBitsToFloat((int) (xl1Var.f() & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (xl1Var.f() >> 32)))) << 32);
                        long jX = dj6.x(this.c, jIntBitsToFloat2);
                        int i2 = (int) (jX >> 32);
                        int i3 = (int) (jX & 4294967295L);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config);
                        bitmapCreateBitmap.getClass();
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.drawColor(this.b);
                        canvas.scale(i2 / ((int) (jIntBitsToFloat2 >> 32)), i3 / ((int) (jIntBitsToFloat2 & 4294967295L)));
                        try {
                            vw3 vw3Var = new vw3(((vv7) im2Var).a.getDensity(), ((vv7) im2Var).a.h0());
                            vv7 vv7Var2 = (vv7) im2Var;
                            cv7 layoutDirection = vv7Var2.getLayoutDirection();
                            Canvas canvas2 = mp.a;
                            lp lpVar = new lp();
                            lpVar.a = canvas;
                            long jF = ((vv7) im2Var).a.f();
                            xl1 xl1Var2 = ((vv7) im2Var).a;
                            sw3 sw3VarU = xl1Var2.b.u();
                            cv7 cv7VarW = xl1Var2.b.w();
                            vl1 vl1VarP = xl1Var2.b.p();
                            long jZ = xl1Var2.b.z();
                            ta0 ta0Var = xl1Var2.b;
                            try {
                                ke6 ke6Var = (ke6) ta0Var.d;
                                ta0Var.P(vw3Var);
                                ta0Var.Q(layoutDirection);
                                ta0Var.O(lpVar);
                                ta0Var.R(jF);
                                ta0Var.d = null;
                                lpVar.g();
                                try {
                                    vv7Var2.a();
                                    lpVar.o();
                                    ta0 ta0Var2 = xl1Var2.b;
                                    ta0Var2.P(sw3VarU);
                                    ta0Var2.Q(cv7VarW);
                                    ta0Var2.O(vl1VarP);
                                    ta0Var2.R(jZ);
                                    ta0Var2.d = ke6Var;
                                    if (set != null) {
                                        set.add(new e77(jIntBitsToFloat));
                                    }
                                    ((l26) e89Var.getValue()).z(bitmapCreateBitmap, obj4);
                                    return wefVar;
                                } catch (Throwable th) {
                                    bitmap = bitmapCreateBitmap;
                                    try {
                                        lpVar.o();
                                        ta0 ta0Var3 = xl1Var2.b;
                                        ta0Var3.P(sw3VarU);
                                        ta0Var3.Q(cv7VarW);
                                        ta0Var3.O(vl1VarP);
                                        ta0Var3.R(jZ);
                                        ta0Var3.d = ke6Var;
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bitmap.recycle();
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bitmap = bitmapCreateBitmap;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bitmap = bitmapCreateBitmap;
                        }
                    }
                }
                return wefVar;
        }
    }

    public /* synthetic */ t21(Set set, int i, int i2, Object obj, e89 e89Var, e89 e89Var2) {
        this.d = set;
        this.b = i;
        this.c = i2;
        this.e = obj;
        this.f = e89Var;
        this.g = e89Var2;
    }
}

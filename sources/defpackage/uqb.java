package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uqb implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ jmb c;
    public final /* synthetic */ zqb d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uqb(long j, jmb jmbVar, zqb zqbVar, b41 b41Var, Context context) {
        this.b = j;
        this.c = jmbVar;
        this.d = zqbVar;
        this.f = b41Var;
        this.e = context;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j;
        b41 b41Var;
        Object objB;
        Object objB2;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                vv7 vv7Var = (vv7) obj2;
                ke6 ke6Var = (ke6) obj;
                ke6Var.getClass();
                zqb zqbVar = this.d;
                xh6 xh6Var = zqbVar.a;
                ke6Var.f(xh6Var.X0);
                lw7 lw7Var = zh6.a;
                ke6Var.g(xh6Var.d1 != null);
                ci6 ci6Var = xh6Var.Y0;
                b68 b68VarJ = ci6Var != null ? urg.j(ci6Var) : xh6Var.T0;
                if (b68VarJ != null) {
                    me6 me6Var = ke6Var.a;
                    if (me6Var.m() != 1) {
                        me6Var.H(1);
                    }
                }
                vv7Var.F0(db6.P0(vv7Var.a.f()), new uqb(this.b, this.c, zqbVar, b68VarJ, this.e), ke6Var);
                i7h.r(vv7Var, ke6Var);
                return wefVar;
            default:
                b41 b41Var2 = (b41) obj2;
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                long j2 = this.b;
                long j3 = j2 ^ (-9223372034707292160L);
                long jF = sn4Var.f();
                jmb jmbVar = this.c;
                long jF2 = ald.f(jF, jmbVar.element);
                zqb zqbVar2 = this.d;
                xh6 xh6Var2 = zqbVar2.a;
                lw7 lw7Var2 = zh6.a;
                eb3.I(sn4Var, j3, jF2, xh6Var2.d1 != null, new ckb(3, zqbVar2));
                long jF3 = sn4Var.f();
                b41 b41Var3 = b41Var2;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jF3 & 4294967295L)) + (Math.max(Float.intBitsToFloat((int) (j2 & 4294967295L)), 0.0f) * 2.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jF3 >> 32)) + (Math.max(Float.intBitsToFloat((int) (j2 >> 32)), 0.0f) * 2.0f))) << 32);
                float fE = zh6.e(xh6Var2);
                xh6 xh6Var3 = xh6Var2;
                if (fE > 0.0f) {
                    long j4 = (((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L);
                    Context context = this.e;
                    if (j4 != 0 || hl9.c(j3, 0L)) {
                        j = j2;
                        ssg ssgVar = ey9.a;
                        ssgVar.getClass();
                        x79 x79Var = (x79) ssgVar.b;
                        if (x79Var.d()) {
                            objB = x79Var.b();
                            x79Var.m(objB);
                        } else {
                            objB = null;
                        }
                        dy9 dy9VarH = (dy9) objB;
                        if (dy9VarH == null) {
                            dy9VarH = urg.h();
                        }
                        dy9 dy9Var = dy9VarH;
                        try {
                            rt rtVar = (rt) dy9Var;
                            rtVar.a.setAntiAlias(true);
                            rtVar.d(mh3.n(fE, 0.0f, 1.0f));
                            Bitmap bitmapO = q6.o(context);
                            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                            BitmapShader bitmapShader = new BitmapShader(bitmapO, tileMode, tileMode);
                            float f = jmbVar.element;
                            float f2 = f > 0.0f ? f : 1.0f;
                            if (Math.abs(f2 - 1.0f) >= 0.001f) {
                                Matrix matrix = new Matrix();
                                float f3 = 1.0f / f2;
                                matrix.setScale(f3, f3);
                                bitmapShader.setLocalMatrix(matrix);
                            }
                            rtVar.j(bitmapShader);
                            rtVar.e(9);
                            vl1 vl1VarP = sn4Var.v0().p();
                            hkb hkbVarG = z5c.g(0L, jFloatToRawIntBits);
                            vl1VarP.s(hkbVarG.a, hkbVarG.b, hkbVarG.c, hkbVarG.d, dy9Var);
                            ((rt) dy9Var).a.reset();
                            if (x79Var.d < 3) {
                                x79Var.l(dy9Var);
                            }
                        } catch (Throwable th) {
                            ((rt) dy9Var).a.reset();
                            if (x79Var.d < 3) {
                                x79Var.l(dy9Var);
                            }
                            throw th;
                        }
                    } else {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                        j = j2;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                        ((vd9) sn4Var.v0().c).I(fIntBitsToFloat, fIntBitsToFloat2);
                        try {
                            ssg ssgVar2 = ey9.a;
                            ssgVar2.getClass();
                            x79 x79Var2 = (x79) ssgVar2.b;
                            if (x79Var2.d()) {
                                objB2 = x79Var2.b();
                                x79Var2.m(objB2);
                            } else {
                                objB2 = null;
                            }
                            dy9 dy9VarH2 = (dy9) objB2;
                            if (dy9VarH2 == null) {
                                dy9VarH2 = urg.h();
                            }
                            dy9 dy9Var2 = dy9VarH2;
                            try {
                                rt rtVar2 = (rt) dy9Var2;
                                rtVar2.a.setAntiAlias(true);
                                rtVar2.d(mh3.n(fE, 0.0f, 1.0f));
                                Bitmap bitmapO2 = q6.o(context);
                                Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                                BitmapShader bitmapShader2 = new BitmapShader(bitmapO2, tileMode2, tileMode2);
                                float f4 = jmbVar.element;
                                if (f4 <= 0.0f) {
                                    f4 = 1.0f;
                                }
                                if (Math.abs(f4 - 1.0f) >= 0.001f) {
                                    Matrix matrix2 = new Matrix();
                                    float f5 = 1.0f / f4;
                                    matrix2.setScale(f5, f5);
                                    bitmapShader2.setLocalMatrix(matrix2);
                                }
                                rtVar2.j(bitmapShader2);
                                rtVar2.e(9);
                                vl1 vl1VarP2 = sn4Var.v0().p();
                                hkb hkbVarG2 = z5c.g(0L, jFloatToRawIntBits);
                                vl1VarP2.s(hkbVarG2.a, hkbVarG2.b, hkbVarG2.c, hkbVarG2.d, dy9Var2);
                                ((rt) dy9Var2).a.reset();
                                if (x79Var2.d < 3) {
                                    x79Var2.l(dy9Var2);
                                }
                                ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                            } catch (Throwable th2) {
                                ((rt) dy9Var2).a.reset();
                                x79 x79Var3 = (x79) ssgVar2.b;
                                if (x79Var3.d < 3) {
                                    x79Var3.l(dy9Var2);
                                }
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                            throw th3;
                        }
                    }
                } else {
                    j = j2;
                }
                if (((((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0 || hl9.c(j3, 0L)) {
                    b41Var = b41Var3;
                    long j5 = j;
                    Iterator it = zh6.f(xh6Var3).iterator();
                    while (it.hasNext()) {
                        eb3.J(sn4Var, (li6) it.next(), xh6Var3, j5, jFloatToRawIntBits, b41Var);
                    }
                } else {
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                    ((vd9) sn4Var.v0().c).I(fIntBitsToFloat3, fIntBitsToFloat4);
                    try {
                        Iterator it2 = zh6.f(xh6Var3).iterator();
                        while (it2.hasNext()) {
                            b41 b41Var4 = b41Var3;
                            xh6 xh6Var4 = xh6Var3;
                            long j6 = j;
                            eb3.J(sn4Var, (li6) it2.next(), xh6Var4, j6, jFloatToRawIntBits, b41Var4);
                            j = j6;
                            b41Var3 = b41Var4;
                            xh6Var3 = xh6Var4;
                        }
                        b41Var = b41Var3;
                        ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                    } catch (Throwable th4) {
                        ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                        throw th4;
                    }
                }
                if (b41Var != null) {
                    sn4.O0(sn4Var, b41Var, 0L, sn4Var.f(), 0.0f, null, null, 6, 58);
                }
                return wefVar;
        }
    }

    public /* synthetic */ uqb(zqb zqbVar, vv7 vv7Var, long j, jmb jmbVar, Context context) {
        this.d = zqbVar;
        this.f = vv7Var;
        this.b = j;
        this.c = jmbVar;
        this.e = context;
    }
}

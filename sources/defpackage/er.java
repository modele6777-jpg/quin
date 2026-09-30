package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class er implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ er(float f, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x025b  */
    /* JADX WARN: Code duplicated, block: B:48:0x025d A[PHI: r1
  0x025d: PHI (r1v16 float) = (r1v15 float), (r1v22 float) binds: [B:52:0x0271, B:46:0x0259] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        float fFloatValue;
        int i = this.a;
        int i2 = 0;
        float f = 0.0f;
        wef wefVar = wef.a;
        float f2 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                cv6 cv6Var = (cv6) obj3;
                xz0 xz0Var = (xz0) obj2;
                vv7 vv7Var = (vv7) ((im2) obj);
                vv7Var.a();
                ta0 ta0Var = vv7Var.a.b;
                long jZ = ta0Var.z();
                ta0Var.p().g();
                try {
                    vd9 vd9Var = (vd9) ta0Var.c;
                    vd9.J(vd9Var, f2, 0.0f, 2);
                    vd9Var.F(0L, 45.0f);
                    sn4.A(vv7Var, cv6Var, 0L, 0.0f, xz0Var, 0, 46);
                    return wefVar;
                } finally {
                    ks0.t(ta0Var, jZ);
                }
            case 1:
                final qt1 qt1Var = (qt1) obj3;
                final DropShadowPainter dropShadowPainter = (DropShadowPainter) obj2;
                h81 h81Var = (h81) obj;
                h81Var.getClass();
                final zt ztVarA = cu.a();
                final rt rtVarH = urg.h();
                final float density = h81Var.getDensity() * 16.0f;
                float density2 = h81Var.getDensity() * f2;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(density2)) << 32) | (((long) Float.floatToRawIntBits(density2)) & 4294967295L);
                return h81Var.a(new a26() { // from class: pt1
                    @Override // defpackage.a26
                    public final Object d(Object obj4) throws Throwable {
                        long j;
                        ta0 ta0Var2;
                        long j2;
                        rt rtVar = rtVarH;
                        DropShadowPainter dropShadowPainter2 = dropShadowPainter;
                        sn4 sn4Var = (sn4) obj4;
                        sn4Var.getClass();
                        qt1 qt1Var2 = qt1Var;
                        hkb hkbVar = (hkb) qt1Var2.b.getValue();
                        lsd lsdVar = qt1Var2.c;
                        hkb hkbVar2 = (hkb) lsdVar.get(qt1Var2.a);
                        wef wefVar2 = wef.a;
                        if (hkbVar2 == null || !hkbVar2.i(hkbVar)) {
                            return wefVar2;
                        }
                        hkb hkbVarK = hkbVar2.k(hkbVar.f() ^ (-9223372034707292160L));
                        float f3 = hkbVarK.a;
                        float f4 = hkbVarK.d;
                        float f5 = hkbVarK.b;
                        float fMin = Math.min(hkbVar2.d, hkbVar.d) - Math.max(hkbVar2.b, hkbVar.b);
                        float f6 = density;
                        float fN = mh3.n(fMin / f6, 0.0f, 1.0f);
                        float f7 = f5 < 0.0f ? 0.0f : -f6;
                        float fIntBitsToFloat = f4 > Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) ? Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) : Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) + f6;
                        float f8 = fIntBitsToFloat - f7;
                        Float fValueOf = Float.valueOf(0.0f);
                        long j3 = y72.j;
                        sn4 sn4Var2 = sn4Var;
                        iy9 iy9Var = new iy9(fValueOf, new y72(j3));
                        Float fValueOf2 = Float.valueOf(f6 / f8);
                        long j4 = y72.b;
                        b68 b68VarO = gec.O(new iy9[]{iy9Var, new iy9(fValueOf2, new y72(j4)), new iy9(Float.valueOf((f8 - f6) / f8), new y72(j4)), new iy9(Float.valueOf(1.0f), new y72(j3))}, f7, fIntBitsToFloat, 8);
                        zt ztVar = ztVarA;
                        ztVar.k();
                        Iterator it = lsdVar.d.iterator();
                        while (((b1e) it).hasNext()) {
                            hkb hkbVarK2 = ((hkb) ((b1e) it).next()).k(hkbVar.f() ^ (-9223372034707292160L));
                            long j5 = jFloatToRawIntBits;
                            zt.c(ztVar, w6c.a(hkbVarK2.a, hkbVarK2.b, hkbVarK2.c, hkbVarK2.d, Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L))));
                            it = it;
                            fIntBitsToFloat = fIntBitsToFloat;
                        }
                        float f9 = fIntBitsToFloat;
                        ta0 ta0VarV0 = sn4Var2.v0();
                        long jZ2 = ta0VarV0.z();
                        ta0VarV0.p().g();
                        try {
                            ((vd9) ta0VarV0.c).k(ztVar, 0);
                            float f10 = -f6;
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var2.f() >> 32)) + f6;
                            ta0 ta0VarV1 = sn4Var2.v0();
                            long jZ3 = ta0VarV1.z();
                            ta0VarV1.p().g();
                            try {
                                float f11 = f7;
                                ((vd9) ta0VarV1.c).l(f10, f11, fIntBitsToFloat2, f9, 1);
                                vl1 vl1VarP = sn4Var2.v0().p();
                                try {
                                    vl1VarP.l(new hkb(f3 - f6, f5 - f6, hkbVarK.c + f6, f4 + f6), rtVar);
                                    ((vd9) sn4Var2.v0().c).I(f3, f5);
                                    try {
                                        ta0Var2 = ta0VarV1;
                                        try {
                                            fy9.h(dropShadowPainter2, sn4Var2, hkbVarK.e(), fN, 4);
                                            try {
                                                ((vd9) sn4Var2.v0().c).I(-f3, -f5);
                                                try {
                                                    sn4.O0(sn4Var2, b68VarO, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits((f6 * 2.0f) + Float.intBitsToFloat((int) (sn4Var2.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, null, null, 6, 56);
                                                    vl1VarP.o();
                                                    try {
                                                        ta0Var2.p().o();
                                                        ta0Var2.R(jZ3);
                                                        ks0.t(ta0VarV0, jZ2);
                                                        return wefVar2;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        j = jZ2;
                                                        ks0.t(ta0VarV0, j);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    j2 = jZ3;
                                                    j = jZ2;
                                                    try {
                                                        ta0Var2.p().o();
                                                        ta0Var2.R(j2);
                                                        throw th;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        ks0.t(ta0VarV0, j);
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                j = jZ2;
                                                j2 = jZ3;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            sn4Var2 = sn4Var2;
                                            j2 = jZ3;
                                            j = jZ2;
                                            try {
                                                ((vd9) sn4Var2.v0().c).I(-f3, -f5);
                                                throw th;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                ta0Var2.p().o();
                                                ta0Var2.R(j2);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        ta0Var2 = ta0VarV1;
                                        j2 = jZ3;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    ta0Var2 = ta0VarV1;
                                    j2 = jZ3;
                                    j = jZ2;
                                    ta0Var2.p().o();
                                    ta0Var2.R(j2);
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                ta0Var2 = ta0VarV1;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            j = jZ2;
                        }
                    }
                });
            case 2:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.b(1.0f - xj3.g((h0e) obj3));
                g0cVar.E(((qz9) ((n69) obj2)).j());
                g0cVar.G(f2);
                return wefVar;
            case 3:
                jmb jmbVar = (jmb) obj3;
                d18 d18Var = (d18) obj2;
                uz uzVar = (uz) obj;
                if (f2 > 0.0f) {
                    fFloatValue = ((Number) uzVar.e.getValue()).floatValue();
                    if (fFloatValue > f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                } else if (f2 < 0.0f) {
                    fFloatValue = ((Number) uzVar.e.getValue()).floatValue();
                    if (fFloatValue < f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                }
                float f3 = f - jmbVar.element;
                if (f3 != d18Var.a(f3) || f != ((Number) uzVar.e.getValue()).floatValue()) {
                    uzVar.a();
                }
                jmbVar.element += f3;
                return wefVar;
            case 4:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                float fFloatValue2 = ((Number) ((h0e) obj2).getValue()).floatValue();
                float fA = ((r8b) obj3).a();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & sn4Var.f()));
                float f4 = fIntBitsToFloat2 / 2.0f;
                Path path = new Path();
                path.moveTo(f4, 0.0f);
                path.lineTo(fIntBitsToFloat - f4, 0.0f);
                path.arcTo(new RectF(fIntBitsToFloat - fIntBitsToFloat2, 0.0f, fIntBitsToFloat, fIntBitsToFloat2), -90.0f, 180.0f, false);
                path.lineTo(f4, fIntBitsToFloat2);
                path.arcTo(new RectF(0.0f, 0.0f, fIntBitsToFloat2, fIntBitsToFloat2), 90.0f, 180.0f, false);
                path.close();
                PathMeasure pathMeasure = new PathMeasure(path, false);
                float length = pathMeasure.getLength();
                q8b.e(sn4Var, pathMeasure, length, fFloatValue2 - 0.013636365f, fFloatValue2, sn4Var.p0(5.0f) * fA, f2 * 0.35f, sn4Var.p0(2.0f));
                while (i2 < 22) {
                    float f5 = i2;
                    float f6 = f5 / 21.0f;
                    i2++;
                    q8b.e(sn4Var, pathMeasure, length, fFloatValue2 - ((i2 / 22.0f) * 0.3f), fFloatValue2 - ((f5 / 22.0f) * 0.3f), sn4Var.p0(2.0f - (1.8f * f6)) * fA, ((float) Math.pow(1.0f - f6, 1.600000023841858d)) * 0.95f * f2, 0.0f);
                }
                return wefVar;
            case 5:
                h0e h0eVar = (h0e) obj2;
                h81 h81Var2 = (h81) obj;
                h81Var2.getClass();
                return h81Var2.b(new tc2(h81Var2.getDensity() * f2, new b68((List) obj3, null, (((long) Float.floatToRawIntBits(((Number) h0eVar.getValue()).floatValue())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (h81Var2.a.f() >> 32)) / 1.5f) + ((Number) h0eVar.getValue()).floatValue())) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (h81Var2.a.f() & 4294967295L)))) & 4294967295L)), 5));
            case 6:
                cea ceaVar = (cea) obj3;
                bea beaVar = (bea) obj;
                jx jxVar = ((zwe) obj2).H0;
                beaVar.k(ceaVar, jxVar != null ? (int) ((Number) jxVar.e()).floatValue() : (int) f2, 0, 0.0f);
                return wefVar;
            case 7:
                e89 e89Var = (e89) obj2;
                ((ra4) obj).getClass();
                Object systemService = ((Context) obj3).getSystemService("sensor");
                Sensor sensor = null;
                SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(15);
                    if (defaultSensor == null) {
                        defaultSensor = sensorManager.getDefaultSensor(11);
                    }
                    sensor = defaultSensor;
                }
                Sensor sensor2 = sensor;
                if (sensorManager == null || sensor2 == null) {
                    e89Var.setValue(fxe.c);
                    return new ou(7);
                }
                exe exeVar = new exe(new imb(), new float[9], new float[9], new float[3], new jmb(), this.b, new jmb(), e89Var);
                sensorManager.registerListener(exeVar, sensor2, 1);
                return new z6(sensorManager, exeVar, e89Var, 8);
            default:
                lgf lgfVar = (lgf) obj3;
                a26 a26Var = (a26) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j = lgfVar.b;
                if (j == Long.MIN_VALUE) {
                    lgfVar.b = jLongValue;
                    j = jLongValue;
                }
                float f7 = lgfVar.e;
                xz xzVar = new xz(f7);
                xz xzVar2 = lgf.f;
                long jC = f2 == 0.0f ? lgfVar.a.c(new xz(f7), xzVar2, lgfVar.c) : ym8.M((jLongValue - j) / f2);
                float f8 = ((xz) lgfVar.a.t(jC, xzVar, xzVar2, lgfVar.c)).a;
                lgfVar.c = (xz) lgfVar.a.i(jC, xzVar, xzVar2, lgfVar.c);
                lgfVar.b = jLongValue;
                float f9 = lgfVar.e - f8;
                lgfVar.e = f8;
                a26Var.d(Float.valueOf(f9));
                return wefVar;
        }
    }

    public /* synthetic */ er(Object obj, float f, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }

    public /* synthetic */ er(Object obj, Object obj2, float f, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = f;
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ho6 implements a26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ho6(float f, float f2, long j, ibb ibbVar) {
        this.b = f;
        this.d = j;
        this.e = ibbVar;
        this.c = f2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.e;
        float f = this.b;
        switch (i) {
            case 0:
                long j = this.d;
                ibb ibbVar = (ibb) obj2;
                float f2 = this.c;
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                ta0 ta0VarV0 = sn4Var.v0();
                long jZ = ta0VarV0.z();
                ta0VarV0.p().g();
                try {
                    ((vd9) ta0VarV0.c).G(f, 1.0f, j);
                    sn4.I(sn4Var, ibbVar, f2, j, 120);
                    return wefVar;
                } finally {
                    ks0.t(ta0VarV0, jZ);
                }
            default:
                vtb vtbVar = (vtb) obj2;
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                Paint paint = urg.h().a;
                paint.setAntiAlias(true);
                paint.setColor(0);
                paint.setShadowLayer(sn4Var2.p0(f), sn4Var2.p0(0.0f), sn4Var2.p0(this.c), abg.Z(this.d));
                vl1 vl1VarP = sn4Var2.v0().p();
                if (vtbVar instanceof s4d) {
                    Canvas canvasB = mp.b(vl1VarP);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var2.f() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var2.f() & 4294967295L));
                    float f3 = ((s4d) vtbVar).a;
                    canvasB.drawRoundRect(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, sn4Var2.p0(f3), sn4Var2.p0(f3), paint);
                    return wefVar;
                }
                if (!(vtbVar instanceof r4d)) {
                    ap.c();
                    return null;
                }
                mp.b(vl1VarP).drawCircle(Float.intBitsToFloat((int) (sn4Var2.f() >> 32)) / 2.0f, Float.intBitsToFloat((int) (sn4Var2.f() & 4294967295L)) / 2.0f, Float.intBitsToFloat((int) (sn4Var2.f() >> 32)) / 2.0f, paint);
                return wefVar;
        }
    }

    public /* synthetic */ ho6(float f, float f2, long j, vtb vtbVar) {
        this.b = f;
        this.c = f2;
        this.d = j;
        this.e = vtbVar;
    }
}

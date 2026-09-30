package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vj implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vj(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        c18 c18Var;
        int i = this.a;
        Object obj2 = null;
        int i2 = 0;
        float f = 0.0f;
        long j = 4294967295L;
        wef wefVar = wef.a;
        int i3 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                yj yjVar = (yj) obj3;
                Exception exc = (Exception) obj;
                exc.getClass();
                yjVar.a();
                tec.t(hf8.Q, "AlphaPackedVideo", "Unable to play alpha-packed video", exc);
                yjVar.d.post(new wj(yjVar, i3, 1));
                return wefVar;
            case 1:
                bea beaVar = (bea) obj;
                beaVar.getClass();
                int i4 = 0;
                for (cea ceaVar : (ArrayList) obj3) {
                    beaVar.k(ceaVar, i4, 0, 0.0f);
                    i4 += ceaVar.a + i3;
                }
                return wefVar;
            case 2:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                hzc hzcVar = ((cs3) obj3).d;
                float fP = abg.P(1.0f, 0.8f, mh3.n(Math.abs(((qz9) hzcVar.d).j() + (((sz9) hzcVar.c).j() - i3)), 0.0f, 1.0f));
                g0cVar.q(fP);
                g0cVar.r(fP);
                return wefVar;
            case 3:
                boolean zS1 = ((oo5) obj).s1(i3);
                ((mmb) obj3).element = Boolean.valueOf(zS1);
                return Boolean.valueOf(zS1);
            case 4:
                c08 c08Var = (c08) obj;
                or3 or3Var = ((jx7) obj3).a;
                ird irdVarJ = iqf.j();
                iqf.p(irdVarJ, iqf.l(irdVarJ), irdVarJ != null ? irdVarJ.e() : null);
                or3Var.getClass();
                int i5 = c08Var.a;
                if (i5 == -1) {
                    i5 = 2;
                }
                while (i2 < i5) {
                    c08Var.a(i3 + i2);
                    i2++;
                }
                return wefVar;
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                bitmap.getClass();
                ((g6d) obj3).c(Integer.valueOf(i3), bitmap);
                return wefVar;
            case 6:
                sw3 sw3Var = (sw3) obj3;
                ((sw3) obj).getClass();
                return new w67((((long) (sw3Var.D0(8.0f) + i3)) << 32) | (((long) sw3Var.D0(2.0f)) & 4294967295L));
            case 7:
                osd osdVar = (osd) obj3;
                if (!((Boolean) obj).booleanValue()) {
                    osdVar.add(Integer.valueOf(i3));
                }
                return wefVar;
            case 8:
                y8d y8dVar = (y8d) obj3;
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                sn4.V0(sn4Var, y8dVar.a, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L), 1.0f, 0, null, 496);
                int i6 = i3 + 1;
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (sn4Var.f() >> 32)) - i6) / i3;
                while (i2 < i6) {
                    float f2 = ((fIntBitsToFloat + 1.0f) * i2) + 0.5f;
                    long j2 = j;
                    sn4.V0(sn4Var, y8dVar.a, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & j2), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() & j2)))) & j2), 1.0f, 0, null, 496);
                    i2++;
                    j = j2;
                    f = 0.0f;
                }
                return wefVar;
            case 9:
                return Boolean.valueOf(((List) obj).addAll(i3, (Collection) obj3));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                d83 d83Var = (d83) obj3;
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                if (d83Var == d83.c) {
                    l1fVar.a("tomorrow_fortune_reminder_guide", "popup");
                } else {
                    l1fVar.a("open_notification", "popup");
                    l1fVar.a("open_notification", "pathway");
                    l1fVar.a(Integer.valueOf(i3), "touchpoint_id");
                }
                return wefVar;
            default:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                b18 b18VarH = ((j18) obj3).h();
                float fI = (((int) (b18VarH.i() & 4294967295L)) / 2.0f) + b18VarH.m;
                for (Object obj4 : b18VarH.l) {
                    if (((c18) obj4).a == i3) {
                        obj2 = obj4;
                        c18Var = (c18) obj2;
                        if (c18Var != null) {
                            float f3 = c18Var.p;
                            float fAbs = Math.abs(((f3 / 2.0f) + c18Var.o) - fI) / f3;
                            float fN = mh3.n(1.0f - (0.18f * fAbs), 0.55f, 1.0f);
                            g0cVar2.q(fN);
                            g0cVar2.r(fN);
                            g0cVar2.b(mh3.n(1.0f - (fAbs * 0.25f), 0.25f, 1.0f));
                        }
                        return wefVar;
                    }
                }
                c18Var = (c18) obj2;
                if (c18Var != null) {
                    float f4 = c18Var.p;
                    float fAbs2 = Math.abs(((f4 / 2.0f) + c18Var.o) - fI) / f4;
                    float fN2 = mh3.n(1.0f - (0.18f * fAbs2), 0.55f, 1.0f);
                    g0cVar2.q(fN2);
                    g0cVar2.r(fN2);
                    g0cVar2.b(mh3.n(1.0f - (fAbs2 * 0.25f), 0.25f, 1.0f));
                }
                return wefVar;
        }
    }

    public /* synthetic */ vj(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}

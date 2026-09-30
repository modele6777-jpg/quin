package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uc2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ uc2(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        float f = this.b;
        switch (i) {
            case 0:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.q(f);
                g0cVar.r(f);
                g0cVar.D(sfc.d(0.5f, 0.0f));
                return wefVar;
            case 1:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                g0cVar2.q(f);
                g0cVar2.r(f);
                return wefVar;
            case 2:
                g0c g0cVar3 = (g0c) obj;
                g0cVar3.getClass();
                g0cVar3.G(-f);
                return wefVar;
            case 3:
                g0c g0cVar4 = (g0c) obj;
                g0cVar4.getClass();
                g0cVar4.p(f);
                g0cVar4.D(sfc.d(0.5f, 0.5f));
                return wefVar;
            case 4:
                g0c g0cVar5 = (g0c) obj;
                g0cVar5.getClass();
                g0cVar5.b(f);
                return wefVar;
            case 5:
                h81 h81Var = (h81) obj;
                h81Var.getClass();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (h81Var.a.f() >> 32)) * 0.5014f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (h81Var.a.f() & 4294967295L)))) & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (h81Var.a.f() & 4294967295L));
                float f2 = fIntBitsToFloat < 1.0f ? 1.0f : fIntBitsToFloat;
                return h81Var.a(new ho6((Float.intBitsToFloat((int) (h81Var.a.f() >> 32)) * 1.2168f) / f2, f2, jFloatToRawIntBits, gec.M(new iy9[]{new iy9(Float.valueOf(0.0f), new y72(y72.b(abg.c(452984831), mh3.n(f, 0.0f, 1.0f) * y72.c(abg.c(452984831))))), new iy9(Float.valueOf(0.5f), new y72(y72.j))}, jFloatToRawIntBits, f2)));
            case 6:
                g0c g0cVar6 = (g0c) obj;
                g0cVar6.getClass();
                g0cVar6.b(f);
                return wefVar;
            case 7:
                g0c g0cVar7 = (g0c) obj;
                g0cVar7.getClass();
                g0cVar7.b(f);
                return wefVar;
            case 8:
                g0c g0cVar8 = (g0c) obj;
                g0cVar8.getClass();
                g0cVar8.b(f * 0.06f);
                g0cVar8.d(12);
                g0cVar8.j(1);
                return wefVar;
            case 9:
                xh6 xh6Var = (xh6) obj;
                xh6Var.getClass();
                b68 b68VarN = gec.N(f, 10, t72.I(new y72(y72.j), new y72(y72.b)));
                if (!b68VarN.equals(xh6Var.T0)) {
                    xh6Var.F0 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    xh6Var.T0 = b68VarN;
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                float fP0 = sn4Var.p0(q8b.h);
                float fP1 = sn4Var.p0(f);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L);
                float f3 = fP1 / 2.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)) + f3;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits2)) + f3;
                zt ztVarA = cu.a();
                float f4 = fIntBitsToFloat3 - f3;
                ztVarA.h(fIntBitsToFloat2, f4);
                float f5 = 0.14f * f3;
                float f6 = fIntBitsToFloat2 + f5;
                float f7 = fIntBitsToFloat3 - f5;
                ztVarA.j(f6, f7, fIntBitsToFloat2 + f3, fIntBitsToFloat3);
                float f8 = fIntBitsToFloat3 + f5;
                ztVarA.j(f6, f8, fIntBitsToFloat2, fIntBitsToFloat3 + f3);
                float f9 = fIntBitsToFloat2 - f5;
                ztVarA.j(f9, f8, fIntBitsToFloat2 - f3, fIntBitsToFloat3);
                ztVarA.j(f9, f7, fIntBitsToFloat2, f4);
                ztVarA.e();
                vl1 vl1VarP = sn4Var.v0().p();
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.FILL);
                long j = y72.e;
                paint.setColor(abg.Z(y72.b(j, 0.8f)));
                paint.setMaskFilter(new BlurMaskFilter(fP0, BlurMaskFilter.Blur.NORMAL));
                mp.b(vl1VarP).drawPath(ztVarA.a, paint);
                sn4.R(sn4Var, ztVarA, y72.b(j, 0.34f), null, 60);
                sn4.R(sn4Var, ztVarA, j, null, 60);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                g0c g0cVar9 = (g0c) obj;
                g0cVar9.getClass();
                g0cVar9.E(f);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                g0c g0cVar10 = (g0c) obj;
                g0cVar10.getClass();
                g0cVar10.q(f);
                g0cVar10.r(f);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                g0c g0cVar11 = (g0c) obj;
                g0cVar11.getClass();
                g0cVar11.b(f);
                return wefVar;
            case 14:
                g0c g0cVar12 = (g0c) obj;
                g0cVar12.getClass();
                g0cVar12.b(f);
                return wefVar;
            case 15:
                g0c g0cVar13 = (g0c) obj;
                g0cVar13.getClass();
                g0cVar13.b(f);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                g0c g0cVar14 = (g0c) obj;
                g0cVar14.getClass();
                g0cVar14.b(f);
                return wefVar;
            case 17:
                g0c g0cVar15 = (g0c) obj;
                g0cVar15.getClass();
                g0cVar15.b(f);
                return wefVar;
            default:
                g0c g0cVar16 = (g0c) obj;
                g0cVar16.getClass();
                g0cVar16.b(f);
                return wefVar;
        }
    }
}

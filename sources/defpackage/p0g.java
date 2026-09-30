package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0g implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p0g(a26 a26Var, z67 z67Var) {
        this.a = 1;
        this.b = a26Var;
        this.c = z67Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        long j;
        ta0 ta0Var;
        long j2;
        int i = this.a;
        int i2 = 25;
        int i3 = 1;
        wef wefVar = wef.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((imb) obj3).element = true;
                ((a26) obj2).d((ya0) obj);
                return wefVar;
            case 1:
                ((a26) obj2).d(Integer.valueOf(mh3.p(ym8.L(((Float) obj).floatValue()), (z67) obj3)));
                return Boolean.TRUE;
            case 2:
                cv6 cv6Var = (cv6) obj3;
                h0e h0eVar = (h0e) obj2;
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                float f = 1.0f;
                if (cv6Var != null) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
                    float f2 = (140.0f * fIntBitsToFloat) / 338.0f;
                    float f3 = f2 * 1.75f;
                    float fSqrt = (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2 / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / 2.0f)) << 32);
                    ta0 ta0VarV0 = sn4Var.v0();
                    long jZ = ta0VarV0.z();
                    ta0VarV0.p().g();
                    try {
                        ((vd9) ta0VarV0.c).F(jFloatToRawIntBits, 15.0f);
                        float f4 = ((fIntBitsToFloat - fSqrt) / 2.0f) - f2;
                        float f5 = ((fIntBitsToFloat + fSqrt) / 2.0f) + f2;
                        float f6 = ((fIntBitsToFloat2 - fSqrt) / 2.0f) - f3;
                        float f7 = ((fIntBitsToFloat2 + fSqrt) / 2.0f) + f3;
                        long jL = (((long) ym8.L(f2)) << 32) | (((long) ym8.L(f3)) & 4294967295L);
                        long width = (((long) ((ks) cv6Var).a.getWidth()) << 32) | (((long) ((ks) cv6Var).a.getHeight()) & 4294967295L);
                        int i4 = 0;
                        while (f4 < f5) {
                            float f8 = (((i4 * 0.6666667f) % f) * f3) + f6;
                            while (f8 < f7) {
                                try {
                                    float f9 = f4;
                                    j2 = jZ;
                                    int i5 = i4;
                                    ta0Var = ta0VarV0;
                                    try {
                                        sn4.g0(sn4Var, cv6Var, 0L, width, (((long) ym8.L(f4)) << 32) | (((long) ym8.L(f8)) & 4294967295L), jL, 0.0f, null, 0, 992);
                                        f8 += f3;
                                        ta0VarV0 = ta0Var;
                                        i4 = i5;
                                        f4 = f9;
                                        jZ = j2;
                                    } catch (Throwable th) {
                                        th = th;
                                        j = j2;
                                        ks0.t(ta0Var, j);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    j2 = jZ;
                                    ta0Var = ta0VarV0;
                                }
                            }
                            f4 += f2;
                            i4++;
                            f = 1.0f;
                        }
                        ks0.t(ta0VarV0, jZ);
                    } catch (Throwable th3) {
                        th = th3;
                        j = jZ;
                        ta0Var = ta0VarV0;
                    }
                }
                long j3 = ((y72) h0eVar.getValue()).a;
                int i6 = 25;
                iy9[] iy9VarArr = new iy9[25];
                int i7 = 0;
                while (i7 < i6) {
                    float f10 = i7 / 24.0f;
                    iy9VarArr[i7] = new iy9(Float.valueOf(h4g.n(f10, 0.61f, 0.13f)), new y72(y72.b(j3, 1.0f - (h4g.n(f10, 0.0f, 1.0f) * 0.7f))));
                    i7++;
                    i6 = 25;
                }
                sn4.O0(sn4Var, gec.E((iy9[]) Arrays.copyOf(iy9VarArr, i6)), 0L, 0L, 0.0f, null, null, 0, 126);
                return wefVar;
            case 3:
                u4g u4gVar = (u4g) obj2;
                l1f l1fVar = (l1f) obj;
                l1fVar.a("widget_onboarding", "popup");
                l1fVar.a((String) obj3, "widget");
                l1fVar.a(1, "layer");
                if (u4gVar instanceof t4g) {
                    qhe qheVar = ((t4g) u4gVar).a;
                    l1fVar.a(qheVar.a, "card_id");
                    l1fVar.a(qheVar.b == 0 ? "reversed" : "upright", "card_orientation");
                    return wefVar;
                }
                if (u4gVar instanceof s4g) {
                    l1fVar.a(((s4g) u4gVar).b, "scenario");
                    return wefVar;
                }
                ap.c();
                return null;
            case 4:
                m8g m8gVar = (m8g) obj3;
                View view = (View) obj2;
                m8gVar.a(view);
                return new ozc(14, m8gVar, view);
            case 5:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                ((dbg) obj3).b.Q(q8cVar, (cbg) obj2);
                return wefVar;
            case 6:
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                ((fbg) obj3).b.Q(q8cVar2, (ebg) obj2);
                return wefVar;
            case 7:
                vag vagVar = (vag) obj3;
                String str = (String) obj2;
                q8c q8cVar3 = (q8c) obj;
                q8cVar3.getClass();
                x8c x8cVarW0 = q8cVar3.W0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    x8cVarW0.m(1, gcc.D(vagVar));
                    x8cVarW0.Q(2, str);
                    x8cVarW0.R0();
                    return Integer.valueOf(r8c.h(q8cVar3));
                } finally {
                    x8cVarW0.close();
                }
            case 8:
                bb3 bb3Var = (bb3) obj3;
                String str2 = (String) obj2;
                q8c q8cVar4 = (q8c) obj;
                q8cVar4.getClass();
                x8c x8cVarW1 = q8cVar4.W0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    bb3 bb3Var2 = bb3.b;
                    x8cVarW1.n(bm8.S(bb3Var), 1);
                    x8cVarW1.Q(2, str2);
                    x8cVarW1.R0();
                    return wefVar;
                } finally {
                    x8cVarW1.close();
                }
            case 9:
                q8c q8cVar5 = (q8c) obj;
                q8cVar5.getClass();
                ((nbg) obj3).b.Q(q8cVar5, (lbg) obj2);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                q8c q8cVar6 = (q8c) obj;
                q8cVar6.getClass();
                ((pbg) obj3).b.Q(q8cVar6, (obg) obj2);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                kcg kcgVar = (kcg) obj3;
                dd2 dd2Var = (dd2) obj2;
                qf2 qf2Var = (qf2) obj;
                if (!kcgVar.c) {
                    x48 x48VarD = qf2Var.d();
                    View view2 = qf2Var.a;
                    h48 h48VarK = x48VarD.k();
                    kcgVar.e = dd2Var;
                    if (kcgVar.d == null) {
                        if (pa7.t(Looper.myLooper(), view2.getHandler().getLooper())) {
                            kcgVar.d = h48VarK;
                            h48VarK.a(kcgVar);
                        } else {
                            view2.post(new nzf(i3, kcgVar, h48VarK));
                        }
                    } else if (((a58) h48VarK).i.compareTo(g48.c) >= 0) {
                        kcgVar.b.B(new dd2(new o7b(kcgVar, qf2Var, dd2Var, i2), true, -1723985096));
                    }
                }
                return wefVar;
            default:
                ((bea) obj).g((cea) obj3, 0, 0, ((qdg) obj2).Z);
                return wefVar;
        }
    }

    public /* synthetic */ p0g(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}

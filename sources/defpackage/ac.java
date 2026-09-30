package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ac implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ ac(long j, n6b n6bVar) {
        this.a = 14;
        this.b = j;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        pl1 pl1Var;
        Object dzbVar;
        x6b x6bVar;
        int i = this.a;
        int i2 = 2;
        long j = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                sn4.V0(sn4Var, this.b, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), sn4Var.p0(1.0f), 0, rxg.w(new float[]{sn4Var.p0(2.5f), sn4Var.p0(2.5f)}), 464);
                return wefVar;
            case 1:
                h81 h81Var = (h81) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (h81Var.a.f() >> 32)) / 2.0f;
                return h81Var.b(new er(fIntBitsToFloat, i7h.q(h81Var, fIntBitsToFloat), new xz0(j, 5), 0));
            case 2:
                z31 z31Var = (z31) obj;
                a26 a26Var = z31Var.b;
                if (a26Var != null && (pl1Var = z31Var.a) != null) {
                    try {
                        dzbVar = a26Var.d(Long.valueOf(j));
                    } catch (Throwable th) {
                        dzbVar = new dzb(th);
                    }
                    pl1Var.g(dzbVar);
                    break;
                }
                return wefVar;
            case 3:
                ((hxc) obj).c(svc.a, new rvc(sg6.a, this.b, qvc.b, true));
                return wefVar;
            case 4:
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var2.f() >> 32)) / 2.0f;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (sn4Var2.f() & 4294967295L)) / 2.0f;
                if (fIntBitsToFloat2 > 0.0f && fIntBitsToFloat3 > 0.0f) {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                    float f = fIntBitsToFloat3 / fIntBitsToFloat2;
                    ta0 ta0VarV0 = sn4Var2.v0();
                    long jZ = ta0VarV0.z();
                    ta0VarV0.p().g();
                    try {
                        ((vd9) ta0VarV0.c).G(1.0f, f, jFloatToRawIntBits);
                        sn4.I(sn4Var2, gec.M(new iy9[]{new iy9(Float.valueOf(0.0f), new y72(y72.b(j, 0.32f))), new iy9(Float.valueOf(0.3f), new y72(y72.b(j, 0.23040001f))), new iy9(Float.valueOf(0.52f), new y72(y72.b(j, 0.1344f))), new iy9(Float.valueOf(0.72f), new y72(y72.b(j, 0.057600003f))), new iy9(Float.valueOf(0.87f), new y72(y72.b(j, 0.019199999f))), new iy9(Float.valueOf(1.0f), new y72(y72.b(j, 0.0f)))}, jFloatToRawIntBits, fIntBitsToFloat2), fIntBitsToFloat2, jFloatToRawIntBits, 120);
                    } finally {
                        ks0.t(ta0VarV0, jZ);
                    }
                }
                return wefVar;
            case 5:
                im2 im2Var = (im2) obj;
                im2Var.getClass();
                sn4.w0(im2Var, this.b, 0.0f, 0L, null, 126);
                long j2 = y72.b;
                vv7 vv7Var = (vv7) im2Var;
                xl1 xl1Var = vv7Var.a;
                sn4.V0(im2Var, j2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xl1Var.f() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xl1Var.f() >> 32)) * 0.25f)) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xl1Var.f() >> 32)) * 0.75f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xl1Var.f() & 4294967295L)) / 2.0f)) & 4294967295L), vv7Var.p0(2.0f), 1, null, 224);
                return wefVar;
            case 6:
                return Long.valueOf(j);
            case 7:
                tn8 tn8Var = (tn8) obj;
                tn8Var.getClass();
                return tn8Var.v(j);
            case 8:
                tn8 tn8Var2 = (tn8) obj;
                tn8Var2.getClass();
                return tn8Var2.v(j);
            case 9:
                sn4 sn4Var3 = (sn4) obj;
                sn4Var3.getClass();
                float fP0 = sn4Var3.p0(4.0f);
                float f2 = 0.0f;
                while (f2 < Float.intBitsToFloat((int) (sn4Var3.f() >> 32))) {
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    float f3 = f2 + fP0;
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (sn4Var3.f() >> 32));
                    if (f3 > fIntBitsToFloat4) {
                        f3 = fIntBitsToFloat4;
                    }
                    sn4 sn4Var4 = sn4Var3;
                    sn4.V0(sn4Var4, this.b, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), sn4Var3.p0(1.0f), 0, null, 496);
                    f2 += fP0 * 2.0f;
                    sn4Var3 = sn4Var4;
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((p79) obj).e(lj6.b, Long.valueOf(j));
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                h81 h81Var2 = (h81) obj;
                h81Var2.getClass();
                return h81Var2.b(new db4(h81Var2.getDensity() * 0.5f, i2, j));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                xh6 xh6Var = (xh6) obj;
                xh6Var.getClass();
                long jB = y72.b(j, 1.0f);
                if (!faf.a(jB, xh6Var.U0)) {
                    xh6Var.F0 |= 256;
                    xh6Var.U0 = jB;
                }
                if (true != xh6Var.H0) {
                    xh6Var.H0 = true;
                    xh6Var.F0 |= 1;
                }
                xh6Var.G0 = true;
                if (!yi4.b(24.0f, xh6Var.R0)) {
                    xh6Var.F0 |= 32;
                    xh6Var.R0 = 24.0f;
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("DELETE FROM quick_decision WHERE id = ?");
                try {
                    x8cVarW0.m(1, j);
                    x8cVarW0.R0();
                    return wefVar;
                } finally {
                    x8cVarW0.close();
                }
            case 14:
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                x8c x8cVarW1 = q8cVar2.W0("SELECT * FROM quick_decision WHERE id = ?");
                try {
                    x8cVarW1.m(1, j);
                    int iK = y8c.k(x8cVarW1, "id");
                    int iK2 = y8c.k(x8cVarW1, "cardKey");
                    int iK3 = y8c.k(x8cVarW1, "isReversed");
                    int iK4 = y8c.k(x8cVarW1, "answer");
                    int iK5 = y8c.k(x8cVarW1, "tagline");
                    int iK6 = y8c.k(x8cVarW1, "reading");
                    int iK7 = y8c.k(x8cVarW1, "drawnAt");
                    int iK8 = y8c.k(x8cVarW1, "chatId");
                    int iK9 = y8c.k(x8cVarW1, "syncedAt");
                    int iK10 = y8c.k(x8cVarW1, "accountId");
                    if (x8cVarW1.R0()) {
                        long j3 = x8cVarW1.getLong(iK);
                        String strT0 = x8cVarW1.t0(iK2);
                        boolean z = ((int) x8cVarW1.getLong(iK3)) != 0;
                        String strT1 = x8cVarW1.t0(iK4);
                        String strT2 = x8cVarW1.t0(iK5);
                        String strT3 = x8cVarW1.t0(iK6);
                        Instant instantI = yx4.i(x8cVarW1.isNull(iK7) ? null : x8cVarW1.t0(iK7));
                        if (instantI == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        x6bVar = new x6b(j3, strT0, z, strT1, strT2, strT3, instantI, x8cVarW1.t0(iK8), yx4.i(x8cVarW1.isNull(iK9) ? null : x8cVarW1.t0(iK9)), x8cVarW1.t0(iK10));
                    } else {
                        x6bVar = null;
                    }
                    x8cVarW1.close();
                    return x6bVar;
                } catch (Throwable th2) {
                    x8cVarW1.close();
                    throw th2;
                }
            case 15:
                sn4 sn4Var5 = (sn4) obj;
                sn4Var5.getClass();
                float fP1 = sn4Var5.p0(104.0f);
                float fP2 = sn4Var5.p0(110.0f);
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (sn4Var5.f() >> 32)) / 2.0f;
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (sn4Var5.f() & 4294967295L)) / 2.0f;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6 - fP2)) & 4294967295L);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fP2 + fIntBitsToFloat6)) & 4294967295L);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fIntBitsToFloat5 - fP1)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L);
                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(fIntBitsToFloat5 + fP1)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L);
                float fP3 = sn4Var5.p0(1.0f);
                long j4 = this.b;
                sn4.V0(sn4Var5, j4, jFloatToRawIntBits3, jFloatToRawIntBits5, fP3, 0, null, 496);
                sn4.V0(sn4Var5, j4, jFloatToRawIntBits3, jFloatToRawIntBits6, fP3, 0, null, 496);
                sn4.V0(sn4Var5, j4, jFloatToRawIntBits4, jFloatToRawIntBits5, fP3, 0, null, 496);
                sn4.V0(sn4Var5, j4, jFloatToRawIntBits4, jFloatToRawIntBits6, fP3, 0, null, 496);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                sn4 sn4Var6 = (sn4) obj;
                sn4Var6.getClass();
                float fP4 = sn4Var6.p0(onc.k);
                float f4 = fP4 / 2.0f;
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var6.f() & 4294967295L)) - fP4)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var6.f() >> 32)) - fP4)) << 32);
                float fP5 = sn4Var6.p0(onc.h);
                sn4.K0(sn4Var6, this.b, jFloatToRawIntBits7, jFloatToRawIntBits8, (((long) Float.floatToRawIntBits(fP5)) << 32) | (((long) Float.floatToRawIntBits(fP5)) & 4294967295L), new d5e(fP4, 0.0f, 0, 0, rxg.w(new float[]{sn4Var6.p0(onc.l), sn4Var6.p0(onc.m)}), 14), 224);
                return wefVar;
            case 17:
                im2 im2Var2 = (im2) obj;
                im2Var2.getClass();
                sn4.w0(im2Var2, this.b, 0.0f, 0L, null, 126);
                long j5 = y72.b;
                vv7 vv7Var2 = (vv7) im2Var2;
                xl1 xl1Var2 = vv7Var2.a;
                sn4.V0(im2Var2, j5, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xl1Var2.f() >> 32)) * 0.25f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xl1Var2.f() & 4294967295L)) / 2.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xl1Var2.f() >> 32)) * 0.75f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xl1Var2.f() & 4294967295L)) / 2.0f)) & 4294967295L), vv7Var2.p0(2.0f), 1, null, 224);
                return wefVar;
            case 18:
                a01 a01Var = (a01) obj;
                a01Var.getClass();
                if (j == 16) {
                    j = y72.b;
                }
                long j6 = a01Var.K0;
                int i3 = y72.l;
                if (!faf.a(j6, j)) {
                    a01Var.K0 = j;
                    a01Var.l1();
                }
                float density = a01Var.getDensity() * 16.0f;
                if (a01Var.J0 != density) {
                    a01Var.J0 = density;
                    a01Var.l1();
                }
                return wefVar;
            case 19:
                sn4 sn4Var7 = (sn4) obj;
                sn4Var7.getClass();
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (sn4Var7.f() & 4294967295L)) / 2.0f;
                sn4.V0(sn4Var7, this.b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat7)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var7.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat7)) & 4294967295L), sn4Var7.p0(1.0f), 0, rxg.w(new float[]{sn4Var7.p0(2.0f), sn4Var7.p0(2.0f)}), 464);
                return wefVar;
            case 20:
                sn4 sn4Var8 = (sn4) obj;
                sn4Var8.getClass();
                zt ztVarA = cu.a();
                ztVarA.h(0.0f, 0.0f);
                ztVarA.g(Float.intBitsToFloat((int) (sn4Var8.f() >> 32)), Float.intBitsToFloat((int) (sn4Var8.f() & 4294967295L)) / 2.0f);
                ztVarA.g(0.0f, Float.intBitsToFloat((int) (sn4Var8.f() & 4294967295L)));
                ztVarA.e();
                sn4.R(sn4Var8, ztVarA, this.b, null, 60);
                return wefVar;
            default:
                q8c q8cVar3 = (q8c) obj;
                q8cVar3.getClass();
                x8c x8cVarW2 = q8cVar3.W0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    x8cVarW2.m(1, j);
                    int iK11 = y8c.k(x8cVarW2, "id");
                    int iK12 = y8c.k(x8cVarW2, "state");
                    int iK13 = y8c.k(x8cVarW2, "worker_class_name");
                    int iK14 = y8c.k(x8cVarW2, "input_merger_class_name");
                    int iK15 = y8c.k(x8cVarW2, "input");
                    int iK16 = y8c.k(x8cVarW2, "output");
                    int iK17 = y8c.k(x8cVarW2, "initial_delay");
                    int iK18 = y8c.k(x8cVarW2, "interval_duration");
                    int iK19 = y8c.k(x8cVarW2, "flex_duration");
                    int iK20 = y8c.k(x8cVarW2, "run_attempt_count");
                    int iK21 = y8c.k(x8cVarW2, "backoff_policy");
                    int iK22 = y8c.k(x8cVarW2, "backoff_delay_duration");
                    int iK23 = y8c.k(x8cVarW2, "last_enqueue_time");
                    int iK24 = y8c.k(x8cVarW2, "minimum_retention_duration");
                    int iK25 = y8c.k(x8cVarW2, "schedule_requested_at");
                    int iK26 = y8c.k(x8cVarW2, "run_in_foreground");
                    int iK27 = y8c.k(x8cVarW2, "out_of_quota_policy");
                    int iK28 = y8c.k(x8cVarW2, "period_count");
                    int iK29 = y8c.k(x8cVarW2, "generation");
                    int iK30 = y8c.k(x8cVarW2, "next_schedule_time_override");
                    int iK31 = y8c.k(x8cVarW2, "next_schedule_time_override_generation");
                    int iK32 = y8c.k(x8cVarW2, "stop_reason");
                    int iK33 = y8c.k(x8cVarW2, "trace_tag");
                    int iK34 = y8c.k(x8cVarW2, "backoff_on_system_interruptions");
                    int iK35 = y8c.k(x8cVarW2, "required_network_type");
                    int iK36 = y8c.k(x8cVarW2, "required_network_request");
                    int iK37 = y8c.k(x8cVarW2, "requires_charging");
                    int iK38 = y8c.k(x8cVarW2, "requires_device_idle");
                    int iK39 = y8c.k(x8cVarW2, "requires_battery_not_low");
                    int iK40 = y8c.k(x8cVarW2, "requires_storage_not_low");
                    int iK41 = y8c.k(x8cVarW2, "trigger_content_update_delay");
                    int iK42 = y8c.k(x8cVarW2, "trigger_max_content_delay");
                    int iK43 = y8c.k(x8cVarW2, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (x8cVarW2.R0()) {
                        String strT4 = x8cVarW2.t0(iK11);
                        int i4 = iK24;
                        ArrayList arrayList2 = arrayList;
                        vag vagVarU = gcc.u((int) x8cVarW2.getLong(iK12));
                        String strT5 = x8cVarW2.t0(iK13);
                        String strT6 = x8cVarW2.t0(iK14);
                        byte[] blob = x8cVarW2.getBlob(iK15);
                        bb3 bb3Var = bb3.b;
                        bb3 bb3VarW = bm8.w(blob);
                        bb3 bb3VarW2 = bm8.w(x8cVarW2.getBlob(iK16));
                        long j7 = x8cVarW2.getLong(iK17);
                        long j8 = x8cVarW2.getLong(iK18);
                        long j9 = x8cVarW2.getLong(iK19);
                        int i5 = (int) x8cVarW2.getLong(iK20);
                        int i6 = iK12;
                        int i7 = iK13;
                        us0 us0VarR = gcc.r((int) x8cVarW2.getLong(iK21));
                        long j10 = x8cVarW2.getLong(iK22);
                        long j11 = x8cVarW2.getLong(iK23);
                        long j12 = x8cVarW2.getLong(i4);
                        int i8 = iK25;
                        long j13 = x8cVarW2.getLong(i8);
                        int i9 = iK11;
                        int i10 = iK26;
                        boolean z2 = ((int) x8cVarW2.getLong(i10)) != 0;
                        int i11 = iK27;
                        int i12 = iK14;
                        rs9 rs9VarT = gcc.t((int) x8cVarW2.getLong(i11));
                        int i13 = iK28;
                        int i14 = iK23;
                        int i15 = (int) x8cVarW2.getLong(i13);
                        int i16 = iK29;
                        int i17 = (int) x8cVarW2.getLong(i16);
                        int i18 = iK30;
                        long j14 = x8cVarW2.getLong(i18);
                        int i19 = iK31;
                        int i20 = (int) x8cVarW2.getLong(i19);
                        int i21 = iK32;
                        int i22 = (int) x8cVarW2.getLong(i21);
                        int i23 = iK33;
                        String strT7 = x8cVarW2.isNull(i23) ? null : x8cVarW2.t0(i23);
                        int i24 = iK34;
                        Integer numValueOf = x8cVarW2.isNull(i24) ? null : Integer.valueOf((int) x8cVarW2.getLong(i24));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i25 = iK35;
                        qe9 qe9VarS = gcc.s((int) x8cVarW2.getLong(i25));
                        int i26 = iK36;
                        be9 be9VarF = gcc.F(x8cVarW2.getBlob(i26));
                        iK35 = i25;
                        iK36 = i26;
                        int i27 = iK37;
                        boolean z3 = ((int) x8cVarW2.getLong(i27)) != 0;
                        iK37 = i27;
                        int i28 = iK38;
                        boolean z4 = ((int) x8cVarW2.getLong(i28)) != 0;
                        int i29 = iK39;
                        boolean z5 = ((int) x8cVarW2.getLong(i29)) != 0;
                        iK39 = i29;
                        int i30 = iK40;
                        int i31 = iK41;
                        int i32 = iK42;
                        int i33 = iK43;
                        iK43 = i33;
                        arrayList2.add(new lbg(strT4, vagVarU, strT5, strT6, bb3VarW, bb3VarW2, j7, j8, j9, new jl2(be9VarF, qe9VarS, z3, z4, z5, ((int) x8cVarW2.getLong(i30)) != 0, x8cVarW2.getLong(i31), x8cVarW2.getLong(i32), gcc.e(x8cVarW2.getBlob(i33))), i5, us0VarR, j10, j11, j12, j13, z2, rs9VarT, i15, i17, j14, i20, i22, strT7, boolValueOf));
                        iK40 = i30;
                        iK14 = i12;
                        iK27 = i11;
                        iK29 = i16;
                        iK32 = i21;
                        iK34 = i24;
                        iK41 = i31;
                        iK42 = i32;
                        iK12 = i6;
                        iK24 = i4;
                        iK13 = i7;
                        arrayList = arrayList2;
                        iK11 = i9;
                        iK25 = i8;
                        iK26 = i10;
                        iK30 = i18;
                        iK31 = i19;
                        iK33 = i23;
                        iK38 = i28;
                        iK23 = i14;
                        iK28 = i13;
                        break;
                    }
                    return arrayList;
                } finally {
                    x8cVarW2.close();
                }
        }
    }

    public /* synthetic */ ac(long j, int i) {
        this.a = i;
        this.b = j;
    }
}

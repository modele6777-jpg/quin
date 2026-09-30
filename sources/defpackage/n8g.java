package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n8g implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ n8g(int i) {
        this.a = i;
    }

    private final Object a(Object obj) throws Exception {
        q8c q8cVar = (q8c) obj;
        q8cVar.getClass();
        x8c x8cVarW0 = q8cVar.W0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        try {
            int iK = y8c.k(x8cVarW0, "id");
            int iK2 = y8c.k(x8cVarW0, "state");
            int iK3 = y8c.k(x8cVarW0, "worker_class_name");
            int iK4 = y8c.k(x8cVarW0, "input_merger_class_name");
            int iK5 = y8c.k(x8cVarW0, "input");
            int iK6 = y8c.k(x8cVarW0, "output");
            int iK7 = y8c.k(x8cVarW0, "initial_delay");
            int iK8 = y8c.k(x8cVarW0, "interval_duration");
            int iK9 = y8c.k(x8cVarW0, "flex_duration");
            int iK10 = y8c.k(x8cVarW0, "run_attempt_count");
            int iK11 = y8c.k(x8cVarW0, "backoff_policy");
            int iK12 = y8c.k(x8cVarW0, "backoff_delay_duration");
            int iK13 = y8c.k(x8cVarW0, "last_enqueue_time");
            int iK14 = y8c.k(x8cVarW0, "minimum_retention_duration");
            int iK15 = y8c.k(x8cVarW0, "schedule_requested_at");
            int iK16 = y8c.k(x8cVarW0, "run_in_foreground");
            int iK17 = y8c.k(x8cVarW0, "out_of_quota_policy");
            int iK18 = y8c.k(x8cVarW0, "period_count");
            int iK19 = y8c.k(x8cVarW0, "generation");
            int iK20 = y8c.k(x8cVarW0, "next_schedule_time_override");
            int iK21 = y8c.k(x8cVarW0, "next_schedule_time_override_generation");
            int iK22 = y8c.k(x8cVarW0, "stop_reason");
            int iK23 = y8c.k(x8cVarW0, "trace_tag");
            int iK24 = y8c.k(x8cVarW0, "backoff_on_system_interruptions");
            int iK25 = y8c.k(x8cVarW0, "required_network_type");
            int iK26 = y8c.k(x8cVarW0, "required_network_request");
            int iK27 = y8c.k(x8cVarW0, "requires_charging");
            int iK28 = y8c.k(x8cVarW0, "requires_device_idle");
            int iK29 = y8c.k(x8cVarW0, "requires_battery_not_low");
            int iK30 = y8c.k(x8cVarW0, "requires_storage_not_low");
            int iK31 = y8c.k(x8cVarW0, "trigger_content_update_delay");
            int iK32 = y8c.k(x8cVarW0, "trigger_max_content_delay");
            int iK33 = y8c.k(x8cVarW0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (x8cVarW0.R0()) {
                String strT0 = x8cVarW0.t0(iK);
                int i = iK14;
                ArrayList arrayList2 = arrayList;
                vag vagVarU = gcc.u((int) x8cVarW0.getLong(iK2));
                String strT1 = x8cVarW0.t0(iK3);
                String strT2 = x8cVarW0.t0(iK4);
                byte[] blob = x8cVarW0.getBlob(iK5);
                bb3 bb3Var = bb3.b;
                bb3 bb3VarW = bm8.w(blob);
                bb3 bb3VarW2 = bm8.w(x8cVarW0.getBlob(iK6));
                long j = x8cVarW0.getLong(iK7);
                long j2 = x8cVarW0.getLong(iK8);
                long j3 = x8cVarW0.getLong(iK9);
                int i2 = (int) x8cVarW0.getLong(iK10);
                int i3 = iK2;
                int i4 = iK3;
                us0 us0VarR = gcc.r((int) x8cVarW0.getLong(iK11));
                long j4 = x8cVarW0.getLong(iK12);
                long j5 = x8cVarW0.getLong(iK13);
                long j6 = x8cVarW0.getLong(i);
                int i5 = iK15;
                long j7 = x8cVarW0.getLong(i5);
                int i6 = iK;
                int i7 = iK16;
                boolean z = ((int) x8cVarW0.getLong(i7)) != 0;
                int i8 = iK17;
                int i9 = iK4;
                rs9 rs9VarT = gcc.t((int) x8cVarW0.getLong(i8));
                int i10 = iK18;
                int i11 = iK5;
                int i12 = (int) x8cVarW0.getLong(i10);
                int i13 = iK19;
                int i14 = (int) x8cVarW0.getLong(i13);
                int i15 = iK20;
                long j8 = x8cVarW0.getLong(i15);
                int i16 = iK21;
                int i17 = (int) x8cVarW0.getLong(i16);
                int i18 = iK22;
                int i19 = (int) x8cVarW0.getLong(i18);
                int i20 = iK23;
                Boolean boolValueOf = null;
                String strT3 = x8cVarW0.isNull(i20) ? null : x8cVarW0.t0(i20);
                int i21 = iK24;
                Integer numValueOf = x8cVarW0.isNull(i21) ? null : Integer.valueOf((int) x8cVarW0.getLong(i21));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i22 = iK25;
                Boolean bool = boolValueOf;
                qe9 qe9VarS = gcc.s((int) x8cVarW0.getLong(i22));
                int i23 = iK26;
                be9 be9VarF = gcc.F(x8cVarW0.getBlob(i23));
                iK25 = i22;
                iK26 = i23;
                int i24 = iK27;
                boolean z2 = ((int) x8cVarW0.getLong(i24)) != 0;
                iK27 = i24;
                int i25 = iK28;
                boolean z3 = ((int) x8cVarW0.getLong(i25)) != 0;
                int i26 = iK29;
                boolean z4 = ((int) x8cVarW0.getLong(i26)) != 0;
                iK29 = i26;
                int i27 = iK30;
                int i28 = iK31;
                int i29 = iK32;
                int i30 = iK33;
                iK33 = i30;
                arrayList2.add(new lbg(strT0, vagVarU, strT1, strT2, bb3VarW, bb3VarW2, j, j2, j3, new jl2(be9VarF, qe9VarS, z2, z3, z4, ((int) x8cVarW0.getLong(i27)) != 0, x8cVarW0.getLong(i28), x8cVarW0.getLong(i29), gcc.e(x8cVarW0.getBlob(i30))), i2, us0VarR, j4, j5, j6, j7, z, rs9VarT, i12, i14, j8, i17, i19, strT3, bool));
                iK30 = i27;
                iK4 = i9;
                iK17 = i8;
                iK19 = i13;
                iK22 = i18;
                iK24 = i21;
                iK31 = i28;
                iK32 = i29;
                iK2 = i3;
                iK14 = i;
                iK3 = i4;
                arrayList = arrayList2;
                iK = i6;
                iK15 = i5;
                iK16 = i7;
                iK20 = i15;
                iK21 = i16;
                iK23 = i20;
                iK28 = i25;
                iK5 = i11;
                iK18 = i10;
            }
            return arrayList;
        } finally {
            x8cVarW0.close();
        }
    }

    private final Object e(Object obj) throws Exception {
        q8c q8cVar = (q8c) obj;
        q8cVar.getClass();
        x8c x8cVarW0 = q8cVar.W0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            x8cVarW0.m(1, 200L);
            int iK = y8c.k(x8cVarW0, "id");
            int iK2 = y8c.k(x8cVarW0, "state");
            int iK3 = y8c.k(x8cVarW0, "worker_class_name");
            int iK4 = y8c.k(x8cVarW0, "input_merger_class_name");
            int iK5 = y8c.k(x8cVarW0, "input");
            int iK6 = y8c.k(x8cVarW0, "output");
            int iK7 = y8c.k(x8cVarW0, "initial_delay");
            int iK8 = y8c.k(x8cVarW0, "interval_duration");
            int iK9 = y8c.k(x8cVarW0, "flex_duration");
            int iK10 = y8c.k(x8cVarW0, "run_attempt_count");
            int iK11 = y8c.k(x8cVarW0, "backoff_policy");
            int iK12 = y8c.k(x8cVarW0, "backoff_delay_duration");
            int iK13 = y8c.k(x8cVarW0, "last_enqueue_time");
            int iK14 = y8c.k(x8cVarW0, "minimum_retention_duration");
            int iK15 = y8c.k(x8cVarW0, "schedule_requested_at");
            int iK16 = y8c.k(x8cVarW0, "run_in_foreground");
            int iK17 = y8c.k(x8cVarW0, "out_of_quota_policy");
            int iK18 = y8c.k(x8cVarW0, "period_count");
            int iK19 = y8c.k(x8cVarW0, "generation");
            int iK20 = y8c.k(x8cVarW0, "next_schedule_time_override");
            int iK21 = y8c.k(x8cVarW0, "next_schedule_time_override_generation");
            int iK22 = y8c.k(x8cVarW0, "stop_reason");
            int iK23 = y8c.k(x8cVarW0, "trace_tag");
            int iK24 = y8c.k(x8cVarW0, "backoff_on_system_interruptions");
            int iK25 = y8c.k(x8cVarW0, "required_network_type");
            int iK26 = y8c.k(x8cVarW0, "required_network_request");
            int iK27 = y8c.k(x8cVarW0, "requires_charging");
            int iK28 = y8c.k(x8cVarW0, "requires_device_idle");
            int iK29 = y8c.k(x8cVarW0, "requires_battery_not_low");
            int iK30 = y8c.k(x8cVarW0, "requires_storage_not_low");
            int iK31 = y8c.k(x8cVarW0, "trigger_content_update_delay");
            int iK32 = y8c.k(x8cVarW0, "trigger_max_content_delay");
            int iK33 = y8c.k(x8cVarW0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (x8cVarW0.R0()) {
                String strT0 = x8cVarW0.t0(iK);
                int i = iK13;
                int i2 = iK14;
                vag vagVarU = gcc.u((int) x8cVarW0.getLong(iK2));
                String strT1 = x8cVarW0.t0(iK3);
                String strT2 = x8cVarW0.t0(iK4);
                byte[] blob = x8cVarW0.getBlob(iK5);
                bb3 bb3Var = bb3.b;
                bb3 bb3VarW = bm8.w(blob);
                bb3 bb3VarW2 = bm8.w(x8cVarW0.getBlob(iK6));
                long j = x8cVarW0.getLong(iK7);
                long j2 = x8cVarW0.getLong(iK8);
                long j3 = x8cVarW0.getLong(iK9);
                int i3 = (int) x8cVarW0.getLong(iK10);
                int i4 = iK;
                int i5 = iK2;
                us0 us0VarR = gcc.r((int) x8cVarW0.getLong(iK11));
                long j4 = x8cVarW0.getLong(iK12);
                long j5 = x8cVarW0.getLong(i);
                long j6 = x8cVarW0.getLong(i2);
                int i6 = iK15;
                long j7 = x8cVarW0.getLong(i6);
                iK15 = i6;
                int i7 = iK16;
                int i8 = iK3;
                boolean z = ((int) x8cVarW0.getLong(i7)) != 0;
                int i9 = iK17;
                int i10 = iK4;
                rs9 rs9VarT = gcc.t((int) x8cVarW0.getLong(i9));
                int i11 = iK18;
                int i12 = (int) x8cVarW0.getLong(i11);
                int i13 = iK19;
                int i14 = (int) x8cVarW0.getLong(i13);
                int i15 = iK20;
                long j8 = x8cVarW0.getLong(i15);
                int i16 = iK21;
                int i17 = (int) x8cVarW0.getLong(i16);
                iK21 = i16;
                iK22 = iK22;
                int i18 = (int) x8cVarW0.getLong(iK22);
                int i19 = iK23;
                Boolean boolValueOf = null;
                String strT3 = x8cVarW0.isNull(i19) ? null : x8cVarW0.t0(i19);
                int i20 = iK24;
                Integer numValueOf = x8cVarW0.isNull(i20) ? null : Integer.valueOf((int) x8cVarW0.getLong(i20));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i21 = iK25;
                qe9 qe9VarS = gcc.s((int) x8cVarW0.getLong(i21));
                int i22 = iK26;
                be9 be9VarF = gcc.F(x8cVarW0.getBlob(i22));
                int i23 = iK27;
                boolean z2 = ((int) x8cVarW0.getLong(i23)) != 0;
                int i24 = iK28;
                boolean z3 = ((int) x8cVarW0.getLong(i24)) != 0;
                int i25 = iK29;
                boolean z4 = ((int) x8cVarW0.getLong(i25)) != 0;
                iK29 = i25;
                int i26 = iK30;
                int i27 = iK31;
                int i28 = iK32;
                iK31 = i27;
                int i29 = iK33;
                arrayList.add(new lbg(strT0, vagVarU, strT1, strT2, bb3VarW, bb3VarW2, j, j2, j3, new jl2(be9VarF, qe9VarS, z2, z3, z4, ((int) x8cVarW0.getLong(i26)) != 0, x8cVarW0.getLong(i27), x8cVarW0.getLong(i28), gcc.e(x8cVarW0.getBlob(i29))), i3, us0VarR, j4, j5, j6, j7, z, rs9VarT, i12, i14, j8, i17, i18, strT3, bool));
                iK28 = i24;
                iK4 = i10;
                iK17 = i9;
                iK18 = i11;
                iK19 = i13;
                iK20 = i15;
                iK23 = i19;
                iK24 = i20;
                iK25 = i21;
                iK26 = i22;
                iK27 = i23;
                iK33 = i29;
                iK32 = i28;
                iK30 = i26;
                iK = i4;
                iK3 = i8;
                iK13 = i;
                iK14 = i2;
                iK2 = i5;
                iK16 = i7;
            }
            return arrayList;
        } finally {
            x8cVarW0.close();
        }
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        z = false;
        boolean z = false;
        switch (this.a) {
            case 0:
                return ((m8g) obj).c;
            case 1:
                return ((m8g) obj).e;
            case 2:
                u8g u8gVar = (u8g) obj;
                u8gVar.getClass();
                return u8gVar;
            case 3:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("DELETE FROM WorkProgress");
                try {
                    x8cVarW0.R0();
                    return wef.a;
                } finally {
                    x8cVarW0.close();
                }
            case 4:
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                x8c x8cVarW1 = q8cVar2.W0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iK = y8c.k(x8cVarW1, "id");
                    int iK2 = y8c.k(x8cVarW1, "state");
                    int iK3 = y8c.k(x8cVarW1, "worker_class_name");
                    int iK4 = y8c.k(x8cVarW1, "input_merger_class_name");
                    int iK5 = y8c.k(x8cVarW1, "input");
                    int iK6 = y8c.k(x8cVarW1, "output");
                    int iK7 = y8c.k(x8cVarW1, "initial_delay");
                    int iK8 = y8c.k(x8cVarW1, "interval_duration");
                    int iK9 = y8c.k(x8cVarW1, "flex_duration");
                    int iK10 = y8c.k(x8cVarW1, "run_attempt_count");
                    int iK11 = y8c.k(x8cVarW1, "backoff_policy");
                    int iK12 = y8c.k(x8cVarW1, "backoff_delay_duration");
                    int iK13 = y8c.k(x8cVarW1, "last_enqueue_time");
                    int iK14 = y8c.k(x8cVarW1, "minimum_retention_duration");
                    int iK15 = y8c.k(x8cVarW1, "schedule_requested_at");
                    int iK16 = y8c.k(x8cVarW1, "run_in_foreground");
                    int iK17 = y8c.k(x8cVarW1, "out_of_quota_policy");
                    int iK18 = y8c.k(x8cVarW1, "period_count");
                    int iK19 = y8c.k(x8cVarW1, "generation");
                    int iK20 = y8c.k(x8cVarW1, "next_schedule_time_override");
                    int iK21 = y8c.k(x8cVarW1, "next_schedule_time_override_generation");
                    int iK22 = y8c.k(x8cVarW1, "stop_reason");
                    int iK23 = y8c.k(x8cVarW1, "trace_tag");
                    int iK24 = y8c.k(x8cVarW1, "backoff_on_system_interruptions");
                    int iK25 = y8c.k(x8cVarW1, "required_network_type");
                    int iK26 = y8c.k(x8cVarW1, "required_network_request");
                    int iK27 = y8c.k(x8cVarW1, "requires_charging");
                    int iK28 = y8c.k(x8cVarW1, "requires_device_idle");
                    int iK29 = y8c.k(x8cVarW1, "requires_battery_not_low");
                    int iK30 = y8c.k(x8cVarW1, "requires_storage_not_low");
                    int iK31 = y8c.k(x8cVarW1, "trigger_content_update_delay");
                    int iK32 = y8c.k(x8cVarW1, "trigger_max_content_delay");
                    int iK33 = y8c.k(x8cVarW1, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (x8cVarW1.R0()) {
                        String strT0 = x8cVarW1.t0(iK);
                        int i = iK;
                        int i2 = iK14;
                        vag vagVarU = gcc.u((int) x8cVarW1.getLong(iK2));
                        String strT1 = x8cVarW1.t0(iK3);
                        String strT2 = x8cVarW1.t0(iK4);
                        byte[] blob = x8cVarW1.getBlob(iK5);
                        bb3 bb3Var = bb3.b;
                        bb3 bb3VarW = bm8.w(blob);
                        bb3 bb3VarW2 = bm8.w(x8cVarW1.getBlob(iK6));
                        long j = x8cVarW1.getLong(iK7);
                        long j2 = x8cVarW1.getLong(iK8);
                        long j3 = x8cVarW1.getLong(iK9);
                        int i3 = (int) x8cVarW1.getLong(iK10);
                        int i4 = iK5;
                        int i5 = iK4;
                        us0 us0VarR = gcc.r((int) x8cVarW1.getLong(iK11));
                        long j4 = x8cVarW1.getLong(iK12);
                        long j5 = x8cVarW1.getLong(iK13);
                        long j6 = x8cVarW1.getLong(i2);
                        int i6 = iK15;
                        long j7 = x8cVarW1.getLong(i6);
                        int i7 = iK3;
                        int i8 = iK16;
                        boolean z2 = ((int) x8cVarW1.getLong(i8)) != 0;
                        int i9 = iK2;
                        int i10 = iK17;
                        rs9 rs9VarT = gcc.t((int) x8cVarW1.getLong(i10));
                        iK17 = i10;
                        int i11 = iK18;
                        int i12 = (int) x8cVarW1.getLong(i11);
                        iK18 = i11;
                        int i13 = iK19;
                        int i14 = (int) x8cVarW1.getLong(i13);
                        int i15 = iK20;
                        long j8 = x8cVarW1.getLong(i15);
                        int i16 = iK21;
                        int i17 = (int) x8cVarW1.getLong(i16);
                        iK21 = i16;
                        iK22 = iK22;
                        int i18 = (int) x8cVarW1.getLong(iK22);
                        iK23 = iK23;
                        String strT3 = x8cVarW1.isNull(iK23) ? null : x8cVarW1.t0(iK23);
                        int i19 = iK24;
                        Integer numValueOf = x8cVarW1.isNull(i19) ? null : Integer.valueOf((int) x8cVarW1.getLong(i19));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i20 = iK25;
                        qe9 qe9VarS = gcc.s((int) x8cVarW1.getLong(i20));
                        int i21 = iK26;
                        be9 be9VarF = gcc.F(x8cVarW1.getBlob(i21));
                        int i22 = iK27;
                        boolean z3 = ((int) x8cVarW1.getLong(i22)) != 0;
                        int i23 = iK28;
                        boolean z4 = ((int) x8cVarW1.getLong(i23)) != 0;
                        int i24 = iK29;
                        boolean z5 = ((int) x8cVarW1.getLong(i24)) != 0;
                        iK29 = i24;
                        int i25 = iK30;
                        int i26 = iK31;
                        int i27 = iK32;
                        iK31 = i26;
                        int i28 = iK33;
                        arrayList.add(new lbg(strT0, vagVarU, strT1, strT2, bb3VarW, bb3VarW2, j, j2, j3, new jl2(be9VarF, qe9VarS, z3, z4, z5, ((int) x8cVarW1.getLong(i25)) != 0, x8cVarW1.getLong(i26), x8cVarW1.getLong(i27), gcc.e(x8cVarW1.getBlob(i28))), i3, us0VarR, j4, j5, j6, j7, z2, rs9VarT, i12, i14, j8, i17, i18, strT3, boolValueOf));
                        iK2 = i9;
                        iK16 = i8;
                        iK19 = i13;
                        iK20 = i15;
                        iK24 = i19;
                        iK25 = i20;
                        iK26 = i21;
                        iK27 = i22;
                        iK28 = i23;
                        iK33 = i28;
                        iK32 = i27;
                        iK30 = i25;
                        iK4 = i5;
                        iK = i;
                        iK14 = i2;
                        iK5 = i4;
                        iK3 = i7;
                        iK15 = i6;
                        break;
                    }
                    return arrayList;
                } finally {
                    x8cVarW1.close();
                }
            case 5:
                q8c q8cVar3 = (q8c) obj;
                q8cVar3.getClass();
                x8c x8cVarW2 = q8cVar3.W0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    x8cVarW2.m(1, 20L);
                    int iK34 = y8c.k(x8cVarW2, "id");
                    int iK35 = y8c.k(x8cVarW2, "state");
                    int iK36 = y8c.k(x8cVarW2, "worker_class_name");
                    int iK37 = y8c.k(x8cVarW2, "input_merger_class_name");
                    int iK38 = y8c.k(x8cVarW2, "input");
                    int iK39 = y8c.k(x8cVarW2, "output");
                    int iK40 = y8c.k(x8cVarW2, "initial_delay");
                    int iK41 = y8c.k(x8cVarW2, "interval_duration");
                    int iK42 = y8c.k(x8cVarW2, "flex_duration");
                    int iK43 = y8c.k(x8cVarW2, "run_attempt_count");
                    int iK44 = y8c.k(x8cVarW2, "backoff_policy");
                    int iK45 = y8c.k(x8cVarW2, "backoff_delay_duration");
                    int iK46 = y8c.k(x8cVarW2, "last_enqueue_time");
                    int iK47 = y8c.k(x8cVarW2, "minimum_retention_duration");
                    int iK48 = y8c.k(x8cVarW2, "schedule_requested_at");
                    int iK49 = y8c.k(x8cVarW2, "run_in_foreground");
                    int iK50 = y8c.k(x8cVarW2, "out_of_quota_policy");
                    int iK51 = y8c.k(x8cVarW2, "period_count");
                    int iK52 = y8c.k(x8cVarW2, "generation");
                    int iK53 = y8c.k(x8cVarW2, "next_schedule_time_override");
                    int iK54 = y8c.k(x8cVarW2, "next_schedule_time_override_generation");
                    int iK55 = y8c.k(x8cVarW2, "stop_reason");
                    int iK56 = y8c.k(x8cVarW2, "trace_tag");
                    int iK57 = y8c.k(x8cVarW2, "backoff_on_system_interruptions");
                    int iK58 = y8c.k(x8cVarW2, "required_network_type");
                    int iK59 = y8c.k(x8cVarW2, "required_network_request");
                    int iK60 = y8c.k(x8cVarW2, "requires_charging");
                    int iK61 = y8c.k(x8cVarW2, "requires_device_idle");
                    int iK62 = y8c.k(x8cVarW2, "requires_battery_not_low");
                    int iK63 = y8c.k(x8cVarW2, "requires_storage_not_low");
                    int iK64 = y8c.k(x8cVarW2, "trigger_content_update_delay");
                    int iK65 = y8c.k(x8cVarW2, "trigger_max_content_delay");
                    int iK66 = y8c.k(x8cVarW2, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (x8cVarW2.R0()) {
                        String strT4 = x8cVarW2.t0(iK34);
                        int i29 = iK47;
                        ArrayList arrayList3 = arrayList2;
                        vag vagVarU2 = gcc.u((int) x8cVarW2.getLong(iK35));
                        String strT5 = x8cVarW2.t0(iK36);
                        String strT6 = x8cVarW2.t0(iK37);
                        byte[] blob2 = x8cVarW2.getBlob(iK38);
                        bb3 bb3Var2 = bb3.b;
                        bb3 bb3VarW3 = bm8.w(blob2);
                        bb3 bb3VarW4 = bm8.w(x8cVarW2.getBlob(iK39));
                        long j9 = x8cVarW2.getLong(iK40);
                        long j10 = x8cVarW2.getLong(iK41);
                        long j11 = x8cVarW2.getLong(iK42);
                        int i30 = (int) x8cVarW2.getLong(iK43);
                        int i31 = iK38;
                        int i32 = iK37;
                        us0 us0VarR2 = gcc.r((int) x8cVarW2.getLong(iK44));
                        long j12 = x8cVarW2.getLong(iK45);
                        long j13 = x8cVarW2.getLong(iK46);
                        long j14 = x8cVarW2.getLong(i29);
                        int i33 = iK48;
                        long j15 = x8cVarW2.getLong(i33);
                        int i34 = iK49;
                        iK48 = i33;
                        boolean z6 = ((int) x8cVarW2.getLong(i34)) != 0;
                        int i35 = iK36;
                        int i36 = iK50;
                        rs9 rs9VarT2 = gcc.t((int) x8cVarW2.getLong(i36));
                        int i37 = iK51;
                        int i38 = iK35;
                        int i39 = (int) x8cVarW2.getLong(i37);
                        iK50 = i36;
                        int i40 = iK52;
                        int i41 = (int) x8cVarW2.getLong(i40);
                        long j16 = x8cVarW2.getLong(iK53);
                        int i42 = iK54;
                        int i43 = (int) x8cVarW2.getLong(i42);
                        iK54 = i42;
                        iK55 = iK55;
                        int i44 = (int) x8cVarW2.getLong(iK55);
                        iK56 = iK56;
                        String strT7 = x8cVarW2.isNull(iK56) ? null : x8cVarW2.t0(iK56);
                        int i45 = iK57;
                        Integer numValueOf2 = x8cVarW2.isNull(i45) ? null : Integer.valueOf((int) x8cVarW2.getLong(i45));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i46 = iK58;
                        qe9 qe9VarS2 = gcc.s((int) x8cVarW2.getLong(i46));
                        int i47 = iK59;
                        be9 be9VarF2 = gcc.F(x8cVarW2.getBlob(i47));
                        int i48 = iK60;
                        boolean z7 = ((int) x8cVarW2.getLong(i48)) != 0;
                        int i49 = iK61;
                        boolean z8 = ((int) x8cVarW2.getLong(i49)) != 0;
                        int i50 = iK62;
                        boolean z9 = ((int) x8cVarW2.getLong(i50)) != 0;
                        iK62 = i50;
                        int i51 = iK63;
                        int i52 = iK64;
                        int i53 = iK65;
                        iK64 = i52;
                        int i54 = iK66;
                        iK66 = i54;
                        arrayList3.add(new lbg(strT4, vagVarU2, strT5, strT6, bb3VarW3, bb3VarW4, j9, j10, j11, new jl2(be9VarF2, qe9VarS2, z7, z8, z9, ((int) x8cVarW2.getLong(i51)) != 0, x8cVarW2.getLong(i52), x8cVarW2.getLong(i53), gcc.e(x8cVarW2.getBlob(i54))), i30, us0VarR2, j12, j13, j14, j15, z6, rs9VarT2, i39, i41, j16, i43, i44, strT7, boolValueOf2));
                        iK61 = i49;
                        iK35 = i38;
                        iK51 = i37;
                        iK52 = i40;
                        iK57 = i45;
                        iK58 = i46;
                        iK59 = i47;
                        iK60 = i48;
                        iK65 = i53;
                        iK63 = i51;
                        iK47 = i29;
                        iK37 = i32;
                        iK36 = i35;
                        iK49 = i34;
                        arrayList2 = arrayList3;
                        iK38 = i31;
                        break;
                    }
                    return arrayList2;
                } finally {
                    x8cVarW2.close();
                }
            case 6:
                q8c q8cVar4 = (q8c) obj;
                q8cVar4.getClass();
                x8c x8cVarW3 = q8cVar4.W0("SELECT * FROM workspec WHERE state=1");
                try {
                    int iK67 = y8c.k(x8cVarW3, "id");
                    int iK68 = y8c.k(x8cVarW3, "state");
                    int iK69 = y8c.k(x8cVarW3, "worker_class_name");
                    int iK70 = y8c.k(x8cVarW3, "input_merger_class_name");
                    int iK71 = y8c.k(x8cVarW3, "input");
                    int iK72 = y8c.k(x8cVarW3, "output");
                    int iK73 = y8c.k(x8cVarW3, "initial_delay");
                    int iK74 = y8c.k(x8cVarW3, "interval_duration");
                    int iK75 = y8c.k(x8cVarW3, "flex_duration");
                    int iK76 = y8c.k(x8cVarW3, "run_attempt_count");
                    int iK77 = y8c.k(x8cVarW3, "backoff_policy");
                    int iK78 = y8c.k(x8cVarW3, "backoff_delay_duration");
                    int iK79 = y8c.k(x8cVarW3, "last_enqueue_time");
                    int iK80 = y8c.k(x8cVarW3, "minimum_retention_duration");
                    int iK81 = y8c.k(x8cVarW3, "schedule_requested_at");
                    int iK82 = y8c.k(x8cVarW3, "run_in_foreground");
                    int iK83 = y8c.k(x8cVarW3, "out_of_quota_policy");
                    int iK84 = y8c.k(x8cVarW3, "period_count");
                    int iK85 = y8c.k(x8cVarW3, "generation");
                    int iK86 = y8c.k(x8cVarW3, "next_schedule_time_override");
                    int iK87 = y8c.k(x8cVarW3, "next_schedule_time_override_generation");
                    int iK88 = y8c.k(x8cVarW3, "stop_reason");
                    int iK89 = y8c.k(x8cVarW3, "trace_tag");
                    int iK90 = y8c.k(x8cVarW3, "backoff_on_system_interruptions");
                    int iK91 = y8c.k(x8cVarW3, "required_network_type");
                    int iK92 = y8c.k(x8cVarW3, "required_network_request");
                    int iK93 = y8c.k(x8cVarW3, "requires_charging");
                    int iK94 = y8c.k(x8cVarW3, "requires_device_idle");
                    int iK95 = y8c.k(x8cVarW3, "requires_battery_not_low");
                    int iK96 = y8c.k(x8cVarW3, "requires_storage_not_low");
                    int iK97 = y8c.k(x8cVarW3, "trigger_content_update_delay");
                    int iK98 = y8c.k(x8cVarW3, "trigger_max_content_delay");
                    int iK99 = y8c.k(x8cVarW3, "content_uri_triggers");
                    ArrayList arrayList4 = new ArrayList();
                    while (x8cVarW3.R0()) {
                        String strT8 = x8cVarW3.t0(iK67);
                        int i55 = iK80;
                        int i56 = iK79;
                        vag vagVarU3 = gcc.u((int) x8cVarW3.getLong(iK68));
                        String strT9 = x8cVarW3.t0(iK69);
                        String strT10 = x8cVarW3.t0(iK70);
                        byte[] blob3 = x8cVarW3.getBlob(iK71);
                        bb3 bb3Var3 = bb3.b;
                        bb3 bb3VarW5 = bm8.w(blob3);
                        bb3 bb3VarW6 = bm8.w(x8cVarW3.getBlob(iK72));
                        long j17 = x8cVarW3.getLong(iK73);
                        long j18 = x8cVarW3.getLong(iK74);
                        long j19 = x8cVarW3.getLong(iK75);
                        int i57 = (int) x8cVarW3.getLong(iK76);
                        int i58 = iK71;
                        int i59 = iK70;
                        us0 us0VarR3 = gcc.r((int) x8cVarW3.getLong(iK77));
                        long j20 = x8cVarW3.getLong(iK78);
                        long j21 = x8cVarW3.getLong(i56);
                        long j22 = x8cVarW3.getLong(i55);
                        int i60 = iK81;
                        long j23 = x8cVarW3.getLong(i60);
                        int i61 = iK69;
                        int i62 = iK82;
                        boolean z10 = ((int) x8cVarW3.getLong(i62)) != 0;
                        int i63 = iK68;
                        int i64 = iK83;
                        rs9 rs9VarT3 = gcc.t((int) x8cVarW3.getLong(i64));
                        iK83 = i64;
                        int i65 = iK84;
                        int i66 = (int) x8cVarW3.getLong(i65);
                        iK84 = i65;
                        int i67 = iK85;
                        int i68 = (int) x8cVarW3.getLong(i67);
                        int i69 = iK86;
                        long j24 = x8cVarW3.getLong(i69);
                        int i70 = iK87;
                        int i71 = (int) x8cVarW3.getLong(i70);
                        iK87 = i70;
                        iK88 = iK88;
                        int i72 = (int) x8cVarW3.getLong(iK88);
                        iK89 = iK89;
                        String strT11 = x8cVarW3.isNull(iK89) ? null : x8cVarW3.t0(iK89);
                        int i73 = iK90;
                        Integer numValueOf3 = x8cVarW3.isNull(i73) ? null : Integer.valueOf((int) x8cVarW3.getLong(i73));
                        if (numValueOf3 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        int i74 = iK91;
                        qe9 qe9VarS3 = gcc.s((int) x8cVarW3.getLong(i74));
                        int i75 = iK92;
                        be9 be9VarF3 = gcc.F(x8cVarW3.getBlob(i75));
                        int i76 = iK93;
                        boolean z11 = ((int) x8cVarW3.getLong(i76)) != 0;
                        int i77 = iK94;
                        boolean z12 = ((int) x8cVarW3.getLong(i77)) != 0;
                        int i78 = iK95;
                        boolean z13 = ((int) x8cVarW3.getLong(i78)) != 0;
                        iK95 = i78;
                        int i79 = iK96;
                        int i80 = iK97;
                        int i81 = iK98;
                        iK97 = i80;
                        int i82 = iK99;
                        arrayList4.add(new lbg(strT8, vagVarU3, strT9, strT10, bb3VarW5, bb3VarW6, j17, j18, j19, new jl2(be9VarF3, qe9VarS3, z11, z12, z13, ((int) x8cVarW3.getLong(i79)) != 0, x8cVarW3.getLong(i80), x8cVarW3.getLong(i81), gcc.e(x8cVarW3.getBlob(i82))), i57, us0VarR3, j20, j21, j22, j23, z10, rs9VarT3, i66, i68, j24, i71, i72, strT11, boolValueOf3));
                        iK68 = i63;
                        iK82 = i62;
                        iK85 = i67;
                        iK86 = i69;
                        iK90 = i73;
                        iK91 = i74;
                        iK92 = i75;
                        iK93 = i76;
                        iK94 = i77;
                        iK99 = i82;
                        iK98 = i81;
                        iK96 = i79;
                        iK80 = i55;
                        iK70 = i59;
                        iK71 = i58;
                        iK69 = i61;
                        iK81 = i60;
                        iK79 = i56;
                        break;
                    }
                    return arrayList4;
                } finally {
                    x8cVarW3.close();
                }
            case 7:
                return a(obj);
            case 8:
                q8c q8cVar5 = (q8c) obj;
                q8cVar5.getClass();
                x8c x8cVarW4 = q8cVar5.W0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    return Integer.valueOf(x8cVarW4.R0() ? (int) x8cVarW4.getLong(0) : 0);
                } finally {
                    x8cVarW4.close();
                }
            case 9:
                q8c q8cVar6 = (q8c) obj;
                q8cVar6.getClass();
                x8c x8cVarW5 = q8cVar6.W0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (x8cVarW5.R0() && ((int) x8cVarW5.getLong(0)) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    x8cVarW5.close();
                }
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return e(obj);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                q8c q8cVar7 = (q8c) obj;
                q8cVar7.getClass();
                x8c x8cVarW6 = q8cVar7.W0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    x8cVarW6.R0();
                    return Integer.valueOf(r8c.h(q8cVar7));
                } finally {
                    x8cVarW6.close();
                }
            default:
                ((rdg) obj).getClass();
                return Boolean.TRUE;
        }
    }
}

package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.SkinType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class npf implements gpf, hf8 {
    public static final /* synthetic */ int c = 0;
    public final vkf a;
    public final fab b;

    public npf(vkf vkfVar, fab fabVar) {
        this.a = vkfVar;
        this.b = fabVar;
    }

    public static n2f c(SkinType skinType, n2f n2fVar) {
        switch (skinType == null ? -1 : hpf.a[skinType.ordinal()]) {
            case -1:
            case 1:
            case 7:
                return n2fVar;
            case 0:
            default:
                ap.c();
                return null;
            case 2:
                return n2f.c;
            case 3:
                return n2f.d;
            case 4:
                return n2f.e;
            case 5:
                return n2f.f;
            case 6:
                return n2f.g;
            case 8:
                return n2f.v;
            case 9:
                return n2f.w;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return n2f.x;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return n2f.y;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return n2f.z;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return n2f.X;
            case 14:
                return n2f.Y;
            case 15:
                return n2f.Z;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return n2f.E0;
            case 17:
                return n2f.F0;
            case 18:
                return n2f.G0;
        }
    }

    public final void b(String str) {
        ((rab) this.b).g(true);
        d().e(str.concat(": session expired"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(lmd lmdVar, zn2 zn2Var) {
        lpf lpfVar;
        if (zn2Var instanceof lpf) {
            lpfVar = (lpf) zn2Var;
            int i = lpfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lpfVar.label = i - Integer.MIN_VALUE;
            } else {
                lpfVar = new lpf(this, zn2Var);
            }
        } else {
            lpfVar = new lpf(this, zn2Var);
        }
        Object objP0 = lpfVar.result;
        int i2 = lpfVar.label;
        if (i2 == 0) {
            jzb.q(objP0);
            js3 js3Var = ga4.a;
            hr3 hr3Var = hr3.c;
            mpf mpfVar = new mpf(this, lmdVar, null);
            lpfVar.L$0 = null;
            lpfVar.label = 1;
            objP0 = ynb.p0(hr3Var, mpfVar, lpfVar);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objP0);
        }
        return ((ezb) objP0).b();
    }
}

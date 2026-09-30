package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gl7 {
    public final /* synthetic */ int a;

    static {
        o85 o85Var = o85.b;
    }

    public /* synthetic */ gl7(int i) {
        this.a = i;
    }

    public static void a(ut8 ut8Var) throws ab7 {
        if (ut8Var == null || ut8Var.b()) {
            return;
        }
        ab7 ab7Var = new ab7((ut8Var instanceof i3 ? new qef() : new qef()).getMessage());
        ab7Var.b(ut8Var);
        throw ab7Var;
    }

    public final ut8 b(ByteArrayInputStream byteArrayInputStream, o85 o85Var) throws ab7 {
        ut8 ut8Var;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                ut8Var = null;
            } else {
                if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 < 32) {
                            int i3 = byteArrayInputStream.read();
                            if (i3 == -1) {
                                throw ab7.c();
                            }
                            i |= (i3 & 127) << i2;
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                                break;
                            }
                            i2 += 7;
                        } else {
                            while (true) {
                                if (i2 >= 64) {
                                    throw new ab7("CodedInputStream encountered a malformed varint.");
                                }
                                int i4 = byteArrayInputStream.read();
                                if (i4 == -1) {
                                    throw ab7.c();
                                }
                                if ((i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                                    break;
                                }
                                i2 += 7;
                            }
                        }
                    }
                }
                g72 g72Var = new g72(new g3(byteArrayInputStream, i));
                ut8Var = (ut8) c(g72Var, o85Var);
                try {
                    g72Var.a(0);
                } catch (ab7 e) {
                    e.b(ut8Var);
                    throw e;
                }
            }
            a(ut8Var);
            return ut8Var;
        } catch (IOException e2) {
            throw new ab7(e2.getMessage());
        }
    }

    public final Object c(g72 g72Var, o85 o85Var) {
        switch (this.a) {
            case 0:
                return new il7(g72Var);
            case 1:
                return new jl7(g72Var);
            case 2:
                return new ll7(g72Var, o85Var);
            case 3:
                return new ql7(g72Var, o85Var);
            case 4:
                return new pl7(g72Var);
            case 5:
                return new kya(g72Var, o85Var);
            case 6:
                return new iya(g72Var, o85Var);
            case 7:
                return new hya(g72Var, o85Var);
            case 8:
                return new nya(g72Var, o85Var);
            case 9:
                return new oya(g72Var);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new qya(g72Var, o85Var);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new sya(g72Var, o85Var);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return new wya(g72Var, o85Var);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return new yya(g72Var, o85Var);
            case 14:
                return new bza(g72Var, o85Var);
            case 15:
                return new dza(g72Var, o85Var);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return new hza(g72Var, o85Var);
            case 17:
                return new iza(g72Var, o85Var);
            case 18:
                return new kza(g72Var, o85Var);
            case 19:
                return new oza(g72Var, o85Var);
            case 20:
                return new nza(g72Var);
            case 21:
                return new qza(g72Var);
            case 22:
                return new vza(g72Var, o85Var);
            case 23:
                return new tza(g72Var, o85Var);
            case 24:
                return new xza(g72Var, o85Var);
            case 25:
                return new a0b(g72Var, o85Var);
            case 26:
                return new b0b(g72Var, o85Var);
            case 27:
                return new d0b(g72Var, o85Var);
            case 28:
                return new h0b(g72Var);
            default:
                return new i0b(g72Var, o85Var);
        }
    }
}

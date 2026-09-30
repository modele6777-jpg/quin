package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z03 implements a26 {
    public final /* synthetic */ int a;
    public static final z03 b = new z03(0);
    public static final z03 c = new z03(1);
    public static final z03 d = new z03(2);
    public static final z03 e = new z03(3);
    public static final z03 f = new z03(4);
    public static final z03 g = new z03(5);
    public static final z03 v = new z03(6);
    public static final z03 w = new z03(7);
    public static final z03 x = new z03(8);
    public static final z03 y = new z03(9);
    public static final z03 z = new z03(10);
    public static final z03 X = new z03(11);
    public static final z03 Y = new z03(12);
    public static final z03 Z = new z03(13);
    public static final z03 E0 = new z03(14);
    public static final z03 F0 = new z03(15);
    public static final z03 G0 = new z03(16);
    public static final z03 H0 = new z03(17);
    public static final z03 I0 = new z03(18);
    public static final z03 J0 = new z03(19);
    public static final z03 K0 = new z03(20);
    public static final z03 L0 = new z03(21);
    public static final z03 M0 = new z03(22);
    public static final z03 N0 = new z03(23);
    public static final z03 O0 = new z03(24);
    public static final z03 P0 = new z03(25);
    public static final z03 Q0 = new z03(26);
    public static final z03 R0 = new z03(27);
    public static final z03 S0 = new z03(28);
    public static final z03 T0 = new z03(29);

    public /* synthetic */ z03(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        tt7 type;
        int i = this.a;
        wef wefVar = wef.a;
        boolean z2 = false;
        switch (i) {
            case 0:
                float[] fArr = ((zm8) obj).a;
                return wefVar;
            case 1:
                float[] fArr2 = ((zm8) obj).a;
                return wefVar;
            case 2:
                return Boolean.valueOf(obj instanceof ps6);
            case 3:
                tt7 tt7Var = (tt7) obj;
                jz3 jz3Var = jz3.c;
                tt7Var.getClass();
                return tt7Var;
            case 4:
                jz3 jz3Var2 = jz3.c;
                return "";
            case 5:
                tt7 tt7Var2 = (tt7) obj;
                wn7[] wn7VarArr = mz3.Z;
                tt7Var2.getClass();
                return tt7Var2;
            case 6:
                wn7[] wn7VarArr2 = mz3.Z;
                ((xrf) obj).getClass();
                return "...";
            case 7:
                bm3 bm3Var = (bm3) obj;
                int i2 = qz3.a;
                bm3Var.getClass();
                return bm3Var.k();
            case 8:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 9:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Context context3 = (Context) obj;
                context3.getClass();
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Context context4 = (Context) obj;
                context4.getClass();
                if (context4 instanceof ContextWrapper) {
                    return ((ContextWrapper) context4).getBaseContext();
                }
                return null;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Context context5 = (Context) obj;
                context5.getClass();
                if (context5 instanceof ContextWrapper) {
                    return ((ContextWrapper) context5).getBaseContext();
                }
                return null;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return ((xrf) obj).getType();
            case 14:
                Context context6 = (Context) obj;
                context6.getClass();
                if (context6 instanceof ContextWrapper) {
                    return ((ContextWrapper) context6).getBaseContext();
                }
                return null;
            case 15:
                wnb wnbVar = (wnb) obj;
                va2 va2Var = ia5.a;
                wnbVar.getClass();
                xm7 xm7VarS = ((xnb) wnbVar).a.d;
                if (xm7VarS == null) {
                    xm7VarS = wnbVar.s();
                }
                em7 em7Var = xm7VarS instanceof em7 ? (em7) xm7VarS : null;
                if (em7Var != null && af1.R(em7Var).isInterface()) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                wnb wnbVar2 = (wnb) obj;
                va2 va2Var2 = ia5.a;
                wnbVar2.getClass();
                xm7 xm7VarS2 = ((xnb) wnbVar2).a.d;
                if (xm7VarS2 == null) {
                    xm7VarS2 = wnbVar2.s();
                }
                return Boolean.valueOf(pa7.t(xm7VarS2, job.a.b(Object.class)));
            case 17:
                ((j22) obj).getClass();
                return 0;
            case 18:
                Context context7 = (Context) obj;
                context7.getClass();
                if (context7 instanceof ContextWrapper) {
                    return ((ContextWrapper) context7).getBaseContext();
                }
                return null;
            case 19:
                Context context8 = (Context) obj;
                context8.getClass();
                if (context8 instanceof ContextWrapper) {
                    return ((ContextWrapper) context8).getBaseContext();
                }
                return null;
            case 20:
                Context context9 = (Context) obj;
                context9.getClass();
                if (context9 instanceof ContextWrapper) {
                    return ((ContextWrapper) context9).getBaseContext();
                }
                return null;
            case 21:
                Context context10 = (Context) obj;
                context10.getClass();
                if (context10 instanceof ContextWrapper) {
                    return ((ContextWrapper) context10).getBaseContext();
                }
                return null;
            case 22:
                Context context11 = (Context) obj;
                context11.getClass();
                if (context11 instanceof ContextWrapper) {
                    return ((ContextWrapper) context11).getBaseContext();
                }
                return null;
            case 23:
                return Boolean.TRUE;
            case 24:
                Context context12 = (Context) obj;
                context12.getClass();
                if (context12 instanceof ContextWrapper) {
                    return ((ContextWrapper) context12).getBaseContext();
                }
                return null;
            case 25:
                Context context13 = (Context) obj;
                context13.getClass();
                if (context13 instanceof ContextWrapper) {
                    return ((ContextWrapper) context13).getBaseContext();
                }
                return null;
            case 26:
                tt7 tt7Var3 = (tt7) obj;
                tt7Var3.getClass();
                return tt7Var3.toString();
            case 27:
                tt7 tt7Var4 = (tt7) obj;
                tt7Var4.getClass();
                return tt7Var4.toString();
            case 28:
                aob aobVar = (aob) obj;
                aobVar.getClass();
                return smb.b(af1.R(pa7.V(aobVar.u())));
            default:
                w09 w09Var = (w09) obj;
                Map map = ud7.a;
                w09Var.getClass();
                xrf xrfVarY = cn1.y(sd7.b, w09Var.f().j(syd.t));
                return (xrfVarY == null || (type = xrfVarY.getType()) == null) ? sy4.c(qy4.P0, new String[0]) : type;
        }
    }
}

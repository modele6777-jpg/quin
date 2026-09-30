package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.android.core.b1;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vic implements a26 {
    public final /* synthetic */ int a;
    public static final vic b = new vic(0);
    public static final vic c = new vic(1);
    public static final vic d = new vic(2);
    public static final vic e = new vic(3);
    public static final vic f = new vic(4);
    public static final vic g = new vic(5);
    public static final vic v = new vic(6);
    public static final vic w = new vic(7);
    public static final vic x = new vic(8);
    public static final vic y = new vic(9);
    public static final vic z = new vic(10);
    public static final vic X = new vic(11);
    public static final vic Y = new vic(12);
    public static final vic Z = new vic(13);
    public static final vic E0 = new vic(14);
    public static final vic F0 = new vic(15);
    public static final vic G0 = new vic(16);
    public static final vic H0 = new vic(17);
    public static final vic I0 = new vic(18);
    public static final vic J0 = new vic(19);
    public static final vic K0 = new vic(20);
    public static final vic L0 = new vic(21);
    public static final vic M0 = new vic(22);
    public static final vic N0 = new vic(23);
    public static final vic O0 = new vic(24);
    public static final vic P0 = new vic(25);
    public static final vic Q0 = new vic(26);
    public static final vic R0 = new vic(27);
    public static final vic S0 = new vic(28);
    public static final vic T0 = new vic(29);

    public /* synthetic */ vic(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        ea1 ea1VarB;
        String strR;
        int i = this.a;
        wef wefVar = wef.a;
        boolean z2 = false;
        nud nudVar = null;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                Context context3 = (Context) obj;
                context3.getClass();
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            case 3:
                Context context4 = (Context) obj;
                context4.getClass();
                if (context4 instanceof ContextWrapper) {
                    return ((ContextWrapper) context4).getBaseContext();
                }
                return null;
            case 4:
                Context context5 = (Context) obj;
                context5.getClass();
                if (context5 instanceof ContextWrapper) {
                    return ((ContextWrapper) context5).getBaseContext();
                }
                return null;
            case 5:
                Context context6 = (Context) obj;
                context6.getClass();
                if (context6 instanceof ContextWrapper) {
                    return ((ContextWrapper) context6).getBaseContext();
                }
                return null;
            case 6:
                Context context7 = (Context) obj;
                context7.getClass();
                if (context7 instanceof ContextWrapper) {
                    return ((ContextWrapper) context7).getBaseContext();
                }
                return null;
            case 7:
                Context context8 = (Context) obj;
                context8.getClass();
                if (context8 instanceof ContextWrapper) {
                    return ((ContextWrapper) context8).getBaseContext();
                }
                return null;
            case 8:
                Context context9 = (Context) obj;
                context9.getClass();
                if (context9 instanceof ContextWrapper) {
                    return ((ContextWrapper) context9).getBaseContext();
                }
                return null;
            case 9:
                Context context10 = (Context) obj;
                context10.getClass();
                if (context10 instanceof ContextWrapper) {
                    return ((ContextWrapper) context10).getBaseContext();
                }
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                String str = (String) obj;
                str.getClass();
                return str.length() > 1 ? ks0.g(';', "L", str) : str;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ea1 ea1Var = (ea1) obj;
                ea1Var.getClass();
                nw7 nw7VarO = ea1Var.O();
                nw7VarO.getClass();
                return nw7VarO.getType();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ea1 ea1Var2 = (ea1) obj;
                ea1Var2.getClass();
                tt7 returnType = ea1Var2.getReturnType();
                returnType.getClass();
                return returnType;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                jgf jgfVar = (jgf) obj;
                jgfVar.getClass();
                return Boolean.valueOf(jgfVar instanceof mdb);
            case 14:
                y22 y22VarM = ((jgf) obj).c0().m();
                if (y22VarM == null) {
                    return Boolean.FALSE;
                }
                t99 name = y22VarM.getName();
                dx5 dx5Var = qf7.f;
                if (pa7.t(name, dx5Var.a.g()) && pa7.t(qz3.c(y22VarM), dx5Var)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 15:
                ea1 ea1Var3 = (ea1) obj;
                ea1Var3.getClass();
                return Boolean.valueOf(qn4.F(qz3.i(ea1Var3)));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ea1 ea1Var4 = (ea1) obj;
                ea1Var4.getClass();
                int i2 = n51.l;
                hjd hjdVar = (hjd) ea1Var4;
                if (xr7.A(hjdVar) && qz3.b(hjdVar, new x(9, hjdVar)) != null) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 17:
                ea1 ea1Var5 = (ea1) obj;
                ea1Var5.getClass();
                if (xr7.A(ea1Var5)) {
                    int i3 = o51.l;
                    if (qud.e.contains(ea1Var5.getName()) && (ea1VarB = qz3.b(ea1Var5, v8.M0)) != null && (strR = xo1.r(ea1VarB)) != null) {
                        if (qud.b.contains(strR)) {
                            nudVar = nud.a;
                        } else {
                            nudVar = ((pud) bm8.B(qud.d, strR)) == pud.a ? nud.c : nud.b;
                        }
                    }
                    if (nudVar != null) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 18:
                Context context11 = (Context) obj;
                context11.getClass();
                if (context11 instanceof ContextWrapper) {
                    return ((ContextWrapper) context11).getBaseContext();
                }
                return null;
            case 19:
                return wefVar;
            case 20:
                vza vzaVar = (vza) obj;
                vzaVar.getClass();
                return Integer.valueOf(vzaVar.Q());
            case 21:
                hjd hjdVar2 = (hjd) obj;
                hjdVar2.getClass();
                return hjdVar2;
            case 22:
                wxa wxaVar = (wxa) obj;
                wxaVar.getClass();
                return wxaVar;
            case 23:
                ca1 ca1Var = (ca1) obj;
                ca1Var.getClass();
                return ca1Var;
            case 24:
                bm3 bm3Var = (bm3) obj;
                bm3Var.getClass();
                return Boolean.valueOf(bm3Var instanceof ca1);
            case 25:
                bm3 bm3Var2 = (bm3) obj;
                bm3Var2.getClass();
                return Boolean.valueOf(!(bm3Var2 instanceof ul2));
            case 26:
                bm3 bm3Var3 = (bm3) obj;
                bm3Var3.getClass();
                List typeParameters = ((ca1) bm3Var3).getTypeParameters();
                typeParameters.getClass();
                return new td0(1, typeParameters);
            case 27:
                jgf jgfVar2 = (jgf) obj;
                jgfVar2.getClass();
                y22 y22VarM2 = jgfVar2.c0().m();
                if (y22VarM2 != null && (y22VarM2 instanceof c8f) && (((c8f) y22VarM2).k() instanceof s04)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 28:
                jgf jgfVar3 = (jgf) obj;
                jgfVar3.getClass();
                y22 y22VarM3 = jgfVar3.c0().m();
                if (y22VarM3 != null && ((y22VarM3 instanceof s04) || (y22VarM3 instanceof c8f))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException) && b21.F(6, "CXCP")) {
                    b1.e("CXCP", "Surface setup error!", th);
                }
                return wefVar;
        }
    }
}

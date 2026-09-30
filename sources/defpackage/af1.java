package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.Paint;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.text.Spanned;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tech.chatmind.api.User;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class af1 implements na1 {
    public static boolean X;
    public static gx6 Y;
    public static File Z;
    public static final String[] a = {"*/*", "image/*", "video/*"};
    public static final dd2 b = new dd2(new gd2(12), false, -383497374);
    public static final dd2 c = new dd2(new yd2(8), false, -662670426);
    public static final dd2 d = new dd2(new yd2(9), false, 45146466);
    public static final dd2 e = new dd2(new yd2(10), false, 1202246801);
    public static final dd2 f = new dd2(new yd2(11), false, 349086837);
    public static final dd2 g = new dd2(new ce2(21), false, 1281957915);
    public static final dd2 v = new dd2(new ce2(22), false, -1987040728);
    public static final dd2 w = new dd2(new ce2(23), false, 919986147);
    public static final ra4 x = new ra4();
    public static final Object y = new Object();
    public static Method z;

    public static final void A(nw9 nw9Var, dx5 dx5Var, ArrayList arrayList) {
        nw9Var.getClass();
        dx5Var.getClass();
        nw9Var.b(dx5Var, arrayList);
    }

    public static final long B(long j, gr4 gr4Var) {
        long j2;
        int iOrdinal = gr4Var.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                pd4.i(gr4Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static ru8 C(em7 em7Var, String str) {
        ru8 ru8Var;
        em7Var.getClass();
        HashMap map = ru8.c;
        synchronized (map) {
            try {
                Object ru8Var2 = map.get(str);
                if (ru8Var2 == null) {
                    ru8Var2 = new ru8(em7Var, str);
                    map.put(str, ru8Var2);
                }
                ru8Var = (ru8) ru8Var2;
                if (!pa7.t(ru8Var.b, em7Var)) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ru8Var;
    }

    public static final no0 D(CaptureRequest.Key key) {
        key.getClass();
        return new no0("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public static final aw2 E(l46 l46Var) {
        return new xpb(l46Var.R);
    }

    public static nw7 F(ca1 ca1Var, tt7 tt7Var, t99 t99Var, h10 h10Var, int i) {
        if (ca1Var == null) {
            a(32);
            throw null;
        }
        if (h10Var == null) {
            a(33);
            throw null;
        }
        if (tt7Var == null) {
            return null;
        }
        in2 in2Var = new in2(ca1Var, tt7Var, t99Var);
        rob robVar = w99.a;
        return new nw7(ca1Var, in2Var, h10Var, t99.e(w99.b + '_' + i));
    }

    public static zxa G(wxa wxaVar, h10 h10Var) {
        return M(wxaVar, h10Var, true, wxaVar.e());
    }

    public static dya H(wxa wxaVar, h10 h10Var) {
        g10 g10Var = hj6.c;
        ntd ntdVarE = wxaVar.e();
        if (ntdVarE != null) {
            return O(wxaVar, h10Var, g10Var, true, wxaVar.getVisibility(), ntdVarE);
        }
        a(6);
        throw null;
    }

    public static yxa I(u09 u09Var) {
        if (u09Var == null) {
            a(26);
            throw null;
        }
        w09 w09VarC = oz3.c(u09Var);
        w09VarC.getClass();
        u09 u09VarP = od4.p(w09VarC, pyd.A);
        if (u09VarP == null) {
            return null;
        }
        g10 g10Var = hj6.c;
        rz3 rz3Var = sz3.e;
        t99 t99Var = tyd.b;
        ntd ntdVarE = u09Var.e();
        e09 e09Var = e09.b;
        yxa yxaVarE0 = yxa.E0(u09Var, e09Var, rz3Var, false, t99Var, 4, ntdVarE);
        zxa zxaVar = new zxa(yxaVarE0, g10Var, e09Var, rz3Var, false, false, false, 4, null, u09Var.e());
        yxaVarE0.H0(zxaVar, null, null, null);
        e7f.b.getClass();
        e7f e7fVar = e7f.c;
        j7f j7fVarH = u09VarP.h();
        List listSingletonList = Collections.singletonList(new dzd(u09Var.S()));
        e7fVar.getClass();
        j7fVarH.getClass();
        listSingletonList.getClass();
        tjd tjdVarT = rxg.T(e7fVar, j7fVarH, listSingletonList, false);
        List list = Collections.EMPTY_LIST;
        yxaVarE0.K0(tjdVarT, list, null, null, list);
        zxaVar.F0(yxaVarE0.getReturnType());
        return yxaVarE0;
    }

    public static hjd J(u09 u09Var) {
        if (u09Var == null) {
            a(24);
            throw null;
        }
        g10 g10Var = hj6.c;
        hjd hjdVarN0 = hjd.N0(u09Var, tyd.c, 4, u09Var.e());
        xrf xrfVar = new xrf(hjdVarN0, null, 0, g10Var, t99.e("value"), qz3.e(u09Var).v(), false, false, false, null, u09Var.e());
        List list = Collections.EMPTY_LIST;
        return hjdVarN0.I0(null, null, list, list, Collections.singletonList(xrfVar), u09Var.S(), e09.b, sz3.e);
    }

    public static hjd K(u09 u09Var) {
        if (u09Var == null) {
            a(22);
            throw null;
        }
        hjd hjdVarN0 = hjd.N0(u09Var, tyd.a, 4, u09Var.e());
        List list = Collections.EMPTY_LIST;
        return hjdVarN0.I0(null, null, list, list, list, qz3.e(u09Var).h(u09Var.S()), e09.b, sz3.e);
    }

    public static nw7 L(ca1 ca1Var, tt7 tt7Var, h10 h10Var) {
        if (tt7Var == null) {
            return null;
        }
        return new nw7(ca1Var, new j85(ca1Var, tt7Var), h10Var);
    }

    public static zxa M(wxa wxaVar, h10 h10Var, boolean z2, ntd ntdVar) {
        if (h10Var == null) {
            a(18);
            throw null;
        }
        if (ntdVar != null) {
            return new zxa(wxaVar, h10Var, wxaVar.i(), wxaVar.getVisibility(), z2, false, false, 1, null, ntdVar);
        }
        a(19);
        throw null;
    }

    public static final cb9 N(Context context) {
        context.getClass();
        cb9 cb9Var = new cb9(context);
        ma9 ma9Var = cb9Var.b;
        gc9 gc9Var = ma9Var.s;
        gc9Var.a(new qe2(gc9Var));
        gc9 gc9Var2 = ma9Var.s;
        gc9Var2.a(new se2());
        gc9Var2.a(new q84());
        return cb9Var;
    }

    public static dya O(wxa wxaVar, h10 h10Var, h10 h10Var2, boolean z2, rz3 rz3Var, ntd ntdVar) {
        if (h10Var == null) {
            a(8);
            throw null;
        }
        if (h10Var2 == null) {
            a(9);
            throw null;
        }
        if (rz3Var == null) {
            a(10);
            throw null;
        }
        if (ntdVar == null) {
            a(11);
            throw null;
        }
        dya dyaVar = new dya(wxaVar, h10Var, wxaVar.i(), rz3Var, z2, false, false, 1, null, ntdVar);
        dyaVar.Y = dya.E0(dyaVar, wxaVar.getType(), h10Var2);
        return dyaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object P(User user, boolean z2, llf llfVar, ehf ehfVar, dne dneVar, zkf zkfVar, a26 a26Var, zn2 zn2Var) {
        rmf rmfVar;
        l26 l26Var;
        a26 a26Var2;
        x16 x16Var;
        Object dzbVar;
        Object dzbVar2;
        l26 l26Var2;
        a26 a26Var3;
        x16 x16Var2;
        if (zn2Var instanceof rmf) {
            rmfVar = (rmf) zn2Var;
            int i = rmfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rmfVar.label = i - Integer.MIN_VALUE;
            } else {
                rmfVar = new rmf(zn2Var);
            }
        } else {
            rmfVar = new rmf(zn2Var);
        }
        Object obj = rmfVar.result;
        int i2 = rmfVar.label;
        wef wefVar = wef.a;
        Object obj2 = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                rmfVar.L$0 = user;
                rmfVar.L$1 = null;
                rmfVar.L$2 = ehfVar;
                rmfVar.L$3 = dneVar;
                rmfVar.L$4 = zkfVar;
                rmfVar.L$5 = a26Var;
                rmfVar.Z$0 = z2;
                rmfVar.label = 1;
                if (llfVar.z(user, rmfVar) != obj2) {
                }
                x16Var = ehfVar;
                a26Var2 = dneVar;
                l26Var = zkfVar;
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                return wefVar;
            }
            z2 = rmfVar.Z$0;
            a26Var = (a26) rmfVar.L$5;
            l26Var2 = (l26) rmfVar.L$4;
            a26Var3 = (a26) rmfVar.L$3;
            x16Var2 = (x16) rmfVar.L$2;
            user = (User) rmfVar.L$0;
            jzb.q(obj);
            x16Var = x16Var2;
            a26Var2 = a26Var3;
            l26Var = l26Var2;
            a26Var2.d(user.getId());
            dzbVar2 = wefVar;
        } catch (Throwable th) {
            dzbVar2 = new dzb(th);
        }
        if (z2) {
            try {
                x16Var = x16Var2;
                a26Var2 = a26Var3;
                l26Var = l26Var2;
                dzbVar = x16Var.invoke();
            } catch (Throwable th2) {
                dzbVar = new dzb(th2);
            }
            Throwable thA = ezb.a(dzbVar);
            if (thA != null) {
                l26Var.z("Failed to initialize Firebase after sign-in", thA);
            }
        }
        Throwable thA2 = ezb.a(dzbVar2);
        if (thA2 != null) {
            l26Var.z("Failed to identify signed-in account for analytics", thA2);
        }
        rmfVar.L$0 = null;
        rmfVar.L$1 = null;
        rmfVar.L$2 = null;
        rmfVar.L$3 = null;
        rmfVar.L$4 = null;
        rmfVar.L$5 = null;
        rmfVar.Z$0 = z2;
        rmfVar.label = 2;
        if (a26Var.d(rmfVar) != obj2) {
            return wefVar;
        }
        x16Var = ehfVar;
        a26Var2 = dneVar;
        l26Var = zkfVar;
        return obj2;
    }

    public static final em7 Q(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return job.a.b(clsAnnotationType);
    }

    public static final Class R(em7 em7Var) {
        em7Var.getClass();
        Class clsD = ((y12) em7Var).d();
        clsD.getClass();
        return clsD;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class S(em7 em7Var) {
        em7Var.getClass();
        Class clsD = ((y12) em7Var).d();
        if (clsD.isPrimitive()) {
            String name = clsD.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsD;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class T(em7 em7Var) {
        em7Var.getClass();
        Class clsD = ((y12) em7Var).d();
        if (clsD.isPrimitive()) {
            return clsD;
        }
        String name = clsD.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final em7 U(Class cls) {
        cls.getClass();
        return job.a.b(cls);
    }

    public static Paint V(int i, float f2) {
        if (f2 <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    public static final awe W(if8 if8Var, Context context) {
        if8Var.getClass();
        Map map = y41.p;
        if (map == null) {
            pa7.g0("supportedLoginEntriesInitInitializers");
            throw null;
        }
        Class cls = (Class) map.get(if8Var);
        if (cls != null) {
            return (awe) ta0.v(context).n(cls);
        }
        return null;
    }

    public static final gx6 X() {
        gx6 gx6Var = Y;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = msf.a;
        dtd dtdVar = new dtd(y72.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new p1a(8.0f, 5.0f));
        arrayList.add(new b2a(14.0f));
        arrayList.add(new w1a(11.0f, -7.0f));
        arrayList.add(l1a.c);
        fx6.a(fx6Var, arrayList, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        Y = gx6VarB;
        return gx6VarB;
    }

    public static final boolean Y(nw9 nw9Var, dx5 dx5Var) {
        nw9Var.getClass();
        dx5Var.getClass();
        return nw9Var.a(dx5Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final void Z(hga hgaVar, z2f z2fVar, ute uteVar, rx6 rx6Var, yib yibVar, d60 d60Var, koe koeVar, b89 b89Var, rvf rvfVar, loe loeVar, zn2 zn2Var) {
        uv uvVar;
        if (zn2Var instanceof uv) {
            uvVar = (uv) zn2Var;
            int i = uvVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uvVar.label = i - Integer.MIN_VALUE;
            } else {
                uvVar = new uv(zn2Var);
            }
        } else {
            uvVar = new uv(zn2Var);
        }
        uv uvVar2 = uvVar;
        Object obj = uvVar2.result;
        int i2 = uvVar2.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                jzb.q(obj);
                oo3.f();
                return;
            }
        }
        jzb.q(obj);
        View view = ((iu) hgaVar).a;
        int i3 = 19;
        a90 oe2Var = Build.VERSION.SDK_INT >= 34 ? new oe2(i3, view) : new a90(i3, view);
        uvVar2.label = 1;
        a0(hgaVar, z2fVar, uteVar, rx6Var, yibVar, d60Var, koeVar, oe2Var, b89Var, rvfVar, loeVar, uvVar2);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "visibility";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[2] = "createSetter";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 23:
            case 25:
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final void a0(hga hgaVar, z2f z2fVar, ute uteVar, rx6 rx6Var, yib yibVar, a26 a26Var, x16 x16Var, a90 a90Var, b89 b89Var, rvf rvfVar, a26 a26Var2, zn2 zn2Var) {
        vv vvVar;
        if (zn2Var instanceof vv) {
            vvVar = (vv) zn2Var;
            int i = vvVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vvVar.label = i - Integer.MIN_VALUE;
            } else {
                vvVar = new vv(zn2Var);
            }
        } else {
            vvVar = new vv(zn2Var);
        }
        Object obj = vvVar.result;
        int i2 = vvVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            cw cwVar = new cw(b89Var, z2fVar, uteVar, a90Var, hgaVar, rx6Var, yibVar, a26Var, x16Var, rvfVar, a26Var2, null);
            vvVar.label = 1;
            if (jgb.O(cwVar, vvVar) == bw2.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            jzb.q(obj);
        }
        oo3.f();
    }

    public static final void b(x9 x9Var, String str, x16 x16Var, l46 l46Var, int i) {
        x9Var.getClass();
        x16Var.getClass();
        l46Var.h0(666847631);
        int i2 = (l46Var.i(x9Var) ? 4 : 2) | i | (l46Var.g(str) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 896;
            boolean z2 = ((i2 & 14) == 4 || l46Var.i(x9Var)) | (i4 == 256);
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = new u7(x9Var, x16Var, i3);
                l46Var.p0(objR);
            }
            k(str, (a26) objR, x16Var, l46Var, ((i2 >> 3) & 14) | i4);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new v7(x9Var, str, x16Var, i, 0);
        }
    }

    public static final dd2 b0(int i, m26 m26Var, l46 l46Var) {
        Object objR = l46Var.R();
        if (objR == sf2.a) {
            objR = new dd2(m26Var, true, i);
            l46Var.p0(objR);
        }
        dd2 dd2Var = (dd2) objR;
        if (!pa7.t(dd2Var.c, m26Var)) {
            boolean z2 = dd2Var.c == null;
            dd2Var.c = m26Var;
            if (!z2 && dd2Var.b) {
                ojb ojbVar = dd2Var.d;
                if (ojbVar != null) {
                    pjb pjbVar = ojbVar.a;
                    if (pjbVar != null) {
                        pjbVar.o(ojbVar, null);
                    }
                    dd2Var.d = null;
                }
                ArrayList arrayList = dd2Var.e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ojb ojbVar2 = (ojb) arrayList.get(i2);
                        pjb pjbVar2 = ojbVar2.a;
                        if (pjbVar2 != null) {
                            pjbVar2.o(ojbVar2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return dd2Var;
    }

    public static final void c(a26 a26Var, a26 a26Var2, x16 x16Var, l46 l46Var, int i) {
        a26Var.getClass();
        a26Var2.getClass();
        x16Var.getClass();
        l46Var.h0(1030262357);
        int i2 = (l46Var.i(a26Var) ? 4 : 2) | i | (l46Var.i(a26Var2) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            Class<gy0> cls = gy0.class;
            gy0 gy0Var = (gy0) z5c.G(job.a.b(gy0.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            jy0 jy0Var = (jy0) gy0Var.c.getValue();
            boolean z2 = jy0Var.b;
            use useVar = jy0Var.a;
            boolean zBooleanValue = ((Boolean) gy0Var.d.getValue()).booleanValue();
            boolean zI = l46Var.i(gy0Var);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zI || objR == obj) {
                objR = new hl(0, gy0Var, cls, "reBindPhone", "reBindPhone()V", 0, 8);
                l46Var.p0(objR);
            }
            x16 x16Var2 = (x16) ((ym7) objR);
            boolean zI2 = ((i2 & 112) == 32) | l46Var.i(gy0Var);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == obj) {
                objR2 = new l0(19, gy0Var, a26Var2);
                l46Var.p0(objR2);
            }
            a26 a26Var3 = (a26) objR2;
            boolean zI3 = l46Var.i(gy0Var) | ((i2 & 14) == 4);
            Object objR3 = l46Var.R();
            if (zI3 || objR3 == obj) {
                objR3 = new v6(24, gy0Var, a26Var);
                l46Var.p0(objR3);
            }
            d(z2, zBooleanValue, useVar, x16Var2, a26Var3, (x16) objR3, x16Var, l46Var, (i2 << 12) & 3670016);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(a26Var, a26Var2, x16Var, i);
        }
    }

    public static final p27 c0(String str, l46 l46Var, int i) {
        Object objR = l46Var.R();
        if (objR == sf2.a) {
            objR = new p27();
            l46Var.p0(objR);
        }
        p27 p27Var = (p27) objR;
        p27Var.a(0, l46Var);
        return p27Var;
    }

    public static final void d(boolean z2, boolean z3, use useVar, x16 x16Var, a26 a26Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i) {
        int i2;
        int i3;
        l46Var.h0(195859771);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (l46Var.h(z2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.g(useVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.i(x16Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var.i(x16Var3) ? 1048576 : 524288;
        }
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            int i5 = i2;
            ym8.j(g21.J(g09.a), afc.q(R.string.auth_login_bind_phone_title, l46Var), 0, false, x16Var3, b0(579880782, new sg(useVar, z3, x16Var2, i4), l46Var), l46Var, (3670016 & i2) | 12585984, 52);
            int i6 = (i5 & 896) ^ 384;
            boolean z4 = ((i6 > 256 && l46Var.g(useVar)) || (i5 & 384) == 256) | ((57344 & i5) == 16384);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z4 || objR == i8cVar) {
                i3 = 1;
                objR = new y7(a26Var, useVar, i3);
                l46Var.p0(objR);
            } else {
                i3 = 1;
            }
            x16 x16Var4 = (x16) objR;
            int i7 = (((i6 <= 256 || !l46Var.g(useVar)) && (i5 & 384) != 256) ? 0 : i3) | ((i5 & 7168) == 2048 ? i3 : 0);
            Object objR2 = l46Var.R();
            if (i7 != 0 || objR2 == i8cVar) {
                objR2 = new v6(25, useVar, x16Var);
                l46Var.p0(objR2);
            }
            tm7.l(i5 & 14, x16Var4, (x16) objR2, l46Var, z2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iy0(z2, z3, useVar, x16Var, a26Var, x16Var2, x16Var3, i);
        }
    }

    public static final LinkedHashMap d0(qh2 qh2Var) {
        Object objC;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (no0 no0Var : qh2Var.b()) {
            Object obj = no0Var.c;
            CaptureRequest.Key key = obj instanceof CaptureRequest.Key ? (CaptureRequest.Key) obj : null;
            if (key != null && (objC = qh2Var.c(no0Var)) != null) {
                linkedHashMap.put(key, objC);
            }
        }
        return linkedHashMap;
    }

    public static final void e(j09 j09Var, boolean z2, String str, fy9 fy9Var, a26 a26Var, l46 l46Var, int i) {
        j09 j09VarW;
        str.getClass();
        a26Var.getClass();
        l46Var.h0(79089632);
        int i2 = i | (l46Var.h(z2) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(fy9Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            j09 j09VarB = b.b(0.0f, 120.0f, j09Var, 1);
            g09 g09Var = g09.a;
            if (z2) {
                l46Var.f0(-1304264517);
                j09VarW = db6.w(g09Var, 2.0f, l8b.a(l46Var), a7c.b(20.0f));
                l46Var.r(false);
            } else {
                l46Var.f0(-1304261080);
                j09VarW = db6.w(g09Var, 0.5f, l8b.g(l46Var), a7c.b(20.0f));
                l46Var.r(false);
            }
            j09 j09VarD = j09VarB.D(j09VarW);
            rp1 rp1VarP = z5c.p(y72.b(l8b.g(l46Var), 0.48f), l8b.b(l46Var), l46Var, 24576, 12);
            y6c y6cVarB = a7c.b(20.0f);
            boolean z3 = ((57344 & i2) == 16384) | ((i2 & 112) == 32);
            Object objR = l46Var.R();
            if (z3 || objR == sf2.a) {
                objR = new oy1(i3, a26Var, z2);
                l46Var.p0(objR);
            }
            bzd.c((x16) objR, j09VarD, false, y6cVarB, rp1VarP, null, b0(2053237899, new py1(fy9Var, str, i3), l46Var), l46Var, 100663296);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l30(j09Var, z2, str, fy9Var, a26Var, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    public static final void f(j09 j09Var, boolean z2, String str, fy9 fy9Var, boolean z3, a26 a26Var, l46 l46Var, int i) {
        j09 j09Var2;
        l46 l46Var2;
        int i2;
        Object obj;
        ?? r0;
        l46 l46Var3;
        l46 l46Var4 = l46Var;
        str.getClass();
        a26Var.getClass();
        l46Var4.h0(253582435);
        int i3 = i | 6 | (l46Var4.h(z2) ? 32 : 16) | (l46Var4.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var4.i(fy9Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var4.h(z3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var4.i(a26Var) ? 131072 : 65536);
        if (l46Var4.W(i3 & 1, (74899 & i3) != 74898)) {
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var4, 0);
            int iHashCode = Long.hashCode(l46Var4.T);
            u8a u8aVarM = l46Var4.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var4, g09Var);
            lf2.q.getClass();
            l46Var4.j0();
            boolean z4 = l46Var4.S;
            x16 x16Var = LayoutNode.h1;
            if (z4) {
                l46Var4.l(x16Var);
            } else {
                l46Var4.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var4, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var4, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var4, numValueOf);
            dec.k(l46Var4);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var4, j09VarJ);
            j09 j09VarC = b.c(g09Var, 1.0f);
            int i4 = 458752 & i3;
            boolean z5 = (i4 == 131072) | ((i3 & 112) == 32);
            Object objR = l46Var4.R();
            if (z5 || objR == sf2.a) {
                i2 = 1;
                Object oy1Var = new oy1(i2, a26Var, z2);
                l46Var4.p0(oy1Var);
                obj = oy1Var;
            } else {
                i2 = 1;
                obj = objR;
            }
            boolean z6 = i2;
            j09 j09VarD = b.d(ynb.b0(24.0f, 0.0f, androidx.compose.foundation.b.c(j09VarC, false, null, null, (x16) obj, 15), 2), 72.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var4, 48);
            int iHashCode2 = Long.hashCode(l46Var4.T);
            u8a u8aVarM2 = l46Var4.m();
            j09 j09VarJ2 = m93.J(l46Var4, j09VarD);
            l46Var4.j0();
            if (l46Var4.S) {
                l46Var4.l(x16Var);
            } else {
                l46Var4.s0();
            }
            dec.l(he2Var, l46Var4, t7cVarA);
            dec.l(he2Var2, l46Var4, u8aVarM2);
            ib8.s(iHashCode2, l46Var4, he2Var3, l46Var4);
            dec.l(he2Var4, l46Var4, j09VarJ2);
            qk2.i(z2, null, false, 24.0f, null, a26Var, l46Var4, ((i3 >> 3) & 14) | 3072 | i4, 22);
            o5c.f(l46Var4, b.p(g09Var, 16.0f));
            if (fy9Var == null) {
                l46Var4.f0(-592890859);
                r0 = 0;
                l46Var4.r(false);
                l46Var3 = l46Var4;
            } else {
                l46Var4.f0(-592890858);
                feg.j(fy9Var, null, b.l(g09Var, 48.0f), null, null, 0.0f, null, l46Var, 440 | ((i3 >> 9) & 14), 120);
                l46 l46Var5 = l46Var;
                o5c.f(l46Var5, b.p(g09Var, 16.0f));
                r0 = 0;
                l46Var5.r(false);
                l46Var3 = l46Var5;
            }
            mue mueVar = pue.a;
            j09Var2 = g09Var;
            nte.b(str, null, ((e8b) l46Var3.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var3), l46Var3, (i3 >> 6) & 14, 0, 131066);
            l46Var3.r(z6);
            if (z3) {
                l46Var3.f0(798115661);
                jgb.p(null, l46Var3, r0, z6 ? 1 : 0);
                l46Var3.r(r0);
            } else {
                l46Var3.f0(798154101);
                l46Var3.r(r0);
            }
            l46Var3.r(z6);
            l46Var2 = l46Var3;
        } else {
            l46Var4.Z();
            j09Var2 = j09Var;
            l46Var2 = l46Var4;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p91(j09Var2, z2, str, fy9Var, z3, a26Var, i);
        }
    }

    public static final void g(Object obj, a26 a26Var, l46 l46Var) {
        boolean zG = l46Var.g(obj);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = new pa4(a26Var);
            l46Var.p0(objR);
        }
    }

    public static final void h(Object obj, Object obj2, a26 a26Var, l46 l46Var) {
        boolean zG = l46Var.g(obj) | l46Var.g(obj2);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = new pa4(a26Var);
            l46Var.p0(objR);
        }
    }

    public static final void i(Object obj, Object obj2, Object obj3, a26 a26Var, l46 l46Var) {
        boolean zG = l46Var.g(obj) | l46Var.g(obj2) | l46Var.g(obj3);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = new pa4(a26Var);
            l46Var.p0(objR);
        }
    }

    public static final void j(Object[] objArr, a26 a26Var, l46 l46Var) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zE = l46Var.e(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zE |= l46Var.g(obj);
        }
        Object objR = l46Var.R();
        if (zE || objR == sf2.a) {
            l46Var.p0(new pa4(a26Var));
        }
    }

    public static final void k(String str, a26 a26Var, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1159256924);
        if ((i & 6) == 0) {
            i2 = i | (l46Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        int i5 = 1;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            xdc.a(b.c, b0(1702330216, new m(i5, x16Var), l46Var), null, null, null, 0, 0L, 0L, null, b0(1150940851, new w7(i4, n3d.o(str == null ? "" : str, l46Var, 2), a26Var), l46Var), l46Var, 805306422, 508);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x7(str, a26Var, x16Var, i, 0);
        }
    }

    public static final void l(final boolean z2, final x16 x16Var, final n26 n26Var, l46 l46Var, final int i) {
        x16Var.getClass();
        n26Var.getClass();
        l46Var.h0(-2062868574);
        int i2 = 2;
        int i3 = i | (l46Var.h(z2) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(n26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (!l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            l46Var.Z();
        } else {
            if (!z2) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i4 = 0;
                    ojbVarV.d = new l26(z2, x16Var, n26Var, i, i4) { // from class: pb5
                        public final /* synthetic */ int a;
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ x16 c;
                        public final /* synthetic */ n26 d;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i5 = this.a;
                            wef wefVar = wef.a;
                            n26 n26Var2 = this.d;
                            x16 x16Var2 = this.c;
                            boolean z3 = this.b;
                            l46 l46Var2 = (l46) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    af1.l(z3, x16Var2, n26Var2, l46Var2, k99.P(1));
                                    break;
                                default:
                                    af1.l(z3, x16Var2, n26Var2, l46Var2, k99.P(1));
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = kv2.f(0, l46Var);
            }
            s69 s69Var = (s69) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = zrd.b(new q50(s69Var, 5));
                l46Var.p0(objR3);
            }
            h0e h0eVar = (h0e) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == obj) {
                objR4 = zrd.b(new q50(s69Var, 6));
                l46Var.p0(objR4);
            }
            h0e h0eVar2 = (h0e) objR4;
            Object objR5 = l46Var.R();
            if (objR5 == obj) {
                objR5 = new jsd();
                l46Var.p0(objR5);
            }
            jsd jsdVar = (jsd) objR5;
            List list = (List) h0eVar.getValue();
            Object objR6 = l46Var.R();
            if (objR6 == obj) {
                objR6 = new sb5(jsdVar, null);
                l46Var.p0(objR6);
            }
            o((l26) objR6, l46Var, list);
            use useVarO = n3d.o(null, l46Var, 3);
            Object objR7 = l46Var.R();
            if (objR7 == obj) {
                objR7 = zrd.b(new uo2(18, jsdVar));
                l46Var.p0(objR7);
            }
            h0e h0eVar3 = (h0e) objR7;
            boolean zG = l46Var.g(useVarO.d().c) | l46Var.e(((sz9) s69Var).j());
            Object objR8 = l46Var.R();
            if (zG || objR8 == obj) {
                objR8 = zrd.b(new n25(jsdVar, useVarO, s69Var, i2));
                l46Var.p0(objR8);
            }
            h0e h0eVar4 = (h0e) objR8;
            Boolean bool = (Boolean) h0eVar3.getValue();
            bool.getClass();
            boolean zG2 = l46Var.g(useVarO);
            Object objR9 = l46Var.R();
            if (zG2 || objR9 == obj) {
                objR9 = new tb5(useVarO, null);
                l46Var.p0(objR9);
            }
            o((l26) objR9, l46Var, bool);
            t72.b(x16Var, null, b0(1712474937, new qb5(x16Var, n26Var, useVarO, s69Var, h0eVar2, h0eVar, jsdVar, aw2Var, h0eVar3, h0eVar4), l46Var), l46Var, ((i3 >> 3) & 14) | 384, 2);
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            final int i5 = 1;
            ojbVarV2.d = new l26(z2, x16Var, n26Var, i, i5) { // from class: pb5
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ x16 c;
                public final /* synthetic */ n26 d;

                {
                    this.a = i5;
                }

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    int i6 = this.a;
                    wef wefVar = wef.a;
                    n26 n26Var2 = this.d;
                    x16 x16Var2 = this.c;
                    boolean z3 = this.b;
                    l46 l46Var2 = (l46) obj2;
                    ((Integer) obj3).getClass();
                    switch (i6) {
                        case 0:
                            af1.l(z3, x16Var2, n26Var2, l46Var2, k99.P(1));
                            break;
                        default:
                            af1.l(z3, x16Var2, n26Var2, l46Var2, k99.P(1));
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    public static final void m(mic micVar, j09 j09Var, x4d x4dVar, long j, q11 q11Var, l46 l46Var, int i, int i2) {
        int i3;
        x4d x4dVarB;
        long j2;
        q11 q11VarB;
        j09 j09Var2;
        q11 q11Var2;
        j09 j09Var3;
        int i4;
        int i5;
        l46Var.h0(-1100306005);
        if ((i & 6) == 0) {
            i3 = (l46Var.e(micVar.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                x4dVarB = x4dVar;
                if (l46Var.g(x4dVarB)) {
                    i5 = 256;
                }
                i6 |= i5;
            } else {
                x4dVarB = x4dVar;
            }
            i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            i6 |= i5;
        } else {
            x4dVarB = x4dVar;
        }
        if ((i & 3072) == 0) {
            j2 = j;
            i6 |= l46Var.f(j2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            j2 = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                q11VarB = q11Var;
                if (l46Var.g(q11VarB)) {
                    i4 = 16384;
                }
                i6 |= i4;
            } else {
                q11VarB = q11Var;
            }
            i4 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i6 |= i4;
        } else {
            q11VarB = q11Var;
        }
        if (l46Var.W(i6 & 1, (i6 & 9363) != 9362)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                if ((i2 & 4) != 0) {
                    x4dVarB = a7c.b(20.0f);
                    i6 &= -897;
                }
                int i7 = i2 & 16;
                g09 g09Var = g09.a;
                if (i7 != 0) {
                    q11VarB = x57.b(bx5.f(l46Var), 1.0f);
                    i6 &= -57345;
                }
                j09Var3 = g09Var;
            } else {
                l46Var.Z();
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                }
                if ((i2 & 16) != 0) {
                    i6 &= -57345;
                }
                j09Var3 = j09Var;
            }
            q11 q11Var3 = q11VarB;
            l46Var.s();
            os5 os5VarW = if9.w(micVar);
            j09 j09VarC = b.c(j09Var3, 1.0f);
            dd2 dd2VarB0 = b0(-907273530, new i1(25, os5VarW), l46Var);
            int i8 = i6 >> 3;
            nae.a(j09VarC, x4dVarB, j2, 0L, 0.0f, 0.0f, q11Var3, dd2VarB0, l46Var, (i8 & 896) | (i8 & 112) | 12582912 | ((i6 << 6) & 3670016), 56);
            q11Var2 = q11Var3;
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            q11Var2 = q11VarB;
        }
        x4d x4dVar2 = x4dVarB;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t11(micVar, j09Var2, x4dVar2, j, q11Var2, i, i2);
        }
    }

    public static final void n(gj6 gj6Var, wp9 wp9Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        gj6 gj6Var2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(647745105);
        int i2 = i | 2 | (l46Var.g(wp9Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                pwf pwfVarA = qd8.a(l46Var);
                if (pwfVarA == null) {
                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                gj6Var = (gj6) z5c.G(job.a.b(gj6.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            } else {
                l46Var.Z();
            }
            l46Var.s();
            e89 e89VarT = tm7.t(gj6Var.f, l46Var);
            boolean z2 = !((Set) e89VarT.getValue()).isEmpty();
            x48 x48Var = (x48) l46Var.k(cb8.a);
            boolean zI = l46Var.i(gj6Var) | l46Var.i(x48Var);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new so5(8, x48Var, gj6Var);
                l46Var.p0(objR);
            }
            h(x48Var, gj6Var, (a26) objR, l46Var);
            gj6 gj6Var3 = gj6Var;
            lmg.J(b.c, b0(1599056378, new jt(x16Var2, wp9Var, z2, gj6Var3, x16Var, e89VarT), l46Var), l46Var, 54);
            gj6Var2 = gj6Var3;
        } else {
            l46Var.Z();
            gj6Var2 = gj6Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(gj6Var2, wp9Var, x16Var, x16Var2, i, 22);
        }
    }

    public static final void o(l26 l26Var, l46 l46Var, Object obj) {
        pv2 pv2Var = l46Var.R;
        boolean zG = l46Var.g(obj);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = new su7(pv2Var, l26Var);
            l46Var.p0(objR);
        }
    }

    public static final void p(Object obj, Object obj2, l26 l26Var, l46 l46Var) {
        pv2 pv2Var = l46Var.R;
        boolean zG = l46Var.g(obj) | l46Var.g(obj2);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = new su7(pv2Var, l26Var);
            l46Var.p0(objR);
        }
    }

    public static final void q(Object obj, Object obj2, Object obj3, l26 l26Var, l46 l46Var) {
        pv2 pv2Var = l46Var.R;
        boolean zG = l46Var.g(obj) | l46Var.g(obj2) | l46Var.g(obj3);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = new su7(pv2Var, l26Var);
            l46Var.p0(objR);
        }
    }

    public static final void r(Object[] objArr, l26 l26Var, l46 l46Var) {
        pv2 pv2Var = l46Var.R;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zE = l46Var.e(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zE |= l46Var.g(obj);
        }
        Object objR = l46Var.R();
        if (zE || objR == sf2.a) {
            l46Var.p0(new su7(pv2Var, l26Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0111  */
    /* JADX WARN: Code duplicated, block: B:102:0x0114  */
    /* JADX WARN: Code duplicated, block: B:105:0x011d  */
    /* JADX WARN: Code duplicated, block: B:107:0x012d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0158  */
    /* JADX WARN: Code duplicated, block: B:123:0x015b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0160  */
    /* JADX WARN: Code duplicated, block: B:128:0x016b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0176  */
    /* JADX WARN: Code duplicated, block: B:133:0x017d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0184  */
    /* JADX WARN: Code duplicated, block: B:138:0x0192  */
    /* JADX WARN: Code duplicated, block: B:140:0x0196  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:149:0x0202  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00df  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:97:0x0101  */
    public static final void s(j09 j09Var, j18 j18Var, xw9 xw9Var, wc0 wc0Var, xi xiVar, gj5 gj5Var, boolean z2, lu9 lu9Var, a26 a26Var, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        j18 j18VarA;
        xw9 bx9Var;
        int i4;
        wc0 wc0Var2;
        int i5;
        xi xiVar2;
        int i6;
        gj5 gj5Var2;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        j09 j09Var3;
        j18 j18Var2;
        xw9 xw9Var2;
        wc0 wc0Var3;
        xi xiVar3;
        gj5 gj5Var3;
        boolean z5;
        lu9 lu9Var2;
        ojb ojbVarV;
        j09 j09Var4;
        int i9;
        lu9 lu9VarB;
        ph3 ph3VarA;
        boolean zG;
        Object objR;
        int i10;
        int i11;
        l46Var.h0(53695811);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i3 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j18VarA = j18Var;
                int i13 = l46Var.g(j18VarA) ? 32 : 16;
                i3 |= i13;
            } else {
                j18VarA = j18Var;
            }
            i3 |= i13;
        } else {
            j18VarA = j18Var;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 384) == 0) {
                bx9Var = xw9Var;
                i3 |= l46Var.g(bx9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (l46Var.h(false)) {
                    i4 = 2048;
                } else {
                    i4 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i4;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    wc0Var2 = wc0Var;
                    if (l46Var.g(wc0Var2)) {
                        i11 = 16384;
                    }
                    i3 |= i11;
                } else {
                    wc0Var2 = wc0Var;
                }
                i11 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i3 |= i11;
            } else {
                wc0Var2 = wc0Var;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    xiVar2 = xiVar;
                    if (l46Var.g(xiVar2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        gj5Var2 = gj5Var;
                        int i15 = l46Var.g(gj5Var2) ? 1048576 : 524288;
                        i3 |= i15;
                    } else {
                        gj5Var2 = gj5Var;
                    }
                    i3 |= i15;
                } else {
                    gj5Var2 = gj5Var;
                }
                i7 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i7 != 0) {
                    if ((12582912 & i) == 0) {
                        z3 = z2;
                        if (l46Var.h(z3)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        if (l46Var.i(a26Var)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i3 |= i10;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (l46Var.W(i3 & 1, z4)) {
                        l46Var.b0();
                        if ((i & 1) != 0 || l46Var.C()) {
                            if (i12 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                j18VarA = k18.a(0, 3, l46Var);
                            }
                            if (i14 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                wc0Var2 = xc0.c;
                            }
                            if (i5 != 0) {
                                xiVar2 = ndb.Y;
                            }
                            if ((i2 & 64) != 0) {
                                ph3VarA = yud.a(l46Var);
                                zG = l46Var.g(ph3VarA);
                                objR = l46Var.R();
                                if (zG || objR == sf2.a) {
                                    objR = new uq3(ph3VarA);
                                    l46Var.p0(objR);
                                }
                                i3 &= -3670017;
                                gj5Var2 = (uq3) objR;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            i9 = (-234881025) & i3;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            l46Var.Z();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            j09 j09Var5 = j09Var2;
                            i9 = i3 & (-234881025);
                            j09Var4 = j09Var5;
                            lu9VarB = lu9Var;
                        }
                        j18 j18Var3 = j18VarA;
                        xw9 xw9Var3 = bx9Var;
                        xi xiVar4 = xiVar2;
                        gj5 gj5Var4 = gj5Var2;
                        boolean z6 = z3;
                        l46Var.s();
                        int i16 = i9 >> 3;
                        tm7.g(j09Var4, j18Var3, xw9Var3, true, gj5Var4, z6, lu9VarB, xiVar4, wc0Var2, null, null, a26Var, l46Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (458752 & i16) | (i16 & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                        lu9 lu9Var3 = lu9VarB;
                        gj5Var3 = gj5Var4;
                        wc0Var3 = wc0Var2;
                        lu9Var2 = lu9Var3;
                        z5 = z6;
                        xiVar3 = xiVar4;
                        xw9Var2 = xw9Var3;
                        j18Var2 = j18Var3;
                        j09Var3 = j09Var4;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        j18Var2 = j18VarA;
                        xw9Var2 = bx9Var;
                        wc0Var3 = wc0Var2;
                        xiVar3 = xiVar2;
                        gj5Var3 = gj5Var2;
                        z5 = z3;
                        lu9Var2 = lu9Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, wc0Var3, xiVar3, gj5Var3, z5, lu9Var2, a26Var, i, i2, 3);
                    }
                }
                i3 |= 12582912;
                z3 = z2;
                if ((i & 100663296) == 0) {
                    i3 |= 33554432;
                }
                if ((i & 805306368) == 0) {
                    if (l46Var.i(a26Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i3 |= i10;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i3 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            j18VarA = k18.a(0, 3, l46Var);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            wc0Var2 = xc0.c;
                        }
                        if (i5 != 0) {
                            xiVar2 = ndb.Y;
                        }
                        if ((i2 & 64) != 0) {
                            ph3VarA = yud.a(l46Var);
                            zG = l46Var.g(ph3VarA);
                            objR = l46Var.R();
                            if (zG) {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            } else {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            }
                            i3 &= -3670017;
                            gj5Var2 = (uq3) objR;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        i9 = (-234881025) & i3;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i12 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            j18VarA = k18.a(0, 3, l46Var);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            wc0Var2 = xc0.c;
                        }
                        if (i5 != 0) {
                            xiVar2 = ndb.Y;
                        }
                        if ((i2 & 64) != 0) {
                            ph3VarA = yud.a(l46Var);
                            zG = l46Var.g(ph3VarA);
                            objR = l46Var.R();
                            if (zG) {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            } else {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            }
                            i3 &= -3670017;
                            gj5Var2 = (uq3) objR;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        i9 = (-234881025) & i3;
                        lu9VarB = mu9.b(l46Var);
                    }
                    j18 j18Var4 = j18VarA;
                    xw9 xw9Var4 = bx9Var;
                    xi xiVar5 = xiVar2;
                    gj5 gj5Var5 = gj5Var2;
                    boolean z7 = z3;
                    l46Var.s();
                    int i17 = i9 >> 3;
                    tm7.g(j09Var4, j18Var4, xw9Var4, true, gj5Var5, z7, lu9VarB, xiVar5, wc0Var2, null, null, a26Var, l46Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (458752 & i17) | (i17 & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                    lu9 lu9Var4 = lu9VarB;
                    gj5Var3 = gj5Var5;
                    wc0Var3 = wc0Var2;
                    lu9Var2 = lu9Var4;
                    z5 = z7;
                    xiVar3 = xiVar5;
                    xw9Var2 = xw9Var4;
                    j18Var2 = j18Var4;
                    j09Var3 = j09Var4;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    j18Var2 = j18VarA;
                    xw9Var2 = bx9Var;
                    wc0Var3 = wc0Var2;
                    xiVar3 = xiVar2;
                    gj5Var3 = gj5Var2;
                    z5 = z3;
                    lu9Var2 = lu9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, wc0Var3, xiVar3, gj5Var3, z5, lu9Var2, a26Var, i, i2, 3);
                }
            }
            i3 |= 196608;
            xiVar2 = xiVar;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    gj5Var2 = gj5Var;
                    if (l46Var.g(gj5Var2)) {
                    }
                    i3 |= i15;
                } else {
                    gj5Var2 = gj5Var;
                }
                i3 |= i15;
            } else {
                gj5Var2 = gj5Var;
            }
            i7 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    z3 = z2;
                    if (l46Var.h(z3)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i & 100663296) == 0) {
                    i3 |= 33554432;
                }
                if ((i & 805306368) == 0) {
                    if (l46Var.i(a26Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i3 |= i10;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i3 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            j18VarA = k18.a(0, 3, l46Var);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            wc0Var2 = xc0.c;
                        }
                        if (i5 != 0) {
                            xiVar2 = ndb.Y;
                        }
                        if ((i2 & 64) != 0) {
                            ph3VarA = yud.a(l46Var);
                            zG = l46Var.g(ph3VarA);
                            objR = l46Var.R();
                            if (zG) {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            } else {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            }
                            i3 &= -3670017;
                            gj5Var2 = (uq3) objR;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        i9 = (-234881025) & i3;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i12 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            j18VarA = k18.a(0, 3, l46Var);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            wc0Var2 = xc0.c;
                        }
                        if (i5 != 0) {
                            xiVar2 = ndb.Y;
                        }
                        if ((i2 & 64) != 0) {
                            ph3VarA = yud.a(l46Var);
                            zG = l46Var.g(ph3VarA);
                            objR = l46Var.R();
                            if (zG) {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            } else {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            }
                            i3 &= -3670017;
                            gj5Var2 = (uq3) objR;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        i9 = (-234881025) & i3;
                        lu9VarB = mu9.b(l46Var);
                    }
                    j18 j18Var5 = j18VarA;
                    xw9 xw9Var5 = bx9Var;
                    xi xiVar6 = xiVar2;
                    gj5 gj5Var6 = gj5Var2;
                    boolean z8 = z3;
                    l46Var.s();
                    int i18 = i9 >> 3;
                    tm7.g(j09Var4, j18Var5, xw9Var5, true, gj5Var6, z8, lu9VarB, xiVar6, wc0Var2, null, null, a26Var, l46Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (458752 & i18) | (i18 & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                    lu9 lu9Var5 = lu9VarB;
                    gj5Var3 = gj5Var6;
                    wc0Var3 = wc0Var2;
                    lu9Var2 = lu9Var5;
                    z5 = z8;
                    xiVar3 = xiVar6;
                    xw9Var2 = xw9Var5;
                    j18Var2 = j18Var5;
                    j09Var3 = j09Var4;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    j18Var2 = j18VarA;
                    xw9Var2 = bx9Var;
                    wc0Var3 = wc0Var2;
                    xiVar3 = xiVar2;
                    gj5Var3 = gj5Var2;
                    z5 = z3;
                    lu9Var2 = lu9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, wc0Var3, xiVar3, gj5Var3, z5, lu9Var2, a26Var, i, i2, 3);
                }
            }
            i3 |= 12582912;
            z3 = z2;
            if ((i & 100663296) == 0) {
                i3 |= 33554432;
            }
            if ((i & 805306368) == 0) {
                if (l46Var.i(a26Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i3 |= i10;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i3 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        j18VarA = k18.a(0, 3, l46Var);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        wc0Var2 = xc0.c;
                    }
                    if (i5 != 0) {
                        xiVar2 = ndb.Y;
                    }
                    if ((i2 & 64) != 0) {
                        ph3VarA = yud.a(l46Var);
                        zG = l46Var.g(ph3VarA);
                        objR = l46Var.R();
                        if (zG) {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        } else {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        }
                        i3 &= -3670017;
                        gj5Var2 = (uq3) objR;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    i9 = (-234881025) & i3;
                    lu9VarB = mu9.b(l46Var);
                } else {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        j18VarA = k18.a(0, 3, l46Var);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        wc0Var2 = xc0.c;
                    }
                    if (i5 != 0) {
                        xiVar2 = ndb.Y;
                    }
                    if ((i2 & 64) != 0) {
                        ph3VarA = yud.a(l46Var);
                        zG = l46Var.g(ph3VarA);
                        objR = l46Var.R();
                        if (zG) {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        } else {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        }
                        i3 &= -3670017;
                        gj5Var2 = (uq3) objR;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    i9 = (-234881025) & i3;
                    lu9VarB = mu9.b(l46Var);
                }
                j18 j18Var6 = j18VarA;
                xw9 xw9Var6 = bx9Var;
                xi xiVar7 = xiVar2;
                gj5 gj5Var7 = gj5Var2;
                boolean z9 = z3;
                l46Var.s();
                int i19 = i9 >> 3;
                tm7.g(j09Var4, j18Var6, xw9Var6, true, gj5Var7, z9, lu9VarB, xiVar7, wc0Var2, null, null, a26Var, l46Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (458752 & i19) | (i19 & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                lu9 lu9Var6 = lu9VarB;
                gj5Var3 = gj5Var7;
                wc0Var3 = wc0Var2;
                lu9Var2 = lu9Var6;
                z5 = z9;
                xiVar3 = xiVar7;
                xw9Var2 = xw9Var6;
                j18Var2 = j18Var6;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                j18Var2 = j18VarA;
                xw9Var2 = bx9Var;
                wc0Var3 = wc0Var2;
                xiVar3 = xiVar2;
                gj5Var3 = gj5Var2;
                z5 = z3;
                lu9Var2 = lu9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, wc0Var3, xiVar3, gj5Var3, z5, lu9Var2, a26Var, i, i2, 3);
            }
        }
        i3 |= 384;
        bx9Var = xw9Var;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (l46Var.h(false)) {
                i4 = 2048;
            } else {
                i4 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i3 |= i4;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                wc0Var2 = wc0Var;
                if (l46Var.g(wc0Var2)) {
                    i11 = 16384;
                }
                i3 |= i11;
            } else {
                wc0Var2 = wc0Var;
            }
            i11 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i3 |= i11;
        } else {
            wc0Var2 = wc0Var;
        }
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                xiVar2 = xiVar;
                if (l46Var.g(xiVar2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    gj5Var2 = gj5Var;
                    if (l46Var.g(gj5Var2)) {
                    }
                    i3 |= i15;
                } else {
                    gj5Var2 = gj5Var;
                }
                i3 |= i15;
            } else {
                gj5Var2 = gj5Var;
            }
            i7 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    z3 = z2;
                    if (l46Var.h(z3)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i & 100663296) == 0) {
                    i3 |= 33554432;
                }
                if ((i & 805306368) == 0) {
                    if (l46Var.i(a26Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i3 |= i10;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i3 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            j18VarA = k18.a(0, 3, l46Var);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            wc0Var2 = xc0.c;
                        }
                        if (i5 != 0) {
                            xiVar2 = ndb.Y;
                        }
                        if ((i2 & 64) != 0) {
                            ph3VarA = yud.a(l46Var);
                            zG = l46Var.g(ph3VarA);
                            objR = l46Var.R();
                            if (zG) {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            } else {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            }
                            i3 &= -3670017;
                            gj5Var2 = (uq3) objR;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        i9 = (-234881025) & i3;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i12 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            j18VarA = k18.a(0, 3, l46Var);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            wc0Var2 = xc0.c;
                        }
                        if (i5 != 0) {
                            xiVar2 = ndb.Y;
                        }
                        if ((i2 & 64) != 0) {
                            ph3VarA = yud.a(l46Var);
                            zG = l46Var.g(ph3VarA);
                            objR = l46Var.R();
                            if (zG) {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            } else {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            }
                            i3 &= -3670017;
                            gj5Var2 = (uq3) objR;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        i9 = (-234881025) & i3;
                        lu9VarB = mu9.b(l46Var);
                    }
                    j18 j18Var7 = j18VarA;
                    xw9 xw9Var7 = bx9Var;
                    xi xiVar8 = xiVar2;
                    gj5 gj5Var8 = gj5Var2;
                    boolean z10 = z3;
                    l46Var.s();
                    int i110 = i9 >> 3;
                    tm7.g(j09Var4, j18Var7, xw9Var7, true, gj5Var8, z10, lu9VarB, xiVar8, wc0Var2, null, null, a26Var, l46Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (458752 & i110) | (i110 & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                    lu9 lu9Var7 = lu9VarB;
                    gj5Var3 = gj5Var8;
                    wc0Var3 = wc0Var2;
                    lu9Var2 = lu9Var7;
                    z5 = z10;
                    xiVar3 = xiVar8;
                    xw9Var2 = xw9Var7;
                    j18Var2 = j18Var7;
                    j09Var3 = j09Var4;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    j18Var2 = j18VarA;
                    xw9Var2 = bx9Var;
                    wc0Var3 = wc0Var2;
                    xiVar3 = xiVar2;
                    gj5Var3 = gj5Var2;
                    z5 = z3;
                    lu9Var2 = lu9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, wc0Var3, xiVar3, gj5Var3, z5, lu9Var2, a26Var, i, i2, 3);
                }
            }
            i3 |= 12582912;
            z3 = z2;
            if ((i & 100663296) == 0) {
                i3 |= 33554432;
            }
            if ((i & 805306368) == 0) {
                if (l46Var.i(a26Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i3 |= i10;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i3 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        j18VarA = k18.a(0, 3, l46Var);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        wc0Var2 = xc0.c;
                    }
                    if (i5 != 0) {
                        xiVar2 = ndb.Y;
                    }
                    if ((i2 & 64) != 0) {
                        ph3VarA = yud.a(l46Var);
                        zG = l46Var.g(ph3VarA);
                        objR = l46Var.R();
                        if (zG) {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        } else {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        }
                        i3 &= -3670017;
                        gj5Var2 = (uq3) objR;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    i9 = (-234881025) & i3;
                    lu9VarB = mu9.b(l46Var);
                } else {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        j18VarA = k18.a(0, 3, l46Var);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        wc0Var2 = xc0.c;
                    }
                    if (i5 != 0) {
                        xiVar2 = ndb.Y;
                    }
                    if ((i2 & 64) != 0) {
                        ph3VarA = yud.a(l46Var);
                        zG = l46Var.g(ph3VarA);
                        objR = l46Var.R();
                        if (zG) {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        } else {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        }
                        i3 &= -3670017;
                        gj5Var2 = (uq3) objR;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    i9 = (-234881025) & i3;
                    lu9VarB = mu9.b(l46Var);
                }
                j18 j18Var8 = j18VarA;
                xw9 xw9Var8 = bx9Var;
                xi xiVar9 = xiVar2;
                gj5 gj5Var9 = gj5Var2;
                boolean z11 = z3;
                l46Var.s();
                int i111 = i9 >> 3;
                tm7.g(j09Var4, j18Var8, xw9Var8, true, gj5Var9, z11, lu9VarB, xiVar9, wc0Var2, null, null, a26Var, l46Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (458752 & i111) | (i111 & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                lu9 lu9Var8 = lu9VarB;
                gj5Var3 = gj5Var9;
                wc0Var3 = wc0Var2;
                lu9Var2 = lu9Var8;
                z5 = z11;
                xiVar3 = xiVar9;
                xw9Var2 = xw9Var8;
                j18Var2 = j18Var8;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                j18Var2 = j18VarA;
                xw9Var2 = bx9Var;
                wc0Var3 = wc0Var2;
                xiVar3 = xiVar2;
                gj5Var3 = gj5Var2;
                z5 = z3;
                lu9Var2 = lu9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, wc0Var3, xiVar3, gj5Var3, z5, lu9Var2, a26Var, i, i2, 3);
            }
        }
        i3 |= 196608;
        xiVar2 = xiVar;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                gj5Var2 = gj5Var;
                if (l46Var.g(gj5Var2)) {
                }
                i3 |= i15;
            } else {
                gj5Var2 = gj5Var;
            }
            i3 |= i15;
        } else {
            gj5Var2 = gj5Var;
        }
        i7 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i7 != 0) {
            if ((12582912 & i) == 0) {
                z3 = z2;
                if (l46Var.h(z3)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((i & 100663296) == 0) {
                i3 |= 33554432;
            }
            if ((i & 805306368) == 0) {
                if (l46Var.i(a26Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i3 |= i10;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i3 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        j18VarA = k18.a(0, 3, l46Var);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        wc0Var2 = xc0.c;
                    }
                    if (i5 != 0) {
                        xiVar2 = ndb.Y;
                    }
                    if ((i2 & 64) != 0) {
                        ph3VarA = yud.a(l46Var);
                        zG = l46Var.g(ph3VarA);
                        objR = l46Var.R();
                        if (zG) {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        } else {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        }
                        i3 &= -3670017;
                        gj5Var2 = (uq3) objR;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    i9 = (-234881025) & i3;
                    lu9VarB = mu9.b(l46Var);
                } else {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        j18VarA = k18.a(0, 3, l46Var);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        wc0Var2 = xc0.c;
                    }
                    if (i5 != 0) {
                        xiVar2 = ndb.Y;
                    }
                    if ((i2 & 64) != 0) {
                        ph3VarA = yud.a(l46Var);
                        zG = l46Var.g(ph3VarA);
                        objR = l46Var.R();
                        if (zG) {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        } else {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        }
                        i3 &= -3670017;
                        gj5Var2 = (uq3) objR;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    i9 = (-234881025) & i3;
                    lu9VarB = mu9.b(l46Var);
                }
                j18 j18Var9 = j18VarA;
                xw9 xw9Var9 = bx9Var;
                xi xiVar10 = xiVar2;
                gj5 gj5Var10 = gj5Var2;
                boolean z12 = z3;
                l46Var.s();
                int i112 = i9 >> 3;
                tm7.g(j09Var4, j18Var9, xw9Var9, true, gj5Var10, z12, lu9VarB, xiVar10, wc0Var2, null, null, a26Var, l46Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (458752 & i112) | (i112 & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                lu9 lu9Var9 = lu9VarB;
                gj5Var3 = gj5Var10;
                wc0Var3 = wc0Var2;
                lu9Var2 = lu9Var9;
                z5 = z12;
                xiVar3 = xiVar10;
                xw9Var2 = xw9Var9;
                j18Var2 = j18Var9;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                j18Var2 = j18VarA;
                xw9Var2 = bx9Var;
                wc0Var3 = wc0Var2;
                xiVar3 = xiVar2;
                gj5Var3 = gj5Var2;
                z5 = z3;
                lu9Var2 = lu9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, wc0Var3, xiVar3, gj5Var3, z5, lu9Var2, a26Var, i, i2, 3);
            }
        }
        i3 |= 12582912;
        z3 = z2;
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            if (l46Var.i(a26Var)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i3 |= i10;
        }
        if ((i3 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var.W(i3 & 1, z4)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    j18VarA = k18.a(0, 3, l46Var);
                }
                if (i14 != 0) {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    wc0Var2 = xc0.c;
                }
                if (i5 != 0) {
                    xiVar2 = ndb.Y;
                }
                if ((i2 & 64) != 0) {
                    ph3VarA = yud.a(l46Var);
                    zG = l46Var.g(ph3VarA);
                    objR = l46Var.R();
                    if (zG) {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    } else {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    }
                    i3 &= -3670017;
                    gj5Var2 = (uq3) objR;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                i9 = (-234881025) & i3;
                lu9VarB = mu9.b(l46Var);
            } else {
                if (i12 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    j18VarA = k18.a(0, 3, l46Var);
                }
                if (i14 != 0) {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    wc0Var2 = xc0.c;
                }
                if (i5 != 0) {
                    xiVar2 = ndb.Y;
                }
                if ((i2 & 64) != 0) {
                    ph3VarA = yud.a(l46Var);
                    zG = l46Var.g(ph3VarA);
                    objR = l46Var.R();
                    if (zG) {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    } else {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    }
                    i3 &= -3670017;
                    gj5Var2 = (uq3) objR;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                i9 = (-234881025) & i3;
                lu9VarB = mu9.b(l46Var);
            }
            j18 j18Var10 = j18VarA;
            xw9 xw9Var10 = bx9Var;
            xi xiVar11 = xiVar2;
            gj5 gj5Var11 = gj5Var2;
            boolean z13 = z3;
            l46Var.s();
            int i113 = i9 >> 3;
            tm7.g(j09Var4, j18Var10, xw9Var10, true, gj5Var11, z13, lu9VarB, xiVar11, wc0Var2, null, null, a26Var, l46Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (458752 & i113) | (i113 & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
            lu9 lu9Var10 = lu9VarB;
            gj5Var3 = gj5Var11;
            wc0Var3 = wc0Var2;
            lu9Var2 = lu9Var10;
            z5 = z13;
            xiVar3 = xiVar11;
            xw9Var2 = xw9Var10;
            j18Var2 = j18Var10;
            j09Var3 = j09Var4;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            j18Var2 = j18VarA;
            xw9Var2 = bx9Var;
            wc0Var3 = wc0Var2;
            xiVar3 = xiVar2;
            gj5Var3 = gj5Var2;
            z5 = z3;
            lu9Var2 = lu9Var;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, wc0Var3, xiVar3, gj5Var3, z5, lu9Var2, a26Var, i, i2, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0142  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x0152  */
    /* JADX WARN: Code duplicated, block: B:120:0x015d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0176  */
    /* JADX WARN: Code duplicated, block: B:127:0x017a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0188  */
    /* JADX WARN: Code duplicated, block: B:131:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x0112  */
    public static final void t(j09 j09Var, j18 j18Var, xw9 xw9Var, tc0 tc0Var, kx0 kx0Var, gj5 gj5Var, boolean z2, lu9 lu9Var, a26 a26Var, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        j18 j18VarA;
        xw9 bx9Var;
        int i4;
        tc0 tc0Var2;
        int i5;
        gj5 gj5Var2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        j09 j09Var3;
        j18 j18Var2;
        xw9 xw9Var2;
        tc0 tc0Var3;
        gj5 gj5Var3;
        boolean z5;
        kx0 kx0Var2;
        lu9 lu9Var2;
        ojb ojbVarV;
        j09 j09Var4;
        gj5 gj5Var4;
        kx0 kx0Var3;
        int i8;
        gj5 gj5Var5;
        lu9 lu9VarB;
        j18 j18Var3;
        tc0 tc0Var4;
        boolean z6;
        ph3 ph3VarA;
        boolean zG;
        Object objR;
        int i9;
        int i10;
        l46Var.h0(-1884325601);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i3 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j18VarA = j18Var;
                int i12 = l46Var.g(j18VarA) ? 32 : 16;
                i3 |= i12;
            } else {
                j18VarA = j18Var;
            }
            i3 |= i12;
        } else {
            j18VarA = j18Var;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                bx9Var = xw9Var;
                i3 |= l46Var.g(bx9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (l46Var.h(false)) {
                    i4 = 2048;
                } else {
                    i4 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i4;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    tc0Var2 = tc0Var;
                    if (l46Var.g(tc0Var2)) {
                        i10 = 16384;
                    }
                    i3 |= i10;
                } else {
                    tc0Var2 = tc0Var;
                }
                i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i3 |= i10;
            } else {
                tc0Var2 = tc0Var;
            }
            i5 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    gj5Var2 = gj5Var;
                    int i14 = l46Var.g(gj5Var2) ? 1048576 : 524288;
                    i5 |= i14;
                } else {
                    gj5Var2 = gj5Var;
                }
                i5 |= i14;
            } else {
                gj5Var2 = gj5Var;
            }
            i6 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    z3 = z2;
                    if (l46Var.h(z3)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i5 |= i7;
                }
                if ((100663296 & i) == 0) {
                    i5 |= 33554432;
                }
                if ((805306368 & i) != 0) {
                    if (l46Var.i(a26Var)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i5 |= i9;
                }
                if ((306783379 & i5) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i5 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0 || l46Var.C()) {
                        if (i11 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                            j18VarA = k18.a(0, 3, l46Var);
                        }
                        if (i13 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                            tc0Var2 = xc0.a;
                        }
                        kx0 kx0Var4 = ndb.y;
                        if ((i2 & 64) != 0) {
                            ph3VarA = yud.a(l46Var);
                            zG = l46Var.g(ph3VarA);
                            objR = l46Var.R();
                            if (zG || objR == sf2.a) {
                                objR = new uq3(ph3VarA);
                                l46Var.p0(objR);
                            }
                            gj5Var4 = (uq3) objR;
                            i5 &= -3670017;
                        } else {
                            gj5Var4 = gj5Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        kx0Var3 = kx0Var4;
                        i8 = i5 & (-234881025);
                        gj5Var5 = gj5Var4;
                        lu9VarB = mu9.b(l46Var);
                        j18Var3 = j18VarA;
                        tc0Var4 = tc0Var2;
                        z6 = z3;
                    } else {
                        l46Var.Z();
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        j09 j09Var5 = j09Var2;
                        i8 = i5 & (-234881025);
                        j09Var4 = j09Var5;
                        kx0Var3 = kx0Var;
                        lu9VarB = lu9Var;
                        gj5Var5 = gj5Var2;
                        j18Var3 = j18VarA;
                        z6 = z3;
                        tc0Var4 = tc0Var2;
                    }
                    l46Var.s();
                    int i15 = i8 >> 3;
                    j09 j09Var6 = j09Var4;
                    xw9 xw9Var3 = bx9Var;
                    tm7.g(j09Var6, j18Var3, xw9Var3, false, gj5Var5, z6, lu9VarB, null, null, kx0Var3, tc0Var4, a26Var, l46Var, (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (458752 & i15) | (i15 & 3670016), ((i8 >> 18) & 7168) | ((i8 >> 12) & 112) | ((i8 >> 6) & 896), 1792);
                    xw9Var2 = xw9Var3;
                    z5 = z6;
                    lu9Var2 = lu9VarB;
                    kx0Var2 = kx0Var3;
                    j18Var2 = j18Var3;
                    gj5Var3 = gj5Var5;
                    tc0Var3 = tc0Var4;
                    j09Var3 = j09Var6;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    j18Var2 = j18VarA;
                    xw9Var2 = bx9Var;
                    tc0Var3 = tc0Var2;
                    gj5Var3 = gj5Var2;
                    z5 = z3;
                    kx0Var2 = kx0Var;
                    lu9Var2 = lu9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, tc0Var3, kx0Var2, gj5Var3, z5, lu9Var2, a26Var, i, i2, 2);
                }
            }
            i5 |= 12582912;
            z3 = z2;
            if ((100663296 & i) == 0) {
                i5 |= 33554432;
            }
            if ((805306368 & i) != 0) {
                if (l46Var.i(a26Var)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i5 |= i9;
            }
            if ((306783379 & i5) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i5 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i5 &= -113;
                        j18VarA = k18.a(0, 3, l46Var);
                    }
                    if (i13 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                        tc0Var2 = xc0.a;
                    }
                    kx0 kx0Var5 = ndb.y;
                    if ((i2 & 64) != 0) {
                        ph3VarA = yud.a(l46Var);
                        zG = l46Var.g(ph3VarA);
                        objR = l46Var.R();
                        if (zG) {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        } else {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        }
                        gj5Var4 = (uq3) objR;
                        i5 &= -3670017;
                    } else {
                        gj5Var4 = gj5Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    kx0Var3 = kx0Var5;
                    i8 = i5 & (-234881025);
                    gj5Var5 = gj5Var4;
                    lu9VarB = mu9.b(l46Var);
                    j18Var3 = j18VarA;
                    tc0Var4 = tc0Var2;
                    z6 = z3;
                } else {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i5 &= -113;
                        j18VarA = k18.a(0, 3, l46Var);
                    }
                    if (i13 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                        tc0Var2 = xc0.a;
                    }
                    kx0 kx0Var6 = ndb.y;
                    if ((i2 & 64) != 0) {
                        ph3VarA = yud.a(l46Var);
                        zG = l46Var.g(ph3VarA);
                        objR = l46Var.R();
                        if (zG) {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        } else {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        }
                        gj5Var4 = (uq3) objR;
                        i5 &= -3670017;
                    } else {
                        gj5Var4 = gj5Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    kx0Var3 = kx0Var6;
                    i8 = i5 & (-234881025);
                    gj5Var5 = gj5Var4;
                    lu9VarB = mu9.b(l46Var);
                    j18Var3 = j18VarA;
                    tc0Var4 = tc0Var2;
                    z6 = z3;
                }
                l46Var.s();
                int i16 = i8 >> 3;
                j09 j09Var7 = j09Var4;
                xw9 xw9Var4 = bx9Var;
                tm7.g(j09Var7, j18Var3, xw9Var4, false, gj5Var5, z6, lu9VarB, null, null, kx0Var3, tc0Var4, a26Var, l46Var, (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (458752 & i16) | (i16 & 3670016), ((i8 >> 18) & 7168) | ((i8 >> 12) & 112) | ((i8 >> 6) & 896), 1792);
                xw9Var2 = xw9Var4;
                z5 = z6;
                lu9Var2 = lu9VarB;
                kx0Var2 = kx0Var3;
                j18Var2 = j18Var3;
                gj5Var3 = gj5Var5;
                tc0Var3 = tc0Var4;
                j09Var3 = j09Var7;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                j18Var2 = j18VarA;
                xw9Var2 = bx9Var;
                tc0Var3 = tc0Var2;
                gj5Var3 = gj5Var2;
                z5 = z3;
                kx0Var2 = kx0Var;
                lu9Var2 = lu9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, tc0Var3, kx0Var2, gj5Var3, z5, lu9Var2, a26Var, i, i2, 2);
            }
        }
        i3 |= 384;
        bx9Var = xw9Var;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (l46Var.h(false)) {
                i4 = 2048;
            } else {
                i4 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i3 |= i4;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                tc0Var2 = tc0Var;
                if (l46Var.g(tc0Var2)) {
                    i10 = 16384;
                }
                i3 |= i10;
            } else {
                tc0Var2 = tc0Var;
            }
            i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i3 |= i10;
        } else {
            tc0Var2 = tc0Var;
        }
        i5 = i3 | 196608;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                gj5Var2 = gj5Var;
                if (l46Var.g(gj5Var2)) {
                }
                i5 |= i14;
            } else {
                gj5Var2 = gj5Var;
            }
            i5 |= i14;
        } else {
            gj5Var2 = gj5Var;
        }
        i6 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i6 != 0) {
            if ((12582912 & i) == 0) {
                z3 = z2;
                if (l46Var.h(z3)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i5 |= i7;
            }
            if ((100663296 & i) == 0) {
                i5 |= 33554432;
            }
            if ((805306368 & i) != 0) {
                if (l46Var.i(a26Var)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i5 |= i9;
            }
            if ((306783379 & i5) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i5 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i5 &= -113;
                        j18VarA = k18.a(0, 3, l46Var);
                    }
                    if (i13 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                        tc0Var2 = xc0.a;
                    }
                    kx0 kx0Var7 = ndb.y;
                    if ((i2 & 64) != 0) {
                        ph3VarA = yud.a(l46Var);
                        zG = l46Var.g(ph3VarA);
                        objR = l46Var.R();
                        if (zG) {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        } else {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        }
                        gj5Var4 = (uq3) objR;
                        i5 &= -3670017;
                    } else {
                        gj5Var4 = gj5Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    kx0Var3 = kx0Var7;
                    i8 = i5 & (-234881025);
                    gj5Var5 = gj5Var4;
                    lu9VarB = mu9.b(l46Var);
                    j18Var3 = j18VarA;
                    tc0Var4 = tc0Var2;
                    z6 = z3;
                } else {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i5 &= -113;
                        j18VarA = k18.a(0, 3, l46Var);
                    }
                    if (i13 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                        tc0Var2 = xc0.a;
                    }
                    kx0 kx0Var8 = ndb.y;
                    if ((i2 & 64) != 0) {
                        ph3VarA = yud.a(l46Var);
                        zG = l46Var.g(ph3VarA);
                        objR = l46Var.R();
                        if (zG) {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        } else {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        }
                        gj5Var4 = (uq3) objR;
                        i5 &= -3670017;
                    } else {
                        gj5Var4 = gj5Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    kx0Var3 = kx0Var8;
                    i8 = i5 & (-234881025);
                    gj5Var5 = gj5Var4;
                    lu9VarB = mu9.b(l46Var);
                    j18Var3 = j18VarA;
                    tc0Var4 = tc0Var2;
                    z6 = z3;
                }
                l46Var.s();
                int i17 = i8 >> 3;
                j09 j09Var8 = j09Var4;
                xw9 xw9Var5 = bx9Var;
                tm7.g(j09Var8, j18Var3, xw9Var5, false, gj5Var5, z6, lu9VarB, null, null, kx0Var3, tc0Var4, a26Var, l46Var, (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (458752 & i17) | (i17 & 3670016), ((i8 >> 18) & 7168) | ((i8 >> 12) & 112) | ((i8 >> 6) & 896), 1792);
                xw9Var2 = xw9Var5;
                z5 = z6;
                lu9Var2 = lu9VarB;
                kx0Var2 = kx0Var3;
                j18Var2 = j18Var3;
                gj5Var3 = gj5Var5;
                tc0Var3 = tc0Var4;
                j09Var3 = j09Var8;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                j18Var2 = j18VarA;
                xw9Var2 = bx9Var;
                tc0Var3 = tc0Var2;
                gj5Var3 = gj5Var2;
                z5 = z3;
                kx0Var2 = kx0Var;
                lu9Var2 = lu9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, tc0Var3, kx0Var2, gj5Var3, z5, lu9Var2, a26Var, i, i2, 2);
            }
        }
        i5 |= 12582912;
        z3 = z2;
        if ((100663296 & i) == 0) {
            i5 |= 33554432;
        }
        if ((805306368 & i) != 0) {
            if (l46Var.i(a26Var)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i5 |= i9;
        }
        if ((306783379 & i5) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var.W(i5 & 1, z4)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                    j18VarA = k18.a(0, 3, l46Var);
                }
                if (i13 != 0) {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i5 &= -57345;
                    tc0Var2 = xc0.a;
                }
                kx0 kx0Var9 = ndb.y;
                if ((i2 & 64) != 0) {
                    ph3VarA = yud.a(l46Var);
                    zG = l46Var.g(ph3VarA);
                    objR = l46Var.R();
                    if (zG) {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    } else {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    }
                    gj5Var4 = (uq3) objR;
                    i5 &= -3670017;
                } else {
                    gj5Var4 = gj5Var2;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                kx0Var3 = kx0Var9;
                i8 = i5 & (-234881025);
                gj5Var5 = gj5Var4;
                lu9VarB = mu9.b(l46Var);
                j18Var3 = j18VarA;
                tc0Var4 = tc0Var2;
                z6 = z3;
            } else {
                if (i11 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                    j18VarA = k18.a(0, 3, l46Var);
                }
                if (i13 != 0) {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i5 &= -57345;
                    tc0Var2 = xc0.a;
                }
                kx0 kx0Var10 = ndb.y;
                if ((i2 & 64) != 0) {
                    ph3VarA = yud.a(l46Var);
                    zG = l46Var.g(ph3VarA);
                    objR = l46Var.R();
                    if (zG) {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    } else {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    }
                    gj5Var4 = (uq3) objR;
                    i5 &= -3670017;
                } else {
                    gj5Var4 = gj5Var2;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                kx0Var3 = kx0Var10;
                i8 = i5 & (-234881025);
                gj5Var5 = gj5Var4;
                lu9VarB = mu9.b(l46Var);
                j18Var3 = j18VarA;
                tc0Var4 = tc0Var2;
                z6 = z3;
            }
            l46Var.s();
            int i18 = i8 >> 3;
            j09 j09Var9 = j09Var4;
            xw9 xw9Var6 = bx9Var;
            tm7.g(j09Var9, j18Var3, xw9Var6, false, gj5Var5, z6, lu9VarB, null, null, kx0Var3, tc0Var4, a26Var, l46Var, (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (458752 & i18) | (i18 & 3670016), ((i8 >> 18) & 7168) | ((i8 >> 12) & 112) | ((i8 >> 6) & 896), 1792);
            xw9Var2 = xw9Var6;
            z5 = z6;
            lu9Var2 = lu9VarB;
            kx0Var2 = kx0Var3;
            j18Var2 = j18Var3;
            gj5Var3 = gj5Var5;
            tc0Var3 = tc0Var4;
            j09Var3 = j09Var9;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            j18Var2 = j18VarA;
            xw9Var2 = bx9Var;
            tc0Var3 = tc0Var2;
            gj5Var3 = gj5Var2;
            z5 = z3;
            kx0Var2 = kx0Var;
            lu9Var2 = lu9Var;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b61(j09Var3, j18Var2, xw9Var2, tc0Var3, kx0Var2, gj5Var3, z5, lu9Var2, a26Var, i, i2, 2);
        }
    }

    public static final void u(x16 x16Var, l46 l46Var) {
        rr9 rr9Var = l46Var.M.b.l;
        rr9Var.U(gr9.d);
        vfh.L(rr9Var, 0, x16Var);
    }

    public static final void v(int i, a26 a26Var, j09 j09Var, l46 l46Var, int i2) {
        long j;
        a26Var.getClass();
        l46Var.h0(-282976474);
        int i3 = 2;
        int i4 = (l46Var.e(i) ? 4 : 2) | i2;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            l46Var.f0(157714360);
            int i5 = 1;
            while (i5 < 6) {
                Object objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = qk2.d(1.0f);
                    l46Var.p0(objR2);
                }
                jx jxVar = (jx) objR2;
                boolean z2 = i5 <= i;
                Boolean boolValueOf = Boolean.valueOf(z2);
                boolean zI = l46Var.i(jxVar) | l46Var.h(z2);
                Object objR3 = l46Var.R();
                if (zI || objR3 == obj) {
                    objR3 = new vb5(jxVar, z2, null);
                    l46Var.p0(objR3);
                }
                o((l26) objR3, l46Var, boolValueOf);
                gx6 gx6VarI = z8c.i();
                if (z2) {
                    l46Var.f0(157731561);
                    j = ((m82) l46Var.k(o82.a)).a;
                    l46Var.r(false);
                } else {
                    l46Var.f0(157732166);
                    l46Var.r(false);
                    j = y72.c;
                }
                float fFloatValue = ((Number) jxVar.e()).floatValue();
                j09 j09VarE = oa7.E(ynb.Z(eec.s(g09.a, fFloatValue, fFloatValue), 4.0f), a7c.a);
                boolean zI2 = l46Var.i(aw2Var) | l46Var.e(i5);
                Object objR4 = l46Var.R();
                if (zI2 || objR4 == obj) {
                    objR4 = new m53(aw2Var, a26Var, i5, i3);
                    l46Var.p0(objR4);
                }
                gu6.a(gx6VarI, null, androidx.compose.foundation.b.c(j09VarE, false, null, null, (x16) objR4, 15), j, l46Var, 48, 0);
                i5++;
                aw2Var = aw2Var;
            }
            l46Var.r(false);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zl1(i, i2, a26Var, j09Var);
        }
    }

    public static final m27 w(p27 p27Var, float f2, float f3, l27 l27Var, String str, l46 l46Var, int i, int i2) {
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        int i3 = (i & 1022) | 32768 | ((i << 3) & 458752);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (objR == obj) {
            objR = new m27(p27Var, fValueOf, fValueOf2, l27Var);
            l46Var.p0(objR);
        }
        m27 m27Var = (m27) objR;
        boolean z2 = true;
        boolean z3 = (((i3 & 112) ^ 48) > 32 && l46Var.i(fValueOf)) || (i3 & 48) == 32;
        if ((((i3 & 896) ^ 384) <= 256 || !l46Var.i(fValueOf2)) && (i3 & 384) != 256) {
            z2 = false;
        }
        boolean zI = z3 | z2 | l46Var.i(l27Var);
        Object objR2 = l46Var.R();
        if (zI || objR2 == obj) {
            Object jrVar = new jr(fValueOf, m27Var, fValueOf2, l27Var, 16);
            l46Var.p0(jrVar);
            objR2 = jrVar;
        }
        u((x16) objR2, l46Var);
        boolean zI2 = l46Var.i(p27Var);
        Object objR3 = l46Var.R();
        if (zI2 || objR3 == obj) {
            objR3 = new so5(16, p27Var, m27Var);
            l46Var.p0(objR3);
        }
        g(m27Var, (a26) objR3, l46Var);
        return m27Var;
    }

    public static final int y(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final k00 z(int i, l46 l46Var, xtd xtdVar) {
        xtdVar.getClass();
        CharSequence text = ((Context) l46Var.k(uq.b)).getResources().getText(i);
        text.getClass();
        i00 i00Var = new i00();
        i00Var.e(text);
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            Object[] spans = spanned.getSpans(0, text.length(), android.text.Annotation.class);
            spans.getClass();
            for (Object obj : spans) {
                android.text.Annotation annotation = (android.text.Annotation) obj;
                if (pa7.t(annotation.getValue(), "HIGHLIGHT")) {
                    i00Var.b(xtdVar, spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation));
                }
            }
        }
        return i00Var.l();
    }
}

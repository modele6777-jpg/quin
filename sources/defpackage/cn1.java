package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import tech.chatmind.api.Gender;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cn1 implements na1 {
    public static final float E0;
    public static final n82 F0;
    public static final q9f G0;
    public static final n82 H0;
    public static final float I0;
    public static final n82 J0;
    public static final n82 K0;
    public static final float L0;
    public static final n82 M0;
    public static final float N0;
    public static Context O0;
    public static Context P0;
    public static tta Q0;
    public static final n82 X;
    public static final float Y;
    public static final n82 Z;
    public static final bx a = new bx();
    public static final dd2 b = new dd2(new a7(26), false, -1412372500);
    public static final dd2 c = new dd2(new a7(27), false, -1444659032);
    public static final dd2 d = new dd2(new a7(28), false, -515521741);
    public static final dd2 e = new dd2(new xd2(24), false, 1811020942);
    public static final dd2 f = new dd2(new xd2(25), false, 2001998689);
    public static final dd2 g = new dd2(new ed2(13), false, -1709694645);
    public static final wx6 v = new wx6(false);
    public static final n82 w = n82.Z;
    public static final g5d x = g5d.f;
    public static final n82 y;
    public static final float z;

    static {
        n82 n82Var = n82.v;
        y = n82Var;
        z = 0.38f;
        X = n82Var;
        Y = 0.38f;
        Z = n82Var;
        E0 = 0.38f;
        F0 = n82Var;
        G0 = q9f.a;
        n82 n82Var2 = n82.w;
        H0 = n82Var2;
        I0 = 56.0f;
        J0 = n82Var2;
        K0 = n82Var2;
        L0 = 88.0f;
        M0 = n82Var2;
        N0 = 72.0f;
    }

    public static final fk7 A(hq7 hq7Var) {
        hq7Var.getClass();
        qq7 qq7Var = fk7.c;
        qq7Var.getClass();
        return (fk7) y7h.N(hq7Var.s, qq7Var);
    }

    public static final hk7 B(lq7 lq7Var) {
        lq7Var.getClass();
        qq7 qq7Var = hk7.b;
        qq7Var.getClass();
        return (hk7) y7h.N(lq7Var.f, qq7Var);
    }

    public static final lk7 C(sq7 sq7Var) {
        sq7Var.getClass();
        qq7 qq7Var = lk7.b;
        qq7Var.getClass();
        return (lk7) y7h.N(sq7Var.l, qq7Var);
    }

    public static final bl7 D(uq7 uq7Var) {
        uq7Var.getClass();
        qq7 qq7Var = bl7.g;
        qq7Var.getClass();
        return (bl7) y7h.N(uq7Var.p, qq7Var);
    }

    public static boolean E(h10 h10Var, dx5 dx5Var) {
        dx5Var.getClass();
        return h10Var.R(dx5Var) != null;
    }

    public static final int F(nyc nycVar, nyc[] nycVarArr) {
        nycVarArr.getClass();
        int iHashCode = (nycVar.a().hashCode() * 31) + Arrays.hashCode(nycVarArr);
        int iE = nycVar.e();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i2 = iE - 1;
            int i3 = i * 31;
            String strA = nycVar.i(nycVar.e() - iE).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i3 + iHashCode2;
            iE = i2;
        }
        int iE2 = nycVar.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iE2 - 1;
            int i5 = iHashCode3 * 31;
            iec iecVarG = nycVar.i(nycVar.e() - iE2).g();
            iHashCode3 = i5 + (iecVarG != null ? iecVarG.hashCode() : 0);
            iE2 = i4;
        }
    }

    public static final boolean G(mf1 mf1Var, String str) throws a37 {
        str.getClass();
        mf1Var.getClass();
        if (pa7.t(Build.FINGERPRINT, "robolectric")) {
            if (!b21.F(3, "CXCP")) {
                return true;
            }
            Log.d("CXCP", "isBackwardCompatible method returns true because robolectric build detected.");
            return true;
        }
        try {
            ig1.a(str);
            yg1 yg1VarB = mf1.b(mf1Var, str);
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            key.getClass();
            int[] iArr = (int[]) ((nc1) yg1VarB).c(key);
            if (iArr != null) {
                return qd0.T(iArr, 0);
            }
            return false;
        } catch (CameraAccessException e2) {
            if (b21.F(6, "CXCP")) {
                b1.e("CXCP", "Error while accessing metadata for cameraID: ".concat(str), e2);
            }
            throw new a37(e2);
        }
    }

    public static final void H(uvf uvfVar, LayoutNode layoutNode) {
        long jN = ((c47) layoutNode.V0.d).N(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jN >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jN & 4294967295L)));
        uvfVar.layout(iRound, iRound2, uvfVar.getMeasuredWidth() + iRound, uvfVar.getMeasuredHeight() + iRound2);
    }

    public static final pb9 I(a26 a26Var) {
        int iE;
        boolean z2;
        boolean z3;
        qb9 qb9Var = new qb9();
        a26Var.d(qb9Var);
        boolean z4 = qb9Var.b;
        ob9 ob9Var = qb9Var.a;
        ob9Var.c = z4;
        ob9Var.d = qb9Var.c;
        em7 em7Var = qb9Var.g;
        if (em7Var != null) {
            z2 = qb9Var.e;
            z3 = qb9Var.f;
            ob9Var.e = em7Var;
            iE = -1;
        } else {
            Object obj = qb9Var.h;
            if (obj != null) {
                z2 = qb9Var.e;
                z3 = qb9Var.f;
                ob9Var.f = obj;
                iE = m7c.e(hfc.l(job.a.b(obj.getClass())));
            } else {
                iE = qb9Var.d;
                z2 = qb9Var.e;
                z3 = qb9Var.f;
            }
        }
        int i = iE;
        boolean z5 = z3;
        boolean z6 = z2;
        em7 em7Var2 = (em7) ob9Var.e;
        if (em7Var2 != null) {
            pb9 pb9Var = new pb9(ob9Var.c, ob9Var.d, m7c.e(hfc.l(em7Var2)), z6, z5, ob9Var.a, ob9Var.b);
            pb9Var.h = em7Var2;
            return pb9Var;
        }
        Object obj2 = ob9Var.f;
        boolean z7 = ob9Var.c;
        boolean z8 = ob9Var.d;
        int i2 = ob9Var.a;
        if (obj2 == null) {
            return new pb9(z7, z8, i, z6, z5, i2, ob9Var.b);
        }
        pb9 pb9Var2 = new pb9(z7, z8, m7c.e(hfc.l(job.a.b(obj2.getClass()))), z6, z5, i2, ob9Var.b);
        pb9Var2.i = obj2;
        return pb9Var2;
    }

    public static d70 J(d0a d0aVar) {
        String str;
        int iM = d0aVar.m();
        if (d0aVar.m() != 1684108385) {
            xo1.V("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2 = d0aVar.m();
        byte[] bArr = b31.a;
        int i = iM2 & 16777215;
        if (i == 13) {
            str = "image/jpeg";
        } else {
            str = i == 14 ? "image/png" : null;
        }
        if (str == null) {
            kv2.w(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        d0aVar.N(4);
        int i2 = iM - 16;
        byte[] bArr2 = new byte[i2];
        d0aVar.k(bArr2, 0, i2);
        return new d70(str, null, 3, bArr2);
    }

    public static fte K(int i, d0a d0aVar, String str) {
        int iM = d0aVar.m();
        if (d0aVar.m() == 1684108385 && iM >= 22) {
            d0aVar.N(10);
            int iG = d0aVar.G();
            if (iG > 0) {
                String strE = tec.e(iG, "");
                int iG2 = d0aVar.G();
                if (iG2 > 0) {
                    strE = strE + "/" + iG2;
                }
                return new fte(str, null, jy6.s(strE));
            }
        }
        xo1.V("MetadataUtil", "Failed to parse index/count attribute: ".concat(g41.b(i)));
        return null;
    }

    public static int L(d0a d0aVar) {
        int iM = d0aVar.m();
        if (d0aVar.m() == 1684108385) {
            d0aVar.N(8);
            int i = iM - 16;
            if (i == 1) {
                return d0aVar.z();
            }
            if (i == 2) {
                return d0aVar.G();
            }
            if (i == 3) {
                return d0aVar.C();
            }
            if (i == 4 && (d0aVar.j() & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                return d0aVar.D();
            }
        }
        xo1.V("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static ru6 M(int i, String str, d0a d0aVar, boolean z2, boolean z3) {
        int iL = L(d0aVar);
        if (z3) {
            iL = Math.min(1, iL);
        }
        if (iL >= 0) {
            return z2 ? new fte(str, null, jy6.s(Integer.toString(iL))) : new aa2("und", str, Integer.toString(iL));
        }
        xo1.V("MetadataUtil", "Failed to parse uint8 attribute: ".concat(g41.b(i)));
        return null;
    }

    public static fte N(int i, d0a d0aVar, String str) {
        int iM = d0aVar.m();
        if (d0aVar.m() == 1684108385) {
            d0aVar.N(8);
            return new fte(str, null, jy6.s(d0aVar.v(iM - 16)));
        }
        xo1.V("MetadataUtil", "Failed to parse text attribute: ".concat(g41.b(i)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object O(utd utdVar, zn2 zn2Var) {
        brf brfVar;
        AutoCloseable autoCloseable;
        Throwable th;
        f41 f41Var;
        if (zn2Var instanceof brf) {
            brfVar = (brf) zn2Var;
            int i = brfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                brfVar.label = i - Integer.MIN_VALUE;
            } else {
                brfVar = new brf(zn2Var);
            }
        } else {
            brfVar = new brf(zn2Var);
        }
        Object obj = brfVar.result;
        int i2 = brfVar.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f41Var = (f41) brfVar.L$3;
            autoCloseable = (AutoCloseable) brfVar.L$1;
            try {
                jzb.q(obj);
                cgg.t(autoCloseable, null);
                return f41Var;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    cgg.t(autoCloseable, th);
                    throw th3;
                }
            }
        }
        jzb.q(obj);
        try {
            f41 f41Var2 = new f41();
            brfVar.L$0 = null;
            brfVar.L$1 = utdVar;
            brfVar.L$2 = null;
            brfVar.L$3 = f41Var2;
            brfVar.label = 1;
            utdVar.a.a0(f41Var2);
            wef wefVar = wef.a;
            bw2 bw2Var = bw2.a;
            if (wefVar == bw2Var) {
                return bw2Var;
            }
            autoCloseable = utdVar;
            f41Var = f41Var2;
            cgg.t(autoCloseable, null);
            return f41Var;
        } catch (Throwable th4) {
            autoCloseable = utdVar;
            th = th4;
            throw th;
        }
    }

    public static LinkedHashSet P(t99 t99Var, Collection collection, Collection collection2, u09 u09Var, ky4 ky4Var, iu9 iu9Var, boolean z2) {
        if (collection == null) {
            a(13);
            throw null;
        }
        if (u09Var == null) {
            a(15);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        iu9Var.h(t99Var, collection, collection2, u09Var, new nz3(ky4Var, linkedHashSet, z2));
        return linkedHashSet;
    }

    public static LinkedHashSet Q(t99 t99Var, AbstractCollection abstractCollection, Collection collection, u09 u09Var, ky4 ky4Var, iu9 iu9Var) {
        if (u09Var != null) {
            return P(t99Var, abstractCollection, collection, u09Var, ky4Var, iu9Var, false);
        }
        a(3);
        throw null;
    }

    public static LinkedHashSet R(t99 t99Var, Collection collection, AbstractCollection abstractCollection, u09 u09Var, iu9 iu9Var) {
        i8c i8cVar = i8c.b;
        if (collection == null) {
            a(7);
            throw null;
        }
        if (u09Var != null) {
            return P(t99Var, collection, abstractCollection, u09Var, i8cVar, iu9Var, true);
        }
        a(9);
        throw null;
    }

    public static long S(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static void T(int i, su8 su8Var, qr5 qr5Var, su8 su8Var2, su8... su8VarArr) {
        if (su8Var2 == null) {
            su8Var2 = new su8(new qu8[0]);
        }
        if (su8Var != null) {
            dy6 dy6VarM = jy6.m();
            for (qu8 qu8Var : su8Var.a) {
                if (sn8.class.isAssignableFrom(qu8Var.getClass())) {
                    dy6VarM.b((qu8) sn8.class.cast(qu8Var));
                }
            }
            ey6 ey6VarListIterator = dy6VarM.g().listIterator(0);
            while (ey6VarListIterator.hasNext()) {
                sn8 sn8Var = (sn8) ey6VarListIterator.next();
                if (!sn8Var.a.equals("com.android.capture.fps") || i == 2) {
                    su8Var2 = su8Var2.a(sn8Var);
                }
            }
        }
        for (su8 su8Var3 : su8VarArr) {
            su8Var2 = su8Var2.b(su8Var3);
        }
        if (su8Var2.a.length > 0) {
            qr5Var.l = su8Var2;
        }
    }

    public static final String U(nyc nycVar) {
        return s72.D0(mh3.c0(0, nycVar.e()), ", ", nycVar.a() + '(', ")", new p59(14, nycVar), 24);
    }

    public static dx5 V(t99 t99Var) {
        t99Var.getClass();
        String strB = t99Var.b();
        strB.getClass();
        return new dx5(new ex5(strB, dx5.c.a, t99Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [jf2, wdb] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList W(kpd kpdVar, int i, Integer num) {
        ?? wdbVar = new wdb(kpdVar);
        i = kpdVar.q(i);
        f46 f46VarA = kpdVar.a(i);
        while (i >= 0) {
            wdbVar.e(kpdVar.i(i), kpdVar.k(i) ? kpdVar.p(kpdVar.b, i) : sf2.a, kpdVar.a.k(i), num);
            if (i >= 0) {
                f46 f46Var = f46VarA;
                f46VarA = kpdVar.a(i);
                i = kpdVar.q(i);
                num = f46Var;
            } else {
                num = f46VarA;
            }
        }
        return wdbVar.a;
    }

    public static final void X(Locale locale) {
        tta ttaVar = new tta();
        ttaVar.a = locale;
        for (Object obj : ttaVar.b.keySet()) {
            if (obj instanceof sjd) {
                ((sjd) obj).setLocale(locale);
            }
        }
        for (uxe uxeVar : ttaVar.b.values()) {
            if (uxeVar instanceof sjd) {
                ((sjd) uxeVar).setLocale(locale);
            }
        }
        ttaVar.c = null;
        Q0 = ttaVar;
    }

    public static final void Y(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            l37.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        l37.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static final void b(Gender gender, x16 x16Var, x9 x9Var, l46 l46Var, int i) {
        gender.getClass();
        x16Var.getClass();
        x9Var.getClass();
        l46Var.h0(2068235179);
        int i2 = 2;
        int i3 = (l46Var.e(gender.ordinal()) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = ((i3 & 896) == 256 || l46Var.i(x9Var)) | ((i3 & 112) == 32);
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = new u7(x9Var, x16Var, i2);
                l46Var.p0(objR);
            }
            g(gender, (a26) objR, x16Var, l46Var, ((i3 << 3) & 896) | (i3 & 14));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(gender, x16Var, false, x9Var, i, 1);
        }
    }

    public static final void c(boolean z2, a26 a26Var, j09 j09Var, boolean z3, qy1 qy1Var, l46 l46Var, int i) {
        int i2;
        j09 j09Var2;
        boolean z4;
        j09 j09Var3;
        boolean z5;
        x16 x16Var;
        l46Var.h0(-1406741137);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (l46Var.h(z2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(a26Var) ? 32 : 16;
        }
        int i4 = i2 | 3456;
        if ((i & 24576) == 0) {
            i4 |= l46Var.g(qy1Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i5 = i4 | 196608;
        if (l46Var.W(i5 & 1, (74899 & i5) != 74898)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                j09Var3 = g09.a;
                z5 = true;
            } else {
                l46Var.Z();
                j09Var3 = j09Var;
                z5 = z3;
            }
            l46Var.s();
            float fFloor = (float) Math.floor(((sw3) l46Var.k(zg2.h)).p0(2.0f));
            yye yyeVar = z2 ? yye.a : yye.b;
            if (a26Var != null) {
                l46Var.f0(2066152950);
                boolean z6 = ((i5 & 112) == 32) | ((i5 & 14) == 4);
                Object objR = l46Var.R();
                if (z6 || objR == sf2.a) {
                    objR = new oy1(i3, a26Var, z2);
                    l46Var.p0(objR);
                }
                x16Var = (x16) objR;
                l46Var.r(false);
            } else {
                l46Var.f0(2066218639);
                l46Var.r(false);
                x16Var = null;
            }
            x16 x16Var2 = x16Var;
            j09 j09Var4 = j09Var3;
            k(yyeVar, x16Var2, new d5e(fFloor, 0.0f, 2, 0, null, 26), new d5e(fFloor, 0.0f, 0, 0, null, 30), j09Var4, z5, qy1Var, l46Var, (i5 << 6) & 33546240);
            j09Var2 = j09Var4;
            z4 = z5;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z4 = z3;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ry1(z2, a26Var, j09Var2, z4, qy1Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01db  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:127:0x0201  */
    /* JADX WARN: Code duplicated, block: B:129:0x0205  */
    /* JADX WARN: Code duplicated, block: B:130:0x0208  */
    /* JADX WARN: Code duplicated, block: B:132:0x020c  */
    /* JADX WARN: Code duplicated, block: B:133:0x022d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0242  */
    /* JADX WARN: Code duplicated, block: B:137:0x0248  */
    /* JADX WARN: Code duplicated, block: B:139:0x024b  */
    /* JADX WARN: Code duplicated, block: B:142:0x024f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0253  */
    /* JADX WARN: Code duplicated, block: B:145:0x0256  */
    /* JADX WARN: Code duplicated, block: B:146:0x0259  */
    /* JADX WARN: Code duplicated, block: B:148:0x025f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0262  */
    /* JADX WARN: Code duplicated, block: B:152:0x0265  */
    /* JADX WARN: Code duplicated, block: B:153:0x0268  */
    /* JADX WARN: Code duplicated, block: B:155:0x026c  */
    /* JADX WARN: Code duplicated, block: B:156:0x026f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0273  */
    /* JADX WARN: Code duplicated, block: B:159:0x0294  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e0  */
    public static final void d(boolean z2, yye yyeVar, j09 j09Var, qy1 qy1Var, d5e d5eVar, d5e d5eVar2, l46 l46Var, int i) {
        int i2;
        l46 l46Var2;
        float f2;
        float f3;
        float f4;
        ze5 grdVar;
        k3f k3fVarH;
        Object objR;
        i8c i8cVar;
        my1 my1Var;
        long j;
        h0e h0eVarA;
        l46 l46Var3;
        int iOrdinal;
        long j2;
        h0e h0eVarI;
        int iOrdinal2;
        long j3;
        h0e h0eVarI2;
        boolean zG;
        Object objR2;
        int iOrdinal3;
        int iOrdinal4;
        l46Var.h0(-891330208);
        if ((i & 6) == 0) {
            i2 = (l46Var.h(z2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.e(yyeVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.g(qy1Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(d5eVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.i(d5eVar2) ? 131072 : 65536;
        }
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            p3f p3fVarI0 = g21.i0(yyeVar, null, l46Var, (i2 >> 3) & 14, 2);
            vz9 vz9Var = p3fVarI0.d;
            s3f s3fVar = p3fVarI0.a;
            ze5 ze5VarZ = vpf.Z(t39.a, l46Var);
            y6f y6fVar = xo1.g;
            yye yyeVar2 = (yye) s3fVar.a();
            l46Var.f0(-768316570);
            int iOrdinal5 = yyeVar2.ordinal();
            float f5 = 0.0f;
            if (iOrdinal5 == 0) {
                f2 = 1.0f;
            } else if (iOrdinal5 != 1) {
                if (iOrdinal5 != 2) {
                    ap.c();
                    return;
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            l46Var.r(false);
            Float fValueOf = Float.valueOf(f2);
            yye yyeVar3 = (yye) vz9Var.getValue();
            l46Var.f0(-768316570);
            int iOrdinal6 = yyeVar3.ordinal();
            if (iOrdinal6 == 0) {
                f3 = 1.0f;
            } else if (iOrdinal6 != 1) {
                if (iOrdinal6 != 2) {
                    ap.c();
                    return;
                }
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            l46Var.r(false);
            Float fValueOf2 = Float.valueOf(f3);
            i3f i3fVarF = p3fVarI0.f();
            l46Var.f0(1780794470);
            Object objB = i3fVarF.b();
            yye yyeVar4 = yye.b;
            ze5 grdVar2 = (objB != yyeVar4 && i3fVarF.d() == yyeVar4) ? new grd(100) : ze5VarZ;
            l46Var.r(false);
            k3f k3fVarH2 = g21.H(p3fVarI0, fValueOf, fValueOf2, grdVar2, y6fVar, l46Var, 0);
            yye yyeVar5 = (yye) s3fVar.a();
            l46Var.f0(1840054703);
            int iOrdinal7 = yyeVar5.ordinal();
            if (iOrdinal7 == 0 || iOrdinal7 == 1) {
                f4 = 0.0f;
            } else {
                if (iOrdinal7 != 2) {
                    ap.c();
                    return;
                }
                f4 = 1.0f;
            }
            l46Var.r(false);
            Float fValueOf3 = Float.valueOf(f4);
            yye yyeVar6 = (yye) vz9Var.getValue();
            l46Var.f0(1840054703);
            int iOrdinal8 = yyeVar6.ordinal();
            if (iOrdinal8 != 0 && iOrdinal8 != 1) {
                if (iOrdinal8 != 2) {
                    ap.c();
                    return;
                }
                f5 = 1.0f;
            }
            l46Var.r(false);
            Float fValueOf4 = Float.valueOf(f5);
            i3f i3fVarF2 = p3fVarI0.f();
            l46Var.f0(630790831);
            if (i3fVarF2.b() == yyeVar4) {
                ze5VarZ = b21.O();
            } else {
                if (i3fVarF2.d() == yyeVar4) {
                    grdVar = new grd(100);
                }
                l46Var.r(false);
                k3fVarH = g21.H(p3fVarI0, fValueOf3, fValueOf4, grdVar, y6fVar, l46Var, 0);
                objR = l46Var.R();
                i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = new my1();
                    l46Var.p0(objR);
                }
                my1Var = (my1) objR;
                if (yyeVar == yyeVar4) {
                    j = qy1Var.b;
                } else {
                    j = qy1Var.a;
                }
                h0eVarA = qkd.a(j, qy1.a(yyeVar, l46Var), null, l46Var, 0, 12);
                l46Var3 = l46Var;
                if (z2) {
                    iOrdinal4 = yyeVar.ordinal();
                    if (iOrdinal4 == 0) {
                        j2 = qy1Var.c;
                    } else if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            ap.c();
                            return;
                        }
                        j2 = qy1Var.c;
                    } else {
                        j2 = qy1Var.d;
                    }
                } else {
                    iOrdinal = yyeVar.ordinal();
                    if (iOrdinal != 0) {
                        j2 = qy1Var.e;
                    } else if (iOrdinal != 1) {
                        j2 = qy1Var.f;
                    } else {
                        if (iOrdinal == 2) {
                            ap.c();
                            return;
                        }
                        j2 = qy1Var.g;
                    }
                }
                if (z2) {
                    l46Var3.f0(496051715);
                    h0eVarI = qkd.a(j2, qy1.a(yyeVar, l46Var3), null, l46Var, 0, 12);
                    l46Var3 = l46Var;
                    l46Var3.r(false);
                } else {
                    l46Var3.f0(496141925);
                    h0eVarI = q1c.i(new y72(j2), l46Var3);
                    l46Var3.r(false);
                }
                if (z2) {
                    iOrdinal3 = yyeVar.ordinal();
                    if (iOrdinal3 == 0) {
                        j3 = qy1Var.h;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            ap.c();
                            return;
                        }
                        j3 = qy1Var.h;
                    } else {
                        j3 = qy1Var.i;
                    }
                } else {
                    iOrdinal2 = yyeVar.ordinal();
                    if (iOrdinal2 != 0) {
                        j3 = qy1Var.j;
                    } else if (iOrdinal2 != 1) {
                        j3 = qy1Var.k;
                    } else {
                        if (iOrdinal2 == 2) {
                            ap.c();
                            return;
                        }
                        j3 = qy1Var.l;
                    }
                }
                if (z2) {
                    l46Var3.f0(633231558);
                    h0eVarI2 = qkd.a(j3, qy1.a(yyeVar, l46Var3), null, l46Var, 0, 12);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                } else {
                    long j4 = j3;
                    l46Var2 = l46Var3;
                    l46Var2.f0(633321768);
                    h0eVarI2 = q1c.i(new y72(j4), l46Var2);
                    l46Var2.r(false);
                }
                j09 j09VarH = b.h(b.s(j09Var, ndb.f, 2), 20.0f);
                zG = l46Var2.g(h0eVarI) | l46Var2.g(h0eVarI2) | l46Var2.i(d5eVar2) | l46Var2.g(h0eVarA) | l46Var2.g(k3fVarH2) | l46Var2.g(k3fVarH) | l46Var2.i(d5eVar);
                objR2 = l46Var2.R();
                if (zG || objR2 == i8cVar) {
                    sy1 sy1Var = new sy1(h0eVarI, h0eVarI2, d5eVar2, h0eVarA, k3fVarH2, k3fVarH, d5eVar, my1Var);
                    l46Var2.p0(sy1Var);
                    objR2 = sy1Var;
                }
                nk8.e(0, (a26) objR2, l46Var2, j09VarH);
            }
            grdVar = ze5VarZ;
            l46Var.r(false);
            k3fVarH = g21.H(p3fVarI0, fValueOf3, fValueOf4, grdVar, y6fVar, l46Var, 0);
            objR = l46Var.R();
            i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new my1();
                l46Var.p0(objR);
            }
            my1Var = (my1) objR;
            if (yyeVar == yyeVar4) {
                j = qy1Var.b;
            } else {
                j = qy1Var.a;
            }
            h0eVarA = qkd.a(j, qy1.a(yyeVar, l46Var), null, l46Var, 0, 12);
            l46Var3 = l46Var;
            if (z2) {
                iOrdinal4 = yyeVar.ordinal();
                if (iOrdinal4 == 0) {
                    j2 = qy1Var.c;
                } else if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        ap.c();
                        return;
                    }
                    j2 = qy1Var.c;
                } else {
                    j2 = qy1Var.d;
                }
            } else {
                iOrdinal = yyeVar.ordinal();
                if (iOrdinal != 0) {
                    j2 = qy1Var.e;
                } else if (iOrdinal != 1) {
                    j2 = qy1Var.f;
                } else {
                    if (iOrdinal == 2) {
                        ap.c();
                        return;
                    }
                    j2 = qy1Var.g;
                }
            }
            if (z2) {
                l46Var3.f0(496051715);
                h0eVarI = qkd.a(j2, qy1.a(yyeVar, l46Var3), null, l46Var, 0, 12);
                l46Var3 = l46Var;
                l46Var3.r(false);
            } else {
                l46Var3.f0(496141925);
                h0eVarI = q1c.i(new y72(j2), l46Var3);
                l46Var3.r(false);
            }
            if (z2) {
                iOrdinal3 = yyeVar.ordinal();
                if (iOrdinal3 == 0) {
                    j3 = qy1Var.h;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        ap.c();
                        return;
                    }
                    j3 = qy1Var.h;
                } else {
                    j3 = qy1Var.i;
                }
            } else {
                iOrdinal2 = yyeVar.ordinal();
                if (iOrdinal2 != 0) {
                    j3 = qy1Var.j;
                } else if (iOrdinal2 != 1) {
                    j3 = qy1Var.k;
                } else {
                    if (iOrdinal2 == 2) {
                        ap.c();
                        return;
                    }
                    j3 = qy1Var.l;
                }
            }
            if (z2) {
                l46Var3.f0(633231558);
                h0eVarI2 = qkd.a(j3, qy1.a(yyeVar, l46Var3), null, l46Var, 0, 12);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                long j5 = j3;
                l46Var2 = l46Var3;
                l46Var2.f0(633321768);
                h0eVarI2 = q1c.i(new y72(j5), l46Var2);
                l46Var2.r(false);
            }
            j09 j09VarH2 = b.h(b.s(j09Var, ndb.f, 2), 20.0f);
            zG = l46Var2.g(h0eVarI) | l46Var2.g(h0eVarI2) | l46Var2.i(d5eVar2) | l46Var2.g(h0eVarA) | l46Var2.g(k3fVarH2) | l46Var2.g(k3fVarH) | l46Var2.i(d5eVar);
            objR2 = l46Var2.R();
            if (zG) {
                sy1 sy1Var2 = new sy1(h0eVarI, h0eVarI2, d5eVar2, h0eVarA, k3fVarH2, k3fVarH, d5eVar, my1Var);
                l46Var2.p0(sy1Var2);
                objR2 = sy1Var2;
            } else {
                sy1 sy1Var3 = new sy1(h0eVarI, h0eVarI2, d5eVar2, h0eVarA, k3fVarH2, k3fVarH, d5eVar, my1Var);
                l46Var2.p0(sy1Var3);
                objR2 = sy1Var3;
            }
            nk8.e(0, (a26) objR2, l46Var2, j09VarH2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(z2, yyeVar, j09Var, qy1Var, d5eVar, d5eVar2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0182 A[LOOP:0: B:96:0x0161->B:101:0x0182, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:105:0x0191  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a2 A[LOOP:1: B:107:0x01a0->B:108:0x01a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:117:0x0214  */
    /* JADX WARN: Code duplicated, block: B:119:0x022a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0234  */
    /* JADX WARN: Code duplicated, block: B:125:0x0253  */
    /* JADX WARN: Code duplicated, block: B:128:0x025f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0187 A[EDGE_INSN: B:131:0x0187->B:103:0x0187 BREAK  A[LOOP:0: B:96:0x0161->B:101:0x0182], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    /* JADX WARN: Code duplicated, block: B:88:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x012c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0143  */
    /* JADX WARN: Code duplicated, block: B:95:0x0156  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    public static final void e(n3f n3fVar, j09 j09Var, ze5 ze5Var, a26 a26Var, n26 n26Var, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        ze5 ze5VarT;
        int i4;
        int i5;
        a26 a26Var2;
        int i6;
        boolean z2;
        j09 j09Var3;
        a26 a26Var3;
        ze5 ze5Var2;
        ojb ojbVarV;
        j09 j09Var4;
        Object obj;
        a26 a26Var4;
        Object objR;
        Object obj2;
        jsd jsdVar;
        Object objR2;
        w79 w79Var;
        s3f s3fVar;
        vz9 vz9Var;
        int size;
        int i7;
        l26 l26Var;
        ListIterator listIterator;
        int i8;
        ql6 ql6Var;
        int size2;
        int i9;
        boolean z3;
        Object objR3;
        Object objR4;
        int i10;
        l46Var.h0(-1877370462);
        int i11 = (i & 6) == 0 ? (l46Var.g(n3fVar) ? 4 : 2) | i : i;
        int i12 = i2 & 1;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                j09Var2 = j09Var;
                i11 |= l46Var.g(j09Var2) ? 32 : 16;
            }
            i3 = i2 & 2;
            if (i3 != 0) {
                if ((i & 384) == 0) {
                    ze5VarT = ze5Var;
                    if (l46Var.i(ze5VarT)) {
                        i4 = 256;
                    } else {
                        i4 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i11 |= i4;
                }
                i5 = i2 & 4;
                if (i5 != 0) {
                    if ((i & 3072) == 0) {
                        a26Var2 = a26Var;
                        if (l46Var.i(a26Var2)) {
                            i6 = 2048;
                        } else {
                            i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        i11 |= i6;
                    }
                    if ((i & 24576) == 0) {
                        if (l46Var.i(n26Var)) {
                            i10 = 16384;
                        } else {
                            i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i11 |= i10;
                    }
                    if ((i11 & 9363) != 9362) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i11 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i3 != 0) {
                            ze5VarT = b21.T(0, 0, null, 7);
                        }
                        obj = sf2.a;
                        if (i5 != 0) {
                            objR4 = l46Var.R();
                            if (objR4 == obj) {
                                objR4 = xx.Y;
                                l46Var.p0(objR4);
                            }
                            a26Var4 = (a26) objR4;
                        } else {
                            a26Var4 = a26Var2;
                        }
                        objR = l46Var.R();
                        obj2 = objR;
                        if (objR == obj) {
                            jsd jsdVar2 = new jsd();
                            jsdVar2.add(n3fVar.a.a());
                            l46Var.p0(jsdVar2);
                            obj2 = jsdVar2;
                        }
                        jsdVar = (jsd) obj2;
                        objR2 = l46Var.R();
                        if (objR2 == obj) {
                            long[] jArr = jec.a;
                            objR2 = new w79();
                            l46Var.p0(objR2);
                        }
                        w79Var = (w79) objR2;
                        s3fVar = n3fVar.a;
                        vz9Var = n3fVar.d;
                        if (pa7.t(s3fVar.a(), vz9Var.getValue())) {
                            l46Var.f0(321145192);
                            if (jsdVar.size() == 1 || !pa7.t(jsdVar.get(0), vz9Var.getValue())) {
                                l46Var.f0(321279546);
                                if ((i11 & 14) == 4) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                objR3 = l46Var.R();
                                if (z3 || objR3 == obj) {
                                    objR3 = new f03(n3fVar);
                                    l46Var.p0(objR3);
                                }
                                x72.i0((a26) objR3, jsdVar);
                                w79Var.a();
                                l46Var.r(false);
                            } else {
                                l46Var.f0(321469824);
                                l46Var.r(false);
                            }
                            l46Var.r(false);
                        } else {
                            l46Var.f0(321475776);
                            l46Var.r(false);
                        }
                        if (w79Var.b(vz9Var.getValue())) {
                            l46Var.f0(322279296);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(321536443);
                            listIterator = jsdVar.listIterator();
                            i8 = 0;
                            while (true) {
                                ql6Var = (ql6) listIterator;
                                if (ql6Var.hasNext()) {
                                    i8 = -1;
                                    break;
                                } else if (pa7.t(a26Var4.d(ql6Var.next()), a26Var4.d(vz9Var.getValue()))) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                            if (i8 == -1) {
                                jsdVar.add(vz9Var.getValue());
                            } else {
                                jsdVar.set(i8, vz9Var.getValue());
                            }
                            w79Var.a();
                            size2 = jsdVar.size();
                            for (i9 = 0; i9 < size2; i9++) {
                                Object obj3 = jsdVar.get(i9);
                                w79Var.m(obj3, af1.b0(-934471669, new j03(n3fVar, ze5VarT, obj3, n26Var), l46Var));
                            }
                            l46Var.r(false);
                        }
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ = m93.J(l46Var, j09Var4);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8VarC);
                        dec.l(hj6.y, l46Var, u8aVarM);
                        dec.h(l46Var, Integer.valueOf(iHashCode));
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ);
                        l46Var.f0(-1312707512);
                        size = jsdVar.size();
                        for (i7 = 0; i7 < size; i7++) {
                            Object obj4 = jsdVar.get(i7);
                            l46Var.d0(1171574969, a26Var4.d(obj4));
                            l26Var = (l26) w79Var.g(obj4);
                            if (l26Var == null) {
                                l46Var.f0(1959122128);
                            } else {
                                l46Var.f0(1171576145);
                                l26Var.z(l46Var, 0);
                            }
                            l46Var.r(false);
                            l46Var.r(false);
                        }
                        l46Var.r(false);
                        l46Var.r(true);
                        j09Var3 = j09Var4;
                        a26Var3 = a26Var4;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        a26Var3 = a26Var2;
                    }
                    ze5Var2 = ze5VarT;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new k03(n3fVar, j09Var3, ze5Var2, a26Var3, n26Var, i, i2);
                    }
                }
                i11 |= 3072;
                a26Var2 = a26Var;
                if ((i & 24576) == 0) {
                    if (l46Var.i(n26Var)) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i11 |= i10;
                }
                if ((i11 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i11 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i3 != 0) {
                        ze5VarT = b21.T(0, 0, null, 7);
                    }
                    obj = sf2.a;
                    if (i5 != 0) {
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = xx.Y;
                            l46Var.p0(objR4);
                        }
                        a26Var4 = (a26) objR4;
                    } else {
                        a26Var4 = a26Var2;
                    }
                    objR = l46Var.R();
                    obj2 = objR;
                    if (objR == obj) {
                        jsd jsdVar3 = new jsd();
                        jsdVar3.add(n3fVar.a.a());
                        l46Var.p0(jsdVar3);
                        obj2 = jsdVar3;
                    }
                    jsdVar = (jsd) obj2;
                    objR2 = l46Var.R();
                    if (objR2 == obj) {
                        long[] jArr2 = jec.a;
                        objR2 = new w79();
                        l46Var.p0(objR2);
                    }
                    w79Var = (w79) objR2;
                    s3fVar = n3fVar.a;
                    vz9Var = n3fVar.d;
                    if (pa7.t(s3fVar.a(), vz9Var.getValue())) {
                        l46Var.f0(321145192);
                        if (jsdVar.size() == 1) {
                            l46Var.f0(321279546);
                            if ((i11 & 14) == 4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objR3 = l46Var.R();
                            if (z3) {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            } else {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            }
                            x72.i0((a26) objR3, jsdVar);
                            w79Var.a();
                            l46Var.r(false);
                        } else {
                            l46Var.f0(321279546);
                            if ((i11 & 14) == 4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objR3 = l46Var.R();
                            if (z3) {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            } else {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            }
                            x72.i0((a26) objR3, jsdVar);
                            w79Var.a();
                            l46Var.r(false);
                        }
                        l46Var.r(false);
                    } else {
                        l46Var.f0(321475776);
                        l46Var.r(false);
                    }
                    if (w79Var.b(vz9Var.getValue())) {
                        l46Var.f0(321536443);
                        listIterator = jsdVar.listIterator();
                        i8 = 0;
                        while (true) {
                            ql6Var = (ql6) listIterator;
                            if (ql6Var.hasNext()) {
                                i8 = -1;
                                break;
                            } else {
                                if (pa7.t(a26Var4.d(ql6Var.next()), a26Var4.d(vz9Var.getValue()))) {
                                    break;
                                    break;
                                }
                                i8++;
                            }
                        }
                        if (i8 == -1) {
                            jsdVar.add(vz9Var.getValue());
                        } else {
                            jsdVar.set(i8, vz9Var.getValue());
                        }
                        w79Var.a();
                        size2 = jsdVar.size();
                        while (i9 < size2) {
                            Object obj5 = jsdVar.get(i9);
                            w79Var.m(obj5, af1.b0(-934471669, new j03(n3fVar, ze5VarT, obj5, n26Var), l46Var));
                        }
                        l46Var.r(false);
                    } else {
                        l46Var.f0(322279296);
                        l46Var.r(false);
                    }
                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09Var4);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC2);
                    dec.l(hj6.y, l46Var, u8aVarM2);
                    dec.h(l46Var, Integer.valueOf(iHashCode2));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ2);
                    l46Var.f0(-1312707512);
                    size = jsdVar.size();
                    while (i7 < size) {
                        Object obj6 = jsdVar.get(i7);
                        l46Var.d0(1171574969, a26Var4.d(obj6));
                        l26Var = (l26) w79Var.g(obj6);
                        if (l26Var == null) {
                            l46Var.f0(1959122128);
                        } else {
                            l46Var.f0(1171576145);
                            l26Var.z(l46Var, 0);
                        }
                        l46Var.r(false);
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                    l46Var.r(true);
                    j09Var3 = j09Var4;
                    a26Var3 = a26Var4;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    a26Var3 = a26Var2;
                }
                ze5Var2 = ze5VarT;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new k03(n3fVar, j09Var3, ze5Var2, a26Var3, n26Var, i, i2);
                }
            }
            i11 |= 384;
            ze5VarT = ze5Var;
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    a26Var2 = a26Var;
                    if (l46Var.i(a26Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i11 |= i6;
                }
                if ((i & 24576) == 0) {
                    if (l46Var.i(n26Var)) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i11 |= i10;
                }
                if ((i11 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i11 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i3 != 0) {
                        ze5VarT = b21.T(0, 0, null, 7);
                    }
                    obj = sf2.a;
                    if (i5 != 0) {
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = xx.Y;
                            l46Var.p0(objR4);
                        }
                        a26Var4 = (a26) objR4;
                    } else {
                        a26Var4 = a26Var2;
                    }
                    objR = l46Var.R();
                    obj2 = objR;
                    if (objR == obj) {
                        jsd jsdVar4 = new jsd();
                        jsdVar4.add(n3fVar.a.a());
                        l46Var.p0(jsdVar4);
                        obj2 = jsdVar4;
                    }
                    jsdVar = (jsd) obj2;
                    objR2 = l46Var.R();
                    if (objR2 == obj) {
                        long[] jArr3 = jec.a;
                        objR2 = new w79();
                        l46Var.p0(objR2);
                    }
                    w79Var = (w79) objR2;
                    s3fVar = n3fVar.a;
                    vz9Var = n3fVar.d;
                    if (pa7.t(s3fVar.a(), vz9Var.getValue())) {
                        l46Var.f0(321145192);
                        if (jsdVar.size() == 1) {
                            l46Var.f0(321279546);
                            if ((i11 & 14) == 4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objR3 = l46Var.R();
                            if (z3) {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            } else {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            }
                            x72.i0((a26) objR3, jsdVar);
                            w79Var.a();
                            l46Var.r(false);
                        } else {
                            l46Var.f0(321279546);
                            if ((i11 & 14) == 4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objR3 = l46Var.R();
                            if (z3) {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            } else {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            }
                            x72.i0((a26) objR3, jsdVar);
                            w79Var.a();
                            l46Var.r(false);
                        }
                        l46Var.r(false);
                    } else {
                        l46Var.f0(321475776);
                        l46Var.r(false);
                    }
                    if (w79Var.b(vz9Var.getValue())) {
                        l46Var.f0(321536443);
                        listIterator = jsdVar.listIterator();
                        i8 = 0;
                        while (true) {
                            ql6Var = (ql6) listIterator;
                            if (ql6Var.hasNext()) {
                                i8 = -1;
                                break;
                            } else {
                                if (pa7.t(a26Var4.d(ql6Var.next()), a26Var4.d(vz9Var.getValue()))) {
                                    break;
                                    break;
                                }
                                i8++;
                            }
                        }
                        if (i8 == -1) {
                            jsdVar.add(vz9Var.getValue());
                        } else {
                            jsdVar.set(i8, vz9Var.getValue());
                        }
                        w79Var.a();
                        size2 = jsdVar.size();
                        while (i9 < size2) {
                            Object obj7 = jsdVar.get(i9);
                            w79Var.m(obj7, af1.b0(-934471669, new j03(n3fVar, ze5VarT, obj7, n26Var), l46Var));
                        }
                        l46Var.r(false);
                    } else {
                        l46Var.f0(322279296);
                        l46Var.r(false);
                    }
                    xn8 xn8VarC3 = s21.c(ndb.b, false);
                    int iHashCode3 = Long.hashCode(l46Var.T);
                    u8a u8aVarM3 = l46Var.m();
                    j09 j09VarJ3 = m93.J(l46Var, j09Var4);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC3);
                    dec.l(hj6.y, l46Var, u8aVarM3);
                    dec.h(l46Var, Integer.valueOf(iHashCode3));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ3);
                    l46Var.f0(-1312707512);
                    size = jsdVar.size();
                    while (i7 < size) {
                        Object obj8 = jsdVar.get(i7);
                        l46Var.d0(1171574969, a26Var4.d(obj8));
                        l26Var = (l26) w79Var.g(obj8);
                        if (l26Var == null) {
                            l46Var.f0(1959122128);
                        } else {
                            l46Var.f0(1171576145);
                            l26Var.z(l46Var, 0);
                        }
                        l46Var.r(false);
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                    l46Var.r(true);
                    j09Var3 = j09Var4;
                    a26Var3 = a26Var4;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    a26Var3 = a26Var2;
                }
                ze5Var2 = ze5VarT;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new k03(n3fVar, j09Var3, ze5Var2, a26Var3, n26Var, i, i2);
                }
            }
            i11 |= 3072;
            a26Var2 = a26Var;
            if ((i & 24576) == 0) {
                if (l46Var.i(n26Var)) {
                    i10 = 16384;
                } else {
                    i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i11 |= i10;
            }
            if ((i11 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i11 & 1, z2)) {
                if (i12 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i3 != 0) {
                    ze5VarT = b21.T(0, 0, null, 7);
                }
                obj = sf2.a;
                if (i5 != 0) {
                    objR4 = l46Var.R();
                    if (objR4 == obj) {
                        objR4 = xx.Y;
                        l46Var.p0(objR4);
                    }
                    a26Var4 = (a26) objR4;
                } else {
                    a26Var4 = a26Var2;
                }
                objR = l46Var.R();
                obj2 = objR;
                if (objR == obj) {
                    jsd jsdVar5 = new jsd();
                    jsdVar5.add(n3fVar.a.a());
                    l46Var.p0(jsdVar5);
                    obj2 = jsdVar5;
                }
                jsdVar = (jsd) obj2;
                objR2 = l46Var.R();
                if (objR2 == obj) {
                    long[] jArr4 = jec.a;
                    objR2 = new w79();
                    l46Var.p0(objR2);
                }
                w79Var = (w79) objR2;
                s3fVar = n3fVar.a;
                vz9Var = n3fVar.d;
                if (pa7.t(s3fVar.a(), vz9Var.getValue())) {
                    l46Var.f0(321145192);
                    if (jsdVar.size() == 1) {
                        l46Var.f0(321279546);
                        if ((i11 & 14) == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objR3 = l46Var.R();
                        if (z3) {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        } else {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        }
                        x72.i0((a26) objR3, jsdVar);
                        w79Var.a();
                        l46Var.r(false);
                    } else {
                        l46Var.f0(321279546);
                        if ((i11 & 14) == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objR3 = l46Var.R();
                        if (z3) {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        } else {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        }
                        x72.i0((a26) objR3, jsdVar);
                        w79Var.a();
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(321475776);
                    l46Var.r(false);
                }
                if (w79Var.b(vz9Var.getValue())) {
                    l46Var.f0(321536443);
                    listIterator = jsdVar.listIterator();
                    i8 = 0;
                    while (true) {
                        ql6Var = (ql6) listIterator;
                        if (ql6Var.hasNext()) {
                            i8 = -1;
                            break;
                        } else {
                            if (pa7.t(a26Var4.d(ql6Var.next()), a26Var4.d(vz9Var.getValue()))) {
                                break;
                                break;
                            }
                            i8++;
                        }
                    }
                    if (i8 == -1) {
                        jsdVar.add(vz9Var.getValue());
                    } else {
                        jsdVar.set(i8, vz9Var.getValue());
                    }
                    w79Var.a();
                    size2 = jsdVar.size();
                    while (i9 < size2) {
                        Object obj9 = jsdVar.get(i9);
                        w79Var.m(obj9, af1.b0(-934471669, new j03(n3fVar, ze5VarT, obj9, n26Var), l46Var));
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(322279296);
                    l46Var.r(false);
                }
                xn8 xn8VarC4 = s21.c(ndb.b, false);
                int iHashCode4 = Long.hashCode(l46Var.T);
                u8a u8aVarM4 = l46Var.m();
                j09 j09VarJ4 = m93.J(l46Var, j09Var4);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC4);
                dec.l(hj6.y, l46Var, u8aVarM4);
                dec.h(l46Var, Integer.valueOf(iHashCode4));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ4);
                l46Var.f0(-1312707512);
                size = jsdVar.size();
                while (i7 < size) {
                    Object obj10 = jsdVar.get(i7);
                    l46Var.d0(1171574969, a26Var4.d(obj10));
                    l26Var = (l26) w79Var.g(obj10);
                    if (l26Var == null) {
                        l46Var.f0(1959122128);
                    } else {
                        l46Var.f0(1171576145);
                        l26Var.z(l46Var, 0);
                    }
                    l46Var.r(false);
                    l46Var.r(false);
                }
                l46Var.r(false);
                l46Var.r(true);
                j09Var3 = j09Var4;
                a26Var3 = a26Var4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                a26Var3 = a26Var2;
            }
            ze5Var2 = ze5VarT;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new k03(n3fVar, j09Var3, ze5Var2, a26Var3, n26Var, i, i2);
            }
        }
        i11 |= 48;
        j09Var2 = j09Var;
        i3 = i2 & 2;
        if (i3 != 0) {
            if ((i & 384) == 0) {
                ze5VarT = ze5Var;
                if (l46Var.i(ze5VarT)) {
                    i4 = 256;
                } else {
                    i4 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i11 |= i4;
            }
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    a26Var2 = a26Var;
                    if (l46Var.i(a26Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i11 |= i6;
                }
                if ((i & 24576) == 0) {
                    if (l46Var.i(n26Var)) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i11 |= i10;
                }
                if ((i11 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i11 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i3 != 0) {
                        ze5VarT = b21.T(0, 0, null, 7);
                    }
                    obj = sf2.a;
                    if (i5 != 0) {
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = xx.Y;
                            l46Var.p0(objR4);
                        }
                        a26Var4 = (a26) objR4;
                    } else {
                        a26Var4 = a26Var2;
                    }
                    objR = l46Var.R();
                    obj2 = objR;
                    if (objR == obj) {
                        jsd jsdVar6 = new jsd();
                        jsdVar6.add(n3fVar.a.a());
                        l46Var.p0(jsdVar6);
                        obj2 = jsdVar6;
                    }
                    jsdVar = (jsd) obj2;
                    objR2 = l46Var.R();
                    if (objR2 == obj) {
                        long[] jArr5 = jec.a;
                        objR2 = new w79();
                        l46Var.p0(objR2);
                    }
                    w79Var = (w79) objR2;
                    s3fVar = n3fVar.a;
                    vz9Var = n3fVar.d;
                    if (pa7.t(s3fVar.a(), vz9Var.getValue())) {
                        l46Var.f0(321145192);
                        if (jsdVar.size() == 1) {
                            l46Var.f0(321279546);
                            if ((i11 & 14) == 4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objR3 = l46Var.R();
                            if (z3) {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            } else {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            }
                            x72.i0((a26) objR3, jsdVar);
                            w79Var.a();
                            l46Var.r(false);
                        } else {
                            l46Var.f0(321279546);
                            if ((i11 & 14) == 4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objR3 = l46Var.R();
                            if (z3) {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            } else {
                                objR3 = new f03(n3fVar);
                                l46Var.p0(objR3);
                            }
                            x72.i0((a26) objR3, jsdVar);
                            w79Var.a();
                            l46Var.r(false);
                        }
                        l46Var.r(false);
                    } else {
                        l46Var.f0(321475776);
                        l46Var.r(false);
                    }
                    if (w79Var.b(vz9Var.getValue())) {
                        l46Var.f0(321536443);
                        listIterator = jsdVar.listIterator();
                        i8 = 0;
                        while (true) {
                            ql6Var = (ql6) listIterator;
                            if (ql6Var.hasNext()) {
                                i8 = -1;
                                break;
                            } else {
                                if (pa7.t(a26Var4.d(ql6Var.next()), a26Var4.d(vz9Var.getValue()))) {
                                    break;
                                    break;
                                }
                                i8++;
                            }
                        }
                        if (i8 == -1) {
                            jsdVar.add(vz9Var.getValue());
                        } else {
                            jsdVar.set(i8, vz9Var.getValue());
                        }
                        w79Var.a();
                        size2 = jsdVar.size();
                        while (i9 < size2) {
                            Object obj11 = jsdVar.get(i9);
                            w79Var.m(obj11, af1.b0(-934471669, new j03(n3fVar, ze5VarT, obj11, n26Var), l46Var));
                        }
                        l46Var.r(false);
                    } else {
                        l46Var.f0(322279296);
                        l46Var.r(false);
                    }
                    xn8 xn8VarC5 = s21.c(ndb.b, false);
                    int iHashCode5 = Long.hashCode(l46Var.T);
                    u8a u8aVarM5 = l46Var.m();
                    j09 j09VarJ5 = m93.J(l46Var, j09Var4);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC5);
                    dec.l(hj6.y, l46Var, u8aVarM5);
                    dec.h(l46Var, Integer.valueOf(iHashCode5));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ5);
                    l46Var.f0(-1312707512);
                    size = jsdVar.size();
                    while (i7 < size) {
                        Object obj12 = jsdVar.get(i7);
                        l46Var.d0(1171574969, a26Var4.d(obj12));
                        l26Var = (l26) w79Var.g(obj12);
                        if (l26Var == null) {
                            l46Var.f0(1959122128);
                        } else {
                            l46Var.f0(1171576145);
                            l26Var.z(l46Var, 0);
                        }
                        l46Var.r(false);
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                    l46Var.r(true);
                    j09Var3 = j09Var4;
                    a26Var3 = a26Var4;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    a26Var3 = a26Var2;
                }
                ze5Var2 = ze5VarT;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new k03(n3fVar, j09Var3, ze5Var2, a26Var3, n26Var, i, i2);
                }
            }
            i11 |= 3072;
            a26Var2 = a26Var;
            if ((i & 24576) == 0) {
                if (l46Var.i(n26Var)) {
                    i10 = 16384;
                } else {
                    i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i11 |= i10;
            }
            if ((i11 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i11 & 1, z2)) {
                if (i12 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i3 != 0) {
                    ze5VarT = b21.T(0, 0, null, 7);
                }
                obj = sf2.a;
                if (i5 != 0) {
                    objR4 = l46Var.R();
                    if (objR4 == obj) {
                        objR4 = xx.Y;
                        l46Var.p0(objR4);
                    }
                    a26Var4 = (a26) objR4;
                } else {
                    a26Var4 = a26Var2;
                }
                objR = l46Var.R();
                obj2 = objR;
                if (objR == obj) {
                    jsd jsdVar7 = new jsd();
                    jsdVar7.add(n3fVar.a.a());
                    l46Var.p0(jsdVar7);
                    obj2 = jsdVar7;
                }
                jsdVar = (jsd) obj2;
                objR2 = l46Var.R();
                if (objR2 == obj) {
                    long[] jArr6 = jec.a;
                    objR2 = new w79();
                    l46Var.p0(objR2);
                }
                w79Var = (w79) objR2;
                s3fVar = n3fVar.a;
                vz9Var = n3fVar.d;
                if (pa7.t(s3fVar.a(), vz9Var.getValue())) {
                    l46Var.f0(321145192);
                    if (jsdVar.size() == 1) {
                        l46Var.f0(321279546);
                        if ((i11 & 14) == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objR3 = l46Var.R();
                        if (z3) {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        } else {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        }
                        x72.i0((a26) objR3, jsdVar);
                        w79Var.a();
                        l46Var.r(false);
                    } else {
                        l46Var.f0(321279546);
                        if ((i11 & 14) == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objR3 = l46Var.R();
                        if (z3) {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        } else {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        }
                        x72.i0((a26) objR3, jsdVar);
                        w79Var.a();
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(321475776);
                    l46Var.r(false);
                }
                if (w79Var.b(vz9Var.getValue())) {
                    l46Var.f0(321536443);
                    listIterator = jsdVar.listIterator();
                    i8 = 0;
                    while (true) {
                        ql6Var = (ql6) listIterator;
                        if (ql6Var.hasNext()) {
                            i8 = -1;
                            break;
                        } else {
                            if (pa7.t(a26Var4.d(ql6Var.next()), a26Var4.d(vz9Var.getValue()))) {
                                break;
                                break;
                            }
                            i8++;
                        }
                    }
                    if (i8 == -1) {
                        jsdVar.add(vz9Var.getValue());
                    } else {
                        jsdVar.set(i8, vz9Var.getValue());
                    }
                    w79Var.a();
                    size2 = jsdVar.size();
                    while (i9 < size2) {
                        Object obj13 = jsdVar.get(i9);
                        w79Var.m(obj13, af1.b0(-934471669, new j03(n3fVar, ze5VarT, obj13, n26Var), l46Var));
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(322279296);
                    l46Var.r(false);
                }
                xn8 xn8VarC6 = s21.c(ndb.b, false);
                int iHashCode6 = Long.hashCode(l46Var.T);
                u8a u8aVarM6 = l46Var.m();
                j09 j09VarJ6 = m93.J(l46Var, j09Var4);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC6);
                dec.l(hj6.y, l46Var, u8aVarM6);
                dec.h(l46Var, Integer.valueOf(iHashCode6));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ6);
                l46Var.f0(-1312707512);
                size = jsdVar.size();
                while (i7 < size) {
                    Object obj14 = jsdVar.get(i7);
                    l46Var.d0(1171574969, a26Var4.d(obj14));
                    l26Var = (l26) w79Var.g(obj14);
                    if (l26Var == null) {
                        l46Var.f0(1959122128);
                    } else {
                        l46Var.f0(1171576145);
                        l26Var.z(l46Var, 0);
                    }
                    l46Var.r(false);
                    l46Var.r(false);
                }
                l46Var.r(false);
                l46Var.r(true);
                j09Var3 = j09Var4;
                a26Var3 = a26Var4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                a26Var3 = a26Var2;
            }
            ze5Var2 = ze5VarT;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new k03(n3fVar, j09Var3, ze5Var2, a26Var3, n26Var, i, i2);
            }
        }
        i11 |= 384;
        ze5VarT = ze5Var;
        i5 = i2 & 4;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                a26Var2 = a26Var;
                if (l46Var.i(a26Var2)) {
                    i6 = 2048;
                } else {
                    i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i11 |= i6;
            }
            if ((i & 24576) == 0) {
                if (l46Var.i(n26Var)) {
                    i10 = 16384;
                } else {
                    i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i11 |= i10;
            }
            if ((i11 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i11 & 1, z2)) {
                if (i12 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i3 != 0) {
                    ze5VarT = b21.T(0, 0, null, 7);
                }
                obj = sf2.a;
                if (i5 != 0) {
                    objR4 = l46Var.R();
                    if (objR4 == obj) {
                        objR4 = xx.Y;
                        l46Var.p0(objR4);
                    }
                    a26Var4 = (a26) objR4;
                } else {
                    a26Var4 = a26Var2;
                }
                objR = l46Var.R();
                obj2 = objR;
                if (objR == obj) {
                    jsd jsdVar8 = new jsd();
                    jsdVar8.add(n3fVar.a.a());
                    l46Var.p0(jsdVar8);
                    obj2 = jsdVar8;
                }
                jsdVar = (jsd) obj2;
                objR2 = l46Var.R();
                if (objR2 == obj) {
                    long[] jArr7 = jec.a;
                    objR2 = new w79();
                    l46Var.p0(objR2);
                }
                w79Var = (w79) objR2;
                s3fVar = n3fVar.a;
                vz9Var = n3fVar.d;
                if (pa7.t(s3fVar.a(), vz9Var.getValue())) {
                    l46Var.f0(321145192);
                    if (jsdVar.size() == 1) {
                        l46Var.f0(321279546);
                        if ((i11 & 14) == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objR3 = l46Var.R();
                        if (z3) {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        } else {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        }
                        x72.i0((a26) objR3, jsdVar);
                        w79Var.a();
                        l46Var.r(false);
                    } else {
                        l46Var.f0(321279546);
                        if ((i11 & 14) == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objR3 = l46Var.R();
                        if (z3) {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        } else {
                            objR3 = new f03(n3fVar);
                            l46Var.p0(objR3);
                        }
                        x72.i0((a26) objR3, jsdVar);
                        w79Var.a();
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(321475776);
                    l46Var.r(false);
                }
                if (w79Var.b(vz9Var.getValue())) {
                    l46Var.f0(321536443);
                    listIterator = jsdVar.listIterator();
                    i8 = 0;
                    while (true) {
                        ql6Var = (ql6) listIterator;
                        if (ql6Var.hasNext()) {
                            i8 = -1;
                            break;
                        } else {
                            if (pa7.t(a26Var4.d(ql6Var.next()), a26Var4.d(vz9Var.getValue()))) {
                                break;
                                break;
                            }
                            i8++;
                        }
                    }
                    if (i8 == -1) {
                        jsdVar.add(vz9Var.getValue());
                    } else {
                        jsdVar.set(i8, vz9Var.getValue());
                    }
                    w79Var.a();
                    size2 = jsdVar.size();
                    while (i9 < size2) {
                        Object obj15 = jsdVar.get(i9);
                        w79Var.m(obj15, af1.b0(-934471669, new j03(n3fVar, ze5VarT, obj15, n26Var), l46Var));
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(322279296);
                    l46Var.r(false);
                }
                xn8 xn8VarC7 = s21.c(ndb.b, false);
                int iHashCode7 = Long.hashCode(l46Var.T);
                u8a u8aVarM7 = l46Var.m();
                j09 j09VarJ7 = m93.J(l46Var, j09Var4);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC7);
                dec.l(hj6.y, l46Var, u8aVarM7);
                dec.h(l46Var, Integer.valueOf(iHashCode7));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ7);
                l46Var.f0(-1312707512);
                size = jsdVar.size();
                while (i7 < size) {
                    Object obj16 = jsdVar.get(i7);
                    l46Var.d0(1171574969, a26Var4.d(obj16));
                    l26Var = (l26) w79Var.g(obj16);
                    if (l26Var == null) {
                        l46Var.f0(1959122128);
                    } else {
                        l46Var.f0(1171576145);
                        l26Var.z(l46Var, 0);
                    }
                    l46Var.r(false);
                    l46Var.r(false);
                }
                l46Var.r(false);
                l46Var.r(true);
                j09Var3 = j09Var4;
                a26Var3 = a26Var4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                a26Var3 = a26Var2;
            }
            ze5Var2 = ze5VarT;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new k03(n3fVar, j09Var3, ze5Var2, a26Var3, n26Var, i, i2);
            }
        }
        i11 |= 3072;
        a26Var2 = a26Var;
        if ((i & 24576) == 0) {
            if (l46Var.i(n26Var)) {
                i10 = 16384;
            } else {
                i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i10;
        }
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i11 & 1, z2)) {
            if (i12 != 0) {
                j09Var4 = g09.a;
            } else {
                j09Var4 = j09Var2;
            }
            if (i3 != 0) {
                ze5VarT = b21.T(0, 0, null, 7);
            }
            obj = sf2.a;
            if (i5 != 0) {
                objR4 = l46Var.R();
                if (objR4 == obj) {
                    objR4 = xx.Y;
                    l46Var.p0(objR4);
                }
                a26Var4 = (a26) objR4;
            } else {
                a26Var4 = a26Var2;
            }
            objR = l46Var.R();
            obj2 = objR;
            if (objR == obj) {
                jsd jsdVar9 = new jsd();
                jsdVar9.add(n3fVar.a.a());
                l46Var.p0(jsdVar9);
                obj2 = jsdVar9;
            }
            jsdVar = (jsd) obj2;
            objR2 = l46Var.R();
            if (objR2 == obj) {
                long[] jArr8 = jec.a;
                objR2 = new w79();
                l46Var.p0(objR2);
            }
            w79Var = (w79) objR2;
            s3fVar = n3fVar.a;
            vz9Var = n3fVar.d;
            if (pa7.t(s3fVar.a(), vz9Var.getValue())) {
                l46Var.f0(321145192);
                if (jsdVar.size() == 1) {
                    l46Var.f0(321279546);
                    if ((i11 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objR3 = l46Var.R();
                    if (z3) {
                        objR3 = new f03(n3fVar);
                        l46Var.p0(objR3);
                    } else {
                        objR3 = new f03(n3fVar);
                        l46Var.p0(objR3);
                    }
                    x72.i0((a26) objR3, jsdVar);
                    w79Var.a();
                    l46Var.r(false);
                } else {
                    l46Var.f0(321279546);
                    if ((i11 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objR3 = l46Var.R();
                    if (z3) {
                        objR3 = new f03(n3fVar);
                        l46Var.p0(objR3);
                    } else {
                        objR3 = new f03(n3fVar);
                        l46Var.p0(objR3);
                    }
                    x72.i0((a26) objR3, jsdVar);
                    w79Var.a();
                    l46Var.r(false);
                }
                l46Var.r(false);
            } else {
                l46Var.f0(321475776);
                l46Var.r(false);
            }
            if (w79Var.b(vz9Var.getValue())) {
                l46Var.f0(321536443);
                listIterator = jsdVar.listIterator();
                i8 = 0;
                while (true) {
                    ql6Var = (ql6) listIterator;
                    if (ql6Var.hasNext()) {
                        i8 = -1;
                        break;
                    } else {
                        if (pa7.t(a26Var4.d(ql6Var.next()), a26Var4.d(vz9Var.getValue()))) {
                            break;
                            break;
                        }
                        i8++;
                    }
                }
                if (i8 == -1) {
                    jsdVar.add(vz9Var.getValue());
                } else {
                    jsdVar.set(i8, vz9Var.getValue());
                }
                w79Var.a();
                size2 = jsdVar.size();
                while (i9 < size2) {
                    Object obj17 = jsdVar.get(i9);
                    w79Var.m(obj17, af1.b0(-934471669, new j03(n3fVar, ze5VarT, obj17, n26Var), l46Var));
                }
                l46Var.r(false);
            } else {
                l46Var.f0(322279296);
                l46Var.r(false);
            }
            xn8 xn8VarC8 = s21.c(ndb.b, false);
            int iHashCode8 = Long.hashCode(l46Var.T);
            u8a u8aVarM8 = l46Var.m();
            j09 j09VarJ8 = m93.J(l46Var, j09Var4);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC8);
            dec.l(hj6.y, l46Var, u8aVarM8);
            dec.h(l46Var, Integer.valueOf(iHashCode8));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ8);
            l46Var.f0(-1312707512);
            size = jsdVar.size();
            while (i7 < size) {
                Object obj18 = jsdVar.get(i7);
                l46Var.d0(1171574969, a26Var4.d(obj18));
                l26Var = (l26) w79Var.g(obj18);
                if (l26Var == null) {
                    l46Var.f0(1959122128);
                } else {
                    l46Var.f0(1171576145);
                    l26Var.z(l46Var, 0);
                }
                l46Var.r(false);
                l46Var.r(false);
            }
            l46Var.r(false);
            l46Var.r(true);
            j09Var3 = j09Var4;
            a26Var3 = a26Var4;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            a26Var3 = a26Var2;
        }
        ze5Var2 = ze5VarT;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k03(n3fVar, j09Var3, ze5Var2, a26Var3, n26Var, i, i2);
        }
    }

    public static final void f(Object obj, j09 j09Var, ze5 ze5Var, String str, n26 n26Var, l46 l46Var, int i, int i2) {
        int i3;
        j09 j09Var2;
        ze5 ze5Var2;
        String str2;
        l46Var.h0(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? l46Var.g(obj) : l46Var.i(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= l46Var.g(j09Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= l46Var.i(ze5Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= l46Var.g(str) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i3 |= l46Var.i(n26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            if (i4 != 0) {
                j09Var = g09.a;
            }
            j09 j09Var3 = j09Var;
            ze5 ze5VarT = i5 != 0 ? b21.T(0, 0, null, 7) : ze5Var;
            String str3 = i6 != 0 ? "Crossfade" : str;
            e(g21.i0(obj, str3, l46Var, (i3 & 14) | ((i3 >> 6) & 112), 0), j09Var3, ze5VarT, null, n26Var, l46Var, i3 & 58352, 4);
            str2 = str3;
            ze5Var2 = ze5VarT;
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            ze5Var2 = ze5Var;
            str2 = str;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new e03(obj, j09Var2, ze5Var2, str2, n26Var, i, i2);
        }
    }

    public static final void g(Gender gender, a26 a26Var, x16 x16Var, l46 l46Var, int i) {
        l46Var.h0(2090856734);
        int i2 = 2;
        int i3 = (l46Var.e(gender.ordinal()) ? 4 : 2) | i | (l46Var.i(a26Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 14) == 4;
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = q1c.f(gender);
                l46Var.p0(objR);
            }
            xdc.a(b.c, af1.b0(-997938462, new m(3, x16Var), l46Var), null, null, null, 0, 0L, 0L, null, af1.b0(1692826477, new w7(i2, (e89) objR, a26Var), l46Var), l46Var, 805306422, 508);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i, gender, a26Var, x16Var, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:113:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x0174  */
    /* JADX WARN: Code duplicated, block: B:123:0x0179  */
    /* JADX WARN: Code duplicated, block: B:125:0x017d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0180  */
    /* JADX WARN: Code duplicated, block: B:130:0x0187  */
    /* JADX WARN: Code duplicated, block: B:131:0x0198  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:150:0x0251  */
    /* JADX WARN: Code duplicated, block: B:153:0x026a  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:44:0x006f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x0078  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:55:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0094  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x0103  */
    /* JADX WARN: Code duplicated, block: B:99:0x0119  */
    public static final void h(float f2, int i, int i2, int i3, kx0 kx0Var, dd2 dd2Var, l46 l46Var, j09 j09Var, pc9 pc9Var, lu9 lu9Var, xw9 xw9Var, fx9 fx9Var, yx9 yx9Var, ard ardVar, frd frdVar, boolean z2) {
        int i4;
        xw9 xw9Var2;
        int i5;
        fx9 fx9Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f3;
        int i11;
        int i12;
        kx0 kx0Var2;
        int i13;
        ard ardVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z3;
        boolean z4;
        j09 j09Var2;
        frd frdVar2;
        boolean z5;
        xw9 xw9Var3;
        fx9 fx9Var3;
        int i18;
        kx0 kx0Var3;
        pc9 pc9Var2;
        lu9 lu9Var2;
        ard ardVar3;
        float f4;
        ojb ojbVarV;
        j09 j09Var3;
        xw9 bx9Var;
        yx9 yx9Var2;
        ard ardVarV;
        boolean z6;
        int i19;
        cv7 cv7Var;
        boolean zE;
        Object objR;
        ard ardVar4;
        boolean z7;
        frd frdVar3;
        j09 j09Var4;
        xw9 xw9Var4;
        pc9 pc9Var3;
        lu9 lu9VarB;
        l46Var.h0(1860873769);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(yx9Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= l46Var.g(j09Var) ? 32 : 16;
        }
        int i21 = i3 & 4;
        if (i21 == 0) {
            if ((i2 & 384) == 0) {
                xw9Var2 = xw9Var;
                i4 |= l46Var.g(xw9Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    fx9Var2 = fx9Var;
                    if (l46Var.g(fx9Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        i8 = i;
                        if (l46Var.e(i8)) {
                            i9 = 16384;
                        } else {
                            i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                        if ((i2 & 196608) == 0) {
                            f3 = f2;
                            if (l46Var.d(f3)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i4 |= i11;
                        }
                        i12 = i3 & 64;
                        if (i12 != 0) {
                            if ((i2 & 1572864) == 0) {
                                kx0Var2 = kx0Var;
                                if (l46Var.g(kx0Var2)) {
                                    i13 = 1048576;
                                } else {
                                    i13 = 524288;
                                }
                                i4 |= i13;
                            }
                            if ((i2 & 12582912) == 0) {
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                                    ardVar2 = ardVar;
                                    int i22 = l46Var.g(ardVar2) ? 8388608 : 4194304;
                                    i4 |= i22;
                                } else {
                                    ardVar2 = ardVar;
                                }
                                i4 |= i22;
                            } else {
                                ardVar2 = ardVar;
                            }
                            i14 = i4;
                            i15 = i3 & 256;
                            if (i15 != 0) {
                                if ((i2 & 100663296) == 0) {
                                    if (l46Var.h(z2)) {
                                        i16 = 67108864;
                                    } else {
                                        i16 = 33554432;
                                    }
                                    i14 |= i16;
                                }
                                i17 = i14 | 805306368;
                                z3 = true;
                                if ((i17 & 306783379) == 306783378) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (l46Var.W(i17 & 1, z4)) {
                                    l46Var.b0();
                                    if ((i2 & 1) != 0 || l46Var.C()) {
                                        if (i20 != 0) {
                                            j09Var3 = g09.a;
                                        } else {
                                            j09Var3 = j09Var;
                                        }
                                        if (i21 != 0) {
                                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                        } else {
                                            bx9Var = xw9Var2;
                                        }
                                        if (i5 != 0) {
                                            fx9Var2 = hj6.U0;
                                        }
                                        if (i7 != 0) {
                                            i8 = 0;
                                        }
                                        if (i10 != 0) {
                                            f3 = 0.0f;
                                        }
                                        if (i12 != 0) {
                                            kx0Var2 = ndb.z;
                                        }
                                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                            yx9Var2 = yx9Var;
                                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                            i17 &= -29360129;
                                        } else {
                                            yx9Var2 = yx9Var;
                                            ardVarV = ardVar2;
                                        }
                                        if (i15 != 0) {
                                            z6 = true;
                                        } else {
                                            z6 = z2;
                                        }
                                        i19 = (i17 & 14) | 432;
                                        cv7Var = (cv7) l46Var.k(zg2.n);
                                        if ((((i19 & 14) ^ 6) > 4 || !l46Var.g(yx9Var2)) && (i19 & 6) != 4) {
                                        }
                                        zE = z3 | l46Var.e(cv7Var.ordinal());
                                        objR = l46Var.R();
                                        if (zE || objR == sf2.a) {
                                            objR = new bs3(yx9Var2, cv7Var);
                                            l46Var.p0(objR);
                                        }
                                        ardVar4 = ardVarV;
                                        z7 = z6;
                                        frdVar3 = gec.v;
                                        j09Var4 = j09Var3;
                                        xw9Var4 = bx9Var;
                                        pc9Var3 = (bs3) objR;
                                        lu9VarB = mu9.b(l46Var);
                                    } else {
                                        l46Var.Z();
                                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                            i17 &= -29360129;
                                        }
                                        j09Var4 = j09Var;
                                        pc9Var3 = pc9Var;
                                        lu9VarB = lu9Var;
                                        yx9Var2 = yx9Var;
                                        frdVar3 = frdVar;
                                        z7 = z2;
                                        xw9Var4 = xw9Var2;
                                        ardVar4 = ardVar2;
                                    }
                                    fx9 fx9Var4 = fx9Var2;
                                    int i23 = i8;
                                    kx0 kx0Var4 = kx0Var2;
                                    float f5 = f3;
                                    int i24 = i17;
                                    l46Var.s();
                                    int i25 = i24 >> 6;
                                    int i26 = i24 << 12;
                                    x57.v(f5, i23, ((i24 >> 3) & 14) | 24576 | ((i24 << 3) & 112) | (i24 & 896) | ((i24 >> 18) & 7168) | (458752 & i25) | (3670016 & i25) | (234881024 & i26) | (i26 & 1879048192), ((i24 >> 9) & 14) | 3456 | (57344 & i25) | 1769472, kx0Var4, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var4, yx9Var2, ardVar4, frdVar3, z7);
                                    f4 = f5;
                                    i18 = i23;
                                    kx0Var3 = kx0Var4;
                                    j09Var2 = j09Var4;
                                    pc9Var2 = pc9Var3;
                                    lu9Var2 = lu9VarB;
                                    xw9Var3 = xw9Var4;
                                    fx9Var3 = fx9Var4;
                                    ardVar3 = ardVar4;
                                    frdVar2 = frdVar3;
                                    z5 = z7;
                                } else {
                                    l46Var.Z();
                                    j09Var2 = j09Var;
                                    frdVar2 = frdVar;
                                    z5 = z2;
                                    xw9Var3 = xw9Var2;
                                    fx9Var3 = fx9Var2;
                                    i18 = i8;
                                    kx0Var3 = kx0Var2;
                                    pc9Var2 = pc9Var;
                                    lu9Var2 = lu9Var;
                                    ardVar3 = ardVar2;
                                    f4 = f3;
                                }
                                ojbVarV = l46Var.v();
                                if (ojbVarV != null) {
                                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                                }
                            }
                            i14 |= 100663296;
                            i17 = i14 | 805306368;
                            z3 = true;
                            if ((i17 & 306783379) == 306783378) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (l46Var.W(i17 & 1, z4)) {
                                l46Var.b0();
                                if ((i2 & 1) != 0) {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    z3 = ((i19 & 14) ^ 6) > 4 ? false : false;
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                } else {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    if (((i19 & 14) ^ 6) > 4) {
                                    }
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                }
                                fx9 fx9Var5 = fx9Var2;
                                int i27 = i8;
                                kx0 kx0Var5 = kx0Var2;
                                float f6 = f3;
                                int i28 = i17;
                                l46Var.s();
                                int i29 = i28 >> 6;
                                int i210 = i28 << 12;
                                x57.v(f6, i27, ((i28 >> 3) & 14) | 24576 | ((i28 << 3) & 112) | (i28 & 896) | ((i28 >> 18) & 7168) | (458752 & i29) | (3670016 & i29) | (234881024 & i210) | (i210 & 1879048192), ((i28 >> 9) & 14) | 3456 | (57344 & i29) | 1769472, kx0Var5, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var5, yx9Var2, ardVar4, frdVar3, z7);
                                f4 = f6;
                                i18 = i27;
                                kx0Var3 = kx0Var5;
                                j09Var2 = j09Var4;
                                pc9Var2 = pc9Var3;
                                lu9Var2 = lu9VarB;
                                xw9Var3 = xw9Var4;
                                fx9Var3 = fx9Var5;
                                ardVar3 = ardVar4;
                                frdVar2 = frdVar3;
                                z5 = z7;
                            } else {
                                l46Var.Z();
                                j09Var2 = j09Var;
                                frdVar2 = frdVar;
                                z5 = z2;
                                xw9Var3 = xw9Var2;
                                fx9Var3 = fx9Var2;
                                i18 = i8;
                                kx0Var3 = kx0Var2;
                                pc9Var2 = pc9Var;
                                lu9Var2 = lu9Var;
                                ardVar3 = ardVar2;
                                f4 = f3;
                            }
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                            }
                        }
                        i4 |= 1572864;
                        kx0Var2 = kx0Var;
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                                ardVar2 = ardVar;
                                if (l46Var.g(ardVar2)) {
                                }
                                i4 |= i22;
                            } else {
                                ardVar2 = ardVar;
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i14 = i4;
                        i15 = i3 & 256;
                        if (i15 != 0) {
                            if ((i2 & 100663296) == 0) {
                                if (l46Var.h(z2)) {
                                    i16 = 67108864;
                                } else {
                                    i16 = 33554432;
                                }
                                i14 |= i16;
                            }
                            i17 = i14 | 805306368;
                            z3 = true;
                            if ((i17 & 306783379) == 306783378) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (l46Var.W(i17 & 1, z4)) {
                                l46Var.b0();
                                if ((i2 & 1) != 0) {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    if (((i19 & 14) ^ 6) > 4) {
                                    }
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                } else {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    if (((i19 & 14) ^ 6) > 4) {
                                    }
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                }
                                fx9 fx9Var6 = fx9Var2;
                                int i211 = i8;
                                kx0 kx0Var6 = kx0Var2;
                                float f7 = f3;
                                int i212 = i17;
                                l46Var.s();
                                int i213 = i212 >> 6;
                                int i214 = i212 << 12;
                                x57.v(f7, i211, ((i212 >> 3) & 14) | 24576 | ((i212 << 3) & 112) | (i212 & 896) | ((i212 >> 18) & 7168) | (458752 & i213) | (3670016 & i213) | (234881024 & i214) | (i214 & 1879048192), ((i212 >> 9) & 14) | 3456 | (57344 & i213) | 1769472, kx0Var6, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var6, yx9Var2, ardVar4, frdVar3, z7);
                                f4 = f7;
                                i18 = i211;
                                kx0Var3 = kx0Var6;
                                j09Var2 = j09Var4;
                                pc9Var2 = pc9Var3;
                                lu9Var2 = lu9VarB;
                                xw9Var3 = xw9Var4;
                                fx9Var3 = fx9Var6;
                                ardVar3 = ardVar4;
                                frdVar2 = frdVar3;
                                z5 = z7;
                            } else {
                                l46Var.Z();
                                j09Var2 = j09Var;
                                frdVar2 = frdVar;
                                z5 = z2;
                                xw9Var3 = xw9Var2;
                                fx9Var3 = fx9Var2;
                                i18 = i8;
                                kx0Var3 = kx0Var2;
                                pc9Var2 = pc9Var;
                                lu9Var2 = lu9Var;
                                ardVar3 = ardVar2;
                                f4 = f3;
                            }
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                            }
                        }
                        i14 |= 100663296;
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var7 = fx9Var2;
                            int i215 = i8;
                            kx0 kx0Var7 = kx0Var2;
                            float f8 = f3;
                            int i216 = i17;
                            l46Var.s();
                            int i217 = i216 >> 6;
                            int i218 = i216 << 12;
                            x57.v(f8, i215, ((i216 >> 3) & 14) | 24576 | ((i216 << 3) & 112) | (i216 & 896) | ((i216 >> 18) & 7168) | (458752 & i217) | (3670016 & i217) | (234881024 & i218) | (i218 & 1879048192), ((i216 >> 9) & 14) | 3456 | (57344 & i217) | 1769472, kx0Var7, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var7, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f8;
                            i18 = i215;
                            kx0Var3 = kx0Var7;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var7;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i4 |= 196608;
                    f3 = f2;
                    i12 = i3 & 64;
                    if (i12 != 0) {
                        if ((i2 & 1572864) == 0) {
                            kx0Var2 = kx0Var;
                            if (l46Var.g(kx0Var2)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i4 |= i13;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                                ardVar2 = ardVar;
                                if (l46Var.g(ardVar2)) {
                                }
                                i4 |= i22;
                            } else {
                                ardVar2 = ardVar;
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i14 = i4;
                        i15 = i3 & 256;
                        if (i15 != 0) {
                            if ((i2 & 100663296) == 0) {
                                if (l46Var.h(z2)) {
                                    i16 = 67108864;
                                } else {
                                    i16 = 33554432;
                                }
                                i14 |= i16;
                            }
                            i17 = i14 | 805306368;
                            z3 = true;
                            if ((i17 & 306783379) == 306783378) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (l46Var.W(i17 & 1, z4)) {
                                l46Var.b0();
                                if ((i2 & 1) != 0) {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    if (((i19 & 14) ^ 6) > 4) {
                                    }
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                } else {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    if (((i19 & 14) ^ 6) > 4) {
                                    }
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                }
                                fx9 fx9Var8 = fx9Var2;
                                int i219 = i8;
                                kx0 kx0Var8 = kx0Var2;
                                float f9 = f3;
                                int i2110 = i17;
                                l46Var.s();
                                int i2111 = i2110 >> 6;
                                int i2112 = i2110 << 12;
                                x57.v(f9, i219, ((i2110 >> 3) & 14) | 24576 | ((i2110 << 3) & 112) | (i2110 & 896) | ((i2110 >> 18) & 7168) | (458752 & i2111) | (3670016 & i2111) | (234881024 & i2112) | (i2112 & 1879048192), ((i2110 >> 9) & 14) | 3456 | (57344 & i2111) | 1769472, kx0Var8, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var8, yx9Var2, ardVar4, frdVar3, z7);
                                f4 = f9;
                                i18 = i219;
                                kx0Var3 = kx0Var8;
                                j09Var2 = j09Var4;
                                pc9Var2 = pc9Var3;
                                lu9Var2 = lu9VarB;
                                xw9Var3 = xw9Var4;
                                fx9Var3 = fx9Var8;
                                ardVar3 = ardVar4;
                                frdVar2 = frdVar3;
                                z5 = z7;
                            } else {
                                l46Var.Z();
                                j09Var2 = j09Var;
                                frdVar2 = frdVar;
                                z5 = z2;
                                xw9Var3 = xw9Var2;
                                fx9Var3 = fx9Var2;
                                i18 = i8;
                                kx0Var3 = kx0Var2;
                                pc9Var2 = pc9Var;
                                lu9Var2 = lu9Var;
                                ardVar3 = ardVar2;
                                f4 = f3;
                            }
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                            }
                        }
                        i14 |= 100663296;
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var9 = fx9Var2;
                            int i2113 = i8;
                            kx0 kx0Var9 = kx0Var2;
                            float f10 = f3;
                            int i2114 = i17;
                            l46Var.s();
                            int i2115 = i2114 >> 6;
                            int i2116 = i2114 << 12;
                            x57.v(f10, i2113, ((i2114 >> 3) & 14) | 24576 | ((i2114 << 3) & 112) | (i2114 & 896) | ((i2114 >> 18) & 7168) | (458752 & i2115) | (3670016 & i2115) | (234881024 & i2116) | (i2116 & 1879048192), ((i2114 >> 9) & 14) | 3456 | (57344 & i2115) | 1769472, kx0Var9, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var9, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f10;
                            i18 = i2113;
                            kx0Var3 = kx0Var9;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var9;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    kx0Var2 = kx0Var;
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                            ardVar2 = ardVar;
                            if (l46Var.g(ardVar2)) {
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i14 = i4;
                    i15 = i3 & 256;
                    if (i15 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z2)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var10 = fx9Var2;
                            int i2117 = i8;
                            kx0 kx0Var10 = kx0Var2;
                            float f11 = f3;
                            int i2118 = i17;
                            l46Var.s();
                            int i2119 = i2118 >> 6;
                            int i21110 = i2118 << 12;
                            x57.v(f11, i2117, ((i2118 >> 3) & 14) | 24576 | ((i2118 << 3) & 112) | (i2118 & 896) | ((i2118 >> 18) & 7168) | (458752 & i2119) | (3670016 & i2119) | (234881024 & i21110) | (i21110 & 1879048192), ((i2118 >> 9) & 14) | 3456 | (57344 & i2119) | 1769472, kx0Var10, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var10, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f11;
                            i18 = i2117;
                            kx0Var3 = kx0Var10;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var10;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i14 |= 100663296;
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var11 = fx9Var2;
                        int i21111 = i8;
                        kx0 kx0Var11 = kx0Var2;
                        float f12 = f3;
                        int i21112 = i17;
                        l46Var.s();
                        int i21113 = i21112 >> 6;
                        int i21114 = i21112 << 12;
                        x57.v(f12, i21111, ((i21112 >> 3) & 14) | 24576 | ((i21112 << 3) & 112) | (i21112 & 896) | ((i21112 >> 18) & 7168) | (458752 & i21113) | (3670016 & i21113) | (234881024 & i21114) | (i21114 & 1879048192), ((i21112 >> 9) & 14) | 3456 | (57344 & i21113) | 1769472, kx0Var11, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var11, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f12;
                        i18 = i21111;
                        kx0Var3 = kx0Var11;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var11;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i4 |= 24576;
                i8 = i;
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((i2 & 196608) == 0) {
                        f3 = f2;
                        if (l46Var.d(f3)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 64;
                    if (i12 != 0) {
                        if ((i2 & 1572864) == 0) {
                            kx0Var2 = kx0Var;
                            if (l46Var.g(kx0Var2)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i4 |= i13;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                                ardVar2 = ardVar;
                                if (l46Var.g(ardVar2)) {
                                }
                                i4 |= i22;
                            } else {
                                ardVar2 = ardVar;
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i14 = i4;
                        i15 = i3 & 256;
                        if (i15 != 0) {
                            if ((i2 & 100663296) == 0) {
                                if (l46Var.h(z2)) {
                                    i16 = 67108864;
                                } else {
                                    i16 = 33554432;
                                }
                                i14 |= i16;
                            }
                            i17 = i14 | 805306368;
                            z3 = true;
                            if ((i17 & 306783379) == 306783378) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (l46Var.W(i17 & 1, z4)) {
                                l46Var.b0();
                                if ((i2 & 1) != 0) {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    if (((i19 & 14) ^ 6) > 4) {
                                    }
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                } else {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    if (((i19 & 14) ^ 6) > 4) {
                                    }
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                }
                                fx9 fx9Var12 = fx9Var2;
                                int i21115 = i8;
                                kx0 kx0Var12 = kx0Var2;
                                float f13 = f3;
                                int i21116 = i17;
                                l46Var.s();
                                int i21117 = i21116 >> 6;
                                int i21118 = i21116 << 12;
                                x57.v(f13, i21115, ((i21116 >> 3) & 14) | 24576 | ((i21116 << 3) & 112) | (i21116 & 896) | ((i21116 >> 18) & 7168) | (458752 & i21117) | (3670016 & i21117) | (234881024 & i21118) | (i21118 & 1879048192), ((i21116 >> 9) & 14) | 3456 | (57344 & i21117) | 1769472, kx0Var12, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var12, yx9Var2, ardVar4, frdVar3, z7);
                                f4 = f13;
                                i18 = i21115;
                                kx0Var3 = kx0Var12;
                                j09Var2 = j09Var4;
                                pc9Var2 = pc9Var3;
                                lu9Var2 = lu9VarB;
                                xw9Var3 = xw9Var4;
                                fx9Var3 = fx9Var12;
                                ardVar3 = ardVar4;
                                frdVar2 = frdVar3;
                                z5 = z7;
                            } else {
                                l46Var.Z();
                                j09Var2 = j09Var;
                                frdVar2 = frdVar;
                                z5 = z2;
                                xw9Var3 = xw9Var2;
                                fx9Var3 = fx9Var2;
                                i18 = i8;
                                kx0Var3 = kx0Var2;
                                pc9Var2 = pc9Var;
                                lu9Var2 = lu9Var;
                                ardVar3 = ardVar2;
                                f4 = f3;
                            }
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                            }
                        }
                        i14 |= 100663296;
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var13 = fx9Var2;
                            int i21119 = i8;
                            kx0 kx0Var13 = kx0Var2;
                            float f14 = f3;
                            int i211110 = i17;
                            l46Var.s();
                            int i211111 = i211110 >> 6;
                            int i211112 = i211110 << 12;
                            x57.v(f14, i21119, ((i211110 >> 3) & 14) | 24576 | ((i211110 << 3) & 112) | (i211110 & 896) | ((i211110 >> 18) & 7168) | (458752 & i211111) | (3670016 & i211111) | (234881024 & i211112) | (i211112 & 1879048192), ((i211110 >> 9) & 14) | 3456 | (57344 & i211111) | 1769472, kx0Var13, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var13, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f14;
                            i18 = i21119;
                            kx0Var3 = kx0Var13;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var13;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    kx0Var2 = kx0Var;
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                            ardVar2 = ardVar;
                            if (l46Var.g(ardVar2)) {
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i14 = i4;
                    i15 = i3 & 256;
                    if (i15 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z2)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var14 = fx9Var2;
                            int i211113 = i8;
                            kx0 kx0Var14 = kx0Var2;
                            float f15 = f3;
                            int i211114 = i17;
                            l46Var.s();
                            int i211115 = i211114 >> 6;
                            int i211116 = i211114 << 12;
                            x57.v(f15, i211113, ((i211114 >> 3) & 14) | 24576 | ((i211114 << 3) & 112) | (i211114 & 896) | ((i211114 >> 18) & 7168) | (458752 & i211115) | (3670016 & i211115) | (234881024 & i211116) | (i211116 & 1879048192), ((i211114 >> 9) & 14) | 3456 | (57344 & i211115) | 1769472, kx0Var14, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var14, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f15;
                            i18 = i211113;
                            kx0Var3 = kx0Var14;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var14;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i14 |= 100663296;
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var15 = fx9Var2;
                        int i211117 = i8;
                        kx0 kx0Var15 = kx0Var2;
                        float f16 = f3;
                        int i211118 = i17;
                        l46Var.s();
                        int i211119 = i211118 >> 6;
                        int i2111110 = i211118 << 12;
                        x57.v(f16, i211117, ((i211118 >> 3) & 14) | 24576 | ((i211118 << 3) & 112) | (i211118 & 896) | ((i211118 >> 18) & 7168) | (458752 & i211119) | (3670016 & i211119) | (234881024 & i2111110) | (i2111110 & 1879048192), ((i211118 >> 9) & 14) | 3456 | (57344 & i211119) | 1769472, kx0Var15, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var15, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f16;
                        i18 = i211117;
                        kx0Var3 = kx0Var15;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var15;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i4 |= 196608;
                f3 = f2;
                i12 = i3 & 64;
                if (i12 != 0) {
                    if ((i2 & 1572864) == 0) {
                        kx0Var2 = kx0Var;
                        if (l46Var.g(kx0Var2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                            ardVar2 = ardVar;
                            if (l46Var.g(ardVar2)) {
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i14 = i4;
                    i15 = i3 & 256;
                    if (i15 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z2)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var16 = fx9Var2;
                            int i2111111 = i8;
                            kx0 kx0Var16 = kx0Var2;
                            float f17 = f3;
                            int i2111112 = i17;
                            l46Var.s();
                            int i2111113 = i2111112 >> 6;
                            int i2111114 = i2111112 << 12;
                            x57.v(f17, i2111111, ((i2111112 >> 3) & 14) | 24576 | ((i2111112 << 3) & 112) | (i2111112 & 896) | ((i2111112 >> 18) & 7168) | (458752 & i2111113) | (3670016 & i2111113) | (234881024 & i2111114) | (i2111114 & 1879048192), ((i2111112 >> 9) & 14) | 3456 | (57344 & i2111113) | 1769472, kx0Var16, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var16, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f17;
                            i18 = i2111111;
                            kx0Var3 = kx0Var16;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var16;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i14 |= 100663296;
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var17 = fx9Var2;
                        int i2111115 = i8;
                        kx0 kx0Var17 = kx0Var2;
                        float f18 = f3;
                        int i2111116 = i17;
                        l46Var.s();
                        int i2111117 = i2111116 >> 6;
                        int i2111118 = i2111116 << 12;
                        x57.v(f18, i2111115, ((i2111116 >> 3) & 14) | 24576 | ((i2111116 << 3) & 112) | (i2111116 & 896) | ((i2111116 >> 18) & 7168) | (458752 & i2111117) | (3670016 & i2111117) | (234881024 & i2111118) | (i2111118 & 1879048192), ((i2111116 >> 9) & 14) | 3456 | (57344 & i2111117) | 1769472, kx0Var17, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var17, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f18;
                        i18 = i2111115;
                        kx0Var3 = kx0Var17;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var17;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i4 |= 1572864;
                kx0Var2 = kx0Var;
                if ((i2 & 12582912) == 0) {
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        ardVar2 = ardVar;
                        if (l46Var.g(ardVar2)) {
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i14 = i4;
                i15 = i3 & 256;
                if (i15 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z2)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var18 = fx9Var2;
                        int i2111119 = i8;
                        kx0 kx0Var18 = kx0Var2;
                        float f19 = f3;
                        int i21111110 = i17;
                        l46Var.s();
                        int i21111111 = i21111110 >> 6;
                        int i21111112 = i21111110 << 12;
                        x57.v(f19, i2111119, ((i21111110 >> 3) & 14) | 24576 | ((i21111110 << 3) & 112) | (i21111110 & 896) | ((i21111110 >> 18) & 7168) | (458752 & i21111111) | (3670016 & i21111111) | (234881024 & i21111112) | (i21111112 & 1879048192), ((i21111110 >> 9) & 14) | 3456 | (57344 & i21111111) | 1769472, kx0Var18, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var18, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f19;
                        i18 = i2111119;
                        kx0Var3 = kx0Var18;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var18;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i14 |= 100663296;
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var19 = fx9Var2;
                    int i21111113 = i8;
                    kx0 kx0Var19 = kx0Var2;
                    float f110 = f3;
                    int i21111114 = i17;
                    l46Var.s();
                    int i21111115 = i21111114 >> 6;
                    int i21111116 = i21111114 << 12;
                    x57.v(f110, i21111113, ((i21111114 >> 3) & 14) | 24576 | ((i21111114 << 3) & 112) | (i21111114 & 896) | ((i21111114 >> 18) & 7168) | (458752 & i21111115) | (3670016 & i21111115) | (234881024 & i21111116) | (i21111116 & 1879048192), ((i21111114 >> 9) & 14) | 3456 | (57344 & i21111115) | 1769472, kx0Var19, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var19, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f110;
                    i18 = i21111113;
                    kx0Var3 = kx0Var19;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var19;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i4 |= 3072;
            fx9Var2 = fx9Var;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    i8 = i;
                    if (l46Var.e(i8)) {
                        i9 = 16384;
                    } else {
                        i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((i2 & 196608) == 0) {
                        f3 = f2;
                        if (l46Var.d(f3)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 64;
                    if (i12 != 0) {
                        if ((i2 & 1572864) == 0) {
                            kx0Var2 = kx0Var;
                            if (l46Var.g(kx0Var2)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i4 |= i13;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                                ardVar2 = ardVar;
                                if (l46Var.g(ardVar2)) {
                                }
                                i4 |= i22;
                            } else {
                                ardVar2 = ardVar;
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i14 = i4;
                        i15 = i3 & 256;
                        if (i15 != 0) {
                            if ((i2 & 100663296) == 0) {
                                if (l46Var.h(z2)) {
                                    i16 = 67108864;
                                } else {
                                    i16 = 33554432;
                                }
                                i14 |= i16;
                            }
                            i17 = i14 | 805306368;
                            z3 = true;
                            if ((i17 & 306783379) == 306783378) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (l46Var.W(i17 & 1, z4)) {
                                l46Var.b0();
                                if ((i2 & 1) != 0) {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    if (((i19 & 14) ^ 6) > 4) {
                                    }
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                } else {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    if (((i19 & 14) ^ 6) > 4) {
                                    }
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                }
                                fx9 fx9Var110 = fx9Var2;
                                int i21111117 = i8;
                                kx0 kx0Var110 = kx0Var2;
                                float f111 = f3;
                                int i21111118 = i17;
                                l46Var.s();
                                int i21111119 = i21111118 >> 6;
                                int i211111110 = i21111118 << 12;
                                x57.v(f111, i21111117, ((i21111118 >> 3) & 14) | 24576 | ((i21111118 << 3) & 112) | (i21111118 & 896) | ((i21111118 >> 18) & 7168) | (458752 & i21111119) | (3670016 & i21111119) | (234881024 & i211111110) | (i211111110 & 1879048192), ((i21111118 >> 9) & 14) | 3456 | (57344 & i21111119) | 1769472, kx0Var110, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var110, yx9Var2, ardVar4, frdVar3, z7);
                                f4 = f111;
                                i18 = i21111117;
                                kx0Var3 = kx0Var110;
                                j09Var2 = j09Var4;
                                pc9Var2 = pc9Var3;
                                lu9Var2 = lu9VarB;
                                xw9Var3 = xw9Var4;
                                fx9Var3 = fx9Var110;
                                ardVar3 = ardVar4;
                                frdVar2 = frdVar3;
                                z5 = z7;
                            } else {
                                l46Var.Z();
                                j09Var2 = j09Var;
                                frdVar2 = frdVar;
                                z5 = z2;
                                xw9Var3 = xw9Var2;
                                fx9Var3 = fx9Var2;
                                i18 = i8;
                                kx0Var3 = kx0Var2;
                                pc9Var2 = pc9Var;
                                lu9Var2 = lu9Var;
                                ardVar3 = ardVar2;
                                f4 = f3;
                            }
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                            }
                        }
                        i14 |= 100663296;
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var111 = fx9Var2;
                            int i211111111 = i8;
                            kx0 kx0Var111 = kx0Var2;
                            float f112 = f3;
                            int i211111112 = i17;
                            l46Var.s();
                            int i211111113 = i211111112 >> 6;
                            int i211111114 = i211111112 << 12;
                            x57.v(f112, i211111111, ((i211111112 >> 3) & 14) | 24576 | ((i211111112 << 3) & 112) | (i211111112 & 896) | ((i211111112 >> 18) & 7168) | (458752 & i211111113) | (3670016 & i211111113) | (234881024 & i211111114) | (i211111114 & 1879048192), ((i211111112 >> 9) & 14) | 3456 | (57344 & i211111113) | 1769472, kx0Var111, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var111, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f112;
                            i18 = i211111111;
                            kx0Var3 = kx0Var111;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var111;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    kx0Var2 = kx0Var;
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                            ardVar2 = ardVar;
                            if (l46Var.g(ardVar2)) {
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i14 = i4;
                    i15 = i3 & 256;
                    if (i15 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z2)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var112 = fx9Var2;
                            int i211111115 = i8;
                            kx0 kx0Var112 = kx0Var2;
                            float f113 = f3;
                            int i211111116 = i17;
                            l46Var.s();
                            int i211111117 = i211111116 >> 6;
                            int i211111118 = i211111116 << 12;
                            x57.v(f113, i211111115, ((i211111116 >> 3) & 14) | 24576 | ((i211111116 << 3) & 112) | (i211111116 & 896) | ((i211111116 >> 18) & 7168) | (458752 & i211111117) | (3670016 & i211111117) | (234881024 & i211111118) | (i211111118 & 1879048192), ((i211111116 >> 9) & 14) | 3456 | (57344 & i211111117) | 1769472, kx0Var112, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var112, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f113;
                            i18 = i211111115;
                            kx0Var3 = kx0Var112;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var112;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i14 |= 100663296;
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var113 = fx9Var2;
                        int i211111119 = i8;
                        kx0 kx0Var113 = kx0Var2;
                        float f114 = f3;
                        int i2111111110 = i17;
                        l46Var.s();
                        int i2111111111 = i2111111110 >> 6;
                        int i2111111112 = i2111111110 << 12;
                        x57.v(f114, i211111119, ((i2111111110 >> 3) & 14) | 24576 | ((i2111111110 << 3) & 112) | (i2111111110 & 896) | ((i2111111110 >> 18) & 7168) | (458752 & i2111111111) | (3670016 & i2111111111) | (234881024 & i2111111112) | (i2111111112 & 1879048192), ((i2111111110 >> 9) & 14) | 3456 | (57344 & i2111111111) | 1769472, kx0Var113, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var113, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f114;
                        i18 = i211111119;
                        kx0Var3 = kx0Var113;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var113;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i4 |= 196608;
                f3 = f2;
                i12 = i3 & 64;
                if (i12 != 0) {
                    if ((i2 & 1572864) == 0) {
                        kx0Var2 = kx0Var;
                        if (l46Var.g(kx0Var2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                            ardVar2 = ardVar;
                            if (l46Var.g(ardVar2)) {
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i14 = i4;
                    i15 = i3 & 256;
                    if (i15 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z2)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var114 = fx9Var2;
                            int i2111111113 = i8;
                            kx0 kx0Var114 = kx0Var2;
                            float f115 = f3;
                            int i2111111114 = i17;
                            l46Var.s();
                            int i2111111115 = i2111111114 >> 6;
                            int i2111111116 = i2111111114 << 12;
                            x57.v(f115, i2111111113, ((i2111111114 >> 3) & 14) | 24576 | ((i2111111114 << 3) & 112) | (i2111111114 & 896) | ((i2111111114 >> 18) & 7168) | (458752 & i2111111115) | (3670016 & i2111111115) | (234881024 & i2111111116) | (i2111111116 & 1879048192), ((i2111111114 >> 9) & 14) | 3456 | (57344 & i2111111115) | 1769472, kx0Var114, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var114, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f115;
                            i18 = i2111111113;
                            kx0Var3 = kx0Var114;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var114;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i14 |= 100663296;
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var115 = fx9Var2;
                        int i2111111117 = i8;
                        kx0 kx0Var115 = kx0Var2;
                        float f116 = f3;
                        int i2111111118 = i17;
                        l46Var.s();
                        int i2111111119 = i2111111118 >> 6;
                        int i21111111110 = i2111111118 << 12;
                        x57.v(f116, i2111111117, ((i2111111118 >> 3) & 14) | 24576 | ((i2111111118 << 3) & 112) | (i2111111118 & 896) | ((i2111111118 >> 18) & 7168) | (458752 & i2111111119) | (3670016 & i2111111119) | (234881024 & i21111111110) | (i21111111110 & 1879048192), ((i2111111118 >> 9) & 14) | 3456 | (57344 & i2111111119) | 1769472, kx0Var115, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var115, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f116;
                        i18 = i2111111117;
                        kx0Var3 = kx0Var115;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var115;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i4 |= 1572864;
                kx0Var2 = kx0Var;
                if ((i2 & 12582912) == 0) {
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        ardVar2 = ardVar;
                        if (l46Var.g(ardVar2)) {
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i14 = i4;
                i15 = i3 & 256;
                if (i15 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z2)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var116 = fx9Var2;
                        int i21111111111 = i8;
                        kx0 kx0Var116 = kx0Var2;
                        float f117 = f3;
                        int i21111111112 = i17;
                        l46Var.s();
                        int i21111111113 = i21111111112 >> 6;
                        int i21111111114 = i21111111112 << 12;
                        x57.v(f117, i21111111111, ((i21111111112 >> 3) & 14) | 24576 | ((i21111111112 << 3) & 112) | (i21111111112 & 896) | ((i21111111112 >> 18) & 7168) | (458752 & i21111111113) | (3670016 & i21111111113) | (234881024 & i21111111114) | (i21111111114 & 1879048192), ((i21111111112 >> 9) & 14) | 3456 | (57344 & i21111111113) | 1769472, kx0Var116, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var116, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f117;
                        i18 = i21111111111;
                        kx0Var3 = kx0Var116;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var116;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i14 |= 100663296;
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var117 = fx9Var2;
                    int i21111111115 = i8;
                    kx0 kx0Var117 = kx0Var2;
                    float f118 = f3;
                    int i21111111116 = i17;
                    l46Var.s();
                    int i21111111117 = i21111111116 >> 6;
                    int i21111111118 = i21111111116 << 12;
                    x57.v(f118, i21111111115, ((i21111111116 >> 3) & 14) | 24576 | ((i21111111116 << 3) & 112) | (i21111111116 & 896) | ((i21111111116 >> 18) & 7168) | (458752 & i21111111117) | (3670016 & i21111111117) | (234881024 & i21111111118) | (i21111111118 & 1879048192), ((i21111111116 >> 9) & 14) | 3456 | (57344 & i21111111117) | 1769472, kx0Var117, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var117, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f118;
                    i18 = i21111111115;
                    kx0Var3 = kx0Var117;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var117;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i4 |= 24576;
            i8 = i;
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((i2 & 196608) == 0) {
                    f3 = f2;
                    if (l46Var.d(f3)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 64;
                if (i12 != 0) {
                    if ((i2 & 1572864) == 0) {
                        kx0Var2 = kx0Var;
                        if (l46Var.g(kx0Var2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                            ardVar2 = ardVar;
                            if (l46Var.g(ardVar2)) {
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i14 = i4;
                    i15 = i3 & 256;
                    if (i15 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z2)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var118 = fx9Var2;
                            int i21111111119 = i8;
                            kx0 kx0Var118 = kx0Var2;
                            float f119 = f3;
                            int i211111111110 = i17;
                            l46Var.s();
                            int i211111111111 = i211111111110 >> 6;
                            int i211111111112 = i211111111110 << 12;
                            x57.v(f119, i21111111119, ((i211111111110 >> 3) & 14) | 24576 | ((i211111111110 << 3) & 112) | (i211111111110 & 896) | ((i211111111110 >> 18) & 7168) | (458752 & i211111111111) | (3670016 & i211111111111) | (234881024 & i211111111112) | (i211111111112 & 1879048192), ((i211111111110 >> 9) & 14) | 3456 | (57344 & i211111111111) | 1769472, kx0Var118, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var118, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f119;
                            i18 = i21111111119;
                            kx0Var3 = kx0Var118;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var118;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i14 |= 100663296;
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var119 = fx9Var2;
                        int i211111111113 = i8;
                        kx0 kx0Var119 = kx0Var2;
                        float f1110 = f3;
                        int i211111111114 = i17;
                        l46Var.s();
                        int i211111111115 = i211111111114 >> 6;
                        int i211111111116 = i211111111114 << 12;
                        x57.v(f1110, i211111111113, ((i211111111114 >> 3) & 14) | 24576 | ((i211111111114 << 3) & 112) | (i211111111114 & 896) | ((i211111111114 >> 18) & 7168) | (458752 & i211111111115) | (3670016 & i211111111115) | (234881024 & i211111111116) | (i211111111116 & 1879048192), ((i211111111114 >> 9) & 14) | 3456 | (57344 & i211111111115) | 1769472, kx0Var119, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var119, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f1110;
                        i18 = i211111111113;
                        kx0Var3 = kx0Var119;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var119;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i4 |= 1572864;
                kx0Var2 = kx0Var;
                if ((i2 & 12582912) == 0) {
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        ardVar2 = ardVar;
                        if (l46Var.g(ardVar2)) {
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i14 = i4;
                i15 = i3 & 256;
                if (i15 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z2)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var1110 = fx9Var2;
                        int i211111111117 = i8;
                        kx0 kx0Var1110 = kx0Var2;
                        float f1111 = f3;
                        int i211111111118 = i17;
                        l46Var.s();
                        int i211111111119 = i211111111118 >> 6;
                        int i2111111111110 = i211111111118 << 12;
                        x57.v(f1111, i211111111117, ((i211111111118 >> 3) & 14) | 24576 | ((i211111111118 << 3) & 112) | (i211111111118 & 896) | ((i211111111118 >> 18) & 7168) | (458752 & i211111111119) | (3670016 & i211111111119) | (234881024 & i2111111111110) | (i2111111111110 & 1879048192), ((i211111111118 >> 9) & 14) | 3456 | (57344 & i211111111119) | 1769472, kx0Var1110, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1110, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f1111;
                        i18 = i211111111117;
                        kx0Var3 = kx0Var1110;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var1110;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i14 |= 100663296;
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var1111 = fx9Var2;
                    int i2111111111111 = i8;
                    kx0 kx0Var1111 = kx0Var2;
                    float f1112 = f3;
                    int i2111111111112 = i17;
                    l46Var.s();
                    int i2111111111113 = i2111111111112 >> 6;
                    int i2111111111114 = i2111111111112 << 12;
                    x57.v(f1112, i2111111111111, ((i2111111111112 >> 3) & 14) | 24576 | ((i2111111111112 << 3) & 112) | (i2111111111112 & 896) | ((i2111111111112 >> 18) & 7168) | (458752 & i2111111111113) | (3670016 & i2111111111113) | (234881024 & i2111111111114) | (i2111111111114 & 1879048192), ((i2111111111112 >> 9) & 14) | 3456 | (57344 & i2111111111113) | 1769472, kx0Var1111, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1111, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f1112;
                    i18 = i2111111111111;
                    kx0Var3 = kx0Var1111;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var1111;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i4 |= 196608;
            f3 = f2;
            i12 = i3 & 64;
            if (i12 != 0) {
                if ((i2 & 1572864) == 0) {
                    kx0Var2 = kx0Var;
                    if (l46Var.g(kx0Var2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        ardVar2 = ardVar;
                        if (l46Var.g(ardVar2)) {
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i14 = i4;
                i15 = i3 & 256;
                if (i15 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z2)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var1112 = fx9Var2;
                        int i2111111111115 = i8;
                        kx0 kx0Var1112 = kx0Var2;
                        float f1113 = f3;
                        int i2111111111116 = i17;
                        l46Var.s();
                        int i2111111111117 = i2111111111116 >> 6;
                        int i2111111111118 = i2111111111116 << 12;
                        x57.v(f1113, i2111111111115, ((i2111111111116 >> 3) & 14) | 24576 | ((i2111111111116 << 3) & 112) | (i2111111111116 & 896) | ((i2111111111116 >> 18) & 7168) | (458752 & i2111111111117) | (3670016 & i2111111111117) | (234881024 & i2111111111118) | (i2111111111118 & 1879048192), ((i2111111111116 >> 9) & 14) | 3456 | (57344 & i2111111111117) | 1769472, kx0Var1112, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1112, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f1113;
                        i18 = i2111111111115;
                        kx0Var3 = kx0Var1112;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var1112;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i14 |= 100663296;
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var1113 = fx9Var2;
                    int i2111111111119 = i8;
                    kx0 kx0Var1113 = kx0Var2;
                    float f1114 = f3;
                    int i21111111111110 = i17;
                    l46Var.s();
                    int i21111111111111 = i21111111111110 >> 6;
                    int i21111111111112 = i21111111111110 << 12;
                    x57.v(f1114, i2111111111119, ((i21111111111110 >> 3) & 14) | 24576 | ((i21111111111110 << 3) & 112) | (i21111111111110 & 896) | ((i21111111111110 >> 18) & 7168) | (458752 & i21111111111111) | (3670016 & i21111111111111) | (234881024 & i21111111111112) | (i21111111111112 & 1879048192), ((i21111111111110 >> 9) & 14) | 3456 | (57344 & i21111111111111) | 1769472, kx0Var1113, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1113, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f1114;
                    i18 = i2111111111119;
                    kx0Var3 = kx0Var1113;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var1113;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i4 |= 1572864;
            kx0Var2 = kx0Var;
            if ((i2 & 12582912) == 0) {
                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                    ardVar2 = ardVar;
                    if (l46Var.g(ardVar2)) {
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i4 |= i22;
            } else {
                ardVar2 = ardVar;
            }
            i14 = i4;
            i15 = i3 & 256;
            if (i15 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (l46Var.h(z2)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i14 |= i16;
                }
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var1114 = fx9Var2;
                    int i21111111111113 = i8;
                    kx0 kx0Var1114 = kx0Var2;
                    float f1115 = f3;
                    int i21111111111114 = i17;
                    l46Var.s();
                    int i21111111111115 = i21111111111114 >> 6;
                    int i21111111111116 = i21111111111114 << 12;
                    x57.v(f1115, i21111111111113, ((i21111111111114 >> 3) & 14) | 24576 | ((i21111111111114 << 3) & 112) | (i21111111111114 & 896) | ((i21111111111114 >> 18) & 7168) | (458752 & i21111111111115) | (3670016 & i21111111111115) | (234881024 & i21111111111116) | (i21111111111116 & 1879048192), ((i21111111111114 >> 9) & 14) | 3456 | (57344 & i21111111111115) | 1769472, kx0Var1114, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1114, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f1115;
                    i18 = i21111111111113;
                    kx0Var3 = kx0Var1114;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var1114;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i14 |= 100663296;
            i17 = i14 | 805306368;
            z3 = true;
            if ((i17 & 306783379) == 306783378) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (l46Var.W(i17 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                } else {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                }
                fx9 fx9Var1115 = fx9Var2;
                int i21111111111117 = i8;
                kx0 kx0Var1115 = kx0Var2;
                float f1116 = f3;
                int i21111111111118 = i17;
                l46Var.s();
                int i21111111111119 = i21111111111118 >> 6;
                int i211111111111110 = i21111111111118 << 12;
                x57.v(f1116, i21111111111117, ((i21111111111118 >> 3) & 14) | 24576 | ((i21111111111118 << 3) & 112) | (i21111111111118 & 896) | ((i21111111111118 >> 18) & 7168) | (458752 & i21111111111119) | (3670016 & i21111111111119) | (234881024 & i211111111111110) | (i211111111111110 & 1879048192), ((i21111111111118 >> 9) & 14) | 3456 | (57344 & i21111111111119) | 1769472, kx0Var1115, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1115, yx9Var2, ardVar4, frdVar3, z7);
                f4 = f1116;
                i18 = i21111111111117;
                kx0Var3 = kx0Var1115;
                j09Var2 = j09Var4;
                pc9Var2 = pc9Var3;
                lu9Var2 = lu9VarB;
                xw9Var3 = xw9Var4;
                fx9Var3 = fx9Var1115;
                ardVar3 = ardVar4;
                frdVar2 = frdVar3;
                z5 = z7;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                frdVar2 = frdVar;
                z5 = z2;
                xw9Var3 = xw9Var2;
                fx9Var3 = fx9Var2;
                i18 = i8;
                kx0Var3 = kx0Var2;
                pc9Var2 = pc9Var;
                lu9Var2 = lu9Var;
                ardVar3 = ardVar2;
                f4 = f3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
            }
        }
        i4 |= 384;
        xw9Var2 = xw9Var;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                fx9Var2 = fx9Var;
                if (l46Var.g(fx9Var2)) {
                    i6 = 2048;
                } else {
                    i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    i8 = i;
                    if (l46Var.e(i8)) {
                        i9 = 16384;
                    } else {
                        i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((i2 & 196608) == 0) {
                        f3 = f2;
                        if (l46Var.d(f3)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 64;
                    if (i12 != 0) {
                        if ((i2 & 1572864) == 0) {
                            kx0Var2 = kx0Var;
                            if (l46Var.g(kx0Var2)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i4 |= i13;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                                ardVar2 = ardVar;
                                if (l46Var.g(ardVar2)) {
                                }
                                i4 |= i22;
                            } else {
                                ardVar2 = ardVar;
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i14 = i4;
                        i15 = i3 & 256;
                        if (i15 != 0) {
                            if ((i2 & 100663296) == 0) {
                                if (l46Var.h(z2)) {
                                    i16 = 67108864;
                                } else {
                                    i16 = 33554432;
                                }
                                i14 |= i16;
                            }
                            i17 = i14 | 805306368;
                            z3 = true;
                            if ((i17 & 306783379) == 306783378) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (l46Var.W(i17 & 1, z4)) {
                                l46Var.b0();
                                if ((i2 & 1) != 0) {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    if (((i19 & 14) ^ 6) > 4) {
                                    }
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                } else {
                                    if (i20 != 0) {
                                        j09Var3 = g09.a;
                                    } else {
                                        j09Var3 = j09Var;
                                    }
                                    if (i21 != 0) {
                                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                    } else {
                                        bx9Var = xw9Var2;
                                    }
                                    if (i5 != 0) {
                                        fx9Var2 = hj6.U0;
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i10 != 0) {
                                        f3 = 0.0f;
                                    }
                                    if (i12 != 0) {
                                        kx0Var2 = ndb.z;
                                    }
                                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        yx9Var2 = yx9Var;
                                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                        i17 &= -29360129;
                                    } else {
                                        yx9Var2 = yx9Var;
                                        ardVarV = ardVar2;
                                    }
                                    if (i15 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                    }
                                    i19 = (i17 & 14) | 432;
                                    cv7Var = (cv7) l46Var.k(zg2.n);
                                    if (((i19 & 14) ^ 6) > 4) {
                                    }
                                    zE = z3 | l46Var.e(cv7Var.ordinal());
                                    objR = l46Var.R();
                                    if (zE) {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    } else {
                                        objR = new bs3(yx9Var2, cv7Var);
                                        l46Var.p0(objR);
                                    }
                                    ardVar4 = ardVarV;
                                    z7 = z6;
                                    frdVar3 = gec.v;
                                    j09Var4 = j09Var3;
                                    xw9Var4 = bx9Var;
                                    pc9Var3 = (bs3) objR;
                                    lu9VarB = mu9.b(l46Var);
                                }
                                fx9 fx9Var1116 = fx9Var2;
                                int i211111111111111 = i8;
                                kx0 kx0Var1116 = kx0Var2;
                                float f1117 = f3;
                                int i211111111111112 = i17;
                                l46Var.s();
                                int i211111111111113 = i211111111111112 >> 6;
                                int i211111111111114 = i211111111111112 << 12;
                                x57.v(f1117, i211111111111111, ((i211111111111112 >> 3) & 14) | 24576 | ((i211111111111112 << 3) & 112) | (i211111111111112 & 896) | ((i211111111111112 >> 18) & 7168) | (458752 & i211111111111113) | (3670016 & i211111111111113) | (234881024 & i211111111111114) | (i211111111111114 & 1879048192), ((i211111111111112 >> 9) & 14) | 3456 | (57344 & i211111111111113) | 1769472, kx0Var1116, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1116, yx9Var2, ardVar4, frdVar3, z7);
                                f4 = f1117;
                                i18 = i211111111111111;
                                kx0Var3 = kx0Var1116;
                                j09Var2 = j09Var4;
                                pc9Var2 = pc9Var3;
                                lu9Var2 = lu9VarB;
                                xw9Var3 = xw9Var4;
                                fx9Var3 = fx9Var1116;
                                ardVar3 = ardVar4;
                                frdVar2 = frdVar3;
                                z5 = z7;
                            } else {
                                l46Var.Z();
                                j09Var2 = j09Var;
                                frdVar2 = frdVar;
                                z5 = z2;
                                xw9Var3 = xw9Var2;
                                fx9Var3 = fx9Var2;
                                i18 = i8;
                                kx0Var3 = kx0Var2;
                                pc9Var2 = pc9Var;
                                lu9Var2 = lu9Var;
                                ardVar3 = ardVar2;
                                f4 = f3;
                            }
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                            }
                        }
                        i14 |= 100663296;
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var1117 = fx9Var2;
                            int i211111111111115 = i8;
                            kx0 kx0Var1117 = kx0Var2;
                            float f1118 = f3;
                            int i211111111111116 = i17;
                            l46Var.s();
                            int i211111111111117 = i211111111111116 >> 6;
                            int i211111111111118 = i211111111111116 << 12;
                            x57.v(f1118, i211111111111115, ((i211111111111116 >> 3) & 14) | 24576 | ((i211111111111116 << 3) & 112) | (i211111111111116 & 896) | ((i211111111111116 >> 18) & 7168) | (458752 & i211111111111117) | (3670016 & i211111111111117) | (234881024 & i211111111111118) | (i211111111111118 & 1879048192), ((i211111111111116 >> 9) & 14) | 3456 | (57344 & i211111111111117) | 1769472, kx0Var1117, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1117, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f1118;
                            i18 = i211111111111115;
                            kx0Var3 = kx0Var1117;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var1117;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    kx0Var2 = kx0Var;
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                            ardVar2 = ardVar;
                            if (l46Var.g(ardVar2)) {
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i14 = i4;
                    i15 = i3 & 256;
                    if (i15 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z2)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var1118 = fx9Var2;
                            int i211111111111119 = i8;
                            kx0 kx0Var1118 = kx0Var2;
                            float f1119 = f3;
                            int i2111111111111110 = i17;
                            l46Var.s();
                            int i2111111111111111 = i2111111111111110 >> 6;
                            int i2111111111111112 = i2111111111111110 << 12;
                            x57.v(f1119, i211111111111119, ((i2111111111111110 >> 3) & 14) | 24576 | ((i2111111111111110 << 3) & 112) | (i2111111111111110 & 896) | ((i2111111111111110 >> 18) & 7168) | (458752 & i2111111111111111) | (3670016 & i2111111111111111) | (234881024 & i2111111111111112) | (i2111111111111112 & 1879048192), ((i2111111111111110 >> 9) & 14) | 3456 | (57344 & i2111111111111111) | 1769472, kx0Var1118, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1118, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f1119;
                            i18 = i211111111111119;
                            kx0Var3 = kx0Var1118;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var1118;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i14 |= 100663296;
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var1119 = fx9Var2;
                        int i2111111111111113 = i8;
                        kx0 kx0Var1119 = kx0Var2;
                        float f11110 = f3;
                        int i2111111111111114 = i17;
                        l46Var.s();
                        int i2111111111111115 = i2111111111111114 >> 6;
                        int i2111111111111116 = i2111111111111114 << 12;
                        x57.v(f11110, i2111111111111113, ((i2111111111111114 >> 3) & 14) | 24576 | ((i2111111111111114 << 3) & 112) | (i2111111111111114 & 896) | ((i2111111111111114 >> 18) & 7168) | (458752 & i2111111111111115) | (3670016 & i2111111111111115) | (234881024 & i2111111111111116) | (i2111111111111116 & 1879048192), ((i2111111111111114 >> 9) & 14) | 3456 | (57344 & i2111111111111115) | 1769472, kx0Var1119, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1119, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f11110;
                        i18 = i2111111111111113;
                        kx0Var3 = kx0Var1119;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var1119;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i4 |= 196608;
                f3 = f2;
                i12 = i3 & 64;
                if (i12 != 0) {
                    if ((i2 & 1572864) == 0) {
                        kx0Var2 = kx0Var;
                        if (l46Var.g(kx0Var2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                            ardVar2 = ardVar;
                            if (l46Var.g(ardVar2)) {
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i14 = i4;
                    i15 = i3 & 256;
                    if (i15 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z2)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var11110 = fx9Var2;
                            int i2111111111111117 = i8;
                            kx0 kx0Var11110 = kx0Var2;
                            float f11111 = f3;
                            int i2111111111111118 = i17;
                            l46Var.s();
                            int i2111111111111119 = i2111111111111118 >> 6;
                            int i21111111111111110 = i2111111111111118 << 12;
                            x57.v(f11111, i2111111111111117, ((i2111111111111118 >> 3) & 14) | 24576 | ((i2111111111111118 << 3) & 112) | (i2111111111111118 & 896) | ((i2111111111111118 >> 18) & 7168) | (458752 & i2111111111111119) | (3670016 & i2111111111111119) | (234881024 & i21111111111111110) | (i21111111111111110 & 1879048192), ((i2111111111111118 >> 9) & 14) | 3456 | (57344 & i2111111111111119) | 1769472, kx0Var11110, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var11110, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f11111;
                            i18 = i2111111111111117;
                            kx0Var3 = kx0Var11110;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var11110;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i14 |= 100663296;
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var11111 = fx9Var2;
                        int i21111111111111111 = i8;
                        kx0 kx0Var11111 = kx0Var2;
                        float f11112 = f3;
                        int i21111111111111112 = i17;
                        l46Var.s();
                        int i21111111111111113 = i21111111111111112 >> 6;
                        int i21111111111111114 = i21111111111111112 << 12;
                        x57.v(f11112, i21111111111111111, ((i21111111111111112 >> 3) & 14) | 24576 | ((i21111111111111112 << 3) & 112) | (i21111111111111112 & 896) | ((i21111111111111112 >> 18) & 7168) | (458752 & i21111111111111113) | (3670016 & i21111111111111113) | (234881024 & i21111111111111114) | (i21111111111111114 & 1879048192), ((i21111111111111112 >> 9) & 14) | 3456 | (57344 & i21111111111111113) | 1769472, kx0Var11111, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var11111, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f11112;
                        i18 = i21111111111111111;
                        kx0Var3 = kx0Var11111;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var11111;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i4 |= 1572864;
                kx0Var2 = kx0Var;
                if ((i2 & 12582912) == 0) {
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        ardVar2 = ardVar;
                        if (l46Var.g(ardVar2)) {
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i14 = i4;
                i15 = i3 & 256;
                if (i15 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z2)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var11112 = fx9Var2;
                        int i21111111111111115 = i8;
                        kx0 kx0Var11112 = kx0Var2;
                        float f11113 = f3;
                        int i21111111111111116 = i17;
                        l46Var.s();
                        int i21111111111111117 = i21111111111111116 >> 6;
                        int i21111111111111118 = i21111111111111116 << 12;
                        x57.v(f11113, i21111111111111115, ((i21111111111111116 >> 3) & 14) | 24576 | ((i21111111111111116 << 3) & 112) | (i21111111111111116 & 896) | ((i21111111111111116 >> 18) & 7168) | (458752 & i21111111111111117) | (3670016 & i21111111111111117) | (234881024 & i21111111111111118) | (i21111111111111118 & 1879048192), ((i21111111111111116 >> 9) & 14) | 3456 | (57344 & i21111111111111117) | 1769472, kx0Var11112, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var11112, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f11113;
                        i18 = i21111111111111115;
                        kx0Var3 = kx0Var11112;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var11112;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i14 |= 100663296;
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var11113 = fx9Var2;
                    int i21111111111111119 = i8;
                    kx0 kx0Var11113 = kx0Var2;
                    float f11114 = f3;
                    int i211111111111111110 = i17;
                    l46Var.s();
                    int i211111111111111111 = i211111111111111110 >> 6;
                    int i211111111111111112 = i211111111111111110 << 12;
                    x57.v(f11114, i21111111111111119, ((i211111111111111110 >> 3) & 14) | 24576 | ((i211111111111111110 << 3) & 112) | (i211111111111111110 & 896) | ((i211111111111111110 >> 18) & 7168) | (458752 & i211111111111111111) | (3670016 & i211111111111111111) | (234881024 & i211111111111111112) | (i211111111111111112 & 1879048192), ((i211111111111111110 >> 9) & 14) | 3456 | (57344 & i211111111111111111) | 1769472, kx0Var11113, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var11113, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f11114;
                    i18 = i21111111111111119;
                    kx0Var3 = kx0Var11113;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var11113;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i4 |= 24576;
            i8 = i;
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((i2 & 196608) == 0) {
                    f3 = f2;
                    if (l46Var.d(f3)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 64;
                if (i12 != 0) {
                    if ((i2 & 1572864) == 0) {
                        kx0Var2 = kx0Var;
                        if (l46Var.g(kx0Var2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                            ardVar2 = ardVar;
                            if (l46Var.g(ardVar2)) {
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i14 = i4;
                    i15 = i3 & 256;
                    if (i15 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z2)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var11114 = fx9Var2;
                            int i211111111111111113 = i8;
                            kx0 kx0Var11114 = kx0Var2;
                            float f11115 = f3;
                            int i211111111111111114 = i17;
                            l46Var.s();
                            int i211111111111111115 = i211111111111111114 >> 6;
                            int i211111111111111116 = i211111111111111114 << 12;
                            x57.v(f11115, i211111111111111113, ((i211111111111111114 >> 3) & 14) | 24576 | ((i211111111111111114 << 3) & 112) | (i211111111111111114 & 896) | ((i211111111111111114 >> 18) & 7168) | (458752 & i211111111111111115) | (3670016 & i211111111111111115) | (234881024 & i211111111111111116) | (i211111111111111116 & 1879048192), ((i211111111111111114 >> 9) & 14) | 3456 | (57344 & i211111111111111115) | 1769472, kx0Var11114, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var11114, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f11115;
                            i18 = i211111111111111113;
                            kx0Var3 = kx0Var11114;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var11114;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i14 |= 100663296;
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var11115 = fx9Var2;
                        int i211111111111111117 = i8;
                        kx0 kx0Var11115 = kx0Var2;
                        float f11116 = f3;
                        int i211111111111111118 = i17;
                        l46Var.s();
                        int i211111111111111119 = i211111111111111118 >> 6;
                        int i2111111111111111110 = i211111111111111118 << 12;
                        x57.v(f11116, i211111111111111117, ((i211111111111111118 >> 3) & 14) | 24576 | ((i211111111111111118 << 3) & 112) | (i211111111111111118 & 896) | ((i211111111111111118 >> 18) & 7168) | (458752 & i211111111111111119) | (3670016 & i211111111111111119) | (234881024 & i2111111111111111110) | (i2111111111111111110 & 1879048192), ((i211111111111111118 >> 9) & 14) | 3456 | (57344 & i211111111111111119) | 1769472, kx0Var11115, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var11115, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f11116;
                        i18 = i211111111111111117;
                        kx0Var3 = kx0Var11115;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var11115;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i4 |= 1572864;
                kx0Var2 = kx0Var;
                if ((i2 & 12582912) == 0) {
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        ardVar2 = ardVar;
                        if (l46Var.g(ardVar2)) {
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i14 = i4;
                i15 = i3 & 256;
                if (i15 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z2)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var11116 = fx9Var2;
                        int i2111111111111111111 = i8;
                        kx0 kx0Var11116 = kx0Var2;
                        float f11117 = f3;
                        int i2111111111111111112 = i17;
                        l46Var.s();
                        int i2111111111111111113 = i2111111111111111112 >> 6;
                        int i2111111111111111114 = i2111111111111111112 << 12;
                        x57.v(f11117, i2111111111111111111, ((i2111111111111111112 >> 3) & 14) | 24576 | ((i2111111111111111112 << 3) & 112) | (i2111111111111111112 & 896) | ((i2111111111111111112 >> 18) & 7168) | (458752 & i2111111111111111113) | (3670016 & i2111111111111111113) | (234881024 & i2111111111111111114) | (i2111111111111111114 & 1879048192), ((i2111111111111111112 >> 9) & 14) | 3456 | (57344 & i2111111111111111113) | 1769472, kx0Var11116, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var11116, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f11117;
                        i18 = i2111111111111111111;
                        kx0Var3 = kx0Var11116;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var11116;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i14 |= 100663296;
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var11117 = fx9Var2;
                    int i2111111111111111115 = i8;
                    kx0 kx0Var11117 = kx0Var2;
                    float f11118 = f3;
                    int i2111111111111111116 = i17;
                    l46Var.s();
                    int i2111111111111111117 = i2111111111111111116 >> 6;
                    int i2111111111111111118 = i2111111111111111116 << 12;
                    x57.v(f11118, i2111111111111111115, ((i2111111111111111116 >> 3) & 14) | 24576 | ((i2111111111111111116 << 3) & 112) | (i2111111111111111116 & 896) | ((i2111111111111111116 >> 18) & 7168) | (458752 & i2111111111111111117) | (3670016 & i2111111111111111117) | (234881024 & i2111111111111111118) | (i2111111111111111118 & 1879048192), ((i2111111111111111116 >> 9) & 14) | 3456 | (57344 & i2111111111111111117) | 1769472, kx0Var11117, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var11117, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f11118;
                    i18 = i2111111111111111115;
                    kx0Var3 = kx0Var11117;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var11117;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i4 |= 196608;
            f3 = f2;
            i12 = i3 & 64;
            if (i12 != 0) {
                if ((i2 & 1572864) == 0) {
                    kx0Var2 = kx0Var;
                    if (l46Var.g(kx0Var2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        ardVar2 = ardVar;
                        if (l46Var.g(ardVar2)) {
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i14 = i4;
                i15 = i3 & 256;
                if (i15 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z2)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var11118 = fx9Var2;
                        int i2111111111111111119 = i8;
                        kx0 kx0Var11118 = kx0Var2;
                        float f11119 = f3;
                        int i21111111111111111110 = i17;
                        l46Var.s();
                        int i21111111111111111111 = i21111111111111111110 >> 6;
                        int i21111111111111111112 = i21111111111111111110 << 12;
                        x57.v(f11119, i2111111111111111119, ((i21111111111111111110 >> 3) & 14) | 24576 | ((i21111111111111111110 << 3) & 112) | (i21111111111111111110 & 896) | ((i21111111111111111110 >> 18) & 7168) | (458752 & i21111111111111111111) | (3670016 & i21111111111111111111) | (234881024 & i21111111111111111112) | (i21111111111111111112 & 1879048192), ((i21111111111111111110 >> 9) & 14) | 3456 | (57344 & i21111111111111111111) | 1769472, kx0Var11118, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var11118, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f11119;
                        i18 = i2111111111111111119;
                        kx0Var3 = kx0Var11118;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var11118;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i14 |= 100663296;
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var11119 = fx9Var2;
                    int i21111111111111111113 = i8;
                    kx0 kx0Var11119 = kx0Var2;
                    float f111110 = f3;
                    int i21111111111111111114 = i17;
                    l46Var.s();
                    int i21111111111111111115 = i21111111111111111114 >> 6;
                    int i21111111111111111116 = i21111111111111111114 << 12;
                    x57.v(f111110, i21111111111111111113, ((i21111111111111111114 >> 3) & 14) | 24576 | ((i21111111111111111114 << 3) & 112) | (i21111111111111111114 & 896) | ((i21111111111111111114 >> 18) & 7168) | (458752 & i21111111111111111115) | (3670016 & i21111111111111111115) | (234881024 & i21111111111111111116) | (i21111111111111111116 & 1879048192), ((i21111111111111111114 >> 9) & 14) | 3456 | (57344 & i21111111111111111115) | 1769472, kx0Var11119, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var11119, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f111110;
                    i18 = i21111111111111111113;
                    kx0Var3 = kx0Var11119;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var11119;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i4 |= 1572864;
            kx0Var2 = kx0Var;
            if ((i2 & 12582912) == 0) {
                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                    ardVar2 = ardVar;
                    if (l46Var.g(ardVar2)) {
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i4 |= i22;
            } else {
                ardVar2 = ardVar;
            }
            i14 = i4;
            i15 = i3 & 256;
            if (i15 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (l46Var.h(z2)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i14 |= i16;
                }
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var111110 = fx9Var2;
                    int i21111111111111111117 = i8;
                    kx0 kx0Var111110 = kx0Var2;
                    float f111111 = f3;
                    int i21111111111111111118 = i17;
                    l46Var.s();
                    int i21111111111111111119 = i21111111111111111118 >> 6;
                    int i211111111111111111110 = i21111111111111111118 << 12;
                    x57.v(f111111, i21111111111111111117, ((i21111111111111111118 >> 3) & 14) | 24576 | ((i21111111111111111118 << 3) & 112) | (i21111111111111111118 & 896) | ((i21111111111111111118 >> 18) & 7168) | (458752 & i21111111111111111119) | (3670016 & i21111111111111111119) | (234881024 & i211111111111111111110) | (i211111111111111111110 & 1879048192), ((i21111111111111111118 >> 9) & 14) | 3456 | (57344 & i21111111111111111119) | 1769472, kx0Var111110, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var111110, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f111111;
                    i18 = i21111111111111111117;
                    kx0Var3 = kx0Var111110;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var111110;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i14 |= 100663296;
            i17 = i14 | 805306368;
            z3 = true;
            if ((i17 & 306783379) == 306783378) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (l46Var.W(i17 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                } else {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                }
                fx9 fx9Var111111 = fx9Var2;
                int i211111111111111111111 = i8;
                kx0 kx0Var111111 = kx0Var2;
                float f111112 = f3;
                int i211111111111111111112 = i17;
                l46Var.s();
                int i211111111111111111113 = i211111111111111111112 >> 6;
                int i211111111111111111114 = i211111111111111111112 << 12;
                x57.v(f111112, i211111111111111111111, ((i211111111111111111112 >> 3) & 14) | 24576 | ((i211111111111111111112 << 3) & 112) | (i211111111111111111112 & 896) | ((i211111111111111111112 >> 18) & 7168) | (458752 & i211111111111111111113) | (3670016 & i211111111111111111113) | (234881024 & i211111111111111111114) | (i211111111111111111114 & 1879048192), ((i211111111111111111112 >> 9) & 14) | 3456 | (57344 & i211111111111111111113) | 1769472, kx0Var111111, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var111111, yx9Var2, ardVar4, frdVar3, z7);
                f4 = f111112;
                i18 = i211111111111111111111;
                kx0Var3 = kx0Var111111;
                j09Var2 = j09Var4;
                pc9Var2 = pc9Var3;
                lu9Var2 = lu9VarB;
                xw9Var3 = xw9Var4;
                fx9Var3 = fx9Var111111;
                ardVar3 = ardVar4;
                frdVar2 = frdVar3;
                z5 = z7;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                frdVar2 = frdVar;
                z5 = z2;
                xw9Var3 = xw9Var2;
                fx9Var3 = fx9Var2;
                i18 = i8;
                kx0Var3 = kx0Var2;
                pc9Var2 = pc9Var;
                lu9Var2 = lu9Var;
                ardVar3 = ardVar2;
                f4 = f3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
            }
        }
        i4 |= 3072;
        fx9Var2 = fx9Var;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                i8 = i;
                if (l46Var.e(i8)) {
                    i9 = 16384;
                } else {
                    i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i9;
            }
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((i2 & 196608) == 0) {
                    f3 = f2;
                    if (l46Var.d(f3)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 64;
                if (i12 != 0) {
                    if ((i2 & 1572864) == 0) {
                        kx0Var2 = kx0Var;
                        if (l46Var.g(kx0Var2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                            ardVar2 = ardVar;
                            if (l46Var.g(ardVar2)) {
                            }
                            i4 |= i22;
                        } else {
                            ardVar2 = ardVar;
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i14 = i4;
                    i15 = i3 & 256;
                    if (i15 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z2)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        i17 = i14 | 805306368;
                        z3 = true;
                        if ((i17 & 306783379) == 306783378) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i17 & 1, z4)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            } else {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var2;
                                }
                                if (i5 != 0) {
                                    fx9Var2 = hj6.U0;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    f3 = 0.0f;
                                }
                                if (i12 != 0) {
                                    kx0Var2 = ndb.z;
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    yx9Var2 = yx9Var;
                                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                    i17 &= -29360129;
                                } else {
                                    yx9Var2 = yx9Var;
                                    ardVarV = ardVar2;
                                }
                                if (i15 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                }
                                i19 = (i17 & 14) | 432;
                                cv7Var = (cv7) l46Var.k(zg2.n);
                                if (((i19 & 14) ^ 6) > 4) {
                                }
                                zE = z3 | l46Var.e(cv7Var.ordinal());
                                objR = l46Var.R();
                                if (zE) {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                } else {
                                    objR = new bs3(yx9Var2, cv7Var);
                                    l46Var.p0(objR);
                                }
                                ardVar4 = ardVarV;
                                z7 = z6;
                                frdVar3 = gec.v;
                                j09Var4 = j09Var3;
                                xw9Var4 = bx9Var;
                                pc9Var3 = (bs3) objR;
                                lu9VarB = mu9.b(l46Var);
                            }
                            fx9 fx9Var111112 = fx9Var2;
                            int i211111111111111111115 = i8;
                            kx0 kx0Var111112 = kx0Var2;
                            float f111113 = f3;
                            int i211111111111111111116 = i17;
                            l46Var.s();
                            int i211111111111111111117 = i211111111111111111116 >> 6;
                            int i211111111111111111118 = i211111111111111111116 << 12;
                            x57.v(f111113, i211111111111111111115, ((i211111111111111111116 >> 3) & 14) | 24576 | ((i211111111111111111116 << 3) & 112) | (i211111111111111111116 & 896) | ((i211111111111111111116 >> 18) & 7168) | (458752 & i211111111111111111117) | (3670016 & i211111111111111111117) | (234881024 & i211111111111111111118) | (i211111111111111111118 & 1879048192), ((i211111111111111111116 >> 9) & 14) | 3456 | (57344 & i211111111111111111117) | 1769472, kx0Var111112, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var111112, yx9Var2, ardVar4, frdVar3, z7);
                            f4 = f111113;
                            i18 = i211111111111111111115;
                            kx0Var3 = kx0Var111112;
                            j09Var2 = j09Var4;
                            pc9Var2 = pc9Var3;
                            lu9Var2 = lu9VarB;
                            xw9Var3 = xw9Var4;
                            fx9Var3 = fx9Var111112;
                            ardVar3 = ardVar4;
                            frdVar2 = frdVar3;
                            z5 = z7;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            frdVar2 = frdVar;
                            z5 = z2;
                            xw9Var3 = xw9Var2;
                            fx9Var3 = fx9Var2;
                            i18 = i8;
                            kx0Var3 = kx0Var2;
                            pc9Var2 = pc9Var;
                            lu9Var2 = lu9Var;
                            ardVar3 = ardVar2;
                            f4 = f3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                        }
                    }
                    i14 |= 100663296;
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var111113 = fx9Var2;
                        int i211111111111111111119 = i8;
                        kx0 kx0Var111113 = kx0Var2;
                        float f111114 = f3;
                        int i2111111111111111111110 = i17;
                        l46Var.s();
                        int i2111111111111111111111 = i2111111111111111111110 >> 6;
                        int i2111111111111111111112 = i2111111111111111111110 << 12;
                        x57.v(f111114, i211111111111111111119, ((i2111111111111111111110 >> 3) & 14) | 24576 | ((i2111111111111111111110 << 3) & 112) | (i2111111111111111111110 & 896) | ((i2111111111111111111110 >> 18) & 7168) | (458752 & i2111111111111111111111) | (3670016 & i2111111111111111111111) | (234881024 & i2111111111111111111112) | (i2111111111111111111112 & 1879048192), ((i2111111111111111111110 >> 9) & 14) | 3456 | (57344 & i2111111111111111111111) | 1769472, kx0Var111113, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var111113, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f111114;
                        i18 = i211111111111111111119;
                        kx0Var3 = kx0Var111113;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var111113;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i4 |= 1572864;
                kx0Var2 = kx0Var;
                if ((i2 & 12582912) == 0) {
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        ardVar2 = ardVar;
                        if (l46Var.g(ardVar2)) {
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i14 = i4;
                i15 = i3 & 256;
                if (i15 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z2)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var111114 = fx9Var2;
                        int i2111111111111111111113 = i8;
                        kx0 kx0Var111114 = kx0Var2;
                        float f111115 = f3;
                        int i2111111111111111111114 = i17;
                        l46Var.s();
                        int i2111111111111111111115 = i2111111111111111111114 >> 6;
                        int i2111111111111111111116 = i2111111111111111111114 << 12;
                        x57.v(f111115, i2111111111111111111113, ((i2111111111111111111114 >> 3) & 14) | 24576 | ((i2111111111111111111114 << 3) & 112) | (i2111111111111111111114 & 896) | ((i2111111111111111111114 >> 18) & 7168) | (458752 & i2111111111111111111115) | (3670016 & i2111111111111111111115) | (234881024 & i2111111111111111111116) | (i2111111111111111111116 & 1879048192), ((i2111111111111111111114 >> 9) & 14) | 3456 | (57344 & i2111111111111111111115) | 1769472, kx0Var111114, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var111114, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f111115;
                        i18 = i2111111111111111111113;
                        kx0Var3 = kx0Var111114;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var111114;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i14 |= 100663296;
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var111115 = fx9Var2;
                    int i2111111111111111111117 = i8;
                    kx0 kx0Var111115 = kx0Var2;
                    float f111116 = f3;
                    int i2111111111111111111118 = i17;
                    l46Var.s();
                    int i2111111111111111111119 = i2111111111111111111118 >> 6;
                    int i21111111111111111111110 = i2111111111111111111118 << 12;
                    x57.v(f111116, i2111111111111111111117, ((i2111111111111111111118 >> 3) & 14) | 24576 | ((i2111111111111111111118 << 3) & 112) | (i2111111111111111111118 & 896) | ((i2111111111111111111118 >> 18) & 7168) | (458752 & i2111111111111111111119) | (3670016 & i2111111111111111111119) | (234881024 & i21111111111111111111110) | (i21111111111111111111110 & 1879048192), ((i2111111111111111111118 >> 9) & 14) | 3456 | (57344 & i2111111111111111111119) | 1769472, kx0Var111115, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var111115, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f111116;
                    i18 = i2111111111111111111117;
                    kx0Var3 = kx0Var111115;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var111115;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i4 |= 196608;
            f3 = f2;
            i12 = i3 & 64;
            if (i12 != 0) {
                if ((i2 & 1572864) == 0) {
                    kx0Var2 = kx0Var;
                    if (l46Var.g(kx0Var2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        ardVar2 = ardVar;
                        if (l46Var.g(ardVar2)) {
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i14 = i4;
                i15 = i3 & 256;
                if (i15 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z2)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var111116 = fx9Var2;
                        int i21111111111111111111111 = i8;
                        kx0 kx0Var111116 = kx0Var2;
                        float f111117 = f3;
                        int i21111111111111111111112 = i17;
                        l46Var.s();
                        int i21111111111111111111113 = i21111111111111111111112 >> 6;
                        int i21111111111111111111114 = i21111111111111111111112 << 12;
                        x57.v(f111117, i21111111111111111111111, ((i21111111111111111111112 >> 3) & 14) | 24576 | ((i21111111111111111111112 << 3) & 112) | (i21111111111111111111112 & 896) | ((i21111111111111111111112 >> 18) & 7168) | (458752 & i21111111111111111111113) | (3670016 & i21111111111111111111113) | (234881024 & i21111111111111111111114) | (i21111111111111111111114 & 1879048192), ((i21111111111111111111112 >> 9) & 14) | 3456 | (57344 & i21111111111111111111113) | 1769472, kx0Var111116, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var111116, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f111117;
                        i18 = i21111111111111111111111;
                        kx0Var3 = kx0Var111116;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var111116;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i14 |= 100663296;
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var111117 = fx9Var2;
                    int i21111111111111111111115 = i8;
                    kx0 kx0Var111117 = kx0Var2;
                    float f111118 = f3;
                    int i21111111111111111111116 = i17;
                    l46Var.s();
                    int i21111111111111111111117 = i21111111111111111111116 >> 6;
                    int i21111111111111111111118 = i21111111111111111111116 << 12;
                    x57.v(f111118, i21111111111111111111115, ((i21111111111111111111116 >> 3) & 14) | 24576 | ((i21111111111111111111116 << 3) & 112) | (i21111111111111111111116 & 896) | ((i21111111111111111111116 >> 18) & 7168) | (458752 & i21111111111111111111117) | (3670016 & i21111111111111111111117) | (234881024 & i21111111111111111111118) | (i21111111111111111111118 & 1879048192), ((i21111111111111111111116 >> 9) & 14) | 3456 | (57344 & i21111111111111111111117) | 1769472, kx0Var111117, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var111117, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f111118;
                    i18 = i21111111111111111111115;
                    kx0Var3 = kx0Var111117;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var111117;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i4 |= 1572864;
            kx0Var2 = kx0Var;
            if ((i2 & 12582912) == 0) {
                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                    ardVar2 = ardVar;
                    if (l46Var.g(ardVar2)) {
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i4 |= i22;
            } else {
                ardVar2 = ardVar;
            }
            i14 = i4;
            i15 = i3 & 256;
            if (i15 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (l46Var.h(z2)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i14 |= i16;
                }
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var111118 = fx9Var2;
                    int i21111111111111111111119 = i8;
                    kx0 kx0Var111118 = kx0Var2;
                    float f111119 = f3;
                    int i211111111111111111111110 = i17;
                    l46Var.s();
                    int i211111111111111111111111 = i211111111111111111111110 >> 6;
                    int i211111111111111111111112 = i211111111111111111111110 << 12;
                    x57.v(f111119, i21111111111111111111119, ((i211111111111111111111110 >> 3) & 14) | 24576 | ((i211111111111111111111110 << 3) & 112) | (i211111111111111111111110 & 896) | ((i211111111111111111111110 >> 18) & 7168) | (458752 & i211111111111111111111111) | (3670016 & i211111111111111111111111) | (234881024 & i211111111111111111111112) | (i211111111111111111111112 & 1879048192), ((i211111111111111111111110 >> 9) & 14) | 3456 | (57344 & i211111111111111111111111) | 1769472, kx0Var111118, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var111118, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f111119;
                    i18 = i21111111111111111111119;
                    kx0Var3 = kx0Var111118;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var111118;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i14 |= 100663296;
            i17 = i14 | 805306368;
            z3 = true;
            if ((i17 & 306783379) == 306783378) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (l46Var.W(i17 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                } else {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                }
                fx9 fx9Var111119 = fx9Var2;
                int i211111111111111111111113 = i8;
                kx0 kx0Var111119 = kx0Var2;
                float f1111110 = f3;
                int i211111111111111111111114 = i17;
                l46Var.s();
                int i211111111111111111111115 = i211111111111111111111114 >> 6;
                int i211111111111111111111116 = i211111111111111111111114 << 12;
                x57.v(f1111110, i211111111111111111111113, ((i211111111111111111111114 >> 3) & 14) | 24576 | ((i211111111111111111111114 << 3) & 112) | (i211111111111111111111114 & 896) | ((i211111111111111111111114 >> 18) & 7168) | (458752 & i211111111111111111111115) | (3670016 & i211111111111111111111115) | (234881024 & i211111111111111111111116) | (i211111111111111111111116 & 1879048192), ((i211111111111111111111114 >> 9) & 14) | 3456 | (57344 & i211111111111111111111115) | 1769472, kx0Var111119, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var111119, yx9Var2, ardVar4, frdVar3, z7);
                f4 = f1111110;
                i18 = i211111111111111111111113;
                kx0Var3 = kx0Var111119;
                j09Var2 = j09Var4;
                pc9Var2 = pc9Var3;
                lu9Var2 = lu9VarB;
                xw9Var3 = xw9Var4;
                fx9Var3 = fx9Var111119;
                ardVar3 = ardVar4;
                frdVar2 = frdVar3;
                z5 = z7;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                frdVar2 = frdVar;
                z5 = z2;
                xw9Var3 = xw9Var2;
                fx9Var3 = fx9Var2;
                i18 = i8;
                kx0Var3 = kx0Var2;
                pc9Var2 = pc9Var;
                lu9Var2 = lu9Var;
                ardVar3 = ardVar2;
                f4 = f3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
            }
        }
        i4 |= 24576;
        i8 = i;
        i10 = i3 & 32;
        if (i10 != 0) {
            if ((i2 & 196608) == 0) {
                f3 = f2;
                if (l46Var.d(f3)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            }
            i12 = i3 & 64;
            if (i12 != 0) {
                if ((i2 & 1572864) == 0) {
                    kx0Var2 = kx0Var;
                    if (l46Var.g(kx0Var2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        ardVar2 = ardVar;
                        if (l46Var.g(ardVar2)) {
                        }
                        i4 |= i22;
                    } else {
                        ardVar2 = ardVar;
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i14 = i4;
                i15 = i3 & 256;
                if (i15 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z2)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    i17 = i14 | 805306368;
                    z3 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i17 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var2;
                            }
                            if (i5 != 0) {
                                fx9Var2 = hj6.U0;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                f3 = 0.0f;
                            }
                            if (i12 != 0) {
                                kx0Var2 = ndb.z;
                            }
                            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                yx9Var2 = yx9Var;
                                ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                                i17 &= -29360129;
                            } else {
                                yx9Var2 = yx9Var;
                                ardVarV = ardVar2;
                            }
                            if (i15 != 0) {
                                z6 = true;
                            } else {
                                z6 = z2;
                            }
                            i19 = (i17 & 14) | 432;
                            cv7Var = (cv7) l46Var.k(zg2.n);
                            if (((i19 & 14) ^ 6) > 4) {
                            }
                            zE = z3 | l46Var.e(cv7Var.ordinal());
                            objR = l46Var.R();
                            if (zE) {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            } else {
                                objR = new bs3(yx9Var2, cv7Var);
                                l46Var.p0(objR);
                            }
                            ardVar4 = ardVarV;
                            z7 = z6;
                            frdVar3 = gec.v;
                            j09Var4 = j09Var3;
                            xw9Var4 = bx9Var;
                            pc9Var3 = (bs3) objR;
                            lu9VarB = mu9.b(l46Var);
                        }
                        fx9 fx9Var1111110 = fx9Var2;
                        int i211111111111111111111117 = i8;
                        kx0 kx0Var1111110 = kx0Var2;
                        float f1111111 = f3;
                        int i211111111111111111111118 = i17;
                        l46Var.s();
                        int i211111111111111111111119 = i211111111111111111111118 >> 6;
                        int i2111111111111111111111110 = i211111111111111111111118 << 12;
                        x57.v(f1111111, i211111111111111111111117, ((i211111111111111111111118 >> 3) & 14) | 24576 | ((i211111111111111111111118 << 3) & 112) | (i211111111111111111111118 & 896) | ((i211111111111111111111118 >> 18) & 7168) | (458752 & i211111111111111111111119) | (3670016 & i211111111111111111111119) | (234881024 & i2111111111111111111111110) | (i2111111111111111111111110 & 1879048192), ((i211111111111111111111118 >> 9) & 14) | 3456 | (57344 & i211111111111111111111119) | 1769472, kx0Var1111110, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1111110, yx9Var2, ardVar4, frdVar3, z7);
                        f4 = f1111111;
                        i18 = i211111111111111111111117;
                        kx0Var3 = kx0Var1111110;
                        j09Var2 = j09Var4;
                        pc9Var2 = pc9Var3;
                        lu9Var2 = lu9VarB;
                        xw9Var3 = xw9Var4;
                        fx9Var3 = fx9Var1111110;
                        ardVar3 = ardVar4;
                        frdVar2 = frdVar3;
                        z5 = z7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        frdVar2 = frdVar;
                        z5 = z2;
                        xw9Var3 = xw9Var2;
                        fx9Var3 = fx9Var2;
                        i18 = i8;
                        kx0Var3 = kx0Var2;
                        pc9Var2 = pc9Var;
                        lu9Var2 = lu9Var;
                        ardVar3 = ardVar2;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                    }
                }
                i14 |= 100663296;
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var1111111 = fx9Var2;
                    int i2111111111111111111111111 = i8;
                    kx0 kx0Var1111111 = kx0Var2;
                    float f1111112 = f3;
                    int i2111111111111111111111112 = i17;
                    l46Var.s();
                    int i2111111111111111111111113 = i2111111111111111111111112 >> 6;
                    int i2111111111111111111111114 = i2111111111111111111111112 << 12;
                    x57.v(f1111112, i2111111111111111111111111, ((i2111111111111111111111112 >> 3) & 14) | 24576 | ((i2111111111111111111111112 << 3) & 112) | (i2111111111111111111111112 & 896) | ((i2111111111111111111111112 >> 18) & 7168) | (458752 & i2111111111111111111111113) | (3670016 & i2111111111111111111111113) | (234881024 & i2111111111111111111111114) | (i2111111111111111111111114 & 1879048192), ((i2111111111111111111111112 >> 9) & 14) | 3456 | (57344 & i2111111111111111111111113) | 1769472, kx0Var1111111, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1111111, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f1111112;
                    i18 = i2111111111111111111111111;
                    kx0Var3 = kx0Var1111111;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var1111111;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i4 |= 1572864;
            kx0Var2 = kx0Var;
            if ((i2 & 12582912) == 0) {
                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                    ardVar2 = ardVar;
                    if (l46Var.g(ardVar2)) {
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i4 |= i22;
            } else {
                ardVar2 = ardVar;
            }
            i14 = i4;
            i15 = i3 & 256;
            if (i15 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (l46Var.h(z2)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i14 |= i16;
                }
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var1111112 = fx9Var2;
                    int i2111111111111111111111115 = i8;
                    kx0 kx0Var1111112 = kx0Var2;
                    float f1111113 = f3;
                    int i2111111111111111111111116 = i17;
                    l46Var.s();
                    int i2111111111111111111111117 = i2111111111111111111111116 >> 6;
                    int i2111111111111111111111118 = i2111111111111111111111116 << 12;
                    x57.v(f1111113, i2111111111111111111111115, ((i2111111111111111111111116 >> 3) & 14) | 24576 | ((i2111111111111111111111116 << 3) & 112) | (i2111111111111111111111116 & 896) | ((i2111111111111111111111116 >> 18) & 7168) | (458752 & i2111111111111111111111117) | (3670016 & i2111111111111111111111117) | (234881024 & i2111111111111111111111118) | (i2111111111111111111111118 & 1879048192), ((i2111111111111111111111116 >> 9) & 14) | 3456 | (57344 & i2111111111111111111111117) | 1769472, kx0Var1111112, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1111112, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f1111113;
                    i18 = i2111111111111111111111115;
                    kx0Var3 = kx0Var1111112;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var1111112;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i14 |= 100663296;
            i17 = i14 | 805306368;
            z3 = true;
            if ((i17 & 306783379) == 306783378) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (l46Var.W(i17 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                } else {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                }
                fx9 fx9Var1111113 = fx9Var2;
                int i2111111111111111111111119 = i8;
                kx0 kx0Var1111113 = kx0Var2;
                float f1111114 = f3;
                int i21111111111111111111111110 = i17;
                l46Var.s();
                int i21111111111111111111111111 = i21111111111111111111111110 >> 6;
                int i21111111111111111111111112 = i21111111111111111111111110 << 12;
                x57.v(f1111114, i2111111111111111111111119, ((i21111111111111111111111110 >> 3) & 14) | 24576 | ((i21111111111111111111111110 << 3) & 112) | (i21111111111111111111111110 & 896) | ((i21111111111111111111111110 >> 18) & 7168) | (458752 & i21111111111111111111111111) | (3670016 & i21111111111111111111111111) | (234881024 & i21111111111111111111111112) | (i21111111111111111111111112 & 1879048192), ((i21111111111111111111111110 >> 9) & 14) | 3456 | (57344 & i21111111111111111111111111) | 1769472, kx0Var1111113, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1111113, yx9Var2, ardVar4, frdVar3, z7);
                f4 = f1111114;
                i18 = i2111111111111111111111119;
                kx0Var3 = kx0Var1111113;
                j09Var2 = j09Var4;
                pc9Var2 = pc9Var3;
                lu9Var2 = lu9VarB;
                xw9Var3 = xw9Var4;
                fx9Var3 = fx9Var1111113;
                ardVar3 = ardVar4;
                frdVar2 = frdVar3;
                z5 = z7;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                frdVar2 = frdVar;
                z5 = z2;
                xw9Var3 = xw9Var2;
                fx9Var3 = fx9Var2;
                i18 = i8;
                kx0Var3 = kx0Var2;
                pc9Var2 = pc9Var;
                lu9Var2 = lu9Var;
                ardVar3 = ardVar2;
                f4 = f3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
            }
        }
        i4 |= 196608;
        f3 = f2;
        i12 = i3 & 64;
        if (i12 != 0) {
            if ((i2 & 1572864) == 0) {
                kx0Var2 = kx0Var;
                if (l46Var.g(kx0Var2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i4 |= i13;
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                    ardVar2 = ardVar;
                    if (l46Var.g(ardVar2)) {
                    }
                    i4 |= i22;
                } else {
                    ardVar2 = ardVar;
                }
                i4 |= i22;
            } else {
                ardVar2 = ardVar;
            }
            i14 = i4;
            i15 = i3 & 256;
            if (i15 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (l46Var.h(z2)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i14 |= i16;
                }
                i17 = i14 | 805306368;
                z3 = true;
                if ((i17 & 306783379) == 306783378) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i17 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var2;
                        }
                        if (i5 != 0) {
                            fx9Var2 = hj6.U0;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            f3 = 0.0f;
                        }
                        if (i12 != 0) {
                            kx0Var2 = ndb.z;
                        }
                        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            yx9Var2 = yx9Var;
                            ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                            i17 &= -29360129;
                        } else {
                            yx9Var2 = yx9Var;
                            ardVarV = ardVar2;
                        }
                        if (i15 != 0) {
                            z6 = true;
                        } else {
                            z6 = z2;
                        }
                        i19 = (i17 & 14) | 432;
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        if (((i19 & 14) ^ 6) > 4) {
                        }
                        zE = z3 | l46Var.e(cv7Var.ordinal());
                        objR = l46Var.R();
                        if (zE) {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new bs3(yx9Var2, cv7Var);
                            l46Var.p0(objR);
                        }
                        ardVar4 = ardVarV;
                        z7 = z6;
                        frdVar3 = gec.v;
                        j09Var4 = j09Var3;
                        xw9Var4 = bx9Var;
                        pc9Var3 = (bs3) objR;
                        lu9VarB = mu9.b(l46Var);
                    }
                    fx9 fx9Var1111114 = fx9Var2;
                    int i21111111111111111111111113 = i8;
                    kx0 kx0Var1111114 = kx0Var2;
                    float f1111115 = f3;
                    int i21111111111111111111111114 = i17;
                    l46Var.s();
                    int i21111111111111111111111115 = i21111111111111111111111114 >> 6;
                    int i21111111111111111111111116 = i21111111111111111111111114 << 12;
                    x57.v(f1111115, i21111111111111111111111113, ((i21111111111111111111111114 >> 3) & 14) | 24576 | ((i21111111111111111111111114 << 3) & 112) | (i21111111111111111111111114 & 896) | ((i21111111111111111111111114 >> 18) & 7168) | (458752 & i21111111111111111111111115) | (3670016 & i21111111111111111111111115) | (234881024 & i21111111111111111111111116) | (i21111111111111111111111116 & 1879048192), ((i21111111111111111111111114 >> 9) & 14) | 3456 | (57344 & i21111111111111111111111115) | 1769472, kx0Var1111114, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1111114, yx9Var2, ardVar4, frdVar3, z7);
                    f4 = f1111115;
                    i18 = i21111111111111111111111113;
                    kx0Var3 = kx0Var1111114;
                    j09Var2 = j09Var4;
                    pc9Var2 = pc9Var3;
                    lu9Var2 = lu9VarB;
                    xw9Var3 = xw9Var4;
                    fx9Var3 = fx9Var1111114;
                    ardVar3 = ardVar4;
                    frdVar2 = frdVar3;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    frdVar2 = frdVar;
                    z5 = z2;
                    xw9Var3 = xw9Var2;
                    fx9Var3 = fx9Var2;
                    i18 = i8;
                    kx0Var3 = kx0Var2;
                    pc9Var2 = pc9Var;
                    lu9Var2 = lu9Var;
                    ardVar3 = ardVar2;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
                }
            }
            i14 |= 100663296;
            i17 = i14 | 805306368;
            z3 = true;
            if ((i17 & 306783379) == 306783378) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (l46Var.W(i17 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                } else {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                }
                fx9 fx9Var1111115 = fx9Var2;
                int i21111111111111111111111117 = i8;
                kx0 kx0Var1111115 = kx0Var2;
                float f1111116 = f3;
                int i21111111111111111111111118 = i17;
                l46Var.s();
                int i21111111111111111111111119 = i21111111111111111111111118 >> 6;
                int i211111111111111111111111110 = i21111111111111111111111118 << 12;
                x57.v(f1111116, i21111111111111111111111117, ((i21111111111111111111111118 >> 3) & 14) | 24576 | ((i21111111111111111111111118 << 3) & 112) | (i21111111111111111111111118 & 896) | ((i21111111111111111111111118 >> 18) & 7168) | (458752 & i21111111111111111111111119) | (3670016 & i21111111111111111111111119) | (234881024 & i211111111111111111111111110) | (i211111111111111111111111110 & 1879048192), ((i21111111111111111111111118 >> 9) & 14) | 3456 | (57344 & i21111111111111111111111119) | 1769472, kx0Var1111115, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1111115, yx9Var2, ardVar4, frdVar3, z7);
                f4 = f1111116;
                i18 = i21111111111111111111111117;
                kx0Var3 = kx0Var1111115;
                j09Var2 = j09Var4;
                pc9Var2 = pc9Var3;
                lu9Var2 = lu9VarB;
                xw9Var3 = xw9Var4;
                fx9Var3 = fx9Var1111115;
                ardVar3 = ardVar4;
                frdVar2 = frdVar3;
                z5 = z7;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                frdVar2 = frdVar;
                z5 = z2;
                xw9Var3 = xw9Var2;
                fx9Var3 = fx9Var2;
                i18 = i8;
                kx0Var3 = kx0Var2;
                pc9Var2 = pc9Var;
                lu9Var2 = lu9Var;
                ardVar3 = ardVar2;
                f4 = f3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
            }
        }
        i4 |= 1572864;
        kx0Var2 = kx0Var;
        if ((i2 & 12582912) == 0) {
            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                ardVar2 = ardVar;
                if (l46Var.g(ardVar2)) {
                }
                i4 |= i22;
            } else {
                ardVar2 = ardVar;
            }
            i4 |= i22;
        } else {
            ardVar2 = ardVar;
        }
        i14 = i4;
        i15 = i3 & 256;
        if (i15 != 0) {
            if ((i2 & 100663296) == 0) {
                if (l46Var.h(z2)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i14 |= i16;
            }
            i17 = i14 | 805306368;
            z3 = true;
            if ((i17 & 306783379) == 306783378) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (l46Var.W(i17 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                } else {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var2;
                    }
                    if (i5 != 0) {
                        fx9Var2 = hj6.U0;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        f3 = 0.0f;
                    }
                    if (i12 != 0) {
                        kx0Var2 = ndb.z;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        yx9Var2 = yx9Var;
                        ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                        i17 &= -29360129;
                    } else {
                        yx9Var2 = yx9Var;
                        ardVarV = ardVar2;
                    }
                    if (i15 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    i19 = (i17 & 14) | 432;
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    if (((i19 & 14) ^ 6) > 4) {
                    }
                    zE = z3 | l46Var.e(cv7Var.ordinal());
                    objR = l46Var.R();
                    if (zE) {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new bs3(yx9Var2, cv7Var);
                        l46Var.p0(objR);
                    }
                    ardVar4 = ardVarV;
                    z7 = z6;
                    frdVar3 = gec.v;
                    j09Var4 = j09Var3;
                    xw9Var4 = bx9Var;
                    pc9Var3 = (bs3) objR;
                    lu9VarB = mu9.b(l46Var);
                }
                fx9 fx9Var1111116 = fx9Var2;
                int i211111111111111111111111111 = i8;
                kx0 kx0Var1111116 = kx0Var2;
                float f1111117 = f3;
                int i211111111111111111111111112 = i17;
                l46Var.s();
                int i211111111111111111111111113 = i211111111111111111111111112 >> 6;
                int i211111111111111111111111114 = i211111111111111111111111112 << 12;
                x57.v(f1111117, i211111111111111111111111111, ((i211111111111111111111111112 >> 3) & 14) | 24576 | ((i211111111111111111111111112 << 3) & 112) | (i211111111111111111111111112 & 896) | ((i211111111111111111111111112 >> 18) & 7168) | (458752 & i211111111111111111111111113) | (3670016 & i211111111111111111111111113) | (234881024 & i211111111111111111111111114) | (i211111111111111111111111114 & 1879048192), ((i211111111111111111111111112 >> 9) & 14) | 3456 | (57344 & i211111111111111111111111113) | 1769472, kx0Var1111116, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1111116, yx9Var2, ardVar4, frdVar3, z7);
                f4 = f1111117;
                i18 = i211111111111111111111111111;
                kx0Var3 = kx0Var1111116;
                j09Var2 = j09Var4;
                pc9Var2 = pc9Var3;
                lu9Var2 = lu9VarB;
                xw9Var3 = xw9Var4;
                fx9Var3 = fx9Var1111116;
                ardVar3 = ardVar4;
                frdVar2 = frdVar3;
                z5 = z7;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                frdVar2 = frdVar;
                z5 = z2;
                xw9Var3 = xw9Var2;
                fx9Var3 = fx9Var2;
                i18 = i8;
                kx0Var3 = kx0Var2;
                pc9Var2 = pc9Var;
                lu9Var2 = lu9Var;
                ardVar3 = ardVar2;
                f4 = f3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
            }
        }
        i14 |= 100663296;
        i17 = i14 | 805306368;
        z3 = true;
        if ((i17 & 306783379) == 306783378) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (l46Var.W(i17 & 1, z4)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i20 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var;
                }
                if (i21 != 0) {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    bx9Var = xw9Var2;
                }
                if (i5 != 0) {
                    fx9Var2 = hj6.U0;
                }
                if (i7 != 0) {
                    i8 = 0;
                }
                if (i10 != 0) {
                    f3 = 0.0f;
                }
                if (i12 != 0) {
                    kx0Var2 = ndb.z;
                }
                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    yx9Var2 = yx9Var;
                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                    i17 &= -29360129;
                } else {
                    yx9Var2 = yx9Var;
                    ardVarV = ardVar2;
                }
                if (i15 != 0) {
                    z6 = true;
                } else {
                    z6 = z2;
                }
                i19 = (i17 & 14) | 432;
                cv7Var = (cv7) l46Var.k(zg2.n);
                if (((i19 & 14) ^ 6) > 4) {
                }
                zE = z3 | l46Var.e(cv7Var.ordinal());
                objR = l46Var.R();
                if (zE) {
                    objR = new bs3(yx9Var2, cv7Var);
                    l46Var.p0(objR);
                } else {
                    objR = new bs3(yx9Var2, cv7Var);
                    l46Var.p0(objR);
                }
                ardVar4 = ardVarV;
                z7 = z6;
                frdVar3 = gec.v;
                j09Var4 = j09Var3;
                xw9Var4 = bx9Var;
                pc9Var3 = (bs3) objR;
                lu9VarB = mu9.b(l46Var);
            } else {
                if (i20 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var;
                }
                if (i21 != 0) {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    bx9Var = xw9Var2;
                }
                if (i5 != 0) {
                    fx9Var2 = hj6.U0;
                }
                if (i7 != 0) {
                    i8 = 0;
                }
                if (i10 != 0) {
                    f3 = 0.0f;
                }
                if (i12 != 0) {
                    kx0Var2 = ndb.z;
                }
                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    yx9Var2 = yx9Var;
                    ardVarV = an1.v(yx9Var2, null, null, l46Var, (i17 & 14) | 196608, 30);
                    i17 &= -29360129;
                } else {
                    yx9Var2 = yx9Var;
                    ardVarV = ardVar2;
                }
                if (i15 != 0) {
                    z6 = true;
                } else {
                    z6 = z2;
                }
                i19 = (i17 & 14) | 432;
                cv7Var = (cv7) l46Var.k(zg2.n);
                if (((i19 & 14) ^ 6) > 4) {
                }
                zE = z3 | l46Var.e(cv7Var.ordinal());
                objR = l46Var.R();
                if (zE) {
                    objR = new bs3(yx9Var2, cv7Var);
                    l46Var.p0(objR);
                } else {
                    objR = new bs3(yx9Var2, cv7Var);
                    l46Var.p0(objR);
                }
                ardVar4 = ardVarV;
                z7 = z6;
                frdVar3 = gec.v;
                j09Var4 = j09Var3;
                xw9Var4 = bx9Var;
                pc9Var3 = (bs3) objR;
                lu9VarB = mu9.b(l46Var);
            }
            fx9 fx9Var1111117 = fx9Var2;
            int i211111111111111111111111115 = i8;
            kx0 kx0Var1111117 = kx0Var2;
            float f1111118 = f3;
            int i211111111111111111111111116 = i17;
            l46Var.s();
            int i211111111111111111111111117 = i211111111111111111111111116 >> 6;
            int i211111111111111111111111118 = i211111111111111111111111116 << 12;
            x57.v(f1111118, i211111111111111111111111115, ((i211111111111111111111111116 >> 3) & 14) | 24576 | ((i211111111111111111111111116 << 3) & 112) | (i211111111111111111111111116 & 896) | ((i211111111111111111111111116 >> 18) & 7168) | (458752 & i211111111111111111111111117) | (3670016 & i211111111111111111111111117) | (234881024 & i211111111111111111111111118) | (i211111111111111111111111118 & 1879048192), ((i211111111111111111111111116 >> 9) & 14) | 3456 | (57344 & i211111111111111111111111117) | 1769472, kx0Var1111117, dd2Var, l46Var, j09Var4, pc9Var3, lu9VarB, xw9Var4, fx9Var1111117, yx9Var2, ardVar4, frdVar3, z7);
            f4 = f1111118;
            i18 = i211111111111111111111111115;
            kx0Var3 = kx0Var1111117;
            j09Var2 = j09Var4;
            pc9Var2 = pc9Var3;
            lu9Var2 = lu9VarB;
            xw9Var3 = xw9Var4;
            fx9Var3 = fx9Var1111117;
            ardVar3 = ardVar4;
            frdVar2 = frdVar3;
            z5 = z7;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            frdVar2 = frdVar;
            z5 = z2;
            xw9Var3 = xw9Var2;
            fx9Var3 = fx9Var2;
            i18 = i8;
            kx0Var3 = kx0Var2;
            pc9Var2 = pc9Var;
            lu9Var2 = lu9Var;
            ardVar3 = ardVar2;
            f4 = f3;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xz7(yx9Var, j09Var2, xw9Var3, fx9Var3, i18, f4, kx0Var3, ardVar3, z5, pc9Var2, frdVar2, lu9Var2, dd2Var, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:177:0x027d  */
    public static final void i(j09 j09Var, jx7 jx7Var, cf6 cf6Var, xw9 xw9Var, gj5 gj5Var, boolean z2, lu9 lu9Var, wc0 wc0Var, tc0 tc0Var, a26 a26Var, l46 l46Var, int i, int i2) {
        int i3;
        int i4;
        jx7 jx7Var2;
        boolean z3;
        jx7 jx7Var3;
        boolean z4;
        sn7 sn7Var;
        j09 j09VarJ0;
        l46Var.h0(708740370);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(jx7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? l46Var.g(cf6Var) : l46Var.i(cf6Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var.g(xw9Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i3 |= l46Var.h(false) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((i & 196608) == 0) {
            i3 |= l46Var.h(true) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= l46Var.g(gj5Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= l46Var.h(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= l46Var.g(lu9Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= l46Var.g(wc0Var) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (l46Var.g(tc0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.i(a26Var) ? 32 : 16;
        }
        if (l46Var.W(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            int i6 = i5 >> 3;
            int i7 = i6 & 14;
            int i8 = i7 | (i4 & 112);
            e89 e89VarI = q1c.i(a26Var, l46Var);
            int i9 = i4;
            boolean z5 = (((i8 & 14) ^ 6) > 4 && l46Var.g(jx7Var)) || (i8 & 6) == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z5 || objR == obj) {
                hj6 hj6Var = hj6.X0;
                ok3 ok3Var = new ok3(e89VarI, 28);
                psd psdVar = zrd.a;
                objR = new uw7(0, 0, h0e.class, new mx3(new jf6(15, new mx3(ok3Var, hj6Var), jx7Var), hj6Var), "value", "getValue()Ljava/lang/Object;");
                l46Var.p0(objR);
            }
            sn7 sn7Var2 = (sn7) objR;
            int i10 = i7 | ((i5 >> 9) & 112);
            boolean z6 = ((((i10 & 14) ^ 6) > 4 && l46Var.g(jx7Var)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && l46Var.h(false)) || (i10 & 48) == 32);
            Object objR2 = l46Var.R();
            if (z6 || objR2 == obj) {
                objR2 = new q18(jx7Var);
                l46Var.p0(objR2);
            }
            q18 q18Var = (q18) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = af1.E(l46Var);
                l46Var.p0(objR3);
            }
            aw2 aw2Var = (aw2) objR3;
            ie6 ie6Var = (ie6) l46Var.k(zg2.g);
            int i11 = i5 & 112;
            w1e w1eVar = !((Boolean) l46Var.k(zg2.x)).booleanValue() ? x1e.a : null;
            int i12 = (i5 & 524272) | ((i9 << 18) & 3670016) | ((i5 >> 6) & 29360128);
            boolean z7 = ((((i12 & 896) ^ 384) > 256 && l46Var.g(cf6Var)) || (i12 & 384) == 256) | ((((i12 & 112) ^ 48) > 32 && l46Var.g(jx7Var)) || (i12 & 48) == 32) | ((((i12 & 7168) ^ 3072) > 2048 && l46Var.g(xw9Var)) || (i12 & 3072) == 2048);
            if (((57344 & i12) ^ 24576) > 16384 && l46Var.h(false)) {
                z3 = true;
            } else if ((i12 & 24576) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zG = z7 | z3 | ((((458752 & i12) ^ 196608) > 131072 && l46Var.h(true)) || (i12 & 196608) == 131072) | ((((i12 & 3670016) ^ 1572864) > 1048576 && l46Var.g(tc0Var)) || (i12 & 1572864) == 1048576) | ((((i12 & 29360128) ^ 12582912) > 8388608 && l46Var.g(wc0Var)) || (i12 & 12582912) == 8388608) | l46Var.g(ie6Var);
            Object objR4 = l46Var.R();
            if (zG || objR4 == obj) {
                jx7Var3 = jx7Var;
                z4 = true;
                Object xw7Var = new xw7(jx7Var3, xw9Var, sn7Var2, cf6Var, wc0Var, tc0Var, aw2Var, ie6Var, w1eVar);
                sn7Var = sn7Var2;
                l46Var.p0(xw7Var);
                objR4 = xw7Var;
            } else {
                jx7Var3 = jx7Var;
                sn7Var = sn7Var2;
                z4 = true;
            }
            tz7 tz7Var = (tz7) objR4;
            boolean z8 = i11 == 32 ? z4 : false;
            Object objR5 = l46Var.R();
            if (z8 || objR5 == obj) {
                objR5 = new zv6(9, jx7Var3);
                l46Var.p0(objR5);
            }
            v1e v1eVarD = od4.D(z4, (x16) objR5, l46Var, (i5 >> 12) & 126);
            ks9 ks9Var = ks9.a;
            if (z2) {
                l46Var.f0(27471107);
                boolean z9 = (((i7 ^ 6) <= 4 || !l46Var.g(jx7Var3)) && (i6 & 6) != 4) ? false : z4;
                Object objR6 = l46Var.R();
                if (z9 || objR6 == obj) {
                    objR6 = new pw7(jx7Var3);
                    l46Var.p0(objR6);
                }
                j09VarJ0 = vd0.j0((pw7) objR6, jx7Var3.n, ks9Var);
                l46Var.r(false);
            } else {
                l46Var.f0(27767312);
                l46Var.r(false);
                j09VarJ0 = g09.a;
            }
            jx7Var2 = jx7Var3;
            dj6.t(sn7Var, od4.E(rs0.G(y41.A(j09Var.D(jx7Var3.k).D(jx7Var3.l), sn7Var, q18Var, ks9Var, z2).D(j09VarJ0), jx7Var3.m), jx7Var3, ks9Var, lu9Var, z2, gj5Var, jx7Var3.f, v1eVarD), jx7Var2.o, tz7Var, l46Var, 0);
        } else {
            jx7Var2 = jx7Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qw7(j09Var, jx7Var2, cf6Var, xw9Var, gj5Var, z2, lu9Var, wc0Var, tc0Var, a26Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0141  */
    /* JADX WARN: Code duplicated, block: B:122:0x0175  */
    /* JADX WARN: Code duplicated, block: B:123:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0182  */
    /* JADX WARN: Code duplicated, block: B:127:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:185:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0256  */
    /* JADX WARN: Code duplicated, block: B:189:0x025b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0290  */
    /* JADX WARN: Code duplicated, block: B:192:0x0294  */
    /* JADX WARN: Code duplicated, block: B:194:0x0298  */
    /* JADX WARN: Code duplicated, block: B:195:0x029b  */
    /* JADX WARN: Code duplicated, block: B:198:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:200:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:203:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:204:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:206:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:207:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:210:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:212:0x0303  */
    /* JADX WARN: Code duplicated, block: B:215:0x030e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0317  */
    /* JADX WARN: Code duplicated, block: B:219:0x031c  */
    /* JADX WARN: Code duplicated, block: B:222:0x0324  */
    /* JADX WARN: Code duplicated, block: B:223:0x0329  */
    /* JADX WARN: Code duplicated, block: B:226:0x0330  */
    /* JADX WARN: Code duplicated, block: B:228:0x0340  */
    /* JADX WARN: Code duplicated, block: B:230:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:233:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111  */
    /* JADX WARN: Code duplicated, block: B:90:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    public static final void j(final j09 j09Var, final use useVar, String str, mue mueVar, long j, wo7 wo7Var, ype ypeVar, u47 u47Var, ghc ghcVar, wne wneVar, xw9 xw9Var, mue mueVar2, x4d x4dVar, boolean z2, float f2, float f3, l46 l46Var, final int i, final int i2, final int i3) {
        int i4;
        String str2;
        int i5;
        int i6;
        mue mueVar3;
        int i7;
        int i8;
        int i9;
        final long j2;
        int i10;
        int i11;
        int i12;
        int i13;
        final ype ypeVar2;
        int i14;
        u47 u47Var2;
        int i15;
        wne wneVarR0;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z3;
        final wo7 wo7Var2;
        final ghc ghcVar2;
        final mue mueVar4;
        final float f4;
        final float f5;
        final u47 u47Var3;
        final wne wneVar2;
        final String str3;
        final mue mueVar5;
        final xw9 xw9Var2;
        final x4d x4dVar2;
        final boolean z4;
        ojb ojbVarV;
        mue mueVar6;
        wo7 wo7Var3;
        ghc ghcVarT;
        int i23;
        int i24;
        xw9 xw9Var3;
        mue mueVarA;
        int i25;
        x4d x4dVarB;
        boolean z5;
        int i26;
        float f6;
        int i27;
        ghc ghcVar3;
        float f7;
        ype ypeVar3;
        float f8;
        mue mueVar7;
        u47 u47Var4;
        int i28;
        xw9 xw9Var4;
        int i29;
        int i30;
        useVar.getClass();
        l46Var.h0(-280261325);
        if ((i & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= l46Var.g(useVar) ? 32 : 16;
        }
        int i31 = i3 & 4;
        if (i31 == 0) {
            if ((i & 384) == 0) {
                str2 = str;
                i4 |= l46Var.g(str2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i & 3072;
            i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i5 == 0) {
                if ((i3 & 8) == 0) {
                    mueVar3 = mueVar;
                    if (l46Var.g(mueVar3)) {
                        i30 = 2048;
                    }
                    i4 |= i30;
                } else {
                    mueVar3 = mueVar;
                }
                i30 = 1024;
                i4 |= i30;
            } else {
                mueVar3 = mueVar;
            }
            i7 = i3 & 16;
            i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i7 != 0) {
                i9 = i4 | 24576;
                j2 = j;
            } else {
                i9 = i4;
                j2 = j;
                if ((i & 24576) == 0) {
                    if (l46Var.f(j2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i9 |= i10;
                }
            }
            i11 = i3 & 32;
            i12 = 65536;
            if (i11 != 0) {
                i9 |= 196608;
            } else if ((i & 196608) == 0) {
                if (l46Var.g(wo7Var)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i9 |= i13;
            }
            if ((i & 1572864) == 0) {
                ypeVar2 = ypeVar;
                if ((i3 & 64) == 0 || !l46Var.g(ypeVar2)) {
                    i29 = 524288;
                } else {
                    i29 = 1048576;
                }
                i9 |= i29;
            } else {
                ypeVar2 = ypeVar;
            }
            i14 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i14 != 0) {
                i9 |= 12582912;
                u47Var2 = u47Var;
            } else {
                u47Var2 = u47Var;
                if ((i & 12582912) == 0) {
                    if (l46Var.g(u47Var2)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i9 |= i15;
                }
            }
            if ((i & 100663296) == 0) {
                i9 |= 33554432;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0) {
                    wneVarR0 = wneVar;
                    int i32 = l46Var.g(wneVarR0) ? 536870912 : 268435456;
                    i9 |= i32;
                } else {
                    wneVarR0 = wneVar;
                }
                i9 |= i32;
            } else {
                wneVarR0 = wneVar;
            }
            i16 = i9;
            i17 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i17 != 0) {
                i18 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (l46Var.g(xw9Var)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i2 | i19;
            } else {
                i18 = i2;
            }
            i20 = i18 | (((i3 & 2048) == 0 || !l46Var.g(mueVar2)) ? 16 : 32) | (((i3 & 4096) == 0 || !l46Var.g(x4dVar)) ? UserMetadata.MAX_ROLLOUT_ASSIGNMENTS : 256);
            i21 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i21 != 0) {
                i22 = i20 | 3072;
            } else if ((i2 & 3072) == 0) {
                if (l46Var.h(z2)) {
                    i6 = 2048;
                }
                i22 = i20 | i6;
            } else {
                i22 = i20;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0 && l46Var.d(f2)) {
                    i8 = 16384;
                }
                i22 |= i8;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0 && l46Var.d(f3)) {
                    i12 = 131072;
                }
                i22 |= i12;
            }
            if ((i16 & 306783379) == 306783378 || (i22 & 74899) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i16 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0 || l46Var.C()) {
                    if (i31 != 0) {
                        str2 = null;
                    }
                    if ((i3 & 8) != 0) {
                        mueVar6 = new mue(0L, w6c.l(17), ar5.w, null, ((y8b) l46Var.k(x8b.a)).b, 0L, 0L, 3, 0, w6c.l(24), null, null, 16613337);
                        i16 &= -7169;
                    } else {
                        mueVar6 = mueVar3;
                    }
                    if (i7 != 0) {
                        j2 = y72.k;
                    }
                    if (i11 != 0) {
                        wo7Var3 = wo7.g;
                    } else {
                        wo7Var3 = wo7Var;
                    }
                    if ((i3 & 64) != 0) {
                        ype.c0.getClass();
                        ypeVar2 = wpe.b;
                        i16 &= -3670017;
                    }
                    if (i14 != 0) {
                        u47Var2 = null;
                    }
                    ghcVarT = mh3.T(l46Var);
                    i23 = i16 & (-234881025);
                    if ((i3 & 512) != 0) {
                        wneVarR0 = qk6.r0(6, l46Var);
                        i24 = i16 & (-2113929217);
                    } else {
                        i24 = i23;
                    }
                    if (i17 != 0) {
                        xw9Var3 = null;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    if ((i3 & 2048) != 0) {
                        mueVarA = mue.a((mue) l46Var.k(nte.a), ((m82) l46Var.k(o82.a)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                        i22 &= -113;
                    } else {
                        mueVarA = mueVar2;
                    }
                    i25 = i22;
                    if ((i3 & 4096) != 0) {
                        x4dVarB = a7c.b(48.0f);
                        i25 &= -897;
                    } else {
                        x4dVarB = x4dVar;
                    }
                    z5 = i21 == 0 ? z2 : true;
                    xw9 xw9Var5 = xw9Var3;
                    if ((i3 & 16384) != 0) {
                        i26 = i25 & (-57345);
                        f6 = 1.0f;
                    } else {
                        i26 = i25;
                        f6 = f2;
                    }
                    if ((i3 & 32768) != 0) {
                        f7 = 2.0f;
                        i27 = i26 & (-458753);
                        ghcVar3 = ghcVarT;
                    } else {
                        i27 = i26;
                        ghcVar3 = ghcVarT;
                        f7 = f3;
                    }
                    ypeVar3 = ypeVar2;
                    f8 = f6;
                    mueVar7 = mueVarA;
                    u47Var4 = u47Var2;
                    i28 = i24;
                    xw9Var4 = xw9Var5;
                } else {
                    l46Var.Z();
                    if ((i3 & 8) != 0) {
                        i16 &= -7169;
                    }
                    if ((i3 & 64) != 0) {
                        i16 &= -3670017;
                    }
                    int i33 = i16 & (-234881025);
                    if ((i3 & 512) != 0) {
                        i33 = i16 & (-2113929217);
                    }
                    if ((i3 & 2048) != 0) {
                        i22 &= -113;
                    }
                    int i34 = i22;
                    if ((i3 & 4096) != 0) {
                        i34 &= -897;
                    }
                    if ((i3 & 16384) != 0) {
                        i34 &= -57345;
                    }
                    if ((i3 & 32768) != 0) {
                        i34 &= -458753;
                    }
                    wo7Var3 = wo7Var;
                    mueVar7 = mueVar2;
                    z5 = z2;
                    f7 = f3;
                    i27 = i34;
                    ypeVar3 = ypeVar2;
                    u47Var4 = u47Var2;
                    wneVarR0 = wneVarR0;
                    mueVar6 = mueVar3;
                    ghcVar3 = ghcVar;
                    x4dVarB = x4dVar;
                    f8 = f2;
                    i28 = i33;
                    xw9Var4 = xw9Var;
                }
                l46Var.s();
                long j3 = j2;
                wo7 wo7Var4 = wo7Var3;
                wne wneVar3 = wneVarR0;
                xw9 xw9Var6 = xw9Var4;
                float f9 = f8;
                String str4 = str2;
                x4d x4dVar3 = x4dVarB;
                float f10 = f7;
                boolean z6 = z5;
                int i35 = i28;
                int i36 = i35 << 3;
                tv0.b(useVar, j09Var, false, u47Var4, mueVar7, wo7Var4, null, ypeVar3, null, null, new dtd(((m82) l46Var.k(o82.a)).q), new v8b(useVar, xw9Var6, str4, z6, wneVar3, j3, mueVar6, x4dVar3, f10, f9), ghcVar3, l46Var, ((i35 >> 3) & 14) | (i36 & 112) | ((i35 >> 9) & 57344) | ((i27 << 12) & 458752) | (i36 & 3670016) | ((i35 << 6) & 234881024), 0, 5772);
                u47Var3 = u47Var4;
                mueVar4 = mueVar7;
                ypeVar2 = ypeVar3;
                ghcVar2 = ghcVar3;
                str3 = str4;
                wneVar2 = wneVar3;
                xw9Var2 = xw9Var6;
                x4dVar2 = x4dVar3;
                z4 = z6;
                f4 = f9;
                f5 = f10;
                mueVar5 = mueVar6;
                wo7Var2 = wo7Var4;
                j2 = j3;
            } else {
                l46Var.Z();
                wo7Var2 = wo7Var;
                ghcVar2 = ghcVar;
                mueVar4 = mueVar2;
                f4 = f2;
                f5 = f3;
                u47Var3 = u47Var2;
                wneVar2 = wneVarR0;
                str3 = str2;
                mueVar5 = mueVar3;
                xw9Var2 = xw9Var;
                x4dVar2 = x4dVar;
                z4 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: u8b
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        cn1.j(j09Var, useVar, str3, mueVar5, j2, wo7Var2, ypeVar2, u47Var3, ghcVar2, wneVar2, xw9Var2, mueVar4, x4dVar2, z4, f4, f5, (l46) obj, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 384;
        str2 = str;
        i5 = i & 3072;
        i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i5 == 0) {
            if ((i3 & 8) == 0) {
                mueVar3 = mueVar;
                if (l46Var.g(mueVar3)) {
                    i30 = 2048;
                }
                i4 |= i30;
            } else {
                mueVar3 = mueVar;
            }
            i30 = 1024;
            i4 |= i30;
        } else {
            mueVar3 = mueVar;
        }
        i7 = i3 & 16;
        i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i7 != 0) {
            i9 = i4 | 24576;
            j2 = j;
        } else {
            i9 = i4;
            j2 = j;
            if ((i & 24576) == 0) {
                if (l46Var.f(j2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i9 |= i10;
            }
        }
        i11 = i3 & 32;
        i12 = 65536;
        if (i11 != 0) {
            i9 |= 196608;
        } else if ((i & 196608) == 0) {
            if (l46Var.g(wo7Var)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i9 |= i13;
        }
        if ((i & 1572864) == 0) {
            ypeVar2 = ypeVar;
            if ((i3 & 64) == 0) {
                i29 = 524288;
            } else {
                i29 = 524288;
            }
            i9 |= i29;
        } else {
            ypeVar2 = ypeVar;
        }
        i14 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i14 != 0) {
            i9 |= 12582912;
            u47Var2 = u47Var;
        } else {
            u47Var2 = u47Var;
            if ((i & 12582912) == 0) {
                if (l46Var.g(u47Var2)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i9 |= i15;
            }
        }
        if ((i & 100663296) == 0) {
            i9 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            if ((i3 & 512) == 0) {
                wneVarR0 = wneVar;
                if (l46Var.g(wneVarR0)) {
                }
                i9 |= i32;
            } else {
                wneVarR0 = wneVar;
            }
            i9 |= i32;
        } else {
            wneVarR0 = wneVar;
        }
        i16 = i9;
        i17 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i17 != 0) {
            i18 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (l46Var.g(xw9Var)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i2 | i19;
        } else {
            i18 = i2;
        }
        i20 = i18 | (((i3 & 2048) == 0 || !l46Var.g(mueVar2)) ? 16 : 32) | (((i3 & 4096) == 0 || !l46Var.g(x4dVar)) ? UserMetadata.MAX_ROLLOUT_ASSIGNMENTS : 256);
        i21 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i21 != 0) {
            i22 = i20 | 3072;
        } else if ((i2 & 3072) == 0) {
            if (l46Var.h(z2)) {
                i6 = 2048;
            }
            i22 = i20 | i6;
        } else {
            i22 = i20;
        }
        if ((i2 & 24576) != 0) {
            if ((i3 & 16384) == 0) {
                i8 = 16384;
            }
            i22 |= i8;
        }
        if ((i2 & 196608) != 0) {
            if ((i3 & 32768) == 0) {
                i12 = 131072;
            }
            i22 |= i12;
        }
        if ((i16 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (l46Var.W(i16 & 1, z3)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i31 != 0) {
                    str2 = null;
                }
                if ((i3 & 8) != 0) {
                    mueVar6 = new mue(0L, w6c.l(17), ar5.w, null, ((y8b) l46Var.k(x8b.a)).b, 0L, 0L, 3, 0, w6c.l(24), null, null, 16613337);
                    i16 &= -7169;
                } else {
                    mueVar6 = mueVar3;
                }
                if (i7 != 0) {
                    j2 = y72.k;
                }
                if (i11 != 0) {
                    wo7Var3 = wo7.g;
                } else {
                    wo7Var3 = wo7Var;
                }
                if ((i3 & 64) != 0) {
                    ype.c0.getClass();
                    ypeVar2 = wpe.b;
                    i16 &= -3670017;
                }
                if (i14 != 0) {
                    u47Var2 = null;
                }
                ghcVarT = mh3.T(l46Var);
                i23 = i16 & (-234881025);
                if ((i3 & 512) != 0) {
                    wneVarR0 = qk6.r0(6, l46Var);
                    i24 = i16 & (-2113929217);
                } else {
                    i24 = i23;
                }
                if (i17 != 0) {
                    xw9Var3 = null;
                } else {
                    xw9Var3 = xw9Var;
                }
                if ((i3 & 2048) != 0) {
                    mueVarA = mue.a((mue) l46Var.k(nte.a), ((m82) l46Var.k(o82.a)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                    i22 &= -113;
                } else {
                    mueVarA = mueVar2;
                }
                i25 = i22;
                if ((i3 & 4096) != 0) {
                    x4dVarB = a7c.b(48.0f);
                    i25 &= -897;
                } else {
                    x4dVarB = x4dVar;
                }
                if (i21 == 0) {
                }
                xw9 xw9Var7 = xw9Var3;
                if ((i3 & 16384) != 0) {
                    i26 = i25 & (-57345);
                    f6 = 1.0f;
                } else {
                    i26 = i25;
                    f6 = f2;
                }
                if ((i3 & 32768) != 0) {
                    f7 = 2.0f;
                    i27 = i26 & (-458753);
                    ghcVar3 = ghcVarT;
                } else {
                    i27 = i26;
                    ghcVar3 = ghcVarT;
                    f7 = f3;
                }
                ypeVar3 = ypeVar2;
                f8 = f6;
                mueVar7 = mueVarA;
                u47Var4 = u47Var2;
                i28 = i24;
                xw9Var4 = xw9Var7;
            } else {
                if (i31 != 0) {
                    str2 = null;
                }
                if ((i3 & 8) != 0) {
                    mueVar6 = new mue(0L, w6c.l(17), ar5.w, null, ((y8b) l46Var.k(x8b.a)).b, 0L, 0L, 3, 0, w6c.l(24), null, null, 16613337);
                    i16 &= -7169;
                } else {
                    mueVar6 = mueVar3;
                }
                if (i7 != 0) {
                    j2 = y72.k;
                }
                if (i11 != 0) {
                    wo7Var3 = wo7.g;
                } else {
                    wo7Var3 = wo7Var;
                }
                if ((i3 & 64) != 0) {
                    ype.c0.getClass();
                    ypeVar2 = wpe.b;
                    i16 &= -3670017;
                }
                if (i14 != 0) {
                    u47Var2 = null;
                }
                ghcVarT = mh3.T(l46Var);
                i23 = i16 & (-234881025);
                if ((i3 & 512) != 0) {
                    wneVarR0 = qk6.r0(6, l46Var);
                    i24 = i16 & (-2113929217);
                } else {
                    i24 = i23;
                }
                if (i17 != 0) {
                    xw9Var3 = null;
                } else {
                    xw9Var3 = xw9Var;
                }
                if ((i3 & 2048) != 0) {
                    mueVarA = mue.a((mue) l46Var.k(nte.a), ((m82) l46Var.k(o82.a)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                    i22 &= -113;
                } else {
                    mueVarA = mueVar2;
                }
                i25 = i22;
                if ((i3 & 4096) != 0) {
                    x4dVarB = a7c.b(48.0f);
                    i25 &= -897;
                } else {
                    x4dVarB = x4dVar;
                }
                if (i21 == 0) {
                }
                xw9 xw9Var8 = xw9Var3;
                if ((i3 & 16384) != 0) {
                    i26 = i25 & (-57345);
                    f6 = 1.0f;
                } else {
                    i26 = i25;
                    f6 = f2;
                }
                if ((i3 & 32768) != 0) {
                    f7 = 2.0f;
                    i27 = i26 & (-458753);
                    ghcVar3 = ghcVarT;
                } else {
                    i27 = i26;
                    ghcVar3 = ghcVarT;
                    f7 = f3;
                }
                ypeVar3 = ypeVar2;
                f8 = f6;
                mueVar7 = mueVarA;
                u47Var4 = u47Var2;
                i28 = i24;
                xw9Var4 = xw9Var8;
            }
            l46Var.s();
            long j4 = j2;
            wo7 wo7Var5 = wo7Var3;
            wne wneVar4 = wneVarR0;
            xw9 xw9Var9 = xw9Var4;
            float f11 = f8;
            String str5 = str2;
            x4d x4dVar4 = x4dVarB;
            float f12 = f7;
            boolean z7 = z5;
            int i37 = i28;
            int i38 = i37 << 3;
            tv0.b(useVar, j09Var, false, u47Var4, mueVar7, wo7Var5, null, ypeVar3, null, null, new dtd(((m82) l46Var.k(o82.a)).q), new v8b(useVar, xw9Var9, str5, z7, wneVar4, j4, mueVar6, x4dVar4, f12, f11), ghcVar3, l46Var, ((i37 >> 3) & 14) | (i38 & 112) | ((i37 >> 9) & 57344) | ((i27 << 12) & 458752) | (i38 & 3670016) | ((i37 << 6) & 234881024), 0, 5772);
            u47Var3 = u47Var4;
            mueVar4 = mueVar7;
            ypeVar2 = ypeVar3;
            ghcVar2 = ghcVar3;
            str3 = str5;
            wneVar2 = wneVar4;
            xw9Var2 = xw9Var9;
            x4dVar2 = x4dVar4;
            z4 = z7;
            f4 = f11;
            f5 = f12;
            mueVar5 = mueVar6;
            wo7Var2 = wo7Var5;
            j2 = j4;
        } else {
            l46Var.Z();
            wo7Var2 = wo7Var;
            ghcVar2 = ghcVar;
            mueVar4 = mueVar2;
            f4 = f2;
            f5 = f3;
            u47Var3 = u47Var2;
            wneVar2 = wneVarR0;
            str3 = str2;
            mueVar5 = mueVar3;
            xw9Var2 = xw9Var;
            x4dVar2 = x4dVar;
            z4 = z2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: u8b
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i | 1);
                    int iP2 = k99.P(i2);
                    cn1.j(j09Var, useVar, str3, mueVar5, j2, wo7Var2, ypeVar2, u47Var3, ghcVar2, wneVar2, xw9Var2, mueVar4, x4dVar2, z4, f4, f5, (l46) obj, iP, iP2, i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void k(yye yyeVar, x16 x16Var, d5e d5eVar, d5e d5eVar2, j09 j09Var, boolean z2, qy1 qy1Var, l46 l46Var, int i) {
        int i2;
        yye yyeVar2;
        j09 j09VarS;
        l46Var.h0(-406243761);
        if ((i & 6) == 0) {
            i2 = (l46Var.e(yyeVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(d5eVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(d5eVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var.g(qy1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= l46Var.g(null) ? 8388608 : 4194304;
        }
        if (l46Var.W(i2 & 1, (4793491 & i2) != 4793490)) {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            j09 j09Var2 = g09.a;
            if (x16Var != null) {
                yyeVar2 = yyeVar;
                j09VarS = b21.S(yyeVar2, d5c.a(ty1.d / 2.0f, 4, 0L, false), z2, new i5c(1), x16Var);
            } else {
                yyeVar2 = yyeVar;
                j09VarS = j09Var2;
            }
            if (x16Var != null) {
                oq6 oq6Var = p77.a;
                j09Var2 = xv8.a;
            }
            j09 j09VarZ = ynb.Z(j09Var.D(j09Var2).D(j09VarS), 2.0f);
            int i3 = ((i2 >> 15) & 14) | ((i2 << 3) & 112) | ((i2 >> 9) & 7168);
            int i4 = i2 << 6;
            d(z2, yyeVar2, j09VarZ, qy1Var, d5eVar, d5eVar2, l46Var, i3 | (57344 & i4) | (i4 & 458752));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc(yyeVar, x16Var, d5eVar, d5eVar2, j09Var, z2, qy1Var, i);
        }
    }

    public static float l(EdgeEffect edgeEffect, float f2, float f3, sw3 sw3Var) {
        float f4 = ks4.a;
        double density = sw3Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f2) * 0.35f;
        double d2 = ((double) ks4.a) * density;
        float fExp = (float) (Math.exp((ks4.b / ks4.c) * Math.log(dAbs / d2)) * d2);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? xq.m(edgeEffect) : 0.0f) * f3) {
            return 0.0f;
        }
        int iL = ym8.L(f2);
        if (i >= 31) {
            edgeEffect.onAbsorb(iL);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iL);
        }
        return f2;
    }

    public static IOException m(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException n(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return m(file, iOException);
        }
        if (!parentFile.exists()) {
            return m(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? m(file, iOException) : m(file, iOException);
            }
            return parentFile.canWrite() ? m(file, iOException) : m(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? m(file, iOException) : m(file, iOException);
        }
        return parentFile.canWrite() ? m(file, iOException) : m(file, iOException);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[LOOP:0: B:21:0x0052->B:25:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object o(defpackage.mbe r6, defpackage.pt0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.u4c
            if (r0 == 0) goto L13
            r0 = r7
            u4c r0 = (defpackage.u4c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            u4c r0 = new u4c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r6 = r0.L$0
            mbe r6 = (defpackage.mbe) r6
            defpackage.jzb.q(r7)
            goto L42
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L30:
            defpackage.jzb.q(r7)
        L33:
            r0.L$0 = r6
            r0.label = r2
            iia r7 = defpackage.iia.b
            java.lang.Object r7 = r6.a(r7, r0)
            bw2 r1 = defpackage.bw2.a
            if (r7 != r1) goto L42
            return r1
        L42:
            hia r7 = (defpackage.hia) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L33
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L52:
            if (r4 >= r1) goto L64
            java.lang.Object r5 = r7.get(r4)
            oia r5 = (defpackage.oia) r5
            boolean r5 = defpackage.xo1.k(r5)
            if (r5 != 0) goto L61
            goto L33
        L61:
            int r4 = r4 + 1
            goto L52
        L64:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn1.o(mbe, pt0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [jf2, wdb] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [f46] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List p(opd opdVar, Integer num, int i, Integer num2) {
        int iF;
        int iR;
        i79 i79Var;
        if (opdVar.w || opdVar.o() == 0) {
            return pu4.a;
        }
        ?? wdbVar = new wdb(opdVar);
        if (num2 != null) {
            iF = num2.intValue();
        } else {
            iF = opdVar.v;
            if (iF < 0) {
                iF = opdVar.F(opdVar.b, i);
            }
        }
        if (num == 0) {
            int iO = opdVar.i - opdVar.O(opdVar.b, opdVar.q(i));
            q69 q69Var = opdVar.s;
            num = Integer.valueOf(iO + ((q69Var == null || (i79Var = (i79) q69Var.b(i)) == null) ? 0 : i79Var.b));
        }
        int iQ = opdVar.q(i) * 5;
        int[] iArr = opdVar.b;
        if (iQ < iArr.length) {
            iR = opdVar.r(i);
        } else {
            int iF2 = iF >= 0 ? opdVar.F(iArr, iF) : iF;
            iR = opdVar.r(iF);
            int i2 = iF;
            iF = iF2;
            i = i2;
        }
        while (i >= 0) {
            wdbVar.e(iR, (opdVar.b[(opdVar.q(i) * 5) + 1] & 536870912) != 0 ? opdVar.s(i) : sf2.a, opdVar.P(i), num);
            num = opdVar.b(i);
            if (iF >= 0) {
                int iF3 = opdVar.F(opdVar.b, iF);
                iR = opdVar.r(iF);
                int i3 = iF;
                iF = iF3;
                i = i3;
            } else {
                i = iF;
            }
        }
        return wdbVar.a;
    }

    public static long q(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(tec.h(j2, ")", ub3.p("overflow: checkedAdd(", ", ", j)));
    }

    public static final int r(float f2, float f3, float f4, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = i - 1;
        return ym8.L((f4 * (i4 <= 1 ? i4 : 1)) + (f3 * i3) + f2);
    }

    public static Bitmap s(byte[] bArr, int i, int i2) throws IOException {
        BitmapFactory.Options options;
        int i3 = 0;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw l0a.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            r35 r35Var = new r35(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (r35Var.d(1, "Orientation")) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long t(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (nf8.a[roundingMode.ordinal()]) {
            case 1:
                feg.t(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 4:
                return j3 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            default:
                throw new AssertionError();
        }
    }

    public static u00 u(h10 h10Var, dx5 dx5Var) {
        Object next;
        dx5Var.getClass();
        Iterator it = h10Var.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (pa7.t(((u00) next).f(), dx5Var)) {
                return (u00) next;
            }
        }
        next = null;
        return (u00) next;
    }

    public static final Integer v(kpd kpdVar, lg2 lg2Var, int i, int i2) {
        Integer numV;
        int[] iArr = kpdVar.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (kpdVar.j(i) && kpdVar.i(i) == 206 && pa7.t(kpdVar.p(iArr, i), wf2.e)) {
                Object objH = kpdVar.h(i, 0);
                p46 p46Var = objH instanceof p46 ? (p46) objH : null;
                vpb vpbVar = p46Var != null ? p46Var.a : null;
                i46 i46Var = vpbVar instanceof i46 ? (i46) vpbVar : null;
                if (i46Var != null && i46Var.a == lg2Var) {
                    return Integer.valueOf(i);
                }
            }
            if (kpdVar.d(i) && (numV = v(kpdVar, lg2Var, i + 1, i3)) != null) {
                return Integer.valueOf(numV.intValue());
            }
            i = i3;
        }
    }

    public static long w(long j, long j2) {
        feg.s(j, "a");
        feg.s(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static xrf y(t99 t99Var, u09 u09Var) {
        if (t99Var == null) {
            a(19);
            throw null;
        }
        if (u09Var == null) {
            a(20);
            throw null;
        }
        Collection collectionP = u09Var.p();
        if (collectionP.size() != 1) {
            return null;
        }
        for (xrf xrfVar : ((z12) collectionP.iterator().next()).G()) {
            if (xrfVar.getName().equals(t99Var)) {
                return xrfVar;
            }
        }
        return null;
    }

    public static final Context z() {
        Context context = O0;
        if (context != null) {
            return context;
        }
        pa7.g0("context");
        throw null;
    }
}

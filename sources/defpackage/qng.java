package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qng implements yng {
    public static final int[] k = new int[0];
    public static final Unsafe l = iog.k();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final qlg e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final m8c j;

    public qng(int[] iArr, Object[] objArr, int i, int i2, qlg qlgVar, int[] iArr2, int i3, int i4, m8c m8cVar, uzd uzdVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = qlgVar instanceof omg;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = m8cVar;
        this.e = qlgVar;
    }

    public static int l(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof omg) {
            return ((omg) obj).e();
        }
        return true;
    }

    public static void n(Object obj) {
        if (m(obj)) {
            return;
        }
        qc0.j("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int o(long j, Object obj) {
        return ((Integer) iog.h(j, obj)).intValue();
    }

    public static long p(long j, Object obj) {
        return ((Long) iog.h(j, obj)).longValue();
    }

    public static final int x(byte[] bArr, int i, int i2, log logVar, Class cls, tlg tlgVar) throws bng {
        log logVar2 = log.a;
        switch (logVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                tlgVar.c = Double.valueOf(Double.longBitsToDouble(jrb.w(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                tlgVar.c = Float.valueOf(Float.intBitsToFloat(jrb.u(bArr, i)));
                return i4;
            case 2:
            case 3:
                int iS = jrb.s(bArr, i, tlgVar);
                tlgVar.c = Long.valueOf(tlgVar.b);
                return iS;
            case 4:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                int iP = jrb.p(bArr, i, tlgVar);
                tlgVar.c = Integer.valueOf(tlgVar.a);
                return iP;
            case 5:
            case 15:
                int i5 = i + 8;
                tlgVar.c = Long.valueOf(jrb.w(bArr, i));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                tlgVar.c = Integer.valueOf(jrb.u(bArr, i));
                return i6;
            case 7:
                int iS2 = jrb.s(bArr, i, tlgVar);
                tlgVar.c = Boolean.valueOf(tlgVar.b != 0);
                return iS2;
            case 8:
                return jrb.y(bArr, i, tlgVar);
            case 9:
            default:
                ho7.n("unsupported field type.");
                return 0;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                yng yngVarA = vng.c.a(cls);
                omg omgVarB = yngVarA.b();
                int iA = jrb.A(omgVarB, yngVarA, bArr, i, i2, tlgVar);
                yngVarA.c(omgVarB);
                tlgVar.c = omgVarB;
                return iA;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return jrb.z(bArr, i, tlgVar);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                int iP2 = jrb.p(bArr, i, tlgVar);
                tlgVar.c = Integer.valueOf(amg.j(tlgVar.a));
                return iP2;
            case 17:
                int iS3 = jrb.s(bArr, i, tlgVar);
                tlgVar.c = Long.valueOf(amg.k(tlgVar.b));
                return iS3;
        }
    }

    public static Field z(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            ub3.v(sb, "Field ", str, " for ", name);
            cva.q(ks0.l(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    public final void A(int i, Object obj, Object obj2) {
        if (s(i, obj2)) {
            long jA = a(i) & 1048575;
            Unsafe unsafe = l;
            Object object = unsafe.getObject(obj2, jA);
            if (object == null) {
                int i2 = this.a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            yng yngVarC = C(i);
            if (!s(i, obj)) {
                if (m(object)) {
                    omg omgVarB = yngVarC.b();
                    yngVarC.d(omgVarB, object);
                    unsafe.putObject(obj, jA, omgVarB);
                } else {
                    unsafe.putObject(obj, jA, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jA);
            if (!m(object2)) {
                omg omgVarB2 = yngVarC.b();
                yngVarC.d(omgVarB2, object2);
                unsafe.putObject(obj, jA, omgVarB2);
                object2 = omgVarB2;
            }
            yngVarC.d(object2, object);
        }
    }

    public final void B(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (u(i2, obj2, i)) {
            long jA = a(i) & 1048575;
            Unsafe unsafe = l;
            Object object = unsafe.getObject(obj2, jA);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            yng yngVarC = C(i);
            if (!u(i2, obj, i)) {
                if (m(object)) {
                    omg omgVarB = yngVarC.b();
                    yngVarC.d(omgVarB, object);
                    unsafe.putObject(obj, jA, omgVarB);
                } else {
                    unsafe.putObject(obj, jA, object);
                }
                v(i2, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jA);
            if (!m(object2)) {
                omg omgVarB2 = yngVarC.b();
                yngVarC.d(omgVarB2, object2);
                unsafe.putObject(obj, jA, omgVarB2);
                object2 = omgVarB2;
            }
            yngVarC.d(object2, object);
        }
    }

    public final yng C(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        yng yngVar = (yng) objArr[i3];
        if (yngVar != null) {
            return yngVar;
        }
        yng yngVarA = vng.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = yngVarA;
        return yngVarA;
    }

    public final Object D(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final llg E(int i) {
        int i2 = i / 3;
        return (llg) this.b[i2 + i2 + 1];
    }

    public final Object F(int i, Object obj) {
        yng yngVarC = C(i);
        int iA = a(i) & 1048575;
        if (!s(i, obj)) {
            return yngVarC.b();
        }
        Object object = l.getObject(obj, iA);
        if (m(object)) {
            return object;
        }
        omg omgVarB = yngVarC.b();
        if (object != null) {
            yngVarC.d(omgVarB, object);
        }
        return omgVarB;
    }

    public final void G(int i, Object obj, Object obj2) {
        l.putObject(obj, a(i) & 1048575, obj2);
        t(i, obj);
    }

    public final Object H(int i, Object obj, int i2) {
        yng yngVarC = C(i2);
        if (!u(i, obj, i2)) {
            return yngVarC.b();
        }
        Object object = l.getObject(obj, a(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        omg omgVarB = yngVarC.b();
        if (object != null) {
            yngVarC.d(omgVarB, object);
        }
        return omgVarB;
    }

    public final void I(Object obj, int i, Object obj2, int i2) {
        l.putObject(obj, a(i2) & 1048575, obj2);
        v(i, obj, i2);
    }

    public final Object J(Object obj, int i, Object obj2, m8c m8cVar, Object obj3) {
        llg llgVarE;
        int i2 = this.a[i];
        Object objH = iog.h(a(i) & 1048575, obj);
        if (objH == null || (llgVarE = E(i)) == null) {
            return obj2;
        }
        psd psdVar = ((gng) D(i)).a;
        Iterator it = ((hng) objH).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!llgVarE.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    m8cVar.getClass();
                    obj2 = m8c.C(obj3);
                }
                int iB = gng.b(psdVar, entry.getKey(), entry.getValue());
                wlg wlgVar = xlg.a;
                byte[] bArr = new byte[iB];
                boolean z = gmg.b;
                bmg bmgVar = new bmg(bArr, iB);
                try {
                    gng.a(bmgVar, psdVar, entry.getKey(), entry.getValue());
                    if (bmgVar.x() > 0) {
                        qc0.p("Did not write as much data as expected.");
                        return null;
                    }
                    if (bmgVar.x() < 0) {
                        qc0.p("Wrote more data than expected.");
                        return null;
                    }
                    wlg wlgVar2 = new wlg(bArr);
                    m8cVar.getClass();
                    ((gog) obj2).d((i2 << 3) | 2, wlgVar2);
                    it.remove();
                } catch (IOException e) {
                    yg5.p(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void K(int i, k01 k01Var, Object obj) {
        amg amgVar = (amg) k01Var.d;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            k01Var.w(2);
            iog.i(j, obj, amgVar.x());
        } else if (!this.f) {
            iog.i(j, obj, k01Var.E());
        } else {
            k01Var.w(2);
            iog.i(j, obj, amgVar.w());
        }
    }

    public final int a(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.yng
    public final omg b() {
        return ((omg) this.e).g();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081 A[SYNTHETIC] */
    @Override // defpackage.yng
    public final void c(Object obj) {
        if (!m(obj)) {
            return;
        }
        if (obj instanceof omg) {
            omg omgVar = (omg) obj;
            omgVar.j();
            omgVar.zza = 0;
            omgVar.f();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.j.getClass();
                gog gogVar = ((omg) obj).zzc;
                if (gogVar.e) {
                    gogVar.e = false;
                    return;
                }
                return;
            }
            int iA = a(i);
            int i2 = 1048575 & iA;
            int iL = l(iA);
            long j = i2;
            Unsafe unsafe = l;
            if (iL != 9) {
                if (iL != 60 && iL != 68) {
                    switch (iL) {
                        case 17:
                            if (s(i, obj)) {
                                C(i).c(unsafe.getObject(obj, j));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case z7c.f /* 48 */:
                        case 49:
                            rlg rlgVar = (rlg) ((zmg) iog.h(j, obj));
                            if (rlgVar.a) {
                                rlgVar.a = false;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((hng) object).c();
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (u(iArr[i], obj, i)) {
                    C(i).c(unsafe.getObject(obj, j));
                }
            } else if (s(i, obj)) {
                C(i).c(unsafe.getObject(obj, j));
            }
            i += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // defpackage.yng
    public final void d(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                zng.b(obj, obj2);
                return;
            }
            int iA = a(i);
            int i2 = 1048575 & iA;
            int iL = l(iA);
            int i3 = iArr[i];
            long j = i2;
            switch (iL) {
                case 0:
                    if (!s(i, obj2)) {
                        obj3 = obj;
                    } else {
                        vff vffVar = iog.c;
                        obj3 = obj;
                        vffVar.u(obj3, j, vffVar.s(j, obj2));
                        t(i, obj3);
                    }
                    break;
                case 1:
                    if (s(i, obj2)) {
                        vff vffVar2 = iog.c;
                        vffVar2.r(obj, j, vffVar2.p(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i, obj2)) {
                        iog.g(j, obj, iog.f(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i, obj2)) {
                        iog.g(j, obj, iog.f(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i, obj2)) {
                        iog.e(j, obj, iog.d(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i, obj2)) {
                        iog.g(j, obj, iog.f(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i, obj2)) {
                        iog.e(j, obj, iog.d(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i, obj2)) {
                        vff vffVar3 = iog.c;
                        vffVar3.o(obj, j, vffVar3.n(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i, obj2)) {
                        iog.i(j, obj, iog.h(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    A(i, obj, obj2);
                    obj3 = obj;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (s(i, obj2)) {
                        iog.i(j, obj, iog.h(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (s(i, obj2)) {
                        iog.e(j, obj, iog.d(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (s(i, obj2)) {
                        iog.e(j, obj, iog.d(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (s(i, obj2)) {
                        iog.e(j, obj, iog.d(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i, obj2)) {
                        iog.g(j, obj, iog.f(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (s(i, obj2)) {
                        iog.e(j, obj, iog.d(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (s(i, obj2)) {
                        iog.g(j, obj, iog.f(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    A(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case z7c.f /* 48 */:
                case 49:
                    zmg zmgVarK0 = (zmg) iog.h(j, obj);
                    zmg zmgVar = (zmg) iog.h(j, obj2);
                    int size = zmgVarK0.size();
                    int size2 = zmgVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!((rlg) zmgVarK0).a) {
                            zmgVarK0 = zmgVarK0.k0(size2 + size);
                        }
                        zmgVarK0.addAll(zmgVar);
                    }
                    if (size > 0) {
                        zmgVar = zmgVarK0;
                    }
                    iog.i(j, obj, zmgVar);
                    obj3 = obj;
                    break;
                case 50:
                    m8c m8cVar = zng.a;
                    iog.i(j, obj, w1e.n(iog.h(j, obj), iog.h(j, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (u(i3, obj2, i)) {
                        iog.i(j, obj, iog.h(j, obj2));
                        v(i3, obj, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    B(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (u(i3, obj2, i)) {
                        iog.i(j, obj, iog.h(j, obj2));
                        v(i3, obj, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    B(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0490  */
    /* JADX WARN: Code duplicated, block: B:219:0x0580  */
    /* JADX WARN: Code duplicated, block: B:222:0x058e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5  */
    @Override // defpackage.yng
    public final int e(qlg qlgVar) {
        int i;
        int iA;
        int iB;
        int iA2;
        int iB2;
        int iA3;
        int iB3;
        int i2;
        int iA4;
        int iZ;
        int i3;
        int iB4;
        int iA5;
        int size;
        int iS;
        int iA6;
        int iA7;
        int iA8;
        int size2;
        int iA9;
        int iB5;
        int iA10;
        int iB6;
        int iA11;
        int iB7;
        int iO;
        int iA12;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iB8 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i6 >= iArr.length) {
                return ((omg) qlgVar).zzc.c() + iB8;
            }
            int iA13 = a(i6);
            int iL = l(iA13);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & i4;
            Unsafe unsafe = l;
            if (iL <= 17) {
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(qlgVar, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iA13 & i4;
            if (iL >= kmg.a.a()) {
                kmg.b.getClass();
            }
            long j = i11;
            switch (iL) {
                case 0:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        iB8 = xkg.b(i8 << 3, 8, iB8);
                    }
                    break;
                case 1:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        iB8 = xkg.b(i8 << 3, 4, iB8);
                    }
                    break;
                case 2:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        long j2 = unsafe.getLong(qlgVar, j);
                        iA = gmg.a(i8 << 3);
                        iB = gmg.b(j2);
                        iZ = iB + iA;
                        iB8 += iZ;
                    }
                    break;
                case 3:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        long j3 = unsafe.getLong(qlgVar, j);
                        iA = gmg.a(i8 << 3);
                        iB = gmg.b(j3);
                        iZ = iB + iA;
                        iB8 += iZ;
                    }
                    break;
                case 4:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        long j4 = unsafe.getInt(qlgVar, j);
                        iA = gmg.a(i8 << 3);
                        iB = gmg.b(j4);
                        iZ = iB + iA;
                        iB8 += iZ;
                    }
                    break;
                case 5:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        iB8 = xkg.b(i8 << 3, 8, iB8);
                    }
                    break;
                case 6:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        iB8 = xkg.b(i8 << 3, 4, iB8);
                    }
                    break;
                case 7:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        iB8 = xkg.b(i8 << 3, 1, iB8);
                    }
                    break;
                case 8:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(qlgVar, j);
                        if (object instanceof xlg) {
                            iA2 = gmg.a(i12);
                            iB2 = ((xlg) object).c();
                        } else {
                            iA2 = gmg.a(i12);
                            iB2 = kog.b((String) object);
                        }
                        iB8 = xkg.c(iB2, iB2, iA2, iB8);
                    }
                    break;
                case 9:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        Object object2 = unsafe.getObject(qlgVar, j);
                        yng yngVarC = C(i6);
                        m8c m8cVar = zng.a;
                        iA3 = gmg.a(i8 << 3);
                        iB3 = ((qlg) object2).b(yngVarC);
                        iB8 = xkg.c(iB3, iB3, iA3, iB8);
                    }
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        xlg xlgVar = (xlg) unsafe.getObject(qlgVar, j);
                        iA2 = gmg.a(i8 << 3);
                        iB2 = xlgVar.c();
                        iB8 = xkg.c(iB2, iB2, iA2, iB8);
                    }
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        i2 = unsafe.getInt(qlgVar, j);
                        iA4 = gmg.a(i8 << 3);
                        iB8 = xkg.b(i2, iA4, iB8);
                    }
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        long j5 = unsafe.getInt(qlgVar, j);
                        iA = gmg.a(i8 << 3);
                        iB = gmg.b(j5);
                        iZ = iB + iA;
                        iB8 += iZ;
                    }
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        iB8 = xkg.b(i8 << 3, 4, iB8);
                    }
                    break;
                case 14:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        iB8 = xkg.b(i8 << 3, 8, iB8);
                    }
                    break;
                case 15:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        int i13 = unsafe.getInt(qlgVar, j);
                        iA4 = gmg.a(i8 << 3);
                        i2 = (i13 >> 31) ^ (i13 + i13);
                        iB8 = xkg.b(i2, iA4, iB8);
                    }
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        long j6 = unsafe.getLong(qlgVar, j);
                        iA = gmg.a(i8 << 3);
                        iB = gmg.b((j6 >> 63) ^ (j6 + j6));
                        iZ = iB + iA;
                        iB8 += iZ;
                    }
                    break;
                case 17:
                    if (r(i6, i5, i7, i, qlgVar)) {
                        qlg qlgVar2 = (qlg) unsafe.getObject(qlgVar, j);
                        yng yngVarC2 = C(i6);
                        m8c m8cVar2 = zng.a;
                        int iA14 = gmg.a(i8 << 3);
                        i3 = iA14 + iA14;
                        iB4 = qlgVar2.b(yngVarC2);
                        iZ = iB4 + i3;
                        iB8 += iZ;
                    }
                    break;
                case 18:
                    iZ = zng.z(i8, (List) unsafe.getObject(qlgVar, j));
                    iB8 += iZ;
                    break;
                case 19:
                    iZ = zng.y(i8, (List) unsafe.getObject(qlgVar, j));
                    iB8 += iZ;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar3 = zng.a;
                    if (list.size() == 0) {
                        iA5 = 0;
                    } else {
                        iA5 = (gmg.a(i8 << 3) * list.size()) + zng.r(list);
                    }
                    iB8 += iA5;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar4 = zng.a;
                    size = list2.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zng.s(list2);
                        iA6 = gmg.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar5 = zng.a;
                    size = list3.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zng.v(list3);
                        iA6 = gmg.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case 23:
                    iZ = zng.z(i8, (List) unsafe.getObject(qlgVar, j));
                    iB8 += iZ;
                    break;
                case 24:
                    iZ = zng.y(i8, (List) unsafe.getObject(qlgVar, j));
                    iB8 += iZ;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar6 = zng.a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iA5 = 0;
                    } else {
                        iA5 = (gmg.a(i8 << 3) + 1) * size3;
                    }
                    iB8 += iA5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar7 = zng.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iA7 = 0;
                    } else {
                        iA7 = gmg.a(i8 << 3) * size4;
                        for (int i14 = 0; i14 < size4; i14++) {
                            Object obj = list5.get(i14);
                            int iC = obj instanceof xlg ? ((xlg) obj).c() : kog.b((String) obj);
                            iA7 = xkg.b(iC, iC, iA7);
                        }
                    }
                    iB8 += iA7;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(qlgVar, j);
                    yng yngVarC3 = C(i6);
                    m8c m8cVar8 = zng.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iA8 = 0;
                    } else {
                        iA8 = gmg.a(i8 << 3) * size5;
                        for (int i15 = 0; i15 < size5; i15++) {
                            int iB9 = ((qlg) list6.get(i15)).b(yngVarC3);
                            iA8 = xkg.b(iB9, iB9, iA8);
                        }
                    }
                    iB8 += iA8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar9 = zng.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iA7 = 0;
                    } else {
                        iA7 = gmg.a(i8 << 3) * size6;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int iC2 = ((xlg) list7.get(i16)).c();
                            iA7 = xkg.b(iC2, iC2, iA7);
                        }
                    }
                    iB8 += iA7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar10 = zng.a;
                    size = list8.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zng.w(list8);
                        iA6 = gmg.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar11 = zng.a;
                    size = list9.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zng.u(list9);
                        iA6 = gmg.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case 31:
                    iZ = zng.y(i8, (List) unsafe.getObject(qlgVar, j));
                    iB8 += iZ;
                    break;
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                    iZ = zng.z(i8, (List) unsafe.getObject(qlgVar, j));
                    iB8 += iZ;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar12 = zng.a;
                    size = list10.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zng.x(list10);
                        iA6 = gmg.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar13 = zng.a;
                    size = list11.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zng.t(list11);
                        iA6 = gmg.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar14 = zng.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar15 = zng.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 37:
                    size2 = zng.r((List) unsafe.getObject(qlgVar, j));
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 38:
                    size2 = zng.s((List) unsafe.getObject(qlgVar, j));
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 39:
                    size2 = zng.v((List) unsafe.getObject(qlgVar, j));
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar16 = zng.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar17 = zng.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar18 = zng.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 43:
                    size2 = zng.w((List) unsafe.getObject(qlgVar, j));
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 44:
                    size2 = zng.u((List) unsafe.getObject(qlgVar, j));
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar19 = zng.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(qlgVar, j);
                    m8c m8cVar20 = zng.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 47:
                    size2 = zng.x((List) unsafe.getObject(qlgVar, j));
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case z7c.f /* 48 */:
                    size2 = zng.t((List) unsafe.getObject(qlgVar, j));
                    if (size2 > 0) {
                        iA9 = gmg.a(i8 << 3);
                        iB8 = xkg.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(qlgVar, j);
                    yng yngVarC4 = C(i6);
                    m8c m8cVar21 = zng.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iB5 = 0;
                    } else {
                        iB5 = 0;
                        for (int i17 = 0; i17 < size7; i17++) {
                            qlg qlgVar3 = (qlg) list19.get(i17);
                            int iA15 = gmg.a(i8 << 3);
                            iB5 += qlgVar3.b(yngVarC4) + iA15 + iA15;
                        }
                    }
                    iB8 += iB5;
                    break;
                case 50:
                    hng hngVar = (hng) unsafe.getObject(qlgVar, j);
                    gng gngVar = (gng) D(i6);
                    if (hngVar.isEmpty()) {
                        iA7 = 0;
                    } else {
                        iA7 = 0;
                        for (Map.Entry entry : hngVar.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            psd psdVar = gngVar.a;
                            int iA16 = gmg.a(i8 << 3);
                            int iB10 = gng.b(psdVar, key, value);
                            iA7 = xkg.c(iB10, iB10, iA16, iA7);
                        }
                    }
                    iB8 += iA7;
                    break;
                case 51:
                    if (u(i8, qlgVar, i6)) {
                        iB8 = xkg.b(i8 << 3, 8, iB8);
                    }
                    break;
                case 52:
                    if (u(i8, qlgVar, i6)) {
                        iB8 = xkg.b(i8 << 3, 4, iB8);
                    }
                    break;
                case 53:
                    if (u(i8, qlgVar, i6)) {
                        long jP = p(j, qlgVar);
                        iA10 = gmg.a(i8 << 3);
                        iB6 = gmg.b(jP);
                        iB8 += iB6 + iA10;
                    }
                    break;
                case 54:
                    if (u(i8, qlgVar, i6)) {
                        long jP2 = p(j, qlgVar);
                        iA10 = gmg.a(i8 << 3);
                        iB6 = gmg.b(jP2);
                        iB8 += iB6 + iA10;
                    }
                    break;
                case 55:
                    if (u(i8, qlgVar, i6)) {
                        long jO = o(j, qlgVar);
                        iA10 = gmg.a(i8 << 3);
                        iB6 = gmg.b(jO);
                        iB8 += iB6 + iA10;
                    }
                    break;
                case 56:
                    if (u(i8, qlgVar, i6)) {
                        iB8 = xkg.b(i8 << 3, 8, iB8);
                    }
                    break;
                case 57:
                    if (u(i8, qlgVar, i6)) {
                        iB8 = xkg.b(i8 << 3, 4, iB8);
                    }
                    break;
                case 58:
                    if (u(i8, qlgVar, i6)) {
                        iB8 = xkg.b(i8 << 3, 1, iB8);
                    }
                    break;
                case 59:
                    if (u(i8, qlgVar, i6)) {
                        int i18 = i8 << 3;
                        Object object3 = unsafe.getObject(qlgVar, j);
                        if (object3 instanceof xlg) {
                            iA11 = gmg.a(i18);
                            iB7 = ((xlg) object3).c();
                        } else {
                            iA11 = gmg.a(i18);
                            iB7 = kog.b((String) object3);
                        }
                        iB8 = xkg.c(iB7, iB7, iA11, iB8);
                    }
                    break;
                case 60:
                    if (u(i8, qlgVar, i6)) {
                        Object object4 = unsafe.getObject(qlgVar, j);
                        yng yngVarC5 = C(i6);
                        m8c m8cVar22 = zng.a;
                        iA3 = gmg.a(i8 << 3);
                        iB3 = ((qlg) object4).b(yngVarC5);
                        iB8 = xkg.c(iB3, iB3, iA3, iB8);
                    }
                    break;
                case 61:
                    if (u(i8, qlgVar, i6)) {
                        xlg xlgVar2 = (xlg) unsafe.getObject(qlgVar, j);
                        iA11 = gmg.a(i8 << 3);
                        iB7 = xlgVar2.c();
                        iB8 = xkg.c(iB7, iB7, iA11, iB8);
                    }
                    break;
                case 62:
                    if (u(i8, qlgVar, i6)) {
                        iO = o(j, qlgVar);
                        iA12 = gmg.a(i8 << 3);
                        iB8 = xkg.b(iO, iA12, iB8);
                    }
                    break;
                case 63:
                    if (u(i8, qlgVar, i6)) {
                        long jO2 = o(j, qlgVar);
                        iA10 = gmg.a(i8 << 3);
                        iB6 = gmg.b(jO2);
                        iB8 += iB6 + iA10;
                    }
                    break;
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    if (u(i8, qlgVar, i6)) {
                        iB8 = xkg.b(i8 << 3, 4, iB8);
                    }
                    break;
                case 65:
                    if (u(i8, qlgVar, i6)) {
                        iB8 = xkg.b(i8 << 3, 8, iB8);
                    }
                    break;
                case 66:
                    if (u(i8, qlgVar, i6)) {
                        int iO2 = o(j, qlgVar);
                        iA12 = gmg.a(i8 << 3);
                        iO = (iO2 >> 31) ^ (iO2 + iO2);
                        iB8 = xkg.b(iO, iA12, iB8);
                    }
                    break;
                case 67:
                    if (u(i8, qlgVar, i6)) {
                        long jP3 = p(j, qlgVar);
                        iA10 = gmg.a(i8 << 3);
                        iB6 = gmg.b((jP3 >> 63) ^ (jP3 + jP3));
                        iB8 += iB6 + iA10;
                    }
                    break;
                case 68:
                    if (u(i8, qlgVar, i6)) {
                        qlg qlgVar4 = (qlg) unsafe.getObject(qlgVar, j);
                        yng yngVarC6 = C(i6);
                        m8c m8cVar23 = zng.a;
                        int iA17 = gmg.a(i8 << 3);
                        i3 = iA17 + iA17;
                        iB4 = qlgVar4.b(yngVarC6);
                        iZ = iB4 + i3;
                        iB8 += iZ;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    @Override // defpackage.yng
    public final boolean f(Object obj) {
        int i = 0;
        int i2 = 0;
        int i3 = 1048575;
        while (i < this.h) {
            int i4 = this.g[i];
            int iA = this.a(i4);
            int[] iArr = this.a;
            int i5 = iArr[i4 + 2];
            int i6 = i5 & 1048575;
            int i7 = 1 << (i5 >>> 20);
            if (i6 == i3) {
                i6 = i3;
            } else if (i6 != 1048575) {
                i2 = l.getInt(obj, i6);
            }
            int i8 = i2;
            qng qngVar = this;
            Object obj2 = obj;
            if ((268435456 & iA) == 0 || qngVar.r(i4, i6, i8, i7, obj2)) {
                int iL = l(iA);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!qngVar.u(iArr[i4], obj2, i4) || qngVar.C(i4).f(iog.h(iA & 1048575, obj2))) {
                                i++;
                                this = qngVar;
                                i3 = i6;
                                i2 = i8;
                                obj = obj2;
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                hng hngVar = (hng) iog.h(iA & 1048575, obj2);
                                if (!hngVar.isEmpty() && ((log) ((gng) qngVar.D(i4)).a.d).a() == mog.w) {
                                    yng yngVarA = null;
                                    for (Object obj3 : hngVar.values()) {
                                        if (yngVarA == null) {
                                            yngVarA = vng.c.a(obj3.getClass());
                                        }
                                        if (!yngVarA.f(obj3)) {
                                        }
                                    }
                                }
                            }
                            i++;
                            this = qngVar;
                            i3 = i6;
                            i2 = i8;
                            obj = obj2;
                        }
                    }
                    List list = (List) iog.h(iA & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        yng yngVarC = qngVar.C(i4);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (yngVarC.f(list.get(i9))) {
                            }
                        }
                    }
                    i++;
                    this = qngVar;
                    i3 = i6;
                    i2 = i8;
                    obj = obj2;
                } else if (!qngVar.r(i4, i6, i8, i7, obj2) || qngVar.C(i4).f(iog.h(iA & 1048575, obj2))) {
                    i++;
                    this = qngVar;
                    i3 = i6;
                    i2 = i8;
                    obj = obj2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:207:0x07c2 A[LOOP:3: B:206:0x07c0->B:207:0x07c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:211:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:217:0x07ef A[LOOP:1: B:216:0x07ed->B:217:0x07ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x0800  */
    /* JADX WARN: Code duplicated, block: B:224:0x07ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x07bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yng
    public final void g(Object obj, k01 k01Var, hmg hmgVar) throws Throwable {
        Object obj2;
        Object objJ;
        Object objJ2;
        qng qngVar;
        m8c m8cVar;
        Object obj3;
        qng qngVar2;
        Object objC;
        Object obj4;
        qng qngVar3 = this;
        amg amgVar = (amg) k01Var.d;
        int[] iArr = qngVar3.g;
        int i = qngVar3.i;
        int i2 = qngVar3.h;
        hmgVar.getClass();
        n(obj);
        m8c m8cVar2 = qngVar3.j;
        Object objC2 = null;
        while (true) {
            try {
                int iD = k01Var.D();
                int iW = (iD < qngVar3.c || iD > qngVar3.d) ? -1 : qngVar3.w(iD, 0);
                if (iW >= 0) {
                    int iA = qngVar3.a(iW);
                    try {
                        try {
                            switch (l(iA)) {
                                case 0:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qng qngVar4 = qngVar3;
                                    int i3 = iA & 1048575;
                                    try {
                                        k01Var.w(1);
                                        qngVar = qngVar4;
                                        iog.c.u(obj, i3, amgVar.o());
                                        qngVar.t(iW, obj);
                                        qngVar3 = qngVar;
                                        m8cVar2 = m8cVar;
                                        objC2 = obj2;
                                    } catch (Throwable th) {
                                        th = th;
                                        m8cVar2 = m8cVar;
                                        objC2 = obj2;
                                        objJ = objC2;
                                        while (i2 < i) {
                                            objJ = J(obj, iArr[i2], objJ, m8cVar2, obj);
                                            i2++;
                                        }
                                        if (objJ != null) {
                                            m8cVar2.getClass();
                                            ((omg) obj).zzc = (gog) objJ;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 1:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(5);
                                    iog.c.r(obj, iA & 1048575, amgVar.p());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 2:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(0);
                                    iog.g(iA & 1048575, obj, amgVar.r());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 3:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(0);
                                    iog.g(iA & 1048575, obj, amgVar.q());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 4:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(0);
                                    iog.e(iA & 1048575, obj, amgVar.s());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 5:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(1);
                                    iog.g(iA & 1048575, obj, amgVar.t());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 6:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(5);
                                    iog.e(iA & 1048575, obj, amgVar.u());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 7:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(0);
                                    iog.c.o(obj, iA & 1048575, amgVar.v());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 8:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    qngVar2.K(iA, k01Var, obj);
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 9:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    qlg qlgVar = (qlg) qngVar2.F(iW, obj);
                                    yng yngVarC = qngVar2.C(iW);
                                    k01Var.w(2);
                                    k01Var.x(qlgVar, yngVarC, hmgVar);
                                    qngVar2.G(iW, obj, qlgVar);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    iog.i(iA & 1048575, obj, k01Var.E());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(0);
                                    iog.e(iA & 1048575, obj, amgVar.A());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(0);
                                    int iB = amgVar.B();
                                    llg llgVarE = qngVar2.E(iW);
                                    if (llgVarE != null && !llgVarE.a(iB)) {
                                        m8c m8cVar3 = zng.a;
                                        if (obj2 == null) {
                                            m8cVar.getClass();
                                            objC = m8c.C(obj);
                                        } else {
                                            objC = obj2;
                                        }
                                        m8cVar.getClass();
                                        ((gog) objC).d(iD << 3, Long.valueOf(iB));
                                        qngVar3 = qngVar2;
                                        objC2 = objC;
                                        m8cVar2 = m8cVar;
                                    }
                                    iog.e(iA & 1048575, obj, iB);
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(5);
                                    iog.e(iA & 1048575, obj, amgVar.C());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 14:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(1);
                                    iog.g(iA & 1048575, obj, amgVar.D());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 15:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(0);
                                    iog.e(iA & 1048575, obj, amgVar.E());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    k01Var.w(0);
                                    iog.g(iA & 1048575, obj, amgVar.F());
                                    qngVar2.t(iW, obj);
                                    qngVar = qngVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 17:
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar2 = qngVar3;
                                    obj3 = obj;
                                    try {
                                        qlg qlgVar2 = (qlg) qngVar2.F(iW, obj3);
                                        yng yngVarC2 = qngVar2.C(iW);
                                        k01Var.w(3);
                                        k01Var.y(qlgVar2, yngVarC2, hmgVar);
                                        qngVar2.G(iW, obj3, qlgVar2);
                                        qngVar = qngVar2;
                                        qngVar3 = qngVar;
                                        m8cVar2 = m8cVar;
                                        objC2 = obj2;
                                    } catch (ang unused) {
                                        qngVar = qngVar2;
                                        objC2 = obj2;
                                        if (objC2 == null) {
                                            try {
                                                m8cVar.getClass();
                                                objC2 = m8c.C(obj3);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                m8cVar2 = m8cVar;
                                                objJ = objC2;
                                                while (i2 < i) {
                                                    objJ = J(obj, iArr[i2], objJ, m8cVar2, obj);
                                                    i2++;
                                                }
                                                if (objJ != null) {
                                                    m8cVar2.getClass();
                                                    ((omg) obj).zzc = (gog) objJ;
                                                }
                                                throw th;
                                            }
                                        }
                                        m8cVar.getClass();
                                        if (!m8c.D(0, k01Var, objC2)) {
                                            objJ2 = objC2;
                                            while (i2 < i) {
                                                objJ2 = qngVar.J(obj3, iArr[i2], objJ2, m8cVar, obj);
                                                i2++;
                                                qngVar = this;
                                                obj3 = obj;
                                            }
                                            m8cVar2 = m8cVar;
                                            if (objJ2 != null) {
                                                m8cVar2.getClass();
                                                ((omg) obj).zzc = (gog) objJ2;
                                            }
                                        }
                                        qngVar3 = this;
                                        m8cVar2 = m8cVar;
                                    }
                                    break;
                                case 18:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    k01Var.F(pzd.l(iA & 1048575, obj));
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 19:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    k01Var.G(pzd.l(iA & 1048575, obj));
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 20:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    k01Var.g(pzd.l(iA & 1048575, obj));
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 21:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    k01Var.H(pzd.l(iA & 1048575, obj));
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 22:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    k01Var.h(pzd.l(iA & 1048575, obj));
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 23:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    k01Var.i(pzd.l(iA & 1048575, obj));
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 24:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    k01Var.j(pzd.l(iA & 1048575, obj));
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 25:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    k01Var.k(pzd.l(iA & 1048575, obj));
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 26:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    if ((536870912 & iA) != 0) {
                                        k01Var.l(pzd.l(iA & 1048575, obj), true);
                                    } else {
                                        k01Var.l(pzd.l(iA & 1048575, obj), false);
                                    }
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 27:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    k01Var.m(pzd.l(iA & 1048575, obj), qngVar.C(iW), hmgVar);
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 28:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    k01Var.o(pzd.l(iA & 1048575, obj));
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 29:
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    obj3 = obj;
                                    try {
                                        try {
                                            k01Var.p(pzd.l(iA & 1048575, obj3));
                                            qngVar3 = qngVar;
                                            m8cVar2 = m8cVar;
                                            objC2 = obj2;
                                        } catch (ang unused2) {
                                            objC2 = obj2;
                                            if (objC2 == null) {
                                                m8cVar.getClass();
                                                objC2 = m8c.C(obj3);
                                            }
                                            m8cVar.getClass();
                                            if (!m8c.D(0, k01Var, objC2)) {
                                                objJ2 = objC2;
                                                while (i2 < i) {
                                                    objJ2 = qngVar.J(obj3, iArr[i2], objJ2, m8cVar, obj);
                                                    i2++;
                                                    qngVar = this;
                                                    obj3 = obj;
                                                }
                                                m8cVar2 = m8cVar;
                                                if (objJ2 != null) {
                                                    m8cVar2.getClass();
                                                    ((omg) obj).zzc = (gog) objJ2;
                                                }
                                            }
                                            qngVar3 = this;
                                            m8cVar2 = m8cVar;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        m8cVar2 = m8cVar;
                                        objC2 = obj2;
                                        objJ = objC2;
                                        while (i2 < i) {
                                            objJ = J(obj, iArr[i2], objJ, m8cVar2, obj);
                                            i2++;
                                        }
                                        if (objJ != null) {
                                            m8cVar2.getClass();
                                            ((omg) obj).zzc = (gog) objJ;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 30:
                                    qngVar = qngVar3;
                                    m8cVar = m8cVar2;
                                    obj3 = obj;
                                    Object obj5 = objC2;
                                    try {
                                        zmg zmgVarL = pzd.l(iA & 1048575, obj3);
                                        k01Var.q(zmgVarL);
                                        try {
                                            objC2 = zng.c(obj3, iD, zmgVarL, qngVar.E(iW), obj5, m8cVar);
                                            m8cVar = m8cVar;
                                            qngVar3 = qngVar;
                                            m8cVar2 = m8cVar;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj5;
                                            m8cVar = m8cVar;
                                            m8cVar2 = m8cVar;
                                            objC2 = obj2;
                                            objJ = objC2;
                                            while (i2 < i) {
                                                objJ = J(obj, iArr[i2], objJ, m8cVar2, obj);
                                                i2++;
                                            }
                                            if (objJ != null) {
                                                m8cVar2.getClass();
                                                ((omg) obj).zzc = (gog) objJ;
                                            }
                                            throw th;
                                        }
                                    } catch (ang unused3) {
                                        obj2 = obj5;
                                        objC2 = obj2;
                                        if (objC2 == null) {
                                            m8cVar.getClass();
                                            objC2 = m8c.C(obj3);
                                        }
                                        m8cVar.getClass();
                                        if (!m8c.D(0, k01Var, objC2)) {
                                            objJ2 = objC2;
                                            while (i2 < i) {
                                                objJ2 = qngVar.J(obj3, iArr[i2], objJ2, m8cVar, obj);
                                                i2++;
                                                qngVar = this;
                                                obj3 = obj;
                                            }
                                            m8cVar2 = m8cVar;
                                            if (objJ2 != null) {
                                                m8cVar2.getClass();
                                                ((omg) obj).zzc = (gog) objJ2;
                                            }
                                        }
                                        qngVar3 = this;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj5;
                                    }
                                    break;
                                case 31:
                                    qngVar = qngVar3;
                                    k01Var.r(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                    qngVar = qngVar3;
                                    k01Var.s(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 33:
                                    qngVar = qngVar3;
                                    k01Var.t(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 34:
                                    qngVar = qngVar3;
                                    k01Var.u(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 35:
                                    qngVar = qngVar3;
                                    k01Var.F(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 36:
                                    qngVar = qngVar3;
                                    k01Var.G(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 37:
                                    qngVar = qngVar3;
                                    k01Var.g(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 38:
                                    qngVar = qngVar3;
                                    k01Var.H(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 39:
                                    qngVar = qngVar3;
                                    k01Var.h(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 40:
                                    qngVar = qngVar3;
                                    k01Var.i(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 41:
                                    qngVar = qngVar3;
                                    k01Var.j(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 42:
                                    qngVar = qngVar3;
                                    k01Var.k(pzd.l(iA & 1048575, obj));
                                    obj2 = objC2;
                                    m8cVar = m8cVar2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 43:
                                    qngVar = qngVar3;
                                    obj3 = obj;
                                    try {
                                        k01Var.p(pzd.l(iA & 1048575, obj3));
                                        obj2 = objC2;
                                        m8cVar = m8cVar2;
                                        qngVar3 = qngVar;
                                        m8cVar2 = m8cVar;
                                        objC2 = obj2;
                                    } catch (ang unused4) {
                                        obj2 = objC2;
                                        m8cVar = m8cVar2;
                                        objC2 = obj2;
                                        if (objC2 == null) {
                                            m8cVar.getClass();
                                            objC2 = m8c.C(obj3);
                                        }
                                        m8cVar.getClass();
                                        if (!m8c.D(0, k01Var, objC2)) {
                                            objJ2 = objC2;
                                            while (i2 < i) {
                                                objJ2 = qngVar.J(obj3, iArr[i2], objJ2, m8cVar, obj);
                                                i2++;
                                                qngVar = this;
                                                obj3 = obj;
                                            }
                                            m8cVar2 = m8cVar;
                                            if (objJ2 != null) {
                                                m8cVar2.getClass();
                                                ((omg) obj).zzc = (gog) objJ2;
                                            }
                                        }
                                        qngVar3 = this;
                                        m8cVar2 = m8cVar;
                                    }
                                    break;
                                case 44:
                                    m8cVar = m8cVar2;
                                    try {
                                        zmg zmgVarL2 = pzd.l(iA & 1048575, obj);
                                        k01Var.q(zmgVarL2);
                                        llg llgVarE2 = qngVar3.E(iW);
                                        qngVar = qngVar3;
                                        obj3 = obj;
                                        Object obj6 = objC2;
                                        try {
                                            try {
                                                objC2 = zng.c(obj3, iD, zmgVarL2, llgVarE2, obj6, m8cVar);
                                                m8cVar2 = m8cVar;
                                                qngVar3 = qngVar;
                                            } catch (ang unused5) {
                                                obj2 = obj6;
                                                m8cVar = m8cVar;
                                                objC2 = obj2;
                                                if (objC2 == null) {
                                                    m8cVar.getClass();
                                                    objC2 = m8c.C(obj3);
                                                }
                                                m8cVar.getClass();
                                                if (!m8c.D(0, k01Var, objC2)) {
                                                    objJ2 = objC2;
                                                    while (i2 < i) {
                                                        objJ2 = qngVar.J(obj3, iArr[i2], objJ2, m8cVar, obj);
                                                        i2++;
                                                        qngVar = this;
                                                        obj3 = obj;
                                                    }
                                                    m8cVar2 = m8cVar;
                                                    if (objJ2 != null) {
                                                        m8cVar2.getClass();
                                                        ((omg) obj).zzc = (gog) objJ2;
                                                    }
                                                }
                                                qngVar3 = this;
                                                m8cVar2 = m8cVar;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            objC2 = obj6;
                                            m8cVar2 = m8cVar;
                                            obj2 = objC2;
                                            objC2 = obj2;
                                            objJ = objC2;
                                            while (i2 < i) {
                                                objJ = J(obj, iArr[i2], objJ, m8cVar2, obj);
                                                i2++;
                                            }
                                            if (objJ != null) {
                                                m8cVar2.getClass();
                                                ((omg) obj).zzc = (gog) objJ;
                                            }
                                            throw th;
                                        }
                                    } catch (ang unused6) {
                                        qngVar = qngVar3;
                                        obj3 = obj;
                                        obj2 = objC2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        m8cVar2 = m8cVar;
                                    }
                                    break;
                                case 45:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.r(pzd.l(iA & 1048575, obj4));
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 46:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.s(pzd.l(iA & 1048575, obj4));
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 47:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.t(pzd.l(iA & 1048575, obj4));
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case z7c.f /* 48 */:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.u(pzd.l(iA & 1048575, obj4));
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 49:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.n(pzd.l(iA & 1048575, obj4), qngVar3.C(iW), hmgVar);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 50:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    Object objD = qngVar3.D(iW);
                                    long jA = qngVar3.a(iW) & 1048575;
                                    Object objH = iog.h(jA, obj4);
                                    if (objH == null) {
                                        objH = hng.a.b();
                                        iog.i(jA, obj4, objH);
                                    } else if (!((hng) objH).d()) {
                                        Object objB = hng.a.b();
                                        w1e.n(objB, objH);
                                        iog.i(jA, obj4, objB);
                                        objH = objB;
                                    }
                                    k01Var.v((hng) objH, ((gng) objD).a, hmgVar);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 51:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(1);
                                    iog.i(iA & 1048575, obj4, Double.valueOf(amgVar.o()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 52:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(5);
                                    iog.i(iA & 1048575, obj4, Float.valueOf(amgVar.p()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 53:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(0);
                                    iog.i(iA & 1048575, obj4, Long.valueOf(amgVar.r()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 54:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(0);
                                    iog.i(iA & 1048575, obj4, Long.valueOf(amgVar.q()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 55:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(0);
                                    iog.i(iA & 1048575, obj4, Integer.valueOf(amgVar.s()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 56:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(1);
                                    iog.i(iA & 1048575, obj4, Long.valueOf(amgVar.t()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 57:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(5);
                                    iog.i(iA & 1048575, obj4, Integer.valueOf(amgVar.u()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 58:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(0);
                                    iog.i(iA & 1048575, obj4, Boolean.valueOf(amgVar.v()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 59:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    qngVar3.K(iA, k01Var, obj4);
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 60:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    qlg qlgVar3 = (qlg) qngVar3.H(iD, obj4, iW);
                                    yng yngVarC3 = qngVar3.C(iW);
                                    k01Var.w(2);
                                    k01Var.x(qlgVar3, yngVarC3, hmgVar);
                                    qngVar3.I(obj4, iD, qlgVar3, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 61:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    iog.i(iA & 1048575, obj4, k01Var.E());
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 62:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(0);
                                    iog.i(iA & 1048575, obj4, Integer.valueOf(amgVar.A()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 63:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(0);
                                    int iB2 = amgVar.B();
                                    llg llgVarE3 = qngVar3.E(iW);
                                    if (llgVarE3 != null && !llgVarE3.a(iB2)) {
                                        m8c m8cVar4 = zng.a;
                                        if (objC2 == null) {
                                            m8cVar.getClass();
                                            objC = m8c.C(obj4);
                                        } else {
                                            objC = objC2;
                                        }
                                        m8cVar.getClass();
                                        ((gog) objC).d(iD << 3, Long.valueOf(iB2));
                                        objC2 = objC;
                                        m8cVar2 = m8cVar;
                                    }
                                    iog.i(iA & 1048575, obj4, Integer.valueOf(iB2));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(5);
                                    iog.i(iA & 1048575, obj4, Integer.valueOf(amgVar.C()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 65:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(1);
                                    iog.i(iA & 1048575, obj4, Long.valueOf(amgVar.D()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 66:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(0);
                                    iog.i(iA & 1048575, obj4, Integer.valueOf(amgVar.E()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 67:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    k01Var.w(0);
                                    iog.i(iA & 1048575, obj4, Long.valueOf(amgVar.F()));
                                    qngVar3.v(iD, obj4, iW);
                                    qngVar = qngVar3;
                                    obj2 = objC2;
                                    qngVar3 = qngVar;
                                    m8cVar2 = m8cVar;
                                    objC2 = obj2;
                                    break;
                                case 68:
                                    m8cVar = m8cVar2;
                                    obj4 = obj;
                                    try {
                                        qlg qlgVar4 = (qlg) qngVar3.H(iD, obj4, iW);
                                        yng yngVarC4 = qngVar3.C(iW);
                                        k01Var.w(3);
                                        k01Var.y(qlgVar4, yngVarC4, hmgVar);
                                        qngVar3.I(obj4, iD, qlgVar4, iW);
                                        qngVar = qngVar3;
                                        obj2 = objC2;
                                        qngVar3 = qngVar;
                                        m8cVar2 = m8cVar;
                                        objC2 = obj2;
                                    } catch (ang unused7) {
                                        qngVar = qngVar3;
                                        obj2 = objC2;
                                        obj3 = obj4;
                                        objC2 = obj2;
                                        if (objC2 == null) {
                                            m8cVar.getClass();
                                            objC2 = m8c.C(obj3);
                                        }
                                        m8cVar.getClass();
                                        if (!m8c.D(0, k01Var, objC2)) {
                                            objJ2 = objC2;
                                            while (i2 < i) {
                                                objJ2 = qngVar.J(obj3, iArr[i2], objJ2, m8cVar, obj);
                                                i2++;
                                                qngVar = this;
                                                obj3 = obj;
                                            }
                                            m8cVar2 = m8cVar;
                                            if (objJ2 != null) {
                                                m8cVar2.getClass();
                                                ((omg) obj).zzc = (gog) objJ2;
                                            }
                                        }
                                        qngVar3 = this;
                                        m8cVar2 = m8cVar;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        obj2 = objC2;
                                        m8cVar2 = m8cVar;
                                        objC2 = obj2;
                                        objJ = objC2;
                                        while (i2 < i) {
                                            objJ = J(obj, iArr[i2], objJ, m8cVar2, obj);
                                            i2++;
                                        }
                                        if (objJ != null) {
                                            m8cVar2.getClass();
                                            ((omg) obj).zzc = (gog) objJ;
                                        }
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (objC2 == null) {
                                        m8cVar2.getClass();
                                        objC2 = m8c.C(obj);
                                    }
                                    try {
                                        m8cVar2.getClass();
                                        if (m8c.D(0, k01Var, objC2)) {
                                            m8cVar = m8cVar2;
                                            m8cVar2 = m8cVar;
                                        } else {
                                            objJ2 = objC2;
                                            while (i2 < i) {
                                                objJ2 = qngVar3.J(obj, iArr[i2], objJ2, m8cVar2, obj);
                                                i2++;
                                                m8cVar2 = m8cVar2;
                                            }
                                            m8cVar = m8cVar2;
                                            m8cVar2 = m8cVar;
                                        }
                                    } catch (ang unused8) {
                                        m8cVar = m8cVar2;
                                        qngVar = qngVar3;
                                        obj3 = obj;
                                        if (objC2 == null) {
                                            m8cVar.getClass();
                                            objC2 = m8c.C(obj3);
                                        }
                                        m8cVar.getClass();
                                        if (!m8c.D(0, k01Var, objC2)) {
                                            objJ2 = objC2;
                                            while (i2 < i) {
                                                objJ2 = qngVar.J(obj3, iArr[i2], objJ2, m8cVar, obj);
                                                i2++;
                                                qngVar = this;
                                                obj3 = obj;
                                            }
                                            m8cVar2 = m8cVar;
                                            if (objJ2 != null) {
                                                m8cVar2.getClass();
                                                ((omg) obj).zzc = (gog) objJ2;
                                            }
                                        }
                                        qngVar3 = this;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        m8cVar = m8cVar2;
                                        m8cVar2 = m8cVar;
                                        objJ = objC2;
                                        while (i2 < i) {
                                            objJ = J(obj, iArr[i2], objJ, m8cVar2, obj);
                                            i2++;
                                        }
                                        if (objJ != null) {
                                            m8cVar2.getClass();
                                            ((omg) obj).zzc = (gog) objJ;
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (ang unused9) {
                            qngVar = qngVar3;
                            obj2 = objC2;
                            m8cVar = m8cVar2;
                            obj3 = obj;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        obj2 = objC2;
                    }
                } else if (iD == Integer.MAX_VALUE) {
                    objJ2 = objC2;
                    while (i2 < i) {
                        objJ2 = qngVar3.J(obj, iArr[i2], objJ2, m8cVar2, obj);
                        i2++;
                        qngVar3 = this;
                    }
                } else {
                    if (objC2 == null) {
                        m8cVar2.getClass();
                        objC2 = m8c.C(obj);
                    }
                    try {
                        m8cVar2.getClass();
                        if (m8c.D(0, k01Var, objC2)) {
                            qngVar3 = this;
                        } else {
                            objJ2 = objC2;
                            while (i2 < i) {
                                objJ2 = J(obj, iArr[i2], objJ2, m8cVar2, obj);
                                i2++;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        objJ = objC2;
                        while (i2 < i) {
                            objJ = J(obj, iArr[i2], objJ, m8cVar2, obj);
                            i2++;
                        }
                        if (objJ != null) {
                            m8cVar2.getClass();
                            ((omg) obj).zzc = (gog) objJ;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
        if (objJ2 != null) {
            m8cVar2.getClass();
            ((omg) obj).zzc = (gog) objJ2;
        }
    }

    @Override // defpackage.yng
    public final void h(Object obj, byte[] bArr, int i, int i2, tlg tlgVar) {
        y(obj, bArr, i, i2, 0, tlgVar);
    }

    @Override // defpackage.yng
    public final int i(omg omgVar) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.a.length; i5 += 3) {
            int iA = a(i5);
            int iL = l(iA);
            if (iL <= 50 || iL >= 69) {
                long j = iA & 1048575;
                int iHashCode2 = 37;
                switch (iL) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(iog.c.s(j, omgVar));
                        byte[] bArr = xmg.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(iog.c.p(j, omgVar));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = iog.f(j, omgVar);
                        byte[] bArr2 = xmg.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = iog.f(j, omgVar);
                        byte[] bArr3 = xmg.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = iog.d(j, omgVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = iog.f(j, omgVar);
                        byte[] bArr4 = xmg.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = iog.d(j, omgVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zN = iog.c.n(j, omgVar);
                        byte[] bArr5 = xmg.a;
                        i3 = zN ? 1231 : 1237;
                        iHashCode = i + i3;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) iog.h(j, omgVar)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objH = iog.h(j, omgVar);
                        if (objH != null) {
                            iHashCode2 = objH.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = iog.h(j, omgVar).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = iog.d(j, omgVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = iog.d(j, omgVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = iog.d(j, omgVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = iog.f(j, omgVar);
                        byte[] bArr6 = xmg.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = iog.d(j, omgVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = iog.f(j, omgVar);
                        byte[] bArr7 = xmg.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objH2 = iog.h(j, omgVar);
                        if (objH2 != null) {
                            iHashCode2 = objH2.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case z7c.f /* 48 */:
                    case 49:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = iog.h(j, omgVar).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = iog.h(j, omgVar).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i6 >= iArr.length) {
                return omgVar.zzc.hashCode() + (iHashCode * 53);
            }
            int i7 = iArr[i6];
            if (!u(0, omgVar, i7)) {
                iHashCode = iog.h(a(i7) & 1048575, omgVar).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    @Override // defpackage.yng
    public final void j(Object obj, g5b g5bVar) {
        int i;
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                ((omg) obj).zzc.b(g5bVar);
                return;
            }
            int iA = a(i4);
            int iL = l(iA);
            int i6 = iArr[i4];
            Unsafe unsafe = l;
            if (iL <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iA & i2;
            switch (iL) {
                case 0:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.i(i6, Double.doubleToRawLongBits(iog.c.s(j, obj)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.g(i6, Float.floatToRawIntBits(iog.c.p(j, obj)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.h(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.h(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.e(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.i(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.g(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.j(i6, iog.c.n(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (r(i4, i3, i5, i, obj)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            gmgVar.k(i6, (String) object);
                        } else {
                            gmgVar.l(i6, (xlg) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (r(i4, i3, i5, i, obj)) {
                        g5bVar.s(i6, unsafe.getObject(obj, j), C(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.l(i6, (xlg) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.f(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.e(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.g(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (r(i4, i3, i5, i, obj)) {
                        gmgVar.i(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (r(i4, i3, i5, i, obj)) {
                        int i9 = unsafe.getInt(obj, j);
                        gmgVar.f(i6, (i9 >> 31) ^ (i9 + i9));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (r(i4, i3, i5, i, obj)) {
                        long j2 = unsafe.getLong(obj, j);
                        gmgVar.h(i6, (j2 >> 63) ^ (j2 + j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (r(i4, i3, i5, i, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        gmgVar.d(i6, 3);
                        C(i4).j((qlg) object2, g5bVar);
                        gmgVar.d(i6, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    zng.d(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    zng.e(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    zng.f(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    zng.g(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    zng.k(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    zng.i(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    zng.n(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    zng.q(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    m8c m8cVar = zng.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            gmgVar.k(i10, (String) list.get(i11));
                        }
                    }
                    break;
                case 27:
                    int i12 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    yng yngVarC = C(i4);
                    m8c m8cVar2 = zng.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            g5bVar.s(i12, list2.get(i13), yngVarC);
                        }
                    }
                    break;
                case 28:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    m8c m8cVar3 = zng.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            gmgVar.l(i14, (xlg) list3.get(i15));
                        }
                    }
                    break;
                case 29:
                    zng.l(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    zng.p(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    zng.o(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                    zng.j(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    zng.m(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    zng.h(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    zng.d(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 36:
                    zng.e(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 37:
                    zng.f(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 38:
                    zng.g(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 39:
                    zng.k(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 40:
                    zng.i(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 41:
                    zng.n(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 42:
                    zng.q(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 43:
                    zng.l(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 44:
                    zng.p(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 45:
                    zng.o(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 46:
                    zng.j(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 47:
                    zng.m(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case z7c.f /* 48 */:
                    zng.h(iArr[i4], (List) unsafe.getObject(obj, j), g5bVar, true);
                    break;
                case 49:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    yng yngVarC2 = C(i4);
                    m8c m8cVar4 = zng.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            qlg qlgVar = (qlg) list4.get(i17);
                            gmgVar.d(i16, 3);
                            yngVarC2.j(qlgVar, g5bVar);
                            gmgVar.d(i16, 4);
                        }
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        psd psdVar = ((gng) D(i4)).a;
                        for (Map.Entry entry : ((hng) object3).entrySet()) {
                            gmgVar.d(i6, 2);
                            gmgVar.r(gng.b(psdVar, entry.getKey(), entry.getValue()));
                            gng.a(gmgVar, psdVar, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case 51:
                    if (u(i6, obj, i4)) {
                        gmgVar.i(i6, Double.doubleToRawLongBits(((Double) iog.h(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (u(i6, obj, i4)) {
                        gmgVar.g(i6, Float.floatToRawIntBits(((Float) iog.h(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (u(i6, obj, i4)) {
                        gmgVar.h(i6, p(j, obj));
                    }
                    break;
                case 54:
                    if (u(i6, obj, i4)) {
                        gmgVar.h(i6, p(j, obj));
                    }
                    break;
                case 55:
                    if (u(i6, obj, i4)) {
                        gmgVar.e(i6, o(j, obj));
                    }
                    break;
                case 56:
                    if (u(i6, obj, i4)) {
                        gmgVar.i(i6, p(j, obj));
                    }
                    break;
                case 57:
                    if (u(i6, obj, i4)) {
                        gmgVar.g(i6, o(j, obj));
                    }
                    break;
                case 58:
                    if (u(i6, obj, i4)) {
                        gmgVar.j(i6, ((Boolean) iog.h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (u(i6, obj, i4)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            gmgVar.k(i6, (String) object4);
                        } else {
                            gmgVar.l(i6, (xlg) object4);
                        }
                    }
                    break;
                case 60:
                    if (u(i6, obj, i4)) {
                        g5bVar.s(i6, unsafe.getObject(obj, j), C(i4));
                    }
                    break;
                case 61:
                    if (u(i6, obj, i4)) {
                        gmgVar.l(i6, (xlg) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (u(i6, obj, i4)) {
                        gmgVar.f(i6, o(j, obj));
                    }
                    break;
                case 63:
                    if (u(i6, obj, i4)) {
                        gmgVar.e(i6, o(j, obj));
                    }
                    break;
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    if (u(i6, obj, i4)) {
                        gmgVar.g(i6, o(j, obj));
                    }
                    break;
                case 65:
                    if (u(i6, obj, i4)) {
                        gmgVar.i(i6, p(j, obj));
                    }
                    break;
                case 66:
                    if (u(i6, obj, i4)) {
                        int iO = o(j, obj);
                        gmgVar.f(i6, (iO >> 31) ^ (iO + iO));
                    }
                    break;
                case 67:
                    if (u(i6, obj, i4)) {
                        long jP = p(j, obj);
                        gmgVar.h(i6, (jP >> 63) ^ (jP + jP));
                    }
                    break;
                case 68:
                    if (u(i6, obj, i4)) {
                        Object object5 = unsafe.getObject(obj, j);
                        gmgVar.d(i6, 3);
                        C(i4).j((qlg) object5, g5bVar);
                        gmgVar.d(i6, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.yng
    public final boolean k(omg omgVar, omg omgVar2) {
        boolean zA;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iA = a(i);
                int iL = l(iA);
                if (iL <= 50 || iL >= 69) {
                    long j = iA & 1048575;
                    switch (iL) {
                        case 0:
                            if (q(omgVar, omgVar2, i)) {
                                vff vffVar = iog.c;
                                if (Double.doubleToLongBits(vffVar.s(j, omgVar)) != Double.doubleToLongBits(vffVar.s(j, omgVar2))) {
                                }
                            }
                            break;
                        case 1:
                            if (q(omgVar, omgVar2, i)) {
                                vff vffVar2 = iog.c;
                                if (Float.floatToIntBits(vffVar2.p(j, omgVar)) != Float.floatToIntBits(vffVar2.p(j, omgVar2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!q(omgVar, omgVar2, i) || iog.f(j, omgVar) != iog.f(j, omgVar2)) {
                            }
                            break;
                        case 3:
                            if (!q(omgVar, omgVar2, i) || iog.f(j, omgVar) != iog.f(j, omgVar2)) {
                            }
                            break;
                        case 4:
                            if (!q(omgVar, omgVar2, i) || iog.d(j, omgVar) != iog.d(j, omgVar2)) {
                            }
                            break;
                        case 5:
                            if (!q(omgVar, omgVar2, i) || iog.f(j, omgVar) != iog.f(j, omgVar2)) {
                            }
                            break;
                        case 6:
                            if (!q(omgVar, omgVar2, i) || iog.d(j, omgVar) != iog.d(j, omgVar2)) {
                            }
                            break;
                        case 7:
                            if (q(omgVar, omgVar2, i)) {
                                vff vffVar3 = iog.c;
                                if (vffVar3.n(j, omgVar) != vffVar3.n(j, omgVar2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!q(omgVar, omgVar2, i) || !zng.a(iog.h(j, omgVar), iog.h(j, omgVar2))) {
                            }
                            break;
                        case 9:
                            if (!q(omgVar, omgVar2, i) || !zng.a(iog.h(j, omgVar), iog.h(j, omgVar2))) {
                            }
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            if (!q(omgVar, omgVar2, i) || !zng.a(iog.h(j, omgVar), iog.h(j, omgVar2))) {
                            }
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            if (!q(omgVar, omgVar2, i) || iog.d(j, omgVar) != iog.d(j, omgVar2)) {
                            }
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            if (!q(omgVar, omgVar2, i) || iog.d(j, omgVar) != iog.d(j, omgVar2)) {
                            }
                            break;
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            if (!q(omgVar, omgVar2, i) || iog.d(j, omgVar) != iog.d(j, omgVar2)) {
                            }
                            break;
                        case 14:
                            if (!q(omgVar, omgVar2, i) || iog.f(j, omgVar) != iog.f(j, omgVar2)) {
                            }
                            break;
                        case 15:
                            if (!q(omgVar, omgVar2, i) || iog.d(j, omgVar) != iog.d(j, omgVar2)) {
                            }
                            break;
                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                            if (!q(omgVar, omgVar2, i) || iog.f(j, omgVar) != iog.f(j, omgVar2)) {
                            }
                            break;
                        case 17:
                            if (!q(omgVar, omgVar2, i) || !zng.a(iog.h(j, omgVar), iog.h(j, omgVar2))) {
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case z7c.f /* 48 */:
                        case 49:
                            zA = zng.a(iog.h(j, omgVar), iog.h(j, omgVar2));
                            if (zA) {
                            }
                            break;
                        case 50:
                            zA = zng.a(iog.h(j, omgVar), iog.h(j, omgVar2));
                            if (zA) {
                            }
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                            long j2 = iArr[i + 2] & 1048575;
                            if (iog.d(j2, omgVar) == iog.d(j2, omgVar2) && zng.a(iog.h(j, omgVar), iog.h(j, omgVar2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i += 3;
            } else {
                int i2 = this.i;
                while (true) {
                    int[] iArr2 = this.g;
                    if (i2 < iArr2.length) {
                        int i3 = iArr2[i2];
                        long j3 = iArr[i3 + 2] & 1048575;
                        if (iog.d(j3, omgVar) != iog.d(j3, omgVar2)) {
                            return false;
                        }
                        if (!u(0, omgVar, i3)) {
                            long jA = a(i3) & 1048575;
                            if (!zng.a(iog.h(jA, omgVar), iog.h(jA, omgVar2))) {
                            }
                        }
                        i2++;
                    } else if (omgVar.zzc.equals(omgVar2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean q(omg omgVar, omg omgVar2, int i) {
        return s(i, omgVar) == s(i, omgVar2);
    }

    public final boolean r(int i, int i2, int i3, int i4, Object obj) {
        if (i2 == 1048575) {
            return s(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & iog.d(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iA = a(i);
        long j2 = iA & 1048575;
        switch (l(iA)) {
            case 0:
                if (Double.doubleToRawLongBits(iog.c.s(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(iog.c.p(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (iog.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (iog.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (iog.d(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (iog.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (iog.d(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return iog.c.n(j2, obj);
            case 8:
                Object objH = iog.h(j2, obj);
                if (objH instanceof String) {
                    if (((String) objH).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objH instanceof xlg)) {
                    cva.s();
                    return false;
                }
                if (xlg.a.equals(objH)) {
                    return false;
                }
                return true;
            case 9:
                if (iog.h(j2, obj) != null) {
                    return true;
                }
                return false;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (xlg.a.equals(iog.h(j2, obj))) {
                    return false;
                }
                return true;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (iog.d(j2, obj) != 0) {
                    return true;
                }
                return false;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (iog.d(j2, obj) != 0) {
                    return true;
                }
                return false;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (iog.d(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (iog.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (iog.d(j2, obj) != 0) {
                    return true;
                }
                return false;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                if (iog.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (iog.h(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                cva.s();
                return false;
        }
    }

    public final void t(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        iog.e(j, obj, (1 << (i2 >>> 20)) | iog.d(j, obj));
    }

    public final boolean u(int i, Object obj, int i2) {
        return iog.d((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void v(int i, Object obj, int i2) {
        iog.e(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int w(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int y(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, defpackage.tlg r42) {
        /*
            Method dump skipped, instruction units count: 3680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qng.y(java.lang.Object, byte[], int, int, int, tlg):int");
    }
}

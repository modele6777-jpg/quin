package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a3h implements s3h {
    public static final int[] i = new int[0];
    public static final Unsafe j = s4h.d();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final dyg e;
    public final int[] f;
    public final int g;
    public final int h;

    public a3h(int[] iArr, Object[] objArr, int i2, int i3, dyg dygVar, int[] iArr2, int i4, int i5, mwg mwgVar, nwg nwgVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        this.f = iArr2;
        this.g = i4;
        this.h = i5;
        this.e = dygVar;
    }

    public static Field B(String str, Class cls) {
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
            StringBuilder sbO = ib8.o("Field ", str, " for ", name, " not found. Known fields are ");
            sbO.append(string);
            throw new RuntimeException(sbO.toString(), e);
        }
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof l0h) {
            return ((l0h) obj).h();
        }
        return true;
    }

    public static int s(long j2, Object obj) {
        return ((Integer) s4h.c(j2, obj)).intValue();
    }

    public static int u(int i2) {
        return (i2 >>> 20) & 255;
    }

    public static long w(long j2, Object obj) {
        return ((Long) s4h.c(j2, obj)).longValue();
    }

    public final Object A(int i2, Object obj, int i3) {
        s3h s3hVarY = y(i3);
        if (!q(i2, obj, i3)) {
            return s3hVarY.a();
        }
        Object object = j.getObject(obj, v(i3) & 1048575);
        if (p(object)) {
            return object;
        }
        l0h l0hVarA = s3hVarY.a();
        if (object != null) {
            s3hVarY.h(l0hVarA, object);
        }
        return l0hVarA;
    }

    @Override // defpackage.s3h
    public final l0h a() {
        return ((l0h) this.e).n();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081 A[SYNTHETIC] */
    @Override // defpackage.s3h
    public final void b(Object obj) {
        if (!p(obj)) {
            return;
        }
        if (obj instanceof l0h) {
            l0h l0hVar = (l0h) obj;
            l0hVar.g();
            l0hVar.zza = 0;
            l0hVar.e();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                l4h l4hVar = ((l0h) obj).zzc;
                if (l4hVar.e) {
                    l4hVar.e = false;
                    return;
                }
                return;
            }
            int iV = v(i2);
            int i3 = 1048575 & iV;
            int iU = u(iV);
            long j2 = i3;
            Unsafe unsafe = j;
            if (iU != 9) {
                if (iU != 60 && iU != 68) {
                    switch (iU) {
                        case 17:
                            if (n(i2, obj)) {
                                y(i2).b(unsafe.getObject(obj, j2));
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
                            fyg fygVar = (fyg) ((v0h) s4h.c(j2, obj));
                            if (fygVar.a) {
                                fygVar.a = false;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                ((k2h) object).c();
                                unsafe.putObject(obj, j2, object);
                            }
                            break;
                    }
                } else if (q(iArr[i2], obj, i2)) {
                    y(i2).b(unsafe.getObject(obj, j2));
                }
            } else if (n(i2, obj)) {
                y(i2).b(unsafe.getObject(obj, j2));
            }
            i2 += 3;
        }
    }

    @Override // defpackage.s3h
    public final boolean c(Object obj) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 1048575;
        while (i2 < this.g) {
            int i5 = this.f[i2];
            int iV = this.v(i5);
            int[] iArr = this.a;
            int i6 = iArr[i5 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 == i4) {
                i7 = i4;
            } else if (i7 != 1048575) {
                i3 = j.getInt(obj, i7);
            }
            int i9 = i3;
            a3h a3hVar = this;
            Object obj2 = obj;
            if ((268435456 & iV) == 0 || a3hVar.o(i5, i7, i9, i8, obj2)) {
                int iU = u(iV);
                if (iU != 9 && iU != 17) {
                    if (iU != 27) {
                        if (iU == 60 || iU == 68) {
                            if (!a3hVar.q(iArr[i5], obj2, i5) || a3hVar.y(i5).c(s4h.c(iV & 1048575, obj2))) {
                            }
                        } else if (iU != 49) {
                            if (iU == 50 && !((k2h) s4h.c(iV & 1048575, obj2)).isEmpty()) {
                                int i10 = i5 / 3;
                                throw ks0.e(a3hVar.b[i10 + i10]);
                            }
                        }
                        i2++;
                        this = a3hVar;
                        i4 = i7;
                        i3 = i9;
                        obj = obj2;
                    }
                    List list = (List) s4h.c(iV & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        s3h s3hVarY = a3hVar.y(i5);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (s3hVarY.c(list.get(i11))) {
                            }
                        }
                    }
                    i2++;
                    this = a3hVar;
                    i4 = i7;
                    i3 = i9;
                    obj = obj2;
                } else if (!a3hVar.o(i5, i7, i9, i8, obj2) || a3hVar.y(i5).c(s4h.c(iV & 1048575, obj2))) {
                    i2++;
                    this = a3hVar;
                    i4 = i7;
                    i3 = i9;
                    obj = obj2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.s3h
    public final void d(Object obj, g5b g5bVar) throws yyg {
        int i2;
        p90 p90Var = (p90) g5bVar.b;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                ((l0h) obj).zzc.d(g5bVar);
                return;
            }
            int iV = v(i5);
            int iU = u(iV);
            int i7 = iArr[i5];
            Unsafe unsafe = j;
            if (iU <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i2 = 0;
            }
            long j2 = iV & i3;
            int i10 = 3;
            switch (iU) {
                case 0:
                    if (o(i5, i4, i6, i2, obj)) {
                        p90Var.x0(i7, Double.doubleToRawLongBits(s4h.c.k(j2, obj)));
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (o(i5, i4, i6, i2, obj)) {
                        p90Var.v0(i7, Float.floatToRawIntBits(s4h.c.m(j2, obj)));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (o(i5, i4, i6, i2, obj)) {
                        p90Var.E0(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (o(i5, i4, i6, i2, obj)) {
                        p90Var.E0(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (o(i5, i4, i6, i2, obj)) {
                        p90Var.z0(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (o(i5, i4, i6, i2, obj)) {
                        p90Var.x0(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (o(i5, i4, i6, i2, obj)) {
                        p90Var.v0(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (o(i5, i4, i6, i2, obj)) {
                        boolean zT = s4h.c.t(j2, obj);
                        p90Var.D0(i7 << 3);
                        p90Var.t0(zT ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (o(i5, i4, i6, i2, obj)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            String str = (String) object;
                            p90Var.D0((i7 << 3) | 2);
                            byte[] bArr = (byte[]) p90Var.e;
                            int i11 = p90Var.c;
                            try {
                                int iG0 = p90.G0(str.length() * 3);
                                int iG1 = p90.G0(str.length());
                                if (iG1 == iG0) {
                                    int i12 = i11 + iG1;
                                    p90Var.c = i12;
                                    int iA = d5h.a(str, bArr, i12, bArr.length - i12);
                                    p90Var.c = i11;
                                    p90Var.D0((iA - i11) - iG1);
                                    p90Var.c = iA;
                                } else {
                                    int i13 = d5h.a;
                                    p90Var.D0(nk8.B(str));
                                    int i14 = p90Var.c;
                                    p90Var.c = d5h.a(str, bArr, i14, bArr.length - i14);
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new yyg("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
                            }
                        } else {
                            vyg vygVar = (vyg) object;
                            p90Var.D0((i7 << 3) | 2);
                            p90Var.D0(vygVar.d());
                            vygVar.i(p90Var);
                        }
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (o(i5, i4, i6, i2, obj)) {
                        g5bVar.t(i7, unsafe.getObject(obj, j2), y(i5));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (o(i5, i4, i6, i2, obj)) {
                        vyg vygVar2 = (vyg) unsafe.getObject(obj, j2);
                        p90Var.D0((i7 << 3) | 2);
                        p90Var.D0(vygVar2.d());
                        vygVar2.i(p90Var);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (o(i5, i4, i6, i2, obj)) {
                        p90Var.C0(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (o(i5, i4, i6, i2, obj)) {
                        p90Var.z0(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (o(i5, i4, i6, i2, obj)) {
                        p90Var.v0(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (o(i5, i4, i6, i2, obj)) {
                        p90Var.x0(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (o(i5, i4, i6, i2, obj)) {
                        int i15 = unsafe.getInt(obj, j2);
                        p90Var.C0(i7, (i15 >> 31) ^ (i15 + i15));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (o(i5, i4, i6, i2, obj)) {
                        long j3 = unsafe.getLong(obj, j2);
                        p90Var.E0(i7, (j3 >> 63) ^ (j3 + j3));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (o(i5, i4, i6, i2, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        p90Var.B0(i7, 3);
                        y(i5).d((dyg) object2, g5bVar);
                        p90Var.B0(i7, 4);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    v3h.q(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    v3h.u(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    v3h.w(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    v3h.d(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    v3h.v(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    v3h.t(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    v3h.s(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    v3h.p(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    int i16 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j2);
                    mwg mwgVar = v3h.a;
                    if (list != null && !list.isEmpty()) {
                        int i17 = 0;
                        while (i17 < list.size()) {
                            String str2 = (String) list.get(i17);
                            p90Var.D0((i16 << 3) | 2);
                            byte[] bArr2 = (byte[]) p90Var.e;
                            int i18 = p90Var.c;
                            try {
                                int iG2 = p90.G0(str2.length() * i10);
                                int iG3 = p90.G0(str2.length());
                                if (iG3 == iG2) {
                                    int i19 = i18 + iG3;
                                    p90Var.c = i19;
                                    int iA2 = d5h.a(str2, bArr2, i19, bArr2.length - i19);
                                    p90Var.c = i18;
                                    p90Var.D0((iA2 - i18) - iG3);
                                    p90Var.c = iA2;
                                } else {
                                    int i20 = d5h.a;
                                    p90Var.D0(nk8.B(str2));
                                    int i21 = p90Var.c;
                                    p90Var.c = d5h.a(str2, bArr2, i21, bArr2.length - i21);
                                }
                                i17++;
                                i10 = 3;
                            } catch (IndexOutOfBoundsException e2) {
                                throw new yyg("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
                            }
                        }
                    }
                    break;
                case 27:
                    int i22 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    s3h s3hVarY = y(i5);
                    mwg mwgVar2 = v3h.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            g5bVar.t(i22, list2.get(i23), s3hVarY);
                        }
                    }
                    break;
                case 28:
                    int i24 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    mwg mwgVar3 = v3h.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i25 = 0; i25 < list3.size(); i25++) {
                            vyg vygVar3 = (vyg) list3.get(i25);
                            p90Var.D0((i24 << 3) | 2);
                            p90Var.D0(vygVar3.d());
                            vygVar3.i(p90Var);
                        }
                    }
                    break;
                case 29:
                    v3h.c(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    v3h.r(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    v3h.x(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                    v3h.y(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    v3h.a(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    v3h.b(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 35:
                    v3h.q(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 36:
                    v3h.u(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 37:
                    v3h.w(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 38:
                    v3h.d(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 39:
                    v3h.v(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 40:
                    v3h.t(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 41:
                    v3h.s(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 42:
                    v3h.p(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 43:
                    v3h.c(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 44:
                    v3h.r(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 45:
                    v3h.x(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 46:
                    v3h.y(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 47:
                    v3h.a(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case z7c.f /* 48 */:
                    v3h.b(iArr[i5], (List) unsafe.getObject(obj, j2), g5bVar, true);
                    break;
                case 49:
                    int i26 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    s3h s3hVarY2 = y(i5);
                    mwg mwgVar4 = v3h.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            dyg dygVar = (dyg) list4.get(i27);
                            p90Var.B0(i26, 3);
                            s3hVarY2.d(dygVar, g5bVar);
                            p90Var.B0(i26, 4);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        int i28 = i5 / 3;
                        throw ks0.e(this.b[i28 + i28]);
                    }
                    break;
                case 51:
                    if (q(i7, obj, i5)) {
                        p90Var.x0(i7, Double.doubleToRawLongBits(((Double) s4h.c(j2, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (q(i7, obj, i5)) {
                        p90Var.v0(i7, Float.floatToRawIntBits(((Float) s4h.c(j2, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (q(i7, obj, i5)) {
                        p90Var.E0(i7, w(j2, obj));
                    }
                    break;
                case 54:
                    if (q(i7, obj, i5)) {
                        p90Var.E0(i7, w(j2, obj));
                    }
                    break;
                case 55:
                    if (q(i7, obj, i5)) {
                        p90Var.z0(i7, s(j2, obj));
                    }
                    break;
                case 56:
                    if (q(i7, obj, i5)) {
                        p90Var.x0(i7, w(j2, obj));
                    }
                    break;
                case 57:
                    if (q(i7, obj, i5)) {
                        p90Var.v0(i7, s(j2, obj));
                    }
                    break;
                case 58:
                    if (q(i7, obj, i5)) {
                        boolean zBooleanValue = ((Boolean) s4h.c(j2, obj)).booleanValue();
                        p90Var.D0(i7 << 3);
                        p90Var.t0(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (q(i7, obj, i5)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (!(object3 instanceof String)) {
                            vyg vygVar4 = (vyg) object3;
                            p90Var.D0((i7 << 3) | 2);
                            p90Var.D0(vygVar4.d());
                            vygVar4.i(p90Var);
                        } else {
                            String str3 = (String) object3;
                            p90Var.D0((i7 << 3) | 2);
                            byte[] bArr3 = (byte[]) p90Var.e;
                            int i29 = p90Var.c;
                            try {
                                int iG4 = p90.G0(str3.length() * 3);
                                int iG5 = p90.G0(str3.length());
                                if (iG5 == iG4) {
                                    int i30 = i29 + iG5;
                                    p90Var.c = i30;
                                    int iA3 = d5h.a(str3, bArr3, i30, bArr3.length - i30);
                                    p90Var.c = i29;
                                    p90Var.D0((iA3 - i29) - iG5);
                                    p90Var.c = iA3;
                                } else {
                                    int i31 = d5h.a;
                                    p90Var.D0(nk8.B(str3));
                                    int i32 = p90Var.c;
                                    p90Var.c = d5h.a(str3, bArr3, i32, bArr3.length - i32);
                                }
                            } catch (IndexOutOfBoundsException e3) {
                                throw new yyg("CodedOutputStream was writing to a flat byte array and ran out of space.", e3);
                            }
                        }
                    }
                    break;
                case 60:
                    if (q(i7, obj, i5)) {
                        g5bVar.t(i7, unsafe.getObject(obj, j2), y(i5));
                    }
                    break;
                case 61:
                    if (q(i7, obj, i5)) {
                        vyg vygVar5 = (vyg) unsafe.getObject(obj, j2);
                        p90Var.D0((i7 << 3) | 2);
                        p90Var.D0(vygVar5.d());
                        vygVar5.i(p90Var);
                    }
                    break;
                case 62:
                    if (q(i7, obj, i5)) {
                        p90Var.C0(i7, s(j2, obj));
                    }
                    break;
                case 63:
                    if (q(i7, obj, i5)) {
                        p90Var.z0(i7, s(j2, obj));
                    }
                    break;
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    if (q(i7, obj, i5)) {
                        p90Var.v0(i7, s(j2, obj));
                    }
                    break;
                case 65:
                    if (q(i7, obj, i5)) {
                        p90Var.x0(i7, w(j2, obj));
                    }
                    break;
                case 66:
                    if (q(i7, obj, i5)) {
                        int iS = s(j2, obj);
                        p90Var.C0(i7, (iS >> 31) ^ (iS + iS));
                    }
                    break;
                case 67:
                    if (q(i7, obj, i5)) {
                        long jW = w(j2, obj);
                        p90Var.E0(i7, (jW >> 63) ^ (jW + jW));
                    }
                    break;
                case 68:
                    if (q(i7, obj, i5)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        p90Var.B0(i7, 3);
                        y(i5).d((dyg) object4, g5bVar);
                        p90Var.B0(i7, 4);
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
    }

    @Override // defpackage.s3h
    public final void e(Object obj, byte[] bArr, int i2, int i3, tlg tlgVar) {
        r(obj, bArr, i2, i3, 0, tlgVar);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0366  */
    /* JADX WARN: Code duplicated, block: B:191:0x048a  */
    /* JADX WARN: Code duplicated, block: B:223:0x057b  */
    /* JADX WARN: Code duplicated, block: B:226:0x0589  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    @Override // defpackage.s3h
    public final int f(dyg dygVar) {
        int i2;
        int iG0;
        int iH0;
        int iG1;
        int iB;
        int iG2;
        int iC;
        int i3;
        int iG3;
        int iH;
        int i4;
        int iC2;
        int iG4;
        int size;
        int iN;
        int iG5;
        int iG6;
        int iB2;
        int iG7;
        int size2;
        int iG8;
        int iC3;
        int iG9;
        int iH1;
        int iS;
        int iG10;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int iF = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                return ((l0h) dygVar).zzc.a() + iF;
            }
            int iV = v(i7);
            int iU = u(iV);
            int i9 = iArr[i7];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & i5;
            Unsafe unsafe = j;
            if (iU <= 17) {
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(dygVar, i11);
                    i6 = i11;
                }
                i2 = 1 << (i10 >>> 20);
            } else {
                i2 = 0;
            }
            int i12 = iV & i5;
            if (iU >= wzg.a.a()) {
                wzg.b.getClass();
            }
            long j2 = i12;
            switch (iU) {
                case 0:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        iF = xkg.f(i9 << 3, 8, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        iF = xkg.f(i9 << 3, 4, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        long j3 = unsafe.getLong(dygVar, j2);
                        iG0 = p90.G0(i9 << 3);
                        iH0 = p90.H0(j3);
                        iH = iH0 + iG0;
                        iF += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        long j4 = unsafe.getLong(dygVar, j2);
                        iG0 = p90.G0(i9 << 3);
                        iH0 = p90.H0(j4);
                        iH = iH0 + iG0;
                        iF += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        long j5 = unsafe.getInt(dygVar, j2);
                        iG0 = p90.G0(i9 << 3);
                        iH0 = p90.H0(j5);
                        iH = iH0 + iG0;
                        iF += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        iF = xkg.f(i9 << 3, 8, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        iF = xkg.f(i9 << 3, 4, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        iF = xkg.f(i9 << 3, 1, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(dygVar, j2);
                        if (object instanceof vyg) {
                            iG1 = p90.G0(i13);
                            iB = ((vyg) object).d();
                        } else {
                            iG1 = p90.G0(i13);
                            int i14 = d5h.a;
                            iB = nk8.B((String) object);
                        }
                        iF = xkg.g(iB, iB, iG1, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        Object object2 = unsafe.getObject(dygVar, j2);
                        s3h s3hVarY = y(i7);
                        mwg mwgVar = v3h.a;
                        iG2 = p90.G0(i9 << 3);
                        iC = ((dyg) object2).c(s3hVarY);
                        iF = xkg.g(iC, iC, iG2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        vyg vygVar = (vyg) unsafe.getObject(dygVar, j2);
                        iG1 = p90.G0(i9 << 3);
                        iB = vygVar.d();
                        iF = xkg.g(iB, iB, iG1, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        i3 = unsafe.getInt(dygVar, j2);
                        iG3 = p90.G0(i9 << 3);
                        iF = xkg.f(i3, iG3, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        long j6 = unsafe.getInt(dygVar, j2);
                        iG0 = p90.G0(i9 << 3);
                        iH0 = p90.H0(j6);
                        iH = iH0 + iG0;
                        iF += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        iF = xkg.f(i9 << 3, 4, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        iF = xkg.f(i9 << 3, 8, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        int i15 = unsafe.getInt(dygVar, j2);
                        iG3 = p90.G0(i9 << 3);
                        i3 = (i15 >> 31) ^ (i15 + i15);
                        iF = xkg.f(i3, iG3, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        long j7 = unsafe.getLong(dygVar, j2);
                        iG0 = p90.G0(i9 << 3);
                        iH0 = p90.H0((j7 >> 63) ^ (j7 + j7));
                        iH = iH0 + iG0;
                        iF += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (o(i7, i6, i8, i2, dygVar)) {
                        dyg dygVar2 = (dyg) unsafe.getObject(dygVar, j2);
                        s3h s3hVarY2 = y(i7);
                        mwg mwgVar2 = v3h.a;
                        int iG11 = p90.G0(i9 << 3);
                        i4 = iG11 + iG11;
                        iC2 = dygVar2.c(s3hVarY2);
                        iH = iC2 + i4;
                        iF += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    iH = v3h.h(i9, (List) unsafe.getObject(dygVar, j2));
                    iF += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 19:
                    iH = v3h.g(i9, (List) unsafe.getObject(dygVar, j2));
                    iF += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar3 = v3h.a;
                    if (list.size() == 0) {
                        iG4 = 0;
                    } else {
                        iG4 = (p90.G0(i9 << 3) * list.size()) + v3h.j(list);
                    }
                    iF += iG4;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar4 = v3h.a;
                    size = list2.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iN = v3h.n(list2);
                        iG5 = p90.G0(i9 << 3);
                        iG6 = (iG5 * size) + iN;
                    }
                    iF += iG6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar5 = v3h.a;
                    size = list3.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iN = v3h.i(list3);
                        iG5 = p90.G0(i9 << 3);
                        iG6 = (iG5 * size) + iN;
                    }
                    iF += iG6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    iH = v3h.h(i9, (List) unsafe.getObject(dygVar, j2));
                    iF += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    iH = v3h.g(i9, (List) unsafe.getObject(dygVar, j2));
                    iF += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar6 = v3h.a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iG4 = 0;
                    } else {
                        iG4 = (p90.G0(i9 << 3) + 1) * size3;
                    }
                    iF += iG4;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar7 = v3h.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iG6 = 0;
                    } else {
                        iG6 = p90.G0(i9 << 3) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof vyg) {
                                iB2 = ((vyg) obj).d();
                            } else {
                                int i17 = d5h.a;
                                iB2 = nk8.B((String) obj);
                            }
                            iG6 = xkg.f(iB2, iB2, iG6);
                        }
                    }
                    iF += iG6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(dygVar, j2);
                    s3h s3hVarY3 = y(i7);
                    mwg mwgVar8 = v3h.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iG7 = 0;
                    } else {
                        iG7 = p90.G0(i9 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            int iC4 = ((dyg) list6.get(i18)).c(s3hVarY3);
                            iG7 = xkg.f(iC4, iC4, iG7);
                        }
                    }
                    iF += iG7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar9 = v3h.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iG6 = 0;
                    } else {
                        iG6 = p90.G0(i9 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int iD = ((vyg) list7.get(i19)).d();
                            iG6 = xkg.f(iD, iD, iG6);
                        }
                    }
                    iF += iG6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar10 = v3h.a;
                    size = list8.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iN = v3h.m(list8);
                        iG5 = p90.G0(i9 << 3);
                        iG6 = (iG5 * size) + iN;
                    }
                    iF += iG6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar11 = v3h.a;
                    size = list9.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iN = v3h.f(list9);
                        iG5 = p90.G0(i9 << 3);
                        iG6 = (iG5 * size) + iN;
                    }
                    iF += iG6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 31:
                    iH = v3h.g(i9, (List) unsafe.getObject(dygVar, j2));
                    iF += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                    iH = v3h.h(i9, (List) unsafe.getObject(dygVar, j2));
                    iF += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar12 = v3h.a;
                    size = list10.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iN = v3h.k(list10);
                        iG5 = p90.G0(i9 << 3);
                        iG6 = (iG5 * size) + iN;
                    }
                    iF += iG6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar13 = v3h.a;
                    size = list11.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iN = v3h.l(list11);
                        iG5 = p90.G0(i9 << 3);
                        iG6 = (iG5 * size) + iN;
                    }
                    iF += iG6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar14 = v3h.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar15 = v3h.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    size2 = v3h.j((List) unsafe.getObject(dygVar, j2));
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    size2 = v3h.n((List) unsafe.getObject(dygVar, j2));
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    size2 = v3h.i((List) unsafe.getObject(dygVar, j2));
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar16 = v3h.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar17 = v3h.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar18 = v3h.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    size2 = v3h.m((List) unsafe.getObject(dygVar, j2));
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    size2 = v3h.f((List) unsafe.getObject(dygVar, j2));
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar19 = v3h.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(dygVar, j2);
                    mwg mwgVar20 = v3h.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    size2 = v3h.k((List) unsafe.getObject(dygVar, j2));
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case z7c.f /* 48 */:
                    size2 = v3h.l((List) unsafe.getObject(dygVar, j2));
                    if (size2 > 0) {
                        iG8 = p90.G0(i9 << 3);
                        iF = xkg.g(size2, iG8, size2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(dygVar, j2);
                    s3h s3hVarY4 = y(i7);
                    mwg mwgVar21 = v3h.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iC3 = 0;
                    } else {
                        iC3 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            dyg dygVar3 = (dyg) list19.get(i20);
                            int iG12 = p90.G0(i9 << 3);
                            iC3 += dygVar3.c(s3hVarY4) + iG12 + iG12;
                        }
                    }
                    iF += iC3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    int i21 = i7 / 3;
                    k2h k2hVar = (k2h) unsafe.getObject(dygVar, j2);
                    if (this.b[i21 + i21] != null) {
                        r3.f();
                        return 0;
                    }
                    if (k2hVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = k2hVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (q(i9, dygVar, i7)) {
                        iF = xkg.f(i9 << 3, 8, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (q(i9, dygVar, i7)) {
                        iF = xkg.f(i9 << 3, 4, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (q(i9, dygVar, i7)) {
                        long jW = w(j2, dygVar);
                        iG9 = p90.G0(i9 << 3);
                        iH1 = p90.H0(jW);
                        iF += iH1 + iG9;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (q(i9, dygVar, i7)) {
                        long jW2 = w(j2, dygVar);
                        iG9 = p90.G0(i9 << 3);
                        iH1 = p90.H0(jW2);
                        iF += iH1 + iG9;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (q(i9, dygVar, i7)) {
                        long jS = s(j2, dygVar);
                        iG9 = p90.G0(i9 << 3);
                        iH1 = p90.H0(jS);
                        iF += iH1 + iG9;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (q(i9, dygVar, i7)) {
                        iF = xkg.f(i9 << 3, 8, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (q(i9, dygVar, i7)) {
                        iF = xkg.f(i9 << 3, 4, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (q(i9, dygVar, i7)) {
                        iF = xkg.f(i9 << 3, 1, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (q(i9, dygVar, i7)) {
                        int i22 = i9 << 3;
                        Object object3 = unsafe.getObject(dygVar, j2);
                        if (object3 instanceof vyg) {
                            iG2 = p90.G0(i22);
                            iC = ((vyg) object3).d();
                        } else {
                            iG2 = p90.G0(i22);
                            int i23 = d5h.a;
                            iC = nk8.B((String) object3);
                        }
                        iF = xkg.g(iC, iC, iG2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (q(i9, dygVar, i7)) {
                        Object object4 = unsafe.getObject(dygVar, j2);
                        s3h s3hVarY5 = y(i7);
                        mwg mwgVar22 = v3h.a;
                        iG2 = p90.G0(i9 << 3);
                        iC = ((dyg) object4).c(s3hVarY5);
                        iF = xkg.g(iC, iC, iG2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (q(i9, dygVar, i7)) {
                        vyg vygVar2 = (vyg) unsafe.getObject(dygVar, j2);
                        iG2 = p90.G0(i9 << 3);
                        iC = vygVar2.d();
                        iF = xkg.g(iC, iC, iG2, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (q(i9, dygVar, i7)) {
                        iS = s(j2, dygVar);
                        iG10 = p90.G0(i9 << 3);
                        iF = xkg.f(iS, iG10, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (q(i9, dygVar, i7)) {
                        long jS2 = s(j2, dygVar);
                        iG9 = p90.G0(i9 << 3);
                        iH1 = p90.H0(jS2);
                        iF += iH1 + iG9;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    if (q(i9, dygVar, i7)) {
                        iF = xkg.f(i9 << 3, 4, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (q(i9, dygVar, i7)) {
                        iF = xkg.f(i9 << 3, 8, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (q(i9, dygVar, i7)) {
                        int iS2 = s(j2, dygVar);
                        iG10 = p90.G0(i9 << 3);
                        iS = (iS2 >> 31) ^ (iS2 + iS2);
                        iF = xkg.f(iS, iG10, iF);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (q(i9, dygVar, i7)) {
                        long jW3 = w(j2, dygVar);
                        iG9 = p90.G0(i9 << 3);
                        iH1 = p90.H0((jW3 >> 63) ^ (jW3 + jW3));
                        iF += iH1 + iG9;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (q(i9, dygVar, i7)) {
                        dyg dygVar4 = (dyg) unsafe.getObject(dygVar, j2);
                        s3h s3hVarY6 = y(i7);
                        mwg mwgVar23 = v3h.a;
                        int iG13 = p90.G0(i9 << 3);
                        i4 = iG13 + iG13;
                        iC2 = dygVar4.c(s3hVarY6);
                        iH = iC2 + i4;
                        iF += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.s3h
    public final boolean g(l0h l0hVar, l0h l0hVar2) {
        boolean zE;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int iV = v(i2);
                int iU = u(iV);
                if (iU <= 50 || iU >= 69) {
                    long j2 = iV & 1048575;
                    switch (iU) {
                        case 0:
                            if (m(l0hVar, l0hVar2, i2)) {
                                vff vffVar = s4h.c;
                                if (Double.doubleToLongBits(vffVar.k(j2, l0hVar)) != Double.doubleToLongBits(vffVar.k(j2, l0hVar2))) {
                                }
                            }
                            break;
                        case 1:
                            if (m(l0hVar, l0hVar2, i2)) {
                                vff vffVar2 = s4h.c;
                                if (Float.floatToIntBits(vffVar2.m(j2, l0hVar)) != Float.floatToIntBits(vffVar2.m(j2, l0hVar2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!m(l0hVar, l0hVar2, i2) || s4h.b(j2, l0hVar) != s4h.b(j2, l0hVar2)) {
                            }
                            break;
                        case 3:
                            if (!m(l0hVar, l0hVar2, i2) || s4h.b(j2, l0hVar) != s4h.b(j2, l0hVar2)) {
                            }
                            break;
                        case 4:
                            if (!m(l0hVar, l0hVar2, i2) || s4h.a(j2, l0hVar) != s4h.a(j2, l0hVar2)) {
                            }
                            break;
                        case 5:
                            if (!m(l0hVar, l0hVar2, i2) || s4h.b(j2, l0hVar) != s4h.b(j2, l0hVar2)) {
                            }
                            break;
                        case 6:
                            if (!m(l0hVar, l0hVar2, i2) || s4h.a(j2, l0hVar) != s4h.a(j2, l0hVar2)) {
                            }
                            break;
                        case 7:
                            if (m(l0hVar, l0hVar2, i2)) {
                                vff vffVar3 = s4h.c;
                                if (vffVar3.t(j2, l0hVar) != vffVar3.t(j2, l0hVar2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!m(l0hVar, l0hVar2, i2) || !v3h.e(s4h.c(j2, l0hVar), s4h.c(j2, l0hVar2))) {
                            }
                            break;
                        case 9:
                            if (!m(l0hVar, l0hVar2, i2) || !v3h.e(s4h.c(j2, l0hVar), s4h.c(j2, l0hVar2))) {
                            }
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            if (!m(l0hVar, l0hVar2, i2) || !v3h.e(s4h.c(j2, l0hVar), s4h.c(j2, l0hVar2))) {
                            }
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            if (!m(l0hVar, l0hVar2, i2) || s4h.a(j2, l0hVar) != s4h.a(j2, l0hVar2)) {
                            }
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            if (!m(l0hVar, l0hVar2, i2) || s4h.a(j2, l0hVar) != s4h.a(j2, l0hVar2)) {
                            }
                            break;
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            if (!m(l0hVar, l0hVar2, i2) || s4h.a(j2, l0hVar) != s4h.a(j2, l0hVar2)) {
                            }
                            break;
                        case 14:
                            if (!m(l0hVar, l0hVar2, i2) || s4h.b(j2, l0hVar) != s4h.b(j2, l0hVar2)) {
                            }
                            break;
                        case 15:
                            if (!m(l0hVar, l0hVar2, i2) || s4h.a(j2, l0hVar) != s4h.a(j2, l0hVar2)) {
                            }
                            break;
                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                            if (!m(l0hVar, l0hVar2, i2) || s4h.b(j2, l0hVar) != s4h.b(j2, l0hVar2)) {
                            }
                            break;
                        case 17:
                            if (!m(l0hVar, l0hVar2, i2) || !v3h.e(s4h.c(j2, l0hVar), s4h.c(j2, l0hVar2))) {
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
                            zE = v3h.e(s4h.c(j2, l0hVar), s4h.c(j2, l0hVar2));
                            if (zE) {
                            }
                            break;
                        case 50:
                            zE = v3h.e(s4h.c(j2, l0hVar), s4h.c(j2, l0hVar2));
                            if (zE) {
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
                            long j3 = iArr[i2 + 2] & 1048575;
                            if (s4h.a(j3, l0hVar) == s4h.a(j3, l0hVar2) && v3h.e(s4h.c(j2, l0hVar), s4h.c(j2, l0hVar2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i2 += 3;
            } else {
                int i3 = this.h;
                while (true) {
                    int[] iArr2 = this.f;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j4 = iArr[i4 + 2] & 1048575;
                        if (s4h.a(j4, l0hVar) != s4h.a(j4, l0hVar2)) {
                            return false;
                        }
                        if (!q(0, l0hVar, i4)) {
                            long jV = v(i4) & 1048575;
                            if (!v3h.e(s4h.c(jV, l0hVar), s4h.c(jV, l0hVar2))) {
                            }
                        }
                        i3++;
                    } else if (l0hVar.zzc.equals(l0hVar2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.s3h
    public final void h(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            qc0.j("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                v3h.o(obj, obj2);
                return;
            }
            int iV = v(i2);
            int i3 = iV & 1048575;
            int iU = u(iV);
            int i4 = iArr[i2];
            long j2 = i3;
            switch (iU) {
                case 0:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vff vffVar = s4h.c;
                        vffVar.q(obj3, j2, vffVar.k(j2, obj2));
                        l(i2, obj3);
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vff vffVar2 = s4h.c;
                        vffVar2.r(obj3, j2, vffVar2.m(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.c.b.putLong(obj3, j2, s4h.b(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.c.b.putLong(obj3, j2, s4h.b(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.g(j2, obj3, s4h.a(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.c.b.putLong(obj3, j2, s4h.b(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.g(j2, obj3, s4h.a(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vff vffVar3 = s4h.c;
                        vffVar3.o(obj3, j2, vffVar3.t(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.h(j2, obj3, s4h.c(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    j(i2, obj3, obj2);
                    continue;
                    i2 += 3;
                    obj = obj3;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.h(j2, obj3, s4h.c(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.g(j2, obj3, s4h.a(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.g(j2, obj3, s4h.a(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.g(j2, obj3, s4h.a(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.c.b.putLong(obj3, j2, s4h.b(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        s4h.g(j2, obj3, s4h.a(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (n(i2, obj2)) {
                        obj3 = obj;
                        s4h.c.b.putLong(obj3, j2, s4h.b(j2, obj2));
                        l(i2, obj3);
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 17:
                    j(i2, obj, obj2);
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
                    v0h v0hVarU = (v0h) s4h.c(j2, obj);
                    v0h v0hVar = (v0h) s4h.c(j2, obj2);
                    int size = v0hVarU.size();
                    int size2 = v0hVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!((fyg) v0hVarU).a) {
                            v0hVarU = v0hVarU.u(size2 + size);
                        }
                        v0hVarU.addAll(v0hVar);
                    }
                    if (size > 0) {
                        v0hVar = v0hVarU;
                    }
                    s4h.h(j2, obj, v0hVar);
                    break;
                case 50:
                    mwg mwgVar = v3h.a;
                    s4h.h(j2, obj, fdc.x(s4h.c(j2, obj), s4h.c(j2, obj2)));
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
                    if (q(i4, obj2, i2)) {
                        s4h.h(j2, obj, s4h.c(j2, obj2));
                        s4h.g(iArr[i2 + 2] & 1048575, obj, i4);
                    }
                    break;
                case 60:
                    k(i2, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (q(i4, obj2, i2)) {
                        s4h.h(j2, obj, s4h.c(j2, obj2));
                        s4h.g(iArr[i2 + 2] & 1048575, obj, i4);
                    }
                    break;
                case 68:
                    k(i2, obj, obj2);
                    break;
            }
            obj3 = obj;
            i2 += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.s3h
    public final int i(l0h l0hVar) {
        int i2;
        long jDoubleToLongBits;
        int i3;
        int iFloatToIntBits;
        int i4;
        int i5;
        int iHashCode = 0;
        for (int i6 = 0; i6 < this.a.length; i6 += 3) {
            int iV = v(i6);
            int iU = u(iV);
            if (iU <= 50 || iU >= 69) {
                long j2 = iV & 1048575;
                int iHashCode2 = 37;
                switch (iU) {
                    case 0:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(s4h.c.k(j2, l0hVar));
                        byte[] bArr = y0h.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 1:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(s4h.c.m(j2, l0hVar));
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 2:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = s4h.b(j2, l0hVar);
                        byte[] bArr2 = y0h.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 3:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = s4h.b(j2, l0hVar);
                        byte[] bArr3 = y0h.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 4:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = s4h.a(j2, l0hVar);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 5:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = s4h.b(j2, l0hVar);
                        byte[] bArr4 = y0h.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 6:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = s4h.a(j2, l0hVar);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 7:
                        i2 = iHashCode * 53;
                        boolean zT = s4h.c.t(j2, l0hVar);
                        byte[] bArr5 = y0h.a;
                        i4 = zT ? 1231 : 1237;
                        iHashCode = i2 + i4;
                        break;
                    case 8:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = ((String) s4h.c(j2, l0hVar)).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 9:
                        i5 = iHashCode * 53;
                        Object objC = s4h.c(j2, l0hVar);
                        if (objC != null) {
                            iHashCode2 = objC.hashCode();
                        }
                        iHashCode = i5 + iHashCode2;
                        break;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = s4h.c(j2, l0hVar).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = s4h.a(j2, l0hVar);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = s4h.a(j2, l0hVar);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = s4h.a(j2, l0hVar);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 14:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = s4h.b(j2, l0hVar);
                        byte[] bArr6 = y0h.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 15:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = s4h.a(j2, l0hVar);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = s4h.b(j2, l0hVar);
                        byte[] bArr7 = y0h.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 17:
                        i5 = iHashCode * 53;
                        Object objC2 = s4h.c(j2, l0hVar);
                        if (objC2 != null) {
                            iHashCode2 = objC2.hashCode();
                        }
                        iHashCode = i5 + iHashCode2;
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
                        i3 = iHashCode * 53;
                        iFloatToIntBits = s4h.c(j2, l0hVar).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 50:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = s4h.c(j2, l0hVar).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i7 = this.h;
        while (true) {
            int[] iArr = this.f;
            if (i7 >= iArr.length) {
                return l0hVar.zzc.hashCode() + (iHashCode * 53);
            }
            int i8 = iArr[i7];
            if (!q(0, l0hVar, i8)) {
                iHashCode = s4h.c(v(i8) & 1048575, l0hVar).hashCode() + (iHashCode * 53);
            }
            i7++;
        }
    }

    public final void j(int i2, Object obj, Object obj2) {
        if (n(i2, obj2)) {
            long jV = v(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i2] + " is present but null: " + obj2.toString());
            }
            s3h s3hVarY = y(i2);
            if (!n(i2, obj)) {
                if (p(object)) {
                    l0h l0hVarA = s3hVarY.a();
                    s3hVarY.h(l0hVarA, object);
                    unsafe.putObject(obj, jV, l0hVarA);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                l(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!p(object2)) {
                l0h l0hVarA2 = s3hVarY.a();
                s3hVarY.h(l0hVarA2, object2);
                unsafe.putObject(obj, jV, l0hVarA2);
                object2 = l0hVarA2;
            }
            s3hVarY.h(object2, object);
        }
    }

    public final void k(int i2, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (q(i3, obj2, i2)) {
            long jV = v(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2.toString());
            }
            s3h s3hVarY = y(i2);
            if (!q(i3, obj, i2)) {
                if (p(object)) {
                    l0h l0hVarA = s3hVarY.a();
                    s3hVarY.h(l0hVarA, object);
                    unsafe.putObject(obj, jV, l0hVarA);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                s4h.g(iArr[i2 + 2] & 1048575, obj, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!p(object2)) {
                l0h l0hVarA2 = s3hVarY.a();
                s3hVarY.h(l0hVarA2, object2);
                unsafe.putObject(obj, jV, l0hVarA2);
                object2 = l0hVarA2;
            }
            s3hVarY.h(object2, object);
        }
    }

    public final void l(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        s4h.g(j2, obj, (1 << (i3 >>> 20)) | s4h.a(j2, obj));
    }

    public final boolean m(l0h l0hVar, l0h l0hVar2, int i2) {
        return n(i2, l0hVar) == n(i2, l0hVar2);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean n(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            if (((1 << (i3 >>> 20)) & s4h.a(j2, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iV = v(i2);
        long j3 = iV & 1048575;
        switch (u(iV)) {
            case 0:
                if (Double.doubleToRawLongBits(s4h.c.k(j3, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(s4h.c.m(j3, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (s4h.b(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (s4h.b(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (s4h.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (s4h.b(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (s4h.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return s4h.c.t(j3, obj);
            case 8:
                Object objC = s4h.c(j3, obj);
                if (objC instanceof String) {
                    if (((String) objC).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objC instanceof vyg)) {
                    cva.s();
                    return false;
                }
                if (vyg.a.equals(objC)) {
                    return false;
                }
                return true;
            case 9:
                if (s4h.c(j3, obj) != null) {
                    return true;
                }
                return false;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (vyg.a.equals(s4h.c(j3, obj))) {
                    return false;
                }
                return true;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (s4h.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (s4h.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (s4h.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (s4h.b(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (s4h.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                if (s4h.b(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (s4h.c(j3, obj) != null) {
                    return true;
                }
                return false;
            default:
                cva.s();
                return false;
        }
    }

    public final boolean o(int i2, int i3, int i4, int i5, Object obj) {
        if (i3 == 1048575) {
            return n(i2, obj);
        }
        return (i4 & i5) != 0;
    }

    public final boolean q(int i2, Object obj, int i3) {
        return s4h.a((long) (this.a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:102:0x02b7 A[LOOP:14: B:99:0x02b1->B:102:0x02b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:120:0x0302  */
    /* JADX WARN: Code duplicated, block: B:122:0x0312  */
    /* JADX WARN: Code duplicated, block: B:124:0x031c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x031e  */
    /* JADX WARN: Code duplicated, block: B:126:0x031f A[PHI: r3
  0x031f: PHI (r3v57 byte) = (r3v34 byte), (r3v66 byte) binds: [B:123:0x031a, B:125:0x031e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0323 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0325  */
    /* JADX WARN: Code duplicated, block: B:130:0x0326 A[PHI: r3
  0x0326: PHI (r3v58 byte) = (r3v57 byte), (r3v65 byte) binds: [B:127:0x0321, B:129:0x0325] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x032c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0351  */
    /* JADX WARN: Code duplicated, block: B:140:0x0357  */
    /* JADX WARN: Code duplicated, block: B:142:0x0369  */
    /* JADX WARN: Code duplicated, block: B:524:0x0cf0 A[PHI: r1 r4 r6 r9 r12 r21
  0x0cf0: PHI (r1v82 byte[]) = (r1v81 byte[]), (r1v83 byte[]) binds: [B:526:0x0cfe, B:511:0x0cb7] A[DONT_GENERATE, DONT_INLINE]
  0x0cf0: PHI (r4v103 int) = (r4v102 int), (r4v104 int) binds: [B:526:0x0cfe, B:511:0x0cb7] A[DONT_GENERATE, DONT_INLINE]
  0x0cf0: PHI (r6v82 tlg) = (r6v81 tlg), (r6v83 tlg) binds: [B:526:0x0cfe, B:511:0x0cb7] A[DONT_GENERATE, DONT_INLINE]
  0x0cf0: PHI (r9v64 int) = (r9v63 int), (r9v65 int) binds: [B:526:0x0cfe, B:511:0x0cb7] A[DONT_GENERATE, DONT_INLINE]
  0x0cf0: PHI (r12v22 int) = (r12v21 int), (r12v23 int) binds: [B:526:0x0cfe, B:511:0x0cb7] A[DONT_GENERATE, DONT_INLINE]
  0x0cf0: PHI (r21v35 int) = (r21v34 int), (r21v36 int) binds: [B:526:0x0cfe, B:511:0x0cb7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:550:0x0de6 A[PHI: r1 r4 r6 r9 r12 r17 r21
  0x0de6: PHI (r1v111 byte[]) = 
  (r1v75 byte[])
  (r1v76 byte[])
  (r1v77 byte[])
  (r1v78 byte[])
  (r1v79 byte[])
  (r1v80 byte[])
  (r1v82 byte[])
  (r1v85 byte[])
  (r1v93 byte[])
  (r1v101 byte[])
  (r1v112 byte[])
 binds: [B:548:0x0dcf, B:545:0x0dab, B:542:0x0d8b, B:539:0x0d6b, B:536:0x0d4b, B:533:0x0d2a, B:524:0x0cf0, B:509:0x0ca0, B:488:0x0bf1, B:483:0x0bc0, B:474:0x0b40] A[DONT_GENERATE, DONT_INLINE]
  0x0de6: PHI (r4v118 int) = 
  (r4v96 int)
  (r4v97 int)
  (r4v98 int)
  (r4v99 int)
  (r4v100 int)
  (r4v101 int)
  (r4v103 int)
  (r4v105 int)
  (r4v109 int)
  (r4v114 int)
  (r4v119 int)
 binds: [B:548:0x0dcf, B:545:0x0dab, B:542:0x0d8b, B:539:0x0d6b, B:536:0x0d4b, B:533:0x0d2a, B:524:0x0cf0, B:509:0x0ca0, B:488:0x0bf1, B:483:0x0bc0, B:474:0x0b40] A[DONT_GENERATE, DONT_INLINE]
  0x0de6: PHI (r6v97 tlg) = 
  (r6v75 tlg)
  (r6v76 tlg)
  (r6v77 tlg)
  (r6v78 tlg)
  (r6v79 tlg)
  (r6v80 tlg)
  (r6v82 tlg)
  (r6v84 tlg)
  (r6v88 tlg)
  (r6v93 tlg)
  (r6v98 tlg)
 binds: [B:548:0x0dcf, B:545:0x0dab, B:542:0x0d8b, B:539:0x0d6b, B:536:0x0d4b, B:533:0x0d2a, B:524:0x0cf0, B:509:0x0ca0, B:488:0x0bf1, B:483:0x0bc0, B:474:0x0b40] A[DONT_GENERATE, DONT_INLINE]
  0x0de6: PHI (r9v91 int) = 
  (r9v57 int)
  (r9v58 int)
  (r9v59 int)
  (r9v60 int)
  (r9v61 int)
  (r9v62 int)
  (r9v64 int)
  (r9v67 int)
  (r9v75 int)
  (r9v82 int)
  (r9v92 int)
 binds: [B:548:0x0dcf, B:545:0x0dab, B:542:0x0d8b, B:539:0x0d6b, B:536:0x0d4b, B:533:0x0d2a, B:524:0x0cf0, B:509:0x0ca0, B:488:0x0bf1, B:483:0x0bc0, B:474:0x0b40] A[DONT_GENERATE, DONT_INLINE]
  0x0de6: PHI (r12v39 int) = 
  (r12v15 int)
  (r12v16 int)
  (r12v17 int)
  (r12v18 int)
  (r12v19 int)
  (r12v20 int)
  (r12v22 int)
  (r12v24 int)
  (r12v32 int)
  (r12v36 int)
  (r12v40 int)
 binds: [B:548:0x0dcf, B:545:0x0dab, B:542:0x0d8b, B:539:0x0d6b, B:536:0x0d4b, B:533:0x0d2a, B:524:0x0cf0, B:509:0x0ca0, B:488:0x0bf1, B:483:0x0bc0, B:474:0x0b40] A[DONT_GENERATE, DONT_INLINE]
  0x0de6: PHI (r17v53 l4h) = 
  (r17v29 l4h)
  (r17v30 l4h)
  (r17v31 l4h)
  (r17v32 l4h)
  (r17v33 l4h)
  (r17v34 l4h)
  (r17v36 l4h)
  (r17v42 l4h)
  (r17v46 l4h)
  (r17v50 l4h)
  (r17v54 l4h)
 binds: [B:548:0x0dcf, B:545:0x0dab, B:542:0x0d8b, B:539:0x0d6b, B:536:0x0d4b, B:533:0x0d2a, B:524:0x0cf0, B:509:0x0ca0, B:488:0x0bf1, B:483:0x0bc0, B:474:0x0b40] A[DONT_GENERATE, DONT_INLINE]
  0x0de6: PHI (r21v49 int) = 
  (r21v28 int)
  (r21v29 int)
  (r21v30 int)
  (r21v31 int)
  (r21v32 int)
  (r21v33 int)
  (r21v35 int)
  (r21v37 int)
  (r21v40 int)
  (r21v45 int)
  (r21v50 int)
 binds: [B:548:0x0dcf, B:545:0x0dab, B:542:0x0d8b, B:539:0x0d6b, B:536:0x0d4b, B:533:0x0d2a, B:524:0x0cf0, B:509:0x0ca0, B:488:0x0bf1, B:483:0x0bc0, B:474:0x0b40] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:552:0x0de9  */
    /* JADX WARN: Code duplicated, block: B:554:0x0dfa  */
    /* JADX WARN: Code duplicated, block: B:556:0x0e01 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:561:0x0e18  */
    /* JADX WARN: Code duplicated, block: B:640:0x0ac9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x034b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0ada A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x02a2  */
    public final int r(Object obj, byte[] bArr, int i2, int i3, int i4, tlg tlgVar) {
        int i5;
        int[] iArr;
        Object[] objArr;
        Object obj2;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int iU;
        byte[] bArr2;
        l0h l0hVar;
        l4h l4hVarB;
        int i10;
        byte[] bArr3;
        int i11;
        int i12;
        tlg tlgVar2;
        Unsafe unsafe2;
        tlg tlgVar3;
        Object obj3;
        Unsafe unsafe3;
        int iV;
        int i13;
        int i14;
        int i15;
        byte b;
        byte b2;
        int i16;
        int i17;
        byte b3;
        int i18;
        byte b4;
        int i19;
        byte b5;
        byte[] bArr4;
        tlg tlgVar4;
        Object obj4;
        Unsafe unsafe4;
        Unsafe unsafe5;
        int i20;
        int i21;
        l4h l4hVar;
        int i22;
        int i23;
        int i24;
        int i25;
        byte[] bArr5;
        int i26;
        int iQ;
        int i27;
        l4h l4hVar2;
        int iV2;
        Unsafe unsafe6;
        l4h l4hVar3;
        int i28;
        int i29;
        int i30;
        int iT;
        String str;
        int i31;
        int i32;
        l4h l4hVar4;
        int i33;
        int iV3;
        int i34;
        l4h l4hVar5;
        int i35;
        int iX;
        v0h v0hVar;
        int i36;
        uxg uxgVar;
        l4h l4hVarB2;
        Unsafe unsafe7;
        int i37;
        l4h l4hVar6;
        int i38;
        a3h a3hVar = this;
        Object obj5 = obj;
        byte[] bArr6 = bArr;
        i3 = i3;
        tlgVar = tlgVar;
        if (!p(obj5)) {
            qc0.j("Mutating immutable message: ".concat(String.valueOf(obj5)));
            return 0;
        }
        int iS = i2;
        int i39 = -1;
        int iT2 = 0;
        int i40 = 1048575;
        int i41 = 0;
        int i42 = 0;
        while (true) {
            Object[] objArr2 = a3hVar.b;
            int[] iArr2 = a3hVar.a;
            Unsafe unsafe8 = j;
            if (iS < i3) {
                int iW = iS + 1;
                int i43 = bArr6[iS];
                if (i43 < 0) {
                    iW = r8c.w(i43, bArr6, iW, tlgVar);
                    i43 = tlgVar.a;
                }
                int i44 = iW;
                i42 = i43;
                int i45 = (i42 == true ? 1 : 0) >>> 3;
                int i46 = a3hVar.d;
                int i47 = a3hVar.c;
                iT2 = i45 > i39 ? (i45 < i47 || i45 > i46) ? -1 : a3hVar.t(i45, iT2 / 3) : (i45 < i47 || i45 > i46) ? -1 : a3hVar.t(i45, 0);
                l4h l4hVar7 = l4h.f;
                if (iT2 == -1) {
                    l4hVar7 = l4hVar7;
                    i6 = i44;
                    i5 = i40;
                    i7 = i41;
                    iArr = iArr2;
                    objArr = objArr2;
                    iT2 = 0;
                    i8 = i45;
                    obj2 = obj5;
                    unsafe = unsafe8;
                    i9 = i42 == true ? 1 : 0;
                } else {
                    int i48 = (i42 == true ? 1 : 0) & 7;
                    int i49 = iArr2[iT2 + 1];
                    int iU2 = u(i49);
                    long j2 = i49 & 1048575;
                    Unsafe unsafe9 = j;
                    String str2 = "";
                    if (iU2 <= 17) {
                        int i50 = iArr2[iT2 + 2];
                        int i51 = 1 << (i50 >>> 20);
                        int i52 = i50 & 1048575;
                        iArr = iArr2;
                        if (i52 != i40) {
                            int i53 = 1048575;
                            if (i40 != 1048575) {
                                unsafe8.putInt(obj5, i40, i41);
                                i53 = 1048575;
                            }
                            int i54 = i52 == i53 ? 0 : unsafe8.getInt(obj5, i52);
                            i10 = i52;
                            i41 = i54;
                        } else {
                            i10 = i40;
                        }
                        switch (iU2) {
                            case 0:
                                bArr3 = bArr;
                                i11 = i44;
                                i41 = i41;
                                i12 = i10;
                                i8 = i45;
                                tlgVar2 = tlgVar;
                                l4hVar7 = l4hVar7;
                                unsafe2 = unsafe8;
                                if (i48 == 1) {
                                    s4h.c.q(obj5, j2, Double.longBitsToDouble(r8c.B(bArr3, i11)));
                                    iS = i11 + 8;
                                    i39 = i8;
                                    tlgVar = tlgVar2;
                                    bArr6 = bArr3;
                                    i41 |= i51;
                                    i40 = i12;
                                } else {
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4 || i4 == 0) {
                                        l0hVar = (l0h) obj2;
                                        l4hVarB = l0hVar.zzc;
                                        if (l4hVarB == l4hVar7) {
                                            l4hVarB = l4h.b();
                                            l0hVar.zzc = l4hVarB;
                                        }
                                        l4h l4hVar8 = l4hVarB;
                                        byte[] bArr7 = bArr2;
                                        int i55 = i9;
                                        iU = r8c.u(i55 == true ? 1 : 0, bArr7, i6, i3, l4hVar8, tlgVar);
                                        bArr6 = bArr;
                                        tlgVar = tlgVar;
                                        i42 = i55 == true ? 1 : 0;
                                        i3 = i3;
                                        obj5 = obj2;
                                        i39 = i8;
                                        i41 = i7;
                                        i40 = i5;
                                        iS = iU;
                                        a3hVar = this;
                                    } else {
                                        i3 = i3;
                                        iS = i6;
                                        i42 = i9;
                                        i41 = i7;
                                    }
                                }
                                break;
                            case 1:
                                bArr3 = bArr;
                                i11 = i44;
                                i41 = i41;
                                i12 = i10;
                                i8 = i45;
                                tlgVar2 = tlgVar;
                                l4hVar7 = l4hVar7;
                                unsafe2 = unsafe8;
                                if (i48 == 5) {
                                    iS = i11 + 4;
                                    s4h.c.r(obj5, j2, Float.intBitsToFloat(r8c.r(bArr3, i11)));
                                    i39 = i8;
                                    tlgVar = tlgVar2;
                                    i40 = i12;
                                    i41 |= i51;
                                    bArr6 = bArr3;
                                    i42 = i42;
                                } else {
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar9 = l4hVarB;
                                    byte[] bArr8 = bArr2;
                                    int i56 = i9;
                                    iU = r8c.u(i56 == true ? 1 : 0, bArr8, i6, i3, l4hVar9, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i56 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            case 2:
                            case 3:
                                i41 = i41;
                                i8 = i45;
                                bArr3 = bArr;
                                unsafe5 = unsafe8;
                                i11 = i44;
                                i12 = i10;
                                tlgVar2 = tlgVar;
                                if (i48 == 0) {
                                    int iY = r8c.y(bArr3, i11, tlgVar2);
                                    unsafe5.putLong(obj5, j2, tlgVar2.b);
                                    iS = iY;
                                    i39 = i8;
                                    tlgVar = tlgVar2;
                                    bArr6 = bArr3;
                                    i40 = i12;
                                    i42 = i42;
                                    i41 |= i51;
                                    iT2 = iT2;
                                } else {
                                    unsafe2 = unsafe5;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar10 = l4hVarB;
                                    byte[] bArr9 = bArr2;
                                    int i57 = i9;
                                    iU = r8c.u(i57 == true ? 1 : 0, bArr9, i6, i3, l4hVar10, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i57 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            case 4:
                            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                i41 = i41;
                                i8 = i45;
                                bArr3 = bArr;
                                unsafe5 = unsafe8;
                                i11 = i44;
                                i12 = i10;
                                tlgVar2 = tlgVar;
                                if (i48 == 0) {
                                    int iV4 = r8c.v(bArr3, i11, tlgVar2);
                                    unsafe5.putInt(obj5, j2, tlgVar2.a);
                                    iS = iV4;
                                    i39 = i8;
                                    iT2 = iT2;
                                    tlgVar = tlgVar2;
                                    bArr6 = bArr3;
                                    i40 = i12;
                                    i42 = i42;
                                    i41 |= i51;
                                    i3 = i3;
                                } else {
                                    unsafe2 = unsafe5;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar11 = l4hVarB;
                                    byte[] bArr10 = bArr2;
                                    int i58 = i9;
                                    iU = r8c.u(i58 == true ? 1 : 0, bArr10, i6, i3, l4hVar11, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i58 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr3 = bArr;
                                tlgVar3 = tlgVar;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i11 = i44;
                                i12 = i10;
                                i41 = i41;
                                i8 = i45;
                                if (i48 == 1) {
                                    obj5 = obj3;
                                    unsafe3.putLong(obj5, j2, r8c.B(bArr3, i11));
                                    i3 = i3;
                                    iS = i11 + 8;
                                    i39 = i8;
                                    iT2 = iT2;
                                    tlgVar = tlgVar3;
                                    bArr6 = bArr3;
                                    i41 |= i51;
                                    i40 = i12;
                                    i42 = i42;
                                } else {
                                    tlgVar2 = tlgVar3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar12 = l4hVarB;
                                    byte[] bArr11 = bArr2;
                                    int i59 = i9;
                                    iU = r8c.u(i59 == true ? 1 : 0, bArr11, i6, i3, l4hVar12, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i59 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            case 6:
                            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                bArr3 = bArr;
                                tlgVar3 = tlgVar;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i11 = i44;
                                i12 = i10;
                                i41 = i41;
                                i8 = i45;
                                if (i48 == 5) {
                                    int i60 = i11 + 4;
                                    unsafe3.putInt(obj3, j2, r8c.r(bArr3, i11));
                                    i41 |= i51;
                                    i39 = i8;
                                    i3 = i3;
                                    tlgVar = tlgVar3;
                                    iS = i60;
                                    obj5 = obj3;
                                    iT2 = iT2;
                                    bArr6 = bArr3;
                                    i40 = i12;
                                    i42 = i42;
                                } else {
                                    tlgVar2 = tlgVar3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar13 = l4hVarB;
                                    byte[] bArr12 = bArr2;
                                    int i510 = i9;
                                    iU = r8c.u(i510 == true ? 1 : 0, bArr12, i6, i3, l4hVar13, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i510 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            case 7:
                                bArr3 = bArr;
                                tlgVar3 = tlgVar;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i11 = i44;
                                i12 = i10;
                                i41 = i41;
                                i8 = i45;
                                if (i48 == 0) {
                                    int i61 = i41 | i51;
                                    int iY2 = r8c.y(bArr3, i11, tlgVar3);
                                    s4h.c.o(obj3, j2, tlgVar3.b != 0);
                                    tlgVar = tlgVar3;
                                    iS = iY2;
                                    i39 = i8;
                                    bArr6 = bArr3;
                                    i41 = i61;
                                    obj5 = obj3;
                                    i40 = i12;
                                } else {
                                    tlgVar2 = tlgVar3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar14 = l4hVarB;
                                    byte[] bArr13 = bArr2;
                                    int i511 = i9;
                                    iU = r8c.u(i511 == true ? 1 : 0, bArr13, i6, i3, l4hVar14, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i511 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            case 8:
                                bArr3 = bArr;
                                tlgVar3 = tlgVar;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i11 = i44;
                                i12 = i10;
                                i41 = i41;
                                i8 = i45;
                                if (i48 == 2) {
                                    if ((i49 & 536870912) != 0) {
                                        int i62 = i41 | i51;
                                        int iV5 = r8c.v(bArr3, i11, tlgVar3);
                                        int i63 = tlgVar3.a;
                                        if (i63 < 0) {
                                            s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        if (i63 == 0) {
                                            tlgVar3.c = "";
                                            i14 = i62;
                                        } else {
                                            int i64 = d5h.a;
                                            int length = bArr3.length;
                                            if ((((length - iV5) - i63) | iV5 | i63) < 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iV5), Integer.valueOf(i63)));
                                            }
                                            int i65 = iV5 + i63;
                                            char[] cArr = new char[i63];
                                            int i66 = 0;
                                            while (iV5 < i65) {
                                                byte b6 = bArr3[iV5];
                                                if (b6 >= 0) {
                                                    iV5++;
                                                    cArr[i66] = (char) b6;
                                                    i66++;
                                                } else {
                                                    while (iV5 < i65) {
                                                        i15 = iV5 + 1;
                                                        i62 = i62;
                                                        b = bArr3[iV5];
                                                        if (b >= 0) {
                                                            cArr[i66] = (char) b;
                                                            i66++;
                                                            iV5 = i15;
                                                            while (iV5 < i65) {
                                                                b2 = bArr3[iV5];
                                                                if (b2 >= 0) {
                                                                    iV5++;
                                                                    cArr[i66] = (char) b2;
                                                                    i66++;
                                                                } else {
                                                                    i62 = i62;
                                                                }
                                                            }
                                                            i62 = i62;
                                                        } else {
                                                            i16 = iV5;
                                                            if (b >= -32) {
                                                                if (b < -16) {
                                                                    i17 = i65;
                                                                    if (i15 < i17 - 2) {
                                                                        s8f.o("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    b3 = bArr3[i15];
                                                                    int i67 = i16 + 3;
                                                                    byte b7 = bArr3[i16 + 2];
                                                                    int i68 = i16 + 4;
                                                                    byte b8 = bArr3[i67];
                                                                    if (!iec.r(b3)) {
                                                                        if ((((b3 + 112) + (b << 28)) >> 30) != 0 && !iec.r(b7) && !iec.r(b8)) {
                                                                            int i69 = ((b & 7) << 18) | ((b3 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                                                                            cArr[i66] = (char) ((i69 >>> 10) + 55232);
                                                                            cArr[i66 + 1] = (char) ((i69 & 1023) + 56320);
                                                                            i66 += 2;
                                                                            iV5 = i68;
                                                                        }
                                                                    }
                                                                    s8f.o("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                if (i15 < i65 - 1) {
                                                                    s8f.o("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                i18 = i66 + 1;
                                                                int i70 = i16 + 2;
                                                                b4 = bArr3[i15];
                                                                i19 = i16 + 3;
                                                                b5 = bArr3[i70];
                                                                if (!iec.r(b4)) {
                                                                    i17 = i65;
                                                                    if (b != -32) {
                                                                        if (b != -19) {
                                                                            if (!iec.r(b5)) {
                                                                                cArr[i66] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iV5 = i19;
                                                                                i66 = i18;
                                                                            }
                                                                        } else if (b4 < -96) {
                                                                            b = -19;
                                                                            if (!iec.r(b5)) {
                                                                                cArr[i66] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iV5 = i19;
                                                                                i66 = i18;
                                                                            }
                                                                        }
                                                                    } else if (b4 >= -96) {
                                                                        b = -32;
                                                                        if (b != -19) {
                                                                            if (!iec.r(b5)) {
                                                                                cArr[i66] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iV5 = i19;
                                                                                i66 = i18;
                                                                            }
                                                                        } else if (b4 < -96) {
                                                                            b = -19;
                                                                            if (!iec.r(b5)) {
                                                                                cArr[i66] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iV5 = i19;
                                                                                i66 = i18;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                s8f.o("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                                i65 = i17;
                                                            } else {
                                                                if (i15 < i65) {
                                                                    s8f.o("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                int i71 = i66 + 1;
                                                                int i72 = i16 + 2;
                                                                byte b9 = bArr3[i15];
                                                                if (b >= -62 || iec.r(b9)) {
                                                                    s8f.o("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                cArr[i66] = (char) (((b & 31) << 6) | (b9 & 63));
                                                                i62 = i62;
                                                                iV5 = i72;
                                                                i66 = i71;
                                                            }
                                                        }
                                                    }
                                                    i14 = i62;
                                                    int i73 = i65;
                                                    str2 = new String(cArr, 0, i66);
                                                    tlgVar3.c = str2;
                                                    iV5 = i73;
                                                }
                                            }
                                            while (iV5 < i65) {
                                                i15 = iV5 + 1;
                                                i62 = i62;
                                                b = bArr3[iV5];
                                                if (b >= 0) {
                                                    cArr[i66] = (char) b;
                                                    i66++;
                                                    iV5 = i15;
                                                    while (iV5 < i65) {
                                                        b2 = bArr3[iV5];
                                                        if (b2 >= 0) {
                                                            iV5++;
                                                            cArr[i66] = (char) b2;
                                                            i66++;
                                                        } else {
                                                            i62 = i62;
                                                        }
                                                    }
                                                    i62 = i62;
                                                } else {
                                                    i16 = iV5;
                                                    if (b >= -32) {
                                                        if (i15 < i65) {
                                                            s8f.o("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        int i74 = i66 + 1;
                                                        int i75 = i16 + 2;
                                                        byte b10 = bArr3[i15];
                                                        if (b >= -62) {
                                                        }
                                                        s8f.o("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    if (b < -16) {
                                                        i17 = i65;
                                                        if (i15 < i17 - 2) {
                                                            s8f.o("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        b3 = bArr3[i15];
                                                        int i610 = i16 + 3;
                                                        byte b11 = bArr3[i16 + 2];
                                                        int i611 = i16 + 4;
                                                        byte b12 = bArr3[i610];
                                                        if (!iec.r(b3)) {
                                                            if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                                                            }
                                                        }
                                                        s8f.o("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    if (i15 < i65 - 1) {
                                                        s8f.o("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    i18 = i66 + 1;
                                                    int i76 = i16 + 2;
                                                    b4 = bArr3[i15];
                                                    i19 = i16 + 3;
                                                    b5 = bArr3[i76];
                                                    if (!iec.r(b4)) {
                                                        i17 = i65;
                                                        if (b != -32) {
                                                            if (b != -19) {
                                                                if (!iec.r(b5)) {
                                                                    cArr[i66] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iV5 = i19;
                                                                    i66 = i18;
                                                                }
                                                            } else if (b4 < -96) {
                                                                b = -19;
                                                                if (!iec.r(b5)) {
                                                                    cArr[i66] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iV5 = i19;
                                                                    i66 = i18;
                                                                }
                                                            }
                                                        } else if (b4 >= -96) {
                                                            b = -32;
                                                            if (b != -19) {
                                                                if (!iec.r(b5)) {
                                                                    cArr[i66] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iV5 = i19;
                                                                    i66 = i18;
                                                                }
                                                            } else if (b4 < -96) {
                                                                b = -19;
                                                                if (!iec.r(b5)) {
                                                                    cArr[i66] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iV5 = i19;
                                                                    i66 = i18;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    s8f.o("Protocol message had invalid UTF-8.");
                                                    return 0;
                                                    i65 = i17;
                                                }
                                            }
                                            i14 = i62;
                                            int i77 = i65;
                                            str2 = new String(cArr, 0, i66);
                                            tlgVar3.c = str2;
                                            iV5 = i77;
                                        }
                                        i13 = i14;
                                        iV = iV5;
                                    } else {
                                        iV = r8c.v(bArr3, i11, tlgVar3);
                                        int i78 = tlgVar3.a;
                                        if (i78 < 0) {
                                            s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        i13 = i41 | i51;
                                        if (i78 == 0) {
                                            tlgVar3.c = "";
                                        } else {
                                            str2 = new String(bArr3, iV, i78, StandardCharsets.UTF_8);
                                            tlgVar3.c = str2;
                                            iV += i78;
                                        }
                                    }
                                    unsafe3.putObject(obj3, j2, str2);
                                    obj5 = obj3;
                                    i39 = i8;
                                    i40 = i12;
                                    i41 = i13;
                                    tlgVar = tlgVar3;
                                    iS = iV;
                                    bArr6 = bArr3;
                                    i42 = i42;
                                } else {
                                    tlgVar2 = tlgVar3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar15 = l4hVarB;
                                    byte[] bArr14 = bArr2;
                                    int i512 = i9;
                                    iU = r8c.u(i512 == true ? 1 : 0, bArr14, i6, i3, l4hVar15, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i512 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            case 9:
                                Object obj6 = obj5;
                                unsafe3 = unsafe8;
                                i11 = i44;
                                i12 = i10;
                                if (i48 == 2) {
                                    i41 |= i51;
                                    Object objZ = a3hVar.z(iT2, obj6);
                                    tlgVar = tlgVar;
                                    int iA = r8c.A(objZ, a3hVar.y(iT2), bArr, i11, i3, tlgVar);
                                    unsafe9.putObject(obj, a3hVar.v(iT2) & 1048575, objZ);
                                    a3hVar.l(iT2, obj);
                                    iS = iA;
                                    obj5 = obj;
                                    bArr6 = bArr;
                                    i39 = i45;
                                    i40 = i12;
                                    i42 = i42;
                                } else {
                                    obj3 = obj6;
                                    bArr3 = bArr;
                                    tlgVar2 = tlgVar;
                                    i41 = i41;
                                    i8 = i45;
                                    l4hVar7 = l4hVar7;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar16 = l4hVarB;
                                    byte[] bArr15 = bArr2;
                                    int i513 = i9;
                                    iU = r8c.u(i513 == true ? 1 : 0, bArr15, i6, i3, l4hVar16, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i513 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                bArr4 = bArr;
                                tlgVar4 = tlgVar;
                                obj4 = obj5;
                                unsafe4 = unsafe8;
                                i11 = i44;
                                i12 = i10;
                                if (i48 == 2) {
                                    i41 |= i51;
                                    int iQ2 = r8c.q(bArr4, i11, tlgVar4);
                                    unsafe4.putObject(obj4, j2, tlgVar4.c);
                                    obj5 = obj4;
                                    iS = iQ2;
                                    bArr6 = bArr4;
                                    tlgVar = tlgVar4;
                                    i39 = i45;
                                    i40 = i12;
                                    i42 = i42;
                                } else {
                                    tlgVar2 = tlgVar4;
                                    i8 = i45;
                                    l4hVar7 = l4hVar7;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar17 = l4hVarB;
                                    byte[] bArr16 = bArr2;
                                    int i514 = i9;
                                    iU = r8c.u(i514 == true ? 1 : 0, bArr16, i6, i3, l4hVar17, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i514 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                bArr4 = bArr;
                                tlgVar4 = tlgVar;
                                obj4 = obj5;
                                unsafe4 = unsafe8;
                                i11 = i44;
                                i12 = i10;
                                if (i48 == 0) {
                                    int iV6 = r8c.v(bArr4, i11, tlgVar4);
                                    int i79 = tlgVar4.a;
                                    uxg uxgVarX = a3hVar.x(iT2);
                                    if ((i49 & Integer.MIN_VALUE) == 0 || uxgVarX == null || uxgVarX.a(i79)) {
                                        i20 = i42;
                                        i41 |= i51;
                                        unsafe4.putInt(obj4, j2, i79);
                                    } else {
                                        l0h l0hVar2 = (l0h) obj4;
                                        l4h l4hVarB3 = l0hVar2.zzc;
                                        if (l4hVarB3 == l4hVar7) {
                                            l4hVarB3 = l4h.b();
                                            l0hVar2.zzc = l4hVarB3;
                                        }
                                        i20 = i42;
                                        l4hVarB3.c(i20 == true ? 1 : 0, Long.valueOf(i79));
                                    }
                                    obj5 = obj4;
                                    iS = iV6;
                                    bArr6 = bArr4;
                                    tlgVar = tlgVar4;
                                    i39 = i45;
                                    i40 = i12;
                                    i42 = i20;
                                    iT2 = iT2;
                                } else {
                                    tlgVar2 = tlgVar4;
                                    i8 = i45;
                                    l4hVar7 = l4hVar7;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar18 = l4hVarB;
                                    byte[] bArr17 = bArr2;
                                    int i515 = i9;
                                    iU = r8c.u(i515 == true ? 1 : 0, bArr17, i6, i3, l4hVar18, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i515 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                tlgVar4 = tlgVar;
                                obj4 = obj5;
                                unsafe4 = unsafe8;
                                i11 = i44;
                                if (i48 == 0) {
                                    i41 |= i51;
                                    int iV7 = r8c.v(bArr4, i11, tlgVar4);
                                    unsafe4.putInt(obj4, j2, z8c.n(tlgVar4.a));
                                    obj5 = obj4;
                                    iS = iV7;
                                    bArr6 = bArr4;
                                    iT2 = iT2;
                                    i40 = i10;
                                    tlgVar = tlgVar4;
                                    i39 = i45;
                                    i42 = i42;
                                } else {
                                    i12 = i10;
                                    tlgVar2 = tlgVar4;
                                    i8 = i45;
                                    l4hVar7 = l4hVar7;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar19 = l4hVarB;
                                    byte[] bArr18 = bArr2;
                                    int i516 = i9;
                                    iU = r8c.u(i516 == true ? 1 : 0, bArr18, i6, i3, l4hVar19, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i516 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                bArr4 = bArr;
                                tlgVar4 = tlgVar;
                                i11 = i44;
                                if (i48 == 0) {
                                    i41 |= i51;
                                    int iY3 = r8c.y(bArr4, i11, tlgVar4);
                                    long j3 = tlgVar4.b;
                                    unsafe8.putLong(obj5, j2, (-(j3 & 1)) ^ (j3 >>> 1));
                                    iS = iY3;
                                    bArr6 = bArr4;
                                    iT2 = iT2;
                                    i40 = i10;
                                    tlgVar = tlgVar4;
                                    i39 = i45;
                                    i42 = i42;
                                } else {
                                    i41 = i41;
                                    i12 = i10;
                                    tlgVar2 = tlgVar4;
                                    i8 = i45;
                                    l4hVar7 = l4hVar7;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe8;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar110 = l4hVarB;
                                    byte[] bArr19 = bArr2;
                                    int i517 = i9;
                                    iU = r8c.u(i517 == true ? 1 : 0, bArr19, i6, i3, l4hVar110, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i517 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                            default:
                                if (i48 == 3) {
                                    Object objZ2 = a3hVar.z(iT2, obj5);
                                    int iZ = r8c.z(objZ2, a3hVar.y(iT2), bArr, i44, i3, (i45 << 3) | 4, tlgVar);
                                    bArr4 = bArr;
                                    tlgVar4 = tlgVar;
                                    unsafe9.putObject(obj5, a3hVar.v(iT2) & 1048575, objZ2);
                                    a3hVar.l(iT2, obj5);
                                    i41 |= i51;
                                    iS = iZ;
                                    bArr6 = bArr4;
                                    iT2 = iT2;
                                    i40 = i10;
                                    tlgVar = tlgVar4;
                                    i39 = i45;
                                    i42 = i42;
                                } else {
                                    bArr3 = bArr;
                                    i41 = i41;
                                    i8 = i45;
                                    i11 = i44;
                                    l4hVar7 = l4hVar7;
                                    unsafe2 = unsafe8;
                                    i12 = i10;
                                    tlgVar2 = tlgVar;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT2 = iT2;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i41;
                                    i9 = i42;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    tlgVar = tlgVar2;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar111 = l4hVarB;
                                    byte[] bArr110 = bArr2;
                                    int i518 = i9;
                                    iU = r8c.u(i518 == true ? 1 : 0, bArr110, i6, i3, l4hVar111, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i518 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                    i40 = i5;
                                    iS = iU;
                                    a3hVar = this;
                                }
                                break;
                        }
                    } else {
                        iArr = iArr2;
                        i7 = i41;
                        i5 = i40;
                        if (iU2 != 27) {
                            obj2 = obj5;
                            i22 = i44;
                            if (iU2 <= 49) {
                                long j4 = i49;
                                v0h v0hVarU = (v0h) unsafe8.getObject(obj2, j2);
                                if (!((fyg) v0hVarU).a) {
                                    int size = v0hVarU.size();
                                    v0hVarU = v0hVarU.u(size + size);
                                    unsafe8.putObject(obj2, j2, v0hVarU);
                                }
                                v0h v0hVar2 = v0hVarU;
                                String str3 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                switch (iU2) {
                                    case 18:
                                    case 35:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        l4hVar3 = l4hVar7;
                                        i28 = i42 == true ? 1 : 0;
                                        if (i48 == 2) {
                                            r3.f();
                                            return 0;
                                        }
                                        if (i48 == 1) {
                                            r3.f();
                                            return 0;
                                        }
                                        iS = i22;
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                        break;
                                    case 19:
                                    case 36:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        l4hVar3 = l4hVar7;
                                        i28 = i42 == true ? 1 : 0;
                                        if (i48 == 2) {
                                            r3.f();
                                            return 0;
                                        }
                                        if (i48 == 5) {
                                            r3.f();
                                            return 0;
                                        }
                                        iS = i22;
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        l4hVar3 = l4hVar7;
                                        i28 = i42 == true ? 1 : 0;
                                        if (i48 == 2) {
                                            r3.f();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            r3.f();
                                            return 0;
                                        }
                                        iS = i22;
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        unsafe6 = unsafe8;
                                        i29 = i22;
                                        objArr = objArr2;
                                        l4hVar3 = l4hVar7;
                                        i30 = i42 == true ? 1 : 0;
                                        if (i48 != 2) {
                                            if (i48 == 0) {
                                                int iX2 = r8c.x(i30 == true ? 1 : 0, bArr, i29, i3, v0hVar2, tlgVar);
                                                i28 = i30 == true ? 1 : 0;
                                                i22 = i29;
                                                iS = iX2;
                                            }
                                            i28 = i30;
                                            i22 = i29;
                                            iS = i22;
                                            if (iS != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                tlgVar = tlgVar;
                                                obj5 = obj2;
                                                i42 = i28;
                                                iT2 = iT2;
                                                i41 = i7;
                                                i40 = i5;
                                                i39 = i45;
                                            } else {
                                                i6 = iS;
                                                i9 = i28;
                                                iT2 = iT2;
                                                l4hVar7 = l4hVar3;
                                                unsafe = unsafe6;
                                                i8 = i45;
                                            }
                                        } else {
                                            iT = r8c.t(bArr, i29, v0hVar2, tlgVar);
                                            i28 = i30;
                                            iS = iT;
                                            i22 = i29;
                                        }
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                    case 23:
                                    case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                    case 40:
                                    case 46:
                                        unsafe6 = unsafe8;
                                        i29 = i22;
                                        objArr = objArr2;
                                        l4hVar3 = l4hVar7;
                                        i30 = i42 == true ? 1 : 0;
                                        if (i48 == 2) {
                                            r3.f();
                                            return 0;
                                        }
                                        if (i48 == 1) {
                                            r3.f();
                                            return 0;
                                        }
                                        i28 = i30;
                                        i22 = i29;
                                        iS = i22;
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        unsafe6 = unsafe8;
                                        i29 = i22;
                                        objArr = objArr2;
                                        l4h l4hVar20 = l4hVar7;
                                        i30 = i42 == true ? 1 : 0;
                                        if (i48 != 2) {
                                            l4hVar3 = l4hVar20;
                                            if (i48 == 5) {
                                                iT = i29 + 4;
                                                n0h n0hVar = (n0h) v0hVar2;
                                                n0hVar.e(r8c.r(bArr, i29));
                                                while (iT < i3) {
                                                    int iV8 = r8c.v(bArr, iT, tlgVar);
                                                    if (i30 == tlgVar.a) {
                                                        n0hVar.e(r8c.r(bArr, iV8));
                                                        iT = iV8 + 4;
                                                    } else {
                                                        i28 = i30;
                                                        iS = iT;
                                                    }
                                                }
                                                i28 = i30;
                                                iS = iT;
                                            }
                                            i28 = i30;
                                            i22 = i29;
                                            iS = i22;
                                            if (iS != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                tlgVar = tlgVar;
                                                obj5 = obj2;
                                                i42 = i28;
                                                iT2 = iT2;
                                                i41 = i7;
                                                i40 = i5;
                                                i39 = i45;
                                            } else {
                                                i6 = iS;
                                                i9 = i28;
                                                iT2 = iT2;
                                                l4hVar7 = l4hVar3;
                                                unsafe = unsafe6;
                                                i8 = i45;
                                            }
                                        } else {
                                            n0h n0hVar2 = (n0h) v0hVar2;
                                            int iV9 = r8c.v(bArr, i29, tlgVar);
                                            int i80 = tlgVar.a;
                                            if (i80 < 0) {
                                                s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i80 > bArr.length - iV9) {
                                                s8f.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i81 = iV9 + i80;
                                            int i82 = n0hVar2.c + (i80 >> 2);
                                            int length2 = n0hVar2.b.length;
                                            if (i82 <= length2) {
                                                str = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                                i31 = iV9;
                                                l4hVar3 = l4hVar20;
                                            } else if (length2 != 0) {
                                                while (length2 < i82) {
                                                    length2 = xkg.d(length2, 3, 2, 1, 10);
                                                    str3 = str3;
                                                    iV9 = iV9;
                                                    l4hVar20 = l4hVar20;
                                                }
                                                str = str3;
                                                i31 = iV9;
                                                l4hVar3 = l4hVar20;
                                                n0hVar2.b = Arrays.copyOf(n0hVar2.b, length2);
                                            } else {
                                                str = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                                i31 = iV9;
                                                l4hVar3 = l4hVar20;
                                                n0hVar2.b = new int[Math.max(i82, 10)];
                                            }
                                            int i83 = i31;
                                            while (i83 < i81) {
                                                n0hVar2.e(r8c.r(bArr, i83));
                                                i83 += 4;
                                            }
                                            if (i83 != i81) {
                                                s8f.o(str);
                                                return 0;
                                            }
                                            i28 = i30 == true ? 1 : 0;
                                            iS = i83;
                                        }
                                        i22 = i29;
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        unsafe6 = unsafe8;
                                        i32 = i22;
                                        objArr = objArr2;
                                        l4hVar4 = l4hVar7;
                                        i33 = i42 == true ? 1 : 0;
                                        if (i48 == 2) {
                                            r3.f();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            r3.f();
                                            return 0;
                                        }
                                        i28 = i33;
                                        l4hVar3 = l4hVar4;
                                        i22 = i32;
                                        iS = i22;
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                        break;
                                    case 26:
                                        unsafe6 = unsafe8;
                                        i32 = i22;
                                        objArr = objArr2;
                                        l4hVar4 = l4hVar7;
                                        i33 = i42 == true ? 1 : 0;
                                        if (i48 == 2) {
                                            if ((j4 & 536870912) == 0) {
                                                iV3 = r8c.v(bArr, i32, tlgVar);
                                                int i84 = tlgVar.a;
                                                if (i84 < 0) {
                                                    s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i84 == 0) {
                                                    v0hVar2.add("");
                                                } else {
                                                    v0hVar2.add(new String(bArr, iV3, i84, StandardCharsets.UTF_8));
                                                    iV3 += i84;
                                                }
                                                while (iV3 < i3) {
                                                    int iV10 = r8c.v(bArr, iV3, tlgVar);
                                                    if (i33 == tlgVar.a) {
                                                        iV3 = r8c.v(bArr, iV10, tlgVar);
                                                        int i85 = tlgVar.a;
                                                        if (i85 < 0) {
                                                            s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i85 == 0) {
                                                            v0hVar2.add("");
                                                        } else {
                                                            v0hVar2.add(new String(bArr, iV3, i85, StandardCharsets.UTF_8));
                                                            iV3 += i85;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iV3 = r8c.v(bArr, i32, tlgVar);
                                                int i86 = tlgVar.a;
                                                if (i86 < 0) {
                                                    s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i86 == 0) {
                                                    v0hVar2.add("");
                                                } else {
                                                    int i87 = iV3 + i86;
                                                    if (!d5h.b(bArr, iV3, i87)) {
                                                        s8f.o("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    v0hVar2.add(new String(bArr, iV3, i86, StandardCharsets.UTF_8));
                                                    iV3 = i87;
                                                }
                                                while (iV3 < i3) {
                                                    int iV11 = r8c.v(bArr, iV3, tlgVar);
                                                    if (i33 == tlgVar.a) {
                                                        iV3 = r8c.v(bArr, iV11, tlgVar);
                                                        int i88 = tlgVar.a;
                                                        if (i88 < 0) {
                                                            s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i88 == 0) {
                                                            v0hVar2.add("");
                                                        } else {
                                                            int i89 = iV3 + i88;
                                                            if (!d5h.b(bArr, iV3, i89)) {
                                                                s8f.o("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            v0hVar2.add(new String(bArr, iV3, i88, StandardCharsets.UTF_8));
                                                            iV3 = i89;
                                                        }
                                                    }
                                                }
                                            }
                                            i28 = i33 == true ? 1 : 0;
                                            iS = iV3;
                                            l4hVar3 = l4hVar4;
                                            i22 = i32;
                                        } else {
                                            i28 = i33;
                                            l4hVar3 = l4hVar4;
                                            i22 = i32;
                                            iS = i22;
                                        }
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                    case 27:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        if (i48 == 2) {
                                            int iS2 = r8c.s(a3hVar.y(iT2), i42 == true ? 1 : 0, bArr, i22, i3, v0hVar2, tlgVar);
                                            i29 = i22;
                                            i28 = i42 == true ? 1 : 0;
                                            iS = iS2;
                                            l4hVar3 = l4hVar7;
                                            i22 = i29;
                                            if (iS != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                tlgVar = tlgVar;
                                                obj5 = obj2;
                                                i42 = i28;
                                                iT2 = iT2;
                                                i41 = i7;
                                                i40 = i5;
                                                i39 = i45;
                                            } else {
                                                i6 = iS;
                                                i9 = i28;
                                                iT2 = iT2;
                                                l4hVar7 = l4hVar3;
                                                unsafe = unsafe6;
                                                i8 = i45;
                                            }
                                        } else {
                                            i29 = i22;
                                            i28 = i42 == true ? 1 : 0;
                                            l4hVar3 = l4hVar7;
                                            i22 = i29;
                                            iS = i22;
                                            if (iS != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                tlgVar = tlgVar;
                                                obj5 = obj2;
                                                i42 = i28;
                                                iT2 = iT2;
                                                i41 = i7;
                                                i40 = i5;
                                                i39 = i45;
                                            } else {
                                                i6 = iS;
                                                i9 = i28;
                                                iT2 = iT2;
                                                l4hVar7 = l4hVar3;
                                                unsafe = unsafe6;
                                                i8 = i45;
                                            }
                                        }
                                        break;
                                    case 28:
                                        unsafe6 = unsafe8;
                                        i34 = i22;
                                        objArr = objArr2;
                                        l4hVar5 = l4hVar7;
                                        if (i48 == 2) {
                                            int iV12 = r8c.v(bArr, i34, tlgVar);
                                            int i90 = tlgVar.a;
                                            if (i90 < 0) {
                                                s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i90 > bArr.length - iV12) {
                                                s8f.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i90 == 0) {
                                                v0hVar2.add(vyg.a);
                                            } else {
                                                v0hVar2.add(vyg.m(bArr, iV12, i90));
                                                iV12 += i90;
                                            }
                                            while (iV12 < i3) {
                                                int iV13 = r8c.v(bArr, iV12, tlgVar);
                                                if (i42 == tlgVar.a) {
                                                    iV12 = r8c.v(bArr, iV13, tlgVar);
                                                    int i91 = tlgVar.a;
                                                    if (i91 < 0) {
                                                        s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i91 > bArr.length - iV12) {
                                                        s8f.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i91 == 0) {
                                                        v0hVar2.add(vyg.a);
                                                    } else {
                                                        v0hVar2.add(vyg.m(bArr, iV12, i91));
                                                        iV12 += i91;
                                                    }
                                                } else {
                                                    i28 = i42 == true ? 1 : 0;
                                                    i22 = i34;
                                                    iS = iV12;
                                                    l4hVar3 = l4hVar5;
                                                }
                                            }
                                            i28 = i42 == true ? 1 : 0;
                                            i22 = i34;
                                            iS = iV12;
                                            l4hVar3 = l4hVar5;
                                        } else {
                                            i28 = i42 == true ? 1 : 0;
                                            i22 = i34;
                                            l4hVar3 = l4hVar5;
                                            iS = i22;
                                        }
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        Unsafe unsafe10 = unsafe8;
                                        i34 = i22;
                                        l4hVar5 = l4hVar7;
                                        i28 = i42 == true ? 1 : 0;
                                        if (i48 == 2) {
                                            iX = r8c.t(bArr, i34, v0hVar2, tlgVar);
                                            i35 = i28 == true ? 1 : 0;
                                            v0hVar = v0hVar2;
                                        } else if (i48 != 0) {
                                            unsafe6 = unsafe10;
                                            objArr = objArr2;
                                            i22 = i34;
                                            l4hVar3 = l4hVar5;
                                            iS = i22;
                                            if (iS != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                tlgVar = tlgVar;
                                                obj5 = obj2;
                                                i42 = i28;
                                                iT2 = iT2;
                                                i41 = i7;
                                                i40 = i5;
                                                i39 = i45;
                                            } else {
                                                i6 = iS;
                                                i9 = i28;
                                                iT2 = iT2;
                                                l4hVar7 = l4hVar3;
                                                unsafe = unsafe6;
                                                i8 = i45;
                                            }
                                        } else {
                                            i35 = i28 == true ? 1 : 0;
                                            iX = r8c.x(i35 == true ? 1 : 0, bArr, i34, i3, v0hVar2, tlgVar);
                                            v0hVar = v0hVar2;
                                            i34 = i34;
                                        }
                                        uxg uxgVarX2 = a3hVar.x(iT2);
                                        mwg mwgVar = v3h.a;
                                        if (uxgVarX2 != null) {
                                            int size2 = v0hVar.size();
                                            i36 = iX;
                                            l4h l4hVar21 = null;
                                            int i92 = 0;
                                            int i93 = 0;
                                            while (i92 < size2) {
                                                Unsafe unsafe11 = unsafe10;
                                                Integer num = (Integer) v0hVar.get(i92);
                                                Object[] objArr3 = objArr2;
                                                int iIntValue = num.intValue();
                                                if (uxgVarX2.a(iIntValue)) {
                                                    if (i92 != i93) {
                                                        v0hVar.set(i93, num);
                                                    }
                                                    i93++;
                                                    uxgVar = uxgVarX2;
                                                    l4hVarB2 = l4hVar21;
                                                } else {
                                                    if (l4hVar21 == null) {
                                                        l0h l0hVar3 = (l0h) obj2;
                                                        uxgVar = uxgVarX2;
                                                        l4hVarB2 = l0hVar3.zzc;
                                                        if (l4hVarB2 == l4hVar5) {
                                                            l4hVarB2 = l4h.b();
                                                            l0hVar3.zzc = l4hVarB2;
                                                        }
                                                    } else {
                                                        uxgVar = uxgVarX2;
                                                        l4hVarB2 = l4hVar21;
                                                    }
                                                    l4hVarB2.c(i45 << 3, Long.valueOf(iIntValue));
                                                }
                                                i92++;
                                                l4hVar21 = l4hVarB2;
                                                uxgVarX2 = uxgVar;
                                                unsafe10 = unsafe11;
                                                objArr2 = objArr3;
                                            }
                                            unsafe6 = unsafe10;
                                            objArr = objArr2;
                                            if (i93 != size2) {
                                                v0hVar.subList(i93, size2).clear();
                                            }
                                        } else {
                                            i36 = iX;
                                            unsafe6 = unsafe10;
                                            objArr = objArr2;
                                        }
                                        i28 = i35;
                                        i22 = i34;
                                        l4hVar3 = l4hVar5;
                                        iS = i36;
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        unsafe7 = unsafe8;
                                        i37 = i22;
                                        l4hVar6 = l4hVar7;
                                        i28 = i42 == true ? 1 : 0;
                                        if (i48 != 2) {
                                            if (i48 == 0) {
                                                n0h n0hVar3 = (n0h) v0hVar2;
                                                iS = r8c.v(bArr, i37, tlgVar);
                                                n0hVar3.e(z8c.n(tlgVar.a));
                                                while (iS < i3) {
                                                    int iV14 = r8c.v(bArr, iS, tlgVar);
                                                    if (i28 == tlgVar.a) {
                                                        iS = r8c.v(bArr, iV14, tlgVar);
                                                        n0hVar3.e(z8c.n(tlgVar.a));
                                                    }
                                                }
                                            }
                                            i22 = i37;
                                            l4hVar3 = l4hVar6;
                                            unsafe6 = unsafe7;
                                            objArr = objArr2;
                                            iS = i22;
                                            if (iS != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                tlgVar = tlgVar;
                                                obj5 = obj2;
                                                i42 = i28;
                                                iT2 = iT2;
                                                i41 = i7;
                                                i40 = i5;
                                                i39 = i45;
                                            } else {
                                                i6 = iS;
                                                i9 = i28;
                                                iT2 = iT2;
                                                l4hVar7 = l4hVar3;
                                                unsafe = unsafe6;
                                                i8 = i45;
                                            }
                                        } else {
                                            n0h n0hVar4 = (n0h) v0hVar2;
                                            iS = r8c.v(bArr, i37, tlgVar);
                                            int i94 = tlgVar.a;
                                            if (i94 < 0) {
                                                s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i94 > bArr.length - iS) {
                                                s8f.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i95 = i94 + iS;
                                            while (iS < i95) {
                                                iS = r8c.v(bArr, iS, tlgVar);
                                                n0hVar4.e(z8c.n(tlgVar.a));
                                            }
                                            if (iS != i95) {
                                                s8f.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        }
                                        i22 = i37;
                                        l4hVar3 = l4hVar6;
                                        unsafe6 = unsafe7;
                                        objArr = objArr2;
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                    case 34:
                                    case z7c.f /* 48 */:
                                        unsafe7 = unsafe8;
                                        i37 = i22;
                                        l4hVar6 = l4hVar7;
                                        i28 = i42 == true ? 1 : 0;
                                        if (i48 == 2) {
                                            r3.f();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            r3.f();
                                            return 0;
                                        }
                                        i22 = i37;
                                        l4hVar3 = l4hVar6;
                                        unsafe6 = unsafe7;
                                        objArr = objArr2;
                                        iS = i22;
                                        if (iS != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            tlgVar = tlgVar;
                                            obj5 = obj2;
                                            i42 = i28;
                                            iT2 = iT2;
                                            i41 = i7;
                                            i40 = i5;
                                            i39 = i45;
                                        } else {
                                            i6 = iS;
                                            i9 = i28;
                                            iT2 = iT2;
                                            l4hVar7 = l4hVar3;
                                            unsafe = unsafe6;
                                            i8 = i45;
                                        }
                                        break;
                                        break;
                                    default:
                                        if (i48 == 3) {
                                            int i96 = ((i42 == true ? 1 : 0) & (-8)) | 4;
                                            s3h s3hVarY = a3hVar.y(iT2);
                                            int i97 = i22;
                                            l0h l0hVarA = s3hVarY.a();
                                            unsafe7 = unsafe8;
                                            l4hVar6 = l4hVar7;
                                            i28 = i42 == true ? 1 : 0;
                                            int iZ2 = r8c.z(l0hVarA, s3hVarY, bArr, i97, i3, i96, tlgVar);
                                            tlg tlgVar5 = tlgVar;
                                            s3hVarY.b(l0hVarA);
                                            tlgVar5.c = l0hVarA;
                                            v0hVar2.add(l0hVarA);
                                            while (true) {
                                                if (iZ2 < i3) {
                                                    int i98 = i97;
                                                    int iV15 = r8c.v(bArr, iZ2, tlgVar5);
                                                    if (i28 == tlgVar5.a) {
                                                        i38 = i96;
                                                        int i99 = i38;
                                                        l0h l0hVarA2 = s3hVarY.a();
                                                        iZ2 = r8c.z(l0hVarA2, s3hVarY, bArr, iV15, i3, i99, tlgVar);
                                                        i38 = i99;
                                                        tlgVar5 = tlgVar;
                                                        s3hVarY.b(l0hVarA2);
                                                        tlgVar5.c = l0hVarA2;
                                                        v0hVar2.add(l0hVarA2);
                                                        i97 = i98;
                                                    } else {
                                                        i38 = i96;
                                                        i97 = i98;
                                                    }
                                                } else {
                                                    i38 = i96;
                                                }
                                            }
                                            i22 = i97;
                                            iS = iZ2;
                                            l4hVar3 = l4hVar6;
                                            unsafe6 = unsafe7;
                                            objArr = objArr2;
                                            if (iS != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                tlgVar = tlgVar;
                                                obj5 = obj2;
                                                i42 = i28;
                                                iT2 = iT2;
                                                i41 = i7;
                                                i40 = i5;
                                                i39 = i45;
                                            } else {
                                                i6 = iS;
                                                i9 = i28;
                                                iT2 = iT2;
                                                l4hVar7 = l4hVar3;
                                                unsafe = unsafe6;
                                                i8 = i45;
                                            }
                                        } else {
                                            i22 = i22;
                                            unsafe6 = unsafe8;
                                            objArr = objArr2;
                                            l4hVar3 = l4hVar7;
                                            i28 = i42 == true ? 1 : 0;
                                            iS = i22;
                                            if (iS != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                tlgVar = tlgVar;
                                                obj5 = obj2;
                                                i42 = i28;
                                                iT2 = iT2;
                                                i41 = i7;
                                                i40 = i5;
                                                i39 = i45;
                                            } else {
                                                i6 = iS;
                                                i9 = i28;
                                                iT2 = iT2;
                                                l4hVar7 = l4hVar3;
                                                unsafe = unsafe6;
                                                i8 = i45;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                i21 = i45;
                                objArr = objArr2;
                                l4hVar = l4hVar7;
                                i23 = i42 == true ? 1 : 0;
                                unsafe = unsafe8;
                                if (iU2 != 50) {
                                    int i100 = iT2 + 2;
                                    long j5 = iArr[i100] & 1048575;
                                    switch (iU2) {
                                        case 51:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            l4hVar7 = l4hVar;
                                            i25 = iT2;
                                            i8 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 1) {
                                                iU = i24 + 8;
                                                unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(r8c.B(bArr2, i24))));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iU = i24;
                                            }
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar112 = l4hVarB;
                                                byte[] bArr111 = bArr2;
                                                int i519 = i9;
                                                iU = r8c.u(i519 == true ? 1 : 0, bArr111, i6, i3, l4hVar112, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i519 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                        case 52:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            l4hVar7 = l4hVar;
                                            i25 = iT2;
                                            i8 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 5) {
                                                iU = i24 + 4;
                                                unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(r8c.r(bArr2, i24))));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iU = i24;
                                            }
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar113 = l4hVarB;
                                                byte[] bArr112 = bArr2;
                                                int i5110 = i9;
                                                iU = r8c.u(i5110 == true ? 1 : 0, bArr112, i6, i3, l4hVar113, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i5110 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            l4hVar7 = l4hVar;
                                            i25 = iT2;
                                            i8 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 0) {
                                                iU = r8c.y(bArr2, i24, tlgVar);
                                                unsafe.putObject(obj2, j2, Long.valueOf(tlgVar.b));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iU = i24;
                                            }
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar114 = l4hVarB;
                                                byte[] bArr113 = bArr2;
                                                int i5111 = i9;
                                                iU = r8c.u(i5111 == true ? 1 : 0, bArr113, i6, i3, l4hVar114, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i5111 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            l4hVar7 = l4hVar;
                                            i25 = iT2;
                                            i8 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 0) {
                                                iU = r8c.v(bArr2, i24, tlgVar);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(tlgVar.a));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iU = i24;
                                            }
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar115 = l4hVarB;
                                                byte[] bArr114 = bArr2;
                                                int i5112 = i9;
                                                iU = r8c.u(i5112 == true ? 1 : 0, bArr114, i6, i3, l4hVar115, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i5112 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            l4hVar7 = l4hVar;
                                            i25 = iT2;
                                            i8 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 1) {
                                                iU = i24 + 8;
                                                unsafe.putObject(obj2, j2, Long.valueOf(r8c.B(bArr2, i24)));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iU = i24;
                                            }
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar116 = l4hVarB;
                                                byte[] bArr115 = bArr2;
                                                int i5113 = i9;
                                                iU = r8c.u(i5113 == true ? 1 : 0, bArr115, i6, i3, l4hVar116, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i5113 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                        case 57:
                                        case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            l4hVar7 = l4hVar;
                                            i25 = iT2;
                                            i8 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 5) {
                                                iU = i24 + 4;
                                                unsafe.putObject(obj2, j2, Integer.valueOf(r8c.r(bArr2, i24)));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iU = i24;
                                            }
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar117 = l4hVarB;
                                                byte[] bArr116 = bArr2;
                                                int i5114 = i9;
                                                iU = r8c.u(i5114 == true ? 1 : 0, bArr116, i6, i3, l4hVar117, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i5114 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                        case 58:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            i25 = iT2;
                                            i8 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 0) {
                                                iU = r8c.y(bArr2, i24, tlgVar);
                                                l4hVar7 = l4hVar;
                                                unsafe.putObject(obj2, j2, Boolean.valueOf(tlgVar.b != 0));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                l4hVar7 = l4hVar;
                                                iU = i24;
                                            }
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar118 = l4hVarB;
                                                byte[] bArr117 = bArr2;
                                                int i5115 = i9;
                                                iU = r8c.u(i5115 == true ? 1 : 0, bArr117, i6, i3, l4hVar118, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i5115 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                        case 59:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            i25 = iT2;
                                            i8 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 2) {
                                                int iV16 = r8c.v(bArr2, i24, tlgVar);
                                                int i101 = tlgVar.a;
                                                if (i101 == 0) {
                                                    unsafe.putObject(obj2, j2, "");
                                                } else {
                                                    int i102 = iV16 + i101;
                                                    if ((i49 & 536870912) != 0 && !d5h.b(bArr2, iV16, i102)) {
                                                        s8f.o("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    unsafe.putObject(obj2, j2, new String(bArr2, iV16, i101, StandardCharsets.UTF_8));
                                                    iV16 = i102;
                                                }
                                                unsafe.putInt(obj2, j5, i8);
                                                iU = iV16;
                                                l4hVar7 = l4hVar;
                                            } else {
                                                l4hVar7 = l4hVar;
                                                iU = i24;
                                            }
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar119 = l4hVarB;
                                                byte[] bArr118 = bArr2;
                                                int i5116 = i9;
                                                iU = r8c.u(i5116 == true ? 1 : 0, bArr118, i6, i3, l4hVar119, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i5116 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                        case 60:
                                            i24 = i22;
                                            tlgVar = tlgVar;
                                            if (i48 == 2) {
                                                i8 = i21;
                                                Object objA = a3hVar.A(i8, obj2, iT2);
                                                int iA2 = r8c.A(objA, a3hVar.y(iT2), bArr, i24, i3, tlgVar);
                                                bArr2 = bArr;
                                                unsafe9.putObject(obj2, a3hVar.v(iT2) & 1048575, objA);
                                                s4h.g(iArr[i100] & 1048575, obj2, i8);
                                                iU = iA2;
                                                l4hVar7 = l4hVar;
                                                i25 = iT2;
                                                i9 = i23 == true ? 1 : 0;
                                            } else {
                                                i8 = i21;
                                                bArr2 = bArr;
                                                l4hVar7 = l4hVar;
                                                i25 = iT2;
                                                i9 = i23 == true ? 1 : 0;
                                                iU = i24;
                                            }
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar1110 = l4hVarB;
                                                byte[] bArr119 = bArr2;
                                                int i5117 = i9;
                                                iU = r8c.u(i5117 == true ? 1 : 0, bArr119, i6, i3, l4hVar1110, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i5117 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                        case 61:
                                            bArr5 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            i26 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 2) {
                                                iQ = r8c.q(bArr5, i24, tlgVar);
                                                unsafe.putObject(obj2, j2, tlgVar.c);
                                                unsafe.putInt(obj2, j5, i26);
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                iU = iQ;
                                                l4hVar7 = l4hVar;
                                                i25 = iT2;
                                                if (iU == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i42 = i9 == true ? 1 : 0;
                                                    i41 = i7;
                                                    iT2 = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iU;
                                                    iT2 = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    l0hVar = (l0h) obj2;
                                                    l4hVarB = l0hVar.zzc;
                                                    if (l4hVarB == l4hVar7) {
                                                        l4hVarB = l4h.b();
                                                        l0hVar.zzc = l4hVarB;
                                                    }
                                                    l4h l4hVar1111 = l4hVarB;
                                                    byte[] bArr1110 = bArr2;
                                                    int i5118 = i9;
                                                    iU = r8c.u(i5118 == true ? 1 : 0, bArr1110, i6, i3, l4hVar1111, tlgVar);
                                                    bArr6 = bArr;
                                                    tlgVar = tlgVar;
                                                    i42 = i5118 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i41 = i7;
                                                }
                                            } else {
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                l4hVar7 = l4hVar;
                                                i25 = iT2;
                                                iU = i24;
                                                if (iU == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i42 = i9 == true ? 1 : 0;
                                                    i41 = i7;
                                                    iT2 = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iU;
                                                    iT2 = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    l0hVar = (l0h) obj2;
                                                    l4hVarB = l0hVar.zzc;
                                                    if (l4hVarB == l4hVar7) {
                                                        l4hVarB = l4h.b();
                                                        l0hVar.zzc = l4hVarB;
                                                    }
                                                    l4h l4hVar1112 = l4hVarB;
                                                    byte[] bArr1111 = bArr2;
                                                    int i5119 = i9;
                                                    iU = r8c.u(i5119 == true ? 1 : 0, bArr1111, i6, i3, l4hVar1112, tlgVar);
                                                    bArr6 = bArr;
                                                    tlgVar = tlgVar;
                                                    i42 = i5119 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i41 = i7;
                                                }
                                            }
                                            break;
                                        case 63:
                                            bArr5 = bArr;
                                            i24 = i22;
                                            i27 = i23 == true ? 1 : 0;
                                            l4hVar2 = l4hVar;
                                            i26 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 0) {
                                                iQ = r8c.v(bArr5, i24, tlgVar);
                                                int i103 = tlgVar.a;
                                                uxg uxgVarX3 = a3hVar.x(iT2);
                                                if (uxgVarX3 == null || uxgVarX3.a(i103)) {
                                                    l4hVar = l4hVar2;
                                                    i9 = i27 == true ? 1 : 0;
                                                    unsafe.putObject(obj2, j2, Integer.valueOf(i103));
                                                    unsafe.putInt(obj2, j5, i26);
                                                } else {
                                                    l0h l0hVar4 = (l0h) obj2;
                                                    l4h l4hVarB4 = l0hVar4.zzc;
                                                    l4hVar = l4hVar2;
                                                    if (l4hVarB4 == l4hVar) {
                                                        l4hVarB4 = l4h.b();
                                                        l0hVar4.zzc = l4hVarB4;
                                                    }
                                                    Long lValueOf = Long.valueOf(i103);
                                                    i9 = i27 == true ? 1 : 0;
                                                    l4hVarB4.c(i9 == true ? 1 : 0, lValueOf);
                                                }
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                iU = iQ;
                                                l4hVar7 = l4hVar;
                                                i25 = iT2;
                                                if (iU == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i42 = i9 == true ? 1 : 0;
                                                    i41 = i7;
                                                    iT2 = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iU;
                                                    iT2 = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    l0hVar = (l0h) obj2;
                                                    l4hVarB = l0hVar.zzc;
                                                    if (l4hVarB == l4hVar7) {
                                                        l4hVarB = l4h.b();
                                                        l0hVar.zzc = l4hVarB;
                                                    }
                                                    l4h l4hVar1113 = l4hVarB;
                                                    byte[] bArr1112 = bArr2;
                                                    int i51110 = i9;
                                                    iU = r8c.u(i51110 == true ? 1 : 0, bArr1112, i6, i3, l4hVar1113, tlgVar);
                                                    bArr6 = bArr;
                                                    tlgVar = tlgVar;
                                                    i42 = i51110 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i41 = i7;
                                                }
                                            }
                                            i8 = i26;
                                            bArr2 = bArr5;
                                            l4hVar7 = l4hVar2;
                                            i9 = i27;
                                            i25 = iT2;
                                            iU = i24;
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar1114 = l4hVarB;
                                                byte[] bArr1113 = bArr2;
                                                int i51111 = i9;
                                                iU = r8c.u(i51111 == true ? 1 : 0, bArr1113, i6, i3, l4hVar1114, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i51111 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                        case 66:
                                            bArr5 = bArr;
                                            i24 = i22;
                                            i27 = i23 == true ? 1 : 0;
                                            l4hVar2 = l4hVar;
                                            i26 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 0) {
                                                iV2 = r8c.v(bArr5, i24, tlgVar);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(z8c.n(tlgVar.a)));
                                                unsafe.putInt(obj2, j5, i26);
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                iU = iV2;
                                                l4hVar7 = l4hVar2;
                                                i9 = i27;
                                                i25 = iT2;
                                                if (iU == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i42 = i9 == true ? 1 : 0;
                                                    i41 = i7;
                                                    iT2 = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iU;
                                                    iT2 = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    l0hVar = (l0h) obj2;
                                                    l4hVarB = l0hVar.zzc;
                                                    if (l4hVarB == l4hVar7) {
                                                        l4hVarB = l4h.b();
                                                        l0hVar.zzc = l4hVarB;
                                                    }
                                                    l4h l4hVar1115 = l4hVarB;
                                                    byte[] bArr1114 = bArr2;
                                                    int i51112 = i9;
                                                    iU = r8c.u(i51112 == true ? 1 : 0, bArr1114, i6, i3, l4hVar1115, tlgVar);
                                                    bArr6 = bArr;
                                                    tlgVar = tlgVar;
                                                    i42 = i51112 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i41 = i7;
                                                }
                                            }
                                            i8 = i26;
                                            bArr2 = bArr5;
                                            l4hVar7 = l4hVar2;
                                            i9 = i27;
                                            i25 = iT2;
                                            iU = i24;
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar1116 = l4hVarB;
                                                byte[] bArr1115 = bArr2;
                                                int i51113 = i9;
                                                iU = r8c.u(i51113 == true ? 1 : 0, bArr1115, i6, i3, l4hVar1116, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i51113 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                        case 67:
                                            bArr5 = bArr;
                                            i24 = i22;
                                            i26 = i21;
                                            tlgVar = tlgVar;
                                            if (i48 == 0) {
                                                iV2 = r8c.y(bArr5, i24, tlgVar);
                                                i27 = i23 == true ? 1 : 0;
                                                l4hVar2 = l4hVar;
                                                long j6 = tlgVar.b;
                                                unsafe.putObject(obj2, j2, Long.valueOf((j6 >>> 1) ^ (-(j6 & 1))));
                                                unsafe.putInt(obj2, j5, i26);
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                iU = iV2;
                                                l4hVar7 = l4hVar2;
                                                i9 = i27;
                                                i25 = iT2;
                                                if (iU == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i42 = i9 == true ? 1 : 0;
                                                    i41 = i7;
                                                    iT2 = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iU;
                                                    iT2 = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    l0hVar = (l0h) obj2;
                                                    l4hVarB = l0hVar.zzc;
                                                    if (l4hVarB == l4hVar7) {
                                                        l4hVarB = l4h.b();
                                                        l0hVar.zzc = l4hVarB;
                                                    }
                                                    l4h l4hVar1117 = l4hVarB;
                                                    byte[] bArr1116 = bArr2;
                                                    int i51114 = i9;
                                                    iU = r8c.u(i51114 == true ? 1 : 0, bArr1116, i6, i3, l4hVar1117, tlgVar);
                                                    bArr6 = bArr;
                                                    tlgVar = tlgVar;
                                                    i42 = i51114 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i41 = i7;
                                                }
                                            } else {
                                                i9 = i23 == true ? 1 : 0;
                                                l4hVar7 = l4hVar;
                                                i25 = iT2;
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                iU = i24;
                                                if (iU == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i42 = i9 == true ? 1 : 0;
                                                    i41 = i7;
                                                    iT2 = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iU;
                                                    iT2 = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    l0hVar = (l0h) obj2;
                                                    l4hVarB = l0hVar.zzc;
                                                    if (l4hVarB == l4hVar7) {
                                                        l4hVarB = l4h.b();
                                                        l0hVar.zzc = l4hVarB;
                                                    }
                                                    l4h l4hVar1118 = l4hVarB;
                                                    byte[] bArr1117 = bArr2;
                                                    int i51115 = i9;
                                                    iU = r8c.u(i51115 == true ? 1 : 0, bArr1117, i6, i3, l4hVar1118, tlgVar);
                                                    bArr6 = bArr;
                                                    tlgVar = tlgVar;
                                                    i42 = i51115 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i39 = i8;
                                                    i41 = i7;
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i48 == 3) {
                                                int i104 = ((i23 == true ? 1 : 0) & (-8)) | 4;
                                                i24 = i22;
                                                Object objA2 = a3hVar.A(i21, obj2, iT2);
                                                int iZ3 = r8c.z(objA2, a3hVar.y(iT2), bArr, i24, i3, i104, tlgVar);
                                                tlgVar = tlgVar;
                                                unsafe9.putObject(obj2, a3hVar.v(iT2) & 1048575, objA2);
                                                s4h.g(iArr[i100] & 1048575, obj2, i21);
                                                bArr2 = bArr;
                                                iU = iZ3;
                                                i9 = i23 == true ? 1 : 0;
                                                l4hVar7 = l4hVar;
                                                i25 = iT2;
                                                i8 = i21;
                                            }
                                            if (iU == i24) {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar1119 = l4hVarB;
                                                byte[] bArr1118 = bArr2;
                                                int i51116 = i9;
                                                iU = r8c.u(i51116 == true ? 1 : 0, bArr1118, i6, i3, l4hVar1119, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i51116 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                                break;
                                            } else {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                                break;
                                            }
                                        default:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            l4hVar7 = l4hVar;
                                            i25 = iT2;
                                            i8 = i21;
                                            tlgVar = tlgVar;
                                            iU = i24;
                                            if (iU == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i42 = i9 == true ? 1 : 0;
                                                i41 = i7;
                                                iT2 = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iU;
                                                iT2 = i25;
                                                if (i9 == i4) {
                                                }
                                                l0hVar = (l0h) obj2;
                                                l4hVarB = l0hVar.zzc;
                                                if (l4hVarB == l4hVar7) {
                                                    l4hVarB = l4h.b();
                                                    l0hVar.zzc = l4hVarB;
                                                }
                                                l4h l4hVar11110 = l4hVarB;
                                                byte[] bArr1119 = bArr2;
                                                int i51117 = i9;
                                                iU = r8c.u(i51117 == true ? 1 : 0, bArr1119, i6, i3, l4hVar11110, tlgVar);
                                                bArr6 = bArr;
                                                tlgVar = tlgVar;
                                                i42 = i51117 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i39 = i8;
                                                i41 = i7;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i48 == 2) {
                                        int i105 = iT2 / 3;
                                        Object obj7 = objArr[i105 + i105];
                                        Object object = unsafe.getObject(obj2, j2);
                                        if (!((k2h) object).d()) {
                                            k2h k2hVarB = k2h.a.b();
                                            fdc.x(k2hVarB, object);
                                            unsafe.putObject(obj2, j2, k2hVarB);
                                        }
                                        throw ks0.e(obj7);
                                    }
                                    bArr2 = bArr;
                                    i6 = i22;
                                    i9 = i23;
                                    l4hVar7 = l4hVar;
                                    iT2 = iT2;
                                    i8 = i21;
                                    i4 = i4;
                                    tlgVar = tlgVar;
                                    if (i9 == i4) {
                                    }
                                    l0hVar = (l0h) obj2;
                                    l4hVarB = l0hVar.zzc;
                                    if (l4hVarB == l4hVar7) {
                                        l4hVarB = l4h.b();
                                        l0hVar.zzc = l4hVarB;
                                    }
                                    l4h l4hVar11111 = l4hVarB;
                                    byte[] bArr11110 = bArr2;
                                    int i51118 = i9;
                                    iU = r8c.u(i51118 == true ? 1 : 0, bArr11110, i6, i3, l4hVar11111, tlgVar);
                                    bArr6 = bArr;
                                    tlgVar = tlgVar;
                                    i42 = i51118 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i39 = i8;
                                    i41 = i7;
                                }
                                i40 = i5;
                                iS = iU;
                                a3hVar = this;
                            }
                        } else if (i48 == 2) {
                            v0h v0hVarU2 = (v0h) unsafe8.getObject(obj5, j2);
                            if (!((fyg) v0hVarU2).a) {
                                int size3 = v0hVarU2.size();
                                v0hVarU2 = v0hVarU2.u(size3 == 0 ? 10 : size3 + size3);
                                unsafe8.putObject(obj5, j2, v0hVarU2);
                            }
                            bArr6 = bArr;
                            i3 = i3;
                            iS = r8c.s(a3hVar.y(iT2), i42 == true ? 1 : 0, bArr6, i44, i3, v0hVarU2, tlgVar);
                            tlgVar = tlgVar;
                            i42 = i42 == true ? 1 : 0;
                            i39 = i45;
                            iT2 = iT2;
                            i41 = i7;
                            i40 = i5;
                            obj5 = obj;
                        } else {
                            obj2 = obj;
                            i21 = i45;
                            objArr = objArr2;
                            l4hVar = l4hVar7;
                            i22 = i44;
                            i23 = i42 == true ? 1 : 0;
                            unsafe = unsafe8;
                            bArr2 = bArr;
                            i6 = i22;
                            i9 = i23;
                            l4hVar7 = l4hVar;
                            iT2 = iT2;
                            i8 = i21;
                            i4 = i4;
                            tlgVar = tlgVar;
                            if (i9 == i4) {
                            }
                            l0hVar = (l0h) obj2;
                            l4hVarB = l0hVar.zzc;
                            if (l4hVarB == l4hVar7) {
                                l4hVarB = l4h.b();
                                l0hVar.zzc = l4hVarB;
                            }
                            l4h l4hVar11112 = l4hVarB;
                            byte[] bArr11111 = bArr2;
                            int i51119 = i9;
                            iU = r8c.u(i51119 == true ? 1 : 0, bArr11111, i6, i3, l4hVar11112, tlgVar);
                            bArr6 = bArr;
                            tlgVar = tlgVar;
                            i42 = i51119 == true ? 1 : 0;
                            i3 = i3;
                            obj5 = obj2;
                            i39 = i8;
                            i41 = i7;
                            i40 = i5;
                            iS = iU;
                            a3hVar = this;
                        }
                    }
                }
                bArr2 = bArr;
                if (i9 == i4) {
                }
                l0hVar = (l0h) obj2;
                l4hVarB = l0hVar.zzc;
                if (l4hVarB == l4hVar7) {
                    l4hVarB = l4h.b();
                    l0hVar.zzc = l4hVarB;
                }
                l4h l4hVar11113 = l4hVarB;
                byte[] bArr11112 = bArr2;
                int i511110 = i9;
                iU = r8c.u(i511110 == true ? 1 : 0, bArr11112, i6, i3, l4hVar11113, tlgVar);
                bArr6 = bArr;
                tlgVar = tlgVar;
                i42 = i511110 == true ? 1 : 0;
                i3 = i3;
                obj5 = obj2;
                i39 = i8;
                i41 = i7;
                i40 = i5;
                iS = iU;
                a3hVar = this;
            } else {
                i4 = i4;
                i5 = i40;
                iArr = iArr2;
                objArr = objArr2;
                obj2 = obj5;
                unsafe = unsafe8;
            }
        }
        int i106 = i5;
        if (i106 != 1048575) {
            unsafe.putInt(obj2, i106, i41);
        }
        for (int i107 = this.g; i107 < this.h; i107++) {
            int i108 = this.f[i107];
            int i109 = iArr[i108];
            Object objC = s4h.c(v(i108) & 1048575, obj2);
            if (objC != null && x(i108) != null) {
                int i110 = i108 / 3;
                throw ks0.e(objArr[i110 + i110]);
            }
        }
        if (i4 == 0) {
            if (iS != i3) {
                s8f.o("Failed to parse the message.");
                return 0;
            }
        } else if (iS > i3 || i42 != i4) {
            s8f.o("Failed to parse the message.");
            return 0;
        }
        return iS;
    }

    public final int t(int i2, int i3) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final int v(int i2) {
        return this.a[i2 + 1];
    }

    public final uxg x(int i2) {
        int i3 = i2 / 3;
        return (uxg) this.b[i3 + i3 + 1];
    }

    public final s3h y(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.b;
        s3h s3hVar = (s3h) objArr[i4];
        if (s3hVar != null) {
            return s3hVar;
        }
        s3h s3hVarA = i3h.b.a((Class) objArr[i4 + 1]);
        objArr[i4] = s3hVarA;
        return s3hVarA;
    }

    public final Object z(int i2, Object obj) {
        s3h s3hVarY = y(i2);
        int iV = v(i2) & 1048575;
        if (!n(i2, obj)) {
            return s3hVarY.a();
        }
        Object object = j.getObject(obj, iV);
        if (p(object)) {
            return object;
        }
        l0h l0hVarA = s3hVarY.a();
        if (object != null) {
            s3hVarY.h(l0hVarA, object);
        }
        return l0hVarA;
    }
}

package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c11 extends r72 {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c11(boolean z, int i) {
        super(z);
        this.q = i;
    }

    public static int[] j(String str) {
        return new int[]{((Number) ub9.b.d(str)).intValue()};
    }

    public static long[] k(String str) {
        return new long[]{((Number) ub9.e.d(str)).longValue()};
    }

    public static boolean[] l(String str) {
        return new boolean[]{((Boolean) ub9.k.d(str)).booleanValue()};
    }

    @Override // defpackage.ub9
    public final Object a(String str, Bundle bundle) {
        switch (this.q) {
            case 0:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                gdc.h(str);
                throw null;
            case 1:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return qd0.H0(booleanArray2);
                }
                gdc.h(str);
                throw null;
            case 2:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                gdc.h(str);
                throw null;
            case 3:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return qd0.D0(floatArray2);
                }
                gdc.h(str);
                throw null;
            case 4:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                gdc.h(str);
                throw null;
            case 5:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    return qd0.E0(intArray2);
                }
                gdc.h(str);
                throw null;
            case 6:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                gdc.h(str);
                throw null;
            case 7:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return qd0.F0(longArray2);
                }
                gdc.h(str);
                throw null;
            case 8:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                return fdc.o(str, bundle);
            default:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                return qd0.G0(fdc.o(str, bundle));
        }
    }

    @Override // defpackage.ub9
    public final String b() {
        switch (this.q) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // defpackage.ub9
    public final Object c(Object obj, String str) {
        switch (this.q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return l(str);
                }
                boolean[] zArrL = l(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrL, 0, zArrCopyOf, length, 1);
                return zArrCopyOf;
            case 1:
                List list = (List) obj;
                d11 d11Var = ub9.k;
                return list != null ? s72.Q0(list, t72.H(d11Var.d(str))) : t72.H(d11Var.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{Float.parseFloat(str)};
                }
                float[] fArr2 = {Float.parseFloat(str)};
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, fArrCopyOf, length2, 1);
                return fArrCopyOf;
            case 3:
                List list2 = (List) obj;
                return list2 != null ? s72.Q0(list2, t72.H(Float.valueOf(Float.parseFloat(str)))) : t72.H(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return j(str);
                }
                int[] iArrJ = j(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrJ, 0, iArrCopyOf, length3, 1);
                return iArrCopyOf;
            case 5:
                List list3 = (List) obj;
                d11 d11Var2 = ub9.b;
                return list3 != null ? s72.Q0(list3, t72.H(d11Var2.d(str))) : t72.H(d11Var2.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return k(str);
                }
                long[] jArrK = k(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrK, 0, jArrCopyOf, length4, 1);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                d11 d11Var3 = ub9.e;
                return list4 != null ? s72.Q0(list4, t72.H(d11Var3.d(str))) : t72.H(d11Var3.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                return strArr != null ? (String[]) qd0.w0(strArr, new String[]{str}) : new String[]{str};
            default:
                List list5 = (List) obj;
                return list5 != null ? s72.Q0(list5, t72.H(str)) : t72.H(str);
        }
    }

    @Override // defpackage.ub9
    public final Object d(String str) {
        switch (this.q) {
            case 0:
                return l(str);
            case 1:
                return t72.H(ub9.k.d(str));
            case 2:
                return new float[]{Float.parseFloat(str)};
            case 3:
                return t72.H(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return j(str);
            case 5:
                return t72.H(ub9.b.d(str));
            case 6:
                return k(str);
            case 7:
                return t72.H(ub9.e.d(str));
            case 8:
                return new String[]{str};
            default:
                return t72.H(str);
        }
    }

    @Override // defpackage.ub9
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, zArr);
                }
                break;
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, s72.e1(list));
                }
                break;
            case 2:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putFloatArray(str, fArr);
                }
                break;
            case 3:
                List list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putFloatArray(str, s72.g1(list2));
                }
                break;
            case 4:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putIntArray(str, iArr);
                }
                break;
            case 5:
                List list3 = (List) obj;
                str.getClass();
                if (list3 != null) {
                    bundle.putIntArray(str, s72.i1(list3));
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putLongArray(str, jArr);
                }
                break;
            case 7:
                List list4 = (List) obj;
                str.getClass();
                if (list4 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putLongArray(str, s72.k1(list4));
                }
                break;
            case 8:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putStringArray(str, strArr);
                }
                break;
            default:
                List list5 = (List) obj;
                str.getClass();
                if (list5 == null) {
                    bundle.putString(str, null);
                } else {
                    String[] strArr2 = (String[]) list5.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                }
                break;
        }
    }

    @Override // defpackage.ub9
    public final boolean g(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Long[] lArr;
        int i = 0;
        Object[] objArr = null;
        switch (this.q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        boolArr[i2] = Boolean.valueOf(zArr[i2]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    objArr = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    while (i < length2) {
                        objArr[i] = Boolean.valueOf(zArr2[i]);
                        i++;
                    }
                }
                return qd0.W(boolArr, objArr);
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return qd0.W(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
            case 2:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        fArr[i3] = Float.valueOf(fArr2[i3]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    objArr = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    while (i < length4) {
                        objArr[i] = Float.valueOf(fArr3[i]);
                        i++;
                    }
                }
                return qd0.W(fArr, objArr);
            case 3:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return qd0.W(list3 != null ? (Float[]) list3.toArray(new Float[0]) : null, list4 != null ? (Float[]) list4.toArray(new Float[0]) : null);
            case 4:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                return qd0.W(iArr != null ? qd0.J0(iArr) : null, iArr2 != null ? qd0.J0(iArr2) : null);
            case 5:
                List list5 = (List) obj;
                List list6 = (List) obj2;
                return qd0.W(list5 != null ? (Integer[]) list5.toArray(new Integer[0]) : null, list6 != null ? (Integer[]) list6.toArray(new Integer[0]) : null);
            case 6:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length5 = jArr.length;
                    for (int i4 = 0; i4 < length5; i4++) {
                        lArr[i4] = Long.valueOf(jArr[i4]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    objArr = new Long[jArr2.length];
                    int length6 = jArr2.length;
                    while (i < length6) {
                        objArr[i] = Long.valueOf(jArr2[i]);
                        i++;
                    }
                }
                return qd0.W(lArr, objArr);
            case 7:
                List list7 = (List) obj;
                List list8 = (List) obj2;
                return qd0.W(list7 != null ? (Long[]) list7.toArray(new Long[0]) : null, list8 != null ? (Long[]) list8.toArray(new Long[0]) : null);
            case 8:
                return qd0.W((String[]) obj, (String[]) obj2);
            default:
                List list9 = (List) obj;
                List list10 = (List) obj2;
                return qd0.W(list9 != null ? (String[]) list9.toArray(new String[0]) : null, list10 != null ? (String[]) list10.toArray(new String[0]) : null);
        }
    }

    @Override // defpackage.r72
    public final Object h() {
        int i = this.q;
        pu4 pu4Var = pu4.a;
        switch (i) {
            case 0:
                return new boolean[0];
            case 1:
                return pu4Var;
            case 2:
                return new float[0];
            case 3:
                return pu4Var;
            case 4:
                return new int[0];
            case 5:
                return pu4Var;
            case 6:
                return new long[0];
            case 7:
                return pu4Var;
            case 8:
                return new String[0];
            default:
                return pu4Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [pu4] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    @Override // defpackage.r72
    public final List i(Object obj) {
        int i = this.q;
        ?? arrayList = pu4.a;
        switch (i) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    List listH0 = qd0.H0(zArr);
                    arrayList = new ArrayList(t72.u(listH0, 10));
                    Iterator it = listH0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                    }
                }
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(t72.u(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it2.next()).booleanValue()));
                    }
                }
                break;
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    List listD0 = qd0.D0(fArr);
                    arrayList = new ArrayList(t72.u(listD0, 10));
                    Iterator it3 = listD0.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it3.next()).floatValue()));
                    }
                }
                break;
            case 3:
                List list2 = (List) obj;
                if (list2 != null) {
                    arrayList = new ArrayList(t72.u(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it4.next()).floatValue()));
                    }
                }
                break;
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    List listE0 = qd0.E0(iArr);
                    arrayList = new ArrayList(t72.u(listE0, 10));
                    Iterator it5 = listE0.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it5.next()).intValue()));
                    }
                }
                break;
            case 5:
                List list3 = (List) obj;
                if (list3 != null) {
                    arrayList = new ArrayList(t72.u(list3, 10));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it6.next()).intValue()));
                    }
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    List listF0 = qd0.F0(jArr);
                    arrayList = new ArrayList(t72.u(listF0, 10));
                    Iterator it7 = listF0.iterator();
                    while (it7.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it7.next()).longValue()));
                    }
                }
                break;
            case 7:
                List list4 = (List) obj;
                if (list4 != null) {
                    arrayList = new ArrayList(t72.u(list4, 10));
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it8.next()).longValue()));
                    }
                }
                break;
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    arrayList = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        str.getClass();
                        String strEncode = Uri.encode(str, null);
                        strEncode.getClass();
                        arrayList.add(strEncode);
                    }
                }
                break;
            default:
                List<String> list5 = (List) obj;
                if (list5 != null) {
                    arrayList = new ArrayList(t72.u(list5, 10));
                    for (String str2 : list5) {
                        str2.getClass();
                        String strEncode2 = Uri.encode(str2, null);
                        strEncode2.getClass();
                        arrayList.add(strEncode2);
                    }
                }
                break;
        }
        return arrayList;
    }
}

package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e97 extends r72 {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e97(boolean z, int i) {
        super(z);
        this.q = i;
    }

    @Override // defpackage.ub9
    public final Object a(String str, Bundle bundle) {
        int i = this.q;
        d11 d11Var = ub9.n;
        ArrayList arrayList = null;
        switch (i) {
            case 0:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                double[] doubleArray = bundle.getDoubleArray(str);
                if (doubleArray != null) {
                    return doubleArray;
                }
                gdc.h(str);
                throw null;
            case 1:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                double[] doubleArray2 = bundle.getDoubleArray(str);
                if (doubleArray2 != null) {
                    return qd0.C0(doubleArray2);
                }
                gdc.h(str);
                throw null;
            case 2:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                String[] strArrO = fdc.o(str, bundle);
                ArrayList arrayList2 = new ArrayList(strArrO.length);
                for (String str2 : strArrO) {
                    arrayList2.add((String) d11Var.d(str2));
                }
                return (String[]) arrayList2.toArray(new String[0]);
            default:
                if (ks0.y(str, str, bundle) && !fdc.r(str, bundle)) {
                    List listG0 = qd0.G0(fdc.o(str, bundle));
                    arrayList = new ArrayList(t72.u(listG0, 10));
                    Iterator it = listG0.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) d11Var.d((String) it.next()));
                    }
                }
                return arrayList;
        }
    }

    @Override // defpackage.ub9
    public final String b() {
        switch (this.q) {
            case 0:
                return "double[]";
            case 1:
                return "List<Double>";
            case 2:
                return "string_nullable[]";
            default:
                return "List<String?>";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ub9
    public final Object c(Object obj, String str) {
        int i = this.q;
        d11 d11Var = ub9.n;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null) {
                    return new double[]{Double.parseDouble(str)};
                }
                double[] dArr2 = {Double.parseDouble(str)};
                int length = dArr.length;
                double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
                System.arraycopy(dArr2, 0, dArrCopyOf, length, 1);
                return dArrCopyOf;
            case 1:
                List list = (List) obj;
                return list != null ? s72.Q0(list, t72.H(Double.valueOf(Double.parseDouble(str)))) : t72.H(Double.valueOf(Double.parseDouble(str)));
            case 2:
                String[] strArr = (String[]) obj;
                return strArr != null ? (String[]) qd0.w0(strArr, new String[]{d11Var.d(str)}) : new String[]{d11Var.d(str)};
            default:
                List list2 = (List) obj;
                return list2 != null ? s72.Q0(list2, t72.H(d11Var.d(str))) : t72.H(d11Var.d(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ub9
    public final Object d(String str) {
        int i = this.q;
        d11 d11Var = ub9.n;
        switch (i) {
            case 0:
                return new double[]{Double.parseDouble(str)};
            case 1:
                return t72.H(Double.valueOf(Double.parseDouble(str)));
            case 2:
                return new String[]{d11Var.d(str)};
            default:
                return t72.H(d11Var.d(str));
        }
    }

    @Override // defpackage.ub9
    public final void e(Bundle bundle, String str, Object obj) {
        int i = 0;
        switch (this.q) {
            case 0:
                double[] dArr = (double[]) obj;
                str.getClass();
                if (dArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putDoubleArray(str, dArr);
                }
                break;
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                } else {
                    double[] dArr2 = new double[list.size()];
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        dArr2[i] = ((Number) it.next()).doubleValue();
                        i++;
                    }
                    bundle.putDoubleArray(str, dArr2);
                }
                break;
            case 2:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                } else {
                    ArrayList arrayList = new ArrayList(strArr.length);
                    for (String str2 : strArr) {
                        if (str2 == null) {
                            str2 = "null";
                        }
                        arrayList.add(str2);
                    }
                    String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                }
                break;
            default:
                List<String> list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                } else {
                    ArrayList arrayList2 = new ArrayList(t72.u(list2, 10));
                    for (String str3 : list2) {
                        if (str3 == null) {
                            str3 = "null";
                        }
                        arrayList2.add(str3);
                    }
                    String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                    strArr3.getClass();
                    bundle.putStringArray(str, strArr3);
                }
                break;
        }
    }

    @Override // defpackage.ub9
    public final boolean g(Object obj, Object obj2) {
        Double[] dArr;
        Object[] objArr = null;
        switch (this.q) {
            case 0:
                double[] dArr2 = (double[]) obj;
                double[] dArr3 = (double[]) obj2;
                if (dArr2 != null) {
                    dArr = new Double[dArr2.length];
                    int length = dArr2.length;
                    for (int i = 0; i < length; i++) {
                        dArr[i] = Double.valueOf(dArr2[i]);
                    }
                } else {
                    dArr = null;
                }
                if (dArr3 != null) {
                    objArr = new Double[dArr3.length];
                    int length2 = dArr3.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        objArr[i2] = Double.valueOf(dArr3[i2]);
                    }
                }
                return qd0.W(dArr, objArr);
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return qd0.W(list != null ? (Double[]) list.toArray(new Double[0]) : null, list2 != null ? (Double[]) list2.toArray(new Double[0]) : null);
            case 2:
                return qd0.W((String[]) obj, (String[]) obj2);
            default:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return qd0.W(list3 != null ? (String[]) list3.toArray(new String[0]) : null, list4 != null ? (String[]) list4.toArray(new String[0]) : null);
        }
    }

    @Override // defpackage.r72
    public final Object h() {
        int i = this.q;
        pu4 pu4Var = pu4.a;
        switch (i) {
            case 0:
                return new double[0];
            case 1:
                return pu4Var;
            case 2:
                return new String[0];
            default:
                return pu4Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [pu4] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // defpackage.r72
    public final List i(Object obj) {
        String strEncode;
        String strEncode2;
        int i = this.q;
        ?? arrayList = pu4.a;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null) {
                    List listC0 = qd0.C0(dArr);
                    arrayList = new ArrayList(t72.u(listC0, 10));
                    Iterator it = listC0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
                    }
                }
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(t72.u(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it2.next()).doubleValue()));
                    }
                }
                break;
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    arrayList = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        if (str != null) {
                            strEncode = Uri.encode(str, null);
                            strEncode.getClass();
                        } else {
                            strEncode = "null";
                        }
                        arrayList.add(strEncode);
                    }
                }
                break;
            default:
                List<String> list2 = (List) obj;
                if (list2 != null) {
                    arrayList = new ArrayList(t72.u(list2, 10));
                    for (String str2 : list2) {
                        if (str2 != null) {
                            strEncode2 = Uri.encode(str2, null);
                            strEncode2.getClass();
                        } else {
                            strEncode2 = "null";
                        }
                        arrayList.add(strEncode2);
                    }
                }
                break;
        }
        return arrayList;
    }
}

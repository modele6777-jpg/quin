package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wkg extends AbstractMap {
    public static final kv8 f = new kv8(24);
    public final Object[] a;
    public final int[] b;
    public final vkg c;
    public Integer d;
    public String e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, wkg] */
    /* JADX WARN: Type inference failed for: r0v1, types: [wkg] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public wkg(wkg wkgVar, wkg wkgVar2) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.c = new vkg(abstractMap, -1);
        abstractMap.d = null;
        abstractMap.e = null;
        int size = wkgVar2.size() + wkgVar.size();
        int i = wkgVar.b[wkgVar.size()] + wkgVar2.b[wkgVar2.size()];
        int i2 = size + 1;
        Object[] objArr2 = new Object[i];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryD = wkgVar.d(0);
        Map.Entry entryD2 = wkgVar2.d(0);
        int i4 = 0;
        int i5 = 0;
        int iB = size;
        int i6 = 0;
        while (true) {
            if (entryD == null && entryD2 == null) {
                break;
            }
            i6++;
            if (entryD != null) {
                if (entryD2 != null) {
                    int iCompareTo = ((String) entryD.getKey()).compareTo((String) entryD2.getKey());
                    if (iCompareTo == 0) {
                        int i7 = i4 + 1;
                        int i8 = i5 + 1;
                        objArr2[i6] = new AbstractMap.SimpleImmutableEntry((String) entryD.getKey(), new vkg(abstractMap, i6));
                        vkg vkgVar = (vkg) entryD.getValue();
                        vkg vkgVar2 = (vkg) entryD2.getValue();
                        int i9 = 0;
                        int i10 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iC = vkgVar.c();
                            wkg wkgVar3 = vkgVar.b;
                            if (i9 >= iC - vkgVar.a() && i10 >= vkgVar2.c() - vkgVar2.a()) {
                                break;
                            }
                            int iCompare = i9 == vkgVar.c() - vkgVar.a() ? 1 : i10 == vkgVar2.c() - vkgVar2.a() ? -1 : 0;
                            if (iCompare == 0) {
                                kv8 kv8Var = ykg.b;
                                iCompare = ykg.b.compare(wkgVar3.a[vkgVar.a() + i9], vkgVar2.b.a[vkgVar2.a() + i10]);
                            }
                            if (iCompare < 0) {
                                i9++;
                                obj = wkgVar3.a[vkgVar.a() + i9];
                            } else {
                                int i11 = i10 + 1;
                                Object obj2 = vkgVar2.b.a[vkgVar2.a() + i10];
                                if (iCompare == 0) {
                                    i10 = i11;
                                    obj = obj2;
                                    i9++;
                                } else {
                                    i10 = i11;
                                    obj = obj2;
                                    i9 = i9;
                                }
                            }
                            objArr2[iB] = obj;
                            abstractMap = this;
                            iB++;
                        }
                        iArr[i6] = iB;
                        entryD = wkgVar.d(i8);
                        entryD2 = wkgVar2.d(i7);
                        i5 = i8;
                        i4 = i7;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iB = b(entryD, i6, iB, objArr2, iArr);
                entryD = wkgVar.d(i5);
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryD;
            i4++;
            int iB2 = b(entryD2, i6, iB, objArr2, iArr);
            entryD2 = wkgVar2.d(i4);
            iB = iB2;
            entryD = entry;
            i3 = 0;
            abstractMap = this;
        }
        int i12 = iArr[i3];
        int i13 = i12 - i6;
        if (i13 != 0) {
            for (int i14 = i3; i14 <= i6; i14++) {
                iArr[i14] = iArr[i14] - i13;
            }
            int i15 = iArr[i6];
            int i16 = i15 - i6;
            if (c(i, i15)) {
                objArr = new Object[i15];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i12, objArr, i6, i16);
            objArr2 = objArr;
        }
        abstractMap.a = objArr2;
        int i17 = iArr[i3] + 1;
        abstractMap.b = c(i2, i17) ? Arrays.copyOf(iArr, i17) : iArr;
    }

    public static boolean c(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    public final int b(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        vkg vkgVar = (vkg) entry.getValue();
        int iC = vkgVar.c() - vkgVar.a();
        System.arraycopy(vkgVar.b.a, vkgVar.a(), objArr, i2, iC);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new vkg(this, i));
        int i3 = i2 + iC;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry d(int i) {
        if (i < this.b[0]) {
            return (Map.Entry) this.a[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Integer numValueOf = this.d;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(super.hashCode());
            this.d = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.e = string;
        return string;
    }

    public wkg() {
        List list = Collections.EMPTY_LIST;
        this.c = new vkg(this, -1);
        this.d = null;
        this.e = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.a = c(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.b = iArr;
                return;
            }
            throw kv2.g(it2);
        }
        throw kv2.g(it);
    }
}

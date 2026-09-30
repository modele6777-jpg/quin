package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vcc implements ucc {
    public final a26 a;
    public final w79 b;
    public w79 c;

    public vcc(Map map, a26 a26Var) {
        w79 w79Var;
        this.a = a26Var;
        if (map == null || map.isEmpty()) {
            w79Var = null;
        } else {
            w79Var = new w79(map.size());
            for (Map.Entry entry : map.entrySet()) {
                w79Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.b = w79Var;
    }

    @Override // defpackage.ucc
    public final tcc a(String str, x16 x16Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!tq.G(str.charAt(i))) {
                w79 w79Var = this.c;
                if (w79Var == null) {
                    long[] jArr = jec.a;
                    w79Var = new w79();
                    this.c = w79Var;
                }
                Object objG = w79Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    w79Var.m(str, objG);
                }
                ((List) objG).add(x16Var);
                return new gg7(w79Var, str, x16Var, 23);
            }
        }
        qc0.j("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.ucc
    public final boolean c(Object obj) {
        return ((Boolean) this.a.d(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // defpackage.ucc
    public final Map d() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        w79 w79Var = this.b;
        if (w79Var == null && this.c == null) {
            return qu4.a;
        }
        int i3 = 0;
        int i4 = w79Var != null ? w79Var.e : 0;
        w79 w79Var2 = this.c;
        HashMap map = new HashMap(i4 + (w79Var2 != null ? w79Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (w79Var != null) {
            Object[] objArr = w79Var.b;
            Object[] objArr2 = w79Var.c;
            long[] jArr3 = w79Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        w79 w79Var3 = this.c;
        if (w79Var3 != null) {
            Object[] objArr3 = w79Var3.b;
            Object[] objArr4 = w79Var3.c;
            long[] jArr4 = w79Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((x16) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!c(objInvoke)) {
                                            ho7.j(vfh.t(objInvoke));
                                            return null;
                                        }
                                        map.put(str, t72.q(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((x16) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !c(objInvoke2)) {
                                            ho7.j(vfh.t(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.ucc
    public final Object e(String str) {
        w79 w79Var = this.b;
        List list = w79Var != null ? (List) w79Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && w79Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = w79Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = w79Var.c;
            Object obj = objArr[iF];
            w79Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}

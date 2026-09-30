package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vs8 implements up8, tp8 {
    public final up8[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public tp8 f;
    public i1f g;
    public up8[] v;
    public ig2 w;

    public vs8(i8c i8cVar, long[] jArr, up8... up8VarArr) {
        this.a = up8VarArr;
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        this.w = new ig2(yobVar, yobVar);
        this.c = new IdentityHashMap();
        this.v = new up8[0];
        this.b = new boolean[up8VarArr.length];
        for (int i = 0; i < up8VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new xxe(up8VarArr[i], j);
            }
        }
    }

    @Override // defpackage.tp8
    public final void a(up8 up8Var) {
        ArrayList arrayList = this.d;
        arrayList.remove(up8Var);
        if (arrayList.isEmpty()) {
            up8[] up8VarArr = this.a;
            int i = 0;
            for (up8 up8Var2 : up8VarArr) {
                i += up8Var2.m().a;
            }
            h1f[] h1fVarArr = new h1f[i];
            int i2 = 0;
            for (int i3 = 0; i3 < up8VarArr.length; i3++) {
                i1f i1fVarM = up8VarArr[i3].m();
                int i4 = i1fVarM.a;
                int i5 = 0;
                while (i5 < i4) {
                    h1f h1fVarA = i1fVarM.a(i5);
                    int i6 = h1fVarA.a;
                    rr5[] rr5VarArr = new rr5[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        rr5 rr5Var = h1fVarA.d[i7];
                        qr5 qr5VarA = rr5Var.a();
                        String str = rr5Var.n;
                        up8[] up8VarArr2 = up8VarArr;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str2 = rr5Var.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb.append(str2);
                        qr5VarA.a = sb.toString();
                        if (str != null) {
                            qr5VarA.m = i3 + ":" + str;
                        }
                        rr5VarArr[i7] = new rr5(qr5VarA);
                        i7++;
                        up8VarArr = up8VarArr2;
                    }
                    up8[] up8VarArr3 = up8VarArr;
                    h1f h1fVar = new h1f(i3 + ":" + h1fVarA.b, rr5VarArr);
                    this.e.put(h1fVar, h1fVarA);
                    h1fVarArr[i2] = h1fVar;
                    i5++;
                    i2++;
                    up8VarArr = up8VarArr3;
                }
            }
            this.g = new i1f(h1fVarArr);
            tp8 tp8Var = this.f;
            tp8Var.getClass();
            tp8Var.a(this);
        }
    }

    @Override // defpackage.up8
    public final long b(n55[] n55VarArr, boolean[] zArr, occ[] occVarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[n55VarArr.length];
        int[] iArr2 = new int[n55VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = n55VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            occ occVar = occVarArr[i2];
            Integer num = occVar == null ? null : (Integer) identityHashMap.get(occVar);
            iArr[i2] = num == null ? -1 : num.intValue();
            n55 n55Var = n55VarArr[i2];
            if (n55Var != null) {
                String str = n55Var.b().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = n55VarArr.length;
        occ[] occVarArr2 = new occ[length2];
        occ[] occVarArr3 = new occ[n55VarArr.length];
        n55[] n55VarArr2 = new n55[n55VarArr.length];
        up8[] up8VarArr = this.a;
        ArrayList arrayList = new ArrayList(up8VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < up8VarArr.length) {
            int i4 = i;
            while (i4 < n55VarArr.length) {
                occVarArr3[i4] = iArr[i4] == i3 ? occVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    n55 n55Var2 = n55VarArr[i4];
                    n55Var2.getClass();
                    h1f h1fVar = (h1f) this.e.get(n55Var2.b());
                    h1fVar.getClass();
                    n55VarArr2[i4] = new us8(n55Var2, h1fVar);
                } else {
                    n55VarArr2[i4] = null;
                }
                i4++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            up8[] up8VarArr2 = up8VarArr;
            int i5 = i3;
            long jB = up8VarArr2[i3].b(n55VarArr2, zArr, occVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jB;
            } else if (jB != j2) {
                qc0.p("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < n55VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    occ occVar2 = occVarArr3[i6];
                    occVar2.getClass();
                    occVarArr2[i6] = occVarArr3[i6];
                    identityHashMap.put(occVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr3[i6] == i5) {
                    pa7.J(occVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(up8VarArr2[i5]);
            }
            i3 = i5 + 1;
            up8VarArr = up8VarArr2;
            iArr = iArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(occVarArr2, i7, occVarArr, i7, length2);
        this.v = (up8[]) arrayList.toArray(new up8[i7]);
        this.w = new ig2(arrayList, tq.P(arrayList, new t51(10)));
        return j2;
    }

    @Override // defpackage.up8
    public final void c() {
        for (up8 up8Var : this.a) {
            up8Var.c();
        }
    }

    @Override // defpackage.eyc
    public final long d() {
        return this.w.d();
    }

    @Override // defpackage.up8
    public final long e(long j, ysc yscVar) {
        up8[] up8VarArr = this.v;
        return (up8VarArr.length > 0 ? up8VarArr[0] : this.a[0]).e(j, yscVar);
    }

    @Override // defpackage.up8
    public final void f() {
        for (up8 up8Var : this.a) {
            up8Var.f();
        }
    }

    @Override // defpackage.up8
    public final long g(long j) {
        long jG = this.v[0].g(j);
        int i = 1;
        while (true) {
            up8[] up8VarArr = this.v;
            if (i >= up8VarArr.length) {
                return jG;
            }
            if (up8VarArr[i].g(jG) != jG) {
                qc0.p("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // defpackage.up8
    public final void h(long j) {
        for (up8 up8Var : this.v) {
            up8Var.h(j);
        }
    }

    @Override // defpackage.eyc
    public final boolean i() {
        return this.w.i();
    }

    @Override // defpackage.tp8
    public final void j(eyc eycVar) {
        tp8 tp8Var = this.f;
        tp8Var.getClass();
        tp8Var.j(this);
    }

    @Override // defpackage.up8
    public final long k() {
        long j;
        up8 up8Var;
        up8[] up8VarArr = this.v;
        int length = up8VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            up8 up8Var2 = up8VarArr[i];
            long jK = up8Var2.k();
            if (jK == j2) {
                j = j2;
                if (j3 != j && up8Var2.g(j3) != j3) {
                    qc0.p("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                up8[] up8VarArr2 = this.v;
                int length2 = up8VarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (up8Var = up8VarArr2[i2]) == up8Var2) {
                        break;
                    }
                    if (up8Var.g(jK) != jK) {
                        qc0.p("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = jK;
            } else {
                j = j2;
                if (jK != j3) {
                    qc0.p("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // defpackage.up8
    public final void l(tp8 tp8Var, long j) {
        this.f = tp8Var;
        ArrayList arrayList = this.d;
        up8[] up8VarArr = this.a;
        Collections.addAll(arrayList, up8VarArr);
        for (up8 up8Var : up8VarArr) {
            up8Var.l(this, j);
        }
    }

    @Override // defpackage.up8
    public final i1f m() {
        i1f i1fVar = this.g;
        i1fVar.getClass();
        return i1fVar;
    }

    @Override // defpackage.eyc
    public final boolean o(da8 da8Var) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.w.o(da8Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((up8) arrayList.get(i)).o(da8Var);
        }
        return false;
    }

    @Override // defpackage.eyc
    public final long p() {
        return this.w.p();
    }

    @Override // defpackage.eyc
    public final void r(long j) {
        this.w.r(j);
    }
}

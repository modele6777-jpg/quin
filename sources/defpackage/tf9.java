package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tf9 extends dg9 {
    public final i09 c;
    public final jf8 d;
    public final gg8 e;
    public yf9 f;
    public hia g;
    public boolean h;
    public boolean i;
    public boolean j;

    public tf9(i09 i09Var) {
        this.c = i09Var;
        jf8 jf8Var = new jf8();
        jf8Var.c = new long[2];
        this.d = jf8Var;
        this.e = new gg8(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0296  */
    /* JADX WARN: Code duplicated, block: B:127:0x029a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x02a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x0184  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [i09] */
    /* JADX WARN: Type inference failed for: r5v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [i09] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [p89] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [p89] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    @Override // defpackage.dg9
    public final boolean a(gg8 gg8Var, bv7 bv7Var, egh eghVar, boolean z) {
        jf8 jf8Var;
        gg8 gg8Var2;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        hia hiaVar;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        boolean zA = super.a(gg8Var, bv7Var, eghVar, z);
        ?? M0 = this.c;
        if (M0.Y) {
            ?? p89Var = 0;
            while (M0 != 0) {
                if (M0 instanceof ria) {
                    this.f = vd0.p0((ria) M0, 16);
                } else if ((M0.c & 16) != 0 && (M0 instanceof sv3)) {
                    i09 i09Var = ((sv3) M0).E0;
                    int i4 = 0;
                    while (i09Var != null) {
                        if ((i09Var.c & 16) != 0) {
                            i4++;
                            if (i4 == 1) {
                                M0 = M0;
                                p89Var = p89Var;
                                p89Var = p89Var;
                                M0 = i09Var;
                            } else {
                                if (p89Var == 0) {
                                    p89Var = new p89(0, new i09[16]);
                                }
                                if (M0 != 0) {
                                    p89Var.b(M0);
                                    M0 = 0;
                                }
                                p89Var.b(i09Var);
                            }
                        } else {
                            M0 = M0;
                            p89Var = p89Var;
                        }
                        i09Var = i09Var.f;
                        M0 = M0;
                        p89Var = p89Var;
                    }
                    if (i4 == 1) {
                        M0 = M0;
                        p89Var = p89Var;
                    } else {
                        M0 = M0;
                        p89Var = p89Var;
                    }
                }
                M0 = vd0.m0(p89Var);
            }
            if (this.f != null) {
                int iG = gg8Var.g();
                int i5 = 0;
                while (true) {
                    jf8Var = this.d;
                    gg8Var2 = this.e;
                    if (i5 >= iG) {
                        break;
                    }
                    long jD = gg8Var.d(i5);
                    oia oiaVar = (oia) gg8Var.h(i5);
                    if (jf8Var.c(jD)) {
                        long j = oiaVar.g;
                        long j2 = oiaVar.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList(oiaVar.b().size());
                            List listB = oiaVar.b();
                            int size = listB.size();
                            int i6 = 0;
                            while (i6 < size) {
                                List list = listB;
                                vj6 vj6Var = (vj6) listB.get(i6);
                                gg8 gg8Var3 = gg8Var2;
                                long j3 = jD;
                                long j4 = vj6Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = vj6Var.a;
                                    yf9 yf9Var = this.f;
                                    yf9Var.getClass();
                                    arrayList.add(new vj6(j5, yf9Var.O(bv7Var, j4, true), vj6Var.c, vj6Var.d, vj6Var.e));
                                }
                                i6++;
                                size = size;
                                listB = list;
                                gg8Var2 = gg8Var3;
                                jD = j3;
                                oiaVar = oiaVar;
                            }
                            gg8 gg8Var4 = gg8Var2;
                            long j6 = jD;
                            yf9 yf9Var2 = this.f;
                            yf9Var2.getClass();
                            long jO = yf9Var2.O(bv7Var, j, true);
                            yf9 yf9Var3 = this.f;
                            yf9Var3.getClass();
                            oia oiaVar2 = new oia(oiaVar.a, oiaVar.b, yf9Var3.O(bv7Var, j2, true), oiaVar.d, oiaVar.e, oiaVar.f, jO, oiaVar.h, oiaVar.i, arrayList, oiaVar.j, oiaVar.k, oiaVar.l, oiaVar.n);
                            oia oiaVar3 = oiaVar.q;
                            if (oiaVar3 == null) {
                                oiaVar3 = oiaVar;
                            }
                            oiaVar2.q = oiaVar3;
                            oia oiaVar4 = oiaVar.q;
                            if (oiaVar4 != null) {
                                oiaVar = oiaVar4;
                            }
                            oiaVar2.q = oiaVar;
                            gg8Var4.e(j6, oiaVar2);
                        }
                    }
                    i5++;
                    iG = iG;
                    zA = zA;
                }
                boolean z7 = zA;
                if (gg8Var2.g() == 0) {
                    jf8Var.b = 0;
                    this.a.g();
                    return true;
                }
                int i7 = jf8Var.b;
                while (true) {
                    i7--;
                    if (-1 >= i7) {
                        break;
                    }
                    if (!gg8Var.b(jf8Var.c[i7]) && i7 < (i3 = jf8Var.b)) {
                        int i8 = i3 - 1;
                        int i9 = i7;
                        while (i9 < i8) {
                            long[] jArr = jf8Var.c;
                            int i10 = i9 + 1;
                            jArr[i9] = jArr[i10];
                            i9 = i10;
                        }
                        jf8Var.b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(gg8Var2.g());
                int iG2 = gg8Var2.g();
                for (int i11 = 0; i11 < iG2; i11++) {
                    arrayList2.add(gg8Var2.h(i11));
                }
                hia hiaVar2 = new hia(arrayList2, eghVar);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i12);
                    if (eghVar.b(((oia) obj).a)) {
                        break;
                    }
                    i12++;
                }
                oia oiaVar5 = (oia) obj;
                if (oiaVar5 != null) {
                    boolean z8 = oiaVar5.d;
                    if (z) {
                        z2 = false;
                        z5 = this.i;
                        if (!z5 && (z8 || oiaVar5.h)) {
                            yf9 yf9Var4 = this.f;
                            yf9Var4.getClass();
                            long j7 = yf9Var4.c;
                            long j8 = oiaVar5.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            z3 = true;
                            z5 = !((fIntBitsToFloat < 0.0f) | (fIntBitsToFloat > ((float) ((int) (j7 >> 32)))) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) ((int) (j7 & 4294967295L)))));
                            this.i = z5;
                        }
                        z6 = this.h;
                        if (z5 == z6 && ((i2 = hiaVar2.f) == 3 || i2 == 4 || i2 == 5)) {
                            hiaVar2.f = z5 ? 4 : 5;
                        } else {
                            i = hiaVar2.f;
                            if (i != 4 && z6 && !this.j) {
                                hiaVar2.f = 3;
                            } else if (i == 5 && z5 && z8) {
                                hiaVar2.f = 3;
                            }
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                        z5 = false;
                    }
                    z3 = true;
                    z6 = this.h;
                    if (z5 == z6) {
                        i = hiaVar2.f;
                        if (i != 4) {
                            if (i == 5) {
                                hiaVar2.f = 3;
                            }
                        } else if (i == 5) {
                            hiaVar2.f = 3;
                        }
                    } else {
                        i = hiaVar2.f;
                        if (i != 4) {
                            if (i == 5) {
                                hiaVar2.f = 3;
                            }
                        } else if (i == 5) {
                            hiaVar2.f = 3;
                        }
                    }
                } else {
                    z2 = false;
                    z3 = true;
                }
                if (!z7 && hiaVar2.f == 3 && (hiaVar = this.g) != null) {
                    ?? r1 = hiaVar.a;
                    int size3 = r1.size();
                    ?? r4 = hiaVar2.a;
                    if (size3 != r4.size()) {
                        z4 = z3;
                        break;
                    }
                    int size4 = r4.size();
                    ?? r5 = z2;
                    while (true) {
                        if (r5 >= size4) {
                            z4 = z2;
                            break;
                        }
                        if (!hl9.c(((oia) r1.get(r5)).c, ((oia) r4.get(r5)).c)) {
                            z4 = z3;
                            break;
                        }
                        r5++;
                    }
                } else {
                    z4 = z3;
                    break;
                }
                this.g = hiaVar2;
                return z4;
            }
        }
        return true;
    }

    @Override // defpackage.dg9
    public final void b(egh eghVar) {
        super.b(eghVar);
        hia hiaVar = this.g;
        if (hiaVar == null) {
            return;
        }
        this.h = this.i;
        List list = hiaVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            oia oiaVar = (oia) list.get(i);
            boolean z = oiaVar.d;
            long j = oiaVar.a;
            boolean zB = eghVar.b(j);
            boolean z2 = this.i;
            if ((!z && !zB) || (!z && !z2)) {
                this.d.e(j);
            }
        }
        this.i = false;
        this.j = hiaVar.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [p89] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [p89] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [i09] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [i09] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        p89 p89Var = this.a;
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((tf9) objArr[i2]).c();
        }
        ?? M0 = this.c;
        ?? p89Var2 = 0;
        while (M0 != 0) {
            if (M0 instanceof ria) {
                ((ria) M0).N();
            } else if ((M0.c & 16) != 0 && (M0 instanceof sv3)) {
                i09 i09Var = ((sv3) M0).E0;
                int i3 = 0;
                p89Var2 = p89Var2;
                M0 = M0;
                while (i09Var != null) {
                    if ((i09Var.c & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            p89Var2 = p89Var2;
                            M0 = i09Var;
                        } else {
                            if (p89Var2 == 0) {
                                p89Var2 = new p89(0, new i09[16]);
                            }
                            if (M0 != 0) {
                                p89Var2.b(M0);
                                M0 = 0;
                            }
                            p89Var2.b(i09Var);
                        }
                    }
                    i09Var = i09Var.f;
                    p89Var2 = p89Var2;
                    M0 = M0;
                }
                if (i3 == 1) {
                }
            }
            M0 = vd0.m0(p89Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [i09] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(egh eghVar) {
        LayoutNode layoutNode;
        gg8 gg8Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (gg8Var.g() != 0) {
            i09 i09Var = this.c;
            if (i09Var.Y) {
                yf9 yf9Var = i09Var.v;
                if ((yf9Var == null || (layoutNode = yf9Var.J0) == null) ? false : layoutNode.X()) {
                    hia hiaVar = this.g;
                    hiaVar.getClass();
                    yf9 yf9Var2 = this.f;
                    yf9Var2.getClass();
                    long j = yf9Var2.c;
                    ?? M0 = i09Var;
                    ?? p89Var = 0;
                    while (M0 != 0) {
                        if (M0 instanceof ria) {
                            ((ria) M0).E(hiaVar, iia.c, j);
                        } else if ((M0.c & 16) != 0 && (M0 instanceof sv3)) {
                            i09 i09Var2 = ((sv3) M0).E0;
                            int i = 0;
                            while (i09Var2 != null) {
                                if ((i09Var2.c & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        M0 = M0;
                                        p89Var = p89Var;
                                        p89Var = p89Var;
                                        M0 = i09Var2;
                                    } else {
                                        if (p89Var == 0) {
                                            p89Var = new p89(0, new i09[16]);
                                        }
                                        if (M0 != 0) {
                                            p89Var.b(M0);
                                            M0 = 0;
                                        }
                                        p89Var.b(i09Var2);
                                    }
                                } else {
                                    M0 = M0;
                                    p89Var = p89Var;
                                }
                                i09Var2 = i09Var2.f;
                                M0 = M0;
                                p89Var = p89Var;
                            }
                            if (i == 1) {
                                M0 = M0;
                                p89Var = p89Var;
                            } else {
                                M0 = M0;
                                p89Var = p89Var;
                            }
                        }
                        M0 = vd0.m0(p89Var);
                    }
                    if (i09Var.Y) {
                        p89 p89Var2 = this.a;
                        Object[] objArr = p89Var2.a;
                        int i2 = p89Var2.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((tf9) objArr[i3]).d(eghVar);
                        }
                    }
                    z = true;
                }
            }
        }
        b(eghVar);
        gg8Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [i09] */
    /* JADX WARN: Type inference failed for: r0v3, types: [i09] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [i09] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [p89] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [p89] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r6v10, types: [i09] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [p89] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [p89] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(egh eghVar, boolean z) {
        LayoutNode layoutNode;
        if (this.e.g() == 0) {
            return false;
        }
        ?? M0 = this.c;
        if (M0.Y) {
            yf9 yf9Var = M0.v;
            if ((yf9Var == null || (layoutNode = yf9Var.J0) == null) ? false : layoutNode.X()) {
                hia hiaVar = this.g;
                hiaVar.getClass();
                yf9 yf9Var2 = this.f;
                yf9Var2.getClass();
                long j = yf9Var2.c;
                ?? M1 = M0;
                ?? p89Var = 0;
                while (M1 != 0) {
                    if (M1 instanceof ria) {
                        ((ria) M1).E(hiaVar, iia.a, j);
                    } else if ((M1.c & 16) != 0 && (M1 instanceof sv3)) {
                        i09 i09Var = ((sv3) M1).E0;
                        int i = 0;
                        while (i09Var != null) {
                            if ((i09Var.c & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    M1 = M1;
                                    p89Var = p89Var;
                                    p89Var = p89Var;
                                    M1 = i09Var;
                                } else {
                                    if (p89Var == 0) {
                                        p89Var = new p89(0, new i09[16]);
                                    }
                                    if (M1 != 0) {
                                        p89Var.b(M1);
                                        M1 = 0;
                                    }
                                    p89Var.b(i09Var);
                                }
                            } else {
                                M1 = M1;
                                p89Var = p89Var;
                            }
                            i09Var = i09Var.f;
                            M1 = M1;
                            p89Var = p89Var;
                        }
                        if (i == 1) {
                            M1 = M1;
                            p89Var = p89Var;
                        } else {
                            M1 = M1;
                            p89Var = p89Var;
                        }
                    }
                    M1 = vd0.m0(p89Var);
                }
                if (M0.Y) {
                    p89 p89Var2 = this.a;
                    Object[] objArr = p89Var2.a;
                    int i2 = p89Var2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        tf9 tf9Var = (tf9) objArr[i3];
                        this.f.getClass();
                        tf9Var.e(eghVar, z);
                    }
                }
                if (M0.Y) {
                    ?? p89Var3 = 0;
                    while (M0 != 0) {
                        if (M0 instanceof ria) {
                            ((ria) M0).E(hiaVar, iia.b, j);
                        } else if ((M0.c & 16) != 0 && (M0 instanceof sv3)) {
                            i09 i09Var2 = ((sv3) M0).E0;
                            int i4 = 0;
                            while (i09Var2 != null) {
                                if ((i09Var2.c & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        M0 = M0;
                                        p89Var3 = p89Var3;
                                        p89Var3 = p89Var3;
                                        M0 = i09Var2;
                                    } else {
                                        if (p89Var3 == 0) {
                                            p89Var3 = new p89(0, new i09[16]);
                                        }
                                        if (M0 != 0) {
                                            p89Var3.b(M0);
                                            M0 = 0;
                                        }
                                        p89Var3.b(i09Var2);
                                    }
                                } else {
                                    M0 = M0;
                                    p89Var3 = p89Var3;
                                }
                                i09Var2 = i09Var2.f;
                                M0 = M0;
                                p89Var3 = p89Var3;
                            }
                            if (i4 == 1) {
                                M0 = M0;
                                p89Var3 = p89Var3;
                            } else {
                                M0 = M0;
                                p89Var3 = p89Var3;
                            }
                        }
                        M0 = vd0.m0(p89Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, i79 i79Var) {
        jf8 jf8Var = this.d;
        if (jf8Var.c(j) && i79Var.c(this) < 0) {
            jf8Var.e(j);
            this.e.f(j);
        }
        p89 p89Var = this.a;
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((tf9) objArr[i2]).f(j, i79Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}

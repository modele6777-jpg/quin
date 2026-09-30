package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jj7 {
    public final a80 a;
    public int b;

    public jj7(dh7 dh7Var, a80 a80Var) {
        this.a = a80Var;
    }

    public final nh7 a() {
        nh7 ti7Var;
        Object obj;
        a80 a80Var = this.a;
        byte bX = a80Var.x();
        if (bX == 1) {
            return d(true);
        }
        if (bX == 0) {
            return d(false);
        }
        if (bX != 6) {
            if (bX == 8) {
                return b();
            }
            a80.n(a80Var, "Cannot read Json element because of unexpected ".concat(i7h.L(bX)), 0, null, 6);
            throw null;
        }
        int i = this.b + 1;
        this.b = i;
        if (i == 200) {
            hj7 hj7Var = new hj7(this, null);
            ym3 ym3Var = new ym3();
            ym3Var.a = hj7Var;
            ym3Var.b = ym3Var;
            bw2 bw2Var = y7h.i;
            ym3Var.c = bw2Var;
            while (true) {
                obj = ym3Var.c;
                xn2 xn2Var = ym3Var.b;
                if (xn2Var == null) {
                    break;
                }
                if (pa7.t(bw2Var, obj)) {
                    try {
                        hj7 hj7Var2 = ym3Var.a;
                        wef wefVar = wef.a;
                        z7f.t(3, hj7Var2);
                        Object objM = hj7Var2.m(ym3Var, wefVar, xn2Var);
                        if (objM != bw2.a) {
                            xn2Var.g(objM);
                        }
                    } catch (Throwable th) {
                        xn2Var.g(new dzb(th));
                    }
                } else {
                    ym3Var.c = bw2Var;
                    xn2Var.g(obj);
                }
            }
            jzb.q(obj);
            ti7Var = (nh7) obj;
        } else {
            byte bH = a80Var.h((byte) 6);
            if (a80Var.x() == 4) {
                a80.n(a80Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (a80Var.d()) {
                String strK = a80Var.k();
                a80Var.h((byte) 5);
                linkedHashMap.put(strK, a());
                bH = a80Var.g();
                if (bH != 4) {
                    if (bH == 7) {
                        break;
                    }
                    a80.n(a80Var, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bH == 6) {
                a80Var.h((byte) 7);
            } else if (bH == 4) {
                kj0.l0(a80Var, "object");
                throw null;
            }
            ti7Var = new ti7(linkedHashMap);
        }
        this.b--;
        return ti7Var;
    }

    public final yg7 b() {
        a80 a80Var = this.a;
        byte bG = a80Var.g();
        if (a80Var.x() == 4) {
            a80.n(a80Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (a80Var.d()) {
            arrayList.add(a());
            bG = a80Var.g();
            if (bG != 4) {
                boolean z = bG == 9;
                int i = a80Var.b;
                if (!z) {
                    a80.n(a80Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bG == 8) {
            a80Var.h((byte) 9);
        } else if (bG == 4) {
            kj0.l0(a80Var, "array");
            throw null;
        }
        return new yg7(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ym3 ym3Var, pt0 pt0Var) {
        ij7 ij7Var;
        byte bH;
        LinkedHashMap linkedHashMap;
        ym3 ym3Var2;
        int i;
        jj7 jj7Var;
        byte bG;
        LinkedHashMap linkedHashMap2;
        a80 a80Var;
        if (pt0Var instanceof ij7) {
            ij7Var = (ij7) pt0Var;
            int i2 = ij7Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ij7Var.label = i2 - Integer.MIN_VALUE;
            } else {
                ij7Var = new ij7(this, pt0Var);
            }
        } else {
            ij7Var = new ij7(this, pt0Var);
        }
        Object obj = ij7Var.result;
        int i3 = ij7Var.label;
        if (i3 != 0) {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = ij7Var.I$0;
            String str = (String) ij7Var.L$3;
            linkedHashMap2 = (LinkedHashMap) ij7Var.L$2;
            jj7Var = (jj7) ij7Var.L$1;
            ym3Var2 = (ym3) ij7Var.L$0;
            jzb.q(obj);
            linkedHashMap2.put(str, (nh7) obj);
            bG = jj7Var.a.g();
            if (bG == 4) {
                linkedHashMap = linkedHashMap2;
                bH = bG;
                i = i4;
                this = jj7Var;
            } else if (bG != 7) {
                a80.n(jj7Var.a, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            a80Var = jj7Var.a;
            if (bG == 6) {
                a80Var.h((byte) 7);
            } else if (bG == 4) {
                kj0.l0(a80Var, "object");
                throw null;
            }
            return new ti7(linkedHashMap2);
        }
        jzb.q(obj);
        a80 a80Var2 = this.a;
        bH = a80Var2.h((byte) 6);
        if (a80Var2.x() == 4) {
            a80.n(a80Var2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        ym3Var2 = ym3Var;
        i = 0;
        a80 a80Var3 = this.a;
        if (!a80Var3.d()) {
            jj7Var = this;
            bG = bH;
            linkedHashMap2 = linkedHashMap;
            a80Var = jj7Var.a;
            if (bG == 6) {
                a80Var.h((byte) 7);
            } else if (bG == 4) {
                kj0.l0(a80Var, "object");
                throw null;
            }
            return new ti7(linkedHashMap2);
        }
        String strK = a80Var3.k();
        a80Var3.h((byte) 5);
        ij7Var.L$0 = ym3Var2;
        ij7Var.L$1 = this;
        ij7Var.L$2 = linkedHashMap;
        ij7Var.L$3 = strK;
        ij7Var.I$0 = i;
        ij7Var.B$0 = bH;
        ij7Var.I$1 = 0;
        ij7Var.label = 1;
        ym3Var2.getClass();
        ym3Var2.b = ij7Var;
        return bw2.a;
    }

    public final yi7 d(boolean z) {
        a80 a80Var = this.a;
        String strL = !z ? a80Var.l() : a80Var.k();
        return (z || !pa7.t(strL, "null")) ? new yh7(strL, z, null) : qi7.INSTANCE;
    }
}

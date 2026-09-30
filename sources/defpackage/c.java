package defpackage;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final a71 a;
    public static final a71 b;
    public static final a71 c;
    public static final a71 d;
    public static final a71 e;

    static {
        a71 a71Var = a71.c;
        a = m8c.u("/");
        b = m8c.u("\\");
        c = m8c.u("/\\");
        d = m8c.u(".");
        e = m8c.u("..");
    }

    public static final e1a a(e1a e1aVar, e1a e1aVar2, boolean z) {
        e1aVar2.getClass();
        if (c(e1aVar2) != -1 || e1aVar2.f() != null) {
            return e1aVar2;
        }
        a71 a71VarB = b(e1aVar);
        if (a71VarB == null && (a71VarB = b(e1aVar2)) == null) {
            a71VarB = f(e1a.b);
        }
        f41 f41Var = new f41();
        f41Var.f1(e1aVar.a);
        if (f41Var.b > 0) {
            f41Var.f1(a71VarB);
        }
        f41Var.f1(e1aVar2.a);
        return d(f41Var, z);
    }

    public static final a71 b(e1a e1aVar) {
        a71 a71Var = e1aVar.a;
        a71 a71Var2 = a;
        if (a71.i(a71Var, a71Var2) != -1) {
            return a71Var2;
        }
        a71 a71Var3 = e1aVar.a;
        a71 a71Var4 = b;
        if (a71.i(a71Var3, a71Var4) != -1) {
            return a71Var4;
        }
        return null;
    }

    public static final int c(e1a e1aVar) {
        a71 a71Var = e1aVar.a;
        if (a71Var.e() != 0) {
            if (a71Var.k(0) != 47) {
                if (a71Var.k(0) == 92) {
                    if (a71Var.e() > 2 && a71Var.k(1) == 92) {
                        a71 a71Var2 = b;
                        a71Var2.getClass();
                        int iH = a71Var.h(a71Var2.j(), 2);
                        return iH == -1 ? a71Var.e() : iH;
                    }
                } else if (a71Var.e() > 2 && a71Var.k(1) == 58 && a71Var.k(2) == 92) {
                    char cK = (char) a71Var.k(0);
                    if ('a' <= cK && cK < '{') {
                        return 3;
                    }
                    if ('A' <= cK && cK < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00fe A[SYNTHETIC] */
    public static final e1a d(f41 f41Var, boolean z) throws EOFException {
        a71 a71Var;
        long j;
        char cG;
        boolean z2;
        ArrayList arrayList;
        boolean zE;
        a71 a71Var2;
        int size;
        int i;
        long jW;
        a71 a71VarP0;
        a71 a71Var3;
        f41 f41Var2 = new f41();
        a71 a71VarE = null;
        int i2 = 0;
        while (true) {
            if (!f41Var.I(0L, a)) {
                a71Var = b;
                if (!f41Var.I(0L, a71Var)) {
                    break;
                }
            }
            byte bH0 = f41Var.h0();
            if (a71VarE == null) {
                a71VarE = e(bH0);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && pa7.t(a71VarE, a71Var);
        a71 a71Var4 = c;
        if (z3) {
            a71VarE.getClass();
            f41Var2.f1(a71VarE);
            f41Var2.f1(a71VarE);
        } else {
            if (i2 <= 0) {
                long jW2 = f41Var.W(a71Var4);
                if (a71VarE == null) {
                    a71VarE = jW2 == -1 ? f(e1a.b) : e(f41Var.G(jW2));
                }
                if (pa7.t(a71VarE, a71Var) && f41Var.b >= 2) {
                    j = -1;
                    if (f41Var.G(1L) == 58 && (('a' <= (cG = (char) f41Var.G(0L)) && cG < '{') || ('A' <= cG && cG < '['))) {
                        if (jW2 == 2) {
                            f41Var2.M0(f41Var, 3L);
                        } else {
                            f41Var2.M0(f41Var, 2L);
                        }
                    }
                }
                if (f41Var2.b > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zE = f41Var.E();
                    a71Var2 = d;
                    if (!zE) {
                        break;
                    }
                    jW = f41Var.W(a71Var4);
                    if (jW == j) {
                        a71VarP0 = f41Var.p0(f41Var.b);
                    } else {
                        a71VarP0 = f41Var.p0(jW);
                        f41Var.h0();
                    }
                    a71Var3 = e;
                    if (pa7.t(a71VarP0, a71Var3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || pa7.t(s72.F0(arrayList), a71Var3)))) {
                                arrayList.add(a71VarP0);
                            } else if (!z3 || arrayList.size() != 1) {
                                x72.l0(arrayList);
                            }
                        }
                    } else if (pa7.t(a71VarP0, a71Var2) && !pa7.t(a71VarP0, a71.c)) {
                        arrayList.add(a71VarP0);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        f41Var2.f1(a71VarE);
                    }
                    f41Var2.f1((a71) arrayList.get(i));
                }
                if (f41Var2.b == 0) {
                    f41Var2.f1(a71Var2);
                }
                return new e1a(f41Var2.p0(f41Var2.b));
            }
            a71VarE.getClass();
            f41Var2.f1(a71VarE);
        }
        j = -1;
        if (f41Var2.b > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zE = f41Var.E();
            a71Var2 = d;
            if (!zE) {
                break;
                break;
            }
            jW = f41Var.W(a71Var4);
            if (jW == j) {
                a71VarP0 = f41Var.p0(f41Var.b);
            } else {
                a71VarP0 = f41Var.p0(jW);
                f41Var.h0();
            }
            a71Var3 = e;
            if (pa7.t(a71VarP0, a71Var3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(a71VarP0);
            } else if (pa7.t(a71VarP0, a71Var2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                f41Var2.f1(a71VarE);
            }
            f41Var2.f1((a71) arrayList.get(i));
        }
        if (f41Var2.b == 0) {
            f41Var2.f1(a71Var2);
        }
        return new e1a(f41Var2.p0(f41Var2.b));
    }

    public static final a71 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        qc0.j(tec.e(b2, "not a directory separator: "));
        return null;
    }

    public static final a71 f(String str) {
        if (pa7.t(str, "/")) {
            return a;
        }
        if (pa7.t(str, "\\")) {
            return b;
        }
        qc0.j(ub3.i("not a directory separator: ", str));
        return null;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fo7 {
    public static final fo7 c;
    public static final fo7 d;
    public final Map a;
    public final boolean b;

    static {
        qu4 qu4Var = qu4.a;
        c = new fo7(qu4Var, false);
        d = new fo7(qu4Var, true);
    }

    public fo7(Map map, boolean z) {
        map.getClass();
        this.a = map;
        this.b = z;
    }

    public final fo7 a(boolean z) {
        if (z == this.b) {
            return this;
        }
        Map map = this.a;
        if (!map.isEmpty() || z) {
            return (map.isEmpty() && z) ? d : new fo7(map, z);
        }
        return c;
    }

    public final do7 b(yn7 yn7Var, io7 io7Var) {
        yn7Var.getClass();
        io7Var.getClass();
        do7 do7VarD = d(yn7Var, io7Var);
        boolean z = this.b;
        if (z) {
            yn7 yn7Var2 = do7VarD.b;
            return new do7(yn7Var2 != null ? x57.M(yn7Var2, yn7Var2) : null, do7VarD.a);
        }
        if (!z) {
            return do7VarD;
        }
        ap.c();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0134  */
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0116  */
    /* JADX WARN: Code duplicated, block: B:92:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x0130  */
    public final do7 d(yn7 yn7Var, io7 io7Var) {
        w4c w4cVar;
        boolean z;
        boolean z2;
        j2 j2Var;
        j2 j2Var2;
        j2 j2VarF;
        j2 j2VarY;
        Map map = this.a;
        if (map.isEmpty()) {
            return new do7(yn7Var, io7Var);
        }
        boolean z3 = yn7Var instanceof j2;
        j2 j2Var3 = z3 ? (j2) yn7Var : null;
        j2 j2VarY2 = j2Var3 != null ? j2Var3.y() : null;
        j2 j2Var4 = z3 ? (j2) yn7Var : null;
        j2 j2VarF2 = j2Var4 != null ? j2Var4.F() : null;
        if (j2VarY2 != null && j2VarF2 != null) {
            do7 do7VarD = d(j2VarY2, io7Var);
            yn7 yn7Var2 = do7VarD.b;
            j2 j2Var5 = yn7Var2 instanceof j2 ? (j2) yn7Var2 : null;
            if (j2Var5 != null && (j2VarY = j2Var5.y()) != null) {
                do7VarD = new do7(j2VarY, do7VarD.a);
            }
            do7 do7VarD2 = d(j2VarF2, io7Var);
            yn7 yn7Var3 = do7VarD2.b;
            j2 j2Var6 = yn7Var3 instanceof j2 ? (j2) yn7Var3 : null;
            if (j2Var6 != null && (j2VarF = j2Var6.F()) != null) {
                do7VarD2 = new do7(j2VarF, do7VarD2.a);
            }
            yn7 yn7Var4 = do7VarD2.b;
            yn7 yn7Var5 = do7VarD.b;
            return (yn7Var4 == null || yn7Var5 == null) ? do7.c : new do7(t4c.q(yn7Var5, yn7Var4, ((j2) yn7Var).u()), do7VarD.a);
        }
        um7 um7VarB = yn7Var.B();
        if (um7VarB == null) {
            return new do7(yn7Var, io7Var);
        }
        do7 do7Var = (do7) map.get(um7VarB);
        if (do7Var == null) {
            if (!yn7Var.A().isEmpty()) {
                List<do7> listA = yn7Var.A();
                ArrayList arrayList = new ArrayList(t72.u(listA, 10));
                for (do7 do7Var2 : listA) {
                    io7 io7Var2 = do7Var2.a;
                    yn7 yn7Var6 = do7Var2.b;
                    arrayList.add((yn7Var6 == null || io7Var2 == null) ? do7.c : d(yn7Var6, io7Var2));
                }
                boolean zO = yn7Var.o();
                List annotations = yn7Var.getAnnotations();
                j2 j2Var7 = yn7Var instanceof j2 ? (j2) yn7Var : null;
                yn7Var = qn4.y(um7VarB, arrayList, zO, annotations, j2Var7 != null ? j2Var7.f() : null);
            }
            return new do7(yn7Var, io7Var);
        }
        yn7 yn7VarZ = do7Var.b;
        io7 io7Var3 = do7Var.a;
        if (yn7VarZ == null || io7Var3 == null) {
            return do7Var;
        }
        io7 io7Var4 = io7.a;
        if (io7Var3 != io7Var4) {
            if (io7Var != io7Var4 && io7Var3 != io7Var) {
                qc0.p("CONFLICTING_PROJECTION");
                return null;
            }
            io7Var = io7Var3;
        }
        if (yn7Var instanceof xt7) {
            xt7 xt7Var = (xt7) yn7Var;
            if (((!(xt7Var instanceof j2) || ((j2) xt7Var).y() == null) ? null : (dj5) xt7Var) == null) {
                if (yn7VarZ instanceof j2) {
                    j2 j2Var8 = (j2) yn7VarZ;
                    j2 j2VarY3 = j2Var8.y();
                    Boolean boolValueOf = j2VarY3 != null ? Boolean.valueOf(j2VarY3.o()) : null;
                    j2 j2VarF3 = j2Var8.F();
                    if (pa7.t(boolValueOf, j2VarF3 != null ? Boolean.valueOf(j2VarF3.o()) : null) || yn7Var.o()) {
                        w4cVar = (w4c) yn7VarZ;
                        z = false;
                        if (yn7Var.o()) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        j2 j2VarC = ((j2) w4cVar).C(z2);
                        if (yn7Var instanceof j2) {
                            j2Var = (j2) yn7Var;
                        } else {
                            j2Var = null;
                        }
                        if (j2Var == null) {
                            if (w4cVar instanceof j2) {
                            }
                            if (j2Var2 != null) {
                                z = true;
                            }
                        } else {
                            if (w4cVar instanceof j2) {
                            }
                            if (j2Var2 != null) {
                                z = true;
                            }
                        }
                        yn7VarZ = j2VarC.z(z);
                    }
                } else {
                    w4cVar = (w4c) yn7VarZ;
                    z = false;
                    if (yn7Var.o() || yn7VarZ.o()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    j2 j2VarC2 = ((j2) w4cVar).C(z2);
                    if (yn7Var instanceof j2) {
                        j2Var = (j2) yn7Var;
                    } else {
                        j2Var = null;
                    }
                    if (j2Var == null && j2Var.m()) {
                        z = true;
                    } else {
                        j2Var2 = w4cVar instanceof j2 ? (j2) w4cVar : null;
                        if (j2Var2 != null && j2Var2.m() && !yn7Var.o()) {
                            z = true;
                        }
                    }
                    yn7VarZ = j2VarC2.z(z);
                }
                return new do7(yn7VarZ, io7Var);
            }
        }
        r82.e(yn7Var, "' must be non flexible", "'");
        return null;
    }
}

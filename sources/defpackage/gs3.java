package defpackage;

import java.util.HashMap;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gs3 {
    public static final bl0 h = new bl0(1);
    public static final Random i = new Random();
    public sp8 d;
    public String f;
    public final fye a = new fye();
    public final eye b = new eye();
    public final HashMap c = new HashMap();
    public gye e = gye.a;
    public long g = -1;

    public final void a(fs3 fs3Var) {
        long j = fs3Var.c;
        if (j != -1 && fs3Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final fs3 b(int i2, zp8 zp8Var) {
        long j;
        long j2;
        long j3;
        HashMap map = this.c;
        fs3 fs3Var = null;
        long j4 = Long.MAX_VALUE;
        for (fs3 fs3Var2 : map.values()) {
            long j5 = fs3Var2.c;
            zp8 zp8Var2 = fs3Var2.d;
            if (j5 == -1 && i2 == fs3Var2.b && zp8Var != null) {
                long j6 = zp8Var.d;
                gs3 gs3Var = fs3Var2.g;
                j = -1;
                fs3 fs3Var3 = (fs3) gs3Var.c.get(gs3Var.f);
                if (fs3Var3 != null) {
                    j3 = fs3Var3.c;
                    if (j3 == -1) {
                        j3 = gs3Var.g + 1;
                    }
                } else {
                    j3 = gs3Var.g + 1;
                }
                if (j6 >= j3) {
                    fs3Var2.c = j6;
                }
            } else {
                j = -1;
            }
            if (zp8Var != null) {
                long j7 = zp8Var.d;
                if (j7 != j) {
                    if (zp8Var2 == null) {
                        if (!zp8Var.c() && j7 == fs3Var2.c) {
                            j2 = fs3Var2.c;
                            if (j2 != j || j2 < j4) {
                                fs3Var = fs3Var2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = pqf.a;
                                if (fs3Var.d != null && zp8Var2 != null) {
                                    fs3Var = fs3Var2;
                                }
                            }
                        }
                    } else if (j7 == zp8Var2.d && zp8Var.b == zp8Var2.b && zp8Var.c == zp8Var2.c) {
                        j2 = fs3Var2.c;
                        if (j2 != j) {
                        }
                        fs3Var = fs3Var2;
                        j4 = j2;
                    }
                }
            }
            if (i2 == fs3Var2.b) {
                j2 = fs3Var2.c;
                if (j2 != j) {
                }
                fs3Var = fs3Var2;
                j4 = j2;
            }
        }
        if (fs3Var != null) {
            return fs3Var;
        }
        String str2 = (String) h.get();
        fs3 fs3Var4 = new fs3(this, str2, i2, zp8Var);
        map.put(str2, fs3Var4);
        return fs3Var4;
    }

    public final synchronized String c(gye gyeVar, zp8 zp8Var) {
        return b(gyeVar.g(zp8Var.a, this.b).c, zp8Var).a;
    }

    public final void d(pl plVar) {
        zp8 zp8Var;
        gye gyeVar = plVar.b;
        int i2 = plVar.c;
        zp8 zp8Var2 = plVar.d;
        boolean zP = gyeVar.p();
        String str = this.f;
        HashMap map = this.c;
        if (zP) {
            if (str != null) {
                fs3 fs3Var = (fs3) map.get(str);
                fs3Var.getClass();
                a(fs3Var);
                return;
            }
            return;
        }
        fs3 fs3Var2 = (fs3) map.get(str);
        this.f = b(i2, zp8Var2).a;
        e(plVar);
        if (zp8Var2 != null) {
            long j = zp8Var2.d;
            if (zp8Var2.c()) {
                if (fs3Var2 != null && fs3Var2.c == j && (zp8Var = fs3Var2.d) != null && zp8Var.b == zp8Var2.b && zp8Var.c == zp8Var2.c) {
                    return;
                }
                b(i2, new zp8(j, zp8Var2.a));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x001c, B:13:0x0028, B:16:0x002f, B:22:0x003a, B:24:0x0046, B:26:0x004c, B:32:0x0057, B:34:0x0063, B:35:0x0067, B:37:0x006c, B:39:0x0072, B:41:0x0089, B:42:0x00b6, B:44:0x00ba, B:45:0x00c1, B:47:0x00cb, B:49:0x00cf), top: B:54:0x0001 }] */
    public final synchronized void e(pl plVar) {
        long j;
        this.d.getClass();
        if (plVar.b.p()) {
            return;
        }
        zp8 zp8Var = plVar.d;
        if (zp8Var != null) {
            long j2 = zp8Var.d;
            if (j2 != -1) {
                fs3 fs3Var = (fs3) this.c.get(this.f);
                if (fs3Var != null) {
                    j = fs3Var.c;
                    if (j == -1) {
                        j = this.g + 1;
                    }
                } else {
                    j = this.g + 1;
                }
                if (j2 < j) {
                    return;
                }
            }
            fs3 fs3Var2 = (fs3) this.c.get(this.f);
            if (fs3Var2 != null && fs3Var2.c == -1 && fs3Var2.b != plVar.c) {
                return;
            }
        }
        fs3 fs3VarB = b(plVar.c, plVar.d);
        if (this.f == null) {
            this.f = fs3VarB.a;
        }
        zp8 zp8Var2 = plVar.d;
        if (zp8Var2 != null && zp8Var2.c()) {
            zp8 zp8Var3 = plVar.d;
            fs3 fs3VarB2 = b(plVar.c, new zp8(zp8Var3.a, zp8Var3.d, zp8Var3.b));
            if (!fs3VarB2.e) {
                fs3VarB2.e = true;
                plVar.b.g(plVar.d.a, this.b);
                this.b.d(plVar.d.b);
                Math.max(0L, pqf.R(0L) + pqf.R(this.b.e));
                this.d.getClass();
            }
        }
        if (!fs3VarB.e) {
            fs3VarB.e = true;
            this.d.getClass();
        }
        if (fs3VarB.a.equals(this.f) && !fs3VarB.f) {
            fs3VarB.f = true;
            this.d.l(plVar, fs3VarB.a);
        }
    }
}

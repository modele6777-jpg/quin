package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t81 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public sp3 e;

    public t81(int i, String str, sp3 sp3Var) {
        this.a = i;
        this.b = str;
        this.e = sp3Var;
    }

    public final long a() {
        zid zidVarB = b(0L, Long.MAX_VALUE);
        long j = zidVarB.c;
        if (!zidVarB.d) {
            if (j == -1) {
                j = Long.MAX_VALUE;
            }
            return -Math.min(j, Long.MAX_VALUE);
        }
        long jMax = zidVarB.b + j;
        if (jMax < Long.MAX_VALUE) {
            for (zid zidVar : this.c.tailSet(zidVarB, false)) {
                long j2 = zidVar.b;
                if (j2 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j2 + zidVar.c);
                if (jMax >= Long.MAX_VALUE) {
                    break;
                }
            }
        }
        return Math.min(jMax, Long.MAX_VALUE);
    }

    public final zid b(long j, long j2) {
        long jMin = j2;
        zid zidVar = new zid(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        zid zidVar2 = (zid) treeSet.floor(zidVar);
        if (zidVar2 != null && zidVar2.b + zidVar2.c > j) {
            return zidVar2;
        }
        zid zidVar3 = (zid) treeSet.ceiling(zidVar);
        if (zidVar3 != null) {
            long j3 = zidVar3.b - j;
            jMin = jMin == -1 ? j3 : Math.min(j3, jMin);
        }
        return new zid(this.b, j, jMin, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            s81 s81Var = (s81) arrayList.get(i);
            long j3 = s81Var.a;
            long j4 = s81Var.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t81.class != obj.getClass()) {
            return false;
        }
        t81 t81Var = (t81) obj;
        return this.a == t81Var.a && this.b.equals(t81Var.b) && this.c.equals(t81Var.c) && this.e.equals(t81Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ub3.c(this.a * 31, 31, this.b);
    }
}

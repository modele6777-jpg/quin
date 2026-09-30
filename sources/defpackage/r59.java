package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r59 implements tvc {
    public final w69 a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final boolean e;
    public final vuc f;
    public y69 g;

    public r59(w69 w69Var, ArrayList arrayList, int i, int i2, boolean z, vuc vucVar) {
        this.a = w69Var;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = vucVar;
        if (arrayList.size() > 1) {
            return;
        }
        l37.c("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList.size() + ".");
    }

    @Override // defpackage.tvc
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.tvc
    public final boolean b() {
        return this.e;
    }

    @Override // defpackage.tvc
    public final guc c() {
        return this.e ? k() : h();
    }

    @Override // defpackage.tvc
    public final guc d(long j) {
        y69 y69Var = this.g;
        if (y69Var == null) {
            y69Var = new y69();
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                guc gucVar = (guc) arrayList.get(i);
                long j2 = gucVar.a;
                int iC = y69Var.c(j2);
                Object[] objArr = y69Var.c;
                Object obj = objArr[iC];
                y69Var.b[iC] = j2;
                objArr[iC] = gucVar;
            }
            this.g = y69Var;
        }
        return (guc) y69Var.e(j);
    }

    @Override // defpackage.tvc
    public final vuc e() {
        return this.f;
    }

    @Override // defpackage.tvc
    public final guc f() {
        return i() == c03.a ? h() : k();
    }

    @Override // defpackage.tvc
    public final int g() {
        return this.d;
    }

    @Override // defpackage.tvc
    public final guc h() {
        return (guc) this.b.get(p(this.d, false));
    }

    @Override // defpackage.tvc
    public final c03 i() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return c03.b;
        }
        if (i > i2) {
            return c03.a;
        }
        return ((guc) this.b.get(i / 2)).b();
    }

    @Override // defpackage.tvc
    public final void j(wq6 wq6Var) {
        int iO = o(f().a);
        int iO2 = o((i() == c03.a ? k() : h()).a);
        int i = iO + 1;
        if (i >= iO2) {
            return;
        }
        while (i < iO2) {
            wq6Var.d(this.b.get(i));
            i++;
        }
    }

    @Override // defpackage.tvc
    public final guc k() {
        return (guc) this.b.get(p(this.c, true));
    }

    @Override // defpackage.tvc
    public final int l() {
        return this.c;
    }

    @Override // defpackage.tvc
    public final boolean m(tvc tvcVar) {
        if (this.f != null && tvcVar != null && (tvcVar instanceof r59)) {
            r59 r59Var = (r59) tvcVar;
            ArrayList arrayList = r59Var.b;
            if (this.e == r59Var.e && this.c == r59Var.c && this.d == r59Var.d) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() == arrayList.size()) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        guc gucVar = (guc) arrayList2.get(i);
                        guc gucVar2 = (guc) arrayList.get(i);
                        if (gucVar.a != gucVar2.a || gucVar.c != gucVar2.c || gucVar.d != gucVar2.d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.tvc
    public final y69 n(vuc vucVar) {
        return hcc.g(vucVar, this.b, new d59(1), new wf8(6, vucVar), new q59(vucVar, 0));
    }

    public final int o(long j) {
        try {
            return this.a.c(j);
        } catch (NoSuchElementException e) {
            ho7.r(ks0.i(j, "Invalid selectableId: "), e);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i, boolean z) {
        int iOrdinal = i().ordinal();
        boolean z2 = z;
        if (iOrdinal == 0) {
            z2 = !z ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                ap.c();
                return 0;
            }
        }
        return (i - (!z2)) / 2;
    }

    public final String toString() {
        boolean z = true;
        float f = (this.c + 1) / 2.0f;
        float f2 = (this.d + 1) / 2.0f;
        c03 c03VarI = i();
        StringBuilder sb = new StringBuilder("[\n\t");
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            guc gucVar = (guc) arrayList.get(i);
            if (z) {
                z = false;
            } else {
                sb.append(",\n\t");
            }
            i++;
            sb.append(i + " -> " + gucVar);
        }
        sb.append("\n]");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb2.append(this.e);
        sb2.append(", startPosition=");
        sb2.append(f);
        sb2.append(", endPosition=");
        sb2.append(f2);
        sb2.append(", crossed=");
        sb2.append(c03VarI);
        sb2.append(", infos=");
        return ks0.l(sb2, string, ")");
    }
}

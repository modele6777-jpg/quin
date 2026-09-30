package defpackage;

import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ty5 implements AutoCloseable {
    public final cz5 a;
    public final Set b;
    public final sh0 c;

    public ty5(cz5 cz5Var) {
        c78 c78Var = cz5Var.e;
        ArrayList arrayList = new ArrayList(t72.u(c78Var, 10));
        ListIterator listIterator = c78Var.listIterator(0);
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                break;
            } else {
                arrayList.add(new e3e(((az5) ql6Var.next()).c));
            }
        }
        Set setO1 = s72.o1(arrayList);
        this.a = cz5Var;
        this.b = setO1;
        ArrayList arrayList2 = new ArrayList(t72.u(c78Var, 10));
        ListIterator listIterator2 = c78Var.listIterator(0);
        while (true) {
            ql6 ql6Var2 = (ql6) listIterator2;
            if (!ql6Var2.hasNext()) {
                s72.o1(arrayList2);
                this.c = vpf.m(false);
                return;
            }
            arrayList2.add(new qt9(((az5) ql6Var2.next()).d));
        }
    }

    public final boolean b() {
        if (!this.c.a()) {
            return false;
        }
        cz5 cz5Var = this.a;
        zy5 zy5Var = cz5Var.d;
        c78 c78Var = cz5Var.e;
        zy5Var.g();
        int iC = c78Var.c();
        for (int i = 0; i < iC; i++) {
            az5 az5Var = (az5) c78Var.get(i);
            if (this.b.contains(new e3e(az5Var.c))) {
                az5Var.g();
            }
        }
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b();
    }

    public final void finalize() {
        if (b()) {
            b1.d("CXCP", "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}

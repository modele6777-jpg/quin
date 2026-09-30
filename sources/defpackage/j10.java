package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j10 implements h10 {
    public final /* synthetic */ int a;
    public final Object b;

    public j10(h10[] h10VarArr) {
        this.a = 1;
        this.b = qd0.G0(h10VarArr);
    }

    @Override // defpackage.h10
    public final boolean E(dx5 dx5Var) {
        switch (this.a) {
            case 0:
                return cn1.E(this, dx5Var);
            case 1:
                dx5Var.getClass();
                Iterator it = ((List) this.b).iterator();
                while (it.hasNext()) {
                    if (((h10) it.next()).E(dx5Var)) {
                        return true;
                    }
                }
                return false;
            default:
                return cn1.E(this, dx5Var);
        }
    }

    @Override // defpackage.h10
    public final u00 R(dx5 dx5Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return cn1.u(this, dx5Var);
            case 1:
                dx5Var.getClass();
                return (u00) fyc.r(fyc.y(new td0(1, (List) obj), new yf2(dx5Var, 0)));
            default:
                dx5Var.getClass();
                if (dx5Var.equals((dx5) obj)) {
                    return uv4.a;
                }
                return null;
        }
    }

    @Override // defpackage.h10
    public final boolean isEmpty() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((h10) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new ue5(new zi5(new td0(1, (List) obj), zo1.v, jyc.a));
            default:
                return ou4.a;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((List) this.b).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ya9 extends ua9 implements Iterable, zm7 {
    public static final /* synthetic */ int g = 0;
    public final r1f f;

    public ya9(bb9 bb9Var) {
        super(bb9Var);
        this.f = new r1f(this);
    }

    @Override // defpackage.ua9
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ya9) || !super.equals(obj)) {
            return false;
        }
        r1f r1fVar = this.f;
        int iD = ((fud) r1fVar.c).d();
        r1f r1fVar2 = ((ya9) obj).f;
        if (iD != ((fud) r1fVar2.c).d() || r1fVar.a != r1fVar2.a) {
            return false;
        }
        for (ua9 ua9Var : (el2) fyc.p(new l2(3, (fud) r1fVar.c))) {
            if (!ua9Var.equals(abg.q((fud) r1fVar2.c, ua9Var.b.b))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ua9
    public final ta9 f(gg7 gg7Var) {
        ta9 ta9VarF = super.f(gg7Var);
        r1f r1fVar = this.f;
        r1fVar.getClass();
        return r1fVar.q(ta9VarF, gg7Var, false, (ya9) r1fVar.b);
    }

    public final ta9 g(gg7 gg7Var, ua9 ua9Var) {
        return this.f.q(super.f(gg7Var), gg7Var, true, ua9Var);
    }

    @Override // defpackage.ua9
    public final int hashCode() {
        r1f r1fVar = this.f;
        int iB = r1fVar.a;
        fud fudVar = (fud) r1fVar.c;
        int iD = fudVar.d();
        for (int i = 0; i < iD; i++) {
            iB = (((iB * 31) + fudVar.b(i)) * 31) + ((ua9) fudVar.e(i)).hashCode();
        }
        return iB;
    }

    public final ta9 i(String str, boolean z, ua9 ua9Var) {
        ta9 ta9VarI;
        r1f r1fVar = this.f;
        r1fVar.getClass();
        ya9 ya9Var = (ya9) r1fVar.b;
        ta9 ta9VarT = ya9Var.b.t(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = ya9Var.iterator();
        while (true) {
            ab9 ab9Var = (ab9) it;
            ta9VarI = null;
            if (!ab9Var.hasNext()) {
                break;
            }
            ua9 ua9Var2 = (ua9) ab9Var.next();
            if (!pa7.t(ua9Var2, ua9Var)) {
                if (ua9Var2 instanceof ya9) {
                    ta9VarI = ((ya9) ua9Var2).i(str, false, ya9Var);
                } else {
                    ua9Var2.getClass();
                    ta9VarI = ua9Var2.b.t(str);
                }
            }
            if (ta9VarI != null) {
                arrayList.add(ta9VarI);
            }
        }
        ta9 ta9Var = (ta9) s72.I0(arrayList);
        ya9 ya9Var2 = ya9Var.c;
        if (ya9Var2 != null && z && !ya9Var2.equals(ua9Var)) {
            ta9VarI = ya9Var2.i(str, true, ya9Var);
        }
        return (ta9) s72.I0(qd0.k0(new ta9[]{ta9VarT, ta9Var, ta9VarI}));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        r1f r1fVar = this.f;
        r1fVar.getClass();
        return new ab9(r1fVar);
    }

    @Override // defpackage.ua9
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        r1f r1fVar = this.f;
        String str = (String) r1fVar.e;
        r1fVar.getClass();
        ua9 ua9VarL = (str == null || v4e.Q(str)) ? null : r1fVar.l(str, true);
        if (ua9VarL == null) {
            ua9VarL = r1fVar.k(r1fVar.a);
        }
        sb.append(" startDestination=");
        if (ua9VarL == null) {
            String str2 = (String) r1fVar.e;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) r1fVar.d;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(r1fVar.a));
                }
            }
        } else {
            sb.append("{");
            sb.append(ua9VarL.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}

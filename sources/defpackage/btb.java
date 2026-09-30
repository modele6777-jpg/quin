package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class btb {
    public final ct6 a;
    public final String b;
    public final si6 c;
    public final ftb d;
    public final q3c e;
    public c81 f;

    public btb(zsb zsbVar) {
        ct6 ct6Var = zsbVar.a;
        if (ct6Var == null) {
            qc0.p("url == null");
            throw null;
        }
        this.a = ct6Var;
        this.b = zsbVar.b;
        qi6 qi6Var = zsbVar.c;
        qi6Var.getClass();
        this.c = xdc.h(qi6Var);
        this.d = zsbVar.d;
        this.e = zsbVar.e;
    }

    public final zsb a() {
        zsb zsbVar = new zsb();
        zsbVar.a = this.a;
        zsbVar.b = this.b;
        zsbVar.d = this.d;
        zsbVar.e = this.e;
        zsbVar.c = xdc.j(this.c);
        return zsbVar;
    }

    public final Object b() {
        em7 em7VarB = job.a.b(zc7.class);
        return af1.R(em7VarB).cast(this.e.k(em7VarB));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        si6 si6Var = this.c;
        if (si6Var.size() != 0) {
            sb.append(", headers=[");
            Iterator it = si6Var.iterator();
            int i = 0;
            while (true) {
                l2 l2Var = (l2) it;
                if (!l2Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = l2Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    t72.Z();
                    throw null;
                }
                iy9 iy9Var = (iy9) next;
                String str = (String) iy9Var.a();
                String str2 = (String) iy9Var.b();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (ieg.l(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
        }
        yu4 yu4Var = yu4.a;
        q3c q3cVar = this.e;
        if (!pa7.t(q3cVar, yu4Var)) {
            sb.append(", tags=");
            sb.append(q3cVar);
        }
        sb.append('}');
        return sb.toString();
    }
}

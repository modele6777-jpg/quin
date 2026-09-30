package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class za9 extends va9 {
    public final gc9 g;
    public final em7 h;
    public final Object i;
    public final ArrayList j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za9(gc9 gc9Var, Object obj, em7 em7Var, Map map) {
        super(gc9Var.b(od4.t(bb9.class)), em7Var, map);
        gc9Var.getClass();
        obj.getClass();
        map.getClass();
        this.j = new ArrayList();
        this.g = gc9Var;
        this.i = obj;
    }

    @Override // defpackage.va9
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final ya9 a() {
        ya9 ya9Var = (ya9) super.a();
        r1f r1fVar = ya9Var.f;
        r1fVar.getClass();
        ya9 ya9Var2 = (ya9) r1fVar.b;
        for (ua9 ua9Var : this.j) {
            if (ua9Var != null) {
                fud fudVar = (fud) r1fVar.c;
                a80 a80Var = ya9Var2.b;
                a80 a80Var2 = ua9Var.b;
                int i = a80Var2.b;
                String str = (String) a80Var2.f;
                if (i == 0 && str == null) {
                    qc0.j("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) a80Var.f;
                if (str2 != null && pa7.t(str, str2)) {
                    ho7.x("Destination ", ua9Var, " cannot have the same route as graph ", ya9Var2);
                    return null;
                }
                if (i == a80Var.b) {
                    ho7.x("Destination ", ua9Var, " cannot have the same id as graph ", ya9Var2);
                    return null;
                }
                ua9 ua9Var2 = (ua9) abg.q(fudVar, i);
                if (ua9Var2 == ua9Var) {
                    continue;
                } else {
                    if (ua9Var.c != null) {
                        qc0.p("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (ua9Var2 != null) {
                        ua9Var2.c = null;
                    }
                    ua9Var.c = ya9Var2;
                    fudVar.c(a80Var2.b, ua9Var);
                }
            }
        }
        Object obj = this.i;
        em7 em7Var = this.h;
        if (em7Var == null && obj == null) {
            if (this.a != null) {
                qc0.p("You must set a start destination route");
                return null;
            }
            qc0.p("You must set a start destination id");
            return null;
        }
        if (em7Var != null) {
            xn7 xn7VarL = hfc.l(em7Var);
            int iE = m7c.e(xn7VarL);
            ua9 ua9VarK = r1fVar.k(iE);
            if (ua9VarK == null) {
                r82.e(xn7VarL.e().a(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.", "Cannot find startDestination ");
                return null;
            }
            String str3 = (String) ua9VarK.b.f;
            str3.getClass();
            r1fVar.r(str3);
            r1fVar.a = iE;
            return ya9Var;
        }
        if (obj == null) {
            if (ya9Var2.b.b == 0) {
                ho7.y(ya9Var2, "Start destination 0 cannot use the same id as the graph ");
                return null;
            }
            if (((String) r1fVar.e) != null) {
                r1fVar.r(null);
            }
            r1fVar.a = 0;
            r1fVar.d = null;
            return ya9Var;
        }
        xn7 xn7VarL2 = hfc.l(job.a.b(obj.getClass()));
        u08 u08Var = new u08(1, obj);
        int iE2 = m7c.e(xn7VarL2);
        ua9 ua9VarK2 = r1fVar.k(iE2);
        if (ua9VarK2 != null) {
            r1fVar.r((String) u08Var.d(ua9VarK2));
            r1fVar.a = iE2;
        } else {
            r82.e(xn7VarL2.e().a(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.", "Cannot find startDestination ");
        }
        return ya9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za9(gc9 gc9Var, em7 em7Var, em7 em7Var2) {
        super(gc9Var.b(od4.t(bb9.class)), em7Var2, qu4.a);
        gc9Var.getClass();
        this.j = new ArrayList();
        this.g = gc9Var;
        this.h = em7Var;
    }
}

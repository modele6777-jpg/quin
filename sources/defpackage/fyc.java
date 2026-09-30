package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fyc extends gyc {
    public static List A(cyc cycVar) {
        cycVar.getClass();
        Iterator it = cycVar.iterator();
        if (!it.hasNext()) {
            return pu4.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return t72.H(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static cyc p(Iterator it) {
        it.getClass();
        return new el2(new td0(4, it));
    }

    public static cyc q(cyc cycVar, int i) {
        if (i < 0) {
            qc0.o(tec.f(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return cycVar;
        }
        return cycVar instanceof pq4 ? ((pq4) cycVar).b(i) : new jq4(cycVar, i, 0);
    }

    public static Object r(ve5 ve5Var) {
        ue5 ue5Var = new ue5(ve5Var);
        if (ue5Var.hasNext()) {
            return ue5Var.next();
        }
        return null;
    }

    public static final zi5 s(cyc cycVar) {
        fnc fncVar = new fnc(21);
        if (!(cycVar instanceof c3f)) {
            return new zi5(cycVar, new fnc(22), fncVar);
        }
        c3f c3fVar = (c3f) cycVar;
        return new zi5(c3fVar.a, c3fVar.b, fncVar);
    }

    public static cyc t(x16 x16Var) {
        return new el2(new ie5(x16Var, new lnc(2, x16Var)));
    }

    public static cyc u(a26 a26Var, Object obj) {
        a26Var.getClass();
        return obj == null ? wu4.a : new ie5(new hla(20, obj), a26Var);
    }

    public static String v(cyc cycVar, String str) {
        cycVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : cycVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            sfc.e(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object w(cyc cycVar) {
        Iterator it = cycVar.iterator();
        if (!it.hasNext()) {
            r3.n("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static c3f x(cyc cycVar, a26 a26Var) {
        cycVar.getClass();
        a26Var.getClass();
        return new c3f(cycVar, a26Var);
    }

    public static ve5 y(cyc cycVar, a26 a26Var) {
        return new ve5(new c3f(cycVar, a26Var), false, new fnc(23));
    }

    public static cyc z(cyc cycVar, int i) {
        if (i < 0) {
            qc0.o(tec.f(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return wu4.a;
        }
        return cycVar instanceof pq4 ? ((pq4) cycVar).a(i) : new jq4(cycVar, i, 1);
    }
}

package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s87 extends r72 {
    public final rb9 q;

    public s87(Class cls) {
        super(true);
        this.q = new rb9(cls);
    }

    @Override // defpackage.ub9
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // defpackage.ub9
    public final String b() {
        return "List<" + this.q.r.getName() + "}>";
    }

    @Override // defpackage.ub9
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        rb9 rb9Var = this.q;
        return list != null ? s72.Q0(list, t72.H(rb9Var.d(str))) : t72.H(rb9Var.d(str));
    }

    @Override // defpackage.ub9
    public final Object d(String str) {
        return t72.H(this.q.d(str));
    }

    @Override // defpackage.ub9
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        bundle.putSerializable(str, list != null ? new ArrayList(list) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s87)) {
            return false;
        }
        return this.q.equals(((s87) obj).q);
    }

    @Override // defpackage.ub9
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return pa7.t(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
    }

    @Override // defpackage.r72
    public final Object h() {
        return pu4.a;
    }

    public final int hashCode() {
        return this.q.q.hashCode();
    }

    @Override // defpackage.r72
    public final List i(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return pu4.a;
        }
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).toString());
        }
        return arrayList;
    }
}

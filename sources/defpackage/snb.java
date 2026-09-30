package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class snb implements td7 {
    @Override // defpackage.td7
    public tmb a(dx5 dx5Var) {
        Object next;
        dx5Var.getClass();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (pa7.t(smb.a(af1.R(af1.Q(((tmb) next).a))).a(), dx5Var)) {
                return (tmb) next;
            }
        }
        next = null;
        return (tmb) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof snb) && pa7.t(b(), ((snb) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}

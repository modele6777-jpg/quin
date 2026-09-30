package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t87 extends ub9 {
    public final Class q;
    public final Class r;

    public t87(Class cls) {
        super(true);
        this.q = cls;
        if (!Serializable.class.isAssignableFrom(cls)) {
            ho7.k(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            this.r = cls;
        } else {
            ho7.k(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.ub9
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // defpackage.ub9
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.ub9
    public final Object d(String str) {
        Object obj = null;
        if (str.equals("null")) {
            return null;
        }
        Class cls = this.r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        for (Object obj2 : enumConstants) {
            Enum r5 = (Enum) obj2;
            r5.getClass();
            if (c5e.v(r5.name(), str, true)) {
                obj = obj2;
                break;
            }
        }
        Enum r1 = (Enum) obj;
        if (r1 != null) {
            return r1;
        }
        StringBuilder sbP = tec.p("Enum value ", str, " not found for type ");
        sbP.append(cls.getName());
        sbP.append('.');
        throw new IllegalArgumentException(sbP.toString());
    }

    @Override // defpackage.ub9
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, (Serializable) this.q.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t87)) {
            return false;
        }
        return this.q.equals(((t87) obj).q);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }
}

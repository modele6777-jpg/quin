package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class tb9 extends ub9 {
    public final Class q;

    public tb9(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            ho7.k(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            ho7.k(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.q = cls;
    }

    @Override // defpackage.ub9
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return (Serializable) bundle.get(str);
    }

    @Override // defpackage.ub9
    public String b() {
        return this.q.getName();
    }

    @Override // defpackage.ub9
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.q.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb9)) {
            return false;
        }
        return this.q.equals(((tb9) obj).q);
    }

    @Override // defpackage.ub9
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    public tb9(Class cls, int i) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.q = cls;
        } else {
            ho7.k(cls, " does not implement Serializable.");
            throw null;
        }
    }
}

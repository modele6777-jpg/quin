package defpackage;

import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mk7 extends xo1 {
    public final List p;

    public mk7(Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        this.p = qd0.A0(new ww2(28), declaredMethods);
    }

    @Override // defpackage.xo1
    public final String i() {
        return s72.D0(this.p, "", "<init>(", ")V", tj7.c, 24);
    }
}

package defpackage;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qnb extends snb {
    public final Class a;

    public qnb(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.snb
    public final Type b() {
        return this.a;
    }

    @Override // defpackage.td7
    public final Collection getAnnotations() {
        return pu4.a;
    }
}

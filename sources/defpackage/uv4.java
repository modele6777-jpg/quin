package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uv4 implements u00 {
    public static final uv4 a = new uv4();

    @Override // defpackage.u00
    public final ntd e() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.u00
    public final dx5 f() {
        u09 u09VarD = qz3.d(this);
        if (u09VarD != null) {
            if (sy4.f(u09VarD)) {
                u09VarD = null;
            }
            if (u09VarD != null) {
                return qz3.c(u09VarD);
            }
        }
        return null;
    }

    @Override // defpackage.u00
    public final Map g() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.u00
    public final tt7 getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}

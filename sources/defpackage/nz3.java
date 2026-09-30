package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nz3 extends x57 {
    public final /* synthetic */ ky4 s;
    public final /* synthetic */ LinkedHashSet t;
    public final /* synthetic */ boolean u;

    public nz3(ky4 ky4Var, LinkedHashSet linkedHashSet, boolean z) {
        this.s = ky4Var;
        this.t = linkedHashSet;
        this.u = z;
    }

    public static /* synthetic */ void i0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.x57
    public final void C(ea1 ea1Var) {
        if (ea1Var == null) {
            i0(0);
            throw null;
        }
        iu9.r(ea1Var, new x(16, this));
        this.t.add(ea1Var);
    }

    @Override // defpackage.x57
    public final void e0(ea1 ea1Var, Collection collection) {
        if (ea1Var == null) {
            i0(3);
            throw null;
        }
        if (!this.u || ea1Var.g() == 2) {
            ea1Var.Y(collection);
        }
    }

    @Override // defpackage.x57
    public final void I(ea1 ea1Var, ea1 ea1Var2) {
    }
}

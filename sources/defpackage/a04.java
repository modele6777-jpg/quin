package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a04 extends x57 {
    public final /* synthetic */ int s;
    public final /* synthetic */ AbstractCollection t;

    public /* synthetic */ a04(AbstractCollection abstractCollection, int i) {
        this.s = i;
        this.t = abstractCollection;
    }

    @Override // defpackage.x57
    public final void C(ea1 ea1Var) {
        int i = this.s;
        AbstractCollection abstractCollection = this.t;
        switch (i) {
            case 0:
                ea1Var.getClass();
                iu9.r(ea1Var, null);
                ((ArrayList) abstractCollection).add(ea1Var);
                return;
            default:
                if (ea1Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "fakeOverride", "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4", "addFakeOverride"));
                }
                iu9.r(ea1Var, null);
                ((LinkedHashSet) abstractCollection).add(ea1Var);
                return;
        }
    }

    @Override // defpackage.x57
    public final void I(ea1 ea1Var, ea1 ea1Var2) {
        switch (this.s) {
            case 0:
                if (ea1Var2 instanceof e36) {
                    e36 e36Var = (e36) ea1Var2;
                    Map linkedHashMap = e36Var.S0;
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        e36Var.S0 = linkedHashMap;
                    }
                    linkedHashMap.put(g04.a, ea1Var);
                }
                break;
        }
    }

    private final void i0(ea1 ea1Var, ea1 ea1Var2) {
    }
}

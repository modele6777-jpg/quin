package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l6c extends rv7 {
    public static final l6c c = new l6c("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6c(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                qu4 qu4Var = qu4.a;
                if (size == 0) {
                    return zn8Var.n0(kl2.j(j), kl2.i(j), qu4Var, new a4c(3));
                }
                if (size == 1) {
                    cea ceaVarV = ((tn8) list.get(0)).v(j);
                    return zn8Var.n0(ll2.g(ceaVarV.a, j), ll2.f(ceaVarV.b, j), qu4Var, new l1(ceaVarV, 14));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    cea ceaVarV2 = ((tn8) list.get(i)).v(j);
                    iMax = Math.max(ceaVarV2.a, iMax);
                    iMax2 = Math.max(ceaVarV2.b, iMax2);
                    arrayList.add(ceaVarV2);
                }
                return zn8Var.n0(ll2.g(iMax, j), ll2.f(iMax2, j), qu4Var, new lr(5, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}

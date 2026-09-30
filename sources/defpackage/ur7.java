package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ur7 extends gu7 implements l26 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ j09 $modifier;
    final /* synthetic */ List<s0a> $parties;
    final /* synthetic */ fn9 $updateListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur7(j09 j09Var, List list, int i, int i2) {
        super(2);
        this.$modifier = j09Var;
        this.$parties = list;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j09 j09Var = this.$modifier;
        List<s0a> list = this.$parties;
        vpf.f(k99.P(this.$$changed | 1), this.$$default, (l46) obj, j09Var, list);
        return wef.a;
    }
}

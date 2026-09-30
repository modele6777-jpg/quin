package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kea extends gu7 implements n26 {
    final /* synthetic */ long $color;
    final /* synthetic */ n26 $contentFadeTransitionSpec;
    final /* synthetic */ iea $highlight;
    final /* synthetic */ n26 $placeholderFadeTransitionSpec;
    final /* synthetic */ x4d $shape;
    final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kea(boolean z, long j, y6c y6cVar, ved vedVar, n26 n26Var, n26 n26Var2) {
        super(3);
        this.$visible = z;
        this.$color = j;
        this.$shape = y6cVar;
        this.$highlight = vedVar;
        this.$placeholderFadeTransitionSpec = n26Var;
        this.$contentFadeTransitionSpec = n26Var2;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        long j;
        l46 l46Var = (l46) obj2;
        ((Number) obj3).intValue();
        ((j09) obj).getClass();
        l46Var.g0(-1205707943);
        boolean z = this.$visible;
        l46Var.g0(-199241572);
        long jR = this.$color;
        if (jR == 16) {
            ace aceVar = hea.a;
            l46Var.g0(1968040714);
            pr4 pr4Var = z82.a;
            long j2 = ((y72) ((y82) l46Var.k(pr4Var)).f.getValue()).a;
            l46Var.f0(-583917585);
            y82 y82Var = (y82) l46Var.k(pr4Var);
            vz9 vz9Var = y82Var.a;
            vz9 vz9Var2 = y82Var.i;
            vz9 vz9Var3 = y82Var.h;
            long j3 = ((y72) vz9Var.getValue()).a;
            int i = y72.l;
            if (faf.a(j2, j3) || faf.a(j2, ((y72) y82Var.b.getValue()).a)) {
                j = ((y72) vz9Var3.getValue()).a;
            } else if (faf.a(j2, ((y72) y82Var.c.getValue()).a) || faf.a(j2, ((y72) y82Var.d.getValue()).a)) {
                j = ((y72) vz9Var2.getValue()).a;
            } else if (faf.a(j2, ((y72) y82Var.e.getValue()).a)) {
                j = ((y72) y82Var.j.getValue()).a;
            } else if (faf.a(j2, ((y72) y82Var.f.getValue()).a)) {
                j = ((y72) y82Var.k.getValue()).a;
            } else {
                j = faf.a(j2, ((y72) y82Var.g.getValue()).a) ? ((y72) y82Var.l.getValue()).a : y72.k;
            }
            if (j == 16) {
                j = ((y72) l46Var.k(fm2.a)).a;
            }
            l46Var.r(false);
            jR = abg.r(y72.b(j, 0.1f), j2);
            l46Var.r(false);
        }
        long j4 = jR;
        l46Var.r(false);
        x4d x4dVar = this.$shape;
        if (x4dVar == null) {
            x4dVar = ((t5d) l46Var.k(v5d.a)).a;
        }
        iea ieaVar = this.$highlight;
        n26 n26Var = this.$placeholderFadeTransitionSpec;
        n26 n26Var2 = this.$contentFadeTransitionSpec;
        n26Var.getClass();
        n26Var2.getClass();
        j09 j09VarU = m93.u(g09.a, new mea(n26Var, n26Var2, ieaVar, z, j4, x4dVar));
        l46Var.r(false);
        return j09VarU;
    }
}

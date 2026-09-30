package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dy extends gu7 implements l26 {
    final /* synthetic */ e45 $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(e45 e45Var) {
        super(2);
        this.$exit = e45Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        wv4 wv4Var = (wv4) obj;
        wv4 wv4Var2 = (wv4) obj2;
        wv4 wv4Var3 = wv4.c;
        return Boolean.valueOf(wv4Var == wv4Var3 && wv4Var2 == wv4Var3 && !((f45) this.$exit).c.e);
    }
}

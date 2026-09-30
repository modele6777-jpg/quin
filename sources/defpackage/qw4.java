package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qw4 extends gu7 implements x16 {
    final /* synthetic */ scd $shared;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw4(scd scdVar) {
        super(0);
        this.$shared = scdVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        scd scdVar = this.$shared;
        vz9 vz9Var = scdVar.b;
        Boolean bool = Boolean.FALSE;
        vz9Var.setValue(bool);
        scdVar.e(false);
        di2 di2Var = scdVar.c;
        ((vz9) di2Var.a).setValue(bool);
        ((vz9) di2Var.c).setValue(bool);
        ((vz9) di2Var.e).setValue(bool);
        ((vz9) di2Var.g).setValue(bool);
        scdVar.f = y72.j;
        scdVar.g = 1.0f;
        scdVar.h = 1.0f;
        btf btfVar = scdVar.l;
        if (btfVar != null) {
            qb3[] qb3VarArr = btfVar.d;
            qd0.h0(0, qb3VarArr.length, null, qb3VarArr);
            btfVar.e = 0;
        }
        scdVar.i = r2f.b;
        scdVar.j = 0L;
        scdVar.k = 1.0f;
        return wef.a;
    }
}

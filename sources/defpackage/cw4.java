package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cw4 extends gu7 implements a26 {
    final /* synthetic */ h0e $alpha;
    final /* synthetic */ scd $mutableTransformState;
    final /* synthetic */ h0e $scale;
    final /* synthetic */ h0e $transformOrigin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw4(scd scdVar, f3f f3fVar, f3f f3fVar2, f3f f3fVar3) {
        super(1);
        this.$mutableTransformState = scdVar;
        this.$alpha = f3fVar;
        this.$scale = f3fVar2;
        this.$transformOrigin = f3fVar3;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        g0c g0cVar = (g0c) obj;
        scd scdVar = this.$mutableTransformState;
        h0e h0eVar = this.$alpha;
        float fFloatValue = h0eVar != null ? ((Number) h0eVar.getValue()).floatValue() : 1.0f;
        di2 di2Var = scdVar.c;
        float fJ = fFloatValue * ((scdVar.d() && ((Boolean) ((vz9) di2Var.a).getValue()).booleanValue()) ? ((qz9) di2Var.b).j() : 1.0f);
        if (scdVar.d()) {
            scdVar.g = fJ;
        }
        g0cVar.b(fJ);
        scd scdVar2 = this.$mutableTransformState;
        h0e h0eVar2 = this.$scale;
        float fFloatValue2 = h0eVar2 != null ? ((Number) h0eVar2.getValue()).floatValue() : 1.0f;
        di2 di2Var2 = scdVar2.c;
        qz9 qz9Var = (qz9) di2Var2.d;
        boolean z = scdVar2.d() && ((Boolean) ((vz9) di2Var2.c).getValue()).booleanValue();
        float fJ2 = fFloatValue2 * (z ? qz9Var.j() : 1.0f);
        if (scdVar2.d()) {
            scdVar2.h = fJ2;
            scdVar2.k = z ? qz9Var.j() : 1.0f;
            if (z) {
                btf btfVar = scdVar2.l;
                if (btfVar == null) {
                    btfVar = new btf(false);
                    scdVar2.l = btfVar;
                }
                c1b c1bVar = tu3.a;
                btfVar.a(ar4.d(zxe.a(scdVar2.d)), fJ2);
            }
        }
        g0cVar.q(fJ2);
        g0cVar.r(fJ2);
        scd scdVar3 = this.$mutableTransformState;
        h0e h0eVar3 = this.$transformOrigin;
        long j = h0eVar3 != null ? ((r2f) h0eVar3.getValue()).a : r2f.b;
        di2 di2Var3 = scdVar3.c;
        if (scdVar3.d() && ((Boolean) ((vz9) di2Var3.e).getValue()).booleanValue()) {
            j = ((r2f) ((vz9) di2Var3.f).getValue()).a;
        }
        if (scdVar3.d()) {
            scdVar3.i = j;
        }
        g0cVar.D(j);
        return wef.a;
    }
}

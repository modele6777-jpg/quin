package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kt5 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SolarTerm c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ kt5(boolean z, SolarTerm solarTerm, e89 e89Var, int i) {
        this.a = i;
        this.b = z;
        this.c = solarTerm;
        this.d = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        p05 p05Var = p05.a;
        e89 e89Var = this.d;
        SolarTerm solarTerm = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (z) {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05Var, new ft5(0, solarTerm), 2);
                }
                e89Var.setValue(Boolean.TRUE);
                break;
            default:
                if (z) {
                    x1f x1fVar2 = x1f.a;
                    x1f.k(p05Var, new ft5(3, solarTerm), 2);
                }
                e89Var.setValue(Boolean.TRUE);
                break;
        }
        return wefVar;
    }
}

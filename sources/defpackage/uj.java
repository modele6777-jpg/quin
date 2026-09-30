package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uj implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uj(int i, h0e h0eVar) {
        this.a = 2;
        this.b = i;
        this.c = h0eVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                yj yjVar = (yj) obj;
                yjVar.d.post(new wj(yjVar, i2, 0));
                return wefVar;
            case 1:
                r0 r0Var = (r0) obj;
                ale.a.getClass();
                la5 la5VarG = pzd.g(i2);
                r0Var.getClass();
                la5VarG.getClass();
                r0Var.J1(la5VarG);
                return wefVar;
            case 2:
                return s72.n0((List) ((h0e) obj).getValue(), i2);
            case 3:
                return Integer.valueOf(((guc) obj).f.b.d(i2));
            default:
                ((ape) obj).r1(i2);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ uj(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}

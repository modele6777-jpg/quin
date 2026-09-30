package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lo4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ fo4 c;

    public /* synthetic */ lo4(r0 r0Var, fo4 fo4Var, int i) {
        this.a = i;
        this.b = r0Var;
        this.c = fo4Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        fo4 fo4Var = this.c;
        r0 r0Var = this.b;
        DrawCardSaves drawCardSaves = (DrawCardSaves) obj;
        switch (i) {
            case 0:
                drawCardSaves.getClass();
                int i2 = r0.j2;
                r0Var.g1(null);
                dr2 dr2Var = (dr2) fo4Var;
                ynb.V(hwf.a(dr2Var.a.c), null, null, new ar2(dr2Var, drawCardSaves, null), 3);
                break;
            default:
                drawCardSaves.getClass();
                int i3 = r0.j2;
                r0Var.g1(null);
                dr2 dr2Var2 = (dr2) fo4Var;
                ynb.V(hwf.a(dr2Var2.a.c), null, null, new ar2(dr2Var2, drawCardSaves, null), 3);
                break;
        }
        return wefVar;
    }
}
